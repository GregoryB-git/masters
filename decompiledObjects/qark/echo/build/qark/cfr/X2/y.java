/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.InvalidObjectException
 *  java.io.ObjectInputStream
 *  java.io.Serializable
 *  java.lang.Integer
 *  java.lang.Iterable
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Objects
 *  java.util.Set
 *  java.util.SortedSet
 */
package X2;

import W2.m;
import X2.O;
import X2.U;
import X2.a0;
import X2.b0;
import X2.g0;
import X2.s;
import X2.t;
import X2.v;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

public abstract class y
extends t
implements Set {
    private static final long serialVersionUID = 912559L;
    public transient v p;

    public static int M(int n8) {
        int n9 = Math.max((int)n8, (int)2);
        boolean bl = true;
        if (n9 < 751619276) {
            n8 = Integer.highestOneBit((int)(n9 - 1)) << 1;
            while ((double)n8 * 0.7 < (double)n9) {
                n8 <<= 1;
            }
            return n8;
        }
        if (n9 >= 1073741824) {
            bl = false;
        }
        m.e(bl, "collection too large");
        return 1073741824;
    }

    public static /* varargs */ y S(int n8, Object ... object) {
        if (n8 != 0) {
            if (n8 != 1) {
                int n9;
                Object[] arrobject;
                int n10;
                int n11 = y.M(n8);
                Object[] arrobject2 = new Object[n11];
                int n12 = n11 - 1;
                int n13 = n10 = (n9 = 0);
                int n14 = n10;
                block0 : for (n10 = n9; n10 < n8; ++n10) {
                    arrobject = O.a(object[n10], n10);
                    int n15 = arrobject.hashCode();
                    n9 = s.b(n15);
                    do {
                        Object object2;
                        int n16;
                        if ((object2 = arrobject2[n16 = n9 & n12]) == null) {
                            object[n13] = arrobject;
                            arrobject2[n16] = arrobject;
                            n14 += n15;
                            ++n13;
                            continue block0;
                        }
                        if (object2.equals((Object)arrobject)) {
                            continue block0;
                        }
                        ++n9;
                    } while (true);
                }
                Arrays.fill((Object[])object, (int)n13, (int)n8, (Object)null);
                if (n13 == 1) {
                    object = object[0];
                    Objects.requireNonNull((Object)object);
                    return new b0(object);
                }
                if (y.M(n13) < n11 / 2) {
                    return y.S(n13, (Object[])object);
                }
                arrobject = object;
                if (y.d0(n13, object.length)) {
                    arrobject = Arrays.copyOf((Object[])object, (int)n13);
                }
                return new U(arrobject, n14, arrobject2, n12, n13);
            }
            object = object[0];
            Objects.requireNonNull((Object)object);
            return y.Y(object);
        }
        return y.X();
    }

    public static y T(Collection arrobject) {
        y y8;
        if (arrobject instanceof y && !(arrobject instanceof SortedSet) && !(y8 = (y)arrobject).k()) {
            return y8;
        }
        arrobject = arrobject.toArray();
        return y.S(arrobject.length, arrobject);
    }

    public static y U(Object[] arrobject) {
        int n8 = arrobject.length;
        if (n8 != 0) {
            if (n8 != 1) {
                return y.S(arrobject.length, (Object[])arrobject.clone());
            }
            return y.Y(arrobject[0]);
        }
        return y.X();
    }

    public static y X() {
        return U.w;
    }

    public static y Y(Object object) {
        return new b0(object);
    }

    public static y Z(Object object, Object object2) {
        return y.S(2, object, object2);
    }

    public static y a0(Object object, Object object2, Object object3) {
        return y.S(3, object, object2, object3);
    }

    public static y b0(Object object, Object object2, Object object3, Object object4, Object object5) {
        return y.S(5, object, object2, object3, object4, object5);
    }

    public static /* varargs */ y c0(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object ... arrobject) {
        boolean bl = arrobject.length <= 2147483641;
        m.e(bl, "the total number of elements must fit in an int");
        int n8 = arrobject.length + 6;
        Object[] arrobject2 = new Object[n8];
        arrobject2[0] = object;
        arrobject2[1] = object2;
        arrobject2[2] = object3;
        arrobject2[3] = object4;
        arrobject2[4] = object5;
        arrobject2[5] = object6;
        System.arraycopy((Object)arrobject, (int)0, (Object)arrobject2, (int)6, (int)arrobject.length);
        return y.S(n8, arrobject2);
    }

    public static boolean d0(int n8, int n9) {
        if (n8 < (n9 >> 1) + (n9 >> 2)) {
            return true;
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public v V() {
        return v.s(this.toArray());
    }

    public boolean W() {
        return false;
    }

    @Override
    public v a() {
        v v8;
        v v9 = v8 = this.p;
        if (v8 == null) {
            this.p = v9 = this.V();
        }
        return v9;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof y && this.W() && ((y)((Object)object)).W() && this.hashCode() != object.hashCode()) {
            return false;
        }
        return a0.a(this, object);
    }

    public int hashCode() {
        return a0.d(this);
    }

    @Override
    public abstract g0 q();

    @Override
    public Object writeReplace() {
        return new b(this.toArray());
    }

    public static class a
    extends t.a {
        public Object[] d;
        public int e;

        public a() {
            super(4);
        }

        public a h(Object object) {
            m.j(object);
            if (this.d != null && y.M(this.b) <= this.d.length) {
                this.k(object);
                return this;
            }
            this.d = null;
            super.d(object);
            return this;
        }

        public /* varargs */ a i(Object ... arrobject) {
            if (this.d != null) {
                int n8 = arrobject.length;
                for (int i8 = 0; i8 < n8; ++i8) {
                    this.h(arrobject[i8]);
                }
            } else {
                super.e(arrobject);
            }
            return this;
        }

        public a j(Iterable iterable) {
            m.j((Object)iterable);
            if (this.d != null) {
                iterable = iterable.iterator();
                while (iterable.hasNext()) {
                    this.h(iterable.next());
                }
            } else {
                super.b(iterable);
            }
            return this;
        }

        public final void k(Object object) {
            Objects.requireNonNull((Object)this.d);
            int n8 = this.d.length;
            int n9 = object.hashCode();
            int n10 = s.b(n9);
            do {
                Object object2;
                Object[] arrobject;
                if ((object2 = (arrobject = this.d)[n10 &= n8 - 1]) == null) {
                    arrobject[n10] = object;
                    this.e += n9;
                    super.d(object);
                    return;
                }
                if (object2.equals(object)) {
                    return;
                }
                ++n10;
            } while (true);
        }

        public y l() {
            int n8 = this.b;
            if (n8 != 0) {
                if (n8 != 1) {
                    Object[] arrobject;
                    if (this.d != null && y.M(n8) == this.d.length) {
                        arrobject = y.d0(this.b, this.a.length) ? Arrays.copyOf((Object[])this.a, (int)this.b) : this.a;
                        n8 = this.e;
                        Object[] arrobject2 = this.d;
                        arrobject = new U(arrobject, n8, arrobject2, arrobject2.length - 1, this.b);
                    } else {
                        arrobject = y.S(this.b, this.a);
                        this.b = arrobject.size();
                    }
                    this.c = true;
                    this.d = null;
                    return arrobject;
                }
                Object object = this.a[0];
                Objects.requireNonNull((Object)object);
                return y.Y(object);
            }
            return y.X();
        }
    }

    public static class b
    implements Serializable {
        private static final long serialVersionUID = 0L;
        public final Object[] o;

        public b(Object[] arrobject) {
            this.o = arrobject;
        }

        public Object readResolve() {
            return y.U(this.o);
        }
    }

}

