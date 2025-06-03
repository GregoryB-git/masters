package e7;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* loaded from: classes.dex */
public final class j1 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final i6 f4357a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4358b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4359c;

    public j1(i6 i6Var) {
        this.f4357a = i6Var;
    }

    public final void a() {
        this.f4357a.d0();
        this.f4357a.zzl().l();
        this.f4357a.zzl().l();
        if (this.f4358b) {
            this.f4357a.zzj().f4067w.b("Unregistering connectivity change receiver");
            this.f4358b = false;
            this.f4359c = false;
            try {
                this.f4357a.t.f4360a.unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.f4357a.zzj().f4060o.c("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f4357a.d0();
        String action = intent.getAction();
        this.f4357a.zzj().f4067w.c("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f4357a.zzj().f4063r.c("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        g1 g1Var = this.f4357a.f4331b;
        i6.q(g1Var);
        boolean u10 = g1Var.u();
        if (this.f4359c != u10) {
            this.f4359c = u10;
            this.f4357a.zzl().u(new m1(this, u10));
        }
    }
}
