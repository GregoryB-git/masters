/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  java.lang.Object
 *  java.lang.String
 */
package com.ryanheise.audioservice;

import android.content.Context;
import android.content.Intent;
import c0.d;
import com.ryanheise.audioservice.AudioService;

public class MediaButtonReceiver
extends d {
    @Override
    public void onReceive(Context context, Intent intent) {
        AudioService audioService;
        if (intent != null && "com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE".equals((Object)intent.getAction()) && (audioService = AudioService.R) != null) {
            audioService.P();
            return;
        }
        super.onReceive(context, intent);
    }
}

