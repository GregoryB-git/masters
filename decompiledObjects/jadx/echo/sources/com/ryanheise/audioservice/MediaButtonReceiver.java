package com.ryanheise.audioservice;

import android.content.Context;
import android.content.Intent;
import c0.d;

/* loaded from: classes.dex */
public class MediaButtonReceiver extends d {
    @Override // c0.d, android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        AudioService audioService;
        if (intent == null || !"com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE".equals(intent.getAction()) || (audioService = AudioService.f12275R) == null) {
            super.onReceive(context, intent);
        } else {
            audioService.P();
        }
    }
}
