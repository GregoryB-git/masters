package l1;

import F0.InterfaceC0374t;
import l1.K;

/* loaded from: classes.dex */
public final class E implements K {

    /* renamed from: a, reason: collision with root package name */
    public final D f16761a;

    /* renamed from: b, reason: collision with root package name */
    public final g0.z f16762b = new g0.z(32);

    /* renamed from: c, reason: collision with root package name */
    public int f16763c;

    /* renamed from: d, reason: collision with root package name */
    public int f16764d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16765e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16766f;

    public E(D d7) {
        this.f16761a = d7;
    }

    @Override // l1.K
    public void a(g0.z zVar, int i7) {
        boolean z7 = (i7 & 1) != 0;
        int f7 = z7 ? zVar.f() + zVar.G() : -1;
        if (this.f16766f) {
            if (!z7) {
                return;
            }
            this.f16766f = false;
            zVar.T(f7);
            this.f16764d = 0;
        }
        while (zVar.a() > 0) {
            int i8 = this.f16764d;
            if (i8 < 3) {
                if (i8 == 0) {
                    int G6 = zVar.G();
                    zVar.T(zVar.f() - 1);
                    if (G6 == 255) {
                        this.f16766f = true;
                        return;
                    }
                }
                int min = Math.min(zVar.a(), 3 - this.f16764d);
                zVar.l(this.f16762b.e(), this.f16764d, min);
                int i9 = this.f16764d + min;
                this.f16764d = i9;
                if (i9 == 3) {
                    this.f16762b.T(0);
                    this.f16762b.S(3);
                    this.f16762b.U(1);
                    int G7 = this.f16762b.G();
                    int G8 = this.f16762b.G();
                    this.f16765e = (G7 & 128) != 0;
                    this.f16763c = (((G7 & 15) << 8) | G8) + 3;
                    int b7 = this.f16762b.b();
                    int i10 = this.f16763c;
                    if (b7 < i10) {
                        this.f16762b.c(Math.min(4098, Math.max(i10, this.f16762b.b() * 2)));
                    }
                }
            } else {
                int min2 = Math.min(zVar.a(), this.f16763c - this.f16764d);
                zVar.l(this.f16762b.e(), this.f16764d, min2);
                int i11 = this.f16764d + min2;
                this.f16764d = i11;
                int i12 = this.f16763c;
                if (i11 != i12) {
                    continue;
                } else {
                    if (!this.f16765e) {
                        this.f16762b.S(i12);
                    } else {
                        if (g0.M.x(this.f16762b.e(), 0, this.f16763c, -1) != 0) {
                            this.f16766f = true;
                            return;
                        }
                        this.f16762b.S(this.f16763c - 4);
                    }
                    this.f16762b.T(0);
                    this.f16761a.a(this.f16762b);
                    this.f16764d = 0;
                }
            }
        }
    }

    @Override // l1.K
    public void b() {
        this.f16766f = true;
    }

    @Override // l1.K
    public void c(g0.E e7, InterfaceC0374t interfaceC0374t, K.d dVar) {
        this.f16761a.c(e7, interfaceC0374t, dVar);
        this.f16766f = true;
    }
}
