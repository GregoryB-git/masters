/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package X0;

import F0.s;
import g0.z;

public final class f {
    public final z a = new z(8);
    public int b;

    public final long a(s arrby) {
        byte[] arrby2 = this.a.e();
        int n8 = 0;
        arrby.n(arrby2, 0, 1);
        int n9 = this.a.e()[0] & 255;
        if (n9 == 0) {
            return Long.MIN_VALUE;
        }
        int n10 = 128;
        int n11 = 0;
        while ((n9 & n10) == 0) {
            n10 >>= 1;
            ++n11;
        }
        n10 = n9 & n10;
        arrby.n(this.a.e(), 1, n11);
        while (n8 < n11) {
            arrby = this.a.e();
            n10 = (arrby[++n8] & 255) + (n10 << 8);
        }
        this.b += n11 + 1;
        return n10;
    }

    public boolean b(s s8) {
        long l8;
        long l9 = s8.a();
        long l10 = l9 LCMP -1L;
        long l11 = l8 = 1024L;
        if (l10 != false) {
            l11 = l9 > 1024L ? l8 : l9;
        }
        int n8 = (int)l11;
        byte[] arrby = this.a.e();
        boolean bl = false;
        s8.n(arrby, 0, 4);
        l11 = this.a.I();
        this.b = 4;
        while (l11 != 440786851L) {
            int n9;
            this.b = n9 = this.b + 1;
            if (n9 == n8) {
                return false;
            }
            s8.n(this.a.e(), 0, 1);
            l11 = l11 << 8 & -256L | (long)(this.a.e()[0] & 255);
        }
        l11 = this.a(s8);
        l8 = this.b;
        boolean bl2 = bl;
        if (l11 != Long.MIN_VALUE) {
            long l12;
            if (l10 != false && l8 + l11 >= l9) {
                return false;
            }
            while ((l9 = (long)(l10 = (long)this.b)) < (l12 = l8 + l11)) {
                if (this.a(s8) == Long.MIN_VALUE) {
                    return false;
                }
                l9 = this.a(s8);
                l10 = l9 LCMP 0L;
                if (l10 >= 0) {
                    if (l9 > Integer.MAX_VALUE) {
                        return false;
                    }
                    if (l10 == false) continue;
                    l10 = (int)l9;
                    s8.o((int)l10);
                    this.b += l10;
                    continue;
                }
                return false;
            }
            bl2 = bl;
            if ((long)l10 == l12) {
                bl2 = true;
            }
        }
        return bl2;
    }
}

