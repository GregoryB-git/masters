package m4;

import m4.d0;
import v3.i0;
import x3.c;

/* loaded from: classes.dex */
public final class d implements j {

    /* renamed from: a, reason: collision with root package name */
    public final v5.t f9931a;

    /* renamed from: b, reason: collision with root package name */
    public final v5.u f9932b;

    /* renamed from: c, reason: collision with root package name */
    public final String f9933c;

    /* renamed from: d, reason: collision with root package name */
    public String f9934d;

    /* renamed from: e, reason: collision with root package name */
    public c4.v f9935e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public int f9936g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f9937h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9938i;

    /* renamed from: j, reason: collision with root package name */
    public long f9939j;

    /* renamed from: k, reason: collision with root package name */
    public i0 f9940k;

    /* renamed from: l, reason: collision with root package name */
    public int f9941l;

    /* renamed from: m, reason: collision with root package name */
    public long f9942m;

    public d(String str) {
        v5.t tVar = new v5.t(new byte[16], 16);
        this.f9931a = tVar;
        this.f9932b = new v5.u(tVar.f15968a);
        this.f = 0;
        this.f9936g = 0;
        this.f9937h = false;
        this.f9938i = false;
        this.f9942m = -9223372036854775807L;
        this.f9933c = str;
    }

    @Override // m4.j
    public final void a(v5.u uVar) {
        boolean z10;
        int v10;
        x6.b.K(this.f9935e);
        while (true) {
            int i10 = uVar.f15976c - uVar.f15975b;
            if (i10 <= 0) {
                return;
            }
            int i11 = this.f;
            if (i11 == 0) {
                while (true) {
                    if (uVar.f15976c - uVar.f15975b <= 0) {
                        z10 = false;
                        break;
                    } else if (this.f9937h) {
                        v10 = uVar.v();
                        this.f9937h = v10 == 172;
                        if (v10 == 64 || v10 == 65) {
                            break;
                        }
                    } else {
                        this.f9937h = uVar.v() == 172;
                    }
                }
                this.f9938i = v10 == 65;
                z10 = true;
                if (z10) {
                    this.f = 1;
                    byte[] bArr = this.f9932b.f15974a;
                    bArr[0] = -84;
                    bArr[1] = (byte) (this.f9938i ? 65 : 64);
                    this.f9936g = 2;
                }
            } else if (i11 == 1) {
                byte[] bArr2 = this.f9932b.f15974a;
                int min = Math.min(i10, 16 - this.f9936g);
                uVar.d(bArr2, this.f9936g, min);
                int i12 = this.f9936g + min;
                this.f9936g = i12;
                if (i12 == 16) {
                    this.f9931a.k(0);
                    c.a b10 = x3.c.b(this.f9931a);
                    i0 i0Var = this.f9940k;
                    if (i0Var == null || 2 != i0Var.G || b10.f16930a != i0Var.H || !"audio/ac4".equals(i0Var.t)) {
                        i0.a aVar = new i0.a();
                        aVar.f15463a = this.f9934d;
                        aVar.f15472k = "audio/ac4";
                        aVar.f15484x = 2;
                        aVar.f15485y = b10.f16930a;
                        aVar.f15465c = this.f9933c;
                        i0 i0Var2 = new i0(aVar);
                        this.f9940k = i0Var2;
                        this.f9935e.d(i0Var2);
                    }
                    this.f9941l = b10.f16931b;
                    this.f9939j = (b10.f16932c * 1000000) / this.f9940k.H;
                    this.f9932b.G(0);
                    this.f9935e.b(16, this.f9932b);
                    this.f = 2;
                }
            } else if (i11 == 2) {
                int min2 = Math.min(i10, this.f9941l - this.f9936g);
                this.f9935e.b(min2, uVar);
                int i13 = this.f9936g + min2;
                this.f9936g = i13;
                int i14 = this.f9941l;
                if (i13 == i14) {
                    long j10 = this.f9942m;
                    if (j10 != -9223372036854775807L) {
                        this.f9935e.c(j10, 1, i14, 0, null);
                        this.f9942m += this.f9939j;
                    }
                    this.f = 0;
                }
            }
        }
    }

    @Override // m4.j
    public final void b() {
        this.f = 0;
        this.f9936g = 0;
        this.f9937h = false;
        this.f9938i = false;
        this.f9942m = -9223372036854775807L;
    }

    @Override // m4.j
    public final void c() {
    }

    @Override // m4.j
    public final void d(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f9942m = j10;
        }
    }

    @Override // m4.j
    public final void e(c4.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f9934d = dVar.f9952e;
        dVar.b();
        this.f9935e = jVar.r(dVar.f9951d, 1);
    }
}
