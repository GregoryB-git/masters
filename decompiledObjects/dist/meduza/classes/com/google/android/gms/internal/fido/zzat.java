package com.google.android.gms.internal.fido;

import java.io.Serializable;
import java.util.Comparator;

final class zzat
  extends zzbr
  implements Serializable
{
  public final Comparator zza;
  
  public zzat(Comparator paramComparator)
  {
    paramComparator.getClass();
    zza = paramComparator;
  }
  
  public final int compare(Object paramObject1, Object paramObject2)
  {
    return zza.compare(paramObject1, paramObject2);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof zzat))
    {
      paramObject = (zzat)paramObject;
      return zza.equals(zza);
    }
    return false;
  }
  
  public final int hashCode()
  {
    return zza.hashCode();
  }
  
  public final String toString()
  {
    return zza.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */