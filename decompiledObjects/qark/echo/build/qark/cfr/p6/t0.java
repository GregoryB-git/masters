/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package p6;

import p6.q0;
import p6.r;
import p6.s;
import p6.x;
import p6.x0;

public class t0
extends x0
implements x {
    public final boolean q;

    public t0(q0 q02) {
        super(true);
        this.e0(q02);
        this.q = this.G0();
    }

    public final boolean G0() {
        Object object = this.a0();
        object = object instanceof s ? (s)object : null;
        if (object != null) {
            x0 x02 = object.w();
            object = x02;
            if (x02 == null) {
                return false;
            }
            do {
                if (object.X()) {
                    return true;
                }
                object = (object = object.a0()) instanceof s ? (s)object : null;
                if (object == null) break;
                x02 = object.w();
                object = x02;
            } while (x02 != null);
        }
        return false;
    }

    @Override
    public boolean X() {
        return this.q;
    }

    @Override
    public boolean Y() {
        return true;
    }
}

