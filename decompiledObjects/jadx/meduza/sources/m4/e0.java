package m4;

import java.util.List;
import m4.d0;
import v3.i0;

/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final List<i0> f9964a;

    /* renamed from: b, reason: collision with root package name */
    public final c4.v[] f9965b;

    public e0(List<i0> list) {
        this.f9964a = list;
        this.f9965b = new c4.v[list.size()];
    }

    public final void a(long j10, v5.u uVar) {
        if (uVar.f15976c - uVar.f15975b < 9) {
            return;
        }
        int f = uVar.f();
        int f10 = uVar.f();
        int v10 = uVar.v();
        if (f == 434 && f10 == 1195456820 && v10 == 3) {
            c4.b.b(j10, uVar, this.f9965b);
        }
    }

    public final void b(c4.j jVar, d0.d dVar) {
        for (int i10 = 0; i10 < this.f9965b.length; i10++) {
            dVar.a();
            dVar.b();
            c4.v r10 = jVar.r(dVar.f9951d, 3);
            i0 i0Var = this.f9964a.get(i10);
            String str = i0Var.t;
            x6.b.o("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            i0.a aVar = new i0.a();
            dVar.b();
            aVar.f15463a = dVar.f9952e;
            aVar.f15472k = str;
            aVar.f15466d = i0Var.f15450d;
            aVar.f15465c = i0Var.f15449c;
            aVar.C = i0Var.L;
            aVar.f15474m = i0Var.f15458v;
            r10.d(new i0(aVar));
            this.f9965b[i10] = r10;
        }
    }
}
