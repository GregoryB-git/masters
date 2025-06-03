package v3;

import android.content.Context;
import android.os.Looper;
import z4.t;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Context f15717a;

    /* renamed from: b, reason: collision with root package name */
    public v5.z f15718b;

    /* renamed from: c, reason: collision with root package name */
    public n7.q<m1> f15719c;

    /* renamed from: d, reason: collision with root package name */
    public n7.q<t.a> f15720d;

    /* renamed from: e, reason: collision with root package name */
    public n7.q<r5.o> f15721e;
    public n7.q<n0> f;

    /* renamed from: g, reason: collision with root package name */
    public n7.q<t5.e> f15722g;

    /* renamed from: h, reason: collision with root package name */
    public n7.e<v5.c, w3.a> f15723h;

    /* renamed from: i, reason: collision with root package name */
    public Looper f15724i;

    /* renamed from: j, reason: collision with root package name */
    public x3.d f15725j;

    /* renamed from: k, reason: collision with root package name */
    public int f15726k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15727l;

    /* renamed from: m, reason: collision with root package name */
    public n1 f15728m;

    /* renamed from: n, reason: collision with root package name */
    public long f15729n;

    /* renamed from: o, reason: collision with root package name */
    public long f15730o;

    /* renamed from: p, reason: collision with root package name */
    public m0 f15731p;

    /* renamed from: q, reason: collision with root package name */
    public long f15732q;

    /* renamed from: r, reason: collision with root package name */
    public long f15733r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f15734s;
    public boolean t;

    public r(final Context context) {
        defpackage.d dVar = new defpackage.d(context, 0);
        n7.q<t.a> qVar = new n7.q() { // from class: v3.p
            @Override // n7.q
            public final Object get() {
                return new z4.j(context, new c4.f());
            }
        };
        int i10 = 1;
        defpackage.e eVar = new defpackage.e(context, i10);
        e0.d dVar2 = new e0.d(0);
        defpackage.d dVar3 = new defpackage.d(context, i10);
        q qVar2 = new q();
        context.getClass();
        this.f15717a = context;
        this.f15719c = dVar;
        this.f15720d = qVar;
        this.f15721e = eVar;
        this.f = dVar2;
        this.f15722g = dVar3;
        this.f15723h = qVar2;
        int i11 = v5.e0.f15881a;
        Looper myLooper = Looper.myLooper();
        this.f15724i = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.f15725j = x3.d.f16947o;
        this.f15726k = 1;
        this.f15727l = true;
        this.f15728m = n1.f15525c;
        this.f15729n = 5000L;
        this.f15730o = 15000L;
        this.f15731p = new i(0.97f, 1.03f, 1000L, 1.0E-7f, v5.e0.I(20L), v5.e0.I(500L), 0.999f);
        this.f15718b = v5.c.f15872a;
        this.f15732q = 500L;
        this.f15733r = 2000L;
        this.f15734s = true;
    }
}
