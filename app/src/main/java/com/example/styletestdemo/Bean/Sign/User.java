package com.example.styletestdemo.Bean.Sign;

/**
 * 返回的数据类，登录界面
 */

public class User {

    /**
     * result : 0
     * data : {"id":100126,"username":"klzy","password":null,"pro_company":"测试平台","use_company":"测试","level_name":"厂家管理员","pro_company_id":100002,"use_company_id":100002,"level":4}
     * message : 成功
     * token : eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI0Y2E0NDcwOTUzMTQ0NGQyYTZjMmYyZTcxYzBlMWE4ZSIsImlhdCI6MTU1Mzc2MDkzNn0.AnQqdon5f3y9Px3Bll_7HDodqz4Q15Icy4BFJLvzsXM
     */

    private int result;
    private DataBean data;
    private String message;
    private String token;

    @Override
    public String toString() {
        return "User{" +
                "result=" + result +
                ", data=" + data +
                ", message='" + message + '\'' +
                ", token='" + token + '\'' +
                '}';
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public static class DataBean {
        @Override
        public String toString() {
            return "DataBean{" +
                    "id=" + id +
                    ", username='" + username + '\'' +
                    ", password=" + password +
                    ", pro_company='" + pro_company + '\'' +
                    ", use_company='" + use_company + '\'' +
                    ", level_name='" + level_name + '\'' +
                    ", pro_company_id=" + pro_company_id +
                    ", use_company_id=" + use_company_id +
                    ", level=" + level +
                    '}';
        }

        /**
         * id : 100126
         * username : klzy
         * password : null
         * pro_company : 测试平台
         * use_company : 测试
         * level_name : 厂家管理员
         * pro_company_id : 100002
         * use_company_id : 100002
         * level : 4
         */

        private int id;
        private String username;
        private Object password;
        private String pro_company;
        private String use_company;
        private String level_name;
        private int pro_company_id;
        private int use_company_id;
        private int level;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public Object getPassword() {
            return password;
        }

        public void setPassword(Object password) {
            this.password = password;
        }

        public String getPro_company() {
            return pro_company;
        }

        public void setPro_company(String pro_company) {
            this.pro_company = pro_company;
        }

        public String getUse_company() {
            return use_company;
        }

        public void setUse_company(String use_company) {
            this.use_company = use_company;
        }

        public String getLevel_name() {
            return level_name;
        }

        public void setLevel_name(String level_name) {
            this.level_name = level_name;
        }

        public int getPro_company_id() {
            return pro_company_id;
        }

        public void setPro_company_id(int pro_company_id) {
            this.pro_company_id = pro_company_id;
        }

        public int getUse_company_id() {
            return use_company_id;
        }

        public void setUse_company_id(int use_company_id) {
            this.use_company_id = use_company_id;
        }

        public int getLevel() {
            return level;
        }

        public void setLevel(int level) {
            this.level = level;
        }
    }
}
