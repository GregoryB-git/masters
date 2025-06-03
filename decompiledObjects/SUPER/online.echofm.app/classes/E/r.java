package E;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.UserManager;

public abstract class r
{
  public static boolean a(Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 24) {
      return a.a(paramContext);
    }
    return true;
  }
  
  public static abstract class a
  {
    public static boolean a(Context paramContext)
    {
      return ((UserManager)paramContext.getSystemService(UserManager.class)).isUserUnlocked();
    }
  }
}

/* Location:
 * Qualified Name:     E.r
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */