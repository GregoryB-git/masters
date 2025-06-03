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
package i3;

import i3.a;
import i3.c;
import java.security.GeneralSecurityException;
import p3.J;

public abstract class b {
    public static final String a = new a().d();
    public static final J b = J.V();
    public static final J c = J.V();

    static {
        try {
            b.a();
            return;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new ExceptionInInitializerError((Throwable)generalSecurityException);
        }
    }

    public static void a() {
        c.e();
        if (g3.a.a()) {
            return;
        }
        a.m(true);
    }
}

