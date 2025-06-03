// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import java.util.TreeMap;
import java.util.SortedMap;
import java.util.Iterator;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.AbstractMap;

public abstract class d5 extends AbstractMap
{
    public final int o;
    public List p;
    public Map q;
    public boolean r;
    public volatile p5 s;
    public Map t;
    public volatile h5 u;
    
    public d5(final int o) {
        this.o = o;
        this.p = Collections.emptyList();
        this.q = Collections.emptyMap();
        this.t = Collections.emptyMap();
    }
    
    public static d5 b(final int n) {
        return new c5(n);
    }
    
    public final int a(final Comparable comparable) {
        final int size = this.p.size();
        int n = size - 1;
        Label_0064: {
            if (n < 0) {
                break Label_0064;
            }
            final int compareTo = comparable.compareTo(this.p.get(n).getKey());
            int n2;
            if (compareTo > 0) {
                n2 = size + 1;
            }
            else {
                if (compareTo == 0) {
                    return n;
                }
                break Label_0064;
            }
            return -n2;
        }
        int i = 0;
        while (i <= n) {
            final int n3 = (i + n) / 2;
            final int compareTo2 = comparable.compareTo(this.p.get(n3).getKey());
            if (compareTo2 < 0) {
                n = n3 - 1;
            }
            else {
                if (compareTo2 <= 0) {
                    return n3;
                }
                i = n3 + 1;
            }
        }
        int n2 = i + 1;
        return -n2;
    }
    
    @Override
    public void clear() {
        this.q();
        if (!this.p.isEmpty()) {
            this.p.clear();
        }
        if (!this.q.isEmpty()) {
            this.q.clear();
        }
    }
    
    @Override
    public boolean containsKey(final Object o) {
        final Comparable comparable = (Comparable)o;
        return this.a(comparable) >= 0 || this.q.containsKey(comparable);
    }
    
    public final Object d(final Comparable comparable, final Object value) {
        this.q();
        final int a = this.a(comparable);
        if (a >= 0) {
            return ((k5)this.p.get(a)).setValue(value);
        }
        this.q();
        if (this.p.isEmpty() && !(this.p instanceof ArrayList)) {
            this.p = new ArrayList(this.o);
        }
        final int n = -(a + 1);
        if (n >= this.o) {
            return this.p().put(comparable, value);
        }
        final int size = this.p.size();
        final int o = this.o;
        if (size == o) {
            final k5 k5 = this.p.remove(o - 1);
            this.p().put(k5.getKey(), k5.getValue());
        }
        this.p.add(n, new k5(this, comparable, value));
        return null;
    }
    
    @Override
    public Set entrySet() {
        if (this.s == null) {
            this.s = new p5(this, null);
        }
        return this.s;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d5)) {
            return super.equals(o);
        }
        final d5 d5 = (d5)o;
        final int size = this.size();
        if (size != d5.size()) {
            return false;
        }
        final int g = this.g();
        Object o2;
        Object obj;
        if (g != d5.g()) {
            o2 = this.entrySet();
            obj = d5.entrySet();
        }
        else {
            for (int i = 0; i < g; ++i) {
                if (!this.h(i).equals(d5.h(i))) {
                    return false;
                }
            }
            if (g == size) {
                return true;
            }
            o2 = this.q;
            obj = d5.q;
        }
        return o2.equals(obj);
    }
    
    public void f() {
        if (!this.r) {
            Map<Object, Object> q;
            if (this.q.isEmpty()) {
                q = Collections.emptyMap();
            }
            else {
                q = Collections.unmodifiableMap((Map<?, ?>)this.q);
            }
            this.q = q;
            Map<Object, Object> t;
            if (this.t.isEmpty()) {
                t = Collections.emptyMap();
            }
            else {
                t = Collections.unmodifiableMap((Map<?, ?>)this.t);
            }
            this.t = t;
            this.r = true;
        }
    }
    
    public final int g() {
        return this.p.size();
    }
    
    @Override
    public Object get(final Object o) {
        final Comparable comparable = (Comparable)o;
        final int a = this.a(comparable);
        if (a >= 0) {
            return ((k5)this.p.get(a)).getValue();
        }
        return this.q.get(comparable);
    }
    
    public final Entry h(final int n) {
        return (Entry)this.p.get(n);
    }
    
    @Override
    public int hashCode() {
        final int g = this.g();
        int i = 0;
        int n = 0;
        while (i < g) {
            n += this.p.get(i).hashCode();
            ++i;
        }
        int n2 = n;
        if (this.q.size() > 0) {
            n2 = n + this.q.hashCode();
        }
        return n2;
    }
    
    public final Iterable j() {
        if (this.q.isEmpty()) {
            return j5.a();
        }
        return this.q.entrySet();
    }
    
    public final Object k(final int n) {
        this.q();
        final Object value = this.p.remove(n).getValue();
        if (!this.q.isEmpty()) {
            final Iterator iterator = this.p().entrySet().iterator();
            this.p.add(new k5(this, (Entry)iterator.next()));
            iterator.remove();
        }
        return value;
    }
    
    public final Set m() {
        if (this.u == null) {
            this.u = new h5(this, (g5)null);
        }
        return this.u;
    }
    
    public final boolean o() {
        return this.r;
    }
    
    public final SortedMap p() {
        this.q();
        if (this.q.isEmpty() && !(this.q instanceof TreeMap)) {
            final TreeMap q = new TreeMap();
            this.q = q;
            this.t = q.descendingMap();
        }
        return (SortedMap)this.q;
    }
    
    public final void q() {
        if (!this.r) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public Object remove(final Object o) {
        this.q();
        final Comparable comparable = (Comparable)o;
        final int a = this.a(comparable);
        if (a >= 0) {
            return this.k(a);
        }
        if (this.q.isEmpty()) {
            return null;
        }
        return this.q.remove(comparable);
    }
    
    @Override
    public int size() {
        return this.p.size() + this.q.size();
    }
}
