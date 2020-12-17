package com.scrb.baselib.entity;

import java.io.Serializable;

public class Talk implements Serializable {
    /**
     * browserCount : 0
     * commentCount : 1
     * content : 国际货币基金组织总裁拉加德：央行应认真考虑发行数字货币
     国家货币基金组织（IMF）主席克里斯蒂娜•拉加德（Christine Lagarde）表示，世界各国央行应考虑发行国家数字货币以确保交易安全。拉加德在新加坡的一次会议上表示，全国发行的加密货币应该符合包容性融资，消费者保护和欺诈预防等公共政策目标。
     推荐阅读：国际货币基金组织总裁拉加德：如果法国货币转向数字加密货币

     安全，廉价，半匿名付款
     “我认为我们应该考虑发行数字货币的可能性，”拉加德在新加坡的一次会议上说。新加坡一直处于推动金融技术创新的前沿。 “国家可能能够发挥数字货币的发行作用。好处是显而易见的。即时付款，便宜，可能是半匿名。中央银行应该保持稳定的付款状态。“

     无现金支付近年来已成为一种趋势，这使得许多在政府工作的控制人员感到不安。例如，比特币的诞生是为了挑战传统的金融体系，将金钱的控制权交还给人民，远离国家的控制。但是，这一愿景不会受到传统全球金融领导人的欢迎。因此，许多政府对加密货币充满担忧并要求加强监管并不奇怪。

     拉加德的例子有加拿大，中国，瑞典和乌拉圭的中央银行，所有这些银行都在“认真考虑”引入国家数字货币。拉加德说，发行国家加密货币是国家的责任，就像法定货币一样。这些货币可以降低交易成本，同时最大限度地提高安全性并推广应用程序。她说：

     您服务的人越多，服务越便宜，越实用。私营公司可能在安全方面投资不足，在某种程度上，它们没有衡量薪酬保障的社会成本。

     创造一个更公平的竞争环境
     拉加德表示，监管可能无法彻底解决这些问题，但数字货币可以带来许多好处，特别是作为替代支付手段。 “作为一种低成本，高效率的替代品 - 像它的祖先，旧的和可靠的钞票，它有助于促进竞争，”拉加德说。她还说，虽然虚拟货币的例子“不普遍”，但应该“认真和创造性地”进行调查。

     此外，中央银行应该提供更公平的竞争环境，为私营公司留出创新空间。 “换句话说，中央银行应该专注于其比较优势，后端计算和金融机构，初创企业可以自由地专注于他们擅长的领域 - 客户接口和创新。这是公私伙伴关系的最佳方式。拉加德说。

     然而，拉加德呼吁中央银行赞助数字货币可能会引起人们对这种硬核神秘货币的愤慨，并且他们提倡比特币的基本原则。他们更倾向于将比特币视为摆脱控制的工具，尤其是政府的控制，政府是为自由创造的货币。中央银行的参与可能被视为入侵，政府可能会施加不必要的控制，影响交易的速度，并可能牺牲自由和低成本。但是，在某些情况下，一些传统的机构和企业被区块链技术的应用所吸引。区块链技术是加密货币阶段和处理交易的基础技术。
     * displayBig : false
     * enable : true
     * forwardCount : 0
     * hasZan : false
     * id : 643
     * picture : http://image.yysc.online//files/2019/7/22/f3ccdd27d2000e3f9255a7e3e2c48800.jpg
     * publishTime : 1581004800000
     * user : {"album":"","fansCount":0,"followCount":0,"head":"http://image.yysc.online//files/2019/10/20/f160347de5af5c6770b4b9ba8a2500dd.png","id":240,"nickName":"糖糖","password":"123456","phone":"15723126744","project":null,"projectKey":"bitte","signature":"瑞士对加密货币会一直友好","talkCount":0,"type":0,"uuid":"4bc16a44effc41599a6786664dff129e"}
     * userId : 240
     * video : null
     * videoId : 0
     * zanCount : 0
     */

    private int browserCount;
    private int commentCount;
    private String content;
    private boolean displayBig;
    private boolean enable;
    private int forwardCount;
    private boolean hasZan;
    private int id;
    private String picture;
    private long publishTime;
    private User user;
    private int userId;
    private Object video;
    private int videoId;
    private int zanCount;

    public int getBrowserCount() {
        return browserCount;
    }

    public void setBrowserCount(int browserCount) {
        this.browserCount = browserCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isDisplayBig() {
        return displayBig;
    }

    public void setDisplayBig(boolean displayBig) {
        this.displayBig = displayBig;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public int getForwardCount() {
        return forwardCount;
    }

    public void setForwardCount(int forwardCount) {
        this.forwardCount = forwardCount;
    }

    public boolean isHasZan() {
        return hasZan;
    }

    public void setHasZan(boolean hasZan) {
        this.hasZan = hasZan;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(long publishTime) {
        this.publishTime = publishTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Object getVideo() {
        return video;
    }

    public void setVideo(Object video) {
        this.video = video;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public int getZanCount() {
        return zanCount;
    }

    public void setZanCount(int zanCount) {
        this.zanCount = zanCount;
    }

    public static class UserBean implements Serializable{
        /**
         * album :
         * fansCount : 0
         * followCount : 0
         * head : http://image.yysc.online//files/2019/10/20/f160347de5af5c6770b4b9ba8a2500dd.png
         * id : 240
         * nickName : 糖糖
         * password : 123456
         * phone : 15723126744
         * project : null
         * projectKey : bitte
         * signature : 瑞士对加密货币会一直友好
         * talkCount : 0
         * type : 0
         * uuid : 4bc16a44effc41599a6786664dff129e
         */

        private String album;
        private int fansCount;
        private int followCount;
        private String head;
        private int id;
        private String nickName;
        private String password;
        private String phone;
        private Object project;
        private String projectKey;
        private String signature;
        private int talkCount;
        private int type;
        private String uuid;

        public String getAlbum() {
            return album;
        }

        public void setAlbum(String album) {
            this.album = album;
        }

        public int getFansCount() {
            return fansCount;
        }

        public void setFansCount(int fansCount) {
            this.fansCount = fansCount;
        }

        public int getFollowCount() {
            return followCount;
        }

        public void setFollowCount(int followCount) {
            this.followCount = followCount;
        }

        public String getHead() {
            return head;
        }

        public void setHead(String head) {
            this.head = head;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNickName() {
            return nickName;
        }

        public void setNickName(String nickName) {
            this.nickName = nickName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public Object getProject() {
            return project;
        }

        public void setProject(Object project) {
            this.project = project;
        }

        public String getProjectKey() {
            return projectKey;
        }

        public void setProjectKey(String projectKey) {
            this.projectKey = projectKey;
        }

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public int getTalkCount() {
            return talkCount;
        }

        public void setTalkCount(int talkCount) {
            this.talkCount = talkCount;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getUuid() {
            return uuid;
        }

        public void setUuid(String uuid) {
            this.uuid = uuid;
        }
    }
}