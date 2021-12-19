package com.amirmohammed.androidultras18nov.ui;

public enum OrderStates {

    PENDING("pending"),
    ON_WAY("onWay"),
   // FINISHED("finished")
    COMPLETE("complete")
    ;

    String state;

    OrderStates(String state){
        this.state = state;
    }
}
