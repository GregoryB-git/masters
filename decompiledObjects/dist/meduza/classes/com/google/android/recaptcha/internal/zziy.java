package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import dc.p;
import nc.j0;
import rb.f;
import rb.h;
import ub.e;
import vb.a;
import wb.i;

final class zziy
  extends i
  implements p
{
  public Object zza;
  public Object zzb;
  public Object zzc;
  public Object zzd;
  public int zze;
  
  public zziy(zzja paramzzja, zzen paramzzen, e parame)
  {
    super(2, parame);
  }
  
  public final e create(Object paramObject, e parame)
  {
    return new zziy(zzf, zzg, parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = zze;
    Object localObject1;
    Object localObject3;
    Object localObject5;
    if (i != 0)
    {
      if (i != 1)
      {
        f.b(paramObject);
        if (i == 2) {
          break label320;
        }
        if (i == 3) {
          break label362;
        }
        break label394;
      }
      localObject1 = (zzcg)zzd;
      localObject2 = (zzsc)zzc;
      localObject3 = (zzja)zzb;
      localObject4 = (zzja)zza;
      f.b(paramObject);
      localObject5 = paramObject;
    }
    else
    {
      f.b(paramObject);
      localObject2 = zzf;
      localObject4 = zzja.zzs((zzja)localObject2);
      paramObject = localObject4;
      if (localObject4 == null) {
        paramObject = null;
      }
      localObject1 = zzja.zzs(zzf);
      localObject4 = localObject1;
      if (localObject1 == null) {
        localObject4 = null;
      }
      localObject1 = new zzcg(((zzsc)localObject4).zzf());
      localObject4 = zzf;
      zza = localObject2;
      zzb = localObject2;
      zzc = paramObject;
      zzd = localObject1;
      zze = 1;
      localObject5 = ((zzja)localObject4).zzw(this);
      if (localObject5 == locala) {
        return locala;
      }
      localObject4 = localObject2;
      localObject3 = localObject2;
      localObject2 = paramObject;
    }
    zzb = ((zzja)localObject3).zzC((zzsc)localObject2, (zzcg)localObject1, (WebView)localObject5);
    new Integer(zzf.zzA().hashCode());
    zzja.zzr(zzf).zzd();
    zzja.zzr(zzf).zze();
    Object localObject4 = zzf;
    Object localObject2 = zzja.zzs((zzja)localObject4);
    paramObject = localObject2;
    if (localObject2 == null) {
      paramObject = null;
    }
    zza = null;
    zzb = null;
    zzc = null;
    zzd = null;
    zze = 2;
    if (zzja.zzt((zzja)localObject4, (zzsc)paramObject, this) != locala)
    {
      label320:
      new Integer(zzf.zzA().hashCode());
      paramObject = zzf.zzA();
      zze = 3;
      if (((j0)paramObject).await(this) != locala)
      {
        label362:
        paramObject = zzf.zzm();
        localObject2 = zzje.zzc;
        zze = 4;
        if (((zzcb)paramObject).zzc(localObject2, this) != locala)
        {
          label394:
          zzg.zza();
          return h.a;
        }
      }
    }
    return locala;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zziy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */