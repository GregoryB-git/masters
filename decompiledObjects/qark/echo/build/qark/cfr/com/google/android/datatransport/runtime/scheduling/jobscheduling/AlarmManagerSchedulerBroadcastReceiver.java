/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 *  android.util.Base64
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import c2.d;
import f2.p;
import f2.u;
import m2.a;
import m2.r;

public class AlarmManagerSchedulerBroadcastReceiver
extends BroadcastReceiver {
    public static /* synthetic */ void a() {
        AlarmManagerSchedulerBroadcastReceiver.b();
    }

    public static /* synthetic */ void b() {
    }

    public void onReceive(Context object, Intent intent) {
        String string2 = intent.getData().getQueryParameter("backendName");
        String string3 = intent.getData().getQueryParameter("extras");
        int n8 = Integer.valueOf((String)intent.getData().getQueryParameter("priority"));
        int n9 = intent.getExtras().getInt("attemptNumber");
        u.f((Context)object);
        object = p.a().b(string2).d(q2.a.b(n8));
        if (string3 != null) {
            object.c(Base64.decode((String)string3, (int)0));
        }
        u.c().e().v(object.a(), n9, new a());
    }
}

