package v6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import x6.c;
import x6.d;

public final class a
{
  @Deprecated
  public static byte[] a(Context paramContext, String paramString)
  {
    PackageInfo localPackageInfo = d.a(paramContext).b(64, paramString);
    paramContext = signatures;
    if ((paramContext != null) && (paramContext.length == 1))
    {
      int i = 0;
      while (i < 2) {
        try
        {
          paramString = MessageDigest.getInstance("SHA1");
          paramContext = paramString;
          if (paramString != null) {
            break label53;
          }
          i++;
        }
        catch (NoSuchAlgorithmException paramContext)
        {
          for (;;) {}
        }
      }
      paramContext = null;
      label53:
      if (paramContext != null) {
        return paramContext.digest(signatures[0].toByteArray());
      }
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     v6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */