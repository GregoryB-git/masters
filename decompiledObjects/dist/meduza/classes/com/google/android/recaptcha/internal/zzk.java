package com.google.android.recaptcha.internal;

import dc.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import nc.d;
import nc.d0;
import nc.j0;
import rb.e.a;
import rb.f;
import rb.h;
import vb.a;
import wb.i;
import x6.b;

final class zzk
  extends i
  implements p
{
  public int zza;
  
  public zzk(zzl paramzzl, zzek paramzzek, long paramLong, zzsc paramzzsc, ub.e parame)
  {
    super(2, parame);
  }
  
  public final ub.e create(Object paramObject, ub.e parame)
  {
    parame = new zzk(zzb, zzc, zzd, zze, parame);
    zzf = paramObject;
    return parame;
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject1 = a.a;
    if (zza != 0)
    {
      localObject1 = (zzen)zzf;
      f.b(paramObject);
    }
    else
    {
      f.b(paramObject);
      paramObject = (d0)zzf;
      zzl.zze(zzb, zzc);
      Object localObject2 = zzc;
      ((zzek)localObject2).zzc(((zzek)localObject2).zzd());
      localObject2 = ((zzek)localObject2).zzf(30);
      Object localObject3 = new ArrayList();
      Iterator localIterator = zzb.zzd().iterator();
      while (localIterator.hasNext()) {
        ((ArrayList)localObject3).add(b.h((d0)paramObject, new zzj((zze)localIterator.next(), zzd, zze, null)));
      }
      paramObject = (j0[])((ArrayList)localObject3).toArray(new j0[0]);
      paramObject = (j0[])Arrays.copyOf((Object[])paramObject, paramObject.length);
      zzf = localObject2;
      zza = 1;
      localObject3 = d.a((j0[])paramObject, this);
      paramObject = localObject1;
      if (localObject3 == localObject1) {
        return paramObject;
      }
      localObject1 = localObject2;
      paramObject = localObject3;
    }
    paramObject = (List)paramObject;
    if ((!(paramObject instanceof Collection)) || (!((Collection)paramObject).isEmpty()))
    {
      paramObject = ((Iterable)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        if (!(nexta instanceof e.a))
        {
          ((zzen)localObject1).zza();
          paramObject = h.a;
          break label289;
        }
      }
    }
    paramObject = new zzbd(zzbb.zzb, zzba.zzY, null);
    ((zzen)localObject1).zzb((zzbd)paramObject);
    paramObject = f.a((Throwable)paramObject);
    label289:
    paramObject = new rb.e(paramObject);
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */