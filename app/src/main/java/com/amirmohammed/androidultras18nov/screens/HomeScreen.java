package com.amirmohammed.androidultras18nov.screens;

public class HomeScreen extends BaseScreen{

    public HomeScreen() {
        super("HomeScreen");
    }

    void getHomeData() {
        super.checkWifi();
        super.checkMobileData();
        startLoadingAnimation();


        super.stopLoadingAnimation();
    }


    @Override
    protected void startLoadingAnimation() {
//        super.startLoadingAnimation();
        System.out.println("Start custom animation");
    }

}
