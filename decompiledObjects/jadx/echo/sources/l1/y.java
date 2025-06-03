package l1;

import F0.InterfaceC0374t;
import g0.AbstractC1297a;
import l1.K;

/* loaded from: classes.dex */
public final class y implements K {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1597m f17123a;

    /* renamed from: b, reason: collision with root package name */
    public final g0.y f17124b = new g0.y(new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    public int f17125c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f17126d;

    /* renamed from: e, reason: collision with root package name */
    public g0.E f17127e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17128f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17129g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f17130h;

    /* renamed from: i, reason: collision with root package name */
    public int f17131i;

    /* renamed from: j, reason: collision with root package name */
    public int f17132j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f17133k;

    /* renamed from: l, reason: collision with root package name */
    public long f17134l;

    public y(InterfaceC1597m interfaceC1597m) {
        this.f17123a = interfaceC1597m;
    }

    @Override // l1.K
    public void a(g0.z zVar, int i7) {
        AbstractC1297a.h(this.f17127e);
        if ((i7 & 1) != 0) {
            int i8 = this.f17125c;
            if (i8 != 0 && i8 != 1) {
                if (i8 == 2) {
                    g0.o.h("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i8 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f17132j != -1) {
                        g0.o.h("PesReader", "Unexpected start indicator: expected " + this.f17132j + " more bytes");
                    }
                    this.f17123a.c(zVar.g() == 0);
                }
            }
            h(1);
        }
        while (zVar.a() > 0) {
            int i9 = this.f17125c;
            if (i9 == 0) {
                zVar.U(zVar.a());
            } else if (i9 != 1) {
                if (i9 == 2) {
                    if (e(zVar, this.f17124b.f14341a, Math.min(10, this.f17131i)) && e(zVar, null, this.f17131i)) {
                        g();
                        i7 |= this.f17133k ? 4 : 0;
                        this.f17123a.d(this.f17134l, i7);
                        h(3);
                    }
                } else {
                    if (i9 != 3) {
                        throw new IllegalStateException();
                    }
                    int a7 = zVar.a();
                    int i10 = this.f17132j;
                    int i11 = i10 == -1 ? 0 : a7 - i10;
                    if (i11 > 0) {
                        a7 -= i11;
                        zVar.S(zVar.f() + a7);
                    }
                    this.f17123a.a(zVar);
                    int i12 = this.f17132j;
                    if (i12 != -1) {
                        int i13 = i12 - a7;
                        this.f17132j = i13;
                        if (i13 == 0) {
                            this.f17123a.c(false);
                            h(1);
                        }
                    }
                }
            } else if (e(zVar, this.f17124b.f14341a, 9)) {
                h(f() ? 2 : 0);
            }
        }
    }

    @Override // l1.K
    public void b() {
        this.f17125c = 0;
        this.f17126d = 0;
        this.f17130h = false;
        this.f17123a.b();
    }

    @Override // l1.K
    public void c(g0.E e7, InterfaceC0374t interfaceC0374t, K.d dVar) {
        this.f17127e = e7;
        this.f17123a.e(interfaceC0374t, dVar);
    }

    public boolean d(boolean z7) {
        return this.f17125c == 3 && this.f17132j == -1 && !(z7 && (this.f17123a instanceof n));
    }

    public final boolean e(g0.z zVar, byte[] bArr, int i7) {
        int min = Math.min(zVar.a(), i7 - this.f17126d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            zVar.U(min);
        } else {
            zVar.l(bArr, this.f17126d, min);
        }
        int i8 = this.f17126d + min;
        this.f17126d = i8;
        return i8 == i7;
    }

    public final boolean f() {
        this.f17124b.p(0);
        int h7 = this.f17124b.h(24);
        if (h7 != 1) {
            g0.o.h("PesReader", "Unexpected start code prefix: " + h7);
            this.f17132j = -1;
            return false;
        }
        this.f17124b.r(8);
        int h8 = this.f17124b.h(16);
        this.f17124b.r(5);
        this.f17133k = this.f17124b.g();
        this.f17124b.r(2);
        this.f17128f = this.f17124b.g();
        this.f17129g = this.f17124b.g();
        this.f17124b.r(6);
        int h9 = this.f17124b.h(8);
        this.f17131i = h9;
        if (h8 != 0) {
            int i7 = (h8 - 3) - h9;
            this.f17132j = i7;
            if (i7 < 0) {
                g0.o.h("PesReader", "Found negative packet payload size: " + this.f17132j);
            }
            return true;
        }
        this.f17132j = -1;
        return true;
    }

    public final void g() {
        this.f17124b.p(0);
        this.f17134l = -9223372036854775807L;
        if (this.f17128f) {
            this.f17124b.r(4);
            this.f17124b.r(1);
            this.f17124b.r(1);
            long h7 = (this.f17124b.h(3) << 30) | (this.f17124b.h(15) << 15) | this.f17124b.h(15);
            this.f17124b.r(1);
            if (!this.f17130h && this.f17129g) {
                this.f17124b.r(4);
                this.f17124b.r(1);
                this.f17124b.r(1);
                this.f17124b.r(1);
                this.f17127e.b((this.f17124b.h(3) << 30) | (this.f17124b.h(15) << 15) | this.f17124b.h(15));
                this.f17130h = true;
            }
            this.f17134l = this.f17127e.b(h7);
        }
    }

    public final void h(int i7) {
        this.f17125c = i7;
        this.f17126d = 0;
    }
}
