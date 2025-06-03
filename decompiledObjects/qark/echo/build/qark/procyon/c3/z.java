// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c3;

import com.google.crypto.tink.shaded.protobuf.x;
import p3.y;
import p3.I;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import p3.D;
import p3.C;
import java.nio.charset.Charset;

public abstract class z
{
    public static final Charset a;
    
    static {
        a = Charset.forName("UTF-8");
    }
    
    public static D.c a(final C.c c) {
        return (D.c)((x.a)D.c.a0().B(c.Z().a0()).A(c.c0()).z(c.b0()).y(c.a0())).n();
    }
    
    public static D b(final C c) {
        final D.b z = D.a0().z(c.c0());
        final Iterator<C.c> iterator = c.b0().iterator();
        while (iterator.hasNext()) {
            z.y(a(iterator.next()));
        }
        return (D)((x.a)z).n();
    }
    
    public static void c(final C.c c) {
        if (!c.d0()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", c.a0()));
        }
        if (c.b0() == I.p) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", c.a0()));
        }
        if (c.c0() != p3.z.p) {
            return;
        }
        throw new GeneralSecurityException(String.format("key %d has unknown status", c.a0()));
    }
    
    public static void d(final C c) {
        final int c2 = c.c0();
        final Iterator<C.c> iterator = (Iterator<C.c>)c.b0().iterator();
        int n2;
        int n = n2 = 0;
        boolean b = true;
        while (iterator.hasNext()) {
            final C.c c3 = iterator.next();
            if (c3.c0() != p3.z.q) {
                continue;
            }
            c(c3);
            int n3 = n2;
            if (c3.a0() == c2) {
                if (n2 != 0) {
                    throw new GeneralSecurityException("keyset contains multiple primary keys");
                }
                n3 = 1;
            }
            if (c3.Z().Z() != y.c.s) {
                b = false;
            }
            ++n;
            n2 = n3;
        }
        if (n == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (n2 != 0) {
            return;
        }
        if (b) {
            return;
        }
        throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
    }
}
