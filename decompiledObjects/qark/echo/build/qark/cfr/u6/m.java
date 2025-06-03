/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicIntegerFieldUpdater
 */
package u6;

import X5.g;
import X5.h;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p6.F;
import p6.H;
import p6.O;
import p6.S;
import u6.r;

public final class m
extends F
implements S {
    public static final AtomicIntegerFieldUpdater v = AtomicIntegerFieldUpdater.newUpdater(m.class, (String)"runningWorkers");
    public final F q;
    public final int r;
    private volatile int runningWorkers;
    public final /* synthetic */ S s;
    public final r t;
    public final Object u;

    public m(F object, int n8) {
        this.q = object;
        this.r = n8;
        object = object instanceof S ? (S)object : null;
        Object object2 = object;
        if (object == null) {
            object2 = O.a();
        }
        this.s = object2;
        this.t = new r(false);
        this.u = new Object();
    }

    public static final /* synthetic */ F H(m m8) {
        return m8.q;
    }

    public static final /* synthetic */ Runnable I(m m8) {
        return m8.J();
    }

    @Override
    public void E(g object, Runnable runnable) {
        this.t.a((Object)runnable);
        if (v.get((Object)this) < this.r && this.K()) {
            object = this.J();
            if (object == null) {
                return;
            }
            object = new a((Runnable)object);
            this.q.E(this, (Runnable)object);
        }
    }

    public final Runnable J() {
        Object object;
        while ((object = (Runnable)this.t.d()) == null) {
            object = this.u;
            synchronized (object) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
                block5 : {
                    atomicIntegerFieldUpdater = v;
                    atomicIntegerFieldUpdater.decrementAndGet((Object)this);
                    int n8 = this.t.c();
                    if (n8 != 0) break block5;
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet((Object)this);
            }
        }
        return object;
    }

    public final boolean K() {
        Object object = this.u;
        synchronized (object) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
            block4 : {
                atomicIntegerFieldUpdater = v;
                int n8 = atomicIntegerFieldUpdater.get((Object)this);
                int n9 = this.r;
                if (n8 < n9) break block4;
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet((Object)this);
            return true;
        }
    }

    public final class a
    implements Runnable {
        public Runnable o;

        public a(Runnable runnable) {
            this.o = runnable;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public void run() {
            var1_1 = 0;
            do lbl-1000: // 3 sources:
            {
                try {
                    this.o.run();
                }
                catch (Throwable var3_4) {
                    H.a(h.o, var3_4);
                }
                var3_3 = m.I(m.this);
                if (var3_3 == null) {
                    return;
                }
                this.o = var3_3;
                var1_1 = var2_2 = var1_1 + 1;
                if (var2_2 < 16) ** GOTO lbl-1000
                var1_1 = var2_2;
            } while (!m.H(m.this).F(m.this));
            m.H(m.this).E(m.this, this);
        }
    }

}

