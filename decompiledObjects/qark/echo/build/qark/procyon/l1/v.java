// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l1;

import Z2.e;
import Z2.d;
import g0.a;
import g0.y;
import d0.A;

public abstract class v
{
    public static int a(final int i) {
        if (i == 0) {
            return 768;
        }
        if (i == 1) {
            return 1024;
        }
        if (i == 2 || i == 3) {
            return 2048;
        }
        if (i == 4) {
            return 4096;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unsupported coreSbrFrameLengthIndex ");
        sb.append(i);
        throw A.d(sb.toString());
    }
    
    public static double b(final int i) {
        switch (i) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unsupported sampling rate ");
                sb.append(i);
                throw A.d(sb.toString());
            }
            case 44100:
            case 48000:
            case 88200:
            case 96000: {
                return 1.0;
            }
            case 29400:
            case 32000:
            case 58800:
            case 64000: {
                return 1.5;
            }
            case 22050:
            case 24000: {
                return 2.0;
            }
            case 14700:
            case 16000: {
                return 3.0;
            }
        }
    }
    
    public static int c(final int i) {
        switch (i) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unsupported sampling rate index ");
                sb.append(i);
                throw A.d(sb.toString());
            }
            case 27: {
                return 9600;
            }
            case 26: {
                return 12800;
            }
            case 25: {
                return 14400;
            }
            case 24: {
                return 17075;
            }
            case 23: {
                return 19200;
            }
            case 22: {
                return 20000;
            }
            case 21: {
                return 25600;
            }
            case 20: {
                return 28800;
            }
            case 19: {
                return 34150;
            }
            case 18: {
                return 38400;
            }
            case 17: {
                return 40000;
            }
            case 16: {
                return 51200;
            }
            case 15: {
                return 57600;
            }
            case 12: {
                return 7350;
            }
            case 11: {
                return 8000;
            }
            case 10: {
                return 11025;
            }
            case 9: {
                return 12000;
            }
            case 8: {
                return 16000;
            }
            case 7: {
                return 22050;
            }
            case 6: {
                return 24000;
            }
            case 5: {
                return 32000;
            }
            case 4: {
                return 44100;
            }
            case 3: {
                return 48000;
            }
            case 2: {
                return 64000;
            }
            case 1: {
                return 88200;
            }
            case 0: {
                return 96000;
            }
        }
    }
    
    public static int d(final int i) {
        if (i != 0 && i != 1) {
            int n = 2;
            if (i != 2) {
                n = 3;
                if (i != 3) {
                    if (i == 4) {
                        return 1;
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unsupported coreSbrFrameLengthIndex ");
                    sb.append(i);
                    throw A.d(sb.toString());
                }
            }
            return n;
        }
        return 0;
    }
    
    public static boolean e(final int n) {
        return (n & 0xFFFFFF) == 0xC001A5;
    }
    
    public static int f(final y y) {
        if (y.g()) {
            y.r(2);
            return y.h(13);
        }
        return 0;
    }
    
    public static boolean g(final y y, final b b) {
        y.d();
        final int k = k(y, 3, 8, 8);
        b.a = k;
        boolean b2 = false;
        if (k == -1) {
            return false;
        }
        final long l = l(y, 2, 8, 32);
        b.b = l;
        if (l == -1L) {
            return false;
        }
        if (l <= 16L) {
            if (l == 0L) {
                final int a = b.a;
                if (a == 1) {
                    throw A.a("Mpegh3daConfig packet with invalid packet label 0", null);
                }
                if (a == 2) {
                    throw A.a("Mpegh3daFrame packet with invalid packet label 0", null);
                }
                if (a == 17) {
                    throw A.a("AudioTruncation packet with invalid packet label 0", null);
                }
            }
            if ((b.c = k(y, 11, 24, 24)) != -1) {
                b2 = true;
            }
            return b2;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Contains sub-stream with an invalid packet label ");
        sb.append(b.b);
        throw A.d(sb.toString());
    }
    
    public static c h(final y y) {
        final int h = y.h(8);
        final int h2 = y.h(5);
        int n;
        if (h2 == 31) {
            n = y.h(24);
        }
        else {
            n = c(h2);
        }
        final int h3 = y.h(3);
        final int a = a(h3);
        final int d = d(h3);
        y.r(2);
        p(y);
        m(y, j(y), d);
        final boolean g = y.g();
        byte[] array = null;
        byte[] array2 = null;
        if (g) {
            final int k = k(y, 2, 4, 8);
            int n2 = 0;
            while (true) {
                array = array2;
                if (n2 >= k + 1) {
                    break;
                }
                final int i = k(y, 4, 8, 16);
                final int j = k(y, 4, 8, 16);
                if (i == 7) {
                    final int n3 = y.h(4) + 1;
                    y.r(4);
                    array2 = new byte[n3];
                    for (int l = 0; l < n3; ++l) {
                        array2[l] = (byte)y.h(8);
                    }
                }
                else {
                    y.r(j * 8);
                }
                ++n2;
            }
        }
        final double b = b(n);
        return new c(h, (int)(n * b), (int)(a * b), array, null);
    }
    
    public static boolean i(final y y) {
        y.r(3);
        final boolean g = y.g();
        if (g) {
            y.r(13);
        }
        return g;
    }
    
    public static int j(final y y) {
        final int h = y.h(5);
        int i = 0;
        int n = 0;
        while (i < h + 1) {
            final int h2 = y.h(3);
            n += k(y, 5, 8, 16) + 1;
            if ((h2 == 0 || h2 == 2) && y.g()) {
                p(y);
            }
            ++i;
        }
        return n;
    }
    
    public static int k(final y y, int a, int b, final int b2) {
        a.a(Math.max(Math.max(a, b), b2) <= 31);
        final int n = (1 << a) - 1;
        final int n2 = (1 << b) - 1;
        d.a(d.a(n, n2), 1 << b2);
        if (y.b() < a) {
            return -1;
        }
        final int h = y.h(a);
        if ((a = h) == n) {
            if (y.b() < b) {
                return -1;
            }
            final int h2 = y.h(b);
            b = (a = h + h2);
            if (h2 == n2) {
                if (y.b() < b2) {
                    return -1;
                }
                a = b + y.h(b2);
            }
        }
        return a;
    }
    
    public static long l(final y y, final int a, final int b, final int b2) {
        a.a(Math.max(Math.max(a, b), b2) <= 63);
        final long n = (1L << a) - 1L;
        final long n2 = (1L << b) - 1L;
        e.a(e.a(n, n2), 1L << b2);
        if (y.b() < a) {
            return -1L;
        }
        long j;
        final long n3 = j = y.j(a);
        if (n3 == n) {
            if (y.b() < b) {
                return -1L;
            }
            final long i = y.j(b);
            j = n3 + i;
            if (i == n2) {
                if (y.b() < b2) {
                    return -1L;
                }
                j += y.j(b2);
            }
        }
        return j;
    }
    
    public static void m(final y y, final int n, final int n2) {
        final int k = k(y, 4, 8, 16);
        y.q();
        for (int i = 0; i < k + 1; ++i) {
            final int h = y.h(2);
            if (h != 0) {
                if (h != 1) {
                    if (h == 3) {
                        k(y, 4, 8, 16);
                        final int j = k(y, 4, 8, 16);
                        if (y.g()) {
                            k(y, 8, 16, 0);
                        }
                        y.q();
                        if (j > 0) {
                            y.r(j * 8);
                        }
                    }
                }
                else {
                    if (i(y)) {
                        y.q();
                    }
                    int h2;
                    if (n2 > 0) {
                        o(y);
                        h2 = y.h(2);
                    }
                    else {
                        h2 = 0;
                    }
                    if (h2 > 0) {
                        y.r(6);
                        final int h3 = y.h(2);
                        y.r(4);
                        if (y.g()) {
                            y.r(5);
                        }
                        if (h2 == 2 || h2 == 3) {
                            y.r(6);
                        }
                        if (h3 == 2) {
                            y.q();
                        }
                    }
                    final int n3 = (int)Math.floor(Math.log(n - 1) / Math.log(2.0)) + 1;
                    final int h4 = y.h(2);
                    if (h4 > 0 && y.g()) {
                        y.r(n3);
                    }
                    if (y.g()) {
                        y.r(n3);
                    }
                    if (n2 == 0 && h4 == 0) {
                        y.q();
                    }
                }
            }
            else {
                i(y);
                if (n2 > 0) {
                    o(y);
                }
            }
        }
    }
    
    public static void n(final y y, final int n) {
        final boolean g = y.g();
        int n2 = 5;
        int n3;
        if (g) {
            n3 = 1;
        }
        else {
            n3 = 5;
        }
        if (g) {
            n2 = 7;
        }
        int n4;
        if (g) {
            n4 = 8;
        }
        else {
            n4 = 6;
        }
        int n6;
        for (int i = 0; i < n; i = n6 + 1) {
            int n5;
            if (y.g()) {
                y.r(7);
                n5 = 0;
            }
            else {
                if (y.h(2) == 3 && y.h(n2) * n3 != 0) {
                    y.q();
                }
                n5 = y.h(n4) * n3;
                if (n5 != 0 && n5 != 180) {
                    y.q();
                }
                y.q();
            }
            n6 = i;
            if (n5 != 0) {
                n6 = i;
                if (n5 != 180) {
                    n6 = i;
                    if (y.g()) {
                        n6 = i + 1;
                    }
                }
            }
        }
    }
    
    public static void o(final y y) {
        y.r(3);
        y.r(8);
        final boolean g = y.g();
        final boolean g2 = y.g();
        if (g) {
            y.r(5);
        }
        if (g2) {
            y.r(6);
        }
    }
    
    public static void p(final y y) {
        final int h = y.h(2);
        if (h == 0) {
            y.r(6);
            return;
        }
        final int n = k(y, 5, 8, 16) + 1;
        if (h == 1) {
            y.r(n * 7);
            return;
        }
        if (h == 2) {
            n(y, n);
        }
    }
    
    public static class b
    {
        public int a;
        public long b;
        public int c;
    }
    
    public static class c
    {
        public final int a;
        public final int b;
        public final int c;
        public final byte[] d;
        
        public c(final int a, final int b, final int c, final byte[] d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
    }
}
