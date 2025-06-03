/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package u6;

import X5.d;
import X5.g;
import Y5.b;
import Z5.e;
import p6.D;
import p6.a;
import u6.k;

public class B
extends a
implements e {
    public final d r;

    public B(g g8, d d8) {
        super(g8, true, true);
        this.r = d8;
    }

    @Override
    public void F(Object object) {
        k.c(b.b(this.r), D.a(object, this.r), null, 2, null);
    }

    @Override
    public void G0(Object object) {
        d d8 = this.r;
        d8.resumeWith(D.a(object, d8));
    }

    @Override
    public final boolean g0() {
        return true;
    }

    @Override
    public final e getCallerFrame() {
        d d8 = this.r;
        if (d8 instanceof e) {
            return (e)((Object)d8);
        }
        return null;
    }
}

