/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.security.GeneralSecurityException
 *  java.security.InvalidKeyException
 *  java.security.Key
 *  java.security.spec.AlgorithmParameterSpec
 *  java.util.Arrays
 *  java.util.Collection
 *  javax.crypto.AEADBadTagException
 *  javax.crypto.Cipher
 *  javax.crypto.spec.IvParameterSpec
 *  javax.crypto.spec.SecretKeySpec
 */
package q3;

import c3.e;
import h3.b;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import m3.a;
import q3.f;
import q3.i;
import q3.m;
import q3.q;

public final class d
implements e {
    public static final b.b c = b.b.o;
    public static final Collection d = Arrays.asList((Object[])new Integer[]{64});
    public static final byte[] e = new byte[16];
    public static final byte[] f = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
    public final m a;
    public final byte[] b;

    public d(byte[] arrby) {
        if (c.c()) {
            if (d.contains((Object)arrby.length)) {
                byte[] arrby2 = Arrays.copyOfRange((byte[])arrby, (int)0, (int)(arrby.length / 2));
                this.b = Arrays.copyOfRange((byte[])arrby, (int)(arrby.length / 2), (int)arrby.length);
                this.a = new m(arrby2);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("invalid key size: ");
            stringBuilder.append(arrby.length);
            stringBuilder.append(" bytes; key must have 64 bytes");
            throw new InvalidKeyException(stringBuilder.toString());
        }
        throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
    }

    @Override
    public byte[] a(byte[] arrby, byte[] arrby2) {
        if (arrby.length <= 2147483631) {
            Cipher cipher = (Cipher)i.b.a("AES/CTR/NoPadding");
            arrby2 = this.c(arrby2, arrby);
            byte[] arrby3 = (byte[])arrby2.clone();
            arrby3[8] = (byte)(arrby3[8] & 127);
            arrby3[12] = (byte)(arrby3[12] & 127);
            cipher.init(1, (Key)new SecretKeySpec(this.b, "AES"), (AlgorithmParameterSpec)new IvParameterSpec(arrby3));
            return f.a(arrby2, cipher.doFinal(arrby));
        }
        throw new GeneralSecurityException("plaintext too long");
    }

    @Override
    public byte[] b(byte[] arrby, byte[] arrby2) {
        if (arrby.length >= 16) {
            byte[] arrby3 = (byte[])i.b.a("AES/CTR/NoPadding");
            byte[] arrby4 = Arrays.copyOfRange((byte[])arrby, (int)0, (int)16);
            byte[] arrby5 = (byte[])arrby4.clone();
            arrby5[8] = (byte)(arrby5[8] & 127);
            arrby5[12] = (byte)(arrby5[12] & 127);
            arrby3.init(2, (Key)new SecretKeySpec(this.b, "AES"), (AlgorithmParameterSpec)new IvParameterSpec(arrby5));
            arrby5 = Arrays.copyOfRange((byte[])arrby, (int)16, (int)arrby.length);
            arrby3 = arrby3.doFinal(arrby5);
            arrby = arrby3;
            if (arrby5.length == 0) {
                arrby = arrby3;
                if (arrby3 == null) {
                    arrby = arrby3;
                    if (q.b()) {
                        arrby = new byte[]{};
                    }
                }
            }
            if (f.b(arrby4, this.c(arrby2, arrby))) {
                return arrby;
            }
            throw new AEADBadTagException("Integrity check failed.");
        }
        throw new GeneralSecurityException("Ciphertext too short.");
    }

    public final /* varargs */ byte[] c(byte[] ... arrby) {
        if (arrby.length == 0) {
            return this.a.a(f, 16);
        }
        byte[] arrby2 = this.a.a(e, 16);
        for (int i8 = 0; i8 < arrby.length - 1; ++i8) {
            byte[] arrby3;
            byte[] arrby4 = arrby3 = arrby[i8];
            if (arrby3 == null) {
                arrby4 = new byte[]{};
            }
            arrby2 = f.e(a.b(arrby2), this.a.a(arrby4, 16));
        }
        arrby = (arrby = arrby[arrby.length - 1]).length >= 16 ? f.f((byte[])arrby, arrby2) : f.e(a.a((byte[])arrby), a.b(arrby2));
        return this.a.a((byte[])arrby, 16);
    }
}

