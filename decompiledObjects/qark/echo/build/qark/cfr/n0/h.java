/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package n0;

import X2.v;
import android.net.Uri;
import i0.k;
import java.util.Map;
import o0.b;
import o0.i;
import o0.j;

public abstract class h {
    public static k a(j j8, String string2, i i8, int n8, Map map) {
        return new k.b().i(i8.b(string2)).h(i8.a).g(i8.b).f(h.b(j8, i8)).b(n8).e(map).a();
    }

    public static String b(j j8, i i8) {
        String string2 = j8.k();
        if (string2 != null) {
            return string2;
        }
        return i8.b(((b)j8.c.get((int)0)).a).toString();
    }
}

