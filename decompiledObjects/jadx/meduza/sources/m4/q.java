package m4;

import m4.d0;
import v3.i0;
import x3.y;

/* loaded from: classes.dex */
public final class q implements j {

    /* renamed from: a, reason: collision with root package name */
    public final v5.u f10142a;

    /* renamed from: b, reason: collision with root package name */
    public final y.a f10143b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10144c;

    /* renamed from: d, reason: collision with root package name */
    public c4.v f10145d;

    /* renamed from: e, reason: collision with root package name */
    public String f10146e;
    public int f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f10147g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f10148h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f10149i;

    /* renamed from: j, reason: collision with root package name */
    public long f10150j;

    /* renamed from: k, reason: collision with root package name */
    public int f10151k;

    /* renamed from: l, reason: collision with root package name */
    public long f10152l;

    public q(String str) {
        v5.u uVar = new v5.u(4);
        this.f10142a = uVar;
        uVar.f15974a[0] = -1;
        this.f10143b = new y.a();
        this.f10152l = -9223372036854775807L;
        this.f10144c = str;
    }

    @Override // m4.j
    public final void a(v5.u uVar) {
        x6.b.K(this.f10145d);
        while (true) {
            int i10 = uVar.f15976c;
            int i11 = uVar.f15975b;
            int i12 = i10 - i11;
            if (i12 <= 0) {
                return;
            }
            int i13 = this.f;
            if (i13 == 0) {
                byte[] bArr = uVar.f15974a;
                while (true) {
                    if (i11 >= i10) {
                        uVar.G(i10);
                        break;
                    }
                    byte b10 = bArr[i11];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.f10149i && (b10 & 224) == 224;
                    this.f10149i = z10;
                    if (z11) {
                        uVar.G(i11 + 1);
                        this.f10149i = false;
                        this.f10142a.f15974a[1] = bArr[i11];
                        this.f10147g = 2;
                        this.f = 1;
                        break;
                    }
                    i11++;
                }
            } else if (i13 == 1) {
                int min = Math.min(i12, 4 - this.f10147g);
                uVar.d(this.f10142a.f15974a, this.f10147g, min);
                int i14 = this.f10147g + min;
                this.f10147g = i14;
                if (i14 >= 4) {
                    this.f10142a.G(0);
                    if (this.f10143b.a(this.f10142a.f())) {
                        y.a aVar = this.f10143b;
                        this.f10151k = aVar.f17112c;
                        if (!this.f10148h) {
                            int i15 = aVar.f17113d;
                            this.f10150j = (aVar.f17115g * 1000000) / i15;
                            i0.a aVar2 = new i0.a();
                            aVar2.f15463a = this.f10146e;
                            aVar2.f15472k = aVar.f17111b;
                            aVar2.f15473l = 4096;
                            aVar2.f15484x = aVar.f17114e;
                            aVar2.f15485y = i15;
                            aVar2.f15465c = this.f10144c;
                            this.f10145d.d(new i0(aVar2));
                            this.f10148h = true;
                        }
                        this.f10142a.G(0);
                        this.f10145d.b(4, this.f10142a);
                        this.f = 2;
                    } else {
                        this.f10147g = 0;
                        this.f = 1;
                    }
                }
            } else {
                if (i13 != 2) {
                    throw new IllegalStateException();
                }
                int min2 = Math.min(i12, this.f10151k - this.f10147g);
                this.f10145d.b(min2, uVar);
                int i16 = this.f10147g + min2;
                this.f10147g = i16;
                int i17 = this.f10151k;
                if (i16 >= i17) {
                    long j10 = this.f10152l;
                    if (j10 != -9223372036854775807L) {
                        this.f10145d.c(j10, 1, i17, 0, null);
                        this.f10152l += this.f10150j;
                    }
                    this.f10147g = 0;
                    this.f = 0;
                }
            }
        }
    }

    @Override // m4.j
    public final void b() {
        this.f = 0;
        this.f10147g = 0;
        this.f10149i = false;
        this.f10152l = -9223372036854775807L;
    }

    @Override // m4.j
    public final void c() {
    }

    @Override // m4.j
    public final void d(int i10, long j10) {
        if (j10 != -9223372036854775807L) {
            this.f10152l = j10;
        }
    }

    @Override // m4.j
    public final void e(c4.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        this.f10146e = dVar.f9952e;
        dVar.b();
        this.f10145d = jVar.r(dVar.f9951d, 1);
    }
}
