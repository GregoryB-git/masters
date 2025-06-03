package j3;

import android.util.Log;
import c3.a;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.ProviderException;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

public final class b
  implements a
{
  public static final String b = "b";
  public final SecretKey a;
  
  public b(String paramString, KeyStore paramKeyStore)
  {
    paramKeyStore = (SecretKey)paramKeyStore.getKey(paramString, null);
    a = paramKeyStore;
    if (paramKeyStore != null) {
      return;
    }
    paramKeyStore = new StringBuilder();
    paramKeyStore.append("Keystore cannot load the key with ID: ");
    paramKeyStore.append(paramString);
    throw new InvalidKeyException(paramKeyStore.toString());
  }
  
  public static void e()
  {
    long l = (int)(Math.random() * 100.0D);
    try
    {
      Thread.sleep(l);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    try
    {
      byte[] arrayOfByte = d(paramArrayOfByte1, paramArrayOfByte2);
      return arrayOfByte;
    }
    catch (GeneralSecurityException localGeneralSecurityException) {}catch (ProviderException localProviderException) {}
    Log.w(b, "encountered a potentially transient KeyStore error, will wait and retry", localProviderException);
    e();
    return d(paramArrayOfByte1, paramArrayOfByte2);
  }
  
  public byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length >= 28) {
      try
      {
        try
        {
          byte[] arrayOfByte = c(paramArrayOfByte1, paramArrayOfByte2);
          return arrayOfByte;
        }
        catch (GeneralSecurityException localGeneralSecurityException) {}catch (ProviderException localProviderException) {}
        Log.w(b, "encountered a potentially transient KeyStore error, will wait and retry", localProviderException);
        e();
        return c(paramArrayOfByte1, paramArrayOfByte2);
      }
      catch (AEADBadTagException paramArrayOfByte1)
      {
        throw paramArrayOfByte1;
      }
    }
    throw new GeneralSecurityException("ciphertext too short");
  }
  
  public final byte[] c(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    GCMParameterSpec localGCMParameterSpec = new GCMParameterSpec(128, paramArrayOfByte1, 0, 12);
    Cipher localCipher = Cipher.getInstance("AES/GCM/NoPadding");
    localCipher.init(2, a, localGCMParameterSpec);
    localCipher.updateAAD(paramArrayOfByte2);
    return localCipher.doFinal(paramArrayOfByte1, 12, paramArrayOfByte1.length - 12);
  }
  
  public final byte[] d(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1.length <= 2147483619)
    {
      byte[] arrayOfByte = new byte[paramArrayOfByte1.length + 28];
      Cipher localCipher = Cipher.getInstance("AES/GCM/NoPadding");
      localCipher.init(1, a);
      localCipher.updateAAD(paramArrayOfByte2);
      localCipher.doFinal(paramArrayOfByte1, 0, paramArrayOfByte1.length, arrayOfByte, 12);
      System.arraycopy(localCipher.getIV(), 0, arrayOfByte, 0, 12);
      return arrayOfByte;
    }
    throw new GeneralSecurityException("plaintext too long");
  }
}

/* Location:
 * Qualified Name:     j3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */