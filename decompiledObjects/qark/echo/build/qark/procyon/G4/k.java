// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package G4;

import com.google.protobuf.r;
import java.util.List;
import java.util.Iterator;
import java.util.Arrays;
import J4.a;
import java.util.Map;
import N4.m;
import com.google.firebase.perf.metrics.Trace;

public class k
{
    public final Trace a;
    
    public k(final Trace a) {
        this.a = a;
    }
    
    public m a() {
        final m.b m = N4.m.z0().N(this.a.k()).L(this.a.m().e()).M(this.a.m().d(this.a.j()));
        for (final g g : this.a.i().values()) {
            m.J(g.b(), g.a());
        }
        final List n = this.a.n();
        if (!n.isEmpty()) {
            final Iterator<Trace> iterator2 = n.iterator();
            while (iterator2.hasNext()) {
                m.G(new k(iterator2.next()).a());
            }
        }
        m.I(this.a.getAttributes());
        final N4.k[] b = J4.a.b(this.a.l());
        if (b != null) {
            m.D(Arrays.asList(b));
        }
        return (m)((r.a)m).v();
    }
}
