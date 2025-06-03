// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X0;

import F0.s;
import g0.z;

public final class f
{
    public final z a;
    public int b;
    
    public f() {
        this.a = new z(8);
    }
    
    public final long a(final s s) {
        final byte[] e = this.a.e();
        int i = 0;
        s.n(e, 0, 1);
        final int n = this.a.e()[0] & 0xFF;
        if (n == 0) {
            return Long.MIN_VALUE;
        }
        int n2;
        int n3;
        for (n2 = 128, n3 = 0; (n & n2) == 0x0; n2 >>= 1, ++n3) {}
        int n4 = n & n2;
        s.n(this.a.e(), 1, n3);
        while (i < n3) {
            final byte[] e2 = this.a.e();
            ++i;
            n4 = (e2[i] & 0xFF) + (n4 << 8);
        }
        this.b += n3 + 1;
        return n4;
    }
    
    public boolean b(final s s) {
        final long a = s.a();
        final long n = lcmp(a, -1L);
        long n2 = 1024L;
        if (n != 0) {
            if (a > 1024L) {
                n2 = n2;
            }
            else {
                n2 = a;
            }
        }
        final int n3 = (int)n2;
        final byte[] e = this.a.e();
        final boolean b = false;
        s.n(e, 0, 4);
        long i = this.a.I();
        this.b = 4;
        while (i != 440786851L) {
            if (++this.b == n3) {
                return false;
            }
            s.n(this.a.e(), 0, 1);
            i = ((i << 8 & 0xFFFFFFFFFFFFFF00L) | (long)(this.a.e()[0] & 0xFF));
        }
        final long a2 = this.a(s);
        final long n4 = this.b;
        boolean b2 = b;
        if (a2 != Long.MIN_VALUE) {
            if (n != 0 && n4 + a2 >= a) {
                return false;
            }
            while (true) {
                final int b3 = this.b;
                final long n5 = b3;
                final long n6 = n4 + a2;
                if (n5 < n6) {
                    if (this.a(s) == Long.MIN_VALUE) {
                        return false;
                    }
                    final long a3 = this.a(s);
                    final long n7 = lcmp(a3, 0L);
                    if (n7 < 0) {
                        return false;
                    }
                    if (a3 > 2147483647L) {
                        return false;
                    }
                    if (n7 == 0) {
                        continue;
                    }
                    final int n8 = (int)a3;
                    s.o(n8);
                    this.b += n8;
                }
                else {
                    b2 = b;
                    if (b3 == n6) {
                        b2 = true;
                        break;
                    }
                    break;
                }
            }
        }
        return b2;
    }
}
