/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package y0;

import F0.T;
import F0.s;
import d0.i;
import d0.q;
import d0.z;
import i0.g;
import i0.k;
import i0.x;
import y0.a;
import y0.c;
import y0.e;
import y0.f;
import y0.m;

public class j
extends a {
    public final int o;
    public final long p;
    public final f q;
    public long r;
    public volatile boolean s;
    public boolean t;

    public j(g g8, k k8, q q8, int n8, Object object, long l8, long l9, long l10, long l11, long l12, int n9, long l13, f f8) {
        super(g8, k8, q8, n8, object, l8, l9, l10, l11, l12);
        this.o = n9;
        this.p = l13;
        this.q = f8;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public final void b() {
        Object object2;
        Object object;
        c c8 = this.j();
        if (this.r == 0L) {
            c8.c(this.p);
            object2 = this.q;
            object = this.l(c8);
            long l8 = this.k;
            l8 = l8 == -9223372036854775807L ? -9223372036854775807L : (l8 -= this.p);
            long l9 = this.l;
            l9 = l9 == -9223372036854775807L ? -9223372036854775807L : (l9 -= this.p);
            object2.b((f.b)object, l8, l9);
        }
        object2 = this.b.e(this.r);
        object = this.i;
        object2 = new F0.j((i)object, object2.g, object.e((k)object2));
        while (!this.s && this.q.c((s)object2)) {
        }
        this.m(c8);
        try {
            this.r = object2.p() - this.b.g;
        }
        catch (Throwable throwable) {}
        i0.j.a(this.i);
        this.t = this.s ^ true;
        return;
        catch (Throwable throwable) {}
        this.r = object2.p() - this.b.g;
        throw throwable;
        i0.j.a(this.i);
        throw throwable;
    }

    @Override
    public final void c() {
        this.s = true;
    }

    @Override
    public long g() {
        return this.j + (long)this.o;
    }

    @Override
    public boolean h() {
        return this.t;
    }

    public f.b l(c c8) {
        return c8;
    }

    public final void m(c object) {
        if (!z.p(this.d.m)) {
            return;
        }
        q q8 = this.d;
        int n8 = q8.I;
        if ((n8 > 1 || q8.J > 1) && n8 != -1) {
            if (q8.J == -1) {
                return;
            }
            object = object.a(0, 4);
            q8 = this.d;
            n8 = q8.I;
            n8 = q8.J * n8;
            long l8 = (this.h - this.g) / (long)n8;
            for (int i8 = 1; i8 < n8; ++i8) {
                long l9 = i8;
                object.e(new g0.z(), 0);
                object.b(l9 * l8, 0, 0, 0, null);
            }
        }
    }
}

