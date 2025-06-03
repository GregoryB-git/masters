package A2;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import x2.C2188b;
import x2.C2190d;
import x2.C2197k;

/* renamed from: A2.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0317c {

    /* renamed from: A, reason: collision with root package name */
    public boolean f410A;

    /* renamed from: B, reason: collision with root package name */
    public volatile a0 f411B;

    /* renamed from: C, reason: collision with root package name */
    public AtomicInteger f412C;

    /* renamed from: a, reason: collision with root package name */
    public int f413a;

    /* renamed from: b, reason: collision with root package name */
    public long f414b;

    /* renamed from: c, reason: collision with root package name */
    public long f415c;

    /* renamed from: d, reason: collision with root package name */
    public int f416d;

    /* renamed from: e, reason: collision with root package name */
    public long f417e;

    /* renamed from: f, reason: collision with root package name */
    public volatile String f418f;

    /* renamed from: g, reason: collision with root package name */
    public m0 f419g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f420h;

    /* renamed from: i, reason: collision with root package name */
    public final Looper f421i;

    /* renamed from: j, reason: collision with root package name */
    public final AbstractC0322h f422j;

    /* renamed from: k, reason: collision with root package name */
    public final C2197k f423k;

    /* renamed from: l, reason: collision with root package name */
    public final Handler f424l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f425m;

    /* renamed from: n, reason: collision with root package name */
    public final Object f426n;

    /* renamed from: o, reason: collision with root package name */
    public InterfaceC0325k f427o;

    /* renamed from: p, reason: collision with root package name */
    public InterfaceC0004c f428p;

    /* renamed from: q, reason: collision with root package name */
    public IInterface f429q;

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f430r;

    /* renamed from: s, reason: collision with root package name */
    public X f431s;

    /* renamed from: t, reason: collision with root package name */
    public int f432t;

    /* renamed from: u, reason: collision with root package name */
    public final a f433u;

    /* renamed from: v, reason: collision with root package name */
    public final b f434v;

    /* renamed from: w, reason: collision with root package name */
    public final int f435w;

    /* renamed from: x, reason: collision with root package name */
    public final String f436x;

    /* renamed from: y, reason: collision with root package name */
    public volatile String f437y;

    /* renamed from: z, reason: collision with root package name */
    public C2188b f438z;

    /* renamed from: E, reason: collision with root package name */
    public static final C2190d[] f409E = new C2190d[0];

    /* renamed from: D, reason: collision with root package name */
    public static final String[] f408D = {"service_esmobile", "service_googleme"};

    /* renamed from: A2.c$a */
    public interface a {
        void n(int i7);

        void v(Bundle bundle);
    }

    /* renamed from: A2.c$b */
    public interface b {
        void o(C2188b c2188b);
    }

    /* renamed from: A2.c$c, reason: collision with other inner class name */
    public interface InterfaceC0004c {
        void b(C2188b c2188b);
    }

    /* renamed from: A2.c$d */
    public class d implements InterfaceC0004c {
        public d() {
        }

        @Override // A2.AbstractC0317c.InterfaceC0004c
        public final void b(C2188b c2188b) {
            if (c2188b.i()) {
                AbstractC0317c abstractC0317c = AbstractC0317c.this;
                abstractC0317c.o(null, abstractC0317c.C());
            } else if (AbstractC0317c.this.f434v != null) {
                AbstractC0317c.this.f434v.o(c2188b);
            }
        }
    }

    /* renamed from: A2.c$e */
    public interface e {
        void a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public AbstractC0317c(android.content.Context r10, android.os.Looper r11, int r12, A2.AbstractC0317c.a r13, A2.AbstractC0317c.b r14, java.lang.String r15) {
        /*
            r9 = this;
            A2.h r3 = A2.AbstractC0322h.b(r10)
            x2.k r4 = x2.C2197k.f()
            A2.AbstractC0328n.i(r13)
            A2.AbstractC0328n.i(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: A2.AbstractC0317c.<init>(android.content.Context, android.os.Looper, int, A2.c$a, A2.c$b, java.lang.String):void");
    }

    public static /* bridge */ /* synthetic */ void c0(AbstractC0317c abstractC0317c, a0 a0Var) {
        abstractC0317c.f411B = a0Var;
        if (abstractC0317c.S()) {
            C0319e c0319e = a0Var.f407r;
            C0329o.b().c(c0319e == null ? null : c0319e.k());
        }
    }

    public static /* bridge */ /* synthetic */ void d0(AbstractC0317c abstractC0317c, int i7) {
        int i8;
        int i9;
        synchronized (abstractC0317c.f425m) {
            i8 = abstractC0317c.f432t;
        }
        if (i8 == 3) {
            abstractC0317c.f410A = true;
            i9 = 5;
        } else {
            i9 = 4;
        }
        Handler handler = abstractC0317c.f424l;
        handler.sendMessage(handler.obtainMessage(i9, abstractC0317c.f412C.get(), 16));
    }

    public static /* bridge */ /* synthetic */ boolean g0(AbstractC0317c abstractC0317c, int i7, int i8, IInterface iInterface) {
        synchronized (abstractC0317c.f425m) {
            try {
                if (abstractC0317c.f432t != i7) {
                    return false;
                }
                abstractC0317c.i0(i8, iInterface);
                return true;
            } finally {
            }
        }
    }

    public static /* bridge */ /* synthetic */ boolean h0(AbstractC0317c abstractC0317c) {
        if (abstractC0317c.f410A || TextUtils.isEmpty(abstractC0317c.E()) || TextUtils.isEmpty(abstractC0317c.B())) {
            return false;
        }
        try {
            Class.forName(abstractC0317c.E());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public Bundle A() {
        return new Bundle();
    }

    public String B() {
        return null;
    }

    public Set C() {
        return Collections.emptySet();
    }

    public final IInterface D() {
        IInterface iInterface;
        synchronized (this.f425m) {
            try {
                if (this.f432t == 5) {
                    throw new DeadObjectException();
                }
                r();
                iInterface = this.f429q;
                AbstractC0328n.j(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String E();

    public abstract String F();

    public String G() {
        return "com.google.android.gms";
    }

    public C0319e H() {
        a0 a0Var = this.f411B;
        if (a0Var == null) {
            return null;
        }
        return a0Var.f407r;
    }

    public boolean I() {
        return h() >= 211700000;
    }

    public boolean J() {
        return this.f411B != null;
    }

    public void K(IInterface iInterface) {
        this.f415c = System.currentTimeMillis();
    }

    public void L(C2188b c2188b) {
        this.f416d = c2188b.a();
        this.f417e = System.currentTimeMillis();
    }

    public void M(int i7) {
        this.f413a = i7;
        this.f414b = System.currentTimeMillis();
    }

    public void N(int i7, IBinder iBinder, Bundle bundle, int i8) {
        Handler handler = this.f424l;
        handler.sendMessage(handler.obtainMessage(1, i8, -1, new Y(this, i7, iBinder, bundle)));
    }

    public boolean O() {
        return false;
    }

    public void P(String str) {
        this.f437y = str;
    }

    public void Q(int i7) {
        Handler handler = this.f424l;
        handler.sendMessage(handler.obtainMessage(6, this.f412C.get(), i7));
    }

    public void R(InterfaceC0004c interfaceC0004c, int i7, PendingIntent pendingIntent) {
        AbstractC0328n.j(interfaceC0004c, "Connection progress callbacks cannot be null.");
        this.f428p = interfaceC0004c;
        Handler handler = this.f424l;
        handler.sendMessage(handler.obtainMessage(3, this.f412C.get(), i7, pendingIntent));
    }

    public boolean S() {
        return false;
    }

    public final String X() {
        String str = this.f436x;
        return str == null ? this.f420h.getClass().getName() : str;
    }

    public boolean a() {
        boolean z7;
        synchronized (this.f425m) {
            z7 = this.f432t == 4;
        }
        return z7;
    }

    public void b(e eVar) {
        eVar.a();
    }

    public void c() {
        this.f412C.incrementAndGet();
        synchronized (this.f430r) {
            try {
                int size = this.f430r.size();
                for (int i7 = 0; i7 < size; i7++) {
                    ((V) this.f430r.get(i7)).d();
                }
                this.f430r.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f426n) {
            this.f427o = null;
        }
        i0(1, null);
    }

    public final void e0(int i7, Bundle bundle, int i8) {
        Handler handler = this.f424l;
        handler.sendMessage(handler.obtainMessage(7, i8, -1, new Z(this, i7, null)));
    }

    public void f(String str) {
        this.f418f = str;
        c();
    }

    public boolean g() {
        return true;
    }

    public abstract int h();

    public boolean i() {
        boolean z7;
        synchronized (this.f425m) {
            int i7 = this.f432t;
            z7 = true;
            if (i7 != 2 && i7 != 3) {
                z7 = false;
            }
        }
        return z7;
    }

    public final void i0(int i7, IInterface iInterface) {
        m0 m0Var;
        AbstractC0328n.a((i7 == 4) == (iInterface != null));
        synchronized (this.f425m) {
            try {
                this.f432t = i7;
                this.f429q = iInterface;
                if (i7 == 1) {
                    X x7 = this.f431s;
                    if (x7 != null) {
                        AbstractC0322h abstractC0322h = this.f422j;
                        String c7 = this.f419g.c();
                        AbstractC0328n.i(c7);
                        abstractC0322h.e(c7, this.f419g.b(), this.f419g.a(), x7, X(), this.f419g.d());
                        this.f431s = null;
                    }
                } else if (i7 == 2 || i7 == 3) {
                    X x8 = this.f431s;
                    if (x8 != null && (m0Var = this.f419g) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + m0Var.c() + " on " + m0Var.b());
                        AbstractC0322h abstractC0322h2 = this.f422j;
                        String c8 = this.f419g.c();
                        AbstractC0328n.i(c8);
                        abstractC0322h2.e(c8, this.f419g.b(), this.f419g.a(), x8, X(), this.f419g.d());
                        this.f412C.incrementAndGet();
                    }
                    X x9 = new X(this, this.f412C.get());
                    this.f431s = x9;
                    m0 m0Var2 = (this.f432t != 3 || B() == null) ? new m0(G(), F(), false, AbstractC0322h.a(), I()) : new m0(y().getPackageName(), B(), true, AbstractC0322h.a(), false);
                    this.f419g = m0Var2;
                    if (m0Var2.d() && h() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f419g.c())));
                    }
                    AbstractC0322h abstractC0322h3 = this.f422j;
                    String c9 = this.f419g.c();
                    AbstractC0328n.i(c9);
                    if (!abstractC0322h3.f(new e0(c9, this.f419g.b(), this.f419g.a(), this.f419g.d()), x9, X(), w())) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f419g.c() + " on " + this.f419g.b());
                        e0(16, null, this.f412C.get());
                    }
                } else if (i7 == 4) {
                    AbstractC0328n.i(iInterface);
                    K(iInterface);
                }
            } finally {
            }
        }
    }

    public final C2190d[] j() {
        a0 a0Var = this.f411B;
        if (a0Var == null) {
            return null;
        }
        return a0Var.f405p;
    }

    public String k() {
        m0 m0Var;
        if (!a() || (m0Var = this.f419g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return m0Var.b();
    }

    public String l() {
        return this.f418f;
    }

    public boolean m() {
        return false;
    }

    public void o(InterfaceC0323i interfaceC0323i, Set set) {
        Bundle A7 = A();
        int i7 = this.f435w;
        String str = this.f437y;
        int i8 = C2197k.f21182a;
        Scope[] scopeArr = C0320f.f467C;
        Bundle bundle = new Bundle();
        C2190d[] c2190dArr = C0320f.f468D;
        C0320f c0320f = new C0320f(6, i7, i8, null, null, scopeArr, bundle, null, c2190dArr, c2190dArr, true, 0, false, str);
        c0320f.f474r = this.f420h.getPackageName();
        c0320f.f477u = A7;
        if (set != null) {
            c0320f.f476t = (Scope[]) set.toArray(new Scope[0]);
        }
        if (m()) {
            Account u7 = u();
            if (u7 == null) {
                u7 = new Account("<<default account>>", "com.google");
            }
            c0320f.f478v = u7;
            if (interfaceC0323i != null) {
                c0320f.f475s = interfaceC0323i.asBinder();
            }
        } else if (O()) {
            c0320f.f478v = u();
        }
        c0320f.f479w = f409E;
        c0320f.f480x = v();
        if (S()) {
            c0320f.f469A = true;
        }
        try {
            synchronized (this.f426n) {
                try {
                    InterfaceC0325k interfaceC0325k = this.f427o;
                    if (interfaceC0325k != null) {
                        interfaceC0325k.h0(new W(this, this.f412C.get()), c0320f);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e7) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e7);
            Q(3);
        } catch (RemoteException e8) {
            e = e8;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.f412C.get());
        } catch (SecurityException e9) {
            throw e9;
        } catch (RuntimeException e10) {
            e = e10;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            N(8, null, null, this.f412C.get());
        }
    }

    public void p(InterfaceC0004c interfaceC0004c) {
        AbstractC0328n.j(interfaceC0004c, "Connection progress callbacks cannot be null.");
        this.f428p = interfaceC0004c;
        i0(2, null);
    }

    public void q() {
        int h7 = this.f423k.h(this.f420h, h());
        if (h7 == 0) {
            p(new d());
        } else {
            i0(1, null);
            R(new d(), h7, null);
        }
    }

    public final void r() {
        if (!a()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    public abstract IInterface s(IBinder iBinder);

    public boolean t() {
        return false;
    }

    public Account u() {
        return null;
    }

    public C2190d[] v() {
        return f409E;
    }

    public Executor w() {
        return null;
    }

    public Bundle x() {
        return null;
    }

    public final Context y() {
        return this.f420h;
    }

    public int z() {
        return this.f435w;
    }

    public AbstractC0317c(Context context, Looper looper, AbstractC0322h abstractC0322h, C2197k c2197k, int i7, a aVar, b bVar, String str) {
        this.f418f = null;
        this.f425m = new Object();
        this.f426n = new Object();
        this.f430r = new ArrayList();
        this.f432t = 1;
        this.f438z = null;
        this.f410A = false;
        this.f411B = null;
        this.f412C = new AtomicInteger(0);
        AbstractC0328n.j(context, "Context must not be null");
        this.f420h = context;
        AbstractC0328n.j(looper, "Looper must not be null");
        this.f421i = looper;
        AbstractC0328n.j(abstractC0322h, "Supervisor must not be null");
        this.f422j = abstractC0322h;
        AbstractC0328n.j(c2197k, "API availability must not be null");
        this.f423k = c2197k;
        this.f424l = new U(this, looper);
        this.f435w = i7;
        this.f433u = aVar;
        this.f434v = bVar;
        this.f436x = str;
    }
}
