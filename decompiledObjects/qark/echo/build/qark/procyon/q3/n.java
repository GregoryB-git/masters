// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q3;

import java.util.Arrays;
import java.security.InvalidAlgorithmParameterException;
import java.security.NoSuchAlgorithmException;
import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import java.security.Key;
import h3.b;
import o3.a;

public final class n implements a
{
    public static final b.b e;
    public final ThreadLocal a;
    public final String b;
    public final Key c;
    public final int d;
    
    static {
        e = b.b.p;
    }
    
    public n(final String s, final Key c) {
        final ThreadLocal a = new ThreadLocal() {
            public Mac a() {
                try {
                    final Mac mac = (Mac)i.c.a(n.b(n.this));
                    mac.init(n.c(n.this));
                    return mac;
                }
                catch (GeneralSecurityException cause) {
                    throw new IllegalStateException(cause);
                }
            }
        };
        this.a = a;
        if (!n.e.c()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.b = s;
        this.c = c;
        if (c.getEncoded().length >= 16) {
            s.hashCode();
            final int hashCode = s.hashCode();
            int n = -1;
            switch (hashCode) {
                case 392317873: {
                    if (!s.equals("HMACSHA512")) {
                        break;
                    }
                    n = 4;
                    break;
                }
                case 392316170: {
                    if (!s.equals("HMACSHA384")) {
                        break;
                    }
                    n = 3;
                    break;
                }
                case 392315118: {
                    if (!s.equals("HMACSHA256")) {
                        break;
                    }
                    n = 2;
                    break;
                }
                case 392315023: {
                    if (!s.equals("HMACSHA224")) {
                        break;
                    }
                    n = 1;
                    break;
                }
                case -1823053428: {
                    if (!s.equals("HMACSHA1")) {
                        break;
                    }
                    n = 0;
                    break;
                }
            }
            int d = 0;
            switch (n) {
                default: {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("unknown Hmac algorithm: ");
                    sb.append(s);
                    throw new NoSuchAlgorithmException(sb.toString());
                }
                case 4: {
                    d = 64;
                    break;
                }
                case 3: {
                    d = 48;
                    break;
                }
                case 2: {
                    d = 32;
                    break;
                }
                case 1: {
                    d = 28;
                    break;
                }
                case 0: {
                    d = 20;
                    break;
                }
            }
            this.d = d;
            a.get();
            return;
        }
        throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    }
    
    public static /* synthetic */ String b(final n n) {
        return n.b;
    }
    
    public static /* synthetic */ Key c(final n n) {
        return n.c;
    }
    
    @Override
    public byte[] a(final byte[] input, final int newLength) {
        if (newLength <= this.d) {
            this.a.get().update(input);
            return Arrays.copyOf(this.a.get().doFinal(), newLength);
        }
        throw new InvalidAlgorithmParameterException("tag size too big");
    }
}
