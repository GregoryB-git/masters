// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.appsflyer;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessagingService;

public class FirebaseMessagingServiceListener extends FirebaseMessagingService
{
    @Override
    public void onNewToken(final String s) {
        AppsFlyerLib.getInstance().updateServerUninstallToken(((Context)this).getApplicationContext(), s);
    }
}
