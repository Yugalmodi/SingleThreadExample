package com.techpalle.singlethreadexample;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyIntentService extends IntentService {
    public MyIntentService() {
        super("Worker Thread");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        //PROBLEM: We can't touch UI task from an handle intent - it is under background thread
//        Toast.makeText(MyIntentService.this, "This is Single Thread Service", Toast.LENGTH_SHORT).show();
        Log.d("batch 34", "Service is started");
    }
}
