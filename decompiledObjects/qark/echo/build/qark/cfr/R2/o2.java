/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Object
 *  java.lang.String
 */
package R2;

import A2.n;
import R2.l2;
import android.content.SharedPreferences;

public final class o2 {
    public final String a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public final /* synthetic */ l2 e;

    public o2(l2 l22, String string2, boolean bl) {
        this.e = l22;
        n.e(string2);
        this.a = string2;
        this.b = bl;
    }

    public final void a(boolean bl) {
        SharedPreferences.Editor editor = this.e.F().edit();
        editor.putBoolean(this.a, bl);
        editor.apply();
        this.d = bl;
    }

    public final boolean b() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.F().getBoolean(this.a, this.b);
        }
        return this.d;
    }
}

