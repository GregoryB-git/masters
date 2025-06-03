package com.google.android.recaptcha.internal;

import dc.l;
import nc.m0;
import rb.f;
import ub.e;
import vb.a;

public final class zzbq
{
  public static final zzbq zza = new zzbq();
  
  public final Object zza(l paraml1, long paramLong1, long paramLong2, double paramDouble, l paraml2, e parame)
  {
    if ((parame instanceof zzbp))
    {
      localObject1 = (zzbp)parame;
      i = zzh;
      if ((i & 0x80000000) != 0)
      {
        zzh = (i + Integer.MIN_VALUE);
        parame = (e)localObject1;
        break label59;
      }
    }
    parame = new zzbp(this, parame);
    label59:
    Object localObject2 = zzf;
    Object localObject1 = a.a;
    int i = zzh;
    if (i != 0) {
      if (i != 1) {
        if (i == 2)
        {
          paramLong2 = zzd;
          paramDouble = zze;
          paramLong1 = zzc;
          paraml2 = (l)zzb;
          paraml1 = (l)zza;
          f.b(localObject2);
        }
      }
    }
    label243:
    label331:
    do
    {
      localObject2 = paraml1;
      paraml1 = (l)localObject1;
      long l = paramLong2;
      paramLong2 = paramLong1;
      localObject1 = localObject2;
      paramLong1 = l;
      break label243;
      throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      paramLong2 = zzd;
      paramDouble = zze;
      paramLong1 = zzc;
      paraml2 = (l)zzb;
      paraml1 = (l)zza;
      try
      {
        f.b(localObject2);
        paraml2 = (l)localObject2;
      }
      catch (Exception localException1)
      {
        break label331;
      }
      f.b(localException1);
      Object localObject3 = localObject1;
      localObject1 = paraml1;
      paraml1 = (l)localObject3;
      try
      {
        zza = localObject1;
        zzb = paraml2;
        zzc = paramLong2;
        zze = paramDouble;
        zzd = paramLong1;
        zzh = 1;
        localObject3 = paraml2.invoke(parame);
        paraml2 = (l)localObject3;
        if (localObject3 == paraml1) {
          return paraml1;
        }
        return paraml2;
      }
      catch (Exception localException2)
      {
        l = paramLong2;
        l locall = paraml1;
        paramLong2 = paramLong1;
        paraml1 = (l)localObject1;
        paramLong1 = l;
        localObject1 = locall;
      }
      if (!((Boolean)paraml1.invoke(localException2)).booleanValue()) {
        break;
      }
      l = (paramLong2 * paramDouble);
      paramLong2 = l;
      if (l > paramLong1) {
        paramLong2 = paramLong1;
      }
      zza = paraml1;
      zzb = paraml2;
      zzc = paramLong1;
      zze = paramDouble;
      zzd = paramLong2;
      zzh = 2;
    } while (m0.a(paramLong2, parame) != localObject1);
    return localObject1;
    throw localException2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzbq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */