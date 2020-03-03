package com.example.mvpsession;

public class MainPresenter implements MainContract.presenter
{
    MainContract.view mvpview;

    public MainPresenter(MainContract.view mvpview) {
        this.mvpview = mvpview;
    }

    @Override
    public void end() {

        String ans = "Cyberlabs";

        mvpview.showToast(ans);
    }

    @Override
    public void dowMoreWork() {

    }
}
