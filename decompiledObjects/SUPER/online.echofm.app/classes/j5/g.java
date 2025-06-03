package j5;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec.Builder;
import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.util.Calendar;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource.PSpecified;
import javax.security.auth.x500.X500Principal;

public class g
  extends f
{
  public g(Context paramContext)
  {
    super(paramContext);
  }
  
  public String c()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(b.getPackageName());
    localStringBuilder.append(".FlutterSecureStoragePluginKeyOAEP");
    return localStringBuilder.toString();
  }
  
  public AlgorithmParameterSpec f()
  {
    return new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA1, PSource.PSpecified.DEFAULT);
  }
  
  public Cipher i()
  {
    return Cipher.getInstance("RSA/ECB/OAEPPadding", "AndroidKeyStoreBCWorkaround");
  }
  
  public AlgorithmParameterSpec j(Context paramContext, Calendar paramCalendar1, Calendar paramCalendar2)
  {
    paramContext = new KeyGenParameterSpec.Builder(a, 3);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("CN=");
    localStringBuilder.append(a);
    return paramContext.setCertificateSubject(new X500Principal(localStringBuilder.toString())).setDigests(new String[] { "SHA-256" }).setBlockModes(new String[] { "ECB" }).setEncryptionPaddings(new String[] { "OAEPPadding" }).setCertificateSerialNumber(BigInteger.valueOf(1L)).setCertificateNotBefore(paramCalendar1.getTime()).setCertificateNotAfter(paramCalendar2.getTime()).build();
  }
}

/* Location:
 * Qualified Name:     j5.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */