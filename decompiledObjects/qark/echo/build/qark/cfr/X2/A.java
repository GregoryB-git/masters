/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.InvalidObjectException
 *  java.io.ObjectInputStream
 *  java.io.Serializable
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Comparator
 *  java.util.NavigableSet
 *  java.util.SortedSet
 */
package X2;

import W2.m;
import X2.B;
import X2.O;
import X2.P;
import X2.V;
import X2.c0;
import X2.d0;
import X2.t;
import X2.v;
import X2.y;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.SortedSet;

public abstract class A
extends y
implements NavigableSet,
c0 {
    private static final long serialVersionUID = 912559L;
    public final transient Comparator q;
    public transient A r;

    public A(Comparator comparator) {
        this.q = comparator;
    }

    public static /* varargs */ A e0(Comparator comparator, int n8, Object ... arrobject) {
        Object[] arrobject2;
        if (n8 == 0) {
            return A.j0(comparator);
        }
        O.c(arrobject, n8);
        Arrays.sort((Object[])arrobject, (int)0, (int)n8, (Comparator)comparator);
        int n9 = 1;
        for (int i8 = 1; i8 < n8; ++i8) {
            arrobject2 = arrobject[i8];
            int n10 = n9;
            if (comparator.compare((Object)arrobject2, arrobject[n9 - 1]) != 0) {
                arrobject[n9] = arrobject2;
                n10 = n9 + 1;
            }
            n9 = n10;
        }
        Arrays.fill((Object[])arrobject, (int)n9, (int)n8, (Object)null);
        arrobject2 = arrobject;
        if (n9 < arrobject.length / 2) {
            arrobject2 = Arrays.copyOf((Object[])arrobject, (int)n9);
        }
        return new V(v.D(arrobject2, n9), comparator);
    }

    public static A f0(Comparator comparator, Iterable arrobject) {
        A a8;
        m.j((Object)comparator);
        if (d0.b(comparator, (Iterable)arrobject) && arrobject instanceof A && !(a8 = (A)arrobject).k()) {
            return a8;
        }
        arrobject = B.k((Iterable)arrobject);
        return A.e0(comparator, arrobject.length, arrobject);
    }

    public static A g0(Comparator comparator, Collection collection) {
        return A.f0(comparator, (Iterable)collection);
    }

    public static V j0(Comparator comparator) {
        if (P.d().equals((Object)comparator)) {
            return V.t;
        }
        return new V(v.Y(), comparator);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static int u0(Comparator comparator, Object object, Object object2) {
        return comparator.compare(object, object2);
    }

    @Override
    public Comparator comparator() {
        return this.q;
    }

    public abstract A h0();

    public A i0() {
        A a8;
        A a9 = a8 = this.r;
        if (a8 == null) {
            this.r = a9 = this.h0();
            a9.r = this;
        }
        return a9;
    }

    public A k0(Object object) {
        return this.l0(object, false);
    }

    public A l0(Object object, boolean bl) {
        return this.m0(m.j(object), bl);
    }

    public abstract A m0(Object var1, boolean var2);

    public A n0(Object object, Object object2) {
        return this.o0(object, true, object2, false);
    }

    public A o0(Object object, boolean bl, Object object2, boolean bl2) {
        m.j(object);
        m.j(object2);
        boolean bl3 = this.q.compare(object, object2) <= 0;
        m.d(bl3);
        return this.p0(object, bl, object2, bl2);
    }

    public abstract A p0(Object var1, boolean var2, Object var3, boolean var4);

    public final Object pollFirst() {
        throw new UnsupportedOperationException();
    }

    public final Object pollLast() {
        throw new UnsupportedOperationException();
    }

    public A q0(Object object) {
        return this.r0(object, true);
    }

    public A r0(Object object, boolean bl) {
        return this.s0(m.j(object), bl);
    }

    public abstract A s0(Object var1, boolean var2);

    public int t0(Object object, Object object2) {
        return A.u0(this.q, object, object2);
    }

    @Override
    public Object writeReplace() {
        return new b(this.q, this.toArray());
    }

    public static final class a
    extends y.a {
        public final Comparator f;

        public a(Comparator comparator) {
            this.f = (Comparator)m.j((Object)comparator);
        }

        public a m(Object object) {
            super.h(object);
            return this;
        }

        public /* varargs */ a n(Object ... arrobject) {
            super.i(arrobject);
            return this;
        }

        public a o(Iterable iterable) {
            super.j(iterable);
            return this;
        }

        public A p() {
            Object object = this.a;
            object = A.e0(this.f, this.b, (Object[])object);
            this.b = object.size();
            this.c = true;
            return object;
        }
    }

    public static class b
    implements Serializable {
        private static final long serialVersionUID = 0L;
        public final Comparator o;
        public final Object[] p;

        public b(Comparator comparator, Object[] arrobject) {
            this.o = comparator;
            this.p = arrobject;
        }

        public Object readResolve() {
            return new a(this.o).n(this.p).p();
        }
    }

}

