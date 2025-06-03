package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityException;
import dc.p;
import rb.f;
import ub.e;
import vb.a;
import wb.i;

final class zzac
  extends i
  implements p
{
  public Object zza;
  public int zzb;
  
  public zzac(zzae paramzzae, String paramString, e parame)
  {
    super(2, parame);
  }
  
  public final e create(Object paramObject, e parame)
  {
    return new zzac(zzc, zzd, parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = zzb;
    zzen localzzen;
    if (i != 0)
    {
      if (i != 1)
      {
        localObject1 = (zzy)zza;
        f.b(paramObject);
        break label537;
      }
      localzzen = (zzen)zza;
      localObject1 = localzzen;
      try
      {
        f.b(paramObject);
      }
      catch (Exception paramObject)
      {
        break label239;
      }
    }
    else
    {
      f.b(paramObject);
      localzzen = zzz.zzb(zzc, zzd);
      localObject1 = localzzen;
      localObject2 = zzc;
      localObject1 = localzzen;
      paramObject = zzae.zzg((zzae)localObject2);
      localObject1 = localzzen;
      localObject2 = zzae.zzh((zzae)localObject2);
      localObject1 = localzzen;
      zza = localzzen;
      localObject1 = localzzen;
      zzb = 1;
      localObject1 = localzzen;
      paramObject = ((zzan)paramObject).zzc((String)localObject2, this);
      if (paramObject == locala) {
        break label237;
      }
    }
    Object localObject1 = localzzen;
    String str = (String)paramObject;
    localObject1 = localzzen;
    localzzen.zza();
    localObject1 = localzzen;
    zzae localzzae = zzc;
    localObject1 = localzzen;
    paramObject = zzti.zzf();
    localObject1 = localzzen;
    Object localObject2 = zzth.zzf();
    localObject1 = localzzen;
    ((zztg)localObject2).zzw(str);
    localObject1 = localzzen;
    ((zztf)paramObject).zzf((zzth)((zzmx)localObject2).zzi());
    localObject1 = localzzen;
    paramObject = zzz.zza(localzzae, (zzti)((zzmx)paramObject).zzi());
    break label586;
    label237:
    return locala;
    label239:
    ((zzen)localObject1).zzb(new zzbd(zzbb.zzb, zzba.zzaa, ((Throwable)paramObject).getMessage()));
    localObject1 = zzc;
    zza = localObject1;
    i = 2;
    zzb = 2;
    if ((paramObject instanceof StandardIntegrityException))
    {
      int j = ((StandardIntegrityException)paramObject).getErrorCode();
      if (j != -100)
      {
        if (j != -12)
        {
          if (j != -3)
          {
            if (j != -2)
            {
              if (j != -1) {
                switch (j)
                {
                default: 
                  switch (j)
                  {
                  default: 
                    break;
                  case -5: 
                    i = 32;
                    break;
                  case -6: 
                    i = 33;
                    break;
                  case -7: 
                    i = 34;
                    break;
                  case -8: 
                    i = 35;
                    break;
                  case -9: 
                    i = 36;
                  }
                  break;
                case -14: 
                  i = 41;
                  break;
                case -15: 
                  i = 42;
                  break;
                case -16: 
                  i = 43;
                  break;
                case -17: 
                  i = 52;
                  break;
                case -18: 
                  i = 53;
                  break;
                case -19: 
                  i = 54;
                  break;
                }
              } else {
                i = 28;
              }
            }
            else {
              i = 29;
            }
          }
          else {
            i = 30;
          }
        }
        else {
          i = 39;
        }
      }
      else {
        i = 44;
      }
    }
    else
    {
      i = 45;
    }
    paramObject = zzte.zzf();
    ((zztd)paramObject).zzq(i);
    ((zztd)paramObject).zzr(15);
    paramObject = ((zzmx)paramObject).zzi();
    if (paramObject != locala)
    {
      label537:
      paramObject = (zzte)paramObject;
      i = ((zzy)localObject1).zza();
      paramObject = (zztd)((zznd)paramObject).zzr();
      ((zztd)paramObject).zzf(((zzy)localObject1).zza());
      paramObject = new zzw(i, (zzte)((zzmx)paramObject).zzi());
      label586:
      return paramObject;
    }
    return locala;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzac
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */