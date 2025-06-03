/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.AbstractList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.RandomAccess
 */
package a3;

import W2.m;
import a3.g;
import a3.h;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public abstract class f
extends g {
    public static /* varargs */ List c(int ... arrn) {
        if (arrn.length == 0) {
            return Collections.emptyList();
        }
        return new a(arrn);
    }

    public static int d(long l8) {
        int n8 = (int)l8;
        boolean bl = (long)n8 == l8;
        m.g(bl, "Out of range: %s", l8);
        return n8;
    }

    public static int e(int n8, int n9) {
        if (n8 < n9) {
            return -1;
        }
        if (n8 > n9) {
            return 1;
        }
        return 0;
    }

    public static int f(int n8, int n9, int n10) {
        boolean bl = n9 <= n10;
        m.f(bl, "min (%s) must be less than or equal to max (%s)", n9, n10);
        return Math.min((int)Math.max((int)n8, (int)n9), (int)n10);
    }

    public static int g(byte[] arrby) {
        boolean bl = arrby.length >= 4;
        m.f(bl, "array too small: %s < %s", arrby.length, 4);
        return f.h(arrby[0], arrby[1], arrby[2], arrby[3]);
    }

    public static int h(byte by, byte by2, byte by3, byte by4) {
        return by << 24 | (by2 & 255) << 16 | (by3 & 255) << 8 | by4 & 255;
    }

    public static int i(int n8) {
        return n8;
    }

    public static int j(int[] arrn, int n8) {
        return f.k(arrn, n8, 0, arrn.length);
    }

    public static int k(int[] arrn, int n8, int n9, int n10) {
        while (n9 < n10) {
            if (arrn[n9] == n8) {
                return n9;
            }
            ++n9;
        }
        return -1;
    }

    public static int l(int[] arrn, int n8, int n9, int n10) {
        --n10;
        while (n10 >= n9) {
            if (arrn[n10] == n8) {
                return n10;
            }
            --n10;
        }
        return -1;
    }

    public static int m(long l8) {
        if (l8 > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (l8 < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int)l8;
    }

    public static int[] n(Collection arrobject) {
        if (arrobject instanceof a) {
            return ((a)arrobject).f();
        }
        arrobject = arrobject.toArray();
        int n8 = arrobject.length;
        int[] arrn = new int[n8];
        for (int i8 = 0; i8 < n8; ++i8) {
            arrn[i8] = ((Number)m.j(arrobject[i8])).intValue();
        }
        return arrn;
    }

    public static Integer o(String string2) {
        return f.p(string2, 10);
    }

    public static Integer p(String string2, int n8) {
        if ((string2 = h.d(string2, n8)) != null && string2.longValue() == (long)string2.intValue()) {
            return string2.intValue();
        }
        return null;
    }

    public static class a
    extends AbstractList
    implements RandomAccess,
    Serializable {
        private static final long serialVersionUID = 0L;
        public final int[] o;
        public final int p;
        public final int q;

        public a(int[] arrn) {
            this(arrn, 0, arrn.length);
        }

        public a(int[] arrn, int n8, int n9) {
            this.o = arrn;
            this.p = n8;
            this.q = n9;
        }

        public Integer a(int n8) {
            m.h(n8, this.size());
            return this.o[this.p + n8];
        }

        public boolean contains(Object object) {
            if (object instanceof Integer && f.k(this.o, (Integer)object, this.p, this.q) != -1) {
                return true;
            }
            return false;
        }

        public Integer d(int n8, Integer n9) {
            m.h(n8, this.size());
            int[] arrn = this.o;
            int n10 = this.p;
            int n11 = arrn[n10 + n8];
            arrn[n10 + n8] = (Integer)m.j((Object)n9);
            return n11;
        }

        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (object instanceof a) {
                object = (a)((Object)object);
                int n8 = this.size();
                if (object.size() != n8) {
                    return false;
                }
                for (int i8 = 0; i8 < n8; ++i8) {
                    if (this.o[this.p + i8] == object.o[object.p + i8]) continue;
                    return false;
                }
                return true;
            }
            return super.equals(object);
        }

        public int[] f() {
            return Arrays.copyOfRange((int[])this.o, (int)this.p, (int)this.q);
        }

        public int hashCode() {
            int n8 = 1;
            for (int i8 = this.p; i8 < this.q; ++i8) {
                n8 = n8 * 31 + f.i(this.o[i8]);
            }
            return n8;
        }

        public int indexOf(Object object) {
            int n8;
            if (object instanceof Integer && (n8 = f.k(this.o, (Integer)object, this.p, this.q)) >= 0) {
                return n8 - this.p;
            }
            return -1;
        }

        public boolean isEmpty() {
            return false;
        }

        public int lastIndexOf(Object object) {
            int n8;
            if (object instanceof Integer && (n8 = f.l(this.o, (Integer)object, this.p, this.q)) >= 0) {
                return n8 - this.p;
            }
            return -1;
        }

        public int size() {
            return this.q - this.p;
        }

        public List subList(int n8, int n9) {
            m.n(n8, n9, this.size());
            if (n8 == n9) {
                return Collections.emptyList();
            }
            int[] arrn = this.o;
            int n10 = this.p;
            return new a(arrn, n8 + n10, n10 + n9);
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(this.size() * 5);
            stringBuilder.append('[');
            stringBuilder.append(this.o[this.p]);
            int n8 = this.p;
            while (++n8 < this.q) {
                stringBuilder.append(", ");
                stringBuilder.append(this.o[n8]);
            }
            stringBuilder.append(']');
            return stringBuilder.toString();
        }
    }

}

