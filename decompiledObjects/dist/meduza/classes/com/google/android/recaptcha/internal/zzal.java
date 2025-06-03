package com.google.android.recaptcha.internal;

import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider;
import dc.p;
import ec.s;
import nc.m0;
import nc.r;
import rb.f;
import rb.h;
import ub.e;
import vb.a;
import wb.c;
import wb.i;

final class zzal
  extends i
  implements p
{
  public long zza;
  public boolean zzb;
  public int zzc;
  
  public zzal(zzan paramzzan, zzen paramzzen, s params, e parame)
  {
    super(2, parame);
  }
  
  public final e create(Object paramObject, e parame)
  {
    return new zzal(zzd, zze, zzf, parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    a locala = a.a;
    int i = zzc;
    boolean bool;
    long l1;
    long l2;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    if (i != 0)
    {
      if (i != 1)
      {
        bool = zzb;
        l1 = zza;
        f.b(paramObject);
        paramObject = this;
        break label338;
      }
      l2 = zza;
      try
      {
        f.b(paramObject);
        localObject1 = this;
        localObject2 = paramObject;
      }
      catch (Exception paramObject)
      {
        localObject3 = this;
        l1 = l2;
        break label234;
      }
    }
    else
    {
      f.b(paramObject);
      l2 = 1000L;
      paramObject = this;
      bool = true;
    }
    while (bool)
    {
      localObject3 = paramObject;
      l1 = l2;
      try
      {
        localObject1 = zzd;
        localObject3 = paramObject;
        l1 = l2;
        zza = l2;
        localObject3 = paramObject;
        l1 = l2;
        zzc = 1;
        localObject3 = paramObject;
        l1 = l2;
        localObject2 = zzan.zza((zzan)localObject1, (e)paramObject);
        if (localObject2 != locala)
        {
          localObject1 = paramObject;
          localObject3 = localObject1;
          l1 = l2;
          paramObject = (StandardIntegrityManager.StandardIntegrityTokenProvider)localObject2;
          localObject3 = localObject1;
          l1 = l2;
          zzd.zzf().i0(paramObject);
          localObject3 = localObject1;
          l1 = l2;
          zzan.zzh(zzd, zzao.zzc);
          localObject3 = localObject1;
          l1 = l2;
          zze.zza();
          bool = false;
          paramObject = localObject1;
          continue;
        }
        return locala;
      }
      catch (Exception paramObject) {}
      label234:
      zzf.a = paramObject;
      if ((paramObject instanceof StandardIntegrityException))
      {
        i = ((StandardIntegrityException)paramObject).getErrorCode();
        if ((i == -100) || (i == -18) || (i == -12) || (i == -8) || (i == -3))
        {
          bool = true;
          break label300;
        }
      }
      bool = false;
      label300:
      if (bool)
      {
        zza = l1;
        zzb = true;
        zzc = 2;
        if (m0.a(l1, (c)localObject3) != locala)
        {
          paramObject = localObject3;
          label338:
          l2 = l1 + l1;
        }
        else
        {
          return locala;
        }
      }
      else
      {
        throw ((Throwable)paramObject);
      }
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzal
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */