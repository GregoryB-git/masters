/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package R2;

import R2.N2;
import R2.Y1;
import R2.g;
import R2.l2;
import R2.m3;
import R2.p2;

public final class b2
implements Runnable {
    public final /* synthetic */ int o;
    public final /* synthetic */ String p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Y1 t;

    public b2(Y1 y12, int n8, String string2, Object object, Object object2, Object object3) {
        this.t = y12;
        this.o = n8;
        this.p = string2;
        this.q = object;
        this.r = object2;
        this.s = object3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void run() {
        Object object;
        char c8;
        l2 l22 = this.t.a.F();
        if (!l22.r()) {
            this.t.y(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (Y1.u(this.t) == '\u0000') {
            if (this.t.f().T()) {
                object = this.t;
                c8 = 'C';
            } else {
                object = this.t;
                c8 = 'c';
            }
            Y1.A((Y1)object, c8);
        }
        if (Y1.D(this.t) < 0L) {
            Y1.B(this.t, 82001L);
        }
        c8 = "01VDIWEA?".charAt(this.o);
        char c9 = Y1.u(this.t);
        long l8 = Y1.D(this.t);
        object = Y1.x(true, this.p, this.q, this.r, this.s);
        Object object2 = new StringBuilder("2");
        object2.append(c8);
        object2.append(c9);
        object2.append(l8);
        object2.append(":");
        object2.append((String)object);
        object = object2 = object2.toString();
        if (object2.length() > 1024) {
            object = this.p.substring(0, 1024);
        }
        if ((object2 = l22.d) != null) {
            object2.b((String)object, 1L);
        }
    }
}

