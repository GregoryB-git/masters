/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.InvalidObjectException
 *  java.io.ObjectInputStream
 *  java.io.Serializable
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.util.AbstractMap
 *  java.util.AbstractMap$SimpleImmutableEntry
 *  java.util.Arrays
 *  java.util.BitSet
 *  java.util.Collection
 *  java.util.Comparator
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Objects
 *  java.util.Set
 *  java.util.SortedMap
 */
package X2;

import W2.g;
import X2.G;
import X2.P;
import X2.T;
import X2.a0;
import X2.g0;
import X2.i;
import X2.t;
import X2.y;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

public abstract class w
implements Map,
Serializable {
    public static final Map.Entry[] r = new Map.Entry[0];
    private static final long serialVersionUID = 912559L;
    public transient y o;
    public transient y p;
    public transient t q;

    public static a a() {
        return new a();
    }

    public static w b(Iterable iterable) {
        int n8 = iterable instanceof Collection ? ((Collection)iterable).size() : 4;
        a a8 = new a(n8);
        a8.h(iterable);
        return a8.a();
    }

    public static w c(Map map) {
        w w8;
        if (map instanceof w && !(map instanceof SortedMap) && !(w8 = (w)map).h()) {
            return w8;
        }
        return w.b((Iterable)map.entrySet());
    }

    public static w j() {
        return T.v;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public boolean containsKey(Object object) {
        if (this.get(object) != null) {
            return true;
        }
        return false;
    }

    public boolean containsValue(Object object) {
        return this.k().contains(object);
    }

    public abstract y d();

    public abstract y e();

    public boolean equals(Object object) {
        return G.c(this, object);
    }

    public abstract t f();

    public y g() {
        y y8;
        y y9 = y8 = this.o;
        if (y8 == null) {
            this.o = y9 = this.d();
        }
        return y9;
    }

    public abstract Object get(Object var1);

    public final Object getOrDefault(Object object, Object object2) {
        if ((object = this.get(object)) != null) {
            return object;
        }
        return object2;
    }

    public abstract boolean h();

    public int hashCode() {
        return a0.d(this.g());
    }

    public y i() {
        y y8;
        y y9 = y8 = this.p;
        if (y8 == null) {
            this.p = y9 = this.e();
        }
        return y9;
    }

    public boolean isEmpty() {
        if (this.size() == 0) {
            return true;
        }
        return false;
    }

    public t k() {
        t t8;
        t t9 = t8 = this.q;
        if (t8 == null) {
            this.q = t9 = this.f();
        }
        return t9;
    }

    public final Object put(Object object, Object object2) {
        throw new UnsupportedOperationException();
    }

    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    public final Object remove(Object object) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return G.k(this);
    }

    public Object writeReplace() {
        return new b(this);
    }

    public static class X2.w$a {
        public Comparator a;
        public Object[] b;
        public int c;
        public boolean d;
        public a e;

        public X2.w$a() {
            this(4);
        }

        public X2.w$a(int n8) {
            this.b = new Object[n8 * 2];
            this.c = 0;
            this.d = false;
        }

        public static void i(Object[] arrobject, int n8, Comparator comparator) {
            int n9;
            Object[] arrobject2 = new Map.Entry[n8];
            int n10 = 0;
            for (n9 = 0; n9 < n8; ++n9) {
                int n11 = n9 * 2;
                Object object = arrobject[n11];
                Objects.requireNonNull((Object)object);
                Object object2 = arrobject[n11 + 1];
                Objects.requireNonNull((Object)object2);
                arrobject2[n9] = new AbstractMap.SimpleImmutableEntry(object, object2);
            }
            Arrays.sort((Object[])arrobject2, (int)0, (int)n8, (Comparator)P.b(comparator).f(G.l()));
            for (n9 = n10; n9 < n8; ++n9) {
                n10 = n9 * 2;
                arrobject[n10] = arrobject2[n9].getKey();
                arrobject[n10 + 1] = arrobject2[n9].getValue();
            }
        }

        public w a() {
            return this.c();
        }

        public final w b(boolean bl) {
            int n8;
            Object object;
            Object object2;
            if (bl && (object2 = this.e) != null) {
                throw object2.a();
            }
            int n9 = this.c;
            if (this.a == null) {
                object2 = this.b;
                n8 = n9;
            } else {
                if (this.d) {
                    this.b = Arrays.copyOf((Object[])this.b, (int)(n9 * 2));
                }
                object = this.b;
                n8 = n9;
                object2 = object;
                if (!bl) {
                    object = this.e((Object[])object, this.c);
                    n8 = n9;
                    object2 = object;
                    if (object.length < this.b.length) {
                        n8 = object.length >>> 1;
                        object2 = object;
                    }
                }
                X2.w$a.i((Object[])object2, n8, this.a);
            }
            this.d = true;
            object2 = T.l(n8, (Object[])object2, this);
            if (bl) {
                object = this.e;
                if (object == null) {
                    return object2;
                }
                throw object.a();
            }
            return object2;
        }

        public w c() {
            return this.b(true);
        }

        public final void d(int n8) {
            Object[] arrobject = this.b;
            if ((n8 *= 2) > arrobject.length) {
                this.b = Arrays.copyOf((Object[])arrobject, (int)t.b.c(arrobject.length, n8));
                this.d = false;
            }
        }

        public final Object[] e(Object[] arrobject, int n8) {
            int n9;
            Object object;
            Object[] arrobject2 = new Object[]();
            BitSet bitSet = new BitSet();
            for (n9 = n8 - 1; n9 >= 0; --n9) {
                object = arrobject[n9 * 2];
                Objects.requireNonNull((Object)object);
                if (arrobject2.add(object)) continue;
                bitSet.set(n9);
            }
            if (bitSet.isEmpty()) {
                return arrobject;
            }
            arrobject2 = new Object[(n8 - bitSet.cardinality()) * 2];
            n9 = 0;
            int n10 = 0;
            while (n9 < n8 * 2) {
                if (bitSet.get(n9 >>> 1)) {
                    n9 += 2;
                    continue;
                }
                object = arrobject[n9];
                Objects.requireNonNull((Object)object);
                arrobject2[n10] = object;
                int n11 = n10 + 2;
                int n12 = n9 + 2;
                object = arrobject[n9 + 1];
                Objects.requireNonNull((Object)object);
                arrobject2[n10 + 1] = object;
                n9 = n12;
                n10 = n11;
            }
            return arrobject2;
        }

        public X2.w$a f(Object object, Object object2) {
            this.d(this.c + 1);
            i.a(object, object2);
            Object[] arrobject = this.b;
            int n8 = this.c;
            arrobject[n8 * 2] = object;
            arrobject[n8 * 2 + 1] = object2;
            this.c = n8 + 1;
            return this;
        }

        public X2.w$a g(Map.Entry entry) {
            return this.f(entry.getKey(), entry.getValue());
        }

        public X2.w$a h(Iterable iterable) {
            if (iterable instanceof Collection) {
                this.d(this.c + ((Collection)iterable).size());
            }
            iterable = iterable.iterator();
            while (iterable.hasNext()) {
                this.g((Map.Entry)iterable.next());
            }
            return this;
        }

        public static final class a {
            public final Object a;
            public final Object b;
            public final Object c;

            public a(Object object, Object object2, Object object3) {
                this.a = object;
                this.b = object2;
                this.c = object3;
            }

            public IllegalArgumentException a() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Multiple entries with same key: ");
                stringBuilder.append(this.a);
                stringBuilder.append("=");
                stringBuilder.append(this.b);
                stringBuilder.append(" and ");
                stringBuilder.append(this.a);
                stringBuilder.append("=");
                stringBuilder.append(this.c);
                return new IllegalArgumentException(stringBuilder.toString());
            }
        }

    }

    public static class b
    implements Serializable {
        private static final long serialVersionUID = 0L;
        public final Object o;
        public final Object p;

        public b(w object) {
            Object[] arrobject = new Object[object.size()];
            Object[] arrobject2 = new Object[object.size()];
            object = object.g().q();
            int n8 = 0;
            while (object.hasNext()) {
                Map.Entry entry = (Map.Entry)object.next();
                arrobject[n8] = entry.getKey();
                arrobject2[n8] = entry.getValue();
                ++n8;
            }
            this.o = arrobject;
            this.p = arrobject2;
        }

        public final Object a() {
            Object[] arrobject = (Object[])this.o;
            Object[] arrobject2 = (Object[])this.p;
            a a8 = this.b(arrobject.length);
            for (int i8 = 0; i8 < arrobject.length; ++i8) {
                a8.f(arrobject[i8], arrobject2[i8]);
            }
            return a8.c();
        }

        public a b(int n8) {
            return new a(n8);
        }

        public final Object readResolve() {
            Object object = this.o;
            if (!(object instanceof y)) {
                return this.a();
            }
            Object object2 = (y)((Object)object);
            Object object3 = (t)((Object)this.p);
            object = this.b(object2.size());
            object2 = object2.q();
            object3 = object3.q();
            while (object2.hasNext()) {
                object.f(object2.next(), object3.next());
            }
            return object.c();
        }
    }

}

