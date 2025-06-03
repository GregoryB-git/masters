package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class zzli
  implements zzlj
{
  public final int zza(int paramInt, Object paramObject1, Object paramObject2)
  {
    paramObject1 = (zzlg)paramObject1;
    paramObject2 = (zzle)paramObject2;
    if (((AbstractMap)paramObject1).isEmpty()) {
      return 0;
    }
    paramObject1 = ((zzlg)paramObject1).entrySet().iterator();
    if (!((Iterator)paramObject1).hasNext()) {
      return 0;
    }
    paramObject1 = (Map.Entry)((Iterator)paramObject1).next();
    ((Map.Entry)paramObject1).getKey();
    ((Map.Entry)paramObject1).getValue();
    throw new NoSuchMethodError();
  }
  
  public final zzlh<?, ?> zza(Object paramObject)
  {
    paramObject = (zzle)paramObject;
    throw new NoSuchMethodError();
  }
  
  public final Object zza(Object paramObject1, Object paramObject2)
  {
    zzlg localzzlg = (zzlg)paramObject1;
    paramObject2 = (zzlg)paramObject2;
    paramObject1 = localzzlg;
    if (!((AbstractMap)paramObject2).isEmpty())
    {
      paramObject1 = localzzlg;
      if (!localzzlg.zzd()) {
        paramObject1 = localzzlg.zzb();
      }
      ((zzlg)paramObject1).zza((zzlg)paramObject2);
    }
    return paramObject1;
  }
  
  public final Object zzb(Object paramObject)
  {
    return zzlg.zza().zzb();
  }
  
  public final Object zzc(Object paramObject)
  {
    ((zzlg)paramObject).zzc();
    return paramObject;
  }
  
  public final Map<?, ?> zzd(Object paramObject)
  {
    return (zzlg)paramObject;
  }
  
  public final Map<?, ?> zze(Object paramObject)
  {
    return (zzlg)paramObject;
  }
  
  public final boolean zzf(Object paramObject)
  {
    return !((zzlg)paramObject).zzd();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzli
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */