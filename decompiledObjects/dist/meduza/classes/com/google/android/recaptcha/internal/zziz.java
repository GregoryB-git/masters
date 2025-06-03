package com.google.android.recaptcha.internal;

import b.a0;
import dc.p;
import rb.f;
import rb.h;
import ub.e;
import vb.a;
import wb.i;

final class zziz
  extends i
  implements p
{
  public Object zza;
  public int zzb;
  
  public zziz(zzja paramzzja, zzen paramzzen, e parame)
  {
    super(2, parame);
  }
  
  public final e create(Object paramObject, e parame)
  {
    return new zziz(zzc, zzd, parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject = a.a;
    int i = zzb;
    if (i != 0)
    {
      if (i != 1) {
        if (i != 2)
        {
          localObject = (zzbd)zza;
          f.b(paramObject);
          paramObject = localObject;
          break label185;
        }
      }
      try
      {
        f.b(paramObject);
      }
      catch (Exception paramObject)
      {
        break label120;
      }
      f.b(paramObject);
    }
    else
    {
      f.b(paramObject);
      paramObject = zzc;
      zzb = 1;
      if (((zzja)paramObject).zzx(this) == localObject) {
        break label183;
      }
    }
    paramObject = new com/google/android/recaptcha/internal/zziy;
    ((zziy)paramObject).<init>(zzc, zzd, null);
    zzb = 2;
    paramObject = a0.M(20000L, (p)paramObject, this);
    if (paramObject == localObject)
    {
      break label183;
      label120:
      ((Throwable)paramObject).getMessage();
      paramObject = zzf.zza((Exception)paramObject, new zzbd(zzbb.zzb, zzba.zzV, ((Throwable)paramObject).getMessage()));
      zzcb localzzcb = zzc.zzm();
      zzje localzzje = zzje.zza;
      zza = paramObject;
      zzb = 3;
      if (localzzcb.zzc(localzzje, this) == localObject) {
        label183:
        return localObject;
      }
      label185:
      zzd.zzb((zzbd)paramObject);
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zziz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */