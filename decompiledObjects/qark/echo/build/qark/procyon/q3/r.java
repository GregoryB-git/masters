// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package q3;

import java.security.GeneralSecurityException;
import java.util.Locale;
import java.security.InvalidAlgorithmParameterException;
import java.util.regex.Pattern;

public abstract class r
{
    public static final Pattern a;
    public static final Pattern b;
    
    static {
        a = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);
        b = Pattern.compile(String.format("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"), 2);
    }
    
    public static void a(final int n) {
        if (n == 16) {
            return;
        }
        if (n == 32) {
            return;
        }
        throw new InvalidAlgorithmParameterException(String.format("invalid key size %d; only 128-bit and 256-bit AES keys are supported", n * 8));
    }
    
    public static String b(final String prefix, final String s) {
        if (s.toLowerCase(Locale.US).startsWith(prefix)) {
            return s.substring(prefix.length());
        }
        throw new IllegalArgumentException(String.format("key URI must start with %s", prefix));
    }
    
    public static void c(final int i, final int j) {
        if (i >= 0 && i <= j) {
            return;
        }
        throw new GeneralSecurityException(String.format("key has version %d; only keys with version in range [0..%d] are supported", i, j));
    }
}
