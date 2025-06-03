package m4;

import c4.t;
import m4.d0;

/* loaded from: classes.dex */
public final class a implements c4.h {

    /* renamed from: a, reason: collision with root package name */
    public final b f9878a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public final v5.u f9879b = new v5.u(2786);

    /* renamed from: c, reason: collision with root package name */
    public boolean f9880c;

    @Override // c4.h
    public final void b(c4.j jVar) {
        this.f9878a.e(jVar, new d0.d(0, 1));
        jVar.m();
        jVar.t(new t.b(-9223372036854775807L));
    }

    @Override // c4.h
    public final int d(c4.i iVar, c4.s sVar) {
        int read = iVar.read(this.f9879b.f15974a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f9879b.G(0);
        this.f9879b.F(read);
        if (!this.f9880c) {
            this.f9878a.d(4, 0L);
            this.f9880c = true;
        }
        this.f9878a.a(this.f9879b);
        return 0;
    }

    @Override // c4.h
    public final void f(long j10, long j11) {
        this.f9880c = false;
        this.f9878a.b();
    }

    @Override // c4.h
    public final boolean i(c4.i iVar) {
        c4.e eVar;
        int a10;
        v5.u uVar = new v5.u(10);
        int i10 = 0;
        while (true) {
            eVar = (c4.e) iVar;
            eVar.c(uVar.f15974a, 0, 10, false);
            uVar.G(0);
            if (uVar.x() != 4801587) {
                break;
            }
            uVar.H(3);
            int u10 = uVar.u();
            i10 += u10 + 10;
            eVar.k(u10, false);
        }
        eVar.f = 0;
        eVar.k(i10, false);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            eVar.c(uVar.f15974a, 0, 6, false);
            uVar.G(0);
            if (uVar.A() != 2935) {
                eVar.f = 0;
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                eVar.k(i12, false);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                byte[] bArr = uVar.f15974a;
                if (bArr.length < 6) {
                    a10 = -1;
                } else {
                    if (((bArr[5] & 248) >> 3) > 10) {
                        a10 = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                    } else {
                        byte b10 = bArr[4];
                        a10 = x3.b.a((b10 & 192) >> 6, b10 & 63);
                    }
                }
                if (a10 == -1) {
                    return false;
                }
                eVar.k(a10 - 6, false);
            }
        }
    }

    @Override // c4.h
    public final void release() {
    }
}
