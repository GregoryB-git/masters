/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Thread
 *  java.lang.Throwable
 */
package g0;

import g0.c;

public class f {
    public final c a;
    public boolean b;

    public f() {
        this(c.a);
    }

    public f(c c8) {
        this.a = c8;
    }

    public void a() {
        synchronized (this) {
            Throwable throwable2;
            block4 : {
                try {
                    while (!this.b) {
                        this.wait();
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void b() {
        // MONITORENTER : this
        var1_1 = false;
        if (var2_2 = this.b) {
            Thread.currentThread().interrupt();
            // MONITOREXIT : this
            return;
        }
        this.wait();
        ** GOTO lbl-1000
        catch (InterruptedException var3_3) {}
        var1_1 = true;
        ** GOTO lbl-1000
    }

    public boolean c() {
        synchronized (this) {
            boolean bl = this.b;
            this.b = false;
            return bl;
        }
    }

    public boolean d() {
        synchronized (this) {
            boolean bl = this.b;
            return bl;
        }
    }

    public boolean e() {
        synchronized (this) {
            block4 : {
                boolean bl = this.b;
                if (!bl) break block4;
                return false;
            }
            this.b = true;
            this.notifyAll();
            return true;
        }
    }
}

