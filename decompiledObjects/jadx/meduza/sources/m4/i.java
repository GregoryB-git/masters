package m4;

import java.util.Collections;
import java.util.List;
import m4.d0;
import v3.i0;

/* loaded from: classes.dex */
public final class i implements j {

    /* renamed from: a, reason: collision with root package name */
    public final List<d0.a> f9998a;

    /* renamed from: b, reason: collision with root package name */
    public final c4.v[] f9999b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10000c;

    /* renamed from: d, reason: collision with root package name */
    public int f10001d;

    /* renamed from: e, reason: collision with root package name */
    public int f10002e;
    public long f = -9223372036854775807L;

    public i(List<d0.a> list) {
        this.f9998a = list;
        this.f9999b = new c4.v[list.size()];
    }

    @Override // m4.j
    public final void a(v5.u uVar) {
        boolean z10;
        boolean z11;
        if (this.f10000c) {
            if (this.f10001d == 2) {
                if (uVar.f15976c - uVar.f15975b == 0) {
                    z11 = false;
                } else {
                    if (uVar.v() != 32) {
                        this.f10000c = false;
                    }
                    this.f10001d--;
                    z11 = this.f10000c;
                }
                if (!z11) {
                    return;
                }
            }
            if (this.f10001d == 1) {
                if (uVar.f15976c - uVar.f15975b == 0) {
                    z10 = false;
                } else {
                    if (uVar.v() != 0) {
                        this.f10000c = false;
                    }
                    this.f10001d--;
                    z10 = this.f10000c;
                }
                if (!z10) {
                    return;
                }
            }
            int i10 = uVar.f15975b;
            int i11 = uVar.f15976c - i10;
            for (c4.v vVar : this.f9999b) {
                uVar.G(i10);
                vVar.b(i11, uVar);
            }
            this.f10002e += i11;
        }
    }

    @Override // m4.j
    public final void b() {
        this.f10000c = false;
        this.f = -9223372036854775807L;
    }

    @Override // m4.j
    public final void c() {
        if (this.f10000c) {
            if (this.f != -9223372036854775807L) {
                for (c4.v vVar : this.f9999b) {
                    vVar.c(this.f, 1, this.f10002e, 0, null);
                }
            }
            this.f10000c = false;
        }
    }

    @Override // m4.j
    public final void d(int i10, long j10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f10000c = true;
        if (j10 != -9223372036854775807L) {
            this.f = j10;
        }
        this.f10002e = 0;
        this.f10001d = 2;
    }

    @Override // m4.j
    public final void e(c4.j jVar, d0.d dVar) {
        for (int i10 = 0; i10 < this.f9999b.length; i10++) {
            d0.a aVar = this.f9998a.get(i10);
            dVar.a();
            dVar.b();
            c4.v r10 = jVar.r(dVar.f9951d, 3);
            i0.a aVar2 = new i0.a();
            dVar.b();
            aVar2.f15463a = dVar.f9952e;
            aVar2.f15472k = "application/dvbsubs";
            aVar2.f15474m = Collections.singletonList(aVar.f9944b);
            aVar2.f15465c = aVar.f9943a;
            r10.d(new i0(aVar2));
            this.f9999b[i10] = r10;
        }
    }
}
