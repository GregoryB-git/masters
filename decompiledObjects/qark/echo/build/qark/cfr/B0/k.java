/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.lang.Math
 *  java.lang.Object
 */
package B0;

import B0.l;
import B0.m;
import B0.n;
import d0.A;
import i0.h;
import i0.q;
import i0.t;
import java.io.FileNotFoundException;
import java.io.IOException;

public class k
implements m {
    public final int a;

    public k() {
        this(-1);
    }

    public k(int n8) {
        this.a = n8;
    }

    @Override
    public /* synthetic */ void a(long l8) {
        l.a(this, l8);
    }

    @Override
    public m.b b(m.a a8, m.c c8) {
        if (!this.e(c8.c)) {
            return null;
        }
        if (a8.a(1)) {
            return new m.b(1, 300000L);
        }
        if (a8.a(2)) {
            return new m.b(2, 60000L);
        }
        return null;
    }

    @Override
    public long c(m.c c8) {
        IOException iOException = c8.c;
        if (!(iOException instanceof A || iOException instanceof FileNotFoundException || iOException instanceof q || iOException instanceof n.h || h.a(iOException))) {
            return Math.min((int)((c8.d - 1) * 1000), (int)5000);
        }
        return -9223372036854775807L;
    }

    @Override
    public int d(int n8) {
        int n9 = this.a;
        if (n9 == -1) {
            if (n8 == 7) {
                return 6;
            }
            return 3;
        }
        return n9;
    }

    public boolean e(IOException iOException) {
        boolean bl = iOException instanceof t;
        boolean bl2 = false;
        if (!bl) {
            return false;
        }
        int n8 = ((t)iOException).r;
        if (n8 == 403 || n8 == 404 || n8 == 410 || n8 == 416 || n8 == 500 || n8 == 503) {
            bl2 = true;
        }
        return bl2;
    }
}

