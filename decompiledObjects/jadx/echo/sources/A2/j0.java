package A2;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j0 extends AbstractC0322h {

    /* renamed from: f, reason: collision with root package name */
    public final HashMap f499f = new HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final Context f500g;

    /* renamed from: h, reason: collision with root package name */
    public volatile Handler f501h;

    /* renamed from: i, reason: collision with root package name */
    public final i0 f502i;

    /* renamed from: j, reason: collision with root package name */
    public final D2.b f503j;

    /* renamed from: k, reason: collision with root package name */
    public final long f504k;

    /* renamed from: l, reason: collision with root package name */
    public final long f505l;

    public j0(Context context, Looper looper) {
        i0 i0Var = new i0(this, null);
        this.f502i = i0Var;
        this.f500g = context.getApplicationContext();
        this.f501h = new M2.e(looper, i0Var);
        this.f503j = D2.b.b();
        this.f504k = 5000L;
        this.f505l = 300000L;
    }

    @Override // A2.AbstractC0322h
    public final void d(e0 e0Var, ServiceConnection serviceConnection, String str) {
        AbstractC0328n.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f499f) {
            try {
                g0 g0Var = (g0) this.f499f.get(e0Var);
                if (g0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + e0Var.toString());
                }
                if (!g0Var.h(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + e0Var.toString());
                }
                g0Var.f(serviceConnection, str);
                if (g0Var.i()) {
                    this.f501h.sendMessageDelayed(this.f501h.obtainMessage(0, e0Var), this.f504k);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // A2.AbstractC0322h
    public final boolean f(e0 e0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        boolean j7;
        AbstractC0328n.j(serviceConnection, "ServiceConnection must not be null");
        synchronized (this.f499f) {
            try {
                g0 g0Var = (g0) this.f499f.get(e0Var);
                if (g0Var == null) {
                    g0Var = new g0(this, e0Var);
                    g0Var.d(serviceConnection, serviceConnection, str);
                    g0Var.e(str, executor);
                    this.f499f.put(e0Var, g0Var);
                } else {
                    this.f501h.removeMessages(0, e0Var);
                    if (g0Var.h(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + e0Var.toString());
                    }
                    g0Var.d(serviceConnection, serviceConnection, str);
                    int a7 = g0Var.a();
                    if (a7 == 1) {
                        serviceConnection.onServiceConnected(g0Var.b(), g0Var.c());
                    } else if (a7 == 2) {
                        g0Var.e(str, executor);
                    }
                }
                j7 = g0Var.j();
            } catch (Throwable th) {
                throw th;
            }
        }
        return j7;
    }
}
