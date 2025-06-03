/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.String
 */
package com.appsflyer;

import android.content.Context;
import com.appsflyer.AppsFlyerLib;
import com.google.firebase.messaging.FirebaseMessagingService;

public class FirebaseMessagingServiceListener
extends FirebaseMessagingService {
    @Override
    public void onNewToken(String string2) {
        AppsFlyerLib.getInstance().updateServerUninstallToken(this.getApplicationContext(), string2);
    }
}

