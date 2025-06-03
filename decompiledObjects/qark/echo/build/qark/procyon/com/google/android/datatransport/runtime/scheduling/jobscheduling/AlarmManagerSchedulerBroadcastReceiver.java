// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.os.BaseBundle;
import android.util.Base64;
import q2.a;
import f2.p;
import f2.u;
import android.content.Intent;
import android.content.Context;
import android.content.BroadcastReceiver;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver
{
    public void onReceive(final Context context, final Intent intent) {
        final String queryParameter = intent.getData().getQueryParameter("backendName");
        final String queryParameter2 = intent.getData().getQueryParameter("extras");
        final int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority"));
        final int int1 = ((BaseBundle)intent.getExtras()).getInt("attemptNumber");
        u.f(context);
        final p.a d = p.a().b(queryParameter).d(a.b(intValue));
        if (queryParameter2 != null) {
            d.c(Base64.decode(queryParameter2, 0));
        }
        u.c().e().v(d.a(), int1, new m2.a());
    }
}
