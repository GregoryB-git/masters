package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzalg;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class zzalj
  implements zzalg
{
  public final int zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    paramObject1 = (zzalh)paramObject1;
    paramObject2 = (zzalf)paramObject2;
    if (((AbstractMap)paramObject1).isEmpty()) {
      return 0;
    }
    paramObject1 = ((zzalh)paramObject1).entrySet().iterator();
    if (!((Iterator)paramObject1).hasNext()) {
      return 0;
    }
    paramObject1 = (Map.Entry)((Iterator)paramObject1).next();
    ((Map.Entry)paramObject1).getKey();
    ((Map.Entry)paramObject1).getValue();
    throw new NoSuchMethodError();
  }
  
  public final zzale<?, ?> zza(Object paramObject)
  {
    paramObject = (zzalf)paramObject;
    throw new NoSuchMethodError();
  }
  
  public final Object zza(Object paramObject1, Object paramObject2)
  {
    zzalh localzzalh = (zzalh)paramObject1;
    paramObject2 = (zzalh)paramObject2;
    paramObject1 = localzzalh;
    if (!((AbstractMap)paramObject2).isEmpty())
    {
      paramObject1 = localzzalh;
      if (!localzzalh.zzd()) {
        paramObject1 = localzzalh.zzb();
      }
      ((zzalh)paramObject1).zza((com.google.android.gms.internal.firebase-auth-api.zzalh)paramObject2);
    }
    return paramObject1;
  }
  
  public final Object zzb(Object paramObject)
  {
    return zzalh.zza().zzb();
  }
  
  public final Object zzc(Object paramObject)
  {
    ((zzalh)paramObject).zzc();
    return paramObject;
  }
  
  public final Map<?, ?> zzd(Object paramObject)
  {
    return (zzalh)paramObject;
  }
  
  public final Map<?, ?> zze(Object paramObject)
  {
    return (zzalh)paramObject;
  }
  
  public final boolean zzf(Object paramObject)
  {
    return !((zzalh)paramObject).zzd();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzalj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */