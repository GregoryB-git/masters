// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package s1;

import java.util.Arrays;
import java.security.KeyStore;
import java.security.ProviderException;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGenerator;
import android.security.keystore.KeyGenParameterSpec$Builder;
import android.security.keystore.KeyGenParameterSpec;

public abstract class e
{
    public static final KeyGenParameterSpec a;
    public static final Object b;
    
    static {
        a = a("_androidx_security_master_key_");
        b = new Object();
    }
    
    public static KeyGenParameterSpec a(final String s) {
        return new KeyGenParameterSpec$Builder(s, 3).setBlockModes(new String[] { "GCM" }).setEncryptionPaddings(new String[] { "NoPadding" }).setKeySize(256).build();
    }
    
    public static void b(final KeyGenParameterSpec params) {
        try {
            final KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            instance.init((AlgorithmParameterSpec)params);
            instance.generateKey();
        }
        catch (ProviderException cause) {
            throw new GeneralSecurityException(cause.getMessage(), cause);
        }
    }
    
    public static String c(final KeyGenParameterSpec keyGenParameterSpec) {
        e(keyGenParameterSpec);
        final Object b = e.b;
        // monitorenter(b)
        while (true) {
            try {
                if (!d(keyGenParameterSpec.getKeystoreAlias())) {
                    b(keyGenParameterSpec);
                }
                // monitorexit(b)
                return keyGenParameterSpec.getKeystoreAlias();
                // monitorexit(b)
                throw;
            }
            finally {
                continue;
            }
            break;
        }
    }
    
    public static boolean d(final String alias) {
        final KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
        instance.load(null);
        return instance.containsAlias(alias);
    }
    
    public static void e(final KeyGenParameterSpec keyGenParameterSpec) {
        if (keyGenParameterSpec.getKeySize() != 256) {
            final StringBuilder sb = new StringBuilder();
            sb.append("invalid key size, want 256 bits got ");
            sb.append(keyGenParameterSpec.getKeySize());
            sb.append(" bits");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!Arrays.equals(keyGenParameterSpec.getBlockModes(), new String[] { "GCM" })) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("invalid block mode, want GCM got ");
            sb2.append(Arrays.toString(keyGenParameterSpec.getBlockModes()));
            throw new IllegalArgumentException(sb2.toString());
        }
        if (keyGenParameterSpec.getPurposes() != 3) {
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
            sb3.append(keyGenParameterSpec.getPurposes());
            throw new IllegalArgumentException(sb3.toString());
        }
        if (!Arrays.equals(keyGenParameterSpec.getEncryptionPaddings(), new String[] { "NoPadding" })) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("invalid padding mode, want NoPadding got ");
            sb4.append(Arrays.toString(keyGenParameterSpec.getEncryptionPaddings()));
            throw new IllegalArgumentException(sb4.toString());
        }
        if (!keyGenParameterSpec.isUserAuthenticationRequired()) {
            return;
        }
        if (keyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() >= 1) {
            return;
        }
        throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
    }
}
