/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 */
package G4;

import G4.g;
import J4.a;
import M4.l;
import N4.m;
import com.google.firebase.perf.metrics.Trace;
import com.google.protobuf.r;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class k {
    public final Trace a;

    public k(Trace trace) {
        this.a = trace;
    }

    public m a() {
        m.b b8 = m.z0().N(this.a.k()).L(this.a.m().e()).M(this.a.m().d(this.a.j()));
        for (g g8 : this.a.i().values()) {
            b8.J(g8.b(), g8.a());
        }
        List list = this.a.n();
        if (!list.isEmpty()) {
            list = list.iterator();
            while (list.hasNext()) {
                b8.G(new k((Trace)list.next()).a());
            }
        }
        b8.I(this.a.getAttributes());
        list = a.b(this.a.l());
        if (list != null) {
            b8.D((Iterable)Arrays.asList((Object[])list));
        }
        return (m)b8.v();
    }
}

