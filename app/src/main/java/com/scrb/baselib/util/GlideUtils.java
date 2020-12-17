package com.scrb.baselib.util;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.scrb.baselib.R;


public class GlideUtils {


    /**
     * 加载头像图片
     * @param context
     * @param url
     * @param imageView
     */
    public static void intoHead(Context context, String url, ImageView imageView) {
        Glide.with(context)
                .load(url)
                .placeholder(R.mipmap.ic_head_null)
                .error(R.mipmap.ic_head_null)
                .into(imageView);
    }

    /**
     * 普通图片 （获取多张中第一张）
     *
     * @param context
     * @param url
     * @param imageView
     */
    public static void intoSingle(Context context, String url, ImageView imageView) {
        if (!TextUtils.isEmpty(url)) {
            url = MyUtil.getSingleURL(url);
            Glide.with(context)
                    .load(url)
                    .placeholder(R.mipmap.ic_picture_null)
                    .error(R.mipmap.ic_picture_null)
                    .into(imageView);
        }

    }

    /**
     * 普通图片
     * @param context
     * @param url
     * @param imageView
     */
    public static void intoNormal(Context context, String url, ImageView imageView) {
        if (!TextUtils.isEmpty(url)) {
            Glide.with(context)
                    .load(url)
                    .placeholder(R.mipmap.ic_picture_null)
                    .error(R.mipmap.ic_picture_null)
                    .into(imageView);
        }

    }

    /**
     * 加载说说的图片 （无占位图）
     * @param context
     * @param url
     * @param imageView
     */
    public static void intoNoPlaceholder(Context context, String url, ImageView imageView) {
        if (!TextUtils.isEmpty(url)&&MyUtil.checkUrl(url)) {
            url = MyUtil.getSingleURL(url);
            Glide.with(context)
                    .load(url)
                    .into(imageView);
        }

    }

}
