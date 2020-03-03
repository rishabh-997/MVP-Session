package com.example.mvpsession;

public class MainContract
{
    interface view {
        void start();

        void showToast(String ans);
    }

    interface presenter {
        void end();

        void dowMoreWork();
    }
}

