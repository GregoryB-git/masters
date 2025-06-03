package com.google.android.gms.internal.firebase_auth_api;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

public final class zzaq<K, V>
{
  public com.google.android.gms.internal.firebase-auth-api.zzap zza;
  private Object[] zzb;
  private int zzc;
  
  public zzaq()
  {
    this(4);
  }
  
  public zzaq(int paramInt)
  {
    zzb = new Object[paramInt * 2];
    zzc = 0;
  }
  
  private final void zza(int paramInt)
  {
    paramInt <<= 1;
    Object[] arrayOfObject = zzb;
    if (paramInt > arrayOfObject.length) {
      zzb = Arrays.copyOf(arrayOfObject, zzak.zza(arrayOfObject.length, paramInt));
    }
  }
  
  public final zzan<K, V> zza()
  {
    com.google.android.gms.internal.firebase-auth-api.zzap localzzap = zza;
    if (localzzap == null)
    {
      com.google.android.gms.internal.firebase-auth-api.zzau localzzau = zzau.zza(zzc, zzb, this);
      localzzap = zza;
      if (localzzap == null) {
        return localzzau;
      }
      throw localzzap.zza();
    }
    throw localzzap.zza();
  }
  
  public final zzaq<K, V> zza(Iterable<? extends Map.Entry<? extends K, ? extends V>> paramIterable)
  {
    int i;
    if ((paramIterable instanceof Collection))
    {
      i = zzc;
      zza(((Collection)paramIterable).size() + i);
    }
    Iterator localIterator = paramIterable.iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (Map.Entry)localIterator.next();
      paramIterable = ((Map.Entry)localObject1).getKey();
      Object localObject2 = ((Map.Entry)localObject1).getValue();
      zza(zzc + 1);
      zzag.zza(paramIterable, localObject2);
      localObject1 = zzb;
      i = zzc;
      localObject1[(i * 2)] = paramIterable;
      localObject1[(i * 2 + 1)] = localObject2;
      zzc = (i + 1);
    }
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */