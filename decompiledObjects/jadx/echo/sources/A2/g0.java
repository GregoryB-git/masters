package A2;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class g0 implements ServiceConnection, k0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f486a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f487b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f488c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f489d;

    /* renamed from: e, reason: collision with root package name */
    public final e0 f490e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f491f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ j0 f492g;

    public g0(j0 j0Var, e0 e0Var) {
        this.f492g = j0Var;
        this.f490e = e0Var;
    }

    public final int a() {
        return this.f487b;
    }

    public final ComponentName b() {
        return this.f491f;
    }

    public final IBinder c() {
        return this.f489d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f486a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        D2.b bVar;
        Context context;
        Context context2;
        D2.b bVar2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j7;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f487b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (E2.l.l()) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            j0 j0Var = this.f492g;
            bVar = j0Var.f503j;
            context = j0Var.f500g;
            e0 e0Var = this.f490e;
            context2 = j0Var.f500g;
            boolean d7 = bVar.d(context, str, e0Var.c(context2), this, this.f490e.a(), executor);
            this.f488c = d7;
            if (d7) {
                handler = this.f492g.f501h;
                Message obtainMessage = handler.obtainMessage(1, this.f490e);
                handler2 = this.f492g.f501h;
                j7 = this.f492g.f505l;
                handler2.sendMessageDelayed(obtainMessage, j7);
            } else {
                this.f487b = 2;
                try {
                    j0 j0Var2 = this.f492g;
                    bVar2 = j0Var2.f503j;
                    context3 = j0Var2.f500g;
                    bVar2.c(context3, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f486a.remove(serviceConnection);
    }

    public final void g(String str) {
        Handler handler;
        D2.b bVar;
        Context context;
        handler = this.f492g.f501h;
        handler.removeMessages(1, this.f490e);
        j0 j0Var = this.f492g;
        bVar = j0Var.f503j;
        context = j0Var.f500g;
        bVar.c(context, this);
        this.f488c = false;
        this.f487b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f486a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f486a.isEmpty();
    }

    public final boolean j() {
        return this.f488c;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f492g.f499f;
        synchronized (hashMap) {
            try {
                handler = this.f492g.f501h;
                handler.removeMessages(1, this.f490e);
                this.f489d = iBinder;
                this.f491f = componentName;
                Iterator it = this.f486a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f487b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f492g.f499f;
        synchronized (hashMap) {
            try {
                handler = this.f492g.f501h;
                handler.removeMessages(1, this.f490e);
                this.f489d = null;
                this.f491f = componentName;
                Iterator it = this.f486a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f487b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
