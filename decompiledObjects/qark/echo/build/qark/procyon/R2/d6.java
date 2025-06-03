// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import com.google.android.gms.internal.measurement.A6;
import java.util.List;
import com.google.android.gms.internal.measurement.g2;
import java.util.Collections;
import com.google.android.gms.internal.measurement.Y3;
import com.google.android.gms.internal.measurement.X1;
import com.google.android.gms.internal.measurement.W1;
import java.util.Iterator;
import java.util.ArrayList;
import t.a;
import java.util.Map;
import java.util.BitSet;
import com.google.android.gms.internal.measurement.f2;

public final class d6
{
    public String a;
    public boolean b;
    public f2 c;
    public BitSet d;
    public BitSet e;
    public Map f;
    public Map g;
    public final /* synthetic */ b6 h;
    
    public d6(final b6 h, final String a) {
        this.h = h;
        this.a = a;
        this.b = true;
        this.d = new BitSet();
        this.e = new BitSet();
        this.f = new a();
        this.g = new a();
    }
    
    public d6(final b6 h, final String a, final f2 c, final BitSet d, final BitSet e, final Map f, final Map map) {
        this.h = h;
        this.a = a;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = new a();
        if (map != null) {
            for (final Integer n : map.keySet()) {
                final ArrayList<Long> list = new ArrayList<Long>();
                list.add((Long)map.get(n));
                this.g.put(n, list);
            }
        }
        this.b = false;
        this.c = c;
    }
    
    public final W1 a(int intValue) {
        final W1.a m = W1.M();
        m.w(intValue);
        m.z(this.b);
        final f2 c = this.c;
        if (c != null) {
            m.y(c);
        }
        final f2.a d = f2.V().z(N5.M(this.d)).D(N5.M(this.e));
        Iterable<X1> iterable;
        if (this.f == null) {
            iterable = null;
        }
        else {
            final ArrayList<X1> list = new ArrayList<X1>(this.f.size());
            final Iterator<Integer> iterator = this.f.keySet().iterator();
            while (true) {
                iterable = list;
                if (!iterator.hasNext()) {
                    break;
                }
                final Integer n = iterator.next();
                intValue = n;
                final Long n2 = this.f.get(n);
                if (n2 == null) {
                    continue;
                }
                list.add((X1)((Y3.b)X1.L().w(intValue).x(n2)).p());
            }
        }
        if (iterable != null) {
            d.x(iterable);
        }
        Object emptyList;
        if (this.g == null) {
            emptyList = Collections.emptyList();
        }
        else {
            final ArrayList<g2> list2 = new ArrayList<g2>(this.g.size());
            final Iterator<Integer> iterator2 = this.g.keySet().iterator();
            while (true) {
                emptyList = list2;
                if (!iterator2.hasNext()) {
                    break;
                }
                final Integer n3 = iterator2.next();
                final g2.a w = g2.M().w(n3);
                final List<Comparable> list3 = this.g.get(n3);
                if (list3 != null) {
                    Collections.sort(list3);
                    w.x(list3);
                }
                list2.add((g2)((Y3.b)w).p());
            }
        }
        d.B((Iterable)emptyList);
        m.x(d);
        return (W1)((Y3.b)m).p();
    }
    
    public final void c(final d d) {
        final int a = d.a();
        final Boolean c = d.c;
        if (c != null) {
            this.e.set(a, c);
        }
        final Boolean d2 = d.d;
        if (d2 != null) {
            this.d.set(a, d2);
        }
        if (d.e != null) {
            final Long n = this.f.get(a);
            final long l = d.e / 1000L;
            if (n == null || l > n) {
                this.f.put(a, l);
            }
        }
        if (d.f != null) {
            List<Long> list;
            if ((list = this.g.get(a)) == null) {
                list = new ArrayList<Long>();
                this.g.put(a, list);
            }
            if (d.j()) {
                list.clear();
            }
            if (A6.a() && this.h.f().D(this.a, K.j0) && d.i()) {
                list.clear();
            }
            if (A6.a() && this.h.f().D(this.a, K.j0)) {
                final long n2 = d.f / 1000L;
                if (!list.contains(n2)) {
                    list.add(n2);
                }
                return;
            }
            list.add(d.f / 1000L);
        }
    }
}
