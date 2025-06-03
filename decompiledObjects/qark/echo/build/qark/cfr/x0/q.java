/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.UnsupportedOperationException
 *  java.util.Map
 */
package x0;

import android.net.Uri;
import g0.z;
import i0.g;
import i0.k;
import i0.y;
import java.util.Map;

public final class q
implements g {
    public final g a;
    public final int b;
    public final a c;
    public final byte[] d;
    public int e;

    public q(g g8, int n8, a a8) {
        boolean bl = n8 > 0;
        g0.a.a(bl);
        this.a = g8;
        this.b = n8;
        this.c = a8;
        this.d = new byte[1];
        this.e = n8;
    }

    @Override
    public void c(y y8) {
        g0.a.e(y8);
        this.a.c(y8);
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override
    public long e(k k8) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Map g() {
        return this.a.g();
    }

    @Override
    public Uri k() {
        return this.a.k();
    }

    public final boolean q() {
        int n8;
        if (this.a.read(this.d, 0, 1) == -1) {
            return false;
        }
        int n9 = (this.d[0] & 255) << 4;
        if (n9 == 0) {
            return true;
        }
        byte[] arrby = new byte[n9];
        int n10 = n9;
        int n11 = 0;
        do {
            if (n10 <= 0) break;
            n8 = this.a.read(arrby, n11, n10);
            if (n8 == -1) {
                return false;
            }
            n11 += n8;
            n10 -= n8;
        } while (true);
        for (n8 = n9; n8 > 0 && arrby[n8 - 1] == 0; --n8) {
        }
        if (n8 > 0) {
            this.c.a(new z(arrby, n8));
        }
        return true;
    }

    @Override
    public int read(byte[] arrby, int n8, int n9) {
        if (this.e == 0) {
            if (this.q()) {
                this.e = this.b;
            } else {
                return -1;
            }
        }
        if ((n8 = this.a.read(arrby, n8, Math.min((int)this.e, (int)n9))) != -1) {
            this.e -= n8;
        }
        return n8;
    }

    public static interface a {
        public void a(z var1);
    }

}

