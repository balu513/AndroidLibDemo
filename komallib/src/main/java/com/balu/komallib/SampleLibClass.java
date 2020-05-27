package com.balu.komallib;

import android.util.Log;
import android.widget.Toast;

public class SampleLibClass {
    public static SampleLibClass instance;

    public static SampleLibClass getInstance(){
        if(instance == null){
            instance = new SampleLibClass();
        }
        return instance;
    }
    public void getSample(){
        Log.d("SampleLibClass"," This is GetSample in SampleLibClass");
    }
}
