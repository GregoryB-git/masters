// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import g0.o;
import d0.A;
import g0.y;

public abstract class a
{
    public static final int[] a;
    public static final int[] b;
    
    static {
        a = new int[] { 96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350 };
        b = new int[] { 0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1 };
    }
    
    public static byte[] a(final int n, final int n2, final int n3) {
        return new byte[] { (byte)((n << 3 & 0xF8) | (n2 >> 1 & 0x7)), (byte)((n2 << 7 & 0x80) | (n3 << 3 & 0x78)) };
    }
    
    public static int b(final y y) {
        int h;
        if ((h = y.h(5)) == 31) {
            h = y.h(6) + 32;
        }
        return h;
    }
    
    public static int c(final y y) {
        final int h = y.h(4);
        if (h == 15) {
            if (y.b() >= 24) {
                return y.h(24);
            }
            throw A.a("AAC header insufficient data", null);
        }
        else {
            if (h < 13) {
                return F0.a.a[h];
            }
            throw A.a("AAC header wrong Sampling Frequency Index", null);
        }
    }
    
    public static b d(final y y, final boolean b) {
        final int b2 = b(y);
        int c = c(y);
        final int h = y.h(4);
        final StringBuilder sb = new StringBuilder();
        sb.append("mp4a.40.");
        sb.append(b2);
        final String string = sb.toString();
        int b3 = 0;
        int h2 = 0;
        Label_0112: {
            if (b2 != 5) {
                b3 = b2;
                h2 = h;
                if (b2 != 29) {
                    break Label_0112;
                }
            }
            final int c2 = c(y);
            final int n = b3 = b(y);
            c = c2;
            h2 = h;
            if (n == 22) {
                h2 = y.h(4);
                c = c2;
                b3 = n;
            }
        }
        if (b) {
            if (b3 != 1 && b3 != 2 && b3 != 3 && b3 != 4 && b3 != 6 && b3 != 7 && b3 != 17) {
                switch (b3) {
                    default: {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unsupported audio object type: ");
                        sb2.append(b3);
                        throw A.d(sb2.toString());
                    }
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23: {
                        break;
                    }
                }
            }
            f(y, b3, h2);
            switch (b3) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23: {
                    final int h3 = y.h(2);
                    if (h3 != 2 && h3 != 3) {
                        break;
                    }
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Unsupported epConfig: ");
                    sb3.append(h3);
                    throw A.d(sb3.toString());
                }
            }
        }
        final int n2 = F0.a.b[h2];
        if (n2 != -1) {
            return new b(c, n2, string, null);
        }
        throw A.a(null, null);
    }
    
    public static b e(final byte[] array) {
        return d(new y(array), false);
    }
    
    public static void f(final y y, final int n, final int n2) {
        if (y.g()) {
            o.h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (y.g()) {
            y.r(14);
        }
        final boolean g = y.g();
        if (n2 != 0) {
            if (n == 6 || n == 20) {
                y.r(3);
            }
            if (g) {
                if (n == 22) {
                    y.r(16);
                }
                if (n == 17 || n == 19 || n == 20 || n == 23) {
                    y.r(3);
                }
                y.r(1);
            }
            return;
        }
        throw new UnsupportedOperationException();
    }
    
    public static final class b
    {
        public final int a;
        public final int b;
        public final String c;
        
        public b(final int a, final int b, final String c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
