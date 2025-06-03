package l4;

import c4.j;
import c4.y;
import v3.a1;
import v5.e0;
import v5.u;

/* loaded from: classes.dex */
public final class c implements c4.h {

    /* renamed from: a, reason: collision with root package name */
    public j f9579a;

    /* renamed from: b, reason: collision with root package name */
    public h f9580b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9581c;

    public final boolean a(c4.i iVar) {
        boolean z10;
        h gVar;
        e eVar = new e();
        if (eVar.a(iVar, true) && (eVar.f9587a & 2) == 2) {
            int min = Math.min(eVar.f9591e, 8);
            u uVar = new u(min);
            iVar.m(uVar.f15974a, 0, min);
            uVar.G(0);
            if (uVar.f15976c - uVar.f15975b >= 5 && uVar.v() == 127 && uVar.w() == 1179402563) {
                gVar = new b();
            } else {
                uVar.G(0);
                try {
                    z10 = y.c(1, uVar, true);
                } catch (a1 unused) {
                    z10 = false;
                }
                if (z10) {
                    gVar = new i();
                } else {
                    uVar.G(0);
                    if (g.e(uVar, g.f9593o)) {
                        gVar = new g();
                    }
                }
            }
            this.f9580b = gVar;
            return true;
        }
        return false;
    }

    @Override // c4.h
    public final void b(j jVar) {
        this.f9579a = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @Override // c4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int d(c4.i r20, c4.s r21) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l4.c.d(c4.i, c4.s):int");
    }

    @Override // c4.h
    public final void f(long j10, long j11) {
        h hVar = this.f9580b;
        if (hVar != null) {
            d dVar = hVar.f9596a;
            e eVar = dVar.f9582a;
            eVar.f9587a = 0;
            eVar.f9588b = 0L;
            eVar.f9589c = 0;
            eVar.f9590d = 0;
            eVar.f9591e = 0;
            dVar.f9583b.D(0);
            dVar.f9584c = -1;
            dVar.f9586e = false;
            if (j10 == 0) {
                hVar.d(!hVar.f9606l);
                return;
            }
            if (hVar.f9602h != 0) {
                long j12 = (hVar.f9603i * j11) / 1000000;
                hVar.f9600e = j12;
                f fVar = hVar.f9599d;
                int i10 = e0.f15881a;
                fVar.c(j12);
                hVar.f9602h = 2;
            }
        }
    }

    @Override // c4.h
    public final boolean i(c4.i iVar) {
        try {
            return a(iVar);
        } catch (a1 unused) {
            return false;
        }
    }

    @Override // c4.h
    public final void release() {
    }
}
