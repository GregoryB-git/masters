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
import l3.g;
import l3.i;

public final class c
implements g {
    public static final b.b b = b.b.p;
    public final i a;

    public c(i i8) {
        if (b.c()) {
            this.a = i8;
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}

