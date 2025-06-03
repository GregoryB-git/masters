package R2;

import G2.c;
import G2.d;
import android.content.pm.PackageInfo;
import android.os.BaseBundle;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.c0;

public final class u2
{
  public final N2 a;
  
  public u2(D5 paramD5)
  {
    a = paramD5.i0();
  }
  
  public final Bundle a(String paramString, c0 paramc0)
  {
    a.e().n();
    if (paramc0 == null)
    {
      a.j().L().a("Attempting to use Install Referrer Service while it is not initialized");
      return null;
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("package_name", paramString);
    try
    {
      paramString = paramc0.l(localBundle);
      if (paramString == null)
      {
        a.j().G().a("Install Referrer Service returned a null response");
        return null;
      }
    }
    catch (Exception paramString)
    {
      break label81;
      return paramString;
      label81:
      a.j().G().b("Exception occurred while retrieving the Install Referrer", paramString.getMessage());
    }
    return null;
  }
  
  public final boolean b()
  {
    boolean bool = false;
    try
    {
      c localc = d.a(a.a());
      if (localc == null)
      {
        a.j().K().a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
        return false;
      }
    }
    catch (Exception localException)
    {
      break label61;
      int i = e"com.android.vending"128versionCode;
      if (i >= 80837300) {
        bool = true;
      }
      return bool;
      label61:
      a.j().K().b("Failed to retrieve Play Store version for Install Referrer", localException);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     R2.u2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */