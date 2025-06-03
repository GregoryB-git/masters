package j5;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.security.keystore.KeyGenParameterSpec.Builder;
import java.math.BigInteger;
import java.security.Key;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Calendar;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;

public class f
  implements a
{
  public final String a;
  public final Context b;
  
  public f(Context paramContext)
  {
    b = paramContext;
    a = c();
    e(paramContext);
  }
  
  public byte[] a(Key paramKey)
  {
    PublicKey localPublicKey = h();
    Cipher localCipher = i();
    localCipher.init(3, localPublicKey, f());
    return localCipher.wrap(paramKey);
  }
  
  public Key b(byte[] paramArrayOfByte, String paramString)
  {
    PrivateKey localPrivateKey = g();
    Cipher localCipher = i();
    localCipher.init(4, localPrivateKey, f());
    return localCipher.unwrap(paramArrayOfByte, paramString, 3);
  }
  
  public String c()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(b.getPackageName());
    localStringBuilder.append(".FlutterSecureStoragePluginKey");
    return localStringBuilder.toString();
  }
  
  public final void d(Context paramContext)
  {
    Locale localLocale = Locale.getDefault();
    try
    {
      k(Locale.ENGLISH);
      Calendar localCalendar1 = Calendar.getInstance();
      Calendar localCalendar2 = Calendar.getInstance();
      localCalendar2.add(1, 25);
      KeyPairGenerator localKeyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
      localKeyPairGenerator.initialize(j(paramContext, localCalendar1, localCalendar2));
      localKeyPairGenerator.generateKeyPair();
      return;
    }
    finally
    {
      k(localLocale);
    }
  }
  
  public final void e(Context paramContext)
  {
    KeyStore localKeyStore = KeyStore.getInstance("AndroidKeyStore");
    localKeyStore.load(null);
    if (localKeyStore.getKey(a, null) == null) {
      d(paramContext);
    }
  }
  
  public AlgorithmParameterSpec f()
  {
    return null;
  }
  
  public final PrivateKey g()
  {
    Object localObject = KeyStore.getInstance("AndroidKeyStore");
    ((KeyStore)localObject).load(null);
    localObject = ((KeyStore)localObject).getKey(a, null);
    if (localObject != null)
    {
      if ((localObject instanceof PrivateKey)) {
        return (PrivateKey)localObject;
      }
      throw new Exception("Not an instance of a PrivateKey");
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("No key found under alias: ");
    ((StringBuilder)localObject).append(a);
    throw new Exception(((StringBuilder)localObject).toString());
  }
  
  public final PublicKey h()
  {
    Object localObject = KeyStore.getInstance("AndroidKeyStore");
    ((KeyStore)localObject).load(null);
    localObject = ((KeyStore)localObject).getCertificate(a);
    if (localObject != null)
    {
      localObject = ((Certificate)localObject).getPublicKey();
      if (localObject != null) {
        return (PublicKey)localObject;
      }
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append("No key found under alias: ");
      ((StringBuilder)localObject).append(a);
      throw new Exception(((StringBuilder)localObject).toString());
    }
    localObject = new StringBuilder();
    ((StringBuilder)localObject).append("No certificate found under alias: ");
    ((StringBuilder)localObject).append(a);
    throw new Exception(((StringBuilder)localObject).toString());
  }
  
  public Cipher i()
  {
    return Cipher.getInstance("RSA/ECB/PKCS1Padding", "AndroidKeyStoreBCWorkaround");
  }
  
  public AlgorithmParameterSpec j(Context paramContext, Calendar paramCalendar1, Calendar paramCalendar2)
  {
    paramContext = new KeyGenParameterSpec.Builder(a, 3);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("CN=");
    localStringBuilder.append(a);
    return paramContext.setCertificateSubject(new X500Principal(localStringBuilder.toString())).setDigests(new String[] { "SHA-256" }).setBlockModes(new String[] { "ECB" }).setEncryptionPaddings(new String[] { "PKCS1Padding" }).setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(paramCalendar1.getTime()).setCertificateNotAfter(paramCalendar2.getTime()).build();
  }
  
  public final void k(Locale paramLocale)
  {
    Locale.setDefault(paramLocale);
    Configuration localConfiguration = b.getResources().getConfiguration();
    localConfiguration.setLocale(paramLocale);
    b.createConfigurationContext(localConfiguration);
  }
}

/* Location:
 * Qualified Name:     j5.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */