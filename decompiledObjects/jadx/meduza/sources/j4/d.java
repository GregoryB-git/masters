package j4;

import c4.h;
import c4.i;
import c4.j;
import c4.p;
import c4.q;
import c4.v;
import java.io.EOFException;
import p4.a;
import u4.l;
import v5.e0;
import v5.u;
import x3.y;

/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: u, reason: collision with root package name */
    public static final e0.d f8390u = new e0.d(14);

    /* renamed from: a, reason: collision with root package name */
    public final int f8391a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8392b;

    /* renamed from: c, reason: collision with root package name */
    public final u f8393c;

    /* renamed from: d, reason: collision with root package name */
    public final y.a f8394d;

    /* renamed from: e, reason: collision with root package name */
    public final p f8395e;
    public final q f;

    /* renamed from: g, reason: collision with root package name */
    public final c4.g f8396g;

    /* renamed from: h, reason: collision with root package name */
    public j f8397h;

    /* renamed from: i, reason: collision with root package name */
    public v f8398i;

    /* renamed from: j, reason: collision with root package name */
    public v f8399j;

    /* renamed from: k, reason: collision with root package name */
    public int f8400k;

    /* renamed from: l, reason: collision with root package name */
    public p4.a f8401l;

    /* renamed from: m, reason: collision with root package name */
    public long f8402m;

    /* renamed from: n, reason: collision with root package name */
    public long f8403n;

    /* renamed from: o, reason: collision with root package name */
    public long f8404o;

    /* renamed from: p, reason: collision with root package name */
    public int f8405p;

    /* renamed from: q, reason: collision with root package name */
    public e f8406q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8407r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8408s;
    public long t;

    public d() {
        this(0);
    }

    public d(int i10) {
        this(i10, -9223372036854775807L);
    }

    public d(int i10, long j10) {
        this.f8391a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f8392b = j10;
        this.f8393c = new u(10);
        this.f8394d = new y.a();
        this.f8395e = new p();
        this.f8402m = -9223372036854775807L;
        this.f = new q();
        c4.g gVar = new c4.g();
        this.f8396g = gVar;
        this.f8399j = gVar;
    }

    public static long c(p4.a aVar) {
        if (aVar == null) {
            return -9223372036854775807L;
        }
        int length = aVar.f12996a.length;
        for (int i10 = 0; i10 < length; i10++) {
            a.b bVar = aVar.f12996a[i10];
            if (bVar instanceof l) {
                l lVar = (l) bVar;
                if (lVar.f14963a.equals("TLEN")) {
                    return e0.I(Long.parseLong(lVar.f14974c.get(0)));
                }
            }
        }
        return -9223372036854775807L;
    }

    public final a a(i iVar, boolean z10) {
        iVar.m(this.f8393c.f15974a, 0, 4);
        this.f8393c.G(0);
        this.f8394d.a(this.f8393c.f());
        return new a(iVar.getLength(), iVar.getPosition(), this.f8394d, z10);
    }

    @Override // c4.h
    public final void b(j jVar) {
        this.f8397h = jVar;
        v r10 = jVar.r(0, 1);
        this.f8398i = r10;
        this.f8399j = r10;
        this.f8397h.m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005f, code lost:
    
        if (r8 != 1231971951) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0079 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0478  */
    @Override // c4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(c4.i r37, c4.s r38) {
        /*
            Method dump skipped, instructions count: 1186
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.d.d(c4.i, c4.s):int");
    }

    public final boolean e(i iVar) {
        e eVar = this.f8406q;
        if (eVar != null) {
            long c10 = eVar.c();
            if (c10 != -1 && iVar.d() > c10 - 4) {
                return true;
            }
        }
        try {
            return !iVar.c(this.f8393c.f15974a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // c4.h
    public final void f(long j10, long j11) {
        this.f8400k = 0;
        this.f8402m = -9223372036854775807L;
        this.f8403n = 0L;
        this.f8405p = 0;
        this.t = j11;
        e eVar = this.f8406q;
        if (!(eVar instanceof b) || ((b) eVar).b(j11)) {
            return;
        }
        this.f8408s = true;
        this.f8399j = this.f8396g;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(c4.i r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j4.d.g(c4.i, boolean):boolean");
    }

    @Override // c4.h
    public final boolean i(i iVar) {
        return g(iVar, true);
    }

    @Override // c4.h
    public final void release() {
    }
}
