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

public final class g {
    public static final String d = M.w0(0);
    public static final String e = M.w0(1);
    public static final String f = M.w0(2);
    public int a;
    public int b;
    public final int c;

    public g(int n8, int n9, int n10) {
        this.a = n8;
        this.b = n9;
        this.c = n10;
    }

    public static g a(Bundle bundle) {
        return new g(bundle.getInt(d), bundle.getInt(e), bundle.getInt(f));
    }

    public Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putInt(d, this.a);
        bundle.putInt(e, this.b);
        bundle.putInt(f, this.c);
        return bundle;
    }
}

