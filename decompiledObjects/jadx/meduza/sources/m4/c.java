package m4;

import c4.t;
import m4.d0;

/* loaded from: classes.dex */
public final class c implements c4.h {

    /* renamed from: a, reason: collision with root package name */
    public final d f9904a = new d(null);

    /* renamed from: b, reason: collision with root package name */
    public final v5.u f9905b = new v5.u(16384);

    /* renamed from: c, reason: collision with root package name */
    public boolean f9906c;

    @Override // c4.h
    public final void b(c4.j jVar) {
        this.f9904a.e(jVar, new d0.d(0, 1));
        jVar.m();
        jVar.t(new t.b(-9223372036854775807L));
    }

    @Override // c4.h
    public final int d(c4.i iVar, c4.s sVar) {
        int read = iVar.read(this.f9905b.f15974a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f9905b.G(0);
        this.f9905b.F(read);
        if (!this.f9906c) {
            this.f9904a.d(4, 0L);
            this.f9906c = true;
        }
        this.f9904a.a(this.f9905b);
        return 0;
    }

    @Override // c4.h
    public final void f(long j10, long j11) {
        this.f9906c = false;
        this.f9904a.b();
    }

    @Override // c4.h
    public final boolean i(c4.i iVar) {
        c4.e eVar;
        int i10;
        v5.u uVar = new v5.u(10);
        int i11 = 0;
        while (true) {
            eVar = (c4.e) iVar;
            eVar.c(uVar.f15974a, 0, 10, false);
            uVar.G(0);
            if (uVar.x() != 4801587) {
                break;
            }
            uVar.H(3);
            int u10 = uVar.u();
            i11 += u10 + 10;
            eVar.k(u10, false);
        }
        eVar.f = 0;
        eVar.k(i11, false);
        int i12 = 0;
        int i13 = i11;
        while (true) {
            int i14 = 7;
            eVar.c(uVar.f15974a, 0, 7, false);
            uVar.G(0);
            int A = uVar.A();
            if (A == 44096 || A == 44097) {
                i12++;
                if (i12 >= 4) {
                    return true;
                }
                byte[] bArr = uVar.f15974a;
                if (bArr.length < 7) {
                    i10 = -1;
                } else {
                    int i15 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i15 == 65535) {
                        i15 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i14 = 4;
                    }
                    if (A == 44097) {
                        i14 += 2;
                    }
                    i10 = i15 + i14;
                }
                if (i10 == -1) {
                    return false;
                }
                eVar.k(i10 - 7, false);
            } else {
                eVar.f = 0;
                i13++;
                if (i13 - i11 >= 8192) {
                    return false;
                }
                eVar.k(i13, false);
                i12 = 0;
            }
        }
    }

    @Override // c4.h
    public final void release() {
    }
}
