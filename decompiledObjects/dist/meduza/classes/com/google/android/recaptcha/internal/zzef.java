package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import ec.i;
import rb.f;
import rb.h;
import ub.e;
import vb.a;

public final class zzef
  implements zzcn
{
  private final zzdt zza;
  private zzcm zzb;
  private zzsc zzc;
  
  public zzef(zzdt paramzzdt)
  {
    zza = paramzzdt;
    zzb = zzcm.zzd();
  }
  
  public final Object zza(String paramString, RecaptchaAction paramRecaptchaAction, long paramLong, e parame)
  {
    if ((parame instanceof zzed))
    {
      localObject1 = (zzed)parame;
      i = zzd;
      if ((i & 0x80000000) != 0)
      {
        zzd = (i + Integer.MIN_VALUE);
        parame = (e)localObject1;
        break label59;
      }
    }
    parame = new zzed(this, parame);
    label59:
    Object localObject1 = zzb;
    a locala = a.a;
    int i = zzd;
    if (i != 0) {
      if (i != 1) {
        if (i == 2)
        {
          paramString = zzf;
          paramRecaptchaAction = zze;
        }
      }
    }
    try
    {
      f.b(localObject1);
      break label362;
      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      double d1 = zza;
      Object localObject2 = zzg;
      paramString = zzf;
      paramRecaptchaAction = zze;
      f.b(localObject1);
      Object localObject3 = localObject1;
      localObject1 = localObject2;
      break label264;
      f.b(localObject1);
      if (i.a(zzb, zzcm.zzb()))
      {
        double d2 = paramLong;
        localObject3 = zza;
        zze = this;
        zzf = paramString;
        localObject1 = paramRecaptchaAction;
        zzg = ((RecaptchaAction)localObject1);
        d1 = d2 * 0.55D;
        zza = d1;
        zzd = 1;
        localObject3 = ((zzdt)localObject3).zzl(paramString, (0.45D * d2), parame);
        if (localObject3 != locala)
        {
          paramRecaptchaAction = this;
          label264:
          zzsi localzzsi = (zzsi)localObject3;
          zzdt localzzdt = zza;
          localObject2 = zzc;
          localObject3 = localObject2;
          if (localObject2 == null) {
            localObject3 = null;
          }
          localObject3 = localzzdt.zzi((RecaptchaAction)localObject1, localzzsi, (zzsc)localObject3);
          localObject1 = zza;
          paramLong = d1;
          zze = paramRecaptchaAction;
          zzf = paramString;
          zzg = null;
          zzd = 2;
          localObject1 = ((zzdt)localObject1).zzm((zzsp)localObject3, paramString, paramLong, parame);
          if (localObject1 != locala)
          {
            label362:
            parame = (zzsr)localObject1;
            zza.zzq(paramString, parame);
            return parame.zzj();
          }
        }
        return locala;
      }
      paramString = new com/google/android/recaptcha/internal/zzbd;
      paramString.<init>(zzbb.zzb, zzba.zzar, null);
      throw paramString;
    }
    catch (Exception paramString)
    {
      throw new zzbd(zzbb.zzb, zzba.zzaz, paramString.getMessage());
    }
    catch (zzbd paramString)
    {
      throw paramString;
    }
  }
  
  public final Object zzb(long paramLong, e parame)
  {
    if ((parame instanceof zzee))
    {
      localzzee = (zzee)parame;
      i = zzd;
      if ((i & 0x80000000) != 0)
      {
        zzd = (i + Integer.MIN_VALUE);
        break label52;
      }
    }
    zzee localzzee = new zzee(this, parame);
    label52:
    Object localObject = zzb;
    a locala = a.a;
    int i = zzd;
    double d1;
    double d2;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          zzef localzzef1 = zze;
          parame = localzzef1;
          try
          {
            f.b(localObject);
          }
          catch (zzbd localzzbd1)
          {
            break label345;
          }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
      d1 = zza;
      parame = zze;
      try
      {
        f.b(localObject);
        e locale = parame;
      }
      catch (zzbd localzzbd2)
      {
        break label345;
      }
    }
    else
    {
      f.b(localObject);
      if ((i.a(zzb, zzcm.zzb())) || (i.a(zzb, zzcm.zza()))) {
        break label355;
      }
      zzb = zzcm.zzc();
      d2 = paramLong;
    }
    try
    {
      parame = zza;
      zze = this;
      d1 = d2 * 0.4D;
      zza = d1;
      zzd = 1;
      localObject = parame.zzo((0.6D * d2), localzzee);
      if (localObject != locala)
      {
        zzef localzzef2 = this;
        parame = localzzef2;
        localObject = (zzsc)localObject;
        parame = localzzef2;
        zzc = ((zzsc)localObject);
        parame = localzzef2;
        zzdt localzzdt = zza;
        paramLong = d1;
        parame = localzzef2;
        zze = localzzef2;
        parame = localzzef2;
        zzd = 2;
        parame = localzzef2;
        if (localzzdt.zzn((zzsc)localObject, paramLong, localzzee) != locala)
        {
          parame = localzzef2;
          zzb = zzcm.zzb();
          return h.a;
        }
      }
      return locala;
    }
    catch (zzbd localzzbd3)
    {
      parame = this;
    }
    label345:
    zzb = zzcm.zza();
    throw localzzbd3;
    label355:
    return h.a;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */