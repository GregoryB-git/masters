/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 */
package N5;

import E5.d;
import N5.i;
import java.util.HashMap;
import s4.h;
import t4.a;
import t4.b;

public class j
implements d.d {
    public final h a;
    public a b;

    public j(h h8) {
        this.a = h8;
    }

    public static /* synthetic */ void c(d.b b8, String string2) {
        j.e(b8, string2);
    }

    public static /* synthetic */ void e(d.b b8, String string2) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"token", (Object)string2);
        b8.a((Object)hashMap);
    }

    @Override
    public void a(Object object) {
        if (this.b != null) {
            this.b = null;
        }
    }

    @Override
    public void b(Object object, d.b b8) {
        this.b = object = this.d(b8);
        this.a.F((a)object);
    }

    public a d(d.b b8) {
        return new i(b8);
    }
}

