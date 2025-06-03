/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.CancellationSignal
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Throwable
 */
package E;

import android.os.CancellationSignal;

public final class c {
    public boolean a;
    public b b;
    public Object c;
    public boolean d;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void a() {
        block12 : {
            // MONITORENTER : this
            if (this.a) {
                // MONITOREXIT : this
                return;
            }
            this.a = true;
            this.d = true;
            var1_1 = this.b;
            var2_4 = this.c;
            // MONITOREXIT : this
            if (var1_1 == null) ** GOTO lbl16
            try {
                var1_1.a();
lbl16: // 2 sources:
                if (var2_4 == null) break block12;
                a.a(var2_4);
            }
            catch (Throwable var1_2) {}
        }
        // MONITORENTER : this
        this.d = false;
        this.notifyAll();
        // MONITOREXIT : this
        return;
        // MONITORENTER : this
        this.d = false;
        this.notifyAll();
        // MONITOREXIT : this
        throw var1_2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean b() {
        synchronized (this) {
            return this.a;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void c(b b8) {
        block5 : {
            // MONITORENTER : this
            this.d();
            if (this.b == b8) {
                // MONITOREXIT : this
                return;
            }
            this.b = b8;
            if (!this.a || b8 == null) break block5;
            // MONITOREXIT : this
            b8.a();
            return;
        }
        // MONITOREXIT : this
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void d() {
        while (this.d) {
            try {
                this.wait();
            }
            catch (InterruptedException interruptedException) {
            }
        }
    }

    public static abstract class a {
        public static void a(Object object) {
            ((CancellationSignal)object).cancel();
        }

        public static CancellationSignal b() {
            return new CancellationSignal();
        }
    }

    public static interface b {
        public void a();
    }

}

