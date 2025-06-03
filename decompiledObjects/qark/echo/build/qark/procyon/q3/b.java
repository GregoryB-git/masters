// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q3;

import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import java.security.Key;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import c3.a;

public final class b implements a
{
    public static final h3.b.b e;
    public static final ThreadLocal f;
    public static final ThreadLocal g;
    public final byte[] a;
    public final byte[] b;
    public final SecretKeySpec c;
    public final int d;
    
    static {
        e = h3.b.b.o;
        f = new ThreadLocal() {
            public Cipher a() {
                try {
                    return (Cipher)i.b.a("AES/ECB/NOPADDING");
                }
                catch (GeneralSecurityException cause) {
                    throw new IllegalStateException(cause);
                }
            }
        };
        g = new ThreadLocal() {
            public Cipher a() {
                try {
                    return (Cipher)i.b.a("AES/CTR/NOPADDING");
                }
                catch (GeneralSecurityException cause) {
                    throw new IllegalStateException(cause);
                }
            }
        };
    }
    
    public b(byte[] c, final int d) {
        if (!q3.b.e.c()) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (d != 12 && d != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.d = d;
        r.a(c.length);
        final SecretKeySpec secretKeySpec = new SecretKeySpec(c, "AES");
        this.c = secretKeySpec;
        final Cipher cipher = q3.b.f.get();
        cipher.init(1, secretKeySpec);
        c = c(cipher.doFinal(new byte[16]));
        this.a = c;
        this.b = c(c);
    }
    
    public static byte[] c(final byte[] array) {
        final byte[] array2 = new byte[16];
        int n;
        for (int i = 0; i < 15; i = n) {
            final byte b = array[i];
            n = i + 1;
            array2[i] = (byte)((b << 1 ^ (array[n] & 0xFF) >>> 7) & 0xFF);
        }
        array2[15] = (byte)((array[0] >> 7 & 0x87) ^ array[15] << 1);
        return array2;
    }
    
    public static byte[] f(final byte[] array, final byte[] array2) {
        final int length = array.length;
        final byte[] array3 = new byte[length];
        for (int i = 0; i < length; ++i) {
            array3[i] = (byte)(array[i] ^ array2[i]);
        }
        return array3;
    }
    
    @Override
    public byte[] a(final byte[] input, byte[] d) {
        final int length = input.length;
        final int d2 = this.d;
        if (length <= 2147483631 - d2) {
            final byte[] output = new byte[input.length + d2 + 16];
            final byte[] c = p.c(d2);
            final int d3 = this.d;
            int i = 0;
            System.arraycopy(c, 0, output, 0, d3);
            final Cipher cipher = q3.b.f.get();
            cipher.init(1, this.c);
            final byte[] d4 = this.d(cipher, 0, c, 0, c.length);
            if (d == null) {
                d = new byte[0];
            }
            d = this.d(cipher, 1, d, 0, d.length);
            final Cipher cipher2 = q3.b.g.get();
            cipher2.init(1, this.c, new IvParameterSpec(d4));
            cipher2.doFinal(input, 0, input.length, output, this.d);
            final byte[] d5 = this.d(cipher, 2, output, this.d, input.length);
            final int length2 = input.length;
            final int d6 = this.d;
            while (i < 16) {
                output[length2 + d6 + i] = (byte)(d[i] ^ d4[i] ^ d5[i]);
                ++i;
            }
            return output;
        }
        throw new GeneralSecurityException("plaintext too long");
    }
    
    @Override
    public byte[] b(final byte[] input, byte[] d) {
        final int inputLen = input.length - this.d - 16;
        if (inputLen < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        final Cipher cipher = q3.b.f.get();
        cipher.init(1, this.c);
        final byte[] d2 = this.d(cipher, 0, input, 0, this.d);
        int i = 0;
        byte[] array;
        if ((array = d) == null) {
            array = new byte[0];
        }
        d = this.d(cipher, 1, array, 0, array.length);
        final byte[] d3 = this.d(cipher, 2, input, this.d, inputLen);
        final int length = input.length;
        byte b = 0;
        while (i < 16) {
            b |= (byte)(input[length - 16 + i] ^ d[i] ^ d2[i] ^ d3[i]);
            ++i;
        }
        if (b == 0) {
            final Cipher cipher2 = q3.b.g.get();
            cipher2.init(1, this.c, new IvParameterSpec(d2));
            return cipher2.doFinal(input, this.d, inputLen);
        }
        throw new AEADBadTagException("tag mismatch");
    }
    
    public final byte[] d(final Cipher cipher, int n, final byte[] original, final int n2, final int n3) {
        final byte[] input = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, (byte)n };
        if (n3 == 0) {
            return cipher.doFinal(f(input, this.a));
        }
        byte[] input2 = cipher.doFinal(input);
        int i;
        for (n = 0; n3 - n > 16; n += 16) {
            for (i = 0; i < 16; ++i) {
                input2[i] ^= original[n2 + n + i];
            }
            input2 = cipher.doFinal(input2);
        }
        return cipher.doFinal(f(input2, this.e(Arrays.copyOfRange(original, n + n2, n2 + n3))));
    }
    
    public final byte[] e(final byte[] array) {
        if (array.length == 16) {
            return f(array, this.a);
        }
        final byte[] copy = Arrays.copyOf(this.b, 16);
        for (int i = 0; i < array.length; ++i) {
            copy[i] ^= array[i];
        }
        copy[array.length] ^= (byte)128;
        return copy;
    }
}
