/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.security.GeneralSecurityException
 *  java.util.Arrays
 */
package q3;

import c3.a;
import h3.b;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import q3.p;

public final class c
implements a {
    public static final b.b b = b.b.p;
    public final e3.b a;

    public c(byte[] arrby) {
        if (b.c()) {
            this.a = new e3.b(arrby, true);
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override
    public byte[] a(byte[] arrby, byte[] arrby2) {
        byte[] arrby3 = p.c(12);
        return this.a.b(arrby3, arrby, arrby2);
    }

    @Override
    public byte[] b(byte[] arrby, byte[] arrby2) {
        byte[] arrby3 = Arrays.copyOf((byte[])arrby, (int)12);
        return this.a.a(arrby3, arrby, arrby2);
    }
}

