package com.google.android.recaptcha.internal;

import b.z;
import nc.e0;
import rb.c;
import rb.f;
import ub.e;
import vb.a;

public final class zzfj
{
  private final c zza;
  
  public zzfj()
  {
    int i = zzav.zza;
    zza = z.n(zzfi.zza);
  }
  
  public static Object zzc(zzfj paramzzfj, zzbr paramzzbr, zzsp paramzzsp, e parame)
  {
    if ((parame instanceof zzfg))
    {
      localObject = (zzfg)parame;
      i = zzc;
      if ((i & 0x80000000) != 0)
      {
        zzc = (i + Integer.MIN_VALUE);
        parame = (e)localObject;
        break label54;
      }
    }
    parame = new zzfg(paramzzfj, parame);
    label54:
    Object localObject = zza;
    a locala = a.a;
    int i = zzc;
    if (i != 0)
    {
      if (i == 1)
      {
        f.b(localObject);
        paramzzfj = (zzfj)localObject;
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(localObject);
      paramzzfj = new zzfh(paramzzfj, paramzzbr, paramzzsp, null);
      zzc = 1;
      paramzzbr = e0.b(paramzzfj, parame);
      paramzzfj = paramzzbr;
      if (paramzzbr == locala) {
        return locala;
      }
    }
    return paramzzfj;
  }
  
  public final Object zzb(zzbr paramzzbr, zzsp paramzzsp, e parame)
  {
    return zzc(this, paramzzbr, paramzzsp, parame);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzfj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */