package androidx.core.os;

import android.content.Context;
import android.os.UserManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

public class UserManagerCompat
{
  public static boolean isUserUnlocked(@NonNull Context paramContext)
  {
    return Api24Impl.isUserUnlocked(paramContext);
  }
  
  @RequiresApi(24)
  public static class Api24Impl
  {
    @DoNotInline
    public static boolean isUserUnlocked(Context paramContext)
    {
      return ((UserManager)paramContext.getSystemService(UserManager.class)).isUserUnlocked();
    }
  }
}

/* Location:
 * Qualified Name:     androidx.core.os.UserManagerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */