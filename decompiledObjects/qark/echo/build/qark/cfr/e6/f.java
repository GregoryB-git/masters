/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package e6;

import a6.a;
import a6.b;

public final class f
extends Enum {
    public static final /* enum */ f o = new f();
    public static final /* enum */ f p = new f();
    public static final /* synthetic */ f[] q;
    public static final /* synthetic */ a r;

    static {
        Enum[] arrenum = f.c();
        q = arrenum;
        r = b.a(arrenum);
    }

    public static final /* synthetic */ f[] c() {
        return new f[]{o, p};
    }

    public static f valueOf(String string2) {
        return (f)Enum.valueOf(f.class, (String)string2);
    }

    public static f[] values() {
        return (f[])q.clone();
    }
}

