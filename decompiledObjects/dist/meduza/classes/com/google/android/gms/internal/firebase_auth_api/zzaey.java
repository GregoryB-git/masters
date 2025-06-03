package com.google.android.gms.internal.firebase_auth_api;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import b.a0;
import m6.j;
import v6.a;

public final class zzaey
{
  private final String zza;
  private final String zzb;
  
  public zzaey(Context paramContext)
  {
    this(paramContext, paramContext.getPackageName());
  }
  
  private zzaey(Context paramContext, String paramString)
  {
    j.i(paramContext);
    j.e(paramString);
    zza = paramString;
    try
    {
      paramContext = a.a(paramContext, paramString);
      if (paramContext == null)
      {
        paramContext = new StringBuilder("single cert required: ");
        paramContext.append(paramString);
        Log.e("FBA-PackageInfo", paramContext.toString());
        zzb = null;
        return;
      }
      zzb = a0.o(paramContext);
      return;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      paramContext = new StringBuilder("no pkg: ");
      paramContext.append(paramString);
      Log.e("FBA-PackageInfo", paramContext.toString());
      zzb = null;
    }
  }
  
  public final String zza()
  {
    return zzb;
  }
  
  public final String zzb()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */