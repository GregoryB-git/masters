// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l6;

public abstract class f extends e
{
    public static int a(final int n, final int n2) {
        int n3 = n;
        if (n < n2) {
            n3 = n2;
        }
        return n3;
    }
    
    public static int b(final int n, final int n2) {
        int n3 = n;
        if (n > n2) {
            n3 = n2;
        }
        return n3;
    }
    
    public static long c(final long n, final long n2) {
        long n3 = n;
        if (n > n2) {
            n3 = n2;
        }
        return n3;
    }
    
    public static int d(final int n, final int i, final int j) {
        if (i > j) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(j);
            sb.append(" is less than minimum ");
            sb.append(i);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (n < i) {
            return i;
        }
        if (n > j) {
            return j;
        }
        return n;
    }
    
    public static long e(final long n, final long lng, final long lng2) {
        if (lng > lng2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(lng2);
            sb.append(" is less than minimum ");
            sb.append(lng);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (n < lng) {
            return lng;
        }
        if (n > lng2) {
            return lng2;
        }
        return n;
    }
    
    public static a f(final int n, final int n2) {
        return a.r.a(n, n2, -1);
    }
    
    public static c g(final int n, final int n2) {
        if (n2 <= Integer.MIN_VALUE) {
            return c.s.a();
        }
        return new c(n, n2 - 1);
    }
}
