package com.google.android.gms.internal.firebase_auth_api;

import java.util.Map.Entry;

final class zzat<K, V>
  extends zzas<Map.Entry<K, V>>
{
  private final transient zzan<K, V> zza;
  private final transient Object[] zzb;
  private final transient int zzc;
  
  public zzat(zzan<K, V> paramzzan, Object[] paramArrayOfObject, int paramInt1, int paramInt2)
  {
    zza = paramzzan;
    zzb = paramArrayOfObject;
    zzc = paramInt2;
  }
  
  public final boolean contains(Object paramObject)
  {
    if ((paramObject instanceof Map.Entry))
    {
      Object localObject = (Map.Entry)paramObject;
      paramObject = ((Map.Entry)localObject).getKey();
      localObject = ((Map.Entry)localObject).getValue();
      if ((localObject != null) && (localObject.equals(zza.get(paramObject)))) {
        return true;
      }
    }
    return false;
  }
  
  public final int size()
  {
    return zzc;
  }
  
  public final int zza(Object[] paramArrayOfObject, int paramInt)
  {
    return zzc().zza(paramArrayOfObject, paramInt);
  }
  
  public final zzba<Map.Entry<K, V>> zzd()
  {
    return (zzba)zzc().iterator();
  }
  
  public final boolean zze()
  {
    return true;
  }
  
  public final zzaj<Map.Entry<K, V>> zzg()
  {
    return new zzaw(this);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */