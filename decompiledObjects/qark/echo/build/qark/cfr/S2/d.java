/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package S2;

import S2.b;
import S2.c;
import com.google.android.gms.common.api.Scope;
import y2.a;

public abstract class d {
    public static final a.g a;
    public static final a.g b;
    public static final a.a c;
    public static final a.a d;
    public static final Scope e;
    public static final Scope f;
    public static final a g;
    public static final a h;

    static {
        a.g g8;
        a.g g9;
        a = g8 = new a.g();
        b = g9 = new a.g();
        b b8 = new b();
        c = b8;
        c c8 = new c();
        d = c8;
        e = new Scope("profile");
        f = new Scope("email");
        g = new a("SignIn.API", b8, g8);
        h = new a("SignIn.INTERNAL_API", c8, g9);
    }
}

