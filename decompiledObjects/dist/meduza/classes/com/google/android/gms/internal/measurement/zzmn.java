package com.google.android.gms.internal.measurement;

import g;
import java.util.Map.Entry;

final class zzmn
  implements Comparable, Map.Entry
{
  private final Comparable zza;
  private Object zzb;
  
  public zzmn(zzmj paramzzmj, Comparable paramComparable, Object paramObject)
  {
    zza = paramComparable;
    zzb = paramObject;
  }
  
  public zzmn(zzmj paramzzmj, Map.Entry paramEntry)
  {
    this(paramzzmj, (Comparable)paramEntry.getKey(), paramEntry.getValue());
  }
  
  private static boolean zza(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null) {
      return paramObject2 == null;
    }
    return paramObject1.equals(paramObject2);
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
    return (zza(zza, ((Map.Entry)paramObject).getKey())) && (zza(zzb, ((Map.Entry)paramObject).getValue()));
  }
  
  public final Object getValue()
  {
    return zzb;
  }
  
  public final int hashCode()
  {
    Object localObject = zza;
    int i = 0;
    int j;
    if (localObject == null) {
      j = 0;
    } else {
      j = localObject.hashCode();
    }
    localObject = zzb;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    return j ^ i;
  }
  
  public final Object setValue(Object paramObject)
  {
    zzmj.zzd(zzc);
    Object localObject = zzb;
    zzb = paramObject;
    return localObject;
  }
  
  public final String toString()
  {
    return g.e(String.valueOf(zza), "=", String.valueOf(zzb));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzmn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */