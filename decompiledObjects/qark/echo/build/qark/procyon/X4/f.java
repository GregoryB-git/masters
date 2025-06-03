// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X4;

import java.util.Iterator;
import java.util.LinkedList;
import Y4.a;

public final class f
{
    public static final f e;
    public final int a;
    public final g b;
    public final int c;
    public final int d;
    
    static {
        e = new f(g.b, 0, 0, 0);
    }
    
    public f(final g b, final int a, final int c, final int d) {
        this.b = b;
        this.a = a;
        this.c = c;
        this.d = d;
    }
    
    public f a(final int n) {
        final g b = this.b;
        final int a = this.a;
        final int d = this.d;
        g a2 = null;
        int n2 = 0;
        int n3 = 0;
        Label_0075: {
            if (a != 4) {
                a2 = b;
                n2 = a;
                n3 = d;
                if (a != 2) {
                    break Label_0075;
                }
            }
            final int n4 = X4.d.c[a][0];
            final int n5 = n4 >> 16;
            a2 = b.a(0xFFFF & n4, n5);
            n3 = d + n5;
            n2 = 0;
        }
        final int c = this.c;
        int n6;
        if (c != 0 && c != 31) {
            if (c == 62) {
                n6 = 9;
            }
            else {
                n6 = 8;
            }
        }
        else {
            n6 = 18;
        }
        f b2;
        final f f = b2 = new f(a2, n2, c + 1, n3 + n6);
        if (f.c == 2078) {
            b2 = f.b(n + 1);
        }
        return b2;
    }
    
    public f b(final int n) {
        final int c = this.c;
        if (c == 0) {
            return this;
        }
        return new f(this.b.b(n - c, c), this.a, 0, this.d);
    }
    
    public int c() {
        return this.c;
    }
    
    public int d() {
        return this.d;
    }
    
    public int e() {
        return this.a;
    }
    
    public boolean f(final f f) {
        final int n = this.d + (X4.d.c[this.a][f.a] >> 16);
        final int c = f.c;
        int n2 = n;
        if (c > 0) {
            final int c2 = this.c;
            if (c2 != 0) {
                n2 = n;
                if (c2 <= c) {
                    return n2 <= f.d;
                }
            }
            n2 = n + 10;
        }
        return n2 <= f.d;
    }
    
    public f g(final int n, final int n2) {
        final int d = this.d;
        final g b = this.b;
        final int a = this.a;
        int n3 = d;
        g a2 = b;
        if (n != a) {
            final int n4 = X4.d.c[a][n];
            final int n5 = n4 >> 16;
            a2 = b.a(0xFFFF & n4, n5);
            n3 = d + n5;
        }
        int n6;
        if (n == 2) {
            n6 = 4;
        }
        else {
            n6 = 5;
        }
        return new f(a2.a(n2, n6), n, 0, n3 + n6);
    }
    
    public f h(final int n, final int n2) {
        final g b = this.b;
        final int a = this.a;
        int n3;
        if (a == 2) {
            n3 = 4;
        }
        else {
            n3 = 5;
        }
        return new f(b.a(X4.d.e[a][n], n3).a(n2, 5), this.a, 0, this.d + n3 + 5);
    }
    
    public a i(final byte[] array) {
        final LinkedList<g> list = new LinkedList<g>();
        for (g g = this.b(array.length).b; g != null; g = g.d()) {
            list.addFirst(g);
        }
        final a a = new a();
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().c(a, array);
        }
        return a;
    }
    
    @Override
    public String toString() {
        return String.format("%s bits=%d bytes=%d", X4.d.b[this.a], this.d, this.c);
    }
}
