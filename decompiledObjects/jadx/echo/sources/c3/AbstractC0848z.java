package c3;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import p3.C1794C;
import p3.C1795D;
import p3.I;
import p3.y;

/* renamed from: c3.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0848z {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f10133a = Charset.forName("UTF-8");

    public static C1795D.c a(C1794C.c cVar) {
        return (C1795D.c) C1795D.c.a0().B(cVar.Z().a0()).A(cVar.c0()).z(cVar.b0()).y(cVar.a0()).n();
    }

    public static C1795D b(C1794C c1794c) {
        C1795D.b z7 = C1795D.a0().z(c1794c.c0());
        Iterator it = c1794c.b0().iterator();
        while (it.hasNext()) {
            z7.y(a((C1794C.c) it.next()));
        }
        return (C1795D) z7.n();
    }

    public static void c(C1794C.c cVar) {
        if (!cVar.d0()) {
            throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(cVar.a0())));
        }
        if (cVar.b0() == I.UNKNOWN_PREFIX) {
            throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(cVar.a0())));
        }
        if (cVar.c0() == p3.z.UNKNOWN_STATUS) {
            throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(cVar.a0())));
        }
    }

    public static void d(C1794C c1794c) {
        int c02 = c1794c.c0();
        int i7 = 0;
        boolean z7 = false;
        boolean z8 = true;
        for (C1794C.c cVar : c1794c.b0()) {
            if (cVar.c0() == p3.z.ENABLED) {
                c(cVar);
                if (cVar.a0() == c02) {
                    if (z7) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z7 = true;
                }
                if (cVar.Z().Z() != y.c.ASYMMETRIC_PUBLIC) {
                    z8 = false;
                }
                i7++;
            }
        }
        if (i7 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z7 && !z8) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
