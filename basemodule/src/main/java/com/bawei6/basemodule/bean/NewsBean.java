package com.bawei6.basemodule.bean;

import java.util.List;

public class NewsBean {


    /**
     * code : 200
     * data : [{"id":12580,"newscode":"2fd09e02a44311e9a0e2fc7774fd634d","newstypeid":1,"sourcesiteid":1,"sourcesitename":"今日头条","title":"《全面战争：三国》袁术双传奇难度演义模式，一波细节带你飞","description":"作者：NGA-cenkiller很多人说袁术很弱，诸如没有将啊没有将啊没有将啊。这要看你怎么看，我现在一共打了6个双传奇的档，目前袁术是胜利的最快的，游戏时间第56回合就获胜了。","auth":"NGA玩家社区","sourceurl":"/group/6711577656384553479/","mainimgurl":"http://p1.pstatp.com/list/dfic-imagehandler/09118c3c-cd08-43d1-8c5a-90c7533dcfca","istop":"1"}]
     * msg : 操作成功
     */

    private int code;
    private String msg;
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 12580
         * newscode : 2fd09e02a44311e9a0e2fc7774fd634d
         * newstypeid : 1
         * sourcesiteid : 1
         * sourcesitename : 今日头条
         * title : 《全面战争：三国》袁术双传奇难度演义模式，一波细节带你飞
         * description : 作者：NGA-cenkiller很多人说袁术很弱，诸如没有将啊没有将啊没有将啊。这要看你怎么看，我现在一共打了6个双传奇的档，目前袁术是胜利的最快的，游戏时间第56回合就获胜了。
         * auth : NGA玩家社区
         * sourceurl : /group/6711577656384553479/
         * mainimgurl : http://p1.pstatp.com/list/dfic-imagehandler/09118c3c-cd08-43d1-8c5a-90c7533dcfca
         * istop : 1
         */

        private int id;
        private String newscode;
        private int newstypeid;
        private int sourcesiteid;
        private String sourcesitename;
        private String title;
        private String description;
        private String auth;
        private String sourceurl;
        private String mainimgurl;
        private String istop;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNewscode() {
            return newscode;
        }

        public void setNewscode(String newscode) {
            this.newscode = newscode;
        }

        public int getNewstypeid() {
            return newstypeid;
        }

        public void setNewstypeid(int newstypeid) {
            this.newstypeid = newstypeid;
        }

        public int getSourcesiteid() {
            return sourcesiteid;
        }

        public void setSourcesiteid(int sourcesiteid) {
            this.sourcesiteid = sourcesiteid;
        }

        public String getSourcesitename() {
            return sourcesitename;
        }

        public void setSourcesitename(String sourcesitename) {
            this.sourcesitename = sourcesitename;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getAuth() {
            return auth;
        }

        public void setAuth(String auth) {
            this.auth = auth;
        }

        public String getSourceurl() {
            return sourceurl;
        }

        public void setSourceurl(String sourceurl) {
            this.sourceurl = sourceurl;
        }

        public String getMainimgurl() {
            return mainimgurl;
        }

        public void setMainimgurl(String mainimgurl) {
            this.mainimgurl = mainimgurl;
        }

        public String getIstop() {
            return istop;
        }

        public void setIstop(String istop) {
            this.istop = istop;
        }
    }
}
