package com.google.android.gms.internal.firebase_auth_api;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import com.google.android.gms.internal.firebase-auth-api.zzbz;
import com.google.android.gms.internal.firebase-auth-api.zzuz;
import com.google.android.gms.internal.firebase-auth-api.zzwl;
import java.io.IOException;

public final class zzmp
  implements zzbz
{
  private final SharedPreferences.Editor zza;
  private final String zzb;
  
  public zzmp(Context paramContext, String paramString1, String paramString2)
  {
    if (paramString1 != null)
    {
      zzb = paramString1;
      paramContext = paramContext.getApplicationContext();
      if (paramString2 == null) {}
      for (paramContext = PreferenceManager.getDefaultSharedPreferences(paramContext);; paramContext = paramContext.getSharedPreferences(paramString2, 0))
      {
        zza = paramContext.edit();
        return;
      }
    }
    throw new IllegalArgumentException("keysetName cannot be null");
  }
  
  public final void zza(zzuz paramzzuz)
  {
    if (zza.putString(zzb, zzza.zza(paramzzuz.zzk())).commit()) {
      return;
    }
    throw new IOException("Failed to write to SharedPreferences");
  }
  
  public final void zza(zzwl paramzzwl)
  {
    if (zza.putString(zzb, zzza.zza(paramzzwl.zzk())).commit()) {
      return;
    }
    throw new IOException("Failed to write to SharedPreferences");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzmp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */