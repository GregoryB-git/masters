/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.security.GeneralSecurityException
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 */
package k3;

import c3.k;
import c3.v;
import java.security.GeneralSecurityException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import n3.a;
import n3.b;
import n3.c;
import p3.I;
import p3.z;

public abstract class f {
    public static final b.a a = new b(null);

    public static c a(v object) {
        c.b b8 = c.a();
        b8.d(object.d());
        Iterator iterator = object.c().iterator();
        while (iterator.hasNext()) {
            for (v.c c8 : (List)iterator.next()) {
                b8.a(f.c(c8.h()), c8.d(), f.b(c8.e()), c8.f().name());
            }
        }
        if (object.e() != null) {
            b8.e(object.e().d());
        }
        try {
            object = b8.b();
            return object;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new IllegalStateException((Throwable)generalSecurityException);
        }
    }

    public static String b(String string2) {
        if (!string2.startsWith("type.googleapis.com/google.crypto.")) {
            return string2;
        }
        return string2.substring(34);
    }

    public static k c(z z8) {
        int n8 = .a[z8.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 == 3) {
                    return k.d;
                }
                throw new IllegalStateException("Unknown key status");
            }
            return k.c;
        }
        return k.b;
    }

    public static class b
    implements b.a {
        public b() {
        }

        public /* synthetic */ b( a8) {
            this();
        }

        @Override
        public void a() {
        }

        @Override
        public void b(int n8, long l8) {
        }
    }

}

