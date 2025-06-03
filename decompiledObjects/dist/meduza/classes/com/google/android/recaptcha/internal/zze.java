package com.google.android.recaptcha.internal;

import b.a0;
import dc.p;
import rb.f;
import rb.h;
import vb.a;

public abstract class zze
{
  private boolean zza;
  
  public zzen zza(String paramString)
  {
    throw null;
  }
  
  public zzen zzb()
  {
    throw null;
  }
  
  public final Object zzc(String paramString, long paramLong, ub.e parame)
  {
    Object localObject1 = paramString;
    if ((parame instanceof zza))
    {
      localzza = (zza)parame;
      i = zze;
      if ((i & 0x80000000) != 0)
      {
        zze = (i + Integer.MIN_VALUE);
        break label58;
      }
    }
    zza localzza = new zza(this, parame);
    label58:
    parame = zzc;
    a locala = a.a;
    int i = zze;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3)
          {
            f.b(parame);
            localObject2 = parame;
            break label473;
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        localObject1 = zzf;
        localObject2 = (zze)zza;
        f.b(parame);
        break label433;
      }
      paramLong = zzb;
      localObject1 = zzg;
      paramString = zzf;
      localObject2 = (zze)zza;
      try
      {
        f.b(parame);
        localObject3 = localObject1;
        localObject4 = parame;
        localObject1 = paramString;
        parame = (ub.e)localObject3;
        paramString = (String)localObject2;
      }
      catch (Exception parame)
      {
        localObject3 = paramString;
        paramString = parame;
        parame = (ub.e)localObject1;
        localObject1 = localObject3;
      }
    }
    for (;;)
    {
      break label356;
      f.b(parame);
      parame = zza(paramString);
      try
      {
        paramString = new com/google/android/recaptcha/internal/zzb;
        paramString.<init>(this, (String)localObject1, null);
        zza = this;
        zzf = ((String)localObject1);
        zzg = parame;
        zzb = paramLong;
        zze = 1;
        localObject4 = a0.M(paramLong, paramString, localzza);
        if (localObject4 != locala)
        {
          paramString = this;
          try
          {
            localObject2 = a;
            f.b(localObject2);
            localObject3 = (zzsi)localObject2;
            localObject2 = localObject3;
            if (parame == null) {
              break label473;
            }
            parame.zza();
            localObject2 = localObject3;
          }
          catch (Exception localException)
          {
            localObject2 = paramString;
            paramString = localException;
          }
        }
        else
        {
          return locala;
        }
      }
      catch (Exception paramString)
      {
        localObject2 = this;
      }
    }
    label356:
    zzbd localzzbd = zzf.zza(paramString, new zzbd(zzbb.zzb, zzba.zzaa, paramString.getMessage()));
    if (parame != null) {
      parame.zzb(localzzbd);
    }
    zza = localObject2;
    zzf = ((String)localObject1);
    zzg = null;
    zze = 2;
    if (((zze)localObject2).zzi((String)localObject1, paramLong, paramString, localzza) != locala)
    {
      label433:
      zza = null;
      zzf = null;
      zze = 3;
      paramString = ((zze)localObject2).zzd((String)localObject1, localzza);
      localObject2 = paramString;
      if (paramString == locala) {
        return locala;
      }
      label473:
      return localObject2;
    }
    return locala;
  }
  
  public abstract Object zzd(String paramString, ub.e parame);
  
  public final Object zze(long paramLong, zzsc paramzzsc, ub.e parame)
  {
    if ((parame instanceof zzc))
    {
      localzzc = (zzc)parame;
      i = zzd;
      if ((i & 0x80000000) != 0)
      {
        zzd = (i + Integer.MIN_VALUE);
        break label55;
      }
    }
    zzc localzzc = new zzc(this, parame);
    label55:
    Object localObject1 = zzb;
    a locala = a.a;
    int i = zzd;
    zze localzze;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3)
          {
            paramzzsc = (zzbd)zza;
            f.b(localObject1);
            break label430;
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        parame = zze;
        paramzzsc = (zze)zza;
        f.b(localObject1);
        break label376;
      }
      zzen localzzen = zze;
      localzze = (zze)zza;
      parame = localzzen;
      paramzzsc = localzze;
      try
      {
        f.b(localObject1);
      }
      catch (Exception localException1)
      {
        break label335;
      }
    }
    else
    {
      f.b(localObject1);
      parame = zzb();
      if (zza)
      {
        parame.zza();
        return h.a;
      }
    }
    try
    {
      Object localObject2 = new com/google/android/recaptcha/internal/zzd;
      ((zzd)localObject2).<init>(this, paramzzsc, null);
      zza = this;
      zze = parame;
      zzd = 1;
      localObject1 = a0.M(paramLong, (p)localObject2, localzzc);
      if (localObject1 == locala) {
        break label435;
      }
      localzze = this;
      localObject2 = parame;
      parame = (ub.e)localObject2;
      paramzzsc = localzze;
      f.b(a);
      parame = (ub.e)localObject2;
      paramzzsc = localzze;
      localObject1 = h.a;
      parame = (ub.e)localObject2;
      paramzzsc = localzze;
      zza = true;
      if (localObject2 != null)
      {
        parame = (ub.e)localObject2;
        paramzzsc = localzze;
        ((zzen)localObject2).zza();
      }
      return localObject1;
    }
    catch (Exception localException2)
    {
      paramzzsc = this;
    }
    label335:
    zza = false;
    zza = paramzzsc;
    zze = parame;
    zzd = 2;
    localObject1 = paramzzsc.zzj(localException2, localzzc);
    if (localObject1 != locala)
    {
      label376:
      zzbd localzzbd = (zzbd)localObject1;
      if (parame != null) {
        parame.zzb(localzzbd);
      }
      zza = localzzbd;
      zze = null;
      zzd = 3;
      if (paramzzsc.zzg(localzzbd, localzzc) != locala)
      {
        paramzzsc = localzzbd;
        label430:
        return f.a(paramzzsc);
      }
    }
    label435:
    return locala;
  }
  
  public abstract Object zzf(String paramString, ub.e parame);
  
  public Object zzg(zzbd paramzzbd, ub.e parame)
  {
    return h.a;
  }
  
  public abstract Object zzh(zzsc paramzzsc, ub.e parame);
  
  public Object zzi(String paramString, long paramLong, Exception paramException, ub.e parame)
  {
    return h.a;
  }
  
  public Object zzj(Exception paramException, ub.e parame)
  {
    return zzf.zza(paramException, new zzbd(zzbb.zzb, zzba.zzap, paramException.getMessage()));
  }
  
  public void zzk(zzsr paramzzsr) {}
  
  public final boolean zzl()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */