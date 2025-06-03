/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  android.util.Pair
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.SecureRandom
 */
package R2;

import A2.n;
import E2.e;
import R2.S5;
import R2.l2;
import R2.s2;
import android.content.SharedPreferences;
import android.util.Pair;
import java.security.SecureRandom;

public final class p2 {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final /* synthetic */ l2 e;

    public p2(l2 l22, String string2, long l8) {
        this.e = l22;
        n.e(string2);
        boolean bl = l8 > 0L;
        n.a(bl);
        l22 = new StringBuilder();
        l22.append(string2);
        l22.append(":start");
        this.a = l22.toString();
        l22 = new StringBuilder();
        l22.append(string2);
        l22.append(":count");
        this.b = l22.toString();
        l22 = new StringBuilder();
        l22.append(string2);
        l22.append(":value");
        this.c = l22.toString();
        this.d = l8;
    }

    public /* synthetic */ p2(l2 l22, String string2, long l8, s2 s22) {
        this(l22, string2, l8);
    }

    public final Pair a() {
        this.e.n();
        this.e.n();
        long l8 = this.c();
        if (l8 == 0L) {
            this.d();
            l8 = 0L;
        } else {
            l8 = Math.abs((long)(l8 - this.e.b().a()));
        }
        long l9 = this.d;
        if (l8 < l9) {
            return null;
        }
        if (l8 > l9 << 1) {
            this.d();
            return null;
        }
        String string2 = this.e.F().getString(this.c, null);
        l8 = this.e.F().getLong(this.b, 0L);
        this.d();
        if (string2 != null && l8 > 0L) {
            return new Pair((Object)string2, (Object)l8);
        }
        return l2.z;
    }

    public final void b(String string2, long l8) {
        long l9;
        this.e.n();
        if (this.c() == 0L) {
            this.d();
        }
        String string3 = string2;
        if (string2 == null) {
            string3 = "";
        }
        if ((l9 = this.e.F().getLong(this.b, 0L)) <= 0L) {
            string2 = this.e.F().edit();
            string2.putString(this.c, string3);
            string2.putLong(this.b, 1L);
            string2.apply();
            return;
        }
        l8 = this.e.k().U0().nextLong();
        boolean bl = (l8 & Long.MAX_VALUE) < Long.MAX_VALUE / ++l9;
        string2 = this.e.F().edit();
        if (bl) {
            string2.putString(this.c, string3);
        }
        string2.putLong(this.b, l9);
        string2.apply();
    }

    public final long c() {
        return this.e.F().getLong(this.a, 0L);
    }

    public final void d() {
        this.e.n();
        long l8 = this.e.b().a();
        SharedPreferences.Editor editor = this.e.F().edit();
        editor.remove(this.b);
        editor.remove(this.c);
        editor.putLong(this.a, l8);
        editor.apply();
    }
}

