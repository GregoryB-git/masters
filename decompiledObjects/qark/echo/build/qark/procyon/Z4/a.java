// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z4;

public final class a
{
    public static final a h;
    public static final a i;
    public static final a j;
    public static final a k;
    public static final a l;
    public static final a m;
    public static final a n;
    public static final a o;
    public final int[] a;
    public final int[] b;
    public final b c;
    public final b d;
    public final int e;
    public final int f;
    public final int g;
    
    static {
        h = new a(4201, 4096, 1);
        i = new a(1033, 1024, 1);
        final a o2 = j = new a(67, 64, 1);
        k = new a(19, 16, 1);
        l = new a(285, 256, 0);
        n = (m = new a(301, 256, 1));
        o = o2;
    }
    
    public a(int i, final int e, int g) {
        this.f = i;
        this.e = e;
        this.g = g;
        this.a = new int[e];
        this.b = new int[e];
        g = 1;
        for (int j = 0; j < e; ++j) {
            this.a[j] = g;
            final int n = g << 1;
            if ((g = n) >= e) {
                g = ((n ^ i) & e - 1);
            }
        }
        for (i = 0; i < e - 1; ++i) {
            this.b[this.a[i]] = i;
        }
        this.c = new b(this, new int[] { 0 });
        this.d = new b(this, new int[] { 1 });
    }
    
    public static int a(final int n, final int n2) {
        return n ^ n2;
    }
    
    public b b(final int n, final int n2) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n2 == 0) {
            return this.c;
        }
        final int[] array = new int[n + 1];
        array[0] = n2;
        return new b(this, array);
    }
    
    public int c(final int n) {
        return this.a[n];
    }
    
    public int d() {
        return this.g;
    }
    
    public b e() {
        return this.c;
    }
    
    public int f(final int n) {
        if (n != 0) {
            return this.a[this.e - this.b[n] - 1];
        }
        throw new ArithmeticException();
    }
    
    public int g(final int n) {
        if (n != 0) {
            return this.b[n];
        }
        throw new IllegalArgumentException();
    }
    
    public int h(final int n, final int n2) {
        if (n != 0 && n2 != 0) {
            final int[] a = this.a;
            final int[] b = this.b;
            return a[(b[n] + b[n2]) % (this.e - 1)];
        }
        return 0;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.f));
        sb.append(',');
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
