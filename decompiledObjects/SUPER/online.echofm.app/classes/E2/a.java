package E2;

import G2.c;
import G2.d;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class a
{
  public static byte[] a(Context paramContext, String paramString)
  {
    paramContext = d.a(paramContext).e(paramString, 64);
    paramString = signatures;
    if ((paramString != null) && (paramString.length == 1))
    {
      paramString = b("SHA1");
      if (paramString != null) {
        return paramString.digest(signatures[0].toByteArray());
      }
    }
    return null;
  }
  
  public static MessageDigest b(String paramString)
  {
    for (int i = 0; i < 2; i++) {
      try
      {
        MessageDigest localMessageDigest = MessageDigest.getInstance(paramString);
        if (localMessageDigest != null) {
          return localMessageDigest;
        }
      }
      catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
      {
        for (;;) {}
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     E2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */