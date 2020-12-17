package com.scrb.baselib.entity;

public class CommentBean {
    /**
     * content : Ghhbxgg1233
     * gameVideo : {"bGameId":"","bGameName":"","countTimes":"","discuss":null,"iTotal":"","id":0,"imageFont":"","imgUrlHttp":"","indexDate":null,"lookTimes":"","newsId":"","sourceName":"","subTitle":"","timeLength":"","title":"","user":null,"userId":0,"videoUrl":""}
     * id : 741
     * matchId : -1
     * matchInfo : {"bMatchId":"","battleTime":"","discuss":null,"discussId":"","gameWin":"","id":0,"leftBigDragon":"","leftKillCout":0,"leftMoney":"","leftSmallDragon":"","leftTower":"","leftbanHeroFive":"","leftbanHeroFour":"","leftbanHeroOne":"","leftbanHeroThree":"","leftbanHeroTwo":"","matchNum":"","rightBanHeroFive":"","rightBanHeroFour":"","rightBanHeroOne":"","rightBanHeroThree":"","rightBanHeroTwo":"","rightBigDragon":"","rightKillCount":0,"rightMoney":"","rightSmallDragon":"","rightTower":"","sMatchId":"","sMatchName":""}
     * publishTime : 1591891200000
     * talk : {"browserCount":0,"commentCount":1,"content":"美国可再生能源发电量首次超过煤炭\n据外媒报道，美国能源情报署(EIA)最新数据显示，美国可再生能源的产量首次超越煤炭。今年4月，该国通过水力、太阳能和风力发电的量达到了6850万兆瓦时，而煤炭是6000万兆瓦时。这一成就是具有里程碑意义的，其中有些是长期的、有些是短期的。  \n彭博社指出，从长期来看，美国一直在向天然气过渡，不仅因为它成本比煤炭更低而且其排放的二氧化碳也更少。与此同时，由于建造成本低，风力发电和太阳能发电正在该国如雨后春笋般涌现。\n4月，美国能源领域出现了一些短期趋势，这使得其可再生能源超过了煤炭，当然这并未是一个永久性转变。据悉，许多燃煤电厂在该月停产进行日常维护。这个时候，风力发电量和能源需求双双增加。相信等到燃煤电厂恢复正常运营时，煤炭发电量可能会再次占据上风。\n尽管如此，总体趋势表明，这种燃料在美国正在慢慢淡出人们的视线。截止到目前，在特朗普的总统任期内，已有50座燃煤电厂关闭，而随着各州承诺逐步淘汰化石燃料或转向天然气，今后可能还会有更多电厂关闭。","displayBig":true,"enable":true,"forwardCount":0,"hasZan":false,"id":107,"picture":"http://image.yysc.online//files/2019/5/27/fe5df232cafa4c4e0f1a0294418e5660.jpg","publishTime":1584720000000,"user":null,"userId":95,"video":null,"videoId":0,"zanCount":0}
     * talkId : 107
     * user : {"album":"","fansCount":0,"followCount":0,"head":"http://image.yysc.online/files/2020/6/29/8f81346727148597a45928e1a8767009.jpeg","id":4188,"nickName":"酷酷的松","password":"654321","phone":"18781793053","project":null,"projectKey":"economic","signature":"","talkCount":0,"type":1,"uuid":"13354ac4df4e4b1193f5d015c6bc6057"}
     * userId : 4188
     * videoId : -1
     */

    private String content;
    private GameVideoBean gameVideo;
    private int id;
    private int matchId;
    private MatchInfoBean matchInfo;
    private long publishTime;
    private TalkBean talk;
    private int talkId;
    private UserBean user;
    private int userId;
    private int videoId;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public GameVideoBean getGameVideo() {
        return gameVideo;
    }

    public void setGameVideo(GameVideoBean gameVideo) {
        this.gameVideo = gameVideo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public MatchInfoBean getMatchInfo() {
        return matchInfo;
    }

    public void setMatchInfo(MatchInfoBean matchInfo) {
        this.matchInfo = matchInfo;
    }

    public long getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(long publishTime) {
        this.publishTime = publishTime;
    }

    public TalkBean getTalk() {
        return talk;
    }

    public void setTalk(TalkBean talk) {
        this.talk = talk;
    }

    public int getTalkId() {
        return talkId;
    }

    public void setTalkId(int talkId) {
        this.talkId = talkId;
    }

    public UserBean getUser() {
        return user;
    }

    public void setUser(UserBean user) {
        this.user = user;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public static class GameVideoBean {
        /**
         * bGameId :
         * bGameName :
         * countTimes :
         * discuss : null
         * iTotal :
         * id : 0
         * imageFont :
         * imgUrlHttp :
         * indexDate : null
         * lookTimes :
         * newsId :
         * sourceName :
         * subTitle :
         * timeLength :
         * title :
         * user : null
         * userId : 0
         * videoUrl :
         */

        private String bGameId;
        private String bGameName;
        private String countTimes;
        private Object discuss;
        private String iTotal;
        private int id;
        private String imageFont;
        private String imgUrlHttp;
        private Object indexDate;
        private String lookTimes;
        private String newsId;
        private String sourceName;
        private String subTitle;
        private String timeLength;
        private String title;
        private Object user;
        private int userId;
        private String videoUrl;

        public String getBGameId() {
            return bGameId;
        }

        public void setBGameId(String bGameId) {
            this.bGameId = bGameId;
        }

        public String getBGameName() {
            return bGameName;
        }

        public void setBGameName(String bGameName) {
            this.bGameName = bGameName;
        }

        public String getCountTimes() {
            return countTimes;
        }

        public void setCountTimes(String countTimes) {
            this.countTimes = countTimes;
        }

        public Object getDiscuss() {
            return discuss;
        }

        public void setDiscuss(Object discuss) {
            this.discuss = discuss;
        }

        public String getITotal() {
            return iTotal;
        }

        public void setITotal(String iTotal) {
            this.iTotal = iTotal;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getImageFont() {
            return imageFont;
        }

        public void setImageFont(String imageFont) {
            this.imageFont = imageFont;
        }

        public String getImgUrlHttp() {
            return imgUrlHttp;
        }

        public void setImgUrlHttp(String imgUrlHttp) {
            this.imgUrlHttp = imgUrlHttp;
        }

        public Object getIndexDate() {
            return indexDate;
        }

        public void setIndexDate(Object indexDate) {
            this.indexDate = indexDate;
        }

        public String getLookTimes() {
            return lookTimes;
        }

        public void setLookTimes(String lookTimes) {
            this.lookTimes = lookTimes;
        }

        public String getNewsId() {
            return newsId;
        }

        public void setNewsId(String newsId) {
            this.newsId = newsId;
        }

        public String getSourceName() {
            return sourceName;
        }

        public void setSourceName(String sourceName) {
            this.sourceName = sourceName;
        }

        public String getSubTitle() {
            return subTitle;
        }

        public void setSubTitle(String subTitle) {
            this.subTitle = subTitle;
        }

        public String getTimeLength() {
            return timeLength;
        }

        public void setTimeLength(String timeLength) {
            this.timeLength = timeLength;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Object getUser() {
            return user;
        }

        public void setUser(Object user) {
            this.user = user;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public String getVideoUrl() {
            return videoUrl;
        }

        public void setVideoUrl(String videoUrl) {
            this.videoUrl = videoUrl;
        }
    }

    public static class MatchInfoBean {
        /**
         * bMatchId :
         * battleTime :
         * discuss : null
         * discussId :
         * gameWin :
         * id : 0
         * leftBigDragon :
         * leftKillCout : 0
         * leftMoney :
         * leftSmallDragon :
         * leftTower :
         * leftbanHeroFive :
         * leftbanHeroFour :
         * leftbanHeroOne :
         * leftbanHeroThree :
         * leftbanHeroTwo :
         * matchNum :
         * rightBanHeroFive :
         * rightBanHeroFour :
         * rightBanHeroOne :
         * rightBanHeroThree :
         * rightBanHeroTwo :
         * rightBigDragon :
         * rightKillCount : 0
         * rightMoney :
         * rightSmallDragon :
         * rightTower :
         * sMatchId :
         * sMatchName :
         */

        private String bMatchId;
        private String battleTime;
        private Object discuss;
        private String discussId;
        private String gameWin;
        private int id;
        private String leftBigDragon;
        private int leftKillCout;
        private String leftMoney;
        private String leftSmallDragon;
        private String leftTower;
        private String leftbanHeroFive;
        private String leftbanHeroFour;
        private String leftbanHeroOne;
        private String leftbanHeroThree;
        private String leftbanHeroTwo;
        private String matchNum;
        private String rightBanHeroFive;
        private String rightBanHeroFour;
        private String rightBanHeroOne;
        private String rightBanHeroThree;
        private String rightBanHeroTwo;
        private String rightBigDragon;
        private int rightKillCount;
        private String rightMoney;
        private String rightSmallDragon;
        private String rightTower;
        private String sMatchId;
        private String sMatchName;

        public String getBMatchId() {
            return bMatchId;
        }

        public void setBMatchId(String bMatchId) {
            this.bMatchId = bMatchId;
        }

        public String getBattleTime() {
            return battleTime;
        }

        public void setBattleTime(String battleTime) {
            this.battleTime = battleTime;
        }

        public Object getDiscuss() {
            return discuss;
        }

        public void setDiscuss(Object discuss) {
            this.discuss = discuss;
        }

        public String getDiscussId() {
            return discussId;
        }

        public void setDiscussId(String discussId) {
            this.discussId = discussId;
        }

        public String getGameWin() {
            return gameWin;
        }

        public void setGameWin(String gameWin) {
            this.gameWin = gameWin;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLeftBigDragon() {
            return leftBigDragon;
        }

        public void setLeftBigDragon(String leftBigDragon) {
            this.leftBigDragon = leftBigDragon;
        }

        public int getLeftKillCout() {
            return leftKillCout;
        }

        public void setLeftKillCout(int leftKillCout) {
            this.leftKillCout = leftKillCout;
        }

        public String getLeftMoney() {
            return leftMoney;
        }

        public void setLeftMoney(String leftMoney) {
            this.leftMoney = leftMoney;
        }

        public String getLeftSmallDragon() {
            return leftSmallDragon;
        }

        public void setLeftSmallDragon(String leftSmallDragon) {
            this.leftSmallDragon = leftSmallDragon;
        }

        public String getLeftTower() {
            return leftTower;
        }

        public void setLeftTower(String leftTower) {
            this.leftTower = leftTower;
        }

        public String getLeftbanHeroFive() {
            return leftbanHeroFive;
        }

        public void setLeftbanHeroFive(String leftbanHeroFive) {
            this.leftbanHeroFive = leftbanHeroFive;
        }

        public String getLeftbanHeroFour() {
            return leftbanHeroFour;
        }

        public void setLeftbanHeroFour(String leftbanHeroFour) {
            this.leftbanHeroFour = leftbanHeroFour;
        }

        public String getLeftbanHeroOne() {
            return leftbanHeroOne;
        }

        public void setLeftbanHeroOne(String leftbanHeroOne) {
            this.leftbanHeroOne = leftbanHeroOne;
        }

        public String getLeftbanHeroThree() {
            return leftbanHeroThree;
        }

        public void setLeftbanHeroThree(String leftbanHeroThree) {
            this.leftbanHeroThree = leftbanHeroThree;
        }

        public String getLeftbanHeroTwo() {
            return leftbanHeroTwo;
        }

        public void setLeftbanHeroTwo(String leftbanHeroTwo) {
            this.leftbanHeroTwo = leftbanHeroTwo;
        }

        public String getMatchNum() {
            return matchNum;
        }

        public void setMatchNum(String matchNum) {
            this.matchNum = matchNum;
        }

        public String getRightBanHeroFive() {
            return rightBanHeroFive;
        }

        public void setRightBanHeroFive(String rightBanHeroFive) {
            this.rightBanHeroFive = rightBanHeroFive;
        }

        public String getRightBanHeroFour() {
            return rightBanHeroFour;
        }

        public void setRightBanHeroFour(String rightBanHeroFour) {
            this.rightBanHeroFour = rightBanHeroFour;
        }

        public String getRightBanHeroOne() {
            return rightBanHeroOne;
        }

        public void setRightBanHeroOne(String rightBanHeroOne) {
            this.rightBanHeroOne = rightBanHeroOne;
        }

        public String getRightBanHeroThree() {
            return rightBanHeroThree;
        }

        public void setRightBanHeroThree(String rightBanHeroThree) {
            this.rightBanHeroThree = rightBanHeroThree;
        }

        public String getRightBanHeroTwo() {
            return rightBanHeroTwo;
        }

        public void setRightBanHeroTwo(String rightBanHeroTwo) {
            this.rightBanHeroTwo = rightBanHeroTwo;
        }

        public String getRightBigDragon() {
            return rightBigDragon;
        }

        public void setRightBigDragon(String rightBigDragon) {
            this.rightBigDragon = rightBigDragon;
        }

        public int getRightKillCount() {
            return rightKillCount;
        }

        public void setRightKillCount(int rightKillCount) {
            this.rightKillCount = rightKillCount;
        }

        public String getRightMoney() {
            return rightMoney;
        }

        public void setRightMoney(String rightMoney) {
            this.rightMoney = rightMoney;
        }

        public String getRightSmallDragon() {
            return rightSmallDragon;
        }

        public void setRightSmallDragon(String rightSmallDragon) {
            this.rightSmallDragon = rightSmallDragon;
        }

        public String getRightTower() {
            return rightTower;
        }

        public void setRightTower(String rightTower) {
            this.rightTower = rightTower;
        }

        public String getSMatchId() {
            return sMatchId;
        }

        public void setSMatchId(String sMatchId) {
            this.sMatchId = sMatchId;
        }

        public String getSMatchName() {
            return sMatchName;
        }

        public void setSMatchName(String sMatchName) {
            this.sMatchName = sMatchName;
        }
    }

    public static class TalkBean {
        /**
         * browserCount : 0
         * commentCount : 1
         * content : 美国可再生能源发电量首次超过煤炭
         据外媒报道，美国能源情报署(EIA)最新数据显示，美国可再生能源的产量首次超越煤炭。今年4月，该国通过水力、太阳能和风力发电的量达到了6850万兆瓦时，而煤炭是6000万兆瓦时。这一成就是具有里程碑意义的，其中有些是长期的、有些是短期的。
         彭博社指出，从长期来看，美国一直在向天然气过渡，不仅因为它成本比煤炭更低而且其排放的二氧化碳也更少。与此同时，由于建造成本低，风力发电和太阳能发电正在该国如雨后春笋般涌现。
         4月，美国能源领域出现了一些短期趋势，这使得其可再生能源超过了煤炭，当然这并未是一个永久性转变。据悉，许多燃煤电厂在该月停产进行日常维护。这个时候，风力发电量和能源需求双双增加。相信等到燃煤电厂恢复正常运营时，煤炭发电量可能会再次占据上风。
         尽管如此，总体趋势表明，这种燃料在美国正在慢慢淡出人们的视线。截止到目前，在特朗普的总统任期内，已有50座燃煤电厂关闭，而随着各州承诺逐步淘汰化石燃料或转向天然气，今后可能还会有更多电厂关闭。
         * displayBig : true
         * enable : true
         * forwardCount : 0
         * hasZan : false
         * id : 107
         * picture : http://image.yysc.online//files/2019/5/27/fe5df232cafa4c4e0f1a0294418e5660.jpg
         * publishTime : 1584720000000
         * user : null
         * userId : 95
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
        private Object user;
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

        public Object getUser() {
            return user;
        }

        public void setUser(Object user) {
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
    }

    public static class UserBean {
        /**
         * album :
         * fansCount : 0
         * followCount : 0
         * head : http://image.yysc.online/files/2020/6/29/8f81346727148597a45928e1a8767009.jpeg
         * id : 4188
         * nickName : 酷酷的松
         * password : 654321
         * phone : 18781793053
         * project : null
         * projectKey : economic
         * signature :
         * talkCount : 0
         * type : 1
         * uuid : 13354ac4df4e4b1193f5d015c6bc6057
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