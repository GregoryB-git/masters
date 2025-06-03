/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 */
package R2;

import R2.C3;
import R2.N2;
import R2.S5;
import R2.Y1;
import R2.a2;
import R2.a6;
import R2.o3;

public final class Z5
implements Runnable {
    public /* synthetic */ N2 o;

    public /* synthetic */ Z5(N2 n22) {
        this.o = n22;
    }

    public final void run() {
        o3 o32 = this.o;
        if (!o32.L().V0()) {
            o32.j().L().a("registerTrigger called but app not eligible");
            return;
        }
        o32 = o32.H();
        o32.getClass();
        new Thread((Runnable)new a6((C3)o32)).start();
    }
}

