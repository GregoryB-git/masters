/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.util.ArrayDeque
 *  java.util.PriorityQueue
 */
package d1;

import c1.k;
import c1.l;
import c1.p;
import c1.q;
import d1.d;
import g0.M;
import g0.a;
import j0.i;
import j0.j;
import java.util.ArrayDeque;
import java.util.PriorityQueue;

public abstract class e
implements l {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final PriorityQueue c;
    public b d;
    public long e;
    public long f;
    public long g;

    public e() {
        int n8;
        int n9 = 0;
        for (n8 = 0; n8 < 10; ++n8) {
            this.a.add((Object)new b(null));
        }
        this.b = new ArrayDeque();
        for (n8 = n9; n8 < 2; ++n8) {
            this.b.add((Object)new c(new d(this)));
        }
        this.c = new PriorityQueue();
        this.g = -9223372036854775807L;
    }

    @Override
    public final void c(long l8) {
        this.g = l8;
    }

    @Override
    public void d(long l8) {
        this.e = l8;
    }

    @Override
    public void flush() {
        this.f = 0L;
        this.e = 0L;
        while (!this.c.isEmpty()) {
            this.o((b)M.i((b)this.c.poll()));
        }
        b b8 = this.d;
        if (b8 != null) {
            this.o(b8);
            this.d = null;
        }
    }

    public abstract k g();

    public abstract void h(p var1);

    public p i() {
        b b8;
        boolean bl = this.d == null;
        a.f(bl);
        if (this.a.isEmpty()) {
            return null;
        }
        this.d = b8 = (b)this.a.pollFirst();
        return b8;
    }

    /*
     * Enabled aggressive block sorting
     */
    public q j() {
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty() && ((b)M.i((Object)((b)this.c.peek()))).t <= this.e) {
            b b8;
            block7 : {
                q q8;
                block6 : {
                    block5 : {
                        b8 = (b)M.i((b)this.c.poll());
                        if (!b8.p()) break block5;
                        q8 = (q)M.i((q)this.b.pollFirst());
                        q8.l(4);
                        break block6;
                    }
                    this.h(b8);
                    if (!this.m()) break block7;
                    k k8 = this.g();
                    q8 = (q)M.i((q)this.b.pollFirst());
                    q8.z(b8.t, k8, Long.MAX_VALUE);
                }
                this.o(b8);
                return q8;
            }
            this.o(b8);
        }
        return null;
    }

    public final q k() {
        return (q)this.b.pollFirst();
    }

    public final long l() {
        return this.e;
    }

    public abstract boolean m();

    public void n(p p8) {
        boolean bl = p8 == this.d;
        a.a(bl);
        p8 = (b)p8;
        long l8 = this.g;
        if (l8 != -9223372036854775807L && p8.t < l8) {
            this.o((b)p8);
        } else {
            l8 = this.f;
            this.f = 1L + l8;
            ((b)p8).y = l8;
            this.c.add((Object)p8);
        }
        this.d = null;
    }

    public final void o(b b8) {
        b8.m();
        this.a.add((Object)b8);
    }

    public void p(q q8) {
        q8.m();
        this.b.add((Object)q8);
    }

    @Override
    public void release() {
    }

    public static final class b
    extends p
    implements Comparable {
        public long y;

        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public int K(b b8) {
            long l8;
            boolean bl = this.p();
            boolean bl2 = b8.p();
            int n8 = -1;
            if (bl != bl2) {
                if (this.p()) {
                    n8 = 1;
                }
                return n8;
            }
            long l9 = l8 = this.t - b8.t;
            if (l8 == 0L) {
                l9 = l8 = this.y - b8.y;
                if (l8 == 0L) {
                    return 0;
                }
            }
            if (l9 > 0L) {
                n8 = 1;
            }
            return n8;
        }
    }

    public static final class c
    extends q {
        public j.a u;

        public c(j.a a8) {
            this.u = a8;
        }

        @Override
        public final void x() {
            this.u.a(this);
        }
    }

}

