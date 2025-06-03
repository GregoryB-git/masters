// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.ryanheise.audioservice;

import android.content.Intent;
import android.content.Context;
import c0.d;

public class MediaButtonReceiver extends d
{
    @Override
    public void onReceive(final Context context, final Intent intent) {
        if (intent != null && "com.ryanheise.audioservice.intent.action.ACTION_NOTIFICATION_DELETE".equals(intent.getAction())) {
            final AudioService r = AudioService.R;
            if (r != null) {
                r.P();
                return;
            }
        }
        super.onReceive(context, intent);
    }
}
