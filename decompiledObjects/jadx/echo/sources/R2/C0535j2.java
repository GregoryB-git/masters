package R2;

import A2.AbstractC0328n;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: R2.j2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0535j2 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final D5 f5347a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5348b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f5349c;

    public C0535j2(D5 d52) {
        AbstractC0328n.i(d52);
        this.f5347a = d52;
    }

    public final void b() {
        this.f5347a.p0();
        this.f5347a.e().n();
        if (this.f5348b) {
            return;
        }
        this.f5347a.a().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f5349c = this.f5347a.g0().A();
        this.f5347a.j().K().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f5349c));
        this.f5348b = true;
    }

    public final void c() {
        this.f5347a.p0();
        this.f5347a.e().n();
        this.f5347a.e().n();
        if (this.f5348b) {
            this.f5347a.j().K().a("Unregistering connectivity change receiver");
            this.f5348b = false;
            this.f5349c = false;
            try {
                this.f5347a.a().unregisterReceiver(this);
            } catch (IllegalArgumentException e7) {
                this.f5347a.j().G().b("Failed to unregister the network broadcast receiver", e7);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        this.f5347a.p0();
        String action = intent.getAction();
        this.f5347a.j().K().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f5347a.j().L().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean A7 = this.f5347a.g0().A();
        if (this.f5349c != A7) {
            this.f5349c = A7;
            this.f5347a.e().D(new RunnableC0556m2(this, A7));
        }
    }
}
