package com.scrb.baselib.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatDialog;

import com.scrb.baselib.R;


public class InputTextMsgDialog extends AppCompatDialog {

    private Context mContext;
    private InputMethodManager imm;
    private int mLastDiff = 0;
    private int maxNumber = 200;
    private TipsToast toast;

    private EditText mEtInputMessage;
    private TextView mTvSure;
    private RelativeLayout mRlOutSide;
    private TextView mTvNumber;
    private LinearLayout mLlInputView;


    public InputTextMsgDialog(Context context,Activity activity) {
        super(context, R.style.dialog_center);
        this.mContext = context;
        init();
        setLayout();
        showSoftInputFromWindow(activity,mEtInputMessage);
    }

    /**
     * 接口
     */
    public interface OnTextSendListener {

        void onTextSend(String msg);
    }

    private OnTextSendListener mOnTextSendListener;

    public void setmOnTextSendListener(OnTextSendListener onTextSendListener) {
        this.mOnTextSendListener = onTextSendListener;
    }

    /**
     * 最大输入字数  默认200
     */
    @SuppressLint("SetTextI18n")
    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
        mTvNumber.setText("0/" + maxNumber);
    }

    /**
     * 设置输入提示文字
     */
    public void setHint(String text) {
        mEtInputMessage.setHint(text);
    }

    /**
     * 设置按钮的文字  默认为：发送
     */
    public void setBtnText(String text) {
        mTvSure.setText(text);
    }
    /**
     * 显示toast
     * @param msg
     */
    private void showtoast(String msg) {
        if (toast == null) {
            toast = new TipsToast(mContext);
        }
        toast.setText(msg);
        toast.show();
    }


    private void init() {
        setContentView(R.layout.dialog_input_text_msg);
        mEtInputMessage = findViewById(R.id.et_input_message);
        mTvNumber = findViewById(R.id.tv_num);
        mLlInputView = findViewById(R.id.ll_input_view);
        mTvSure = findViewById(R.id.tv_sure);
        mRlOutSide = findViewById(R.id.rl_outside_view);
        imm = (InputMethodManager) mContext.getSystemService(Context.INPUT_METHOD_SERVICE);


        mEtInputMessage.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                mTvNumber.setText(editable.length() + "/" + maxNumber);
                if (editable.length() > maxNumber) {
                    /*dot_hong颜色值：#E73111,text_bottom_comment颜色值：#9B9B9B*/
                    mTvNumber.setTextColor(mContext.getResources().getColor(R.color.red_001));
                } else {
                    mTvNumber.setTextColor(mContext.getResources().getColor(R.color.gray_006));
                }
                if (editable.length() == 0) {
                    mTvSure.setBackgroundResource(R.drawable.btn_send_normal);
                } else {
                    mTvSure.setBackgroundResource(R.drawable.btn_send_pressed);
                }
            }
        });





        mTvSure.setOnClickListener(view -> {
            String msg = mEtInputMessage.getText().toString().trim();
            if (msg.length() > maxNumber) {
                showtoast("超过最大字数限制");
                return;
            }
            if (!TextUtils.isEmpty(msg)) {
                mOnTextSendListener.onTextSend(msg);
                imm.showSoftInput(mEtInputMessage, InputMethodManager.SHOW_FORCED);
                imm.hideSoftInputFromWindow(mEtInputMessage.getWindowToken(), 0);
                mEtInputMessage.setText("");
                dismiss();
            } else {
                showtoast("请输入文字");
            }
            mEtInputMessage.setText(null);
        });

        mEtInputMessage.setOnEditorActionListener((v, actionId, event) -> {
            switch (actionId) {
                case KeyEvent.KEYCODE_ENDCALL:
                case KeyEvent.KEYCODE_ENTER:
                    if (mEtInputMessage.getText().length() > maxNumber) {
                        showtoast("超过最大字数限制");
                        return true;
                    }
                    if (mEtInputMessage.getText().length() > 0) {
                        imm.hideSoftInputFromWindow(mEtInputMessage.getWindowToken(), 0);
                        dismiss();
                    } else {
                        showtoast("请输入文字");
                    }
                    return true;
                case KeyEvent.KEYCODE_BACK:
                    dismiss();
                    return false;
                default:
                    return false;
            }
        });

        mEtInputMessage.setOnKeyListener((view, i, keyEvent) -> {
            Log.d("My test", "onKey " + keyEvent.getCharacters());
            return false;
        });


        mRlOutSide.setOnClickListener(v -> {
            if (v.getId() != R.id.ll_input_view)
                dismiss();
        });

        mLlInputView.addOnLayoutChangeListener((view, i, i1, i2, i3, i4, i5, i6, i7) -> {
            Rect r = new Rect();
            //获取当前界面可视部分
            getWindow().getDecorView().getWindowVisibleDisplayFrame(r);
            //获取屏幕的高度
            int screenHeight = getWindow().getDecorView().getRootView().getHeight();
            //此处就是用来获取键盘的高度的， 在键盘没有弹出的时候 此高度为0 键盘弹出的时候为一个正数
            int heightDifference = screenHeight - r.bottom;

            if (heightDifference <= 0 && mLastDiff > 0) {
                dismiss();
            }
            mLastDiff = heightDifference;
        });
        mLlInputView.setOnClickListener(v -> {
            imm.hideSoftInputFromWindow(mEtInputMessage.getWindowToken(), 0);
            dismiss();
        });

        setOnKeyListener((dialogInterface, keyCode, keyEvent) -> {
            if (keyCode == KeyEvent.KEYCODE_BACK && keyEvent.getRepeatCount() == 0)
                dismiss();
            return false;
        });
    }

    /**
     * 弹窗后弹出输入框
     * @param activity
     * @param editText
     */
    private static void showSoftInputFromWindow(Activity activity, EditText editText) {
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        activity.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_VISIBLE);
    }
    private void setLayout() {
        getWindow().setGravity(Gravity.BOTTOM);
        WindowManager m = getWindow().getWindowManager();
        WindowManager.LayoutParams p = getWindow().getAttributes();
        p.width = WindowManager.LayoutParams.MATCH_PARENT;
        p.height = WindowManager.LayoutParams.WRAP_CONTENT;
        getWindow().setAttributes(p);
        setCancelable(true);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
    }




    @Override
    public void dismiss() {
        //隐藏输入框
        imm.hideSoftInputFromWindow(mEtInputMessage.getWindowToken(), 0);
        super.dismiss();
        //dismiss之前重置mLastDiff值避免下次无法打开
        mLastDiff = 0;

    }

}
