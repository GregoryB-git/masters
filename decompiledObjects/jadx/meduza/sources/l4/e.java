package l4;

import java.io.EOFException;
import v3.a1;
import v5.u;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f9587a;

    /* renamed from: b, reason: collision with root package name */
    public long f9588b;

    /* renamed from: c, reason: collision with root package name */
    public int f9589c;

    /* renamed from: d, reason: collision with root package name */
    public int f9590d;

    /* renamed from: e, reason: collision with root package name */
    public int f9591e;
    public final int[] f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final u f9592g = new u(255);

    public final boolean a(c4.i iVar, boolean z10) {
        boolean z11;
        boolean z12;
        this.f9587a = 0;
        this.f9588b = 0L;
        this.f9589c = 0;
        this.f9590d = 0;
        this.f9591e = 0;
        this.f9592g.D(27);
        try {
            z11 = iVar.c(this.f9592g.f15974a, 0, 27, z10);
        } catch (EOFException e10) {
            if (!z10) {
                throw e10;
            }
            z11 = false;
        }
        if (!z11 || this.f9592g.w() != 1332176723) {
            return false;
        }
        if (this.f9592g.v() != 0) {
            if (z10) {
                return false;
            }
            throw a1.c("unsupported bit stream revision");
        }
        this.f9587a = this.f9592g.v();
        this.f9588b = this.f9592g.j();
        this.f9592g.l();
        this.f9592g.l();
        this.f9592g.l();
        int v10 = this.f9592g.v();
        this.f9589c = v10;
        this.f9590d = v10 + 27;
        this.f9592g.D(v10);
        try {
            z12 = iVar.c(this.f9592g.f15974a, 0, this.f9589c, z10);
        } catch (EOFException e11) {
            if (!z10) {
                throw e11;
            }
            z12 = false;
        }
        if (!z12) {
            return false;
        }
        for (int i10 = 0; i10 < this.f9589c; i10++) {
            this.f[i10] = this.f9592g.v();
            this.f9591e += this.f[i10];
        }
        return true;
    }

    public final boolean b(c4.i iVar, long j10) {
        boolean z10;
        x6.b.q(iVar.getPosition() == iVar.d());
        this.f9592g.D(4);
        while (true) {
            if (j10 != -1 && iVar.getPosition() + 4 >= j10) {
                break;
            }
            try {
                z10 = iVar.c(this.f9592g.f15974a, 0, 4, true);
            } catch (EOFException unused) {
                z10 = false;
            }
            if (!z10) {
                break;
            }
            this.f9592g.G(0);
            if (this.f9592g.w() == 1332176723) {
                iVar.i();
                return true;
            }
            iVar.j(1);
        }
        do {
            if (j10 != -1 && iVar.getPosition() >= j10) {
                break;
            }
        } while (iVar.n() != -1);
        return false;
    }
}
