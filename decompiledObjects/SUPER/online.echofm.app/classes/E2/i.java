package E2;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import x2.n;

public abstract class i
{
  public static Boolean a;
  public static Boolean b;
  public static Boolean c;
  public static Boolean d;
  
  public static boolean a(Context paramContext)
  {
    paramContext = paramContext.getPackageManager();
    if (d == null)
    {
      boolean bool1 = l.h();
      boolean bool2 = false;
      boolean bool3 = bool2;
      if (bool1)
      {
        bool3 = bool2;
        if (paramContext.hasSystemFeature("android.hardware.type.automotive")) {
          bool3 = true;
        }
      }
      d = Boolean.valueOf(bool3);
    }
    return d.booleanValue();
  }
  
  public static boolean b()
  {
    int i = n.a;
    return "user".equals(Build.TYPE);
  }
  
  public static boolean c(Context paramContext)
  {
    paramContext = paramContext.getPackageManager();
    if (a == null)
    {
      boolean bool1 = l.e();
      boolean bool2 = false;
      boolean bool3 = bool2;
      if (bool1)
      {
        bool3 = bool2;
        if (paramContext.hasSystemFeature("android.hardware.type.watch")) {
          bool3 = true;
        }
      }
      a = Boolean.valueOf(bool3);
    }
    return a.booleanValue();
  }
  
  public static boolean d(Context paramContext)
  {
    return ((c(paramContext)) && (!l.g())) || ((e(paramContext)) && ((!l.h()) || (l.k())));
  }
  
  public static boolean e(Context paramContext)
  {
    if (b == null)
    {
      boolean bool1 = l.f();
      boolean bool2 = false;
      boolean bool3 = bool2;
      if (bool1)
      {
        bool3 = bool2;
        if (paramContext.getPackageManager().hasSystemFeature("cn.google")) {
          bool3 = true;
        }
      }
      b = Boolean.valueOf(bool3);
    }
    return b.booleanValue();
  }
  
  public static boolean f(Context paramContext)
  {
    if (c == null)
    {
      boolean bool1 = paramContext.getPackageManager().hasSystemFeature("android.hardware.type.iot");
      boolean bool2 = true;
      boolean bool3 = bool2;
      if (!bool1) {
        if (paramContext.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
          bool3 = bool2;
        } else {
          bool3 = false;
        }
      }
      c = Boolean.valueOf(bool3);
    }
    return c.booleanValue();
  }
}

/* Location:
 * Qualified Name:     E2.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */