// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;
import java.util.Map;
import java.util.SortedMap;

public final class g implements m, s, Iterable
{
    public final SortedMap o;
    public final Map p;
    
    public g() {
        this.o = new TreeMap();
        this.p = new TreeMap();
    }
    
    public g(final List list) {
        this();
        if (list != null) {
            for (int i = 0; i < list.size(); ++i) {
                this.X(i, list.get(i));
            }
        }
    }
    
    public g(final s... a) {
        this(Arrays.asList(a));
    }
    
    public final int D() {
        return this.o.size();
    }
    
    public final s M(final int i) {
        if (i < this.U()) {
            if (this.Y(i)) {
                final s s = (s)this.o.get(i);
                if (s != null) {
                    return s;
                }
            }
            return s.d;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }
    
    public final void S(final int i, final s s) {
        if (i < 0) {
            final StringBuilder sb = new StringBuilder("Invalid value index: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i >= this.U()) {
            this.X(i, s);
            return;
        }
        for (int j = this.o.lastKey(); j >= i; --j) {
            final s s2 = (s)this.o.get(j);
            if (s2 != null) {
                this.X(j + 1, s2);
                this.o.remove(j);
            }
        }
        this.X(i, s);
    }
    
    public final void T(final s s) {
        this.X(this.U(), s);
    }
    
    public final int U() {
        if (this.o.isEmpty()) {
            return 0;
        }
        return this.o.lastKey() + 1;
    }
    
    public final String V(final String s) {
        String str = s;
        if (s == null) {
            str = "";
        }
        final StringBuilder sb = new StringBuilder();
        if (!this.o.isEmpty()) {
            for (int i = 0; i < this.U(); ++i) {
                final s m = this.M(i);
                sb.append(str);
                if (!(m instanceof z) && !(m instanceof q)) {
                    sb.append(m.g());
                }
            }
            sb.delete(0, str.length());
        }
        return sb.toString();
    }
    
    public final void W(int i) {
        final int intValue = this.o.lastKey();
        if (i <= intValue) {
            if (i < 0) {
                return;
            }
            this.o.remove(i);
            int n;
            if ((n = i) == intValue) {
                final SortedMap o = this.o;
                --i;
                if (!o.containsKey(i) && i >= 0) {
                    this.o.put(i, s.d);
                }
                return;
            }
            while (true) {
                ++n;
                if (n > this.o.lastKey()) {
                    break;
                }
                final s s = (s)this.o.get(n);
                if (s == null) {
                    continue;
                }
                this.o.put(n - 1, s);
                this.o.remove(n);
            }
        }
    }
    
    public final void X(final int i, final s s) {
        if (i > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i < 0) {
            final StringBuilder sb = new StringBuilder("Out of bounds index: ");
            sb.append(i);
            throw new IndexOutOfBoundsException(sb.toString());
        }
        if (s == null) {
            this.o.remove(i);
            return;
        }
        this.o.put(i, s);
    }
    
    public final boolean Y(final int n) {
        if (n >= 0 && n <= this.o.lastKey()) {
            return this.o.containsKey(n);
        }
        final StringBuilder sb = new StringBuilder("Out of bounds index: ");
        sb.append(n);
        throw new IndexOutOfBoundsException(sb.toString());
    }
    
    public final Iterator Z() {
        return this.o.keySet().iterator();
    }
    
    @Override
    public final void a(final String s, final s s2) {
        if (s2 == null) {
            this.p.remove(s);
            return;
        }
        this.p.put(s, s2);
    }
    
    public final List a0() {
        final ArrayList<s> list = new ArrayList<s>(this.U());
        for (int i = 0; i < this.U(); ++i) {
            list.add(this.M(i));
        }
        return list;
    }
    
    public final void b0() {
        this.o.clear();
    }
    
    @Override
    public final s c() {
        final g g = new g();
        for (final Map.Entry<Integer, V> entry : this.o.entrySet()) {
            SortedMap sortedMap;
            Integer n;
            s c;
            if (entry.getValue() instanceof m) {
                sortedMap = g.o;
                n = entry.getKey();
                c = (s)entry.getValue();
            }
            else {
                sortedMap = g.o;
                n = entry.getKey();
                c = ((s)entry.getValue()).c();
            }
            sortedMap.put(n, c);
        }
        return g;
    }
    
    @Override
    public final Boolean d() {
        return Boolean.TRUE;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof g)) {
            return false;
        }
        final g g = (g)o;
        if (this.U() != g.U()) {
            return false;
        }
        if (this.o.isEmpty()) {
            return g.o.isEmpty();
        }
        for (int i = this.o.firstKey(); i <= this.o.lastKey(); ++i) {
            if (!this.M(i).equals(g.M(i))) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public final Double f() {
        if (this.o.size() == 1) {
            return this.M(0).f();
        }
        if (this.o.size() <= 0) {
            return 0.0;
        }
        return Double.NaN;
    }
    
    @Override
    public final String g() {
        return this.toString();
    }
    
    @Override
    public final int hashCode() {
        return this.o.hashCode() * 31;
    }
    
    @Override
    public final s i(final String anObject) {
        if ("length".equals(anObject)) {
            return new k((double)this.U());
        }
        if (this.q(anObject)) {
            final s s = this.p.get(anObject);
            if (s != null) {
                return s;
            }
        }
        return s.d;
    }
    
    @Override
    public final Iterator iterator() {
        return new i(this);
    }
    
    @Override
    public final Iterator k() {
        return new f(this, this.o.keySet().iterator(), this.p.keySet().iterator());
    }
    
    @Override
    public final boolean q(final String anObject) {
        return "length".equals(anObject) || this.p.containsKey(anObject);
    }
    
    @Override
    public final s s(final String s, final f3 f3, final List list) {
        if (!"concat".equals(s) && !"every".equals(s) && !"filter".equals(s) && !"forEach".equals(s) && !"indexOf".equals(s) && !"join".equals(s) && !"lastIndexOf".equals(s) && !"map".equals(s) && !"pop".equals(s) && !"push".equals(s) && !"reduce".equals(s) && !"reduceRight".equals(s) && !"reverse".equals(s) && !"shift".equals(s) && !"slice".equals(s) && !"some".equals(s) && !"sort".equals(s) && !"splice".equals(s) && !"toString".equals(s) && !"unshift".equals(s)) {
            return com.google.android.gms.internal.measurement.p.a(this, new u(s), f3, list);
        }
        return H.d(s, this, f3, list);
    }
    
    @Override
    public final String toString() {
        return this.V(",");
    }
}
