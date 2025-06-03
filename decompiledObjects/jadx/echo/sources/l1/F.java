package l1;

import F0.AbstractC0362g;
import F0.InterfaceC0374t;
import F0.T;
import d0.C1194q;
import g0.AbstractC1297a;
import java.util.List;
import l1.K;

/* loaded from: classes.dex */
public final class F {

    /* renamed from: a, reason: collision with root package name */
    public final List f16767a;

    /* renamed from: b, reason: collision with root package name */
    public final T[] f16768b;

    public F(List list) {
        this.f16767a = list;
        this.f16768b = new T[list.size()];
    }

    public void a(long j7, g0.z zVar) {
        AbstractC0362g.a(j7, zVar, this.f16768b);
    }

    public void b(InterfaceC0374t interfaceC0374t, K.d dVar) {
        for (int i7 = 0; i7 < this.f16768b.length; i7++) {
            dVar.a();
            T a7 = interfaceC0374t.a(dVar.c(), 3);
            C1194q c1194q = (C1194q) this.f16767a.get(i7);
            String str = c1194q.f12726n;
            AbstractC1297a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String str2 = c1194q.f12713a;
            if (str2 == null) {
                str2 = dVar.b();
            }
            a7.d(new C1194q.b().a0(str2).o0(str).q0(c1194q.f12717e).e0(c1194q.f12716d).L(c1194q.f12707G).b0(c1194q.f12729q).K());
            this.f16768b[i7] = a7;
        }
    }
}
