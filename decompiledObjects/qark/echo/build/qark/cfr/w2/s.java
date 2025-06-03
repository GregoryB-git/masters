/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package w2;

import android.os.Bundle;
import w2.t;
import w2.u;

public final class s
extends t {
    public s(int n8, int n9, Bundle bundle) {
        super(n8, 2, bundle);
    }

    @Override
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            this.d(null);
            return;
        }
        this.c(new u(4, "Invalid response to one way request", null));
    }

    @Override
    public final boolean b() {
        return true;
    }
}

