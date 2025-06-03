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

public final class r2 {
    public final String a;
    public final String b;
    public boolean c;
    public String d;
    public final /* synthetic */ l2 e;

    public r2(l2 l22, String string2, String string3) {
        this.e = l22;
        n.e(string2);
        this.a = string2;
        this.b = null;
    }

    public final String a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.F().getString(this.a, null);
        }
        return this.d;
    }

    public final void b(String string2) {
        SharedPreferences.Editor editor = this.e.F().edit();
        editor.putString(this.a, string2);
        editor.apply();
        this.d = string2;
    }
}

