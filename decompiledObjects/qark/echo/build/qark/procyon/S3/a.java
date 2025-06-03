// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package S3;

import java.util.HashMap;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.util.Map;
import java.util.List;
import java.util.Comparator;

public class a extends c
{
    public final Object[] o;
    public final Object[] p;
    public final Comparator q;
    
    public a(final Comparator q) {
        this.o = new Object[0];
        this.p = new Object[0];
        this.q = q;
    }
    
    public a(final Comparator q, final Object[] o, final Object[] p3) {
        this.o = o;
        this.p = p3;
        this.q = q;
    }
    
    public static /* synthetic */ Object[] M(final a a) {
        return a.o;
    }
    
    public static /* synthetic */ Object[] S(final a a) {
        return a.p;
    }
    
    public static Object[] T(final Object[] array, final int n, final Object o) {
        final int n2 = array.length + 1;
        final Object[] array2 = new Object[n2];
        System.arraycopy(array, 0, array2, 0, n);
        array2[n] = o;
        System.arraycopy(array, n, array2, n + 1, n2 - n - 1);
        return array2;
    }
    
    public static a U(final List list, final Map map, final c.a.a a, final Comparator c) {
        Collections.sort((List<Object>)list, c);
        final int size = list.size();
        final Object[] array = new Object[size];
        final Object[] array2 = new Object[size];
        final Iterator<Object> iterator = list.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final Object next = iterator.next();
            array[n] = next;
            array2[n] = map.get(a.a(next));
            ++n;
        }
        return new a(c, array, array2);
    }
    
    public static a X(final Map map, final Comparator comparator) {
        return U(new ArrayList(map.keySet()), map, c.a.e(), comparator);
    }
    
    public static Object[] Z(final Object[] array, final int n) {
        final int n2 = array.length - 1;
        final Object[] array2 = new Object[n2];
        System.arraycopy(array, 0, array2, 0, n);
        System.arraycopy(array, n + 1, array2, n, n2 - n);
        return array2;
    }
    
    public static Object[] a0(final Object[] array, final int n, final Object o) {
        final int length = array.length;
        final Object[] array2 = new Object[length];
        System.arraycopy(array, 0, array2, 0, length);
        array2[n] = o;
        return array2;
    }
    
    @Override
    public c D(final Object o) {
        final int v = this.V(o);
        if (v == -1) {
            return this;
        }
        return new a(this.q, Z(this.o, v), Z(this.p, v));
    }
    
    @Override
    public Iterator P() {
        return this.Y(this.o.length - 1, true);
    }
    
    public final int V(final Object o) {
        final Object[] o2 = this.o;
        final int length = o2.length;
        int i = 0;
        int n = 0;
        while (i < length) {
            if (this.q.compare(o, o2[i]) == 0) {
                return n;
            }
            ++n;
            ++i;
        }
        return -1;
    }
    
    public final int W(final Object o) {
        int n = 0;
        while (true) {
            final Object[] o2 = this.o;
            if (n >= o2.length || this.q.compare(o2[n], o) >= 0) {
                break;
            }
            ++n;
        }
        return n;
    }
    
    public final Iterator Y(final int n, final boolean b) {
        return new Iterator() {
            public int o = n;
            
            public Map.Entry b() {
                final Object key = a.M(a.this)[this.o];
                final Object[] s = a.S(a.this);
                final int o = this.o;
                final Object value = s[o];
                int o2;
                if (b) {
                    o2 = o - 1;
                }
                else {
                    o2 = o + 1;
                }
                this.o = o2;
                return (Map.Entry)new AbstractMap.SimpleImmutableEntry(key, value);
            }
            
            @Override
            public boolean hasNext() {
                if (b) {
                    if (this.o < 0) {
                        return false;
                    }
                }
                else if (this.o >= a.M(a.this).length) {
                    return false;
                }
                return true;
            }
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
            }
        };
    }
    
    @Override
    public boolean a(final Object o) {
        return this.V(o) != -1;
    }
    
    @Override
    public Object d(final Object o) {
        final int v = this.V(o);
        if (v != -1) {
            return this.p[v];
        }
        return null;
    }
    
    @Override
    public Comparator f() {
        return this.q;
    }
    
    @Override
    public Object g() {
        final Object[] o = this.o;
        if (o.length > 0) {
            return o[o.length - 1];
        }
        return null;
    }
    
    @Override
    public Object i() {
        final Object[] o = this.o;
        if (o.length > 0) {
            return o[0];
        }
        return null;
    }
    
    @Override
    public boolean isEmpty() {
        return this.o.length == 0;
    }
    
    @Override
    public Iterator iterator() {
        return this.Y(0, false);
    }
    
    @Override
    public Object k(final Object o) {
        final int v = this.V(o);
        if (v == -1) {
            throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
        }
        if (v > 0) {
            return this.o[v - 1];
        }
        return null;
    }
    
    @Override
    public void q(final h.b b) {
        int n = 0;
        while (true) {
            final Object[] o = this.o;
            if (n >= o.length) {
                break;
            }
            b.a(o[n], this.p[n]);
            ++n;
        }
    }
    
    @Override
    public c s(final Object o, final Object o2) {
        final int v = this.V(o);
        if (v != -1) {
            final Object[] o3 = this.o;
            if (o3[v] == o && this.p[v] == o2) {
                return this;
            }
            return new a(this.q, a0(o3, v, o), a0(this.p, v, o2));
        }
        else {
            if (this.o.length > 25) {
                final HashMap<Object, Object> hashMap = new HashMap<Object, Object>(this.o.length + 1);
                int n = 0;
                while (true) {
                    final Object[] o4 = this.o;
                    if (n >= o4.length) {
                        break;
                    }
                    hashMap.put(o4[n], this.p[n]);
                    ++n;
                }
                hashMap.put(o, o2);
                return k.S(hashMap, this.q);
            }
            final int w = this.W(o);
            return new a(this.q, T(this.o, w, o), T(this.p, w, o2));
        }
    }
    
    @Override
    public int size() {
        return this.o.length;
    }
}
