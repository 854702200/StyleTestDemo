package com.example.styletestdemo.BaseClass;

    public class mBasePresent<V extends mBaseView> {
        private V mvpView;

        /**
         *建立VIEW连接，一般在初始化时使用
         */
        public void attachView(V mvpView){
            this.mvpView=mvpView;
        }

        /**
         * 是否与View建立连接
         * 每次调用业务请求的时候都要出现调用方法，用于检查是否与View建立连接
         */
        public boolean isattachView(){
            return mvpView != null;

        }

        /**
         * 获取连接的view
         * */
        public V  getView(){
            return mvpView;
        }

        /**
         * 断开view，一般在onDestroy中调用
         */
        public void detachView(){
            this.mvpView = null;

        }
    }


