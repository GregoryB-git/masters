package a0;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.UserManager;

public final class o
{
  public static boolean a(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return a.a(paramContext);
    }
    return true;
  }
  
  public static final class a
  {
    public static boolean a(Context paramContext)
    {
      return d.k((UserManager)paramContext.getSystemService(UserManager.class));
    }
  }
}

/* Location:
 * Qualified Name:     a0.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */