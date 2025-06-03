package com.ryanheise.audioservice;

import android.content.Context;
import android.content.Intent;
import com.ryanheise.audioservice.AudioService;
import com.ryanheise.audioservice.b;

/* loaded from: classes.dex */
public class MediaButtonReceiver extends i1.a {
    @Override // i1.a, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE".equals(intent.getAction()) || AudioService.F == null) {
            super.onReceive(context, intent);
            return;
        }
        AudioService.c cVar = AudioService.H;
        if (cVar == null) {
            return;
        }
        ((b.c) cVar).a("onNotificationDeleted", b.k(new Object[0]), null);
    }
}
