package com.google.android.gms.internal.firebase_auth_api;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzajv
{
  public static final com.google.android.gms.internal.firebase-auth-api.zzajv zza = new zzajv(true);
  private static volatile boolean zzb = false;
  private final Map<zzaju, zzakg.zzf<?, ?>> zzc;
  
  public zzajv()
  {
    zzc = new HashMap();
  }
  
  private zzajv(boolean paramBoolean)
  {
    zzc = Collections.emptyMap();
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzajv zza()
  {
    return zza;
  }
  
  public final <ContainingType extends zzaln> zzakg.zzf<ContainingType, ?> zza(ContainingType paramContainingType, int paramInt)
  {
    return (zzakg.zzf)zzc.get(new zzaju(paramContainingType, paramInt));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzajv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */