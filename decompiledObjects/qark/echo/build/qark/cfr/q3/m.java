/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.security.GeneralSecurityException
 *  java.security.InvalidAlgorithmParameterException
 *  java.security.Key
 *  java.util.Arrays
 *  javax.crypto.Cipher
 *  javax.crypto.SecretKey
 *  javax.crypto.spec.SecretKeySpec
 */
package q3;

import h3.b;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import o3.a;
import q3.f;
import q3.i;
import q3.r;

public final class m
implements a {
    public static final b.b d = b.b.o;
    public final SecretKey a;
    public byte[] b;
    public byte[] c;

    public m(byte[] arrby) {
        r.a(arrby.length);
        this.a = new SecretKeySpec(arrby, "AES");
        this.b();
    }

    public static Cipher c() {
        if (d.c()) {
            return (Cipher)i.b.a("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override
    public byte[] a(byte[] arrby, int n8) {
        if (n8 <= 16) {
            Cipher cipher = m.c();
            cipher.init(1, (Key)this.a);
            int n9 = Math.max((int)1, (int)((int)Math.ceil((double)((double)arrby.length / 16.0))));
            byte[] arrby2 = n9 * 16 == arrby.length ? f.d(arrby, (n9 - 1) * 16, this.b, 0, 16) : f.e(m3.a.a(Arrays.copyOfRange((byte[])arrby, (int)((n9 - 1) * 16), (int)arrby.length)), this.c);
            byte[] arrby3 = new byte[16];
            for (int i8 = 0; i8 < n9 - 1; ++i8) {
                arrby3 = cipher.doFinal(f.d(arrby3, 0, arrby, i8 * 16, 16));
            }
            return Arrays.copyOf((byte[])cipher.doFinal(f.e(arrby2, arrby3)), (int)n8);
        }
        throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
    }

    public final void b() {
        byte[] arrby = m.c();
        arrby.init(1, (Key)this.a);
        arrby = m3.a.b(arrby.doFinal(new byte[16]));
        this.b = arrby;
        this.c = m3.a.b(arrby);
    }
}

