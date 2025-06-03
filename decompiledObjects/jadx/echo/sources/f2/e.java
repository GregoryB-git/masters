package f2;

import android.content.Context;
import f2.v;
import h2.C1332a;
import h2.C1334c;
import h2.InterfaceC1333b;
import l2.C1601d;
import n2.C1710g;
import n2.C1711h;
import n2.C1712i;
import n2.C1713j;
import n2.InterfaceC1707d;
import n2.N;
import n2.V;

/* loaded from: classes.dex */
public final class e extends v {

    /* renamed from: A, reason: collision with root package name */
    public U5.a f14199A;

    /* renamed from: o, reason: collision with root package name */
    public U5.a f14200o;

    /* renamed from: p, reason: collision with root package name */
    public U5.a f14201p;

    /* renamed from: q, reason: collision with root package name */
    public U5.a f14202q;

    /* renamed from: r, reason: collision with root package name */
    public U5.a f14203r;

    /* renamed from: s, reason: collision with root package name */
    public U5.a f14204s;

    /* renamed from: t, reason: collision with root package name */
    public U5.a f14205t;

    /* renamed from: u, reason: collision with root package name */
    public U5.a f14206u;

    /* renamed from: v, reason: collision with root package name */
    public U5.a f14207v;

    /* renamed from: w, reason: collision with root package name */
    public U5.a f14208w;

    /* renamed from: x, reason: collision with root package name */
    public U5.a f14209x;

    /* renamed from: y, reason: collision with root package name */
    public U5.a f14210y;

    /* renamed from: z, reason: collision with root package name */
    public U5.a f14211z;

    public static final class b implements v.a {

        /* renamed from: a, reason: collision with root package name */
        public Context f14212a;

        public b() {
        }

        @Override // f2.v.a
        public v a() {
            h2.d.a(this.f14212a, Context.class);
            return new e(this.f14212a);
        }

        @Override // f2.v.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public b b(Context context) {
            this.f14212a = (Context) h2.d.b(context);
            return this;
        }
    }

    public e(Context context) {
        e(context);
    }

    public static v.a c() {
        return new b();
    }

    @Override // f2.v
    public InterfaceC1707d a() {
        return (InterfaceC1707d) this.f14206u.get();
    }

    @Override // f2.v
    public u b() {
        return (u) this.f14199A.get();
    }

    public final void e(Context context) {
        this.f14200o = C1332a.a(k.a());
        InterfaceC1333b a7 = C1334c.a(context);
        this.f14201p = a7;
        g2.j a8 = g2.j.a(a7, p2.c.a(), p2.d.a());
        this.f14202q = a8;
        this.f14203r = C1332a.a(g2.l.a(this.f14201p, a8));
        this.f14204s = V.a(this.f14201p, C1710g.a(), C1712i.a());
        this.f14205t = C1332a.a(C1711h.a(this.f14201p));
        this.f14206u = C1332a.a(N.a(p2.c.a(), p2.d.a(), C1713j.a(), this.f14204s, this.f14205t));
        l2.g b7 = l2.g.b(p2.c.a());
        this.f14207v = b7;
        l2.i a9 = l2.i.a(this.f14201p, this.f14206u, b7, p2.d.a());
        this.f14208w = a9;
        U5.a aVar = this.f14200o;
        U5.a aVar2 = this.f14203r;
        U5.a aVar3 = this.f14206u;
        this.f14209x = C1601d.a(aVar, aVar2, a9, aVar3, aVar3);
        U5.a aVar4 = this.f14201p;
        U5.a aVar5 = this.f14203r;
        U5.a aVar6 = this.f14206u;
        this.f14210y = m2.s.a(aVar4, aVar5, aVar6, this.f14208w, this.f14200o, aVar6, p2.c.a(), p2.d.a(), this.f14206u);
        U5.a aVar7 = this.f14200o;
        U5.a aVar8 = this.f14206u;
        this.f14211z = m2.w.a(aVar7, aVar8, this.f14208w, aVar8);
        this.f14199A = C1332a.a(w.a(p2.c.a(), p2.d.a(), this.f14209x, this.f14210y, this.f14211z));
    }
}
