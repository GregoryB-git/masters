package com.google.android.recaptcha.internal;

import android.content.Context;
import b.a0;
import b.z;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest;
import com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder;
import com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken;
import com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider;
import com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest;
import com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder;
import ec.i;
import java.util.Timer;
import nc.d0;
import nc.j0;
import nc.r;
import rb.f;
import rb.h;
import ub.e;
import x6.b;

public final class zzan
{
  public r zza;
  private final d0 zzb;
  private final zzek zzc;
  private final StandardIntegrityManager zzd;
  private zzao zze;
  private long zzf;
  private final vc.a zzg;
  private boolean zzh;
  
  public zzan(Context paramContext, d0 paramd0, zzek paramzzek, StandardIntegrityManager paramStandardIntegrityManager, long paramLong)
  {
    zzb = paramd0;
    zzc = paramzzek;
    zzd = paramStandardIntegrityManager;
    zze = zzao.zza;
    zzg = a0.e();
  }
  
  private final Object zzi(e parame)
  {
    if ((parame instanceof zzag))
    {
      localObject = (zzag)parame;
      i = zzc;
      if ((i & 0x80000000) != 0)
      {
        zzc = (i + Integer.MIN_VALUE);
        parame = (e)localObject;
        break label47;
      }
    }
    parame = new zzag(this, parame);
    label47:
    Object localObject = zza;
    vb.a locala = vb.a.a;
    int i = zzc;
    if (i != 0)
    {
      if (i == 1)
      {
        f.b(localObject);
        parame = (e)localObject;
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(localObject);
      localObject = StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(zzf).build();
      localObject = zzbx.zza(zzd.prepareIntegrityToken((StandardIntegrityManager.PrepareIntegrityTokenRequest)localObject));
      zzc = 1;
      localObject = ((j0)localObject).await(parame);
      parame = (e)localObject;
      if (localObject == locala) {
        return locala;
      }
    }
    return parame;
  }
  
  private final Object zzj(String paramString, e parame)
  {
    if ((parame instanceof zzah))
    {
      localObject = (zzah)parame;
      i = zzc;
      if ((i & 0x80000000) != 0)
      {
        zzc = (i + Integer.MIN_VALUE);
        parame = (e)localObject;
        break label50;
      }
    }
    parame = new zzah(this, parame);
    label50:
    Object localObject = zza;
    vb.a locala = vb.a.a;
    int i = zzc;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          f.b(localObject);
          break label197;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
      paramString = zzd;
      f.b(localObject);
    }
    else
    {
      f.b(localObject);
      localObject = zzf();
      zzd = paramString;
      zzc = 1;
      localObject = ((j0)localObject).await(parame);
      if (localObject == locala) {
        break label205;
      }
    }
    paramString = zzbx.zza(((StandardIntegrityManager.StandardIntegrityTokenProvider)localObject).request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().setRequestHash(paramString).build()));
    zzd = null;
    zzc = 2;
    paramString = paramString.await(parame);
    localObject = paramString;
    if (paramString != locala) {
      label197:
      return ((StandardIntegrityManager.StandardIntegrityToken)localObject).token();
    }
    label205:
    return locala;
  }
  
  public final Object zzc(String paramString, e parame)
  {
    if ((parame instanceof zzaf))
    {
      localzzaf = (zzaf)parame;
      i = zzc;
      if ((i & 0x80000000) != 0)
      {
        zzc = (i + Integer.MIN_VALUE);
        break label48;
      }
    }
    zzaf localzzaf = new zzaf(this, parame);
    label48:
    Object localObject = zza;
    vb.a locala = vb.a.a;
    int i = zzc;
    String str;
    zzan localzzan;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3)
          {
            f.b(localObject);
            break label277;
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        paramString = zze;
        parame = zzd;
        f.b(localObject);
        localObject = parame;
        break label246;
      }
      str = zze;
      localzzan = zzd;
      parame = localzzan;
      paramString = str;
    }
    try
    {
      f.b(localObject);
      parame = localzzan;
      paramString = str;
      break label199;
      f.b(localObject);
      try
      {
        zzd = this;
        zze = paramString;
        zzc = 1;
        localObject = zzj(paramString, localzzaf);
        if (localObject == locala) {
          return locala;
        }
        parame = this;
        label199:
        localObject = (String)localObject;
        paramString = (String)localObject;
      }
      catch (Exception parame)
      {
        parame = this;
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    zzd = parame;
    zze = paramString;
    zzc = 2;
    localObject = parame;
    if (parame.zze(localzzaf) == locala) {
      return locala;
    }
    label246:
    zzd = null;
    zze = null;
    zzc = 3;
    localObject = ((zzan)localObject).zzj(paramString, localzzaf);
    if (localObject != locala)
    {
      label277:
      paramString = (String)localObject;
      return paramString;
    }
    return locala;
  }
  
  public final Object zzd(long paramLong, e parame)
  {
    zzf = paramLong;
    return h.a;
  }
  
  public final Object zze(e parame)
  {
    Object localObject1;
    if ((parame instanceof zzak))
    {
      localObject1 = (zzak)parame;
      i = zzd;
      if ((i & 0x80000000) != 0)
      {
        zzd = (i + Integer.MIN_VALUE);
        parame = (e)localObject1;
        break label47;
      }
    }
    parame = new zzak(this, parame);
    label47:
    Object localObject2 = zzb;
    vb.a locala = vb.a.a;
    int i = zzd;
    Object localObject3;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          f.b(localObject2);
          break label329;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
      localObject3 = (vc.a)zza;
      localObject1 = zze;
      f.b(localObject2);
    }
    else
    {
      f.b(localObject2);
      localObject3 = zzg;
      zze = this;
      zza = localObject3;
      zzd = 1;
      if (((vc.a)localObject3).b(parame) == locala) {
        break label344;
      }
      localObject1 = this;
    }
    try
    {
      if (!i.a(zze, zzao.zza))
      {
        parame = h.a;
        return parame;
      }
      zze = zzao.zzb;
      localObject2 = h.a;
      ((vc.a)localObject3).a(null);
      localObject3 = zzc;
      ((zzek)localObject3).zzc(((zzek)localObject3).zzd());
      ((zzek)localObject3).zzb(2);
      localObject3 = ((zzek)localObject3).zzf(38);
      zza = z.b();
      b.g0(zzb, null, new zzam((zzan)localObject1, (zzen)localObject3, null), 3);
      zze = null;
      zza = null;
      zzd = 2;
      if (!zzh)
      {
        new Timer().schedule(new zzai((zzan)localObject1), 28800000L, 28800000L);
        zzh = true;
      }
      if (h.a != locala) {
        label329:
        return h.a;
      }
    }
    finally
    {
      ((vc.a)localObject3).a(null);
    }
    label344:
    return locala;
  }
  
  public final r zzf()
  {
    r localr = zza;
    if (localr != null) {
      return localr;
    }
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzan
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */