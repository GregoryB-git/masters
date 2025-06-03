// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

public abstract class I
{
    public static final String[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    
    static {
        a = new String[] { "audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg" };
        b = new int[] { 44100, 48000, 32000 };
        c = new int[] { 32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000 };
        d = new int[] { 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000 };
        e = new int[] { 32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000 };
        f = new int[] { 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000 };
        g = new int[] { 8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000 };
    }
    
    public static /* synthetic */ String[] b() {
        return I.a;
    }
    
    public static /* synthetic */ int[] c() {
        return I.b;
    }
    
    public static /* synthetic */ int[] e() {
        return I.c;
    }
    
    public static /* synthetic */ int[] f() {
        return I.d;
    }
    
    public static /* synthetic */ int[] g() {
        return I.e;
    }
    
    public static /* synthetic */ int[] h() {
        return I.f;
    }
    
    public static /* synthetic */ int[] i() {
        return I.g;
    }
    
    public static int j(int n) {
        if (!l(n)) {
            return -1;
        }
        final int n2 = n >>> 19 & 0x3;
        if (n2 == 1) {
            return -1;
        }
        final int n3 = n >>> 17 & 0x3;
        if (n3 == 0) {
            return -1;
        }
        final int n4 = n >>> 12 & 0xF;
        if (n4 == 0) {
            return -1;
        }
        if (n4 == 15) {
            return -1;
        }
        final int n5 = n >>> 10 & 0x3;
        if (n5 == 3) {
            return -1;
        }
        final int n6 = I.b[n5];
        int n7;
        if (n2 == 2) {
            n7 = n6 / 2;
        }
        else {
            n7 = n6;
            if (n2 == 0) {
                n7 = n6 / 4;
            }
        }
        final int n8 = n >>> 9 & 0x1;
        if (n3 == 3) {
            if (n2 == 3) {
                n = I.c[n4 - 1];
            }
            else {
                n = I.d[n4 - 1];
            }
            return (n * 12 / n7 + n8) * 4;
        }
        if (n2 == 3) {
            if (n3 == 2) {
                n = I.e[n4 - 1];
            }
            else {
                n = I.f[n4 - 1];
            }
        }
        else {
            n = I.g[n4 - 1];
        }
        int n9 = 144;
        if (n2 == 3) {
            return n * 144 / n7 + n8;
        }
        if (n3 == 1) {
            n9 = 72;
        }
        return n9 * n / n7 + n8;
    }
    
    public static int k(final int n, final int n2) {
        if (n2 != 1) {
            if (n2 == 2) {
                return 1152;
            }
            if (n2 == 3) {
                return 384;
            }
            throw new IllegalArgumentException();
        }
        else {
            if (n == 3) {
                return 1152;
            }
            return 576;
        }
    }
    
    public static boolean l(final int n) {
        return (n & 0xFFE00000) == 0xFFE00000;
    }
    
    public static int m(final int n) {
        if (!l(n)) {
            return -1;
        }
        final int n2 = n >>> 19 & 0x3;
        if (n2 == 1) {
            return -1;
        }
        final int n3 = n >>> 17 & 0x3;
        if (n3 == 0) {
            return -1;
        }
        final int n4 = n >>> 12 & 0xF;
        if (n4 == 0 || n4 == 15) {
            return -1;
        }
        if ((n >>> 10 & 0x3) == 0x3) {
            return -1;
        }
        return k(n2, n3);
    }
    
    public static final class a
    {
        public int a;
        public String b;
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;
        
        public a() {
        }
        
        public a(final a a) {
            this.a = a.a;
            this.b = a.b;
            this.c = a.c;
            this.d = a.d;
            this.e = a.e;
            this.f = a.f;
            this.g = a.g;
        }
        
        public boolean a(final int n) {
            if (!l(n)) {
                return false;
            }
            final int a = n >>> 19 & 0x3;
            if (a == 1) {
                return false;
            }
            final int n2 = n >>> 17 & 0x3;
            if (n2 == 0) {
                return false;
            }
            final int n3 = n >>> 12 & 0xF;
            if (n3 == 0) {
                return false;
            }
            if (n3 == 15) {
                return false;
            }
            final int n4 = n >>> 10 & 0x3;
            if (n4 == 3) {
                return false;
            }
            this.a = a;
            this.b = I.b()[3 - n2];
            final int d = I.c()[n4];
            this.d = d;
            final int n5 = 2;
            Label_0138: {
                int d2;
                if (a == 2) {
                    d2 = d / 2;
                }
                else {
                    if (a != 0) {
                        break Label_0138;
                    }
                    d2 = d / 4;
                }
                this.d = d2;
            }
            final int n6 = n >>> 9 & 0x1;
            this.g = k(a, n2);
            Label_0318: {
                int c;
                if (n2 == 3) {
                    int f;
                    if (a == 3) {
                        f = I.e()[n3 - 1];
                    }
                    else {
                        f = I.f()[n3 - 1];
                    }
                    this.f = f;
                    c = (f * 12 / this.d + n6) * 4;
                }
                else {
                    int n7 = 144;
                    if (a != 3) {
                        final int f2 = I.i()[n3 - 1];
                        this.f = f2;
                        if (n2 == 1) {
                            n7 = 72;
                        }
                        this.c = n7 * f2 / this.d + n6;
                        break Label_0318;
                    }
                    int f3;
                    if (n2 == 2) {
                        f3 = I.g()[n3 - 1];
                    }
                    else {
                        f3 = I.h()[n3 - 1];
                    }
                    this.f = f3;
                    c = f3 * 144 / this.d + n6;
                }
                this.c = c;
            }
            int e = n5;
            if ((n >> 6 & 0x3) == 0x3) {
                e = 1;
            }
            this.e = e;
            return true;
        }
    }
}
