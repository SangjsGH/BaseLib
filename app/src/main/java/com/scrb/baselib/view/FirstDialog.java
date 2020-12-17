package com.scrb.baselib.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.scrb.baselib.R;


/**
 * 第一次进入的弹窗
 */
public class FirstDialog extends Dialog{

    private Context mContext;
    private OnDialogListener onDialogListener;

    public FirstDialog(Context context){
        super(context, R.style.DialogStyle);
        this.mContext=context;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    public interface OnDialogListener{
        void onNotAgree();
        void onAgree();
        void onUserAgreement();
        void onPrivacy();
    }

    public void setOnDialogListener(OnDialogListener onDialogListener){
        this.onDialogListener=onDialogListener;
    }
    private void initView() {
        View view =View.inflate(mContext,R.layout.dialog_first,null);
        final TextView tvUserAgreement = view.findViewById(R.id.tv_user_agreement);
        final TextView tvPrivacy = view.findViewById(R.id.tv_privacy);
        final TextView tvAgree = view.findViewById(R.id.tv_agree);
        final TextView tvNotAgree = view.findViewById(R.id.tv_not_agree);
        setContentView(view);
        this.setCancelable(false);
        this.setCanceledOnTouchOutside(false);
        tvUserAgreement.setOnClickListener(v -> onDialogListener.onUserAgreement());
        tvPrivacy.setOnClickListener(v -> onDialogListener.onPrivacy());
        tvNotAgree.setOnClickListener(v -> {
            onDialogListener.onNotAgree();
            dismiss();
        });
        tvAgree.setOnClickListener(v -> {
            onDialogListener.onAgree();
            dismiss();
        });

        Window dialogWindow = getWindow();
        WindowManager.LayoutParams lp = dialogWindow.getAttributes();
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        lp.gravity = Gravity.CENTER;
        dialogWindow.setAttributes(lp);

    }

}
