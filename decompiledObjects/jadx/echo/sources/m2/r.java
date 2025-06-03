package m2;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import c2.C0819b;
import g2.g;
import i2.C1347a;
import i2.C1349c;
import j2.AbstractC1370a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import n2.AbstractC1714k;
import n2.InterfaceC1706c;
import n2.InterfaceC1707d;
import o2.C1754a;
import o2.b;
import p2.InterfaceC1791a;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17713a;

    /* renamed from: b, reason: collision with root package name */
    public final g2.e f17714b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1707d f17715c;

    /* renamed from: d, reason: collision with root package name */
    public final x f17716d;

    /* renamed from: e, reason: collision with root package name */
    public final Executor f17717e;

    /* renamed from: f, reason: collision with root package name */
    public final o2.b f17718f;

    /* renamed from: g, reason: collision with root package name */
    public final InterfaceC1791a f17719g;

    /* renamed from: h, reason: collision with root package name */
    public final InterfaceC1791a f17720h;

    /* renamed from: i, reason: collision with root package name */
    public final InterfaceC1706c f17721i;

    public r(Context context, g2.e eVar, InterfaceC1707d interfaceC1707d, x xVar, Executor executor, o2.b bVar, InterfaceC1791a interfaceC1791a, InterfaceC1791a interfaceC1791a2, InterfaceC1706c interfaceC1706c) {
        this.f17713a = context;
        this.f17714b = eVar;
        this.f17715c = interfaceC1707d;
        this.f17716d = xVar;
        this.f17717e = executor;
        this.f17718f = bVar;
        this.f17719g = interfaceC1791a;
        this.f17720h = interfaceC1791a2;
        this.f17721i = interfaceC1706c;
    }

    public f2.i j(g2.m mVar) {
        o2.b bVar = this.f17718f;
        final InterfaceC1706c interfaceC1706c = this.f17721i;
        Objects.requireNonNull(interfaceC1706c);
        return mVar.a(f2.i.a().i(this.f17719g.a()).k(this.f17720h.a()).j("GDT_CLIENT_METRICS").h(new f2.h(C0819b.b("proto"), ((C1347a) bVar.a(new b.a() { // from class: m2.h
            @Override // o2.b.a
            public final Object e() {
                return InterfaceC1706c.this.b();
            }
        })).f())).d());
    }

    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f17713a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final /* synthetic */ Boolean l(f2.p pVar) {
        return Boolean.valueOf(this.f17715c.j(pVar));
    }

    public final /* synthetic */ Iterable m(f2.p pVar) {
        return this.f17715c.A(pVar);
    }

    public final /* synthetic */ Object n(Iterable iterable, f2.p pVar, long j7) {
        this.f17715c.y(iterable);
        this.f17715c.d(pVar, this.f17719g.a() + j7);
        return null;
    }

    public final /* synthetic */ Object o(Iterable iterable) {
        this.f17715c.g(iterable);
        return null;
    }

    public final /* synthetic */ Object p() {
        this.f17721i.e();
        return null;
    }

    public final /* synthetic */ Object q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f17721i.c(((Integer) r0.getValue()).intValue(), C1349c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    public final /* synthetic */ Object r(f2.p pVar, long j7) {
        this.f17715c.d(pVar, this.f17719g.a() + j7);
        return null;
    }

    public final /* synthetic */ Object s(f2.p pVar, int i7) {
        this.f17716d.a(pVar, i7 + 1);
        return null;
    }

    public final /* synthetic */ void t(final f2.p pVar, final int i7, Runnable runnable) {
        try {
            try {
                o2.b bVar = this.f17718f;
                final InterfaceC1707d interfaceC1707d = this.f17715c;
                Objects.requireNonNull(interfaceC1707d);
                bVar.a(new b.a() { // from class: m2.i
                    @Override // o2.b.a
                    public final Object e() {
                        return Integer.valueOf(InterfaceC1707d.this.f());
                    }
                });
                if (k()) {
                    u(pVar, i7);
                } else {
                    this.f17718f.a(new b.a() { // from class: m2.j
                        @Override // o2.b.a
                        public final Object e() {
                            Object s7;
                            s7 = r.this.s(pVar, i7);
                            return s7;
                        }
                    });
                }
            } catch (C1754a unused) {
                this.f17716d.a(pVar, i7 + 1);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public g2.g u(final f2.p pVar, int i7) {
        g2.g b7;
        g2.m a7 = this.f17714b.a(pVar.b());
        long j7 = 0;
        g2.g e7 = g2.g.e(0L);
        while (true) {
            final long j8 = j7;
            while (((Boolean) this.f17718f.a(new b.a() { // from class: m2.k
                @Override // o2.b.a
                public final Object e() {
                    Boolean l7;
                    l7 = r.this.l(pVar);
                    return l7;
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f17718f.a(new b.a() { // from class: m2.l
                    @Override // o2.b.a
                    public final Object e() {
                        Iterable m7;
                        m7 = r.this.m(pVar);
                        return m7;
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return e7;
                }
                if (a7 == null) {
                    AbstractC1370a.b("Uploader", "Unknown backend for %s, deleting event batch for it...", pVar);
                    b7 = g2.g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AbstractC1714k) it.next()).b());
                    }
                    if (pVar.e()) {
                        arrayList.add(j(a7));
                    }
                    b7 = a7.b(g2.f.a().b(arrayList).c(pVar.c()).a());
                }
                e7 = b7;
                if (e7.c() == g.a.TRANSIENT_ERROR) {
                    this.f17718f.a(new b.a() { // from class: m2.m
                        @Override // o2.b.a
                        public final Object e() {
                            Object n7;
                            n7 = r.this.n(iterable, pVar, j8);
                            return n7;
                        }
                    });
                    this.f17716d.b(pVar, i7 + 1, true);
                    return e7;
                }
                this.f17718f.a(new b.a() { // from class: m2.n
                    @Override // o2.b.a
                    public final Object e() {
                        Object o7;
                        o7 = r.this.o(iterable);
                        return o7;
                    }
                });
                if (e7.c() == g.a.OK) {
                    j7 = Math.max(j8, e7.b());
                    if (pVar.e()) {
                        this.f17718f.a(new b.a() { // from class: m2.o
                            @Override // o2.b.a
                            public final Object e() {
                                Object p7;
                                p7 = r.this.p();
                                return p7;
                            }
                        });
                    }
                } else if (e7.c() == g.a.INVALID_PAYLOAD) {
                    final HashMap hashMap = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String j9 = ((AbstractC1714k) it2.next()).b().j();
                        hashMap.put(j9, !hashMap.containsKey(j9) ? 1 : Integer.valueOf(((Integer) hashMap.get(j9)).intValue() + 1));
                    }
                    this.f17718f.a(new b.a() { // from class: m2.p
                        @Override // o2.b.a
                        public final Object e() {
                            Object q7;
                            q7 = r.this.q(hashMap);
                            return q7;
                        }
                    });
                }
            }
            this.f17718f.a(new b.a() { // from class: m2.q
                @Override // o2.b.a
                public final Object e() {
                    Object r7;
                    r7 = r.this.r(pVar, j8);
                    return r7;
                }
            });
            return e7;
        }
    }

    public void v(final f2.p pVar, final int i7, final Runnable runnable) {
        this.f17717e.execute(new Runnable() { // from class: m2.g
            @Override // java.lang.Runnable
            public final void run() {
                r.this.t(pVar, i7, runnable);
            }
        });
    }
}
