package H3;

import android.content.Context;
import android.content.pm.PackageManager;

public class E
{
  public String a;
  
  public static String b(Context paramContext)
  {
    String str = paramContext.getPackageManager().getInstallerPackageName(paramContext.getPackageName());
    paramContext = str;
    if (str == null) {
      paramContext = "";
    }
    return paramContext;
  }
  
  public String a(Context paramContext)
  {
    try
    {
      if (a == null) {
        a = b(paramContext);
      }
    }
    finally
    {
      break label50;
    }
    if ("".equals(a)) {
      paramContext = null;
    } else {
      paramContext = a;
    }
    return paramContext;
    label50:
    throw paramContext;
  }
}

/* Location:
 * Qualified Name:     H3.E
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */