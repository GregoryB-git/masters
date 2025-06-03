/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.UnsupportedOperationException
 *  java.util.AbstractMap
 *  java.util.AbstractMap$SimpleImmutableEntry
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package S3;

import S3.c;
import S3.h;
import S3.k;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class a
extends c {
    public final Object[] o;
    public final Object[] p;
    public final Comparator q;

    public a(Comparator comparator) {
        this.o = new Object[0];
        this.p = new Object[0];
        this.q = comparator;
    }

    public a(Comparator comparator, Object[] arrobject, Object[] arrobject2) {
        this.o = arrobject;
        this.p = arrobject2;
        this.q = comparator;
    }

    public static Object[] T(Object[] arrobject, int n8, Object object) {
        int n9 = arrobject.length + 1;
        Object[] arrobject2 = new Object[n9];
        System.arraycopy((Object)arrobject, (int)0, (Object)arrobject2, (int)0, (int)n8);
        arrobject2[n8] = object;
        System.arraycopy((Object)arrobject, (int)n8, (Object)arrobject2, (int)(n8 + 1), (int)(n9 - n8 - 1));
        return arrobject2;
    }

    public static a U(List list, Map map, c.a.a a8, Comparator comparator) {
        Collections.sort((List)list, (Comparator)comparator);
        int n8 = list.size();
        Object[] arrobject = new Object[n8];
        Object[] arrobject2 = new Object[n8];
        list = list.iterator();
        n8 = 0;
        while (list.hasNext()) {
            Object object;
            arrobject[n8] = object = list.next();
            arrobject2[n8] = map.get(a8.a(object));
            ++n8;
        }
        return new a(comparator, arrobject, arrobject2);
    }

    public static a X(Map map, Comparator comparator) {
        return a.U((List)new ArrayList((Collection)map.keySet()), map, c.a.e(), comparator);
    }

    public static Object[] Z(Object[] arrobject, int n8) {
        int n9 = arrobject.length - 1;
        Object[] arrobject2 = new Object[n9];
        System.arraycopy((Object)arrobject, (int)0, (Object)arrobject2, (int)0, (int)n8);
        System.arraycopy((Object)arrobject, (int)(n8 + 1), (Object)arrobject2, (int)n8, (int)(n9 - n8));
        return arrobject2;
    }

    public static Object[] a0(Object[] arrobject, int n8, Object object) {
        int n9 = arrobject.length;
        Object[] arrobject2 = new Object[n9];
        System.arraycopy((Object)arrobject, (int)0, (Object)arrobject2, (int)0, (int)n9);
        arrobject2[n8] = object;
        return arrobject2;
    }

    @Override
    public c D(Object arrobject) {
        int n8 = this.V(arrobject);
        if (n8 == -1) {
            return this;
        }
        arrobject = a.Z(this.o, n8);
        Object[] arrobject2 = a.Z(this.p, n8);
        return new a(this.q, arrobject, arrobject2);
    }

    @Override
    public Iterator P() {
        return this.Y(this.o.length - 1, true);
    }

    public final int V(Object object) {
        Object[] arrobject = this.o;
        int n8 = arrobject.length;
        int n9 = 0;
        for (int i8 = 0; i8 < n8; ++i8) {
            Object object2 = arrobject[i8];
            if (this.q.compare(object, object2) == 0) {
                return n9;
            }
            ++n9;
        }
        return -1;
    }

    public final int W(Object object) {
        int n8;
        Object[] arrobject;
        for (n8 = 0; n8 < (arrobject = this.o).length && this.q.compare(arrobject[n8], object) < 0; ++n8) {
        }
        return n8;
    }

    public final Iterator Y(final int n8, final boolean bl) {
        return new Iterator(){
            public int o;
            {
                this.o = n82;
            }

            public Map.Entry b() {
                Object object = a.this.o[this.o];
                Object object2 = a.this.p;
                int n82 = this.o;
                object2 = object2[n82];
                n82 = bl ? --n82 : ++n82;
                this.o = n82;
                return new AbstractMap.SimpleImmutableEntry(object, object2);
            }

            /*
             * Enabled aggressive block sorting
             */
            public boolean hasNext() {
                if (bl) {
                    if (this.o < 0) return false;
                    return true;
                }
                if (this.o >= a.this.o.length) return false;
                return true;
            }

            public void remove() {
                throw new UnsupportedOperationException("Can't remove elements from ImmutableSortedMap");
            }
        };
    }

    @Override
    public boolean a(Object object) {
        if (this.V(object) != -1) {
            return true;
        }
        return false;
    }

    @Override
    public Object d(Object object) {
        int n8 = this.V(object);
        if (n8 != -1) {
            return this.p[n8];
        }
        return null;
    }

    @Override
    public Comparator f() {
        return this.q;
    }

    @Override
    public Object g() {
        Object[] arrobject = this.o;
        if (arrobject.length > 0) {
            return arrobject[arrobject.length - 1];
        }
        return null;
    }

    @Override
    public Object i() {
        Object[] arrobject = this.o;
        if (arrobject.length > 0) {
            return arrobject[0];
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        if (this.o.length == 0) {
            return true;
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return this.Y(0, false);
    }

    @Override
    public Object k(Object object) {
        int n8 = this.V(object);
        if (n8 != -1) {
            if (n8 > 0) {
                return this.o[n8 - 1];
            }
            return null;
        }
        throw new IllegalArgumentException("Can't find predecessor of nonexistent key");
    }

    @Override
    public void q(h.b b8) {
        Object[] arrobject;
        for (int i8 = 0; i8 < (arrobject = this.o).length; ++i8) {
            b8.a(arrobject[i8], this.p[i8]);
        }
    }

    @Override
    public c s(Object arrobject, Object arrobject2) {
        int n8 = this.V(arrobject);
        if (n8 != -1) {
            Object[] arrobject3 = this.o;
            if (arrobject3[n8] == arrobject && this.p[n8] == arrobject2) {
                return this;
            }
            arrobject = a.a0(arrobject3, n8, arrobject);
            arrobject2 = a.a0(this.p, n8, arrobject2);
            return new a(this.q, arrobject, arrobject2);
        }
        if (this.o.length > 25) {
            Object[] arrobject4;
            HashMap hashMap = new HashMap(this.o.length + 1);
            for (n8 = 0; n8 < (arrobject4 = this.o).length; ++n8) {
                hashMap.put(arrobject4[n8], this.p[n8]);
            }
            hashMap.put((Object)arrobject, (Object)arrobject2);
            return k.S((Map)hashMap, this.q);
        }
        n8 = this.W(arrobject);
        arrobject = a.T(this.o, n8, arrobject);
        arrobject2 = a.T(this.p, n8, arrobject2);
        return new a(this.q, arrobject, arrobject2);
    }

    @Override
    public int size() {
        return this.o.length;
    }

}

