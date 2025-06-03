package B0;

import B0.e;
import X2.AbstractC0703v;
import X2.AbstractC0704w;
import android.content.Context;
import android.os.Handler;
import g0.AbstractC1297a;
import g0.InterfaceC1299c;
import g0.M;
import g0.t;
import i0.y;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class j implements e, y {

    /* renamed from: p, reason: collision with root package name */
    public static final AbstractC0703v f593p = AbstractC0703v.c0(4300000L, 3200000L, 2400000L, 1700000L, 860000L);

    /* renamed from: q, reason: collision with root package name */
    public static final AbstractC0703v f594q = AbstractC0703v.c0(1500000L, 980000L, 750000L, 520000L, 290000L);

    /* renamed from: r, reason: collision with root package name */
    public static final AbstractC0703v f595r = AbstractC0703v.c0(2000000L, 1300000L, 1000000L, 860000L, 610000L);

    /* renamed from: s, reason: collision with root package name */
    public static final AbstractC0703v f596s = AbstractC0703v.c0(2500000L, 1700000L, 1200000L, 970000L, 680000L);

    /* renamed from: t, reason: collision with root package name */
    public static final AbstractC0703v f597t = AbstractC0703v.c0(4700000L, 2800000L, 2100000L, 1700000L, 980000L);

    /* renamed from: u, reason: collision with root package name */
    public static final AbstractC0703v f598u = AbstractC0703v.c0(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);

    /* renamed from: v, reason: collision with root package name */
    public static j f599v;

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0704w f600a;

    /* renamed from: b, reason: collision with root package name */
    public final e.a.C0007a f601b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1299c f602c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f603d;

    /* renamed from: e, reason: collision with root package name */
    public final s f604e;

    /* renamed from: f, reason: collision with root package name */
    public int f605f;

    /* renamed from: g, reason: collision with root package name */
    public long f606g;

    /* renamed from: h, reason: collision with root package name */
    public long f607h;

    /* renamed from: i, reason: collision with root package name */
    public long f608i;

    /* renamed from: j, reason: collision with root package name */
    public long f609j;

    /* renamed from: k, reason: collision with root package name */
    public long f610k;

    /* renamed from: l, reason: collision with root package name */
    public long f611l;

    /* renamed from: m, reason: collision with root package name */
    public int f612m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f613n;

    /* renamed from: o, reason: collision with root package name */
    public int f614o;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Context f615a;

        /* renamed from: b, reason: collision with root package name */
        public Map f616b;

        /* renamed from: c, reason: collision with root package name */
        public int f617c;

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC1299c f618d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f619e;

        public b(Context context) {
            this.f615a = context == null ? null : context.getApplicationContext();
            this.f616b = b(M.R(context));
            this.f617c = 2000;
            this.f618d = InterfaceC1299c.f14278a;
            this.f619e = true;
        }

        public static Map b(String str) {
            int[] l7 = j.l(str);
            HashMap hashMap = new HashMap(8);
            hashMap.put(0, 1000000L);
            AbstractC0703v abstractC0703v = j.f593p;
            hashMap.put(2, (Long) abstractC0703v.get(l7[0]));
            hashMap.put(3, (Long) j.f594q.get(l7[1]));
            hashMap.put(4, (Long) j.f595r.get(l7[2]));
            hashMap.put(5, (Long) j.f596s.get(l7[3]));
            hashMap.put(10, (Long) j.f597t.get(l7[4]));
            hashMap.put(9, (Long) j.f598u.get(l7[5]));
            hashMap.put(7, (Long) abstractC0703v.get(l7[0]));
            return hashMap;
        }

        public j a() {
            return new j(this.f615a, this.f616b, this.f617c, this.f618d, this.f619e);
        }
    }

    public j(Context context, Map map, int i7, InterfaceC1299c interfaceC1299c, boolean z7) {
        this.f600a = AbstractC0704w.c(map);
        this.f601b = new e.a.C0007a();
        this.f604e = new s(i7);
        this.f602c = interfaceC1299c;
        this.f603d = z7;
        if (context == null) {
            this.f612m = 0;
            this.f610k = m(0);
            return;
        }
        t d7 = t.d(context);
        int f7 = d7.f();
        this.f612m = f7;
        this.f610k = m(f7);
        d7.i(new t.c() { // from class: B0.i
            @Override // g0.t.c
            public final void a(int i8) {
                j.this.q(i8);
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:1042:0x0cd7, code lost:
    
        if (r8.equals("AI") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int[] l(java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 8104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: B0.j.l(java.lang.String):int[]");
    }

    public static synchronized j n(Context context) {
        j jVar;
        synchronized (j.class) {
            try {
                if (f599v == null) {
                    f599v = new b(context).a();
                }
                jVar = f599v;
            } catch (Throwable th) {
                throw th;
            }
        }
        return jVar;
    }

    public static boolean o(i0.k kVar, boolean z7) {
        return z7 && !kVar.d(8);
    }

    @Override // B0.e
    public /* synthetic */ long b() {
        return c.a(this);
    }

    @Override // B0.e
    public void c(e.a aVar) {
        this.f601b.e(aVar);
    }

    @Override // B0.e
    public synchronized long d() {
        return this.f610k;
    }

    @Override // i0.y
    public synchronized void e(i0.g gVar, i0.k kVar, boolean z7, int i7) {
        if (o(kVar, z7)) {
            this.f607h += i7;
        }
    }

    @Override // i0.y
    public synchronized void g(i0.g gVar, i0.k kVar, boolean z7) {
        try {
            if (o(kVar, z7)) {
                if (this.f605f == 0) {
                    this.f606g = this.f602c.b();
                }
                this.f605f++;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // i0.y
    public synchronized void h(i0.g gVar, i0.k kVar, boolean z7) {
        try {
            if (o(kVar, z7)) {
                AbstractC1297a.f(this.f605f > 0);
                long b7 = this.f602c.b();
                int i7 = (int) (b7 - this.f606g);
                this.f608i += i7;
                long j7 = this.f609j;
                long j8 = this.f607h;
                this.f609j = j7 + j8;
                if (i7 > 0) {
                    this.f604e.c((int) Math.sqrt(j8), (j8 * 8000.0f) / i7);
                    if (this.f608i < 2000) {
                        if (this.f609j >= 524288) {
                        }
                        p(i7, this.f607h, this.f610k);
                        this.f606g = b7;
                        this.f607h = 0L;
                    }
                    this.f610k = (long) this.f604e.f(0.5f);
                    p(i7, this.f607h, this.f610k);
                    this.f606g = b7;
                    this.f607h = 0L;
                }
                this.f605f--;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // B0.e
    public void i(Handler handler, e.a aVar) {
        AbstractC1297a.e(handler);
        AbstractC1297a.e(aVar);
        this.f601b.b(handler, aVar);
    }

    public final long m(int i7) {
        Long l7 = (Long) this.f600a.get(Integer.valueOf(i7));
        if (l7 == null) {
            l7 = (Long) this.f600a.get(0);
        }
        if (l7 == null) {
            l7 = 1000000L;
        }
        return l7.longValue();
    }

    public final void p(int i7, long j7, long j8) {
        if (i7 == 0 && j7 == 0 && j8 == this.f611l) {
            return;
        }
        this.f611l = j8;
        this.f601b.c(i7, j7, j8);
    }

    public final synchronized void q(int i7) {
        int i8 = this.f612m;
        if (i8 == 0 || this.f603d) {
            if (this.f613n) {
                i7 = this.f614o;
            }
            if (i8 == i7) {
                return;
            }
            this.f612m = i7;
            if (i7 != 1 && i7 != 0 && i7 != 8) {
                this.f610k = m(i7);
                long b7 = this.f602c.b();
                p(this.f605f > 0 ? (int) (b7 - this.f606g) : 0, this.f607h, this.f610k);
                this.f606g = b7;
                this.f607h = 0L;
                this.f609j = 0L;
                this.f608i = 0L;
                this.f604e.i();
            }
        }
    }

    @Override // B0.e
    public y a() {
        return this;
    }

    @Override // i0.y
    public void f(i0.g gVar, i0.k kVar, boolean z7) {
    }
}
