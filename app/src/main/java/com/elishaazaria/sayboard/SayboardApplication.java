package com.elishaazaria.sayboard;

import android.app.Application;
import android.content.Context;

import androidx.annotation.StringRes;

import com.elishaazaria.sayboard.preferences.MyPreferences;

import org.greenrobot.eventbus.EventBus;

import io.branch.referral.Branch;

public class SayboardApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Branch.enableLogging();
        Branch.getAutoInstance(this);
        EventBus.builder().logNoSubscriberMessages(false).sendNoSubscriberEvent(false).installDefaultEventBus();
        AppCtx.setAppCtx(this);
    }
}
