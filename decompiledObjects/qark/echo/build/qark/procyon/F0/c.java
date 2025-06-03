// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import g0.y;
import java.nio.ByteBuffer;
import d0.q;
import d0.m;
import g0.z;

public abstract class c
{
    public static final int[] a;
    
    static {
        a = new int[] { 2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048 };
    }
    
    public static void a(final int n, final z z) {
        z.P(7);
        final byte[] e = z.e();
        e[0] = -84;
        e[1] = 64;
        e[3] = (e[2] = -1);
        e[4] = (byte)(n >> 16 & 0xFF);
        e[5] = (byte)(n >> 8 & 0xFF);
        e[6] = (byte)(n & 0xFF);
    }
    
    public static q b(final z z, final String s, final String s2, final m m) {
        z.U(1);
        int n;
        if ((z.G() & 0x20) >> 5 == 1) {
            n = 48000;
        }
        else {
            n = 44100;
        }
        return new q.b().a0(s).o0("audio/ac4").N(2).p0(n).U(m).e0(s2).K();
    }
    
    public static int c(final ByteBuffer byteBuffer) {
        final byte[] dst = new byte[16];
        final int position = byteBuffer.position();
        byteBuffer.get(dst);
        byteBuffer.position(position);
        return d(new y(dst)).e;
    }
    
    public static b d(final y y) {
        final int h = y.h(16);
        int n = y.h(16);
        int n2;
        if (n == 65535) {
            n = y.h(24);
            n2 = 7;
        }
        else {
            n2 = 4;
        }
        int n3 = n + n2;
        if (h == 44097) {
            n3 += 2;
        }
        final int h2 = y.h(2);
        int n4;
        if ((n4 = h2) == 3) {
            n4 = h2 + f(y, 2);
        }
        final int h3 = y.h(10);
        if (y.g() && y.h(3) > 0) {
            y.r(2);
        }
        int n5;
        if (y.g()) {
            n5 = 48000;
        }
        else {
            n5 = 44100;
        }
        final int h4 = y.h(4);
        int n6;
        if (n5 == 44100 && h4 == 13) {
            n6 = c.a[h4];
        }
        else {
            if (n5 == 48000) {
                final int[] a = c.a;
                if (h4 < a.length) {
                    final int n7 = a[h4];
                    final int n8 = h3 % 5;
                    while (true) {
                        Label_0253: {
                            if (n8 == 1) {
                                break Label_0253;
                            }
                            if (n8 != 2) {
                                if (n8 == 3) {
                                    break Label_0253;
                                }
                                if (n8 != 4) {
                                    n6 = n7;
                                    return new b(n4, 2, n5, n3, n6, null);
                                }
                                if (h4 != 3 && h4 != 8) {
                                    n6 = n7;
                                    if (h4 != 11) {
                                        return new b(n4, 2, n5, n3, n6, null);
                                    }
                                }
                            }
                            else if (h4 != 8) {
                                n6 = n7;
                                if (h4 != 11) {
                                    return new b(n4, 2, n5, n3, n6, null);
                                }
                            }
                            n6 = n7 + 1;
                            return new b(n4, 2, n5, n3, n6, null);
                        }
                        if (h4 == 3) {
                            continue;
                        }
                        n6 = n7;
                        if (h4 == 8) {
                            continue;
                        }
                        break;
                    }
                    return new b(n4, 2, n5, n3, n6, null);
                }
            }
            n6 = 0;
        }
        return new b(n4, 2, n5, n3, n6, null);
    }
    
    public static int e(final byte[] array, final int n) {
        final int length = array.length;
        int n2 = 7;
        if (length < 7) {
            return -1;
        }
        int n3 = (array[2] & 0xFF) << 8 | (array[3] & 0xFF);
        if (n3 == 65535) {
            n3 = ((array[4] & 0xFF) << 16 | (array[5] & 0xFF) << 8 | (array[6] & 0xFF));
        }
        else {
            n2 = 4;
        }
        int n4 = n2;
        if (n == 44097) {
            n4 = n2 + 2;
        }
        return n3 + n4;
    }
    
    public static int f(final y y, final int n) {
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n2 + y.h(n);
            if (!y.g()) {
                break;
            }
            n2 = n3 + 1 << n;
        }
        return n3;
    }
    
    public static final class b
    {
        public final int a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        
        public b(final int a, final int c, final int b, final int d, final int e) {
            this.a = a;
            this.c = c;
            this.b = b;
            this.d = d;
            this.e = e;
        }
    }
}
