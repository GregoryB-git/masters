/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 */
package A2;

import A2.p;

public final class o {
    public static o b;
    public static final p c;
    public p a;

    static {
        c = new p(0, false, false, 0, 0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static o b() {
        synchronized (o.class) {
            try {
                if (b != null) return b;
                b = new o();
                return b;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public p a() {
        return this.a;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void c(p var1_1) {
        block4 : {
            // MONITORENTER : this
            if (var1_1 != null) ** GOTO lbl7
            this.a = o.c;
            // MONITOREXIT : this
            return;
lbl7: // 1 sources:
            var4_3 = this.a;
            if (var4_3 == null || (var2_4 = var4_3.i()) < (var3_5 = var1_1.i())) break block4;
            // MONITOREXIT : this
            return;
        }
        this.a = var1_1;
        // MONITOREXIT : this
        return;
    }
}

