package com.google.android.gms.internal.auth;

import g;
import java.util.Map.Entry;

final class zzgp
  implements Map.Entry, Comparable
{
  private final Comparable zzb;
  private Object zzc;
  
  public zzgp(zzgv paramzzgv, Comparable paramComparable, Object paramObject)
  {
    zzb = paramComparable;
    zzc = paramObject;
  }
  
  private static final boolean zzb(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if (paramObject1 == null)
    {
      if (paramObject2 != null) {
        bool = false;
      } else {
        return true;
      }
    }
    else {
      bool = paramObject1.equals(paramObject2);
    }
    return bool;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof Map.Entry)) {
      return false;
    }
    paramObject = (Map.Entry)paramObject;
    return (zzb(zzb, ((Map.Entry)paramObject).getKey())) && (zzb(zzc, ((Map.Entry)paramObject).getValue()));
  }
  
  public final Object getValue()
  {
    return zzc;
  }
  
  public final int hashCode()
  {
    Object localObject = zzb;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = localObject.hashCode();
    }
    localObject = zzc;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return j ^ i;
  }
  
  public final Object setValue(Object paramObject)
  {
    zzgv.zzi(zza);
    Object localObject = zzc;
    zzc = paramObject;
    return localObject;
  }
  
  public final String toString()
  {
    return g.e(String.valueOf(zzb), "=", String.valueOf(zzc));
  }
  
  public final Comparable zza()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzgp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */