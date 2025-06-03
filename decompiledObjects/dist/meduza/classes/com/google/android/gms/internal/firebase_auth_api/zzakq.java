package com.google.android.gms.internal.firebase_auth_api;

import java.util.Map.Entry;

final class zzakq<K>
  implements Map.Entry<K, Object>
{
  private Map.Entry<K, zzakr> zza;
  
  private zzakq(Map.Entry<K, zzakr> paramEntry)
  {
    zza = paramEntry;
  }
  
  public final K getKey()
  {
    return (K)zza.getKey();
  }
  
  public final Object getValue()
  {
    if ((zzakr)zza.getValue() == null) {
      return null;
    }
    throw new NoSuchMethodError();
  }
  
  public final Object setValue(Object paramObject)
  {
    if ((paramObject instanceof zzaln)) {
      return ((zzakr)zza.getValue()).zza((zzaln)paramObject);
    }
    throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzakr zza()
  {
    return (zzakr)zza.getValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzakq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */