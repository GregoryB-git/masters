package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import x6.b;

public final class zzcw
{
  private static final ThreadLocal<Boolean> zza = new zzcv();
  
  public static SharedPreferences zza(Context paramContext, String paramString, int paramInt, zzco paramzzco)
  {
    if (zzcf.zza().zzb(paramString, paramzzco, zzcl.zzc).equals("")) {
      paramzzco = new zzcr();
    } else {
      paramzzco = null;
    }
    if (paramzzco != null) {
      return paramzzco;
    }
    paramzzco = zza;
    b.t(((Boolean)paramzzco.get()).booleanValue());
    paramzzco.set(Boolean.FALSE);
    try
    {
      paramContext = paramContext.getSharedPreferences(paramString, 0);
      paramzzco.set(Boolean.TRUE);
      return paramContext;
    }
    finally
    {
      zza.set(Boolean.TRUE);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzcw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */