package m9;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import i9.i1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import m9.h;

/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10761a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f10762b;

    /* renamed from: c, reason: collision with root package name */
    public Runnable f10763c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f10764d = new ArrayList();

    public class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            d.this.c(true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            d.this.c(false);
        }
    }

    public class b extends BroadcastReceiver {

        /* renamed from: a, reason: collision with root package name */
        public boolean f10766a = false;

        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            d dVar;
            boolean z10;
            boolean b10 = d.this.b();
            if (!d.this.b() || this.f10766a) {
                if (!b10 && this.f10766a) {
                    dVar = d.this;
                    z10 = false;
                }
                this.f10766a = b10;
            }
            dVar = d.this;
            z10 = true;
            dVar.c(z10);
            this.f10766a = b10;
        }
    }

    public d(Context context) {
        Runnable qVar;
        x6.b.Z("Context must be non-null", context != null, new Object[0]);
        this.f10761a = context;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        this.f10762b = connectivityManager;
        Application application = (Application) context.getApplicationContext();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        application.registerActivityLifecycleCallbacks(new m9.b(this, atomicBoolean));
        application.registerComponentCallbacks(new c(atomicBoolean));
        if (Build.VERSION.SDK_INT < 24 || connectivityManager == null) {
            b bVar = new b();
            context.registerReceiver(bVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            qVar = new g.q(18, this, bVar);
        } else {
            a aVar = new a();
            connectivityManager.registerDefaultNetworkCallback(aVar);
            qVar = new w.g(22, this, aVar);
        }
        this.f10763c = qVar;
    }

    public final void a(i1 i1Var) {
        synchronized (this.f10764d) {
            this.f10764d.add(i1Var);
        }
    }

    public final boolean b() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f10761a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void c(boolean z10) {
        synchronized (this.f10764d) {
            Iterator it = this.f10764d.iterator();
            while (it.hasNext()) {
                ((n9.d) it.next()).accept(z10 ? h.a.REACHABLE : h.a.UNREACHABLE);
            }
        }
    }

    public final void d() {
        p2.m0.y(1, "AndroidConnectivityMonitor", "App has entered the foreground.", new Object[0]);
        if (b()) {
            c(true);
        }
    }

    @Override // m9.h
    public final void shutdown() {
        Runnable runnable = this.f10763c;
        if (runnable != null) {
            runnable.run();
            this.f10763c = null;
        }
    }
}
