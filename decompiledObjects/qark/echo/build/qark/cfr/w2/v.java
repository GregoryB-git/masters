/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 */
package w2;

import android.os.Bundle;
import w2.t;

public final class v
extends t {
    public v(int n8, int n9, Bundle bundle) {
        super(n8, 1, bundle);
    }

    @Override
    public final void a(Bundle bundle) {
        Bundle bundle2;
        bundle = bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle = Bundle.EMPTY;
        }
        this.d((Object)bundle);
    }

    @Override
    public final boolean b() {
        return false;
    }
}

