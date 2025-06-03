// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d4;

import java.util.Iterator;
import java.util.Collection;
import java.util.ArrayList;
import java.util.HashSet;
import Y3.m;
import java.util.List;
import T3.o;
import V3.k;

public class s
{
    public final k a;
    public final k b;
    public final n c;
    
    public s(final o o) {
        final List a = o.a();
        final k k = null;
        k a2;
        if (a != null) {
            a2 = new k(a);
        }
        else {
            a2 = null;
        }
        this.a = a2;
        final List b = o.b();
        k b2 = k;
        if (b != null) {
            b2 = new k(b);
        }
        this.b = b2;
        this.c = d4.o.a(o.c());
    }
    
    public n a(final n n) {
        return this.b(k.Y(), n, this.c);
    }
    
    public final n b(final k k, final n n, final n n2) {
        final k a = this.a;
        final boolean b = true;
        int v;
        if (a == null) {
            v = 1;
        }
        else {
            v = k.V(a);
        }
        final k b2 = this.b;
        int v2;
        if (b2 == null) {
            v2 = -1;
        }
        else {
            v2 = k.V(b2);
        }
        final k a2 = this.a;
        final boolean b3 = a2 != null && k.W(a2);
        final k b4 = this.b;
        final boolean b5 = b4 != null && k.W(b4);
        if (v > 0 && v2 < 0 && !b5) {
            return n2;
        }
        if (v > 0 && b5 && n2.B()) {
            return n2;
        }
        if (v > 0 && v2 == 0) {
            m.f(b5);
            m.f(n2.B() ^ true);
            if (n.B()) {
                return g.W();
            }
            return n;
        }
        else {
            if (!b3 && !b5) {
                boolean b6 = b;
                if (v2 <= 0) {
                    b6 = (v <= 0 && b);
                }
                m.f(b6);
                return n;
            }
            final HashSet<b> set = new HashSet<b>();
            final Iterator<d4.m> iterator = (Iterator<d4.m>)n.iterator();
            while (iterator.hasNext()) {
                set.add(iterator.next().c());
            }
            final Iterator<d4.m> iterator2 = (Iterator<d4.m>)n2.iterator();
            while (iterator2.hasNext()) {
                set.add(iterator2.next().c());
            }
            final ArrayList list = new ArrayList<b>(set.size() + 1);
            list.addAll((Collection<?>)set);
            if (!n2.t().isEmpty() || !n.t().isEmpty()) {
                list.add(d4.b.o());
            }
            final Iterator<b> iterator3 = (Iterator<b>)list.iterator();
            n n3 = n;
            while (iterator3.hasNext()) {
                final b b7 = iterator3.next();
                final n v3 = n.v(b7);
                final n b8 = this.b(k.U(b7), n.v(b7), n2.v(b7));
                if (b8 != v3) {
                    n3 = n3.N(b7, b8);
                }
            }
            return n3;
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("RangeMerge{optExclusiveStart=");
        sb.append(this.a);
        sb.append(", optInclusiveEnd=");
        sb.append(this.b);
        sb.append(", snap=");
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
