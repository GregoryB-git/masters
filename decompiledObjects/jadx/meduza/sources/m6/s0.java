package m6;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.Looper;
import com.google.android.gms.internal.common.zzh;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class s0 extends c {

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f10320d = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Context f10321e;
    public volatile zzh f;

    /* renamed from: g, reason: collision with root package name */
    public final u6.a f10322g;

    /* renamed from: h, reason: collision with root package name */
    public final long f10323h;

    /* renamed from: i, reason: collision with root package name */
    public final long f10324i;

    /* renamed from: j, reason: collision with root package name */
    public volatile Executor f10325j;

    public s0(Context context, Looper looper) {
        r0 r0Var = new r0(this);
        this.f10321e = context.getApplicationContext();
        this.f = new zzh(looper, r0Var);
        this.f10322g = u6.a.b();
        this.f10323h = 5000L;
        this.f10324i = 300000L;
        this.f10325j = null;
    }

    @Override // m6.c
    public final j6.b b(p0 p0Var, ServiceConnection serviceConnection, String str, Executor executor) {
        synchronized (this.f10320d) {
            try {
                q0 q0Var = (q0) this.f10320d.get(p0Var);
                if (executor == null) {
                    executor = this.f10325j;
                }
                j6.b bVar = null;
                if (q0Var == null) {
                    q0Var = new q0(this, p0Var);
                    q0Var.f10308a.put(serviceConnection, serviceConnection);
                    bVar = q0.a(q0Var, str, executor);
                    this.f10320d.put(p0Var, q0Var);
                } else {
                    this.f.removeMessages(0, p0Var);
                    if (q0Var.f10308a.containsKey(serviceConnection)) {
                        throw new IllegalStateException("Trying to bind a GmsServiceConnection that was already connected before.  config=" + p0Var.toString());
                    }
                    q0Var.f10308a.put(serviceConnection, serviceConnection);
                    int i10 = q0Var.f10309b;
                    if (i10 == 1) {
                        serviceConnection.onServiceConnected(q0Var.f, q0Var.f10311d);
                    } else if (i10 == 2) {
                        bVar = q0.a(q0Var, str, executor);
                    }
                }
                if (q0Var.f10310c) {
                    return j6.b.f8468e;
                }
                if (bVar == null) {
                    bVar = new j6.b(-1);
                }
                return bVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // m6.c
    public final void c(p0 p0Var, ServiceConnection serviceConnection) {
        synchronized (this.f10320d) {
            try {
                q0 q0Var = (q0) this.f10320d.get(p0Var);
                if (q0Var == null) {
                    throw new IllegalStateException("Nonexistent connection status for service config: " + p0Var.toString());
                }
                if (!q0Var.f10308a.containsKey(serviceConnection)) {
                    throw new IllegalStateException("Trying to unbind a GmsServiceConnection  that was not bound before.  config=" + p0Var.toString());
                }
                q0Var.f10308a.remove(serviceConnection);
                if (q0Var.f10308a.isEmpty()) {
                    this.f.sendMessageDelayed(this.f.obtainMessage(0, p0Var), this.f10323h);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
