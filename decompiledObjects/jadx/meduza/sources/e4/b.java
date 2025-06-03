package e4;

import c4.i;
import c4.j;
import c4.t;
import p2.m0;
import v5.e0;
import v5.u;

/* loaded from: classes.dex */
public final class b implements c4.h {

    /* renamed from: c, reason: collision with root package name */
    public int f3894c;

    /* renamed from: e, reason: collision with root package name */
    public c f3896e;

    /* renamed from: h, reason: collision with root package name */
    public long f3898h;

    /* renamed from: i, reason: collision with root package name */
    public e f3899i;

    /* renamed from: m, reason: collision with root package name */
    public int f3903m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3904n;

    /* renamed from: a, reason: collision with root package name */
    public final u f3892a = new u(12);

    /* renamed from: b, reason: collision with root package name */
    public final C0069b f3893b = new C0069b();

    /* renamed from: d, reason: collision with root package name */
    public j f3895d = new m0();

    /* renamed from: g, reason: collision with root package name */
    public e[] f3897g = new e[0];

    /* renamed from: k, reason: collision with root package name */
    public long f3901k = -1;

    /* renamed from: l, reason: collision with root package name */
    public long f3902l = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f3900j = -1;
    public long f = -9223372036854775807L;

    public class a implements t {

        /* renamed from: a, reason: collision with root package name */
        public final long f3905a;

        public a(long j10) {
            this.f3905a = j10;
        }

        @Override // c4.t
        public final boolean e() {
            return true;
        }

        @Override // c4.t
        public final t.a g(long j10) {
            t.a b10 = b.this.f3897g[0].b(j10);
            int i10 = 1;
            while (true) {
                e[] eVarArr = b.this.f3897g;
                if (i10 >= eVarArr.length) {
                    return b10;
                }
                t.a b11 = eVarArr[i10].b(j10);
                if (b11.f2314a.f2320b < b10.f2314a.f2320b) {
                    b10 = b11;
                }
                i10++;
            }
        }

        @Override // c4.t
        public final long h() {
            return this.f3905a;
        }
    }

    /* renamed from: e4.b$b, reason: collision with other inner class name */
    public static class C0069b {

        /* renamed from: a, reason: collision with root package name */
        public int f3907a;

        /* renamed from: b, reason: collision with root package name */
        public int f3908b;

        /* renamed from: c, reason: collision with root package name */
        public int f3909c;
    }

    public final e a(int i10) {
        for (e eVar : this.f3897g) {
            if (eVar.f3919b == i10 || eVar.f3920c == i10) {
                return eVar;
            }
        }
        return null;
    }

    @Override // c4.h
    public final void b(j jVar) {
        this.f3894c = 0;
        this.f3895d = jVar;
        this.f3898h = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0032 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    @Override // c4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(c4.i r22, c4.s r23) {
        /*
            Method dump skipped, instructions count: 1072
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: e4.b.d(c4.i, c4.s):int");
    }

    @Override // c4.h
    public final void f(long j10, long j11) {
        this.f3898h = -1L;
        this.f3899i = null;
        for (e eVar : this.f3897g) {
            eVar.f3924h = eVar.f3926j == 0 ? 0 : eVar.f3928l[e0.f(eVar.f3927k, j10, true)];
        }
        if (j10 != 0) {
            this.f3894c = 6;
        } else if (this.f3897g.length == 0) {
            this.f3894c = 0;
        } else {
            this.f3894c = 3;
        }
    }

    @Override // c4.h
    public final boolean i(i iVar) {
        iVar.m(this.f3892a.f15974a, 0, 12);
        this.f3892a.G(0);
        if (this.f3892a.i() != 1179011410) {
            return false;
        }
        this.f3892a.H(4);
        return this.f3892a.i() == 541677121;
    }

    @Override // c4.h
    public final void release() {
    }
}
