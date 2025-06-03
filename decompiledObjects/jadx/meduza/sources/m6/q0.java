package m6;

import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class q0 implements ServiceConnection, t0 {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f10308a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f10309b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10310c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f10311d;

    /* renamed from: e, reason: collision with root package name */
    public final p0 f10312e;
    public ComponentName f;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s0 f10313o;

    public q0(s0 s0Var, p0 p0Var) {
        this.f10313o = s0Var;
        this.f10312e = p0Var;
    }

    public static j6.b a(q0 q0Var, String str, Executor executor) {
        j6.b bVar;
        try {
            Intent a10 = q0Var.f10312e.a(q0Var.f10313o.f10321e);
            q0Var.f10309b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(v6.j.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                s0 s0Var = q0Var.f10313o;
                boolean d10 = s0Var.f10322g.d(s0Var.f10321e, str, a10, q0Var, 4225, executor);
                q0Var.f10310c = d10;
                if (d10) {
                    q0Var.f10313o.f.sendMessageDelayed(q0Var.f10313o.f.obtainMessage(1, q0Var.f10312e), q0Var.f10313o.f10324i);
                    bVar = j6.b.f8468e;
                } else {
                    q0Var.f10309b = 2;
                    try {
                        s0 s0Var2 = q0Var.f10313o;
                        s0Var2.f10322g.c(s0Var2.f10321e, q0Var);
                    } catch (IllegalArgumentException unused) {
                    }
                    bVar = new j6.b(16);
                }
                return bVar;
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (g0 e10) {
            return e10.f10277a;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f10313o.f10320d) {
            this.f10313o.f.removeMessages(1, this.f10312e);
            this.f10311d = iBinder;
            this.f = componentName;
            Iterator it = this.f10308a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.f10309b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f10313o.f10320d) {
            this.f10313o.f.removeMessages(1, this.f10312e);
            this.f10311d = null;
            this.f = componentName;
            Iterator it = this.f10308a.values().iterator();
            while (it.hasNext()) {
                ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.f10309b = 2;
        }
    }
}
