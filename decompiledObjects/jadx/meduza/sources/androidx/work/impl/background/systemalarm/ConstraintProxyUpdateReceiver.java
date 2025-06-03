package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import o2.j;
import p2.k0;
import y2.o;

/* loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1473a = j.f("ConstrntProxyUpdtRecvr");

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f1474a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f1475b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f1476c;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f1474a = intent;
            this.f1475b = context;
            this.f1476c = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                boolean booleanExtra = this.f1474a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f1474a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f1474a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f1474a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                j.d().a(ConstraintProxyUpdateReceiver.f1473a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                o.a(this.f1475b, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                o.a(this.f1475b, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                o.a(this.f1475b, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                o.a(this.f1475b, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f1476c.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            k0.d(context).f12880d.d(new a(intent, context, goAsync()));
            return;
        }
        j.d().a(f1473a, "Ignoring unknown action " + action);
    }
}
