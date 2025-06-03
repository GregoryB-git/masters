package com.google.android.recaptcha.internal;

import dc.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import nc.d;
import nc.d0;
import nc.j1;
import rb.f;
import vb.a;
import wb.i;
import x6.b;

final class zzs
  extends i
  implements p
{
  public int zza;
  
  public zzs(zzv paramzzv, String paramString, ub.e parame)
  {
    super(2, parame);
  }
  
  public final ub.e create(Object paramObject, ub.e parame)
  {
    parame = new zzs(zzb, zzc, parame);
    zzd = paramObject;
    return parame;
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = zza;
    f.b(paramObject);
    if (i == 0)
    {
      paramObject = (d0)zzd;
      ArrayList localArrayList = new ArrayList();
      Object localObject1 = zzb;
      Object localObject2 = zzc;
      ((zzv)localObject1).zzo().put(localObject2, localArrayList);
      localObject2 = new ArrayList();
      Object localObject3 = zzv.zzn(zzb);
      localObject1 = new ArrayList();
      Iterator localIterator = ((Iterable)localObject3).iterator();
      while (localIterator.hasNext())
      {
        localObject3 = localIterator.next();
        if (((zzy)localObject3).zzf()) {
          ((ArrayList)localObject1).add(localObject3);
        }
      }
      localObject1 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext()) {
        ((ArrayList)localObject2).add(b.g0((d0)paramObject, null, new zzr((zzy)((Iterator)localObject1).next(), zzc, localArrayList, null), 3));
      }
      paramObject = (j1[])((ArrayList)localObject2).toArray(new j1[0]);
      paramObject = (j1[])Arrays.copyOf((Object[])paramObject, paramObject.length);
      zza = 1;
      if (d.c((j1[])paramObject, this) == locala) {
        return locala;
      }
    }
    return new rb.e(zzv.zzm(zzb, zzc));
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */