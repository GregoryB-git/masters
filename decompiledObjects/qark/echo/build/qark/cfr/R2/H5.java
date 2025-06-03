/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 */
package R2;

import A2.n;
import R2.D5;
import R2.I2;
import R2.W5;
import R2.Y1;
import R2.a2;
import R2.q3;
import java.util.concurrent.Callable;

public final class H5
implements Callable {
    public final /* synthetic */ W5 o;
    public final /* synthetic */ D5 p;

    public H5(D5 d52, W5 w52) {
        this.p = d52;
        this.o = w52;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final /* synthetic */ Object call() {
        String string2;
        Object object;
        if (this.p.Q((String)n.i(this.o.o)).y() && q3.e(this.o.J).y()) {
            object = this.p.g(this.o);
            if (object != null) {
                return object.u0();
            }
            object = this.p.j().L();
            string2 = "App info was null when attempting to get app instance id";
        } else {
            object = this.p.j().K();
            string2 = "Analytics storage consent denied. Returning null app instance id";
        }
        object.a(string2);
        return null;
    }
}

