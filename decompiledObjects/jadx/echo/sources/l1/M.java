package l1;

import F0.AbstractC0362g;
import F0.InterfaceC0374t;
import F0.T;
import d0.C1194q;
import g0.AbstractC1297a;
import java.util.List;
import l1.K;

/* loaded from: classes.dex */
public final class M {

    /* renamed from: a, reason: collision with root package name */
    public final List f16824a;

    /* renamed from: b, reason: collision with root package name */
    public final T[] f16825b;

    public M(List list) {
        this.f16824a = list;
        this.f16825b = new T[list.size()];
    }

    public void a(long j7, g0.z zVar) {
        if (zVar.a() < 9) {
            return;
        }
        int p7 = zVar.p();
        int p8 = zVar.p();
        int G6 = zVar.G();
        if (p7 == 434 && p8 == 1195456820 && G6 == 3) {
            AbstractC0362g.b(j7, zVar, this.f16825b);
        }
    }

    public void b(InterfaceC0374t interfaceC0374t, K.d dVar) {
        for (int i7 = 0; i7 < this.f16825b.length; i7++) {
            dVar.a();
            T a7 = interfaceC0374t.a(dVar.c(), 3);
            C1194q c1194q = (C1194q) this.f16824a.get(i7);
            String str = c1194q.f12726n;
            AbstractC1297a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            a7.d(new C1194q.b().a0(dVar.b()).o0(str).q0(c1194q.f12717e).e0(c1194q.f12716d).L(c1194q.f12707G).b0(c1194q.f12729q).K());
            this.f16825b[i7] = a7;
        }
    }
}
