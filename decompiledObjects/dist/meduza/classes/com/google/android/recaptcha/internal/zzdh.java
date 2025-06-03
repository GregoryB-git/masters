package com.google.android.recaptcha.internal;

import android.content.Context;
import android.os.Build.VERSION;
import dc.p;
import ub.e;
import vb.a;
import wb.i;

final class zzdh
  extends i
  implements p
{
  public int zza;
  
  public zzdh(zzdt paramzzdt, e parame)
  {
    super(2, parame);
  }
  
  public final e create(Object paramObject, e parame)
  {
    return new zzdh(zzb, parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = zza;
    rb.f.b(paramObject);
    if (i == 0)
    {
      i = new zzbs(j6.f.b).zza(zzdt.zza(zzb));
      Object localObject1 = zzb;
      paramObject = zzdt.zzp((zzdt)localObject1);
      Object localObject2 = zzdt.zza((zzdt)localObject1).getPackageName();
      localObject1 = zzdt.zze(zzb).zzd();
      Object localObject3 = zzdt.zzc(zzb);
      int j = Build.VERSION.SDK_INT;
      localObject3 = ((zzbf)localObject3).zza();
      zztn localzztn = zzto.zzf();
      localzztn.zzt((String)paramObject);
      localzztn.zzq((String)localObject2);
      localzztn.zzu(i);
      localzztn.zzr("18.6.1");
      localzztn.zzs((String)localObject1);
      localzztn.zzf(String.valueOf(j));
      localzztn.zze((String)localObject3);
      paramObject = (zzto)localzztn.zzi();
      localObject2 = zzb;
      localObject1 = zzdt.zzg((zzdt)localObject2);
      localObject2 = zzdt.zzd((zzdt)localObject2).zzb();
      zza = 1;
      localObject1 = ((zzff)localObject1).zzc((String)localObject2, (zzto)paramObject, this);
      paramObject = localObject1;
      if (localObject1 == locala) {
        return locala;
      }
    }
    return paramObject;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzdh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */