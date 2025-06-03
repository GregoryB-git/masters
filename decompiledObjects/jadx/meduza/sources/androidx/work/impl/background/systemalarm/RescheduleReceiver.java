package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import o2.j;
import p2.k0;

/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1477a = j.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        j.d().a(f1477a, "Received intent " + intent);
        try {
            k0 d10 = k0.d(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            d10.getClass();
            synchronized (k0.f12876m) {
                BroadcastReceiver.PendingResult pendingResult = d10.f12884i;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                d10.f12884i = goAsync;
                if (d10.f12883h) {
                    goAsync.finish();
                    d10.f12884i = null;
                }
            }
        } catch (IllegalStateException e10) {
            j.d().c(f1477a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
