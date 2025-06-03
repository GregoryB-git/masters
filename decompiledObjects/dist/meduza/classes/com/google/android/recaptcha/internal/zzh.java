package com.google.android.recaptcha.internal;

import dc.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import nc.d;
import nc.d0;
import nc.j0;
import rb.e.a;
import rb.f;
import vb.a;
import wb.i;
import x6.b;

final class zzh
  extends i
  implements p
{
  public int zza;
  
  public zzh(zzl paramzzl, String paramString, long paramLong, ub.e parame)
  {
    super(2, parame);
  }
  
  public final ub.e create(Object paramObject, ub.e parame)
  {
    parame = new zzh(zzb, zzc, zzd, parame);
    zze = paramObject;
    return parame;
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject1 = a.a;
    if (zza != 0)
    {
      localObject1 = (zzen)zze;
      f.b(paramObject);
    }
    else
    {
      f.b(paramObject);
      localObject2 = (d0)zze;
      paramObject = zzl.zza(zzb);
      if (paramObject != null)
      {
        ((zzek)paramObject).zzc(zzc);
        paramObject = ((zzek)paramObject).zzf(31);
      }
      else
      {
        paramObject = null;
      }
      ArrayList localArrayList = new ArrayList();
      localObject3 = zzb.zzd().iterator();
      while (((Iterator)localObject3).hasNext())
      {
        zze localzze = (zze)((Iterator)localObject3).next();
        if (localzze.zzl()) {
          localArrayList.add(b.h((d0)localObject2, new zzg(localzze, zzc, zzd, null)));
        }
      }
      localObject2 = (j0[])localArrayList.toArray(new j0[0]);
      localObject2 = (j0[])Arrays.copyOf((Object[])localObject2, localObject2.length);
      zze = paramObject;
      zza = 1;
      localObject2 = d.a((j0[])localObject2, this);
      if (localObject2 == localObject1) {
        return localObject1;
      }
      localObject1 = paramObject;
      paramObject = localObject2;
    }
    Object localObject2 = zzc;
    Object localObject3 = (List)paramObject;
    paramObject = zzsi.zzf();
    ((zzsh)paramObject).zze((String)localObject2);
    localObject3 = ((List)localObject3).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject2 = nexta;
      if ((localObject2 instanceof e.a ^ true)) {
        ((zzmx)paramObject).zzh((zzsi)localObject2);
      }
    }
    paramObject = (zzsi)((zzmx)paramObject).zzi();
    if (localObject1 != null) {
      ((zzen)localObject1).zza();
    }
    return paramObject;
    return localObject1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */