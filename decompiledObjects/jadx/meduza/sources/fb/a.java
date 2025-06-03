package fb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.util.Log;
import eb.e;
import eb.n;
import eb.n0;
import eb.o0;
import eb.p0;
import eb.t0;
import eb.w;
import hb.g;
import java.util.concurrent.TimeUnit;
import x0.f;

/* loaded from: classes.dex */
public final class a extends w<a> {

    /* renamed from: a, reason: collision with root package name */
    public final o0<?> f5527a;

    /* renamed from: b, reason: collision with root package name */
    public Context f5528b;

    /* renamed from: fb.a$a, reason: collision with other inner class name */
    public static final class C0086a extends n0 {

        /* renamed from: b, reason: collision with root package name */
        public final n0 f5529b;

        /* renamed from: c, reason: collision with root package name */
        public final Context f5530c;

        /* renamed from: d, reason: collision with root package name */
        public final ConnectivityManager f5531d;

        /* renamed from: e, reason: collision with root package name */
        public final Object f5532e = new Object();
        public Runnable f;

        /* renamed from: fb.a$a$a, reason: collision with other inner class name */
        public class RunnableC0087a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c f5533a;

            public RunnableC0087a(c cVar) {
                this.f5533a = cVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0086a.this.f5531d.unregisterNetworkCallback(this.f5533a);
            }
        }

        /* renamed from: fb.a$a$b */
        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f5535a;

            public b(d dVar) {
                this.f5535a = dVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                C0086a.this.f5530c.unregisterReceiver(this.f5535a);
            }
        }

        /* renamed from: fb.a$a$c */
        public class c extends ConnectivityManager.NetworkCallback {
            public c() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onAvailable(Network network) {
                C0086a.this.f5529b.D();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onBlockedStatusChanged(Network network, boolean z10) {
                if (z10) {
                    return;
                }
                C0086a.this.f5529b.D();
            }
        }

        /* renamed from: fb.a$a$d */
        public class d extends BroadcastReceiver {

            /* renamed from: a, reason: collision with root package name */
            public boolean f5538a = false;

            public d() {
            }

            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                boolean z10 = this.f5538a;
                boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                this.f5538a = z11;
                if (!z11 || z10) {
                    return;
                }
                C0086a.this.f5529b.D();
            }
        }

        public C0086a(n0 n0Var, Context context) {
            this.f5529b = n0Var;
            this.f5530c = context;
            if (context == null) {
                this.f5531d = null;
                return;
            }
            this.f5531d = (ConnectivityManager) context.getSystemService("connectivity");
            try {
                I();
            } catch (SecurityException e10) {
                Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e10);
            }
        }

        @Override // eb.n0
        public final boolean C(long j10, TimeUnit timeUnit) {
            return this.f5529b.C(j10, timeUnit);
        }

        @Override // eb.n0
        public final void D() {
            this.f5529b.D();
        }

        @Override // eb.n0
        public final n E() {
            return this.f5529b.E();
        }

        @Override // eb.n0
        public final void F(n nVar, f fVar) {
            this.f5529b.F(nVar, fVar);
        }

        @Override // eb.n0
        public final n0 G() {
            synchronized (this.f5532e) {
                Runnable runnable = this.f;
                if (runnable != null) {
                    runnable.run();
                    this.f = null;
                }
            }
            return this.f5529b.G();
        }

        @Override // eb.n0
        public final n0 H() {
            synchronized (this.f5532e) {
                Runnable runnable = this.f;
                if (runnable != null) {
                    runnable.run();
                    this.f = null;
                }
            }
            return this.f5529b.H();
        }

        public final void I() {
            Runnable bVar;
            if (Build.VERSION.SDK_INT < 24 || this.f5531d == null) {
                d dVar = new d();
                this.f5530c.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                bVar = new b(dVar);
            } else {
                c cVar = new c();
                this.f5531d.registerDefaultNetworkCallback(cVar);
                bVar = new RunnableC0087a(cVar);
            }
            this.f = bVar;
        }

        @Override // e9.a
        public final String b() {
            return this.f5529b.b();
        }

        @Override // e9.a
        public final <RequestT, ResponseT> e<RequestT, ResponseT> v(t0<RequestT, ResponseT> t0Var, eb.c cVar) {
            return this.f5529b.v(t0Var, cVar);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    static {
        String str;
        try {
            try {
                if (((p0) g.class.asSubclass(p0.class).getConstructor(new Class[0]).newInstance(new Object[0])).b()) {
                    return;
                }
                Log.w("AndroidChannelBuilder", "OkHttpChannelProvider.isAvailable() returned false");
            } catch (Exception e10) {
                e = e10;
                str = "Failed to construct OkHttpChannelProvider";
                Log.w("AndroidChannelBuilder", str, e);
            }
        } catch (ClassCastException e11) {
            e = e11;
            str = "Couldn't cast OkHttpChannelProvider to ManagedChannelProvider";
        }
    }

    public a(o0<?> o0Var) {
        this.f5527a = o0Var;
    }

    @Override // eb.v, eb.o0
    public final n0 a() {
        return new C0086a(this.f5527a.a(), this.f5528b);
    }

    @Override // eb.v
    public final o0<?> d() {
        return this.f5527a;
    }
}
