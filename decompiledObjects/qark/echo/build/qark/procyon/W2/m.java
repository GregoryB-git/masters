// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W2;

public abstract class m
{
    public static String a(final int n, final int n2, final String s) {
        if (n < 0) {
            return r.a("%s (%s) must not be negative", s, n);
        }
        if (n2 >= 0) {
            return r.a("%s (%s) must be less than size (%s)", s, n, n2);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("negative size: ");
        sb.append(n2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static String b(final int n, final int n2, final String s) {
        if (n < 0) {
            return r.a("%s (%s) must not be negative", s, n);
        }
        if (n2 >= 0) {
            return r.a("%s (%s) must not be greater than size (%s)", s, n, n2);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("negative size: ");
        sb.append(n2);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public static String c(final int i, final int j, final int n) {
        if (i < 0 || i > n) {
            return b(i, n, "start index");
        }
        if (j >= 0 && j <= n) {
            return r.a("end index (%s) must not be less than start index (%s)", j, i);
        }
        return b(j, n, "end index");
    }
    
    public static void d(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException();
    }
    
    public static void e(final boolean b, final Object obj) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(String.valueOf(obj));
    }
    
    public static void f(final boolean b, final String s, final int i, final int j) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(r.a(s, i, j));
    }
    
    public static void g(final boolean b, final String s, final long l) {
        if (b) {
            return;
        }
        throw new IllegalArgumentException(r.a(s, l));
    }
    
    public static int h(final int n, final int n2) {
        return i(n, n2, "index");
    }
    
    public static int i(final int n, final int n2, final String s) {
        if (n >= 0 && n < n2) {
            return n;
        }
        throw new IndexOutOfBoundsException(a(n, n2, s));
    }
    
    public static Object j(final Object o) {
        o.getClass();
        return o;
    }
    
    public static Object k(final Object o, final Object obj) {
        if (o != null) {
            return o;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
    
    public static int l(final int n, final int n2) {
        return m(n, n2, "index");
    }
    
    public static int m(final int n, final int n2, final String s) {
        if (n >= 0 && n <= n2) {
            return n;
        }
        throw new IndexOutOfBoundsException(b(n, n2, s));
    }
    
    public static void n(final int n, final int n2, final int n3) {
        if (n >= 0 && n2 >= n && n2 <= n3) {
            return;
        }
        throw new IndexOutOfBoundsException(c(n, n2, n3));
    }
    
    public static void o(final boolean b) {
        if (b) {
            return;
        }
        throw new IllegalStateException();
    }
    
    public static void p(final boolean b, final Object obj) {
        if (b) {
            return;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }
    
    public static void q(final boolean b, final String s, final Object o) {
        if (b) {
            return;
        }
        throw new IllegalStateException(r.a(s, o));
    }
}
