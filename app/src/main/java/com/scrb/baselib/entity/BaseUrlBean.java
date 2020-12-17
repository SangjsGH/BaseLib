package com.scrb.baselib.entity;

public class BaseUrlBean {
    /**
     * code : 200
     * data : {"status":1,"url":"http://39.98.245.21:8080/","msg":"success","type":"SD","appName":"霍比特币"}
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
         * status : 1
         * url : http://39.98.245.21:8080/
         * msg : success
         * type : SD
         * appName : 霍比特币
         */

        private int status;
        private String url;
        private String msg;
        private String type;
        private String appName;

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

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getAppName() {
            return appName;
        }

        public void setAppName(String appName) {
            this.appName = appName;
        }
    }
}
