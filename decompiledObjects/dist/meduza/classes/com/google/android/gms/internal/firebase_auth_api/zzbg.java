package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzbz;
import com.google.android.gms.internal.firebase-auth-api.zzwl;
import java.io.OutputStream;

public final class zzbg
  implements zzbz
{
  private final OutputStream zza;
  
  private zzbg(OutputStream paramOutputStream)
  {
    zza = paramOutputStream;
  }
  
  public static zzbz zza(OutputStream paramOutputStream)
  {
    return new zzbg(paramOutputStream);
  }
  
  public final void zza(com.google.android.gms.internal.firebase-auth-api.zzuz paramzzuz)
  {
    try
    {
      ((zzuz)((zzuz.zza)paramzzuz.zzn()).zza().zze()).zza(zza);
      return;
    }
    finally
    {
      zza.close();
    }
  }
  
  public final void zza(zzwl paramzzwl)
  {
    try
    {
      paramzzwl.zza(zza);
      return;
    }
    finally
    {
      zza.close();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzbg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */