package z2;

import A2.AbstractC0322h;
import A2.AbstractC0332s;
import A2.C0326l;
import A2.C0329o;
import A2.C0330p;
import A2.InterfaceC0333t;
import V2.AbstractC0659j;
import V2.C0660k;
import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import t.C1959b;
import x2.C2188b;
import x2.C2196j;

/* renamed from: z2.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2302e implements Handler.Callback {

    /* renamed from: F, reason: collision with root package name */
    public static final Status f21714F = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* renamed from: G, reason: collision with root package name */
    public static final Status f21715G = new Status(4, "The user must be signed in to make this API call.");

    /* renamed from: H, reason: collision with root package name */
    public static final Object f21716H = new Object();

    /* renamed from: I, reason: collision with root package name */
    public static C2302e f21717I;

    /* renamed from: D, reason: collision with root package name */
    public final Handler f21721D;

    /* renamed from: E, reason: collision with root package name */
    public volatile boolean f21722E;

    /* renamed from: s, reason: collision with root package name */
    public A2.r f21727s;

    /* renamed from: t, reason: collision with root package name */
    public InterfaceC0333t f21728t;

    /* renamed from: u, reason: collision with root package name */
    public final Context f21729u;

    /* renamed from: v, reason: collision with root package name */
    public final C2196j f21730v;

    /* renamed from: w, reason: collision with root package name */
    public final A2.E f21731w;

    /* renamed from: o, reason: collision with root package name */
    public long f21723o = 5000;

    /* renamed from: p, reason: collision with root package name */
    public long f21724p = 120000;

    /* renamed from: q, reason: collision with root package name */
    public long f21725q = 10000;

    /* renamed from: r, reason: collision with root package name */
    public boolean f21726r = false;

    /* renamed from: x, reason: collision with root package name */
    public final AtomicInteger f21732x = new AtomicInteger(1);

    /* renamed from: y, reason: collision with root package name */
    public final AtomicInteger f21733y = new AtomicInteger(0);

    /* renamed from: z, reason: collision with root package name */
    public final Map f21734z = new ConcurrentHashMap(5, 0.75f, 1);

    /* renamed from: A, reason: collision with root package name */
    public C2313p f21718A = null;

    /* renamed from: B, reason: collision with root package name */
    public final Set f21719B = new C1959b();

    /* renamed from: C, reason: collision with root package name */
    public final Set f21720C = new C1959b();

    public C2302e(Context context, Looper looper, C2196j c2196j) {
        this.f21722E = true;
        this.f21729u = context;
        K2.i iVar = new K2.i(looper, this);
        this.f21721D = iVar;
        this.f21730v = c2196j;
        this.f21731w = new A2.E(c2196j);
        if (E2.i.a(context)) {
            this.f21722E = false;
        }
        iVar.sendMessage(iVar.obtainMessage(6));
    }

    public static Status h(C2299b c2299b, C2188b c2188b) {
        return new Status(c2188b, "API: " + c2299b.b() + " is not available on this device. Connection failed with: " + String.valueOf(c2188b));
    }

    public static C2302e x(Context context) {
        C2302e c2302e;
        synchronized (f21716H) {
            try {
                if (f21717I == null) {
                    f21717I = new C2302e(context.getApplicationContext(), AbstractC0322h.c().getLooper(), C2196j.m());
                }
                c2302e = f21717I;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c2302e;
    }

    public final void D(y2.d dVar, int i7, AbstractC2310m abstractC2310m, C0660k c0660k, InterfaceC2309l interfaceC2309l) {
        l(c0660k, abstractC2310m.d(), dVar);
        Q q7 = new Q(i7, abstractC2310m, c0660k, interfaceC2309l);
        Handler handler = this.f21721D;
        handler.sendMessage(handler.obtainMessage(4, new I(q7, this.f21733y.get(), dVar)));
    }

    public final void E(C0326l c0326l, int i7, long j7, int i8) {
        Handler handler = this.f21721D;
        handler.sendMessage(handler.obtainMessage(18, new H(c0326l, i7, j7, i8)));
    }

    public final void F(C2188b c2188b, int i7) {
        if (g(c2188b, i7)) {
            return;
        }
        Handler handler = this.f21721D;
        handler.sendMessage(handler.obtainMessage(5, i7, 0, c2188b));
    }

    public final void a() {
        Handler handler = this.f21721D;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void b(y2.d dVar) {
        Handler handler = this.f21721D;
        handler.sendMessage(handler.obtainMessage(7, dVar));
    }

    public final void c(C2313p c2313p) {
        synchronized (f21716H) {
            try {
                if (this.f21718A != c2313p) {
                    this.f21718A = c2313p;
                    this.f21719B.clear();
                }
                this.f21719B.addAll(c2313p.t());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(C2313p c2313p) {
        synchronized (f21716H) {
            try {
                if (this.f21718A == c2313p) {
                    this.f21718A = null;
                    this.f21719B.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean f() {
        if (this.f21726r) {
            return false;
        }
        C0330p a7 = C0329o.b().a();
        if (a7 != null && !a7.f()) {
            return false;
        }
        int a8 = this.f21731w.a(this.f21729u, 203400000);
        return a8 == -1 || a8 == 0;
    }

    public final boolean g(C2188b c2188b, int i7) {
        return this.f21730v.w(this.f21729u, c2188b, i7);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        C2299b c2299b;
        C2299b c2299b2;
        C2299b c2299b3;
        C2299b c2299b4;
        C2299b c2299b5;
        int i7 = message.what;
        C2320x c2320x = null;
        switch (i7) {
            case 1:
                this.f21725q = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f21721D.removeMessages(12);
                for (C2299b c2299b6 : this.f21734z.keySet()) {
                    Handler handler = this.f21721D;
                    handler.sendMessageDelayed(handler.obtainMessage(12, c2299b6), this.f21725q);
                }
                return true;
            case 2:
                android.support.v4.media.a.a(message.obj);
                throw null;
            case 3:
                for (C2320x c2320x2 : this.f21734z.values()) {
                    c2320x2.C();
                    c2320x2.D();
                }
                return true;
            case 4:
            case 8:
            case N4.h.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                I i8 = (I) message.obj;
                C2320x c2320x3 = (C2320x) this.f21734z.get(i8.f21663c.d());
                if (c2320x3 == null) {
                    c2320x3 = i(i8.f21663c);
                }
                if (!c2320x3.L() || this.f21733y.get() == i8.f21662b) {
                    c2320x3.E(i8.f21661a);
                } else {
                    i8.f21661a.a(f21714F);
                    c2320x3.J();
                }
                return true;
            case 5:
                int i9 = message.arg1;
                C2188b c2188b = (C2188b) message.obj;
                Iterator it = this.f21734z.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        C2320x c2320x4 = (C2320x) it.next();
                        if (c2320x4.q() == i9) {
                            c2320x = c2320x4;
                        }
                    }
                }
                if (c2320x == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i9 + " while trying to fail enqueued calls.", new Exception());
                } else if (c2188b.a() == 13) {
                    c2320x.d(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f21730v.e(c2188b.a()) + ": " + c2188b.d()));
                } else {
                    c2299b = c2320x.f21759d;
                    c2320x.d(h(c2299b, c2188b));
                }
                return true;
            case 6:
                if (this.f21729u.getApplicationContext() instanceof Application) {
                    ComponentCallbacks2C2300c.c((Application) this.f21729u.getApplicationContext());
                    ComponentCallbacks2C2300c.b().a(new C2315s(this));
                    if (!ComponentCallbacks2C2300c.b().e(true)) {
                        this.f21725q = 300000L;
                    }
                }
                return true;
            case 7:
                i((y2.d) message.obj);
                return true;
            case 9:
                if (this.f21734z.containsKey(message.obj)) {
                    ((C2320x) this.f21734z.get(message.obj)).I();
                }
                return true;
            case 10:
                Iterator it2 = this.f21720C.iterator();
                while (it2.hasNext()) {
                    C2320x c2320x5 = (C2320x) this.f21734z.remove((C2299b) it2.next());
                    if (c2320x5 != null) {
                        c2320x5.J();
                    }
                }
                this.f21720C.clear();
                return true;
            case 11:
                if (this.f21734z.containsKey(message.obj)) {
                    ((C2320x) this.f21734z.get(message.obj)).K();
                }
                return true;
            case N4.h.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                if (this.f21734z.containsKey(message.obj)) {
                    ((C2320x) this.f21734z.get(message.obj)).a();
                }
                return true;
            case 14:
                android.support.v4.media.a.a(message.obj);
                throw null;
            case 15:
                C2322z c2322z = (C2322z) message.obj;
                Map map = this.f21734z;
                c2299b2 = c2322z.f21770a;
                if (map.containsKey(c2299b2)) {
                    Map map2 = this.f21734z;
                    c2299b3 = c2322z.f21770a;
                    C2320x.A((C2320x) map2.get(c2299b3), c2322z);
                }
                return true;
            case 16:
                C2322z c2322z2 = (C2322z) message.obj;
                Map map3 = this.f21734z;
                c2299b4 = c2322z2.f21770a;
                if (map3.containsKey(c2299b4)) {
                    Map map4 = this.f21734z;
                    c2299b5 = c2322z2.f21770a;
                    C2320x.B((C2320x) map4.get(c2299b5), c2322z2);
                }
                return true;
            case 17:
                k();
                return true;
            case 18:
                H h7 = (H) message.obj;
                if (h7.f21659c == 0) {
                    j().a(new A2.r(h7.f21658b, Arrays.asList(h7.f21657a)));
                } else {
                    A2.r rVar = this.f21727s;
                    if (rVar != null) {
                        List d7 = rVar.d();
                        if (rVar.a() != h7.f21658b || (d7 != null && d7.size() >= h7.f21660d)) {
                            this.f21721D.removeMessages(17);
                            k();
                        } else {
                            this.f21727s.f(h7.f21657a);
                        }
                    }
                    if (this.f21727s == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(h7.f21657a);
                        this.f21727s = new A2.r(h7.f21658b, arrayList);
                        Handler handler2 = this.f21721D;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), h7.f21659c);
                    }
                }
                return true;
            case 19:
                this.f21726r = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i7);
                return false;
        }
    }

    public final C2320x i(y2.d dVar) {
        C2299b d7 = dVar.d();
        C2320x c2320x = (C2320x) this.f21734z.get(d7);
        if (c2320x == null) {
            c2320x = new C2320x(this, dVar);
            this.f21734z.put(d7, c2320x);
        }
        if (c2320x.L()) {
            this.f21720C.add(d7);
        }
        c2320x.D();
        return c2320x;
    }

    public final InterfaceC0333t j() {
        if (this.f21728t == null) {
            this.f21728t = AbstractC0332s.a(this.f21729u);
        }
        return this.f21728t;
    }

    public final void k() {
        A2.r rVar = this.f21727s;
        if (rVar != null) {
            if (rVar.a() > 0 || f()) {
                j().a(rVar);
            }
            this.f21727s = null;
        }
    }

    public final void l(C0660k c0660k, int i7, y2.d dVar) {
        G b7;
        if (i7 == 0 || (b7 = G.b(this, i7, dVar.d())) == null) {
            return;
        }
        AbstractC0659j a7 = c0660k.a();
        final Handler handler = this.f21721D;
        handler.getClass();
        a7.c(new Executor() { // from class: z2.r
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, b7);
    }

    public final int m() {
        return this.f21732x.getAndIncrement();
    }

    public final C2320x w(C2299b c2299b) {
        return (C2320x) this.f21734z.get(c2299b);
    }
}
