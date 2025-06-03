// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.protobuf;

import java.util.AbstractSet;
import java.util.NoSuchElementException;
import java.util.TreeMap;
import java.util.SortedMap;
import java.util.ArrayList;
import java.util.Set;
import java.util.Iterator;
import android.support.v4.media.a;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.AbstractMap;

public abstract class c0 extends AbstractMap
{
    public final int o;
    public List p;
    public Map q;
    public boolean r;
    public volatile g s;
    public Map t;
    public volatile c u;
    
    public c0(final int o) {
        this.o = o;
        this.p = Collections.emptyList();
        this.q = Collections.emptyMap();
        this.t = Collections.emptyMap();
    }
    
    public static /* synthetic */ List b(final c0 c0) {
        return c0.p;
    }
    
    public static /* synthetic */ Map c(final c0 c0) {
        return c0.q;
    }
    
    public static /* synthetic */ Map e(final c0 c0) {
        return c0.t;
    }
    
    public static c0 q(final int n) {
        return new c0(n) {
            @Override
            public void p() {
                if (!this.o()) {
                    if (this.k() > 0) {
                        a.a(this.j(0).getKey());
                        throw null;
                    }
                    final Iterator<Map.Entry<Object, V>> iterator = this.m().iterator();
                    if (iterator.hasNext()) {
                        a.a(iterator.next().getKey());
                        throw null;
                    }
                }
                super.p();
            }
        };
    }
    
    @Override
    public void clear() {
        this.g();
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
        return this.f(comparable) >= 0 || this.q.containsKey(comparable);
    }
    
    @Override
    public Set entrySet() {
        if (this.s == null) {
            this.s = new g(null);
        }
        return this.s;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof c0)) {
            return super.equals(o);
        }
        final c0 c0 = (c0)o;
        final int size = this.size();
        if (size != c0.size()) {
            return false;
        }
        final int k = this.k();
        if (k != c0.k()) {
            return this.entrySet().equals(c0.entrySet());
        }
        for (int i = 0; i < k; ++i) {
            if (!this.j(i).equals(c0.j(i))) {
                return false;
            }
        }
        return k == size || this.q.equals(c0.q);
    }
    
    public final int f(final Comparable comparable) {
        final int size = this.p.size();
        int n = size - 1;
        Label_0061: {
            if (n < 0) {
                break Label_0061;
            }
            final int compareTo = comparable.compareTo(this.p.get(n).h());
            int n2;
            if (compareTo > 0) {
                n2 = size + 1;
            }
            else {
                if (compareTo == 0) {
                    return n;
                }
                break Label_0061;
            }
            return -n2;
        }
        int i = 0;
        while (i <= n) {
            final int n3 = (i + n) / 2;
            final int compareTo2 = comparable.compareTo(this.p.get(n3).h());
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
    
    public final void g() {
        if (!this.r) {
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    @Override
    public Object get(final Object o) {
        final Comparable comparable = (Comparable)o;
        final int f = this.f(comparable);
        if (f >= 0) {
            return ((e)this.p.get(f)).getValue();
        }
        return this.q.get(comparable);
    }
    
    public Set h() {
        if (this.u == null) {
            this.u = new c(null);
        }
        return this.u;
    }
    
    @Override
    public int hashCode() {
        final int k = this.k();
        int i = 0;
        int n = 0;
        while (i < k) {
            n += this.p.get(i).hashCode();
            ++i;
        }
        int n2 = n;
        if (this.l() > 0) {
            n2 = n + this.q.hashCode();
        }
        return n2;
    }
    
    public final void i() {
        this.g();
        if (this.p.isEmpty() && !(this.p instanceof ArrayList)) {
            this.p = new ArrayList(this.o);
        }
    }
    
    public Entry j(final int n) {
        return (Entry)this.p.get(n);
    }
    
    public int k() {
        return this.p.size();
    }
    
    public int l() {
        return this.q.size();
    }
    
    public Iterable m() {
        if (this.q.isEmpty()) {
            return d.b();
        }
        return this.q.entrySet();
    }
    
    public final SortedMap n() {
        this.g();
        if (this.q.isEmpty() && !(this.q instanceof TreeMap)) {
            final TreeMap q = new TreeMap();
            this.q = q;
            this.t = q.descendingMap();
        }
        return (SortedMap)this.q;
    }
    
    public boolean o() {
        return this.r;
    }
    
    public void p() {
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
    
    public Object r(final Comparable comparable, final Object value) {
        this.g();
        final int f = this.f(comparable);
        if (f >= 0) {
            return ((e)this.p.get(f)).setValue(value);
        }
        this.i();
        final int n = -(f + 1);
        if (n >= this.o) {
            return this.n().put(comparable, value);
        }
        final int size = this.p.size();
        final int o = this.o;
        if (size == o) {
            final e e = this.p.remove(o - 1);
            this.n().put(e.h(), e.getValue());
        }
        this.p.add(n, new e(comparable, value));
        return null;
    }
    
    @Override
    public Object remove(final Object o) {
        this.g();
        final Comparable comparable = (Comparable)o;
        final int f = this.f(comparable);
        if (f >= 0) {
            return this.s(f);
        }
        if (this.q.isEmpty()) {
            return null;
        }
        return this.q.remove(comparable);
    }
    
    public final Object s(final int n) {
        this.g();
        final Object value = this.p.remove(n).getValue();
        if (!this.q.isEmpty()) {
            final Iterator iterator = this.n().entrySet().iterator();
            this.p.add(new e((Entry)iterator.next()));
            iterator.remove();
        }
        return value;
    }
    
    @Override
    public int size() {
        return this.p.size() + this.q.size();
    }
    
    public class b implements Iterator
    {
        public int o;
        public Iterator p;
        
        public b() {
            this.o = c0.b(c0.this).size();
        }
        
        public final Iterator b() {
            if (this.p == null) {
                this.p = c0.e(c0.this).entrySet().iterator();
            }
            return this.p;
        }
        
        public Entry d() {
            Map.Entry entry;
            if (this.b().hasNext()) {
                entry = this.b().next();
            }
            else {
                final List b = c0.b(c0.this);
                final int o = this.o - 1;
                this.o = o;
                entry = b.get(o);
            }
            return (Entry)entry;
        }
        
        @Override
        public boolean hasNext() {
            final int o = this.o;
            return (o > 0 && o <= c0.b(c0.this).size()) || this.b().hasNext();
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    
    public class c extends g
    {
        public c() {
            super(null);
        }
        
        @Override
        public Iterator iterator() {
            return new b(null);
        }
    }
    
    public abstract static class d
    {
        public static final Iterator a;
        public static final Iterable b;
        
        static {
            a = new Iterator() {
                @Override
                public boolean hasNext() {
                    return false;
                }
                
                @Override
                public Object next() {
                    throw new NoSuchElementException();
                }
                
                @Override
                public void remove() {
                    throw new UnsupportedOperationException();
                }
            };
            b = new Iterable() {
                @Override
                public Iterator iterator() {
                    return d.a();
                }
            };
        }
        
        public static /* synthetic */ Iterator a() {
            return d.a;
        }
        
        public static Iterable b() {
            return d.b;
        }
    }
    
    public class e implements Entry, Comparable
    {
        public final Comparable o;
        public Object p;
        
        public e(final Comparable o, final Object p3) {
            this.o = o;
            this.p = p3;
        }
        
        public e(final c0 c0, final Entry entry) {
            this(c0, entry.getKey(), entry.getValue());
        }
        
        public int c(final e e) {
            return this.h().compareTo(e.h());
        }
        
        public final boolean e(final Object o, final Object obj) {
            if (o == null) {
                return obj == null;
            }
            return o.equals(obj);
        }
        
        @Override
        public boolean equals(final Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof Entry)) {
                return false;
            }
            final Entry entry = (Entry)o;
            return this.e(this.o, entry.getKey()) && this.e(this.p, entry.getValue());
        }
        
        @Override
        public Object getValue() {
            return this.p;
        }
        
        public Comparable h() {
            return this.o;
        }
        
        @Override
        public int hashCode() {
            final Comparable o = this.o;
            int hashCode = 0;
            int hashCode2;
            if (o == null) {
                hashCode2 = 0;
            }
            else {
                hashCode2 = o.hashCode();
            }
            final Object p = this.p;
            if (p != null) {
                hashCode = p.hashCode();
            }
            return hashCode2 ^ hashCode;
        }
        
        @Override
        public Object setValue(final Object p) {
            c0.this.g();
            final Object p2 = this.p;
            this.p = p;
            return p2;
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.o);
            sb.append("=");
            sb.append(this.p);
            return sb.toString();
        }
    }
    
    public class f implements Iterator
    {
        public int o;
        public boolean p;
        public Iterator q;
        
        public f() {
            this.o = -1;
        }
        
        public final Iterator b() {
            if (this.q == null) {
                this.q = c0.c(c0.this).entrySet().iterator();
            }
            return this.q;
        }
        
        public Entry d() {
            this.p = true;
            final int o = this.o + 1;
            this.o = o;
            Map.Entry entry;
            if (o < c0.b(c0.this).size()) {
                entry = c0.b(c0.this).get(this.o);
            }
            else {
                entry = this.b().next();
            }
            return (Entry)entry;
        }
        
        @Override
        public boolean hasNext() {
            final int o = this.o;
            boolean b = true;
            if (o + 1 >= c0.b(c0.this).size()) {
                if (!c0.c(c0.this).isEmpty() && this.b().hasNext()) {
                    return true;
                }
                b = false;
            }
            return b;
        }
        
        @Override
        public void remove() {
            if (!this.p) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.p = false;
            c0.this.g();
            if (this.o < c0.b(c0.this).size()) {
                c0.this.s(this.o--);
                return;
            }
            this.b().remove();
        }
    }
    
    public class g extends AbstractSet
    {
        public boolean a(final Entry entry) {
            if (!this.contains(entry)) {
                c0.this.r(entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        }
        
        @Override
        public void clear() {
            c0.this.clear();
        }
        
        @Override
        public boolean contains(Object value) {
            final Entry entry = (Entry)value;
            value = c0.this.get(entry.getKey());
            final Object value2 = entry.getValue();
            return value == value2 || (value != null && value.equals(value2));
        }
        
        @Override
        public Iterator iterator() {
            return new f(null);
        }
        
        @Override
        public boolean remove(final Object o) {
            final Entry entry = (Entry)o;
            if (this.contains(entry)) {
                c0.this.remove(entry.getKey());
                return true;
            }
            return false;
        }
        
        @Override
        public int size() {
            return c0.this.size();
        }
    }
}
