/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.security.GeneralSecurityException
 *  java.security.InvalidAlgorithmParameterException
 *  java.util.Locale
 *  java.util.regex.Pattern
 */
package q3;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Locale;
import java.util.regex.Pattern;

public abstract class r {
    public static final Pattern a = Pattern.compile((String)String.format((String)"^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", (Object[])new Object[]{"([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"}), (int)2);
    public static final Pattern b = Pattern.compile((String)String.format((String)"^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", (Object[])new Object[]{"([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"}), (int)2);

    public static void a(int n8) {
        if (n8 != 16) {
            if (n8 == 32) {
                return;
            }
            throw new InvalidAlgorithmParameterException(String.format((String)"invalid key size %d; only 128-bit and 256-bit AES keys are supported", (Object[])new Object[]{n8 * 8}));
        }
    }

    public static String b(String string2, String string3) {
        if (string3.toLowerCase(Locale.US).startsWith(string2)) {
            return string3.substring(string2.length());
        }
        throw new IllegalArgumentException(String.format((String)"key URI must start with %s", (Object[])new Object[]{string2}));
    }

    public static void c(int n8, int n9) {
        if (n8 >= 0 && n8 <= n9) {
            return;
        }
        throw new GeneralSecurityException(String.format((String)"key has version %d; only keys with version in range [0..%d] are supported", (Object[])new Object[]{n8, n9}));
    }
}

