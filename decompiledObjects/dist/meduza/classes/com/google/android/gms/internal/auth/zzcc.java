package com.google.android.gms.internal.auth;

import a0.d;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Process;
import android.os.UserManager;
import android.util.Log;

public final class zzcc
{
  private static UserManager zza;
  private static volatile boolean zzb = zzb() ^ true;
  
  public static boolean zza(Context paramContext)
  {
    if ((zzb()) && (!zzb)) {
      try
      {
        if (zzb) {
          break label151;
        }
        int i = 1;
        while (i <= 2)
        {
          if (zza == null) {
            zza = (UserManager)paramContext.getSystemService(UserManager.class);
          }
          UserManager localUserManager = zza;
          if (localUserManager == null)
          {
            j = 1;
            break label128;
          }
          try
          {
            if (!d.k(localUserManager))
            {
              boolean bool = localUserManager.isUserRunning(Process.myUserHandle());
              if (bool) {
                break;
              }
            }
            i = 1;
          }
          catch (NullPointerException localNullPointerException)
          {
            Log.w("DirectBootUtils", "Failed to check if user is unlocked.", localNullPointerException);
            zza = null;
            i++;
          }
        }
        i = 0;
        int j = i;
        if (i != 0)
        {
          zza = null;
          j = i;
        }
        label128:
        if (j != 0) {
          zzb = true;
        }
        if (j == 0) {
          return true;
        }
      }
      finally {}
    }
    label151:
    return false;
  }
  
  public static boolean zzb()
  {
    return Build.VERSION.SDK_INT >= 24;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzcc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */