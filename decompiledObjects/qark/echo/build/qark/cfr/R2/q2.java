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

public final class q2 {
    public final String a;
    public final long b;
    public boolean c;
    public long d;
    public final /* synthetic */ l2 e;

    public q2(l2 l22, String string2, long l8) {
        this.e = l22;
        n.e(string2);
        this.a = string2;
        this.b = l8;
    }

    public final long a() {
        if (!this.c) {
            this.c = true;
            this.d = this.e.F().getLong(this.a, this.b);
        }
        return this.d;
    }

    public final void b(long l8) {
        SharedPreferences.Editor editor = this.e.F().edit();
        editor.putLong(this.a, l8);
        editor.apply();
        this.d = l8;
    }
}

