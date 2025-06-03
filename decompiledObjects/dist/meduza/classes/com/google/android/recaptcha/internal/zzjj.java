package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

public final class zzjj
  extends zzjn
  implements Serializable
{
  public final int zza;
  private final Queue zzb;
  
  private zzjj(int paramInt)
  {
    if (paramInt >= 0)
    {
      zzb = new ArrayDeque(paramInt);
      zza = paramInt;
      return;
    }
    throw new IllegalArgumentException(zzji.zza("maxSize (%s) must >= 0", new Object[] { Integer.valueOf(paramInt) }));
  }
  
  public static zzjj zza(int paramInt)
  {
    return new zzjj(paramInt);
  }
  
  public final boolean add(Object paramObject)
  {
    paramObject.getClass();
    if (zza == 0) {
      return true;
    }
    if (size() == zza) {
      zzb.remove();
    }
    zzb.add(paramObject);
    return true;
  }
  
  public final boolean addAll(Collection paramCollection)
  {
    int i = paramCollection.size();
    if (i >= zza)
    {
      clear();
      i -= zza;
      boolean bool;
      if (i >= 0) {
        bool = true;
      } else {
        bool = false;
      }
      zzjf.zzb(bool, "number to skip cannot be negative");
    }
    for (paramCollection = new zzjp(paramCollection, i).iterator();; paramCollection = paramCollection.iterator()) {
      return zzjq.zza(this, paramCollection);
    }
  }
  
  public final boolean offer(Object paramObject)
  {
    add(paramObject);
    return true;
  }
  
  public final Queue zzd()
  {
    return zzb;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzjj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */