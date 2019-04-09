package com.example.styletestdemo.Bean.Sign;

import java.util.List;

/**
 * 返回的数据类，登录界面
 */

public class User1 {


    @Override
    public String toString() {
        return "User1{" +
                "result=" + result +
                ", message='" + message + '\'' +
                ", token='" + token + '\'' +
                ", data=" + data +
                '}';
    }

    /**
     * result : 0
     * data : [{"id":100097,"deviceNO":"0023558B213A","deviceName":"kinco测试样机03","deviceAdd":null,"deviceType":1,"longitude":104.178752,"latitude":30.690064,"fileName":"","pro_company":"测试平台","use_company":"测试","pro_company_id":100002,"use_company_id":100002,"alarm_array":null,"loopTime":2,"reg":false,"onLine":false,"save":false},{"id":100129,"deviceNO":"0C7512534555","deviceName":"空调制冷系统","deviceAdd":null,"deviceType":1,"longitude":116.459461,"latitude":39.951893,"fileName":"","pro_company":"测试平台","use_company":"测试","pro_company_id":100002,"use_company_id":100002,"alarm_array":null,"loopTime":2,"reg":false,"onLine":false,"save":false},{"id":101549,"deviceNO":"0023558B2178","deviceName":"测试测试","deviceAdd":null,"deviceType":1,"longitude":111,"latitude":22,"fileName":null,"pro_company":"测试平台","use_company":"最终厂家","pro_company_id":100002,"use_company_id":100003,"alarm_array":null,"loopTime":2,"reg":false,"onLine":false,"save":false}]
     * message : 成功
     * token : eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI1YTAxNDNhZThkMjA0Mzc0YjU5OTQ2MzkzNWE5ZDhjYSIsImlhdCI6MTU1NDc5MDU5MX0.PY-_rU2FxNzO74HMw2pr5xqJ9J265hSXMkVO_Qtr-Us
     */

    private int result;
    private String message;
    private String token;
    private List<DataBean> data;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
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

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        @Override
        public String toString() {
            return "DataBean{" +
                    "id=" + id +
                    ", deviceNO='" + deviceNO + '\'' +
                    ", deviceName='" + deviceName + '\'' +
                    ", deviceAdd=" + deviceAdd +
                    ", deviceType=" + deviceType +
                    ", longitude=" + longitude +
                    ", latitude=" + latitude +
                    ", fileName='" + fileName + '\'' +
                    ", pro_company='" + pro_company + '\'' +
                    ", use_company='" + use_company + '\'' +
                    ", pro_company_id=" + pro_company_id +
                    ", use_company_id=" + use_company_id +
                    ", alarm_array=" + alarm_array +
                    ", loopTime=" + loopTime +
                    ", reg=" + reg +
                    ", onLine=" + onLine +
                    ", save=" + save +
                    '}';
        }

        /**
         * id : 100097
         * deviceNO : 0023558B213A
         * deviceName : kinco测试样机03
         * deviceAdd : null
         * deviceType : 1
         * longitude : 104.178752
         * latitude : 30.690064
         * fileName :
         * pro_company : 测试平台
         * use_company : 测试
         * pro_company_id : 100002
         * use_company_id : 100002
         * alarm_array : null
         * loopTime : 2
         * reg : false
         * onLine : false
         * save : false
         */

        private int id;
        private String deviceNO;
        private String deviceName;
        private Object deviceAdd;
        private int deviceType;
        private double longitude;
        private double latitude;
        private String fileName;
        private String pro_company;
        private String use_company;
        private int pro_company_id;
        private int use_company_id;
        private Object alarm_array;
        private int loopTime;
        private boolean reg;
        private boolean onLine;
        private boolean save;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getDeviceNO() {
            return deviceNO;
        }

        public void setDeviceNO(String deviceNO) {
            this.deviceNO = deviceNO;
        }

        public String getDeviceName() {
            return deviceName;
        }

        public void setDeviceName(String deviceName) {
            this.deviceName = deviceName;
        }

        public Object getDeviceAdd() {
            return deviceAdd;
        }

        public void setDeviceAdd(Object deviceAdd) {
            this.deviceAdd = deviceAdd;
        }

        public int getDeviceType() {
            return deviceType;
        }

        public void setDeviceType(int deviceType) {
            this.deviceType = deviceType;
        }

        public double getLongitude() {
            return longitude;
        }

        public void setLongitude(double longitude) {
            this.longitude = longitude;
        }

        public double getLatitude() {
            return latitude;
        }

        public void setLatitude(double latitude) {
            this.latitude = latitude;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
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

        public Object getAlarm_array() {
            return alarm_array;
        }

        public void setAlarm_array(Object alarm_array) {
            this.alarm_array = alarm_array;
        }

        public int getLoopTime() {
            return loopTime;
        }

        public void setLoopTime(int loopTime) {
            this.loopTime = loopTime;
        }

        public boolean isReg() {
            return reg;
        }

        public void setReg(boolean reg) {
            this.reg = reg;
        }

        public boolean isOnLine() {
            return onLine;
        }

        public void setOnLine(boolean onLine) {
            this.onLine = onLine;
        }

        public boolean isSave() {
            return save;
        }

        public void setSave(boolean save) {
            this.save = save;
        }
    }
}
