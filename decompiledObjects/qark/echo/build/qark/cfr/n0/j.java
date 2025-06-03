/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 */
package n0;

import Q0.a;
import Q0.c;
import d0.q;
import g0.M;
import j0.i;
import java.nio.ByteBuffer;
import k0.v0;
import o0.f;
import x0.Q;

public final class j
implements Q {
    public final q o;
    public final c p;
    public long[] q;
    public boolean r;
    public f s;
    public boolean t;
    public int u;
    public long v;

    public j(f f8, q q8, boolean bl) {
        this.o = q8;
        this.s = f8;
        this.p = new c();
        this.v = -9223372036854775807L;
        this.q = f8.b;
        this.d(f8, bl);
    }

    @Override
    public void a() {
    }

    public String b() {
        return this.s.a();
    }

    public void c(long l8) {
        int n8;
        this.u = n8 = M.d(this.q, l8, true, false);
        if (!this.r || n8 != this.q.length) {
            l8 = -9223372036854775807L;
        }
        this.v = l8;
    }

    public void d(f arrl, boolean bl) {
        int n8 = this.u;
        long l8 = n8 == 0 ? -9223372036854775807L : this.q[n8 - 1];
        this.r = bl;
        this.s = arrl;
        arrl = arrl.b;
        this.q = arrl;
        long l9 = this.v;
        if (l9 != -9223372036854775807L) {
            this.c(l9);
            return;
        }
        if (l8 != -9223372036854775807L) {
            this.u = M.d(arrl, l8, false, false);
        }
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public int j(v0 arrby, i i8, int n8) {
        int n9 = this.u;
        boolean bl = n9 == this.q.length;
        if (bl && !this.r) {
            i8.w(4);
            return -4;
        }
        if ((n8 & 2) == 0 && this.t) {
            if (bl) {
                return -3;
            }
            if ((n8 & 1) == 0) {
                this.u = n9 + 1;
            }
            if ((n8 & 4) == 0) {
                arrby = this.p.a(this.s.a[n9]);
                i8.z(arrby.length);
                i8.r.put(arrby);
            }
            i8.t = this.q[n9];
            i8.w(1);
            return -4;
        }
        arrby.b = this.o;
        this.t = true;
        return -5;
    }

    @Override
    public int m(long l8) {
        int n8 = Math.max((int)this.u, (int)M.d(this.q, l8, true, false));
        int n9 = this.u;
        this.u = n8;
        return n8 - n9;
    }
}

