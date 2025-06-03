// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package b5;

import V4.b;

public class k
{
    public static final k[] i;
    public static k[] j;
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    
    static {
        k.j = (i = new k[] { new k(false, 3, 5, 8, 8, 1), new k(false, 5, 7, 10, 10, 1), new k(true, 5, 7, 16, 6, 1), new k(false, 8, 10, 12, 12, 1), new k(true, 10, 11, 14, 6, 2), new k(false, 12, 12, 14, 14, 1), new k(true, 16, 14, 24, 10, 1), new k(false, 18, 14, 16, 16, 1), new k(false, 22, 18, 18, 18, 1), new k(true, 22, 18, 16, 10, 2), new k(false, 30, 20, 20, 20, 1), new k(true, 32, 24, 16, 14, 2), new k(false, 36, 24, 22, 22, 1), new k(false, 44, 28, 24, 24, 1), new k(true, 49, 28, 22, 14, 2), new k(false, 62, 36, 14, 14, 4), new k(false, 86, 42, 16, 16, 4), new k(false, 114, 48, 18, 18, 4), new k(false, 144, 56, 20, 20, 4), new k(false, 174, 68, 22, 22, 4), new k(false, 204, 84, 24, 24, 4, 102, 42), new k(false, 280, 112, 14, 14, 16, 140, 56), new k(false, 368, 144, 16, 16, 16, 92, 36), new k(false, 456, 192, 18, 18, 16, 114, 48), new k(false, 576, 224, 20, 20, 16, 144, 56), new k(false, 696, 272, 22, 22, 16, 174, 68), new k(false, 816, 336, 24, 24, 16, 136, 56), new k(false, 1050, 408, 18, 18, 36, 175, 68), new k(false, 1304, 496, 20, 20, 36, 163, 62), new d() });
    }
    
    public k(final boolean b, final int n, final int n2, final int n3, final int n4, final int n5) {
        this(b, n, n2, n3, n4, n5, n, n2);
    }
    
    public k(final boolean a, final int b, final int c, final int d, final int e, final int f, final int g, final int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public static k l(final int i, final l l, final b b, final b b2, final boolean b3) {
        final k[] j = k.j;
        for (int length = j.length, k = 0; k < length; ++k) {
            final k m = j[k];
            if ((l != l.p || !m.a) && (l != l.q || m.a) && i <= m.b) {
                return m;
            }
        }
        if (!b3) {
            return null;
        }
        throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i)));
    }
    
    public final int a() {
        return this.b;
    }
    
    public int b(final int n) {
        return this.g;
    }
    
    public final int c() {
        return this.c;
    }
    
    public final int d(final int n) {
        return this.h;
    }
    
    public final int e() {
        final int f = this.f;
        int n = 1;
        if (f != 1) {
            n = 2;
            if (f != 2) {
                n = n;
                if (f != 4) {
                    if (f == 16) {
                        return 4;
                    }
                    if (f == 36) {
                        return 6;
                    }
                    throw new IllegalStateException("Cannot handle this number of data regions");
                }
            }
        }
        return n;
    }
    
    public int f() {
        return this.b / this.g;
    }
    
    public final int g() {
        return this.k() * this.e;
    }
    
    public final int h() {
        return this.e() * this.d;
    }
    
    public final int i() {
        return this.g() + (this.k() << 1);
    }
    
    public final int j() {
        return this.h() + (this.e() << 1);
    }
    
    public final int k() {
        final int f = this.f;
        if (f == 1 || f == 2) {
            return 1;
        }
        if (f == 4) {
            return 2;
        }
        if (f == 16) {
            return 4;
        }
        if (f == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        String str;
        if (this.a) {
            str = "Rectangular Symbol:";
        }
        else {
            str = "Square Symbol:";
        }
        sb.append(str);
        sb.append(" data region ");
        sb.append(this.d);
        sb.append('x');
        sb.append(this.e);
        sb.append(", symbol size ");
        sb.append(this.j());
        sb.append('x');
        sb.append(this.i());
        sb.append(", symbol data size ");
        sb.append(this.h());
        sb.append('x');
        sb.append(this.g());
        sb.append(", codewords ");
        sb.append(this.b);
        sb.append('+');
        sb.append(this.c);
        return sb.toString();
    }
}
