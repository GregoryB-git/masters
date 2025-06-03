package com.google.android.recaptcha.internal;

import b.a0;
import ec.i;
import rb.f;
import rb.h;
import sb.k;
import ub.e;

public final class zzcb
{
  private Object zza;
  private final vc.a zzb;
  
  public zzcb(Object paramObject)
  {
    zza = paramObject;
    zzb = a0.e();
  }
  
  public final Object zza(Object paramObject, e parame)
  {
    Object localObject1;
    if ((parame instanceof zzby))
    {
      localObject1 = (zzby)parame;
      i = zzd;
      if ((i & 0x80000000) != 0)
      {
        zzd = (i + Integer.MIN_VALUE);
        parame = (e)localObject1;
        break label50;
      }
    }
    parame = new zzby(this, parame);
    label50:
    Object localObject2 = zzb;
    Object localObject3 = vb.a.a;
    int i = zzd;
    if (i != 0)
    {
      if (i == 1)
      {
        localObject3 = (vc.a)zza;
        localObject1 = zzf;
        paramObject = zze;
        f.b(localObject2);
        parame = (e)localObject3;
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(localObject2);
      localObject1 = zzb;
      zze = this;
      zzf = ((zzje)paramObject);
      zza = localObject1;
      zzd = 1;
      if (((vc.a)localObject1).b(parame) == localObject3) {
        break label206;
      }
      localObject3 = this;
      parame = (e)localObject1;
      localObject1 = paramObject;
      paramObject = localObject3;
    }
    try
    {
      boolean bool = i.a(zza, localObject1);
      return Boolean.valueOf(bool);
    }
    finally
    {
      parame.a(null);
    }
    label206:
    return localObject3;
  }
  
  public final Object zzb(Object[] paramArrayOfObject, e parame)
  {
    if ((parame instanceof zzbz))
    {
      localObject1 = (zzbz)parame;
      i = zzd;
      if ((i & 0x80000000) != 0)
      {
        zzd = (i + Integer.MIN_VALUE);
        parame = (e)localObject1;
        break label50;
      }
    }
    parame = new zzbz(this, parame);
    label50:
    Object localObject2 = zzb;
    Object localObject1 = vb.a.a;
    int i = zzd;
    Object localObject3;
    if (i != 0)
    {
      if (i == 1)
      {
        paramArrayOfObject = (vc.a)zza;
        localObject3 = zzf;
        localObject1 = zze;
        f.b(localObject2);
        parame = paramArrayOfObject;
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(localObject2);
      localObject3 = zzb;
      zze = this;
      zzf = ((zzje[])paramArrayOfObject);
      zza = localObject3;
      zzd = 1;
      if (((vc.a)localObject3).b(parame) == localObject1) {
        return localObject1;
      }
      localObject1 = this;
      parame = (e)localObject3;
      localObject3 = paramArrayOfObject;
    }
    try
    {
      boolean bool = k.n(zza, (Object[])localObject3);
      return Boolean.valueOf(bool);
    }
    finally
    {
      parame.a(null);
    }
    return localObject1;
  }
  
  public final Object zzc(Object paramObject, e parame)
  {
    if ((parame instanceof zzca))
    {
      localObject1 = (zzca)parame;
      i = zzd;
      if ((i & 0x80000000) != 0)
      {
        zzd = (i + Integer.MIN_VALUE);
        parame = (e)localObject1;
        break label50;
      }
    }
    parame = new zzca(this, parame);
    label50:
    Object localObject2 = zzb;
    Object localObject1 = vb.a.a;
    int i = zzd;
    vc.a locala;
    if (i != 0)
    {
      if (i == 1)
      {
        locala = (vc.a)zza;
        paramObject = zzf;
        localObject1 = zze;
        f.b(localObject2);
        parame = locala;
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(localObject2);
      locala = zzb;
      zze = this;
      zzf = ((zzje)paramObject);
      zza = locala;
      zzd = 1;
      if (locala.b(parame) == localObject1) {
        return localObject1;
      }
      localObject1 = this;
      parame = locala;
    }
    try
    {
      zza = paramObject;
      paramObject = h.a;
      return h.a;
    }
    finally
    {
      parame.a(null);
    }
    return localObject1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzcb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */