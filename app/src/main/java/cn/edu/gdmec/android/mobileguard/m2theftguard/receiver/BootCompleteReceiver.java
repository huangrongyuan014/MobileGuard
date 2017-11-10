package cn.edu.gdmec.android.mobileguard.m2theftguard.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import cn.edu.gdmec.android.mobileguard.App;

/**
 * Created by asus-pc on 2017/11/7.
 */

public class BootCompleteReceiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent){
        ((App)(context.getApplicationContext())).correctSIM();
    }
}
