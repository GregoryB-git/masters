package m4;

import m4.d0;

/* loaded from: classes.dex */
public final class y implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public final x f10197a;

    /* renamed from: b, reason: collision with root package name */
    public final v5.u f10198b = new v5.u(32);

    /* renamed from: c, reason: collision with root package name */
    public int f10199c;

    /* renamed from: d, reason: collision with root package name */
    public int f10200d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10201e;
    public boolean f;

    public y(x xVar) {
        this.f10197a = xVar;
    }

    @Override // m4.d0
    public final void a(int i10, v5.u uVar) {
        boolean z10 = (i10 & 1) != 0;
        int v10 = z10 ? uVar.f15975b + uVar.v() : -1;
        if (this.f) {
            if (!z10) {
                return;
            }
            this.f = false;
            uVar.G(v10);
            this.f10200d = 0;
        }
        while (true) {
            int i11 = uVar.f15976c;
            int i12 = uVar.f15975b;
            if (i11 - i12 <= 0) {
                return;
            }
            int i13 = this.f10200d;
            if (i13 < 3) {
                if (i13 == 0) {
                    int v11 = uVar.v();
                    uVar.G(uVar.f15975b - 1);
                    if (v11 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min = Math.min(uVar.f15976c - uVar.f15975b, 3 - this.f10200d);
                uVar.d(this.f10198b.f15974a, this.f10200d, min);
                int i14 = this.f10200d + min;
                this.f10200d = i14;
                if (i14 == 3) {
                    this.f10198b.G(0);
                    this.f10198b.F(3);
                    this.f10198b.H(1);
                    int v12 = this.f10198b.v();
                    int v13 = this.f10198b.v();
                    this.f10201e = (v12 & 128) != 0;
                    int i15 = (((v12 & 15) << 8) | v13) + 3;
                    this.f10199c = i15;
                    byte[] bArr = this.f10198b.f15974a;
                    if (bArr.length < i15) {
                        this.f10198b.a(Math.min(4098, Math.max(i15, bArr.length * 2)));
                    }
                }
            } else {
                int min2 = Math.min(i11 - i12, this.f10199c - i13);
                uVar.d(this.f10198b.f15974a, this.f10200d, min2);
                int i16 = this.f10200d + min2;
                this.f10200d = i16;
                int i17 = this.f10199c;
                if (i16 != i17) {
                    continue;
                } else {
                    if (this.f10201e) {
                        byte[] bArr2 = this.f10198b.f15974a;
                        int i18 = -1;
                        for (int i19 = 0; i19 < i17; i19++) {
                            i18 = v5.e0.f15893n[((i18 >>> 24) ^ (bArr2[i19] & 255)) & 255] ^ (i18 << 8);
                        }
                        int i20 = v5.e0.f15881a;
                        if (i18 != 0) {
                            this.f = true;
                            return;
                        }
                        this.f10198b.F(this.f10199c - 4);
                    } else {
                        this.f10198b.F(i17);
                    }
                    this.f10198b.G(0);
                    this.f10197a.a(this.f10198b);
                    this.f10200d = 0;
                }
            }
        }
    }

    @Override // m4.d0
    public final void b() {
        this.f = true;
    }

    @Override // m4.d0
    public final void c(v5.c0 c0Var, c4.j jVar, d0.d dVar) {
        this.f10197a.c(c0Var, jVar, dVar);
        this.f = true;
    }
}
