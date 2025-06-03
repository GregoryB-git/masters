package r9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import u7.f;
import u7.j;

public final class h
{
  public final Context a;
  public String b;
  public String c;
  public int d;
  public int e = 0;
  
  public h(Context paramContext)
  {
    a = paramContext;
  }
  
  public static String a(f paramf)
  {
    paramf.a();
    String str = c.e;
    if (str != null) {
      return str;
    }
    paramf.a();
    paramf = c.b;
    if (!paramf.startsWith("1:")) {
      return paramf;
    }
    paramf = paramf.split(":");
    if (paramf.length < 2) {
      return null;
    }
    paramf = paramf[1];
    if (paramf.isEmpty()) {
      return null;
    }
    return paramf;
  }
  
  public final PackageInfo b(String paramString)
  {
    try
    {
      paramString = a.getPackageManager().getPackageInfo(paramString, 0);
      return paramString;
    }
    catch (PackageManager.NameNotFoundException paramString)
    {
      String str = String.valueOf(paramString);
      paramString = new StringBuilder(str.length() + 23);
      paramString.append("Failed to find package ");
      paramString.append(str);
      Log.w("FirebaseInstanceId", paramString.toString());
    }
    return null;
  }
  
  public final void c()
  {
    try
    {
      PackageInfo localPackageInfo = b(a.getPackageName());
      if (localPackageInfo != null)
      {
        b = Integer.toString(versionCode);
        c = versionName;
        return;
      }
      return;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     r9.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */