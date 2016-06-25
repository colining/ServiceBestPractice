package com.example.asus.servicebestpractice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by asus on 2016/6/25.
 */
public class AlarmReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent)
    {
        Intent i =new Intent(context,LongRunningService.class);
        context.startService(i);
    }
}
