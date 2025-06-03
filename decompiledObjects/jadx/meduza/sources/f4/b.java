package f4;

import c4.e;
import c4.h;
import c4.i;
import c4.j;
import c4.l;
import c4.o;
import c4.q;
import c4.v;
import u4.g;
import v5.u;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: e, reason: collision with root package name */
    public j f5338e;
    public v f;

    /* renamed from: h, reason: collision with root package name */
    public p4.a f5340h;

    /* renamed from: i, reason: collision with root package name */
    public o f5341i;

    /* renamed from: j, reason: collision with root package name */
    public int f5342j;

    /* renamed from: k, reason: collision with root package name */
    public int f5343k;

    /* renamed from: l, reason: collision with root package name */
    public a f5344l;

    /* renamed from: m, reason: collision with root package name */
    public int f5345m;

    /* renamed from: n, reason: collision with root package name */
    public long f5346n;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f5334a = new byte[42];

    /* renamed from: b, reason: collision with root package name */
    public final u f5335b = new u(new byte[32768], 0);

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5336c = false;

    /* renamed from: d, reason: collision with root package name */
    public final l.a f5337d = new l.a();

    /* renamed from: g, reason: collision with root package name */
    public int f5339g = 0;

    @Override // c4.h
    public final void b(j jVar) {
        this.f5338e = jVar;
        this.f = jVar.r(0, 1);
        jVar.m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0132, code lost:
    
        r1.G(r3);
        r3 = r25.f5337d.f2289a;
     */
    @Override // c4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(c4.i r26, c4.s r27) {
        /*
            Method dump skipped, instructions count: 1004
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f4.b.d(c4.i, c4.s):int");
    }

    @Override // c4.h
    public final void f(long j10, long j11) {
        if (j10 == 0) {
            this.f5339g = 0;
        } else {
            a aVar = this.f5344l;
            if (aVar != null) {
                aVar.c(j11);
            }
        }
        this.f5346n = j11 != 0 ? -1L : 0L;
        this.f5345m = 0;
        this.f5335b.D(0);
    }

    @Override // c4.h
    public final boolean i(i iVar) {
        p4.a a10 = new q().a(iVar, g.f14958c);
        if (a10 != null) {
            int length = a10.f12996a.length;
        }
        u uVar = new u(4);
        ((e) iVar).c(uVar.f15974a, 0, 4, false);
        return uVar.w() == 1716281667;
    }

    @Override // c4.h
    public final void release() {
    }
}
