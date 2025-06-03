package com.google.android.recaptcha.internal;

import b.z;
import com.google.android.recaptcha.RecaptchaAction;
import dc.l;
import ec.i;
import java.util.concurrent.TimeUnit;
import nc.r;
import rb.f;
import rb.h;
import ub.e;
import vb.a;
import x6.b;

public final class zzec
  implements zzcn
{
  private final zzdt zza;
  private final zzek zzb;
  private r zzc;
  private zzbd zzd;
  private zzsc zze;
  private zzcm zzf;
  private final zzbi zzg;
  
  public zzec(zzdt paramzzdt, zzbi paramzzbi, zzek paramzzek, zzbo paramzzbo)
  {
    zza = paramzzdt;
    zzg = paramzzbi;
    zzb = paramzzek;
    zzc = z.b();
    zzf = zzcm.zzd();
  }
  
  private final Object zzl(l paraml, e parame)
  {
    if ((parame instanceof zzdv))
    {
      localObject = (zzdv)parame;
      i = zzc;
      if ((i & 0x80000000) != 0)
      {
        zzc = (i + Integer.MIN_VALUE);
        parame = (e)localObject;
        break label50;
      }
    }
    parame = new zzdv(this, parame);
    label50:
    Object localObject = zza;
    a locala = a.a;
    int i = zzc;
    if (i != 0)
    {
      if (i == 1)
      {
        paraml = zzd;
        f.b(localObject);
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(localObject);
      localObject = new zzbn();
      zzd = ((zzbn)localObject);
      zzc = 1;
      if (paraml.invoke(parame) == locala) {
        break label154;
      }
      paraml = (l)localObject;
    }
    paraml.zzc();
    return new Long(paraml.zza(TimeUnit.MILLISECONDS));
    label154:
    return locala;
  }
  
  private final Object zzm(long paramLong, e parame)
  {
    if ((parame instanceof zzdw))
    {
      localObject1 = (zzdw)parame;
      i = zzd;
      if ((i & 0x80000000) != 0)
      {
        zzd = (i + Integer.MIN_VALUE);
        break label52;
      }
    }
    Object localObject1 = new zzdw(this, parame);
    label52:
    Object localObject2 = zzb;
    a locala = a.a;
    int i = zzd;
    Object localObject3 = null;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          paramLong = zza;
          localObject1 = zze;
          parame = (e)localObject1;
          try
          {
            f.b(localObject2);
          }
          catch (Exception localException1)
          {
            localObject2 = parame;
            break label310;
          }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
      paramLong = zza;
      parame = zze;
      f.b(localObject2);
    }
    else
    {
      f.b(localObject2);
      zze = this;
      zza = paramLong;
      zzd = 1;
      if (zzn(paramLong, (e)localObject1) == localException1) {
        break label406;
      }
      parame = this;
    }
    try
    {
      localObject2 = new com/google/android/recaptcha/internal/zzdy;
      ((zzdy)localObject2).<init>(paramLong, parame, null);
      zze = parame;
      zza = paramLong;
      zzd = 2;
      localObject2 = parame.zzl((l)localObject2, (e)localObject1);
      if (localObject2 == localException1) {
        break label406;
      }
      localObject1 = parame;
      parame = (e)localObject1;
      long l = ((Number)localObject2).longValue();
      paramLong -= l;
      if (paramLong >= 500L) {
        return new Long(paramLong);
      }
      parame = (e)localObject1;
      localObject2 = new com/google/android/recaptcha/internal/zzbd;
      parame = (e)localObject1;
      ((zzbd)localObject2).<init>(zzbb.zzc, zzba.zzar, null);
      parame = (e)localObject1;
      throw ((Throwable)localObject2);
    }
    catch (Exception localException2)
    {
      localObject2 = parame;
    }
    label310:
    localObject1 = localObject3;
    if ((localException2 instanceof zzbd)) {
      localObject1 = (zzbd)localException2;
    }
    parame = (e)localObject1;
    if (localObject1 == null) {
      parame = new zzbd(zzbb.zzc, zzba.zzar, localException2.getMessage());
    }
    if ((!i.a(zzf, zzcm.zza())) && (!i.a(zzf, zzcm.zzc()))) {
      throw parame;
    }
    localObject1 = zzd;
    if (localObject1 != null) {
      parame = (e)localObject1;
    }
    throw parame;
    label406:
    return localException2;
  }
  
  private final Object zzn(long paramLong, e parame)
  {
    if ((!i.a(zzf, zzcm.zzb())) && (!i.a(zzf, zzcm.zzc())))
    {
      if ((i.a(zzf, zzcm.zza())) && (!zzo(zzd))) {
        return h.a;
      }
      zzf = zzcm.zzc();
      parame = z.b();
      zzc = parame;
      b.g0(zzg.zza(), null, new zzeb(this, parame, paramLong, null), 3);
      return h.a;
    }
    return h.a;
  }
  
  private static final boolean zzo(Exception paramException)
  {
    if ((paramException instanceof zzbd))
    {
      paramException = (zzbd)paramException;
      return (!i.a(paramException.zzb(), zzbb.zzd)) && (!i.a(paramException.zzb(), zzbb.zze)) && (!i.a(paramException.zzb(), zzbb.zzf));
    }
    return true;
  }
  
  public final Object zza(String paramString, RecaptchaAction paramRecaptchaAction, long paramLong, e parame)
  {
    if ((parame instanceof zzdu))
    {
      localzzdu = (zzdu)parame;
      i = zzd;
      if ((i & 0x80000000) != 0)
      {
        zzd = (i + Integer.MIN_VALUE);
        break label55;
      }
    }
    zzdu localzzdu = new zzdu(this, parame);
    label55:
    parame = zzb;
    a locala = a.a;
    int i = zzd;
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i == 3)
          {
            paramRecaptchaAction = zzf;
            paramString = zze;
          }
        }
      }
    }
    try
    {
      f.b(parame);
      break label449;
      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      double d1 = zza;
      Object localObject1 = zzg;
      paramRecaptchaAction = zzf;
      paramString = zze;
      f.b(parame);
      Object localObject2 = parame;
      parame = (e)localObject1;
      break label351;
      localObject1 = zzg;
      paramRecaptchaAction = zzf;
      localObject2 = zze;
      f.b(parame);
      paramString = parame;
      parame = (e)localObject1;
      localObject1 = paramString;
      paramString = (String)localObject2;
      break label270;
      f.b(parame);
      zze = this;
      localObject2 = paramString;
      zzf = ((String)localObject2);
      zzg = paramRecaptchaAction;
      zzd = 1;
      localObject1 = zzm(paramLong, localzzdu);
      if (localObject1 == locala) {
        return locala;
      }
      paramString = this;
      parame = paramRecaptchaAction;
      paramRecaptchaAction = (RecaptchaAction)localObject2;
      label270:
      double d2 = ((Number)localObject1).longValue();
      localObject2 = zza;
      zze = paramString;
      zzf = paramRecaptchaAction;
      zzg = parame;
      d1 = d2 * 0.55D;
      zza = d1;
      zzd = 2;
      localObject2 = ((zzdt)localObject2).zzl(paramRecaptchaAction, (0.45D * d2), localzzdu);
      if (localObject2 != locala)
      {
        label351:
        zzsi localzzsi = (zzsi)localObject2;
        zzdt localzzdt = zza;
        localObject1 = zze;
        localObject2 = localObject1;
        if (localObject1 == null) {
          localObject2 = null;
        }
        parame = localzzdt.zzi(parame, localzzsi, (zzsc)localObject2);
        localObject2 = zza;
        paramLong = d1;
        zze = paramString;
        zzf = paramRecaptchaAction;
        zzg = null;
        zzd = 3;
        parame = ((zzdt)localObject2).zzm(parame, paramRecaptchaAction, paramLong, localzzdu);
        if (parame != locala)
        {
          label449:
          parame = (zzsr)parame;
          zza.zzq(paramRecaptchaAction, parame);
          paramString = parame.zzj();
          return paramString;
        }
      }
      return locala;
    }
    catch (Exception paramString)
    {
      throw new zzbd(zzbb.zzb, zzba.zzay, paramString.getMessage());
    }
    catch (zzbd paramString)
    {
      throw paramString;
    }
  }
  
  public final Object zzb(long paramLong, e parame)
  {
    parame = zzn(paramLong, parame);
    if (parame == a.a) {
      return parame;
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */