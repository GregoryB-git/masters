/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.security.GeneralSecurityException
 */
package m3;

import h3.b;
import java.security.GeneralSecurityException;
import l3.a;
import l3.g;

public final class b
implements g {
    public static final b.b b = b.b.o;
    public final a a;

    public b(a a8) {
        if (b.c()) {
            this.a = a8;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
}

