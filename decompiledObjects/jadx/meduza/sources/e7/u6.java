package e7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzoy;

/* loaded from: classes.dex */
public final class u6 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final j2 f4699a;

    public u6(j2 j2Var) {
        this.f4699a = j2Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            this.f4699a.zzj().f4063r.b("App receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            this.f4699a.zzj().f4063r.b("App receiver called with null action");
            return;
        }
        if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
            j2 j2Var = this.f4699a;
            if (zzoy.zza() && j2Var.f4365o.x(null, h0.R0)) {
                j2Var.zzj().f4067w.b("App receiver notified triggers are available");
                j2Var.zzl().u(new i6.r(j2Var, 5));
                return;
            }
            return;
        }
        if (!action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
            this.f4699a.zzj().f4063r.b("App receiver called with unknown action");
        } else if (this.f4699a.f4365o.x(null, h0.M0)) {
            this.f4699a.zzj().f4067w.b("[sgtm] App Receiver notified batches are available");
            this.f4699a.zzl().u(new i6.q(this, 5));
        }
    }
}
