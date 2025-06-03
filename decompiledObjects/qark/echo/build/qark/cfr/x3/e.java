/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 */
package x3;

import Q2.a;
import android.os.Bundle;
import x3.a;
import x3.f;

public final class e
implements a.a {
    public final /* synthetic */ f a;

    public e(f f8) {
        this.a = f8;
    }

    @Override
    public final void a(String string2, String string3, Bundle bundle, long l8) {
        if (string2 != null && a.i(string3)) {
            string2 = new Bundle();
            string2.putString("name", string3);
            string2.putLong("timestampInMillis", l8);
            string2.putBundle("params", bundle);
            f.a(this.a).a(3, (Bundle)string2);
        }
    }
}

