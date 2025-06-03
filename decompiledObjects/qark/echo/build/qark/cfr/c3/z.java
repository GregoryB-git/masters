/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.charset.Charset
 *  java.security.GeneralSecurityException
 *  java.util.Iterator
 *  java.util.List
 */
package c3;

import com.google.crypto.tink.shaded.protobuf.x;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import p3.C;
import p3.D;
import p3.I;
import p3.y;

public abstract class z {
    public static final Charset a = Charset.forName((String)"UTF-8");

    public static D.c a(C.c c8) {
        return (D.c)D.c.a0().B(c8.Z().a0()).A(c8.c0()).z(c8.b0()).y(c8.a0()).n();
    }

    public static D b(C c8) {
        D.b b8 = D.a0().z(c8.c0());
        c8 = c8.b0().iterator();
        while (c8.hasNext()) {
            b8.y(z.a((C.c)c8.next()));
        }
        return (D)b8.n();
    }

    public static void c(C.c c8) {
        if (c8.d0()) {
            if (c8.b0() != I.p) {
                if (c8.c0() != p3.z.p) {
                    return;
                }
                throw new GeneralSecurityException(String.format((String)"key %d has unknown status", (Object[])new Object[]{c8.a0()}));
            }
            throw new GeneralSecurityException(String.format((String)"key %d has unknown prefix", (Object[])new Object[]{c8.a0()}));
        }
        throw new GeneralSecurityException(String.format((String)"key %d has no key data", (Object[])new Object[]{c8.a0()}));
    }

    public static void d(C c8) {
        int n8;
        int n9 = c8.c0();
        c8 = c8.b0().iterator();
        int n10 = n8 = 0;
        boolean bl = true;
        while (c8.hasNext()) {
            C.c c9 = (C.c)c8.next();
            if (c9.c0() != p3.z.q) continue;
            z.c(c9);
            int n11 = n10;
            if (c9.a0() == n9) {
                if (n10 == 0) {
                    n11 = 1;
                } else {
                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                }
            }
            if (c9.Z().Z() != y.c.s) {
                bl = false;
            }
            ++n8;
            n10 = n11;
        }
        if (n8 != 0) {
            if (n10 == 0) {
                if (bl) {
                    return;
                }
                throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
            }
            return;
        }
        throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
    }
}

