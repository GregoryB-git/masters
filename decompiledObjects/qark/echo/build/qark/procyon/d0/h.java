// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import java.util.Arrays;
import g0.M;

public final class h
{
    public static final h h;
    public static final h i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;
    
    static {
        h = new b().d(1).c(2).e(3).a();
        i = new b().d(1).c(1).e(2).a();
        j = M.w0(0);
        k = M.w0(1);
        l = M.w0(2);
        m = M.w0(3);
        n = M.w0(4);
        o = M.w0(5);
    }
    
    public h(final int a, final int b, final int c, final byte[] d, final int e, final int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static String b(final int i) {
        if (i != -1) {
            final StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("bit Chroma");
            return sb.toString();
        }
        return "NA";
    }
    
    public static String c(final int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i == 1) {
            return "Full range";
        }
        if (i != 2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Undefined color range ");
            sb.append(i);
            return sb.toString();
        }
        return "Limited range";
    }
    
    public static String d(final int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i == 1) {
            return "BT709";
        }
        if (i != 2) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Undefined color space ");
            sb.append(i);
            return sb.toString();
        }
        return "BT601";
    }
    
    public static String e(final int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i == 6) {
            return "ST2084 PQ";
        }
        if (i != 7) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Undefined color transfer ");
            sb.append(i);
            return sb.toString();
        }
        return "HLG";
    }
    
    public static boolean h(final h h) {
        boolean b = true;
        if (h == null) {
            return true;
        }
        final int a = h.a;
        if (a == -1 || a == 1 || a == 2) {
            final int b2 = h.b;
            if (b2 == -1 || b2 == 2) {
                final int c = h.c;
                if ((c == -1 || c == 3) && h.d == null) {
                    final int f = h.f;
                    if (f == -1 || f == 8) {
                        final int e = h.e;
                        if (e == -1) {
                            return b;
                        }
                        if (e == 8) {
                            return true;
                        }
                    }
                }
            }
        }
        b = false;
        return b;
    }
    
    public static int j(final int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 9) {
            return 6;
        }
        if (n != 4 && n != 5 && n != 6 && n != 7) {
            return -1;
        }
        return 2;
    }
    
    public static int k(final int n) {
        if (n != 1) {
            if (n == 4) {
                return 10;
            }
            if (n == 13) {
                return 2;
            }
            if (n == 16) {
                return 6;
            }
            if (n == 18) {
                return 7;
            }
            if (n != 6 && n != 7) {
                return -1;
            }
        }
        return 3;
    }
    
    public static String l(final int i) {
        if (i != -1) {
            final StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("bit Luma");
            return sb.toString();
        }
        return "NA";
    }
    
    public b a() {
        return new b(this, null);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (h.class != o.getClass()) {
            return false;
        }
        final h h = (h)o;
        return this.a == h.a && this.b == h.b && this.c == h.c && Arrays.equals(this.d, h.d) && this.e == h.e && this.f == h.f;
    }
    
    public boolean f() {
        return this.e != -1 && this.f != -1;
    }
    
    public boolean g() {
        return this.a != -1 && this.b != -1 && this.c != -1;
    }
    
    @Override
    public int hashCode() {
        if (this.g == 0) {
            this.g = (((((527 + this.a) * 31 + this.b) * 31 + this.c) * 31 + Arrays.hashCode(this.d)) * 31 + this.e) * 31 + this.f;
        }
        return this.g;
    }
    
    public boolean i() {
        return this.f() || this.g();
    }
    
    public String m() {
        String g;
        if (this.g()) {
            g = M.G("%s/%s/%s", d(this.a), c(this.b), e(this.c));
        }
        else {
            g = "NA/NA/NA";
        }
        String string;
        if (this.f()) {
            final StringBuilder sb = new StringBuilder();
            sb.append(this.e);
            sb.append("/");
            sb.append(this.f);
            string = sb.toString();
        }
        else {
            string = "NA/NA";
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(g);
        sb2.append("/");
        sb2.append(string);
        return sb2.toString();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        sb.append(d(this.a));
        sb.append(", ");
        sb.append(c(this.b));
        sb.append(", ");
        sb.append(e(this.c));
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(", ");
        sb.append(l(this.e));
        sb.append(", ");
        sb.append(b(this.f));
        sb.append(")");
        return sb.toString();
    }
    
    public static final class b
    {
        public int a;
        public int b;
        public int c;
        public byte[] d;
        public int e;
        public int f;
        
        public b() {
            this.a = -1;
            this.b = -1;
            this.c = -1;
            this.e = -1;
            this.f = -1;
        }
        
        public b(final h h) {
            this.a = h.a;
            this.b = h.b;
            this.c = h.c;
            this.d = h.d;
            this.e = h.e;
            this.f = h.f;
        }
        
        public h a() {
            return new h(this.a, this.b, this.c, this.d, this.e, this.f, null);
        }
        
        public b b(final int f) {
            this.f = f;
            return this;
        }
        
        public b c(final int b) {
            this.b = b;
            return this;
        }
        
        public b d(final int a) {
            this.a = a;
            return this;
        }
        
        public b e(final int c) {
            this.c = c;
            return this;
        }
        
        public b f(final byte[] d) {
            this.d = d;
            return this;
        }
        
        public b g(final int e) {
            this.e = e;
            return this;
        }
    }
}
