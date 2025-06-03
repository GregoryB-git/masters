/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 */
package i0;

import g0.a;
import i0.g;
import i0.k;
import java.io.InputStream;

public final class i
extends InputStream {
    public final g o;
    public final k p;
    public final byte[] q;
    public boolean r = false;
    public boolean s = false;
    public long t;

    public i(g g8, k k8) {
        this.o = g8;
        this.p = k8;
        this.q = new byte[1];
    }

    public final void a() {
        if (!this.r) {
            this.o.e(this.p);
            this.r = true;
        }
    }

    public void b() {
        this.a();
    }

    public void close() {
        if (!this.s) {
            this.o.close();
            this.s = true;
        }
    }

    public int read() {
        if (this.read(this.q) == -1) {
            return -1;
        }
        return this.q[0] & 255;
    }

    public int read(byte[] arrby) {
        return this.read(arrby, 0, arrby.length);
    }

    public int read(byte[] arrby, int n8, int n9) {
        a.f(this.s ^ true);
        this.a();
        n8 = this.o.read(arrby, n8, n9);
        if (n8 == -1) {
            return -1;
        }
        this.t += (long)n8;
        return n8;
    }
}

