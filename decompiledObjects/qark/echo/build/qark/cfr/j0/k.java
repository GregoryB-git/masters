/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.OutOfMemoryError
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.ArrayDeque
 */
package j0;

import g0.a;
import j0.g;
import j0.h;
import j0.i;
import j0.j;
import java.util.ArrayDeque;

public abstract class k
implements g {
    public final Thread a;
    public final Object b = new Object();
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();
    public final i[] e;
    public final j[] f;
    public int g;
    public int h;
    public i i;
    public h j;
    public boolean k;
    public boolean l;
    public int m;
    public long n = -9223372036854775807L;

    public k(i[] object, j[] arrj) {
        int n8;
        this.e = object;
        this.g = object.length;
        int n9 = 0;
        for (n8 = 0; n8 < this.g; ++n8) {
            this.e[n8] = this.i();
        }
        this.f = arrj;
        this.h = arrj.length;
        for (n8 = n9; n8 < this.h; ++n8) {
            this.f[n8] = this.j();
        }
        this.a = object = new Thread("ExoPlayer:SimpleDecoder"){

            public void run() {
                k.this.v();
            }
        };
        object.start();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(i i8) {
        Object object = this.b;
        synchronized (object) {
            this.r();
            boolean bl = i8 == this.i;
            a.a(bl);
            this.c.addLast((Object)i8);
            this.q();
            this.i = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void c(long l8) {
        Object object = this.b;
        synchronized (object) {
            boolean bl;
            block4 : {
                block3 : {
                    try {
                        if (this.g == this.e.length || this.k) break block3;
                        bl = false;
                        break block4;
                    }
                    catch (Throwable throwable) {}
                    throw throwable;
                }
                bl = true;
            }
            a.f(bl);
            this.n = l8;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void flush() {
        Object object = this.b;
        synchronized (object) {
            try {
                this.k = true;
                this.m = 0;
                i i8 = this.i;
                if (i8 != null) {
                    this.s(i8);
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    this.s((i)this.c.removeFirst());
                }
                do {
                    if (this.d.isEmpty()) {
                        return;
                    }
                    ((j)this.d.removeFirst()).x();
                } while (true);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final boolean h() {
        if (!this.c.isEmpty() && this.h > 0) {
            return true;
        }
        return false;
    }

    public abstract i i();

    public abstract j j();

    public abstract h k(Throwable var1);

    public abstract h l(i var1, j var2, boolean var3);

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean m() {
        block21 : {
            block20 : {
                var3_1 = this.b;
                // MONITORENTER : var3_1
                while (!this.l && !this.h()) {
                    this.b.wait();
                }
                if (this.l) {
                    // MONITOREXIT : var3_1
                    return false;
                }
                var4_4 = (i)this.c.removeFirst();
                var5_7 = this.f;
                this.h = var1_8 = this.h - 1;
                var5_7 = var5_7[var1_8];
                var2_9 = this.k;
                this.k = false;
                // MONITOREXIT : var3_1
                if (!var4_4.p()) break block20;
                var5_7.l(4);
                break block21;
            }
            var5_7.p = var4_4.t;
            if (var4_4.r()) {
                var5_7.l(134217728);
            }
            if (!this.p(var4_4.t)) {
                var5_7.r = true;
            }
            try {
                var3_1 = this.l((i)var4_4, (j)var5_7, var2_9);
            }
            catch (OutOfMemoryError var3_2) {}
            ** GOTO lbl-1000
            catch (RuntimeException var3_3) {}
lbl-1000: // 2 sources:
            {
                var3_1 = this.k((Throwable)var3_1);
            }
            if (var3_1 != null) {
                var4_4 = this.b;
                // MONITORENTER : var4_4
                this.j = var3_1;
                // MONITOREXIT : var4_4
                return false;
            }
        }
        var3_1 = this.b;
        // MONITORENTER : var3_1
        if (this.k) ** GOTO lbl49
        if (var5_7.r) {
            ++this.m;
lbl49: // 2 sources:
            var5_7.x();
        } else {
            var5_7.q = this.m;
            this.m = 0;
            this.d.addLast(var5_7);
        }
        this.s((i)var4_4);
        // MONITOREXIT : var3_1
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final i n() {
        Object object = this.b;
        synchronized (object) {
            Object object2;
            this.r();
            boolean bl = this.i == null;
            a.f(bl);
            int n8 = this.g;
            if (n8 == 0) {
                object2 = null;
            } else {
                object2 = this.e;
                this.g = --n8;
                object2 = object2[n8];
            }
            this.i = object2;
            return object2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final j o() {
        Object object = this.b;
        synchronized (object) {
            try {
                this.r();
                if (!this.d.isEmpty()) return (j)this.d.removeFirst();
                return null;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean p(long l8) {
        Object object = this.b;
        synchronized (object) {
            long l9 = this.n;
            if (l9 == -9223372036854775807L) return true;
            if (l8 < l9) return false;
            return true;
        }
    }

    public final void q() {
        if (this.h()) {
            this.b.notify();
        }
    }

    public final void r() {
        h h8 = this.j;
        if (h8 == null) {
            return;
        }
        throw h8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void release() {
        Object object = this.b;
        synchronized (object) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
            return;
        }
        catch (InterruptedException interruptedException) {}
        Thread.currentThread().interrupt();
    }

    public final void s(i i8) {
        i8.m();
        i[] arri = this.e;
        int n8 = this.g;
        this.g = n8 + 1;
        arri[n8] = i8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void t(j j8) {
        Object object = this.b;
        synchronized (object) {
            this.u(j8);
            this.q();
            return;
        }
    }

    public final void u(j j8) {
        j8.m();
        j[] arrj = this.f;
        int n8 = this.h;
        this.h = n8 + 1;
        arrj[n8] = j8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void v() {
        try {
            boolean bl;
            while (bl = this.m()) {
            }
            return;
        }
        catch (InterruptedException interruptedException) {
            throw new IllegalStateException((Throwable)interruptedException);
        }
    }

    public final void w(int n8) {
        int n9 = this.g;
        int n10 = this.e.length;
        boolean bl = n9 == n10;
        a.f(bl);
        i[] arri = this.e;
        n9 = arri.length;
        for (int i8 = 0; i8 < n9; ++i8) {
            arri[i8].z(n8);
        }
    }

}

