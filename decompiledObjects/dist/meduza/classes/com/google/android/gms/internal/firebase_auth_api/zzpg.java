package com.google.android.gms.internal.firebase_auth_api;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class zzpg<P>
{
  private final Map<zzzn, List<zzpi<P>>> zza;
  private final zzpi<P> zzb;
  private final Class<P> zzc;
  private final com.google.android.gms.internal.firebase-auth-api.zznr zzd;
  
  private zzpg(Map<zzzn, List<zzpi<P>>> paramMap, List<zzpi<P>> paramList, zzpi<P> paramzzpi, zznr paramzznr, Class<P> paramClass)
  {
    zza = paramMap;
    zzb = paramzzpi;
    zzc = paramClass;
    zzd = paramzznr;
  }
  
  public static <P> zzpj<P> zza(Class<P> paramClass)
  {
    return new zzpj(paramClass, null);
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zznr zza()
  {
    return zzd;
  }
  
  public final List<zzpi<P>> zza(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = (List)zza.get(zzzn.zza(paramArrayOfByte));
    if (paramArrayOfByte != null) {
      return paramArrayOfByte;
    }
    return Collections.emptyList();
  }
  
  public final zzpi<P> zzb()
  {
    return zzb;
  }
  
  public final Class<P> zzc()
  {
    return zzc;
  }
  
  public final Collection<List<zzpi<P>>> zzd()
  {
    return zza.values();
  }
  
  public final List<zzpi<P>> zze()
  {
    return zza(zzbi.zza);
  }
  
  public final boolean zzf()
  {
    return !zzd.zza().isEmpty();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzpg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */