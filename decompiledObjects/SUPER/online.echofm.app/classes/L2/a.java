package L2;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;

public abstract class a
{
  public static final int a;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    int j = 33554432;
    if (i < 31) {
      if (i >= 30)
      {
        String str = Build.VERSION.CODENAME;
        if ((str.length() == 1) && (str.charAt(0) >= 'S') && (str.charAt(0) <= 'Z')) {}
      }
      else
      {
        j = 0;
      }
    }
    a = j;
  }
  
  public static PendingIntent a(Context paramContext, int paramInt1, Intent paramIntent, int paramInt2)
  {
    return PendingIntent.getBroadcast(paramContext, 0, paramIntent, paramInt2);
  }
}

/* Location:
 * Qualified Name:     L2.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */