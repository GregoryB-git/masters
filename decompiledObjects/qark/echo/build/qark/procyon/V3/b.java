// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V3;

import java.util.HashMap;
import d4.m;
import java.util.ArrayList;
import java.util.List;
import d4.o;
import java.util.Iterator;
import d4.n;
import java.util.Map;
import Y3.d;

public final class b implements Iterable
{
    public static final b p;
    public final d o;
    
    static {
        p = new b(new d(null));
    }
    
    public b(final d o) {
        this.o = o;
    }
    
    public static b D(final Map map) {
        final d d = Y3.d.d();
        final Iterator<Map.Entry<k, V>> iterator = map.entrySet().iterator();
        d x = d;
        while (iterator.hasNext()) {
            final Map.Entry<k, V> entry = iterator.next();
            x = x.X(entry.getKey(), new d(entry.getValue()));
        }
        return new b(x);
    }
    
    public static b M(final Map map) {
        final d d = Y3.d.d();
        final Iterator<Map.Entry<K, Object>> iterator = map.entrySet().iterator();
        d x = d;
        while (iterator.hasNext()) {
            final Map.Entry<K, Object> entry = iterator.next();
            x = x.X(new k((String)entry.getKey()), new d(o.a(entry.getValue())));
        }
        return new b(x);
    }
    
    public static b s() {
        return b.p;
    }
    
    public List S() {
        final ArrayList<m> list = new ArrayList<m>();
        if (this.o.getValue() != null) {
            for (final m m : (n)this.o.getValue()) {
                list.add(new m(m.c(), m.d()));
            }
        }
        else {
            for (final Map.Entry<K, d> entry : this.o.M()) {
                final d d = entry.getValue();
                if (d.getValue() != null) {
                    list.add(new m((d4.b)entry.getKey(), (n)d.getValue()));
                }
            }
        }
        return list;
    }
    
    public n T(final k k) {
        final k g = this.o.g(k);
        if (g != null) {
            return ((n)this.o.s(g)).A(k.b0(g, k));
        }
        return null;
    }
    
    public Map U(final boolean b) {
        final HashMap hashMap = new HashMap();
        this.o.q((d.c)new d.c() {
            public Void b(final k k, final n n, final Void void1) {
                hashMap.put(k.d0(), n.L(b));
                return null;
            }
        });
        return hashMap;
    }
    
    public boolean V(final k k) {
        return this.T(k) != null;
    }
    
    public b W(final k k) {
        if (k.isEmpty()) {
            return b.p;
        }
        return new b(this.o.X(k, d.d()));
    }
    
    public n X() {
        return (n)this.o.getValue();
    }
    
    public b a(k b0, final n n) {
        if (b0.isEmpty()) {
            return new b(new d(n));
        }
        final k g = this.o.g(b0);
        if (g == null) {
            return new b(this.o.X(b0, new d(n)));
        }
        b0 = k.b0(g, b0);
        final n n2 = (n)this.o.s(g);
        final d4.b x = b0.X();
        if (x != null && x.s() && n2.A(b0.a0()).isEmpty()) {
            return this;
        }
        return new b(this.o.W(g, n2.y(b0, n)));
    }
    
    public b d(final d4.b b, final n n) {
        return this.a(new k(new d4.b[] { b }), n);
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o != null && o.getClass() == b.class && ((b)o).U(true).equals(this.U(true)));
    }
    
    public b f(final k k, final b b) {
        return (b)b.o.k(this, (d.c)new d.c() {
            public b b(final k k, final n n, final b b) {
                return b.a(k.T(k), n);
            }
        });
    }
    
    public n g(final n n) {
        return this.i(k.Y(), this.o, n);
    }
    
    @Override
    public int hashCode() {
        return this.U(true).hashCode();
    }
    
    public final n i(final k k, final d d, n i) {
        if (d.getValue() != null) {
            return i.y(k, (n)d.getValue());
        }
        final Iterator iterator = d.M().iterator();
        n n = null;
        while (iterator.hasNext()) {
            final Map.Entry<K, d> entry = iterator.next();
            final d d2 = entry.getValue();
            final d4.b b = (d4.b)entry.getKey();
            if (b.s()) {
                Y3.m.g(d2.getValue() != null, "Priority writes must always be leaf nodes");
                n = (n)d2.getValue();
            }
            else {
                i = this.i(k.U(b), d2, i);
            }
        }
        n y = i;
        if (!i.A(k).isEmpty()) {
            y = i;
            if (n != null) {
                y = i.y(k.U(d4.b.o()), n);
            }
        }
        return y;
    }
    
    public boolean isEmpty() {
        return this.o.isEmpty();
    }
    
    @Override
    public Iterator iterator() {
        return this.o.iterator();
    }
    
    public b k(final k k) {
        if (k.isEmpty()) {
            return this;
        }
        final n t = this.T(k);
        if (t != null) {
            return new b(new d(t));
        }
        return new b(this.o.Y(k));
    }
    
    public Map q() {
        final HashMap<d4.b, b> hashMap = new HashMap<d4.b, b>();
        for (final Map.Entry<d4.b, V> entry : this.o.M()) {
            hashMap.put(entry.getKey(), new b((d)entry.getValue()));
        }
        return hashMap;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CompoundWrite{");
        sb.append(this.U(true).toString());
        sb.append("}");
        return sb.toString();
    }
}
