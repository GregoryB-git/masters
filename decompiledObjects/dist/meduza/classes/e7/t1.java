package e7;

import android.content.pm.PackageInfo;
import x6.c;
import x6.d;

public final class t1
{
  public final j2 a;
  
  public t1(i6 parami6)
  {
    a = t;
  }
  
  public final boolean a()
  {
    boolean bool = false;
    try
    {
      c localc = d.a(a.a);
      if (localc == null)
      {
        a.zzj().w.b("Failed to get PackageManager for Install Referrer Play Store compatibility check");
        return false;
      }
      int i = b128"com.android.vending"versionCode;
      if (i >= 80837300) {
        bool = true;
      }
      return bool;
    }
    catch (Exception localException)
    {
      a.zzj().w.c("Failed to retrieve Play Store version for Install Referrer", localException);
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     e7.t1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */