package O1;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import x1.B;

public final class E$c
  extends E.e
{
  public String c()
  {
    return "com.facebook.katana.ProxyAuth";
  }
  
  public String d()
  {
    return "com.facebook.katana";
  }
  
  public void f()
  {
    if (g()) {
      Log.w(E.c(), "Apps that target Android API 30+ (Android 11+) cannot call Facebook native apps unless the package visibility needs are declared. Please follow https://developers.facebook.com/docs/android/troubleshooting/#faq_267321845055988 to make the declaration.");
    }
  }
  
  public final boolean g()
  {
    boolean bool;
    if (lgetApplicationInfotargetSdkVersion >= 30) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     O1.E.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */