/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package R2;

import R2.C3;
import R2.D4;
import R2.Y1;
import R2.a2;
import R2.l2;
import R2.z;

public final class j4
implements Runnable {
    public final /* synthetic */ z o;
    public final /* synthetic */ C3 p;

    public j4(C3 c32, z z8) {
        this.p = c32;
        this.o = z8;
    }

    public final void run() {
        if (this.p.i().z(this.o)) {
            this.p.t().U(false);
            return;
        }
        this.p.j().J().b("Lower precedence consent source ignored, proposed source", this.o.a());
    }
}

