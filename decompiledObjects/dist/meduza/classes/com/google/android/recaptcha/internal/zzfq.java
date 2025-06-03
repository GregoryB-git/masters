package com.google.android.recaptcha.internal;

import dc.p;
import java.util.List;
import nc.d0;
import nc.j1;
import nc.j1.b;
import rb.f;
import sb.q;
import ub.e;
import vb.a;
import wb.i;

final class zzfq
  extends i
  implements p
{
  public int zza;
  
  public zzfq(zzgd paramzzgd, List paramList, zzft paramzzft, e parame)
  {
    super(2, parame);
  }
  
  public final e create(Object paramObject, e parame)
  {
    parame = new zzfq(zzb, zzc, zzd, parame);
    zze = paramObject;
    return parame;
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = zza;
    f.b(paramObject);
    if (i == 0)
    {
      paramObject = (d0)zze;
      for (;;)
      {
        Object localObject1 = zzb;
        if (((zzgd)localObject1).zza() < 0) {
          break label225;
        }
        Object localObject2 = zzc;
        if (((zzgd)localObject1).zza() >= ((List)localObject2).size()) {
          break label225;
        }
        localObject1 = (j1)((d0)paramObject).f().get(j1.b.a);
        boolean bool;
        if (localObject1 != null) {
          bool = ((j1)localObject1).isActive();
        } else {
          bool = true;
        }
        if (!bool) {
          break label225;
        }
        localObject1 = (zzuf)zzc.get(zzb.zza());
        try
        {
          zzft.zzf(zzd, (zzuf)localObject1, zzb);
        }
        catch (Exception paramObject)
        {
          ((zzuf)localObject1).zzk();
          new Integer(((zzuf)localObject1).zzg());
          q.p(((zzuf)localObject1).zzj(), null, null, null, new zzfp(zzd), 31);
          localObject2 = zzd;
          localObject1 = zzb;
          zza = 1;
          if (zzft.zzd((zzft)localObject2, (Exception)paramObject, (zzgd)localObject1, this) == locala) {
            return locala;
          }
        }
      }
    }
    return rb.h.a;
    label225:
    return rb.h.a;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzfq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */