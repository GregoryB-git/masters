package m4;

import java.util.List;
import m4.d0;
import v3.i0;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final List<i0> f10202a;

    /* renamed from: b, reason: collision with root package name */
    public final c4.v[] f10203b;

    public z(List<i0> list) {
        this.f10202a = list;
        this.f10203b = new c4.v[list.size()];
    }

    public final void a(c4.j jVar, d0.d dVar) {
        for (int i10 = 0; i10 < this.f10203b.length; i10++) {
            dVar.a();
            dVar.b();
            c4.v r10 = jVar.r(dVar.f9951d, 3);
            i0 i0Var = this.f10202a.get(i10);
            String str = i0Var.t;
            x6.b.o("Invalid closed caption mime type provided: " + str, "application/cea-608".equals(str) || "application/cea-708".equals(str));
            String str2 = i0Var.f15447a;
            if (str2 == null) {
                dVar.b();
                str2 = dVar.f9952e;
            }
            i0.a aVar = new i0.a();
            aVar.f15463a = str2;
            aVar.f15472k = str;
            aVar.f15466d = i0Var.f15450d;
            aVar.f15465c = i0Var.f15449c;
            aVar.C = i0Var.L;
            aVar.f15474m = i0Var.f15458v;
            r10.d(new i0(aVar));
            this.f10203b[i10] = r10;
        }
    }
}
