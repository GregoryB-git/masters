package com.google.android.gms.internal.firebase_auth_api;

import java.util.Map;

final class zzav<K>
  extends zzas<K>
{
  private final transient zzan<K, ?> zza;
  private final transient zzaj<K> zzb;
  
  public zzav(zzan<K, ?> paramzzan, zzaj<K> paramzzaj)
  {
    zza = paramzzan;
    zzb = paramzzaj;
  }
  
  public final boolean contains(Object paramObject)
  {
    return zza.get(paramObject) != null;
  }
  
  public final int size()
  {
    return zza.size();
  }
  
  public final int zza(Object[] paramArrayOfObject, int paramInt)
  {
    return zzc().zza(paramArrayOfObject, paramInt);
  }
  
  public final zzaj<K> zzc()
  {
    return zzb;
  }
  
  public final zzba<K> zzd()
  {
    return (zzba)zzc().iterator();
  }
  
  public final boolean zze()
  {
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzav
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */