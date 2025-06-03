// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package F0;

import java.util.concurrent.atomic.AtomicInteger;
import d0.q;
import d0.m;
import java.nio.ByteBuffer;
import java.util.Arrays;
import g0.y;
import d0.A;
import g0.M;

public abstract class p
{
    public static final int[] a;
    public static final int[] b;
    public static final int[] c;
    public static final int[] d;
    public static final int[] e;
    public static final int[] f;
    public static final int[] g;
    public static final int[] h;
    public static final int[] i;
    
    static {
        a = new int[] { 1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8 };
        b = new int[] { -1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1 };
        c = new int[] { 64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680 };
        d = new int[] { 8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000 };
        e = new int[] { 5, 8, 10, 12 };
        f = new int[] { 6, 9, 12, 15 };
        g = new int[] { 2, 4, 6, 8 };
        h = new int[] { 9, 11, 13, 16 };
        i = new int[] { 5, 8, 10, 12 };
    }
    
    public static void a(final byte[] array, final int n) {
        final int n2 = n - 2;
        if (((array[n - 1] & 0xFF) | (array[n2] << 8 & 0xFFFF)) == M.v(array, 0, n2, 65535)) {
            return;
        }
        throw A.a("CRC check failed", null);
    }
    
    public static int b(final byte[] array) {
        final boolean b = false;
        final byte b2 = array[0];
        int n3 = 0;
        boolean b5 = false;
        Label_0164: {
            int n = 0;
            byte b3 = 0;
            Label_0048: {
                if (b2 != -2) {
                    int n2;
                    byte b4;
                    if (b2 != -1) {
                        if (b2 != 31) {
                            n = ((array[5] & 0x3) << 12 | (array[6] & 0xFF) << 4);
                            b3 = array[7];
                            break Label_0048;
                        }
                        n2 = ((array[6] & 0x3) << 12 | (array[7] & 0xFF) << 4);
                        b4 = array[8];
                    }
                    else {
                        n2 = ((array[7] & 0x3) << 12 | (array[6] & 0xFF) << 4);
                        b4 = array[9];
                    }
                    n3 = ((b4 & 0x3C) >> 2 | n2) + 1;
                    b5 = true;
                    break Label_0164;
                }
                n = ((array[4] & 0x3) << 12 | (array[7] & 0xFF) << 4);
                b3 = array[6];
            }
            n3 = ((b3 & 0xF0) >> 4 | n) + 1;
            b5 = b;
        }
        int n4 = n3;
        if (b5) {
            n4 = n3 * 16 / 14;
        }
        return n4;
    }
    
    public static int c(final int n) {
        if (n == 2147385345 || n == -25230976 || n == 536864768 || n == -14745368) {
            return 1;
        }
        if (n == 1683496997 || n == 622876772) {
            return 2;
        }
        if (n == 1078008818 || n == -233094848) {
            return 3;
        }
        if (n != 1908687592 && n != -398277519) {
            return 0;
        }
        return 4;
    }
    
    public static y d(byte[] copy) {
        final byte b = copy[0];
        if (b != 127 && b != 100 && b != 64 && b != 113) {
            copy = Arrays.copyOf(copy, copy.length);
            if (e(copy)) {
                for (int i = 0; i < copy.length - 1; i += 2) {
                    final byte b2 = copy[i];
                    final int n = i + 1;
                    copy[i] = copy[n];
                    copy[n] = b2;
                }
            }
            final y y = new y(copy);
            if (copy[0] == 31) {
                final y y2 = new y(copy);
                while (y2.b() >= 16) {
                    y2.r(2);
                    y.f(y2.h(14), 14);
                }
            }
            y.n(copy);
            return y;
        }
        return new y(copy);
    }
    
    public static boolean e(final byte[] array) {
        boolean b = false;
        final byte b2 = array[0];
        if (b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24) {
            b = true;
        }
        return b;
    }
    
    public static int f(final ByteBuffer byteBuffer) {
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        final int position = byteBuffer.position();
        final byte value = byteBuffer.get(position);
        int n = 0;
        int n2 = 0;
        Label_0082: {
            if (value != -2) {
                int n3;
                if (value != -1) {
                    if (value != 31) {
                        n = (byteBuffer.get(position + 4) & 0x1) << 6;
                        n2 = position + 5;
                        break Label_0082;
                    }
                    n = (byteBuffer.get(position + 5) & 0x7) << 4;
                    n3 = position + 6;
                }
                else {
                    n = (byteBuffer.get(position + 4) & 0x7) << 4;
                    n3 = position + 7;
                }
                final int n4 = byteBuffer.get(n3) & 0x3C;
                return ((n4 >> 2 | n) + 1) * 32;
            }
            n = (byteBuffer.get(position + 5) & 0x1) << 6;
            n2 = position + 4;
        }
        final int n4 = byteBuffer.get(n2) & 0xFC;
        return ((n4 >> 2 | n) + 1) * 32;
    }
    
    public static int g(final byte[] array) {
        final byte b = array[0];
        int n = 0;
        byte b2 = 0;
        Label_0034: {
            if (b != -2) {
                byte b3;
                if (b != -1) {
                    if (b != 31) {
                        n = (array[4] & 0x1) << 6;
                        b2 = array[5];
                        break Label_0034;
                    }
                    n = (array[5] & 0x7) << 4;
                    b3 = array[6];
                }
                else {
                    n = (array[4] & 0x7) << 4;
                    b3 = array[7];
                }
                final int n2 = b3 & 0x3C;
                return ((n2 >> 2 | n) + 1) * 32;
            }
            n = (array[5] & 0x1) << 6;
            b2 = array[4];
        }
        final int n2 = b2 & 0xFC;
        return ((n2 >> 2 | n) + 1) * 32;
    }
    
    public static q h(final byte[] array, final String s, final String s2, final int n, final m m) {
        final y d = d(array);
        d.r(60);
        final int n2 = p.a[d.h(6)];
        final int n3 = p.b[d.h(4)];
        final int h = d.h(5);
        final int[] c = p.c;
        int n4;
        if (h >= c.length) {
            n4 = -1;
        }
        else {
            n4 = c[h] * 1000 / 2;
        }
        d.r(10);
        int n5;
        if (d.h(2) > 0) {
            n5 = 1;
        }
        else {
            n5 = 0;
        }
        return new q.b().a0(s).o0("audio/vnd.dts").M(n4).N(n2 + n5).p0(n3).U(m).e0(s2).m0(n).K();
    }
    
    public static b i(final byte[] array) {
        final y d = d(array);
        d.r(40);
        final int h = d.h(2);
        int n;
        int n2;
        if (!d.g()) {
            n = 16;
            n2 = 8;
        }
        else {
            n = 20;
            n2 = 12;
        }
        d.r(n2);
        final int h2 = d.h(n);
        final boolean g = d.g();
        int n3 = 0;
        final int n4 = 0;
        int h3;
        if (g) {
            h3 = d.h(2);
            final int h4 = d.h(3);
            if (d.g()) {
                d.r(36);
            }
            final int h5 = d.h(3);
            final int h6 = d.h(3);
            if (h5 + 1 != 1 || h6 + 1 != 1) {
                throw A.d("Multiple audio presentations or assets not supported");
            }
            final int n5 = h + 1;
            final int h7 = d.h(n5);
            for (int i = 0; i < n5; ++i) {
                if ((h7 >> i & 0x1) == 0x1) {
                    d.r(8);
                }
            }
            if (d.g()) {
                d.r(2);
                final int h8 = d.h(2);
                for (int h9 = d.h(2), j = n4; j < h9 + 1; ++j) {
                    d.r(h8 + 1 << 2);
                }
            }
            n3 = (h4 + 1) * 512;
        }
        else {
            h3 = -1;
        }
        d.r(n);
        d.r(12);
        int n6;
        int n7;
        if (g) {
            if (d.g()) {
                d.r(4);
            }
            if (d.g()) {
                d.r(24);
            }
            if (d.g()) {
                d.s(d.h(10) + 1);
            }
            d.r(5);
            n6 = p.d[d.h(4)];
            n7 = d.h(8) + 1;
        }
        else {
            n6 = -2147483647;
            n7 = -1;
        }
        long w0;
        if (g) {
            int n8;
            if (h3 != 0) {
                if (h3 != 1) {
                    if (h3 != 2) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported reference clock code in DTS HD header: ");
                        sb.append(h3);
                        throw A.a(sb.toString(), null);
                    }
                    n8 = 48000;
                }
                else {
                    n8 = 44100;
                }
            }
            else {
                n8 = 32000;
            }
            w0 = M.W0(n3, 1000000L, n8);
        }
        else {
            w0 = -9223372036854775807L;
        }
        return new b("audio/vnd.dts.hd;profile=lbr", n7, n6, h2 + 1, w0, 0, null);
    }
    
    public static int j(final byte[] array) {
        final y d = d(array);
        d.r(42);
        int n;
        if (d.g()) {
            n = 12;
        }
        else {
            n = 8;
        }
        return d.h(n) + 1;
    }
    
    public static b k(final byte[] array, final AtomicInteger atomicInteger) {
        final y d = d(array);
        final int h = d.h(32);
        final int n = 0;
        int n2;
        if (h == 1078008818) {
            n2 = 1;
        }
        else {
            n2 = 0;
        }
        final int n3 = m(d, p.e, true) + 1;
        long w0;
        int n7;
        if (n2 != 0) {
            if (!d.g()) {
                throw A.d("Only supports full channel mask-based audio presentation");
            }
            a(array, n3);
            final int h2 = d.h(2);
            int n4;
            if (h2 != 0) {
                if (h2 != 1) {
                    if (h2 != 2) {
                        final StringBuilder sb = new StringBuilder();
                        sb.append("Unsupported base duration index in DTS UHD header: ");
                        sb.append(h2);
                        throw A.a(sb.toString(), null);
                    }
                    n4 = 384;
                }
                else {
                    n4 = 480;
                }
            }
            else {
                n4 = 512;
            }
            final int h3 = d.h(3);
            final int h4 = d.h(2);
            int n5;
            if (h4 != 0) {
                if (h4 != 1) {
                    if (h4 != 2) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unsupported clock rate index in DTS UHD header: ");
                        sb2.append(h4);
                        throw A.a(sb2.toString(), null);
                    }
                    n5 = 48000;
                }
                else {
                    n5 = 44100;
                }
            }
            else {
                n5 = 32000;
            }
            if (d.g()) {
                d.r(36);
            }
            final int n6 = (1 << d.h(2)) * n5;
            w0 = M.W0(n4 * (h3 + 1), 1000000L, n5);
            n7 = n6;
        }
        else {
            n7 = -2147483647;
            w0 = -9223372036854775807L;
        }
        int n8;
        for (int i = n8 = 0; i < n2; ++i) {
            n8 += m(d, p.f, true);
        }
        if (n2 != 0) {
            atomicInteger.set(m(d, p.g, true));
        }
        int m = n;
        if (atomicInteger.get() != 0) {
            m = m(d, p.h, true);
        }
        return new b("audio/vnd.dts.uhd;profile=p2", 2, n7, n3 + (n8 + m), w0, 0, null);
    }
    
    public static int l(final byte[] array) {
        final y d = d(array);
        d.r(32);
        return m(d, p.i, true) + 1;
    }
    
    public static int m(final y y, final int[] array, final boolean b) {
        final int n = 0;
        int i = 0;
        int n3;
        for (int n2 = n3 = 0; n2 < 3 && y.g(); ++n2) {
            ++n3;
        }
        int n4 = n;
        if (b) {
            n4 = 0;
            while (i < n3) {
                n4 += 1 << array[i];
                ++i;
            }
        }
        return n4 + y.h(array[n3]);
    }
    
    public static final class b
    {
        public final String a;
        public final int b;
        public final int c;
        public final int d;
        public final long e;
        public final int f;
        
        public b(final String a, final int c, final int b, final int d, final long e, final int f) {
            this.a = a;
            this.c = c;
            this.b = b;
            this.d = d;
            this.e = e;
            this.f = f;
        }
    }
}
