package com.google.android.recaptcha.internal;

import android.content.Context;
import java.nio.charset.StandardCharsets;
import nc.d0;
import nc.e0;
import rb.f;
import rb.h;
import ub.e;
import vb.a;

public final class zzae
  implements zzy
{
  private final zzek zza;
  private final Context zzb;
  private final zzan zzc;
  private boolean zzd;
  private String zze;
  private final zzbs zzf;
  
  public zzae(zzek paramzzek, Context paramContext, d0 paramd0, zzan paramzzan, zzbs paramzzbs)
  {
    zza = paramzzek;
    zzb = paramContext;
    zzc = paramzzan;
    zzf = paramzzbs;
    zzd = true;
    zze = "";
  }
  
  private static final String zzi(zzle paramzzle)
  {
    Object localObject = zzkh.zzg();
    paramzzle = paramzzle.zzl();
    paramzzle = ((zzkh)localObject).zzi(paramzzle, 0, paramzzle.length);
    paramzzle = zzjz.zza().zza(paramzzle, StandardCharsets.UTF_8).zzd();
    localObject = zzle.zzk(paramzzle, 0, paramzzle.length);
    paramzzle = zzkh.zzh();
    localObject = ((zzle)localObject).zzl();
    return paramzzle.zzi((byte[])localObject, 0, localObject.length);
  }
  
  public final int zza()
  {
    return 2;
  }
  
  public final zzek zzb()
  {
    return zza;
  }
  
  public final Object zzc(String paramString, e parame)
  {
    return e0.b(new zzac(this, paramString, null), parame);
  }
  
  public final Object zzd(zzse paramzzse, e parame)
  {
    if ((parame instanceof zzad))
    {
      localObject1 = (zzad)parame;
      i = zzd;
      if ((i & 0x80000000) != 0)
      {
        zzd = (i + Integer.MIN_VALUE);
        parame = (e)localObject1;
        break label50;
      }
    }
    parame = new zzad(this, parame);
    label50:
    Object localObject2 = zzb;
    a locala = a.a;
    int i = zzd;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          paramzzse = (zzen)zza;
          f.b(localObject2);
          break label257;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
      paramzzse = zze;
      localObject1 = (zzae)zza;
      f.b(localObject2);
    }
    else
    {
      f.b(localObject2);
      localObject2 = zzz.zzc(this);
      if ((zzf.zza(zzb) != 3) || (paramzzse.zzf() == 0L)) {
        break label268;
      }
      zze = zzi(paramzzse.zzg());
      localObject1 = zzc;
      long l = paramzzse.zzf();
      zza = this;
      zze = ((zzen)localObject2);
      zzd = 1;
      if (((zzan)localObject1).zzd(l, parame) == locala) {
        break label265;
      }
      localObject1 = this;
      paramzzse = (zzse)localObject2;
    }
    Object localObject1 = zzc;
    zza = paramzzse;
    zze = null;
    zzd = 2;
    if (((zzan)localObject1).zze(parame) != locala) {
      label257:
      paramzzse.zza();
    }
    for (;;)
    {
      return h.a;
      label265:
      return locala;
      label268:
      zzd = false;
      ((zzen)localObject2).zzb(new zzbd(zzbb.zzb, zzba.zzab, null));
    }
  }
  
  public final void zze(zzsr paramzzsr)
  {
    zze = zzi(paramzzsr.zzf());
  }
  
  public final boolean zzf()
  {
    return zzd;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */