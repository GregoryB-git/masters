package m4;

import c4.t;
import java.io.EOFException;
import m4.d0;
import v3.a1;

/* loaded from: classes.dex */
public final class e implements c4.h {

    /* renamed from: a, reason: collision with root package name */
    public final int f9953a;

    /* renamed from: b, reason: collision with root package name */
    public final f f9954b;

    /* renamed from: c, reason: collision with root package name */
    public final v5.u f9955c;

    /* renamed from: d, reason: collision with root package name */
    public final v5.u f9956d;

    /* renamed from: e, reason: collision with root package name */
    public final v5.t f9957e;
    public c4.j f;

    /* renamed from: g, reason: collision with root package name */
    public long f9958g;

    /* renamed from: h, reason: collision with root package name */
    public long f9959h;

    /* renamed from: i, reason: collision with root package name */
    public int f9960i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9961j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f9962k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f9963l;

    public e(int i10) {
        this.f9953a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f9954b = new f(null, true);
        this.f9955c = new v5.u(2048);
        this.f9960i = -1;
        this.f9959h = -1L;
        v5.u uVar = new v5.u(10);
        this.f9956d = uVar;
        byte[] bArr = uVar.f15974a;
        this.f9957e = new v5.t(bArr, bArr.length);
    }

    public final int a(c4.i iVar) {
        int i10 = 0;
        while (true) {
            iVar.m(this.f9956d.f15974a, 0, 10);
            this.f9956d.G(0);
            if (this.f9956d.x() != 4801587) {
                break;
            }
            this.f9956d.H(3);
            int u10 = this.f9956d.u();
            i10 += u10 + 10;
            iVar.e(u10);
        }
        iVar.i();
        iVar.e(i10);
        if (this.f9959h == -1) {
            this.f9959h = i10;
        }
        return i10;
    }

    @Override // c4.h
    public final void b(c4.j jVar) {
        this.f = jVar;
        this.f9954b.e(jVar, new d0.d(0, 1));
        jVar.m();
    }

    @Override // c4.h
    public final int d(c4.i iVar, c4.s sVar) {
        x6.b.K(this.f);
        long length = iVar.getLength();
        int i10 = this.f9953a;
        int i11 = 4;
        if ((((i10 & 2) == 0 && ((i10 & 1) == 0 || length == -1)) ? false : true) && !this.f9961j) {
            this.f9960i = -1;
            iVar.i();
            long j10 = 0;
            if (iVar.getPosition() == 0) {
                a(iVar);
            }
            int i12 = 0;
            while (true) {
                try {
                    if (!iVar.c(this.f9956d.f15974a, 0, 2, true)) {
                        break;
                    }
                    this.f9956d.G(0);
                    if (!((this.f9956d.A() & 65526) == 65520)) {
                        i12 = 0;
                        break;
                    }
                    if (!iVar.c(this.f9956d.f15974a, 0, i11, true)) {
                        break;
                    }
                    this.f9957e.k(14);
                    int g10 = this.f9957e.g(13);
                    if (g10 <= 6) {
                        this.f9961j = true;
                        throw a1.a("Malformed ADTS stream", null);
                    }
                    j10 += g10;
                    i12++;
                    if (i12 != 1000 && iVar.k(g10 - 6, true)) {
                        i11 = 4;
                    }
                } catch (EOFException unused) {
                }
            }
            iVar.i();
            this.f9960i = i12 > 0 ? (int) (j10 / i12) : -1;
            this.f9961j = true;
        }
        int read = iVar.read(this.f9955c.f15974a, 0, 2048);
        boolean z10 = read == -1;
        if (!this.f9963l) {
            int i13 = this.f9953a;
            boolean z11 = (i13 & 1) != 0 && this.f9960i > 0;
            if (!z11 || this.f9954b.f9982q != -9223372036854775807L || z10) {
                if (z11) {
                    long j11 = this.f9954b.f9982q;
                    if (j11 != -9223372036854775807L) {
                        c4.j jVar = this.f;
                        boolean z12 = (2 & i13) != 0;
                        int i14 = this.f9960i;
                        jVar.t(new c4.d((int) (((i14 * 8) * 1000000) / j11), i14, length, this.f9959h, z12));
                        this.f9963l = true;
                    }
                }
                this.f.t(new t.b(-9223372036854775807L));
                this.f9963l = true;
            }
        }
        if (z10) {
            return -1;
        }
        this.f9955c.G(0);
        this.f9955c.F(read);
        if (!this.f9962k) {
            this.f9954b.d(4, this.f9958g);
            this.f9962k = true;
        }
        this.f9954b.a(this.f9955c);
        return 0;
    }

    @Override // c4.h
    public final void f(long j10, long j11) {
        this.f9962k = false;
        this.f9954b.b();
        this.f9958g = j11;
    }

    @Override // c4.h
    public final boolean i(c4.i iVar) {
        int a10 = a(iVar);
        int i10 = a10;
        int i11 = 0;
        int i12 = 0;
        do {
            c4.e eVar = (c4.e) iVar;
            eVar.c(this.f9956d.f15974a, 0, 2, false);
            this.f9956d.G(0);
            if ((this.f9956d.A() & 65526) == 65520) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                eVar.c(this.f9956d.f15974a, 0, 4, false);
                this.f9957e.k(14);
                int g10 = this.f9957e.g(13);
                if (g10 > 6) {
                    eVar.k(g10 - 6, false);
                    i12 += g10;
                }
            }
            i10++;
            eVar.f = 0;
            eVar.k(i10, false);
            i11 = 0;
            i12 = 0;
        } while (i10 - a10 < 8192);
        return false;
    }

    @Override // c4.h
    public final void release() {
    }
}
