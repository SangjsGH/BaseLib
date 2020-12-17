package com.scrb.baselib.view;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.scrb.baselib.R;


public class TipsToast extends Toast {

    private final TextView textView;
    private Context context;

    public TipsToast(Context context) {
        super(context);
        this.context = context;
        setGravity(Gravity.CENTER, 0, 0);
        View view = LayoutInflater.from(context).inflate(R.layout.totaslayout, null);
        textView = (TextView) view.findViewById(R.id.tips_text);
        setView(view);
        setDuration(Toast.LENGTH_SHORT);
    }



    @Override
    public void setText(int resId) {
        textView.setText(context.getString(resId));
    }

    @Override
    public void setText(CharSequence s) {
        textView.setText(s.toString());
    }
}
