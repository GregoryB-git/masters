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
 *  java.lang.System
 *  java.lang.UnsupportedOperationException
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.ListIterator
 *  java.util.RandomAccess
 */
package X2;

import W2.m;
import X2.B;
import X2.E;
import X2.O;
import X2.S;
import X2.g0;
import X2.h0;
import X2.i;
import X2.t;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public abstract class v
extends t
implements List,
RandomAccess {
    public static final h0 p = new b(S.s, 0);
    private static final long serialVersionUID = -889275714L;

    public static v D(Object[] arrobject, int n8) {
        if (n8 == 0) {
            return v.Y();
        }
        return new S(arrobject, n8);
    }

    public static a M() {
        return new a();
    }

    public static a S(int n8) {
        i.b(n8, "expectedSize");
        return new a(n8);
    }

    public static /* varargs */ v T(Object ... arrobject) {
        return v.s(O.b(arrobject));
    }

    public static v U(Collection object) {
        if (object instanceof t) {
            v v8 = ((t)((Object)object)).a();
            object = v8;
            if (v8.k()) {
                object = v.s(v8.toArray());
            }
            return object;
        }
        return v.T(object.toArray());
    }

    public static v V(Object[] arrobject) {
        if (arrobject.length == 0) {
            return v.Y();
        }
        return v.T((Object[])arrobject.clone());
    }

    public static v Y() {
        return S.s;
    }

    public static v Z(Object object) {
        return v.T(object);
    }

    public static v a0(Object object, Object object2) {
        return v.T(object, object2);
    }

    public static v b0(Object object, Object object2, Object object3) {
        return v.T(object, object2, object3);
    }

    public static v c0(Object object, Object object2, Object object3, Object object4, Object object5) {
        return v.T(object, object2, object3, object4, object5);
    }

    public static v d0(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
        return v.T(object, object2, object3, object4, object5, object6, object7);
    }

    public static /* varargs */ v e0(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, Object object8, Object object9, Object object10, Object object11, Object object12, Object ... arrobject) {
        boolean bl = arrobject.length <= 2147483635;
        m.e(bl, "the total number of elements must fit in an int");
        Object[] arrobject2 = new Object[arrobject.length + 12];
        arrobject2[0] = object;
        arrobject2[1] = object2;
        arrobject2[2] = object3;
        arrobject2[3] = object4;
        arrobject2[4] = object5;
        arrobject2[5] = object6;
        arrobject2[6] = object7;
        arrobject2[7] = object8;
        arrobject2[8] = object9;
        arrobject2[9] = object10;
        arrobject2[10] = object11;
        arrobject2[11] = object12;
        System.arraycopy((Object)arrobject, (int)0, (Object)arrobject2, (int)12, (int)arrobject.length);
        return v.T(arrobject2);
    }

    public static v g0(Comparator comparator, Iterable arrobject) {
        m.j((Object)comparator);
        arrobject = B.k((Iterable)arrobject);
        O.b(arrobject);
        Arrays.sort((Object[])arrobject, (Comparator)comparator);
        return v.s(arrobject);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static v s(Object[] arrobject) {
        return v.D(arrobject, arrobject.length);
    }

    public h0 W() {
        return this.X(0);
    }

    public h0 X(int n8) {
        m.l(n8, this.size());
        if (this.isEmpty()) {
            return p;
        }
        return new b(this, n8);
    }

    @Override
    public final v a() {
        return this;
    }

    public final void add(int n8, Object object) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int n8, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object object) {
        if (this.indexOf(object) >= 0) {
            return true;
        }
        return false;
    }

    @Override
    public int d(Object[] arrobject, int n8) {
        int n9 = this.size();
        for (int i8 = 0; i8 < n9; ++i8) {
            arrobject[n8 + i8] = this.get(i8);
        }
        return n8 + n9;
    }

    public boolean equals(Object object) {
        return E.c(this, object);
    }

    public v f0() {
        if (this.size() <= 1) {
            return this;
        }
        return new c(this);
    }

    public v h0(int n8, int n9) {
        m.n(n8, n9, this.size());
        int n10 = n9 - n8;
        if (n10 == this.size()) {
            return this;
        }
        if (n10 == 0) {
            return v.Y();
        }
        return this.i0(n8, n9);
    }

    public int hashCode() {
        int n8 = this.size();
        int n9 = 1;
        for (int i8 = 0; i8 < n8; ++i8) {
            n9 = n9 * 31 + this.get(i8).hashCode();
        }
        return n9;
    }

    public v i0(int n8, int n9) {
        return new e(n8, n9 - n8);
    }

    public int indexOf(Object object) {
        if (object == null) {
            return -1;
        }
        return E.d(this, object);
    }

    public int lastIndexOf(Object object) {
        if (object == null) {
            return -1;
        }
        return E.f(this, object);
    }

    @Override
    public g0 q() {
        return this.W();
    }

    public final Object remove(int n8) {
        throw new UnsupportedOperationException();
    }

    public final Object set(int n8, Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object writeReplace() {
        return new d(this.toArray());
    }

    public static final class a
    extends t.a {
        public a() {
            this(4);
        }

        public a(int n8) {
            super(n8);
        }

        public a h(Object object) {
            super.d(object);
            return this;
        }

        public /* varargs */ a i(Object ... arrobject) {
            super.e(arrobject);
            return this;
        }

        public a j(Iterable iterable) {
            super.b(iterable);
            return this;
        }

        public v k() {
            this.c = true;
            return v.D(this.a, this.b);
        }
    }

    public static class b
    extends X2.a {
        public final v q;

        public b(v v8, int n8) {
            super(v8.size(), n8);
            this.q = v8;
        }

        @Override
        public Object b(int n8) {
            return this.q.get(n8);
        }
    }

    public static class c
    extends v {
        public final transient v q;

        public c(v v8) {
            this.q = v8;
        }

        @Override
        public boolean contains(Object object) {
            return this.q.contains(object);
        }

        @Override
        public v f0() {
            return this.q;
        }

        public Object get(int n8) {
            m.h(n8, this.size());
            return this.q.get(this.j0(n8));
        }

        @Override
        public v h0(int n8, int n9) {
            m.n(n8, n9, this.size());
            return this.q.h0(this.k0(n9), this.k0(n8)).f0();
        }

        @Override
        public int indexOf(Object object) {
            int n8 = this.q.lastIndexOf(object);
            if (n8 >= 0) {
                return this.j0(n8);
            }
            return -1;
        }

        public final int j0(int n8) {
            return this.size() - 1 - n8;
        }

        @Override
        public boolean k() {
            return this.q.k();
        }

        public final int k0(int n8) {
            return this.size() - n8;
        }

        @Override
        public int lastIndexOf(Object object) {
            int n8 = this.q.indexOf(object);
            if (n8 >= 0) {
                return this.j0(n8);
            }
            return -1;
        }

        public int size() {
            return this.q.size();
        }

        @Override
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static class d
    implements Serializable {
        private static final long serialVersionUID = 0L;
        public final Object[] o;

        public d(Object[] arrobject) {
            this.o = arrobject;
        }

        public Object readResolve() {
            return v.V(this.o);
        }
    }

    public class e
    extends v {
        public final transient int q;
        public final transient int r;

        public e(int n8, int n9) {
            this.q = n8;
            this.r = n9;
        }

        @Override
        public Object[] f() {
            return v.this.f();
        }

        @Override
        public int g() {
            return v.this.i() + this.q + this.r;
        }

        public Object get(int n8) {
            m.h(n8, this.r);
            return v.this.get(n8 + this.q);
        }

        @Override
        public v h0(int n8, int n9) {
            m.n(n8, n9, this.r);
            v v8 = v.this;
            int n10 = this.q;
            return v8.h0(n8 + n10, n9 + n10);
        }

        @Override
        public int i() {
            return v.this.i() + this.q;
        }

        @Override
        public boolean k() {
            return true;
        }

        public int size() {
            return this.r;
        }

        @Override
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

}

