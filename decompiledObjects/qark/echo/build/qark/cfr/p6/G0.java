/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Throwable
 */
package p6;

import V5.n;
import V5.o;
import V5.t;
import p6.m;
import p6.w0;
import p6.x0;
import p6.y0;
import p6.z;

public final class G0
extends w0 {
    public final m s;

    public G0(m m8) {
        this.s = m8;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public void v(Throwable object) {
        Object object2 = this.w().b0();
        if (object2 instanceof z) {
            object = this.s;
            n.a a8 = n.o;
            object2 = o.a(((z)object2).a);
        } else {
            object = this.s;
            n.a a9 = n.o;
            object2 = y0.h(object2);
        }
        object.resumeWith(n.a(object2));
    }
}

