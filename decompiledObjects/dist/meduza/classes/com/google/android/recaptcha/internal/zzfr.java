package com.google.android.recaptcha.internal;

import dc.p;
import ec.d;
import ec.t;
import nc.d0;
import nc.j1;
import nc.j1.b;
import rb.f;
import ub.e;
import vb.a;
import wb.i;

final class zzfr
  extends i
  implements p
{
  public zzfr(Exception paramException, zzgd paramzzgd, zzft paramzzft, e parame)
  {
    super(2, parame);
  }
  
  public final e create(Object paramObject, e parame)
  {
    parame = new zzfr(zza, zzb, zzc, parame);
    zzd = paramObject;
    return parame;
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject1 = a.a;
    f.b(paramObject);
    Object localObject2 = (d0)zzd;
    paramObject = zza;
    if ((paramObject instanceof zzce))
    {
      paramObject = ((zzce)paramObject).zza();
      ((zztd)paramObject).zze(zzb.zza());
    }
    else
    {
      localObject1 = zzb;
      paramObject = zzte.zzf();
      ((zztd)paramObject).zze(((zzgd)localObject1).zza());
      ((zztd)paramObject).zzr(2);
      ((zztd)paramObject).zzq(2);
    }
    Object localObject3 = (zzte)((zzmx)paramObject).zzi();
    ((zzte)localObject3).zzl();
    ((zzte)localObject3).zzk();
    t.a(zza.getClass()).e();
    zza.getMessage();
    paramObject = zzb;
    Object localObject4 = ((zzgd)paramObject).zzb();
    localObject1 = zza;
    paramObject = localObject1;
    if (localObject1 == null) {
      paramObject = null;
    }
    localObject4 = zzev.zza((zzbn)localObject4, (zzbn)paramObject);
    localObject1 = zzb.zzd();
    paramObject = localObject1;
    if (((String)localObject1).length() == 0) {
      paramObject = "recaptcha.m.Main.rge";
    }
    localObject1 = (j1)((d0)localObject2).f().get(j1.b.a);
    boolean bool;
    if (localObject1 != null) {
      bool = ((j1)localObject1).isActive();
    } else {
      bool = true;
    }
    if (bool)
    {
      localObject1 = zzc;
      localObject2 = zzkh.zzh();
      localObject3 = ((zzko)localObject3).zzd();
      localObject3 = ((zzkh)localObject2).zzi((byte[])localObject3, 0, localObject3.length);
      localObject2 = zzkh.zzh();
      localObject4 = ((zzko)localObject4).zzd();
      zzft.zze((zzft)localObject1, (String)paramObject, new String[] { localObject3, ((zzkh)localObject2).zzi((byte[])localObject4, 0, localObject4.length) });
    }
    return rb.h.a;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzfr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */