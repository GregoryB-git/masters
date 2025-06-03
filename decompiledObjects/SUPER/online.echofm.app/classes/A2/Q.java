package A2;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;

public abstract class Q
{
  public static final Object a = new Object();
  public static boolean b;
  public static String c;
  public static int d;
  
  public static int a(Context paramContext)
  {
    b(paramContext);
    return d;
  }
  
  public static void b(Context paramContext)
  {
    String str;
    synchronized (a)
    {
      if (b) {
        return;
      }
    }
  }
}

/* Location:
 * Qualified Name:     A2.Q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */