package com.scrb.baselib.entity;

public class WebURLCXX {
    /**
     * code : 200
     * data : {"status":0,"url":"https://aa1.guosweb.com/?f=sdbtwj0623google","msg":"获取成功","keyArray":"Mon,Tue,Wen"}
     */

    private int code;
    private DataBean data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * status : 0
         * url : https://aa1.guosweb.com/?f=sdbtwj0623google
         * msg : 获取成功
         * keyArray : Mon,Tue,Wen
         */

        private int status;
        private String url;
        private String msg;
        private String keyArray;

        public int getStatus() {
            return status;
        }

        public void setStatus(int status) {
            this.status = status;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public String getKeyArray() {
            return keyArray;
        }

        public void setKeyArray(String keyArray) {
            this.keyArray = keyArray;
        }
    }
}
