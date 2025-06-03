package com.google.android.recaptcha.internal;

import b.a0;
import dc.p;
import ec.s;
import nc.r;
import rb.f;
import rb.h;
import ub.e;
import vb.a;
import wb.i;

final class zzam
  extends i
  implements p
{
  public Object zza;
  public int zzb;
  
  public zzam(zzan paramzzan, zzen paramzzen, e parame)
  {
    super(2, parame);
  }
  
  public final e create(Object paramObject, e parame)
  {
    return new zzam(zzc, zzd, parame);
  }
  
  public final Object invokeSuspend(Object paramObject)
  {
    Object localObject1 = a.a;
    if (zzb != 0)
    {
      localObject2 = (s)zza;
      try
      {
        f.b(paramObject);
      }
      catch (Exception paramObject)
      {
        break label87;
      }
    }
    else
    {
      f.b(paramObject);
      localObject2 = new s();
      try
      {
        paramObject = new com/google/android/recaptcha/internal/zzal;
        ((zzal)paramObject).<init>(zzc, zzd, (s)localObject2, null);
        zza = localObject2;
        zzb = 1;
        paramObject = a0.M(60000L, (p)paramObject, this);
        if (paramObject != localObject1) {
          break label155;
        }
        return localObject1;
      }
      catch (Exception paramObject) {}
    }
    label87:
    r localr = zzc.zzf();
    localObject1 = (Throwable)a;
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = paramObject;
    }
    localr.h0((Throwable)localObject2);
    zzan.zzh(zzc, zzao.zza);
    zzd.zzb(new zzbd(zzbb.zzb, zzba.zza, ((Throwable)paramObject).getMessage()));
    label155:
    return h.a;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzam
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */