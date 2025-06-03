package m4;

import m4.d0;
import v3.i0;

/* loaded from: classes.dex */
public final class o implements j {

    /* renamed from: b, reason: collision with root package name */
    public c4.v f10119b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10120c;

    /* renamed from: e, reason: collision with root package name */
    public int f10122e;
    public int f;

    /* renamed from: a, reason: collision with root package name */
    public final v5.u f10118a = new v5.u(10);

    /* renamed from: d, reason: collision with root package name */
    public long f10121d = -9223372036854775807L;

    @Override // m4.j
    public final void a(v5.u uVar) {
        x6.b.K(this.f10119b);
        if (this.f10120c) {
            int i10 = uVar.f15976c - uVar.f15975b;
            int i11 = this.f;
            if (i11 < 10) {
                int min = Math.min(i10, 10 - i11);
                System.arraycopy(uVar.f15974a, uVar.f15975b, this.f10118a.f15974a, this.f, min);
                if (this.f + min == 10) {
                    this.f10118a.G(0);
                    if (73 != this.f10118a.v() || 68 != this.f10118a.v() || 51 != this.f10118a.v()) {
                        v5.m.f("Id3Reader", "Discarding invalid ID3 tag");
                        this.f10120c = false;
                        return;
                    } else {
                        this.f10118a.H(3);
                        this.f10122e = this.f10118a.u() + 10;
                    }
                }
            }
            int min2 = Math.min(i10, this.f10122e - this.f);
            this.f10119b.b(min2, uVar);
            this.f += min2;
        }
    }

    @Override // m4.j
    public final void b() {
        this.f10120c = false;
        this.f10121d = -9223372036854775807L;
    }

    @Override // m4.j
    public final void c() {
        int i10;
        x6.b.K(this.f10119b);
        if (this.f10120c && (i10 = this.f10122e) != 0 && this.f == i10) {
            long j10 = this.f10121d;
            if (j10 != -9223372036854775807L) {
                this.f10119b.c(j10, 1, i10, 0, null);
            }
            this.f10120c = false;
        }
    }

    @Override // m4.j
    public final void d(int i10, long j10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f10120c = true;
        if (j10 != -9223372036854775807L) {
            this.f10121d = j10;
        }
        this.f10122e = 0;
        this.f = 0;
    }

    @Override // m4.j
    public final void e(c4.j jVar, d0.d dVar) {
        dVar.a();
        dVar.b();
        c4.v r10 = jVar.r(dVar.f9951d, 5);
        this.f10119b = r10;
        i0.a aVar = new i0.a();
        dVar.b();
        aVar.f15463a = dVar.f9952e;
        aVar.f15472k = "application/id3";
        r10.d(new i0(aVar));
    }
}
