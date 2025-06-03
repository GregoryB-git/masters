package com.google.android.gms.internal.measurement;

import java.util.Map.Entry;

final class zzkt<K>
  implements Map.Entry<K, Object>
{
  private Map.Entry<K, zzkq> zza;
  
  private zzkt(Map.Entry<K, zzkq> paramEntry)
  {
    zza = paramEntry;
  }
  
  public final K getKey()
  {
    return (K)zza.getKey();
  }
  
  public final Object getValue()
  {
    if ((zzkq)zza.getValue() == null) {
      return null;
    }
    throw new NoSuchMethodError();
  }
  
  public final Object setValue(Object paramObject)
  {
    if ((paramObject instanceof zzlm)) {
      return ((zzkq)zza.getValue()).zza((zzlm)paramObject);
    }
    throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
  }
  
  public final zzkq zza()
  {
    return (zzkq)zza.getValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzkt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */