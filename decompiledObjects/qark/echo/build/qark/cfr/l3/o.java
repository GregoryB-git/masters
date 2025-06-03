/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.ExceptionInInitializerError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.security.GeneralSecurityException
 */
package l3;

import g3.a;
import java.security.GeneralSecurityException;
import l3.c;
import l3.h;
import l3.k;
import l3.r;
import p3.J;

public abstract class o {
    public static final String a;
    public static final J b;
    public static final J c;
    public static final J d;

    static {
        J j8;
        a = new k().d();
        b = j8 = J.V();
        c = j8;
        d = j8;
        try {
            o.a();
            return;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new ExceptionInInitializerError((Throwable)generalSecurityException);
        }
    }

    public static void a() {
        o.b();
    }

    public static void b() {
        r.f();
        h.d();
        k.p(true);
        if (a.a()) {
            return;
        }
        c.o(true);
    }
}

