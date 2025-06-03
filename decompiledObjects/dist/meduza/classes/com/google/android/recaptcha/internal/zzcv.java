package com.google.android.recaptcha.internal;

import android.app.Application;
import android.content.Context;
import b.a0;
import b.z;
import dc.p;
import ec.i;
import java.util.Map;
import java.util.UUID;
import rb.f;
import rb.g;
import ub.e;

public final class zzcv
{
  private final Application zza;
  private final vc.a zzb;
  private zzdc zzc;
  private final String zzd;
  private final zzl zze;
  private zzbi zzf;
  
  public zzcv(Application paramApplication)
  {
    zza = paramApplication;
    zzb = a0.e();
    zzd = UUID.randomUUID().toString();
    zzf = new zzbi();
    zze = new zzl(null, 1, null);
    int i = zzav.zza;
    zzaw localzzaw1 = new zzaw(915034652, new zzaz(null, 1, null));
    i = 0;
    zzaw localzzaw2 = new zzaw(915034802, new zzfu());
    zzaw localzzaw3 = new zzaw(915034662, new zzbe());
    zzaw localzzaw4 = new zzaw(915034909, new zzjd());
    zzaw localzzaw5 = new zzaw(915034675, new zzbr("https://www.recaptcha.net/recaptcha/api3"));
    zzaw localzzaw6 = new zzaw(915034774, new zzex(null, 1, null));
    zzaw localzzaw7 = new zzaw(915034792, new zzfk(true));
    zzaw localzzaw8 = new zzaw(Application.class.getName().hashCode(), paramApplication);
    zzaw localzzaw9 = new zzaw(915034663, new zzbf(paramApplication));
    zzaw localzzaw10 = new zzaw(915034791, new zzfj());
    paramApplication = new zzaw(915034643, new zzbm(paramApplication));
    zzaw localzzaw11 = new zzaw(915034775, new zzfa());
    zzaw localzzaw12 = new zzaw(915034787, new zzff());
    while (i < 13)
    {
      zzaw localzzaw13 = new zzaw[] { localzzaw1, localzzaw2, localzzaw3, localzzaw4, localzzaw5, localzzaw6, localzzaw7, localzzaw8, localzzaw9, localzzaw10, paramApplication, localzzaw11, localzzaw12 }[i];
      if (!zzav.zzc().containsKey(Integer.valueOf(localzzaw13.zza()))) {
        zzav.zzc().put(Integer.valueOf(localzzaw13.zza()), localzzaw13);
      }
      i++;
    }
  }
  
  private final Object zzj(String paramString, int paramInt, p paramp, e parame)
  {
    if ((parame instanceof zzcu))
    {
      localObject = (zzcu)parame;
      i = zzc;
      if ((i & 0x80000000) != 0)
      {
        zzc = (i + Integer.MIN_VALUE);
        parame = (e)localObject;
        break label61;
      }
    }
    parame = new zzcu(this, parame);
    label61:
    Object localObject = zza;
    vb.a locala = vb.a.a;
    int i = zzc;
    if (i != 0)
    {
      if (i == 1)
      {
        paramString = zzd;
        parame = paramString;
        paramp = paramString;
        try
        {
          f.b(localObject);
        }
        catch (Exception paramString)
        {
          paramp = paramString;
          break label206;
        }
        catch (zzbd paramString)
        {
          break label244;
        }
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(localObject);
      localObject = zzk(paramString, zzf, paramInt);
      paramString = ((zzek)localObject).zzf(6);
    }
    try
    {
      zzd = paramString;
      zzc = 1;
      localObject = paramp.invoke(localObject, parame);
      if (localObject != locala)
      {
        parame = paramString;
        paramp = paramString;
        paramString.zza();
        return localObject;
      }
      return locala;
    }
    catch (Exception paramp)
    {
      parame = paramString;
      paramString = new zzbd(zzbb.zzb, zzba.zza, paramp.getMessage());
      parame.zzb(paramString);
      throw paramString.zzc();
    }
    catch (zzbd paramp)
    {
      label206:
      parame = paramString;
      paramString = paramp;
      paramp = parame;
    }
    label244:
    paramp.zzb(paramString);
    throw paramString.zzc();
  }
  
  private final zzek zzk(String paramString, zzbi paramzzbi, int paramInt)
  {
    String str = UUID.randomUUID().toString();
    int i = zzav.zza;
    Object localObject = z.n(zzcr.zza);
    paramzzbi = new zzes(zza, new zzeu(((zzbr)((g)localObject).getValue()).zzc()), paramzzbi.zza());
    localObject = zza;
    paramString = new zzek(paramString, zzd, str, paramInt, (Context)localObject, paramzzbi, null);
    paramString.zzc(str);
    return paramString;
  }
  
  public final zzbi zzd()
  {
    return zzf;
  }
  
  public final Object zzg(String paramString, long paramLong, zzcn paramzzcn, zzbi paramzzbi, zzch paramzzch, e parame)
  {
    if ((parame instanceof zzcs))
    {
      paramzzcn = (zzcs)parame;
      i = zzg;
      if ((i & 0x80000000) != 0)
      {
        zzg = (i + Integer.MIN_VALUE);
        break label57;
      }
    }
    paramzzcn = new zzcs(this, parame);
    label57:
    parame = zze;
    vb.a locala = vb.a.a;
    int i = zzg;
    Object localObject;
    zzcv localzzcv;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          paramzzcn = (vc.a)zza;
          paramString = paramzzcn;
          try
          {
            f.b(parame);
            paramzzbi = parame;
          }
          finally
          {
            break label424;
          }
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
      paramLong = zzd;
      paramString = (vc.a)zzc;
      paramzzch = zzi;
      paramzzbi = zzj;
      localObject = zzh;
      localzzcv = (zzcv)zza;
      f.b(parame);
      parame = (e)localObject;
    }
    else
    {
      f.b(parame);
      localObject = zzb;
      zza = this;
      parame = paramString;
      zzh = parame;
      zzb = null;
      zzj = paramzzbi;
      zzi = paramzzch;
      zzc = localObject;
      zzd = paramLong;
      zzg = 1;
      if (((vc.a)localObject).b(paramzzcn) == locala) {
        break label439;
      }
      localzzcv = this;
      paramString = (String)localObject;
    }
    label312:
    label315:
    label424:
    try
    {
      if (i.a(paramzzch, zzch.zza))
      {
        i = 3;
      }
      else
      {
        if (!i.a(paramzzch, zzch.zzb)) {
          break label312;
        }
        i = 4;
      }
      break label315;
      i = 2;
      localObject = new com/google/android/recaptcha/internal/zzct;
      ((zzct)localObject).<init>(localzzcv, parame, paramLong, null, paramzzbi, paramzzch, null);
      zza = paramString;
      zzh = null;
      zzb = null;
      zzj = null;
      zzi = null;
      zzc = null;
      zzg = 2;
      paramzzbi = localzzcv.zzj(parame, i, (p)localObject, paramzzcn);
      if (paramzzbi == locala) {
        break label439;
      }
      paramzzcn = paramString;
      paramString = paramzzcn;
      paramzzbi = (zzdc)paramzzbi;
      paramzzcn.a(null);
      return paramzzbi;
    }
    finally {}
    paramString.a(null);
    throw paramzzcn;
    label439:
    return locala;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzcv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */