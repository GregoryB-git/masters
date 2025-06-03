package com.google.android.gms.internal.firebase_auth_api;

import android.content.Context;
import j6.f;

public final class zzadu
{
  private static Boolean zza;
  
  public static boolean zza(Context paramContext)
  {
    if (zza == null)
    {
      int i = f.b.c(paramContext, 12451000);
      boolean bool;
      if ((i != 0) && (i != 2)) {
        bool = false;
      } else {
        bool = true;
      }
      zza = Boolean.valueOf(bool);
    }
    return zza.booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzadu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */