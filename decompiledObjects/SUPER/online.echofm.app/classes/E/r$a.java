package E;

import android.content.Context;
import android.os.UserManager;

public abstract class r$a
{
  public static boolean a(Context paramContext)
  {
    return ((UserManager)paramContext.getSystemService(UserManager.class)).isUserUnlocked();
  }
}

/* Location:
 * Qualified Name:     E.r.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */