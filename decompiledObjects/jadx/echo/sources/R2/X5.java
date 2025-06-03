package R2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C0917g7;

/* loaded from: classes.dex */
public final class X5 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final N2 f5144a;

    public X5(N2 n22) {
        this.f5144a = n22;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f5144a.j().L().a("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f5144a.j().L().a("App receiver called with null action");
            return;
        }
        if (!action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            this.f5144a.j().L().a("App receiver called with unknown action");
            return;
        }
        final N2 n22 = this.f5144a;
        if (C0917g7.a() && n22.z().D(null, K.f4791M0)) {
            n22.j().K().a("App receiver notified triggers are available");
            n22.e().D(new Runnable() { // from class: R2.Z5
                @Override // java.lang.Runnable
                public final void run() {
                    N2 n23 = N2.this;
                    if (!n23.L().V0()) {
                        n23.j().L().a("registerTrigger called but app not eligible");
                        return;
                    }
                    final C3 H6 = n23.H();
                    H6.getClass();
                    new Thread(new Runnable() { // from class: R2.a6
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3.this.p0();
                        }
                    }).start();
                }
            });
        }
    }
}
