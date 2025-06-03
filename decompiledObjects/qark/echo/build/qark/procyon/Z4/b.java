// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z4;

public final class b
{
    public final a a;
    public final int[] b;
    
    public b(final a a, final int[] b) {
        if (b.length == 0) {
            throw new IllegalArgumentException();
        }
        this.a = a;
        final int length = b.length;
        int n = 1;
        if (length <= 1 || b[0] != 0) {
            this.b = b;
            return;
        }
        while (n < length && b[n] == 0) {
            ++n;
        }
        if (n == length) {
            this.b = new int[] { 0 };
            return;
        }
        final int[] b2 = new int[length - n];
        System.arraycopy(b, n, this.b = b2, 0, b2.length);
    }
    
    public b a(final b b) {
        if (!this.a.equals(b.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (this.f()) {
            return b;
        }
        if (b.f()) {
            return this;
        }
        int[] b2 = this.b;
        final int[] b3 = b.b;
        int[] array;
        if (b2.length > b3.length) {
            array = b2;
            b2 = b3;
        }
        else {
            array = b3;
        }
        final int[] array2 = new int[array.length];
        final int n = array.length - b2.length;
        System.arraycopy(array, 0, array2, 0, n);
        for (int i = n; i < array.length; ++i) {
            array2[i] = Z4.a.a(b2[i - n], array[i]);
        }
        return new b(this.a, array2);
    }
    
    public b[] b(final b b) {
        if (!this.a.equals(b.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (!b.f()) {
            b b2 = this.a.e();
            final int f = this.a.f(b.c(b.e()));
            b a;
            b h2;
            for (a = this; a.e() >= b.e() && !a.f(); a = a.a(h2)) {
                final int n = a.e() - b.e();
                final int h = this.a.h(a.c(a.e()), f);
                h2 = b.h(n, h);
                b2 = b2.a(this.a.b(n, h));
            }
            return new b[] { b2, a };
        }
        throw new IllegalArgumentException("Divide by 0");
    }
    
    public int c(final int n) {
        final int[] b = this.b;
        return b[b.length - 1 - n];
    }
    
    public int[] d() {
        return this.b;
    }
    
    public int e() {
        return this.b.length - 1;
    }
    
    public boolean f() {
        return this.b[0] == 0;
    }
    
    public b g(final b b) {
        if (!this.a.equals(b.a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (!this.f() && !b.f()) {
            final int[] b2 = this.b;
            final int length = b2.length;
            final int[] b3 = b.b;
            final int length2 = b3.length;
            final int[] array = new int[length + length2 - 1];
            for (int i = 0; i < length; ++i) {
                final int n = b2[i];
                for (int j = 0; j < length2; ++j) {
                    final int n2 = i + j;
                    array[n2] = Z4.a.a(array[n2], this.a.h(n, b3[j]));
                }
            }
            return new b(this.a, array);
        }
        return this.a.e();
    }
    
    public b h(int i, final int n) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (n == 0) {
            return this.a.e();
        }
        final int length = this.b.length;
        final int[] array = new int[i + length];
        for (i = 0; i < length; ++i) {
            array[i] = this.a.h(this.b[i], n);
        }
        return new b(this.a, array);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.e() * 8);
        for (int i = this.e(); i >= 0; --i) {
            final int c = this.c(i);
            if (c != 0) {
                int n;
                if (c < 0) {
                    sb.append(" - ");
                    n = -c;
                }
                else {
                    n = c;
                    if (sb.length() > 0) {
                        sb.append(" + ");
                        n = c;
                    }
                }
                Label_0140: {
                    if (i == 0 || n != 1) {
                        final int g = this.a.g(n);
                        char c2;
                        if (g == 0) {
                            c2 = '1';
                        }
                        else {
                            if (g != 1) {
                                sb.append("a^");
                                sb.append(g);
                                break Label_0140;
                            }
                            c2 = 'a';
                        }
                        sb.append(c2);
                    }
                }
                if (i != 0) {
                    if (i == 1) {
                        sb.append('x');
                    }
                    else {
                        sb.append("x^");
                        sb.append(i);
                    }
                }
            }
        }
        return sb.toString();
    }
}
