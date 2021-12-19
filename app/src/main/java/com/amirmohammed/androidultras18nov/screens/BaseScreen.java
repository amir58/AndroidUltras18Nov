package com.amirmohammed.androidultras18nov.screens;

// concrete class
// abstract class
public abstract class BaseScreen implements IErrors{

    @Override
    public void showError(String errorMessage) {

    }

    String currentScreen;

    public BaseScreen(String currentScreen) {
        this.currentScreen = currentScreen;

    }

    public BaseScreen() {

    }

    protected abstract void startLoadingAnimation();



    protected void stopLoadingAnimation() {

    }

    public final void checkWifi() {

    }

    public final void checkMobileData() {

    }


}
