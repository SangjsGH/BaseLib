package com.scrb.baselib.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;

import java.lang.reflect.Field;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class MyUtil {


    public static String trimString(String str){
        return str.trim().replace("\r\n|\r|\n","").replace("　","");
    }

    /**
     * 改变字体大小
     * @param context
     * @param spValue
     * @return
     */
    public static int sp2px(Context context, float spValue) {
        final float fontScale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int) (spValue * fontScale + 0.5f);
    }

    /**
     * 流转换bitmap
     * @param base64Data
     * @return
     */
    public static Bitmap base64ToBitmap(String base64Data) {
        byte[] bytes = Base64.decode(base64Data, Base64.DEFAULT);
        return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
    }

    /**
     * 不同实体类，相同的属性赋值
     * @param sourceData
     * @param toData
     * @param <T>
     */
    public static <T> void copyFields(T sourceData, T toData) {
        if (sourceData == null || toData == null)
            return;
        Field[] fields = sourceData.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            try {
                fields[i].setAccessible(true);
                Object value = fields[i].get(sourceData);
                if (null != value && !"".equals(value)) {
                    Field toField = toData.getClass().getDeclaredField(fields[i].getName());
                    if (toField != null) {
                        toField.setAccessible(true);
                        toField.set(toData, value);
                    }
                }
            } catch (Exception e) {
            }
        }
    }

    /**
     * 获取多图片链接的第一个
     * @param url
     * @return
     */
    public static String getSingleURL(String url){
        String singleURL;
        if (url.contains(",")){
            singleURL=url.substring(0,url.indexOf(","));
        }else {
            singleURL=url;
        }
        return singleURL;
    }



    /**
     * 获取sign（用于行业风暴）
     * @param map
     * @return
     */
    public static String getSign(Map<String, String> map) {
        List<Map.Entry<String, String>> list = sortMap(map);
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size()-1){
                str += list.get(i)+"" ;
            }else {
                str += list.get(i) + "&";
            }
        }
        return str;
    }

    /**
     * MD5加密
     * @param str
     * @return
     */
    public static String MD5(String str) {
        MessageDigest md5 = null;
        try {
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
            e.getMessage();
            return "出错";
        }
        char[] charArray = str.toCharArray();
        byte[] byteArray = new byte[charArray.length];
        for (int i = 0; i < charArray.length; i++)
            byteArray[i] = (byte) charArray[i];
        byte[] md5Bytes = md5.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }

    /**
     * 重写集合的排序方法：按字母顺序
     * @param map
     * @return
     */
    public static List<Map.Entry<String, String>> sortMap(final Map<String, String> map) {
        final List<Map.Entry<String, String>> infos = new ArrayList<Map.Entry<String, String>>(map.entrySet());

        // 重写集合的排序方法：按字母顺序
        Collections.sort(infos, new Comparator<Map.Entry<String, String>>() {
            @Override
            public int compare(final Map.Entry<String, String> o1, final Map.Entry<String, String> o2) {
                return (o1.getKey().toString().compareTo(o2.getKey()));
            }
        });

        return infos;
    }

    /**
     * 秒级时间戳
     * @param date
     * @return
     */
    public static String getSecondTimestamp(Date date){
        if (null == date) {
            return "";
        }
        String timestamp = String.valueOf(date.getTime());
        int length = timestamp.length();
        if (length > 3) {
            return timestamp.substring(0,length-3);
        } else {
            return "";
        }
    }

    /**
     * 判断图片是否正确
     * @param url
     * @return
     */
    public static boolean checkUrl(String url){
        String strURL = MyUtil.getSingleURL(url);
        if (strURL.contains("http://")){
            strURL=strURL.replaceFirst("http://","");
            return !strURL.contains("http://");
        }
        return false;
    }

}
