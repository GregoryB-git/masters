package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import k3.j;
import k3.s;
import k3.w;
import q3.f;
import q3.k;
import u3.a;

/* loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f2558a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        w.b(context);
        j.a a10 = s.a();
        a10.b(queryParameter);
        a10.c(a.b(intValue));
        if (queryParameter2 != null) {
            a10.f8900b = Base64.decode(queryParameter2, 0);
        }
        k kVar = w.a().f8925d;
        kVar.f13259e.execute(new f(kVar, a10.a(), i10, new Runnable() { // from class: q3.a
            @Override // java.lang.Runnable
            public final void run() {
                int i11 = AlarmManagerSchedulerBroadcastReceiver.f2558a;
            }
        }, 0));
    }
}
