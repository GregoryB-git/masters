/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 *  java.security.GeneralSecurityException
 *  java.security.InvalidAlgorithmParameterException
 *  java.security.Key
 *  java.security.NoSuchAlgorithmException
 *  java.util.Arrays
 *  javax.crypto.Mac
 */
package q3;

import h3.b;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;
import o3.a;
import q3.i;

public final class n
implements a {
    public static final b.b e = b.b.p;
    public final ThreadLocal a;
    public final String b;
    public final Key c;
    public final int d;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public n(String var1_1, Key var2_2) {
        super();
        this.a = var5_3 = new ThreadLocal(){

            public Mac a() {
                try {
                    Mac mac = (Mac)i.c.a(n.this.b);
                    mac.init(n.this.c);
                    return mac;
                }
                catch (GeneralSecurityException generalSecurityException) {
                    throw new IllegalStateException((Throwable)generalSecurityException);
                }
            }
        };
        if (n.e.c() == false) throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        this.b = var1_1;
        this.c = var2_2;
        if (var2_2.getEncoded().length < 16) throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
        var1_1.hashCode();
        var4_4 = var1_1.hashCode();
        var3_5 = -1;
        switch (var4_4) {
            default: {
                break;
            }
            case 392317873: {
                if (!var1_1.equals((Object)"HMACSHA512")) break;
                var3_5 = 4;
                break;
            }
            case 392316170: {
                if (!var1_1.equals((Object)"HMACSHA384")) break;
                var3_5 = 3;
                break;
            }
            case 392315118: {
                if (!var1_1.equals((Object)"HMACSHA256")) break;
                var3_5 = 2;
                break;
            }
            case 392315023: {
                if (!var1_1.equals((Object)"HMACSHA224")) break;
                var3_5 = 1;
                break;
            }
            case -1823053428: {
                if (!var1_1.equals((Object)"HMACSHA1")) break;
                var3_5 = 0;
            }
        }
        switch (var3_5) {
            default: {
                var2_2 = new StringBuilder();
                var2_2.append("unknown Hmac algorithm: ");
                var2_2.append(var1_1);
                throw new NoSuchAlgorithmException(var2_2.toString());
            }
            case 4: {
                var3_5 = 64;
                break;
            }
            case 3: {
                var3_5 = 48;
                break;
            }
            case 2: {
                var3_5 = 32;
                break;
            }
            case 1: {
                var3_5 = 28;
                break;
            }
            case 0: {
                var3_5 = 20;
            }
        }
        this.d = var3_5;
        ** break;
lbl54: // 1 sources:
        var5_3.get();
    }

    @Override
    public byte[] a(byte[] arrby, int n8) {
        if (n8 <= this.d) {
            ((Mac)this.a.get()).update(arrby);
            return Arrays.copyOf((byte[])((Mac)this.a.get()).doFinal(), (int)n8);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }

}

