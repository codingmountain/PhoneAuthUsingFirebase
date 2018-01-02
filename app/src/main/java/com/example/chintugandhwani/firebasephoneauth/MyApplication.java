package com.example.chintugandhwani.firebasephoneauth;

import android.app.Application;

import com.google.firebase.FirebaseApp;

/**
 * Created by chintu gandhwani on 1/1/2018.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        FirebaseApp.initializeApp(this);
    }
}
