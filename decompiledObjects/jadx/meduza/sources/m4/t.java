package m4;

import m4.d0;

/* loaded from: classes.dex */
public final class t implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final j f10161a;

    /* renamed from: b, reason: collision with root package name */
    public final v5.t f10162b = new v5.t(new byte[10], 10);

    /* renamed from: c, reason: collision with root package name */
    public int f10163c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f10164d;

    /* renamed from: e, reason: collision with root package name */
    public v5.c0 f10165e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10166g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10167h;

    /* renamed from: i, reason: collision with root package name */
    public int f10168i;

    /* renamed from: j, reason: collision with root package name */
    public int f10169j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f10170k;

    /* renamed from: l, reason: collision with root package name */
    public long f10171l;

    public t(j jVar) {
        this.f10161a = jVar;
    }

    @Override // m4.d0
    public final void a(int i10, v5.u uVar) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        x6.b.K(this.f10165e);
        int i14 = -1;
        int i15 = 0;
        int i16 = 2;
        if ((i10 & 1) != 0) {
            int i17 = this.f10163c;
            if (i17 != 0 && i17 != 1) {
                if (i17 == 2) {
                    v5.m.f("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i17 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f10169j != -1) {
                        StringBuilder l10 = defpackage.f.l("Unexpected start indicator: expected ");
                        l10.append(this.f10169j);
                        l10.append(" more bytes");
                        v5.m.f("PesReader", l10.toString());
                    }
                    this.f10161a.c();
                }
            }
            this.f10163c = 1;
            this.f10164d = 0;
        }
        while (true) {
            int i18 = uVar.f15976c;
            int i19 = uVar.f15975b;
            int i20 = i18 - i19;
            if (i20 <= 0) {
                return;
            }
            int i21 = this.f10163c;
            if (i21 != 0) {
                if (i21 != 1) {
                    if (i21 != i16) {
                        if (i21 != 3) {
                            throw new IllegalStateException();
                        }
                        int i22 = this.f10169j;
                        int i23 = i22 == i14 ? i15 : i20 - i22;
                        if (i23 > 0) {
                            i20 -= i23;
                            uVar.F(i19 + i20);
                        }
                        this.f10161a.a(uVar);
                        int i24 = this.f10169j;
                        if (i24 != i14) {
                            int i25 = i24 - i20;
                            this.f10169j = i25;
                            if (i25 == 0) {
                                this.f10161a.c();
                                this.f10163c = 1;
                                this.f10164d = i15;
                            }
                        }
                    } else if (d(Math.min(10, this.f10168i), uVar, this.f10162b.f15968a) && d(this.f10168i, uVar, null)) {
                        this.f10162b.k(i15);
                        this.f10171l = -9223372036854775807L;
                        if (this.f) {
                            this.f10162b.m(4);
                            this.f10162b.m(1);
                            this.f10162b.m(1);
                            long g10 = (this.f10162b.g(3) << 30) | (this.f10162b.g(15) << 15) | this.f10162b.g(15);
                            this.f10162b.m(1);
                            if (!this.f10167h && this.f10166g) {
                                this.f10162b.m(4);
                                this.f10162b.m(1);
                                this.f10162b.m(1);
                                this.f10162b.m(1);
                                this.f10165e.b((this.f10162b.g(3) << 30) | (this.f10162b.g(15) << 15) | this.f10162b.g(15));
                                this.f10167h = true;
                            }
                            this.f10171l = this.f10165e.b(g10);
                        }
                        i10 |= this.f10170k ? 4 : 0;
                        this.f10161a.d(i10, this.f10171l);
                        this.f10163c = 3;
                        this.f10164d = 0;
                        i14 = -1;
                        i15 = 0;
                        i16 = 2;
                    }
                } else if (d(9, uVar, this.f10162b.f15968a)) {
                    this.f10162b.k(0);
                    int g11 = this.f10162b.g(24);
                    if (g11 != 1) {
                        defpackage.f.p("Unexpected start code prefix: ", g11, "PesReader");
                        i11 = -1;
                        this.f10169j = -1;
                        z10 = false;
                        i12 = 2;
                    } else {
                        this.f10162b.m(8);
                        int g12 = this.f10162b.g(16);
                        this.f10162b.m(5);
                        this.f10170k = this.f10162b.f();
                        this.f10162b.m(2);
                        this.f = this.f10162b.f();
                        this.f10166g = this.f10162b.f();
                        this.f10162b.m(6);
                        int g13 = this.f10162b.g(8);
                        this.f10168i = g13;
                        if (g12 != 0) {
                            int i26 = ((g12 + 6) - 9) - g13;
                            this.f10169j = i26;
                            if (i26 < 0) {
                                StringBuilder l11 = defpackage.f.l("Found negative packet payload size: ");
                                l11.append(this.f10169j);
                                v5.m.f("PesReader", l11.toString());
                            } else {
                                i11 = -1;
                                z10 = true;
                                i12 = 2;
                            }
                        }
                        i11 = -1;
                        this.f10169j = -1;
                        z10 = true;
                        i12 = 2;
                    }
                    this.f10163c = z10 ? i12 : 0;
                    i13 = 0;
                    this.f10164d = 0;
                    i16 = i12;
                    i15 = i13;
                    i14 = i11;
                }
                i11 = -1;
                i13 = 0;
                i12 = 2;
                i16 = i12;
                i15 = i13;
                i14 = i11;
            } else {
                uVar.H(i20);
            }
        }
    }

    @Override // m4.d0
    public final void b() {
        this.f10163c = 0;
        this.f10164d = 0;
        this.f10167h = false;
        this.f10161a.b();
    }

    @Override // m4.d0
    public final void c(v5.c0 c0Var, c4.j jVar, d0.d dVar) {
        this.f10165e = c0Var;
        this.f10161a.e(jVar, dVar);
    }

    public final boolean d(int i10, v5.u uVar, byte[] bArr) {
        int min = Math.min(uVar.f15976c - uVar.f15975b, i10 - this.f10164d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            uVar.H(min);
        } else {
            uVar.d(bArr, this.f10164d, min);
        }
        int i11 = this.f10164d + min;
        this.f10164d = i11;
        return i11 == i10;
    }
}
