// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a3;

import java.util.Arrays;
import java.io.Serializable;
import java.util.RandomAccess;
import java.util.AbstractList;
import java.util.Collection;
import W2.m;
import java.util.Collections;
import java.util.List;

public abstract class f extends g
{
    public static List c(final int... array) {
        if (array.length == 0) {
            return Collections.emptyList();
        }
        return new a(array);
    }
    
    public static int d(final long n) {
        final int n2 = (int)n;
        m.g(n2 == n, "Out of range: %s", n);
        return n2;
    }
    
    public static int e(final int n, final int n2) {
        if (n < n2) {
            return -1;
        }
        if (n > n2) {
            return 1;
        }
        return 0;
    }
    
    public static int f(final int a, final int b, final int b2) {
        m.f(b <= b2, "min (%s) must be less than or equal to max (%s)", b, b2);
        return Math.min(Math.max(a, b), b2);
    }
    
    public static int g(final byte[] array) {
        m.f(array.length >= 4, "array too small: %s < %s", array.length, 4);
        return h(array[0], array[1], array[2], array[3]);
    }
    
    public static int h(final byte b, final byte b2, final byte b3, final byte b4) {
        return b << 24 | (b2 & 0xFF) << 16 | (b3 & 0xFF) << 8 | (b4 & 0xFF);
    }
    
    public static int i(final int n) {
        return n;
    }
    
    public static int j(final int[] array, final int n) {
        return k(array, n, 0, array.length);
    }
    
    public static int k(final int[] array, final int n, int i, final int n2) {
        while (i < n2) {
            if (array[i] == n) {
                return i;
            }
            ++i;
        }
        return -1;
    }
    
    public static int l(final int[] array, final int n, final int n2, int i) {
        for (--i; i >= n2; --i) {
            if (array[i] == n) {
                return i;
            }
        }
        return -1;
    }
    
    public static int m(final long n) {
        if (n > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (n < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int)n;
    }
    
    public static int[] n(final Collection collection) {
        if (collection instanceof a) {
            return ((a)collection).f();
        }
        final Object[] array = collection.toArray();
        final int length = array.length;
        final int[] array2 = new int[length];
        for (int i = 0; i < length; ++i) {
            array2[i] = ((Number)m.j(array[i])).intValue();
        }
        return array2;
    }
    
    public static Integer o(final String s) {
        return p(s, 10);
    }
    
    public static Integer p(final String s, final int n) {
        final Long d = h.d(s, n);
        if (d != null && d == d.intValue()) {
            return d.intValue();
        }
        return null;
    }
    
    public static class a extends AbstractList implements RandomAccess, Serializable
    {
        private static final long serialVersionUID = 0L;
        public final int[] o;
        public final int p;
        public final int q;
        
        public a(final int[] array) {
            this(array, 0, array.length);
        }
        
        public a(final int[] o, final int p3, final int q) {
            this.o = o;
            this.p = p3;
            this.q = q;
        }
        
        public Integer a(final int n) {
            m.h(n, this.size());
            return this.o[this.p + n];
        }
        
        @Override
        public boolean contains(final Object o) {
            return o instanceof Integer && k(this.o, (int)o, this.p, this.q) != -1;
        }
        
        public Integer d(final int n, final Integer n2) {
            m.h(n, this.size());
            final int[] o = this.o;
            final int p2 = this.p;
            final int i = o[p2 + n];
            o[p2 + n] = (int)m.j(n2);
            return i;
        }
        
        @Override
        public boolean equals(final Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof a)) {
                return super.equals(o);
            }
            final a a = (a)o;
            final int size = this.size();
            if (a.size() != size) {
                return false;
            }
            for (int i = 0; i < size; ++i) {
                if (this.o[this.p + i] != a.o[a.p + i]) {
                    return false;
                }
            }
            return true;
        }
        
        public int[] f() {
            return Arrays.copyOfRange(this.o, this.p, this.q);
        }
        
        @Override
        public int hashCode() {
            int i = this.p;
            int n = 1;
            while (i < this.q) {
                n = n * 31 + f.i(this.o[i]);
                ++i;
            }
            return n;
        }
        
        @Override
        public int indexOf(final Object o) {
            if (o instanceof Integer) {
                final int a = k(this.o, (int)o, this.p, this.q);
                if (a >= 0) {
                    return a - this.p;
                }
            }
            return -1;
        }
        
        @Override
        public boolean isEmpty() {
            return false;
        }
        
        @Override
        public int lastIndexOf(final Object o) {
            if (o instanceof Integer) {
                final int b = l(this.o, (int)o, this.p, this.q);
                if (b >= 0) {
                    return b - this.p;
                }
            }
            return -1;
        }
        
        @Override
        public int size() {
            return this.q - this.p;
        }
        
        @Override
        public List subList(final int n, final int n2) {
            m.n(n, n2, this.size());
            if (n == n2) {
                return Collections.emptyList();
            }
            final int[] o = this.o;
            final int p2 = this.p;
            return new a(o, n + p2, p2 + n2);
        }
        
        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder(this.size() * 5);
            sb.append('[');
            sb.append(this.o[this.p]);
            int p = this.p;
            while (true) {
                ++p;
                if (p >= this.q) {
                    break;
                }
                sb.append(", ");
                sb.append(this.o[p]);
            }
            sb.append(']');
            return sb.toString();
        }
    }
}
