/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.InvalidObjectException
 *  java.io.ObjectInputStream
 *  java.io.Serializable
 *  java.lang.AssertionError
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.lang.UnsupportedOperationException
 *  java.util.AbstractCollection
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 */
package X2;

import W2.m;
import X2.O;
import X2.Q;
import X2.g0;
import X2.i;
import X2.v;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class t
extends AbstractCollection
implements Serializable {
    public static final Object[] o = new Object[0];
    private static final long serialVersionUID = 912559L;

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public v a() {
        if (this.isEmpty()) {
            return v.Y();
        }
        return v.s(this.toArray());
    }

    public final boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean contains(Object var1);

    public abstract int d(Object[] var1, int var2);

    public Object[] f() {
        return null;
    }

    public int g() {
        throw new UnsupportedOperationException();
    }

    public int i() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean k();

    public abstract g0 q();

    public final boolean remove(Object object) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        return this.toArray(o);
    }

    public final Object[] toArray(Object[] arrobject) {
        Object[] arrobject2;
        m.j(arrobject);
        int n8 = this.size();
        if (arrobject.length < n8) {
            arrobject2 = this.f();
            if (arrobject2 != null) {
                return Q.a(arrobject2, this.i(), this.g(), arrobject);
            }
            arrobject2 = O.d(arrobject, n8);
        } else {
            arrobject2 = arrobject;
            if (arrobject.length > n8) {
                arrobject[n8] = null;
                arrobject2 = arrobject;
            }
        }
        this.d(arrobject2, 0);
        return arrobject2;
    }

    public Object writeReplace() {
        return new v.d(this.toArray());
    }

    public static abstract class a
    extends b {
        public Object[] a;
        public int b;
        public boolean c;

        public a(int n8) {
            i.b(n8, "initialCapacity");
            this.a = new Object[n8];
            this.b = 0;
        }

        @Override
        public b b(Iterable iterable) {
            if (iterable instanceof Collection) {
                Collection collection = (Collection)iterable;
                this.g(this.b + collection.size());
                if (collection instanceof t) {
                    this.b = ((t)collection).d(this.a, this.b);
                    return this;
                }
            }
            super.b(iterable);
            return this;
        }

        public a d(Object object) {
            m.j(object);
            this.g(this.b + 1);
            Object[] arrobject = this.a;
            int n8 = this.b;
            this.b = n8 + 1;
            arrobject[n8] = object;
            return this;
        }

        public /* varargs */ b e(Object ... arrobject) {
            this.f(arrobject, arrobject.length);
            return this;
        }

        public final void f(Object[] arrobject, int n8) {
            O.c(arrobject, n8);
            this.g(this.b + n8);
            System.arraycopy((Object)arrobject, (int)0, (Object)this.a, (int)this.b, (int)n8);
            this.b += n8;
        }

        /*
         * Enabled aggressive block sorting
         */
        public final void g(int n8) {
            Object[] arrobject = this.a;
            if (arrobject.length < n8) {
                this.a = Arrays.copyOf((Object[])arrobject, (int)b.c(arrobject.length, n8));
            } else {
                if (!this.c) {
                    return;
                }
                this.a = (Object[])arrobject.clone();
            }
            this.c = false;
        }
    }

    public static abstract class b {
        public static int c(int n8, int n9) {
            if (n9 >= 0) {
                int n10;
                n8 = n10 = n8 + (n8 >> 1) + 1;
                if (n10 < n9) {
                    n8 = Integer.highestOneBit((int)(n9 - 1)) << 1;
                }
                n9 = n8;
                if (n8 < 0) {
                    n9 = Integer.MAX_VALUE;
                }
                return n9;
            }
            throw new AssertionError((Object)"cannot store more than MAX_VALUE elements");
        }

        public abstract b a(Object var1);

        public b b(Iterable iterable) {
            iterable = iterable.iterator();
            while (iterable.hasNext()) {
                this.a(iterable.next());
            }
            return this;
        }
    }

}

