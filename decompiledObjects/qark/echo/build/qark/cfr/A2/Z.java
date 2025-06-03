/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package A2;

import A2.K;
import A2.c;
import android.os.Bundle;
import x2.b;

public final class Z
extends K {
    public final /* synthetic */ c g;

    public Z(c c8, int n8, Bundle bundle) {
        this.g = c8;
        super(c8, n8, null);
    }

    @Override
    public final void f(b b8) {
        if (this.g.t() && c.h0(this.g)) {
            c.d0(this.g, 16);
            return;
        }
        this.g.p.b(b8);
        this.g.L(b8);
    }

    @Override
    public final boolean g() {
        this.g.p.b(b.s);
        return true;
    }
}

