package com.mod.molemod.utilities;

public class CustomTimer {

    private long startTime = System.currentTimeMillis();

    public boolean miliSecondsPassed(int miliSeconds){
        if(System.currentTimeMillis() > (startTime + miliSeconds)) {
            startTime = System.currentTimeMillis();
           return true;
        }else{
            return false;
        }
    }
}
