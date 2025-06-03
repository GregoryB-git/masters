/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.security.GeneralSecurityException
 *  java.security.InvalidAlgorithmParameterException
 */
package q3;

import c3.t;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import o3.a;
import q3.f;

public class o
implements t {
    public final a a;
    public final int b;

    public o(a a8, int n8) {
        this.a = a8;
        this.b = n8;
        if (n8 >= 10) {
            a8.a(new byte[0], n8);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    @Override
    public void a(byte[] arrby, byte[] arrby2) {
        if (f.b(this.b(arrby2), arrby)) {
            return;
        }
        throw new GeneralSecurityException("invalid MAC");
    }

    @Override
    public byte[] b(byte[] arrby) {
        return this.a.a(arrby, this.b);
    }
}

