package com.google.android.recaptcha.internal;

import dc.p;
import java.util.List;
import java.util.concurrent.TimeUnit;
import rb.f;
import rb.h;
import ub.e;
import vb.a;
import wb.i;

final class zzfs
  extends i
  implements p
{
  public Object zza;
  public Object zzb;
  public int zzc;
  
  public zzfs(zzgd paramzzgd, zzft paramzzft, String paramString, e parame)
  {
    super(2, parame);
  }
  
  public final e create(Object paramObject, e parame)
  {
    return new zzfs(zzd, zze, zzf, parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = zzc;
    Object localObject1;
    Object localObject2;
    if (i != 0)
    {
      if (i != 1)
      {
        f.b(paramObject);
      }
      else
      {
        localObject1 = (zzjh)zzb;
        localObject2 = (zzub)zza;
      }
    }
    else {
      try
      {
        f.b(paramObject);
        paramObject = localObject1;
        break label163;
        f.b(paramObject);
        zzd.zza = new zzbn();
        paramObject = zzf;
        localObject2 = zzub.zzi(zzkh.zzh().zzj((CharSequence)paramObject));
        ((zzub)localObject2).zzf();
        Object localObject3 = zzft.zzb(zze).zza((zzub)localObject2);
        paramObject = zzjh.zzb();
        localObject1 = zze;
        localObject3 = ((zztz)localObject3).zzi();
        zzgd localzzgd = zzd;
        zza = localObject2;
        zzb = paramObject;
        zzc = 1;
        if (zzft.zzc((zzft)localObject1, (List)localObject3, localzzgd, this) != locala)
        {
          label163:
          ((zzjh)paramObject).zzf();
          long l = ((zzjh)paramObject).zza(TimeUnit.MICROSECONDS);
          new Long(l);
          ((zzub)localObject2).zzf();
        }
      }
      catch (Exception paramObject)
      {
        localObject1 = zze;
        localObject2 = zzd;
        zza = null;
        zzb = null;
        zzc = 2;
        if (zzft.zzd((zzft)localObject1, (Exception)paramObject, (zzgd)localObject2, this) == locala) {
          return locala;
        }
      }
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzfs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */