package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

public abstract class z2
{
  public static UserManager a;
  public static volatile boolean b = a() ^ true;
  public static boolean c = false;
  
  public static boolean a()
  {
    return Build.VERSION.SDK_INT >= 24;
  }
  
  public static boolean b(Context paramContext)
  {
    return (a()) && (!d(paramContext));
  }
  
  public static boolean c(Context paramContext)
  {
    return (!a()) || (d(paramContext));
  }
  
  public static boolean d(Context paramContext)
  {
    if (b) {
      return true;
    }
    label44:
    try
    {
      if (b) {
        return true;
      }
    }
    finally
    {
      break label44;
      boolean bool = e(paramContext);
      if (bool) {
        b = bool;
      }
      return bool;
    }
  }
  
  public static boolean e(Context paramContext)
  {
    boolean bool1 = true;
    boolean bool2;
    for (int i = 1;; i++)
    {
      bool2 = false;
      if (i > 2) {
        break;
      }
      if (a == null) {
        a = (UserManager)paramContext.getSystemService(UserManager.class);
      }
      UserManager localUserManager = a;
      if (localUserManager == null) {
        return true;
      }
      bool2 = bool1;
      try
      {
        if (!y2.a(localUserManager))
        {
          bool2 = localUserManager.isUserRunning(Process.myUserHandle());
          if (!bool2) {
            bool2 = bool1;
          } else {
            bool2 = false;
          }
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        break label82;
      }
      break;
      label82:
      Log.w("DirectBootUtils", "Failed to check if user is unlocked.", localNullPointerException);
      a = null;
    }
    if (bool2) {
      a = null;
    }
    return bool2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.z2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */