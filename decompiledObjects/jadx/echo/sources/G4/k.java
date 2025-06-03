package G4;

import N4.m;
import com.google.firebase.perf.metrics.Trace;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final Trace f2108a;

    public k(Trace trace) {
        this.f2108a = trace;
    }

    public m a() {
        m.b M6 = m.z0().N(this.f2108a.k()).L(this.f2108a.m().e()).M(this.f2108a.m().d(this.f2108a.j()));
        for (g gVar : this.f2108a.i().values()) {
            M6.J(gVar.b(), gVar.a());
        }
        List n7 = this.f2108a.n();
        if (!n7.isEmpty()) {
            Iterator it = n7.iterator();
            while (it.hasNext()) {
                M6.G(new k((Trace) it.next()).a());
            }
        }
        M6.I(this.f2108a.getAttributes());
        N4.k[] b7 = J4.a.b(this.f2108a.l());
        if (b7 != null) {
            M6.D(Arrays.asList(b7));
        }
        return (m) M6.v();
    }
}
