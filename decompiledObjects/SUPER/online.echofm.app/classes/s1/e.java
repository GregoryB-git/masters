package s1;

import android.security.keystore.KeyGenParameterSpec;
import android.security.keystore.KeyGenParameterSpec.Builder;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

public abstract class e
{
  public static final KeyGenParameterSpec a = a("_androidx_security_master_key_");
  public static final Object b = new Object();
  
  public static KeyGenParameterSpec a(String paramString)
  {
    return new KeyGenParameterSpec.Builder(paramString, 3).setBlockModes(new String[] { "GCM" }).setEncryptionPaddings(new String[] { "NoPadding" }).setKeySize(256).build();
  }
  
  public static void b(KeyGenParameterSpec paramKeyGenParameterSpec)
  {
    try
    {
      KeyGenerator localKeyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
      localKeyGenerator.init(paramKeyGenParameterSpec);
      localKeyGenerator.generateKey();
      return;
    }
    catch (ProviderException paramKeyGenParameterSpec)
    {
      throw new GeneralSecurityException(paramKeyGenParameterSpec.getMessage(), paramKeyGenParameterSpec);
    }
  }
  
  public static String c(KeyGenParameterSpec paramKeyGenParameterSpec)
  {
    e(paramKeyGenParameterSpec);
    synchronized (b)
    {
      if (!d(paramKeyGenParameterSpec.getKeystoreAlias())) {
        b(paramKeyGenParameterSpec);
      }
    }
    return paramKeyGenParameterSpec.getKeystoreAlias();
  }
  
  public static boolean d(String paramString)
  {
    KeyStore localKeyStore = KeyStore.getInstance("AndroidKeyStore");
    localKeyStore.load(null);
    return localKeyStore.containsAlias(paramString);
  }
  
  public static void e(KeyGenParameterSpec paramKeyGenParameterSpec)
  {
    if (paramKeyGenParameterSpec.getKeySize() == 256)
    {
      if (Arrays.equals(paramKeyGenParameterSpec.getBlockModes(), new String[] { "GCM" }))
      {
        if (paramKeyGenParameterSpec.getPurposes() == 3)
        {
          if (Arrays.equals(paramKeyGenParameterSpec.getEncryptionPaddings(), new String[] { "NoPadding" }))
          {
            if ((paramKeyGenParameterSpec.isUserAuthenticationRequired()) && (paramKeyGenParameterSpec.getUserAuthenticationValidityDurationSeconds() < 1)) {
              throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
            }
            return;
          }
          localStringBuilder = new StringBuilder();
          localStringBuilder.append("invalid padding mode, want NoPadding got ");
          localStringBuilder.append(Arrays.toString(paramKeyGenParameterSpec.getEncryptionPaddings()));
          throw new IllegalArgumentException(localStringBuilder.toString());
        }
        localStringBuilder = new StringBuilder();
        localStringBuilder.append("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
        localStringBuilder.append(paramKeyGenParameterSpec.getPurposes());
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
      localStringBuilder = new StringBuilder();
      localStringBuilder.append("invalid block mode, want GCM got ");
      localStringBuilder.append(Arrays.toString(paramKeyGenParameterSpec.getBlockModes()));
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("invalid key size, want 256 bits got ");
    localStringBuilder.append(paramKeyGenParameterSpec.getKeySize());
    localStringBuilder.append(" bits");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     s1.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */