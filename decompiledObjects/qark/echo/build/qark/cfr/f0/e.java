/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Object
 *  java.lang.String
 */
package f0;

import android.os.Bundle;
import g0.M;
import g0.a;

public final class e {
    public static final String c = M.w0(0);
    public static final String d = M.w0(1);
    public final String a;
    public final int b;

    public e(String string2, int n8) {
        this.a = string2;
        this.b = n8;
    }

    public static e a(Bundle bundle) {
        return new e((String)a.e(bundle.getString(c)), bundle.getInt(d));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putString(c, this.a);
        bundle.putInt(d, this.b);
        return bundle;
    }
}

