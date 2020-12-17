package com.scrb.baselib.view;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.scrb.baselib.R;
import com.scrb.baselib.entity.DialogType;


/**
 * 自定义dialog
 */
public class MyDialog extends Dialog {
    private Context context;
    private String title;
    private OnDialogListener dialogListener;

    private DialogType dialogType;

    public MyDialog(@NonNull Context context) {
        super(context);
    }
    public MyDialog(Context context, String title){
        super(context, R.style.DialogStyle);
        this.context = context;
        this.title = title;

    }

    public MyDialog(Context context, String title, DialogType dialogType){
        super(context, R.style.DialogStyle);
        this.context=context;
        this.dialogType=dialogType;
        this.title=title;
    }
    public interface OnDialogListener{
        void onSure(String text);
    }

    public void setDialogListener(OnDialogListener dialogListener){
        this.dialogListener = dialogListener;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initView();
    }

    private void initView() {
        View view = LayoutInflater.from(context).inflate(R.layout.dialog_my,null);
        TextView tvSure = view.findViewById(R.id.tv_sure);
        TextView tvTitle = view.findViewById(R.id.tv_title);
        EditText editText = view.findViewById(R.id.et_title);
        TextView tvCancel = view.findViewById(R.id.tv_cancel);
        View vTag = view.findViewById(R.id.vi_tag);
        setContentView(view);
        this.setCancelable(false);
        this.setCanceledOnTouchOutside(false);
        tvTitle.setText(title);
        editText.setText(title);
        tvSure.setOnClickListener(v -> {

            if (dialogType==DialogType.EDITTEXT_DIALOG){
                dialogListener.onSure(editText.getText().toString());
            }else {
                dialogListener.onSure("");
            }

            dismiss();
        });
        tvCancel.setOnClickListener(v -> dismiss());

        if (dialogType==DialogType.EDITTEXT_DIALOG){
            editText.setVisibility(View.VISIBLE);
            tvTitle.setVisibility(View.GONE);
        }else {
            editText.setVisibility(View.GONE);
            tvTitle.setVisibility(View.VISIBLE);
            if (dialogType==DialogType.ONLY_BTN_DIALOG){
                tvCancel.setVisibility(View.GONE);
                vTag.setVisibility(View.GONE);
            }
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        WindowManager.LayoutParams params = getWindow().getAttributes();
        params.width=displayMetrics.widthPixels * 8/10;
        params.height= WindowManager.LayoutParams.WRAP_CONTENT;
        getWindow().setAttributes(params);
    }


}
