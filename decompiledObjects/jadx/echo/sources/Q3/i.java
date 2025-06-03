package Q3;

import V3.A;
import V3.C0668g;
import java.util.HashMap;
import java.util.Map;
import r4.InterfaceC1921a;
import s3.C1947e;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final Map f4375a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final C1947e f4376b;

    /* renamed from: c, reason: collision with root package name */
    public final A f4377c;

    /* renamed from: d, reason: collision with root package name */
    public final A f4378d;

    public i(C1947e c1947e, InterfaceC1921a interfaceC1921a, InterfaceC1921a interfaceC1921a2) {
        this.f4376b = c1947e;
        this.f4377c = new R3.g(interfaceC1921a);
        this.f4378d = new R3.d(interfaceC1921a2);
    }

    public synchronized h a(V3.p pVar) {
        h hVar;
        try {
            hVar = (h) this.f4375a.get(pVar);
            if (hVar == null) {
                C0668g c0668g = new C0668g();
                if (!this.f4376b.y()) {
                    c0668g.O(this.f4376b.q());
                }
                c0668g.K(this.f4376b);
                c0668g.J(this.f4377c);
                c0668g.I(this.f4378d);
                h hVar2 = new h(this.f4376b, pVar, c0668g);
                this.f4375a.put(pVar, hVar2);
                hVar = hVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return hVar;
    }
}
