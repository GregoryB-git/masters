package com.google.android.gms.internal.measurement;

import a0.d;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

public class zzhg
{
  private static UserManager zza;
  private static volatile boolean zzb = zza() ^ true;
  
  public static boolean zza()
  {
    return Build.VERSION.SDK_INT >= 24;
  }
  
  public static boolean zza(Context paramContext)
  {
    return (zza()) && (!zzc(paramContext));
  }
  
  public static boolean zzb(Context paramContext)
  {
    return (!zza()) || (zzc(paramContext));
  }
  
  private static boolean zzc(Context paramContext)
  {
    if (zzb) {
      return true;
    }
    try
    {
      if (zzb) {
        return true;
      }
      boolean bool = zzd(paramContext);
      if (bool) {
        zzb = bool;
      }
      return bool;
    }
    finally {}
  }
  
  private static boolean zzd(Context paramContext)
  {
    boolean bool1 = true;
    int i = 1;
    boolean bool2;
    for (;;)
    {
      bool2 = false;
      if (i > 2) {
        break;
      }
      if (zza == null) {
        zza = (UserManager)paramContext.getSystemService(UserManager.class);
      }
      UserManager localUserManager = zza;
      if (localUserManager == null) {
        return true;
      }
      bool2 = bool1;
      try
      {
        if (!d.k(localUserManager))
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
        Log.w("DirectBootUtils", "Failed to check if user is unlocked.", localNullPointerException);
        zza = null;
        i++;
      }
    }
    if (bool2) {
      zza = null;
    }
    return bool2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzhg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */