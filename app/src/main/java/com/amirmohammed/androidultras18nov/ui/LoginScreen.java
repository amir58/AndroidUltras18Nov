package com.amirmohammed.androidultras18nov.ui;

import com.amirmohammed.androidultras18nov.screens.BaseScreen;

public class LoginScreen extends BaseScreen {

    public LoginScreen(String currentScreen) {
        super(currentScreen);
    }

    void login(){
        //super.showError("Email or password wrong");

        super.checkWifi();
        super.checkMobileData();
        startLoadingAnimation();

        super.stopLoadingAnimation();

        // navigate to home screen
    }

    @Override
    protected void startLoadingAnimation() {

    }

}
