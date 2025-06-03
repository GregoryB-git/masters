/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.security.keystore.KeyGenParameterSpec
 *  android.security.keystore.KeyGenParameterSpec$Builder
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.security.GeneralSecurityException
 *  java.security.KeyStore
 *  java.security.KeyStore$LoadStoreParameter
 *  java.security.ProviderException
 *  java.security.spec.AlgorithmParameterSpec
 *  java.util.Arrays
 *  javax.crypto.KeyGenerator
 *  javax.crypto.SecretKey
 */
package s1;

import android.security.keystore.KeyGenParameterSpec;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Arrays;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public abstract class e {
    public static final KeyGenParameterSpec a = e.a("_androidx_security_master_key_");
    public static final Object b = new Object();

    public static KeyGenParameterSpec a(String string2) {
        return new KeyGenParameterSpec.Builder(string2, 3).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).setKeySize(256).build();
    }

    public static void b(KeyGenParameterSpec keyGenParameterSpec) {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance((String)"AES", (String)"AndroidKeyStore");
            keyGenerator.init((AlgorithmParameterSpec)keyGenParameterSpec);
            keyGenerator.generateKey();
            return;
        }
        catch (ProviderException providerException) {
            throw new GeneralSecurityException(providerException.getMessage(), (Throwable)providerException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static String c(KeyGenParameterSpec keyGenParameterSpec) {
        e.e(keyGenParameterSpec);
        Object object = b;
        // MONITORENTER : object
        if (!e.d(keyGenParameterSpec.getKeystoreAlias())) {
            e.b(keyGenParameterSpec);
        }
        // MONITOREXIT : object
        return keyGenParameterSpec.getKeystoreAlias();
    }

    public static boolean d(String string2) {
        KeyStore keyStore = KeyStore.getInstance((String)"AndroidKeyStore");
        keyStore.load(null);
        return keyStore.containsAlias(string2);
    }

    public static void e(KeyGenParameterSpec keyGenParameterSpec) {
        if (keyGenParameterSpec.getKeySize() == 256) {
            if (Arrays.equals((Object[])keyGenParameterSpec.getBlockModes(), (Object[])new String[]{"GCM"})) {
                if (keyGenParameterSpec.getPurposes() == 3) {
                    if (Arrays.equals((Object[])keyGenParameterSpec.getEncryptionPaddings(), (Object[])new String[]{"NoPadding"})) {
                        if (keyGenParameterSpec.isUserAuthenticationRequired()) {
                            if (keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() >= 1) {
                                return;
                            }
                            throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
                        }
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("invalid padding mode, want NoPadding got ");
                    stringBuilder.append(Arrays.toString((Object[])keyGenParameterSpec.getEncryptionPaddings()));
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
                stringBuilder.append(keyGenParameterSpec.getPurposes());
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("invalid block mode, want GCM got ");
            stringBuilder.append(Arrays.toString((Object[])keyGenParameterSpec.getBlockModes()));
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("invalid key size, want 256 bits got ");
        stringBuilder.append(keyGenParameterSpec.getKeySize());
        stringBuilder.append(" bits");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}

