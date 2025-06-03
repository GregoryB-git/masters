package F0;

import F0.T;
import g0.AbstractC1297a;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f1809a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f1810b;

    /* renamed from: c, reason: collision with root package name */
    public int f1811c;

    /* renamed from: d, reason: collision with root package name */
    public long f1812d;

    /* renamed from: e, reason: collision with root package name */
    public int f1813e;

    /* renamed from: f, reason: collision with root package name */
    public int f1814f;

    /* renamed from: g, reason: collision with root package name */
    public int f1815g;

    public void a(T t7, T.a aVar) {
        if (this.f1811c > 0) {
            t7.b(this.f1812d, this.f1813e, this.f1814f, this.f1815g, aVar);
            this.f1811c = 0;
        }
    }

    public void b() {
        this.f1810b = false;
        this.f1811c = 0;
    }

    public void c(T t7, long j7, int i7, int i8, int i9, T.a aVar) {
        AbstractC1297a.g(this.f1815g <= i8 + i9, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.f1810b) {
            int i10 = this.f1811c;
            int i11 = i10 + 1;
            this.f1811c = i11;
            if (i10 == 0) {
                this.f1812d = j7;
                this.f1813e = i7;
                this.f1814f = 0;
            }
            this.f1814f += i8;
            this.f1815g = i9;
            if (i11 >= 16) {
                a(t7, aVar);
            }
        }
    }

    public void d(InterfaceC0373s interfaceC0373s) {
        if (this.f1810b) {
            return;
        }
        interfaceC0373s.n(this.f1809a, 0, 10);
        interfaceC0373s.h();
        if (AbstractC0357b.j(this.f1809a) == 0) {
            return;
        }
        this.f1810b = true;
    }
}
