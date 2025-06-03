package com.google.android.recaptcha.internal;

import android.webkit.JavascriptInterface;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import nc.r;
import rb.h;

public final class zzij
{
  private Long zzb;
  private final zzjh zzc = zzjh.zzb();
  
  public zzij(zzja paramzzja) {}
  
  private final void zzb()
  {
    if (zzb == null)
    {
      zzc.zzf();
      zzb = Long.valueOf(zzc.zza(TimeUnit.MILLISECONDS));
    }
  }
  
  public final Long zza()
  {
    return zzb;
  }
  
  @JavascriptInterface
  public final void zzlce(String paramString)
  {
    Object localObject = zza;
    if (zzqzzb == null)
    {
      localObject = zzja.zzo((zzja)localObject);
      if (localObject != null) {
        ((zzen)localObject).zza();
      }
      zzja.zzB(zza, null);
    }
    zzb();
    paramString = zzrc.zzl(zzbt.zza(paramString));
    localObject = zztx.zzi();
    ((zztw)localObject).zzf(paramString);
    paramString = (zztx)((zzmx)localObject).zzi();
    zzja.zzn(zza).zze(paramString);
  }
  
  @JavascriptInterface
  public final void zzlsm(String paramString)
  {
    zzb();
    zztw localzztw = zztx.zzi();
    localzztw.zzq(zzrr.zzi(zzbt.zza(paramString)));
    paramString = (zztx)localzztw.zzi();
    zzja.zzn(zza).zze(paramString);
  }
  
  @JavascriptInterface
  public final void zzoid(String paramString)
  {
    zzb();
    paramString = zzts.zzg(zzbt.zza(paramString));
    paramString.zzi().name();
    if (paramString.zzi() == zztv.zzb)
    {
      zza.zzA().hashCode();
      if (!zza.zzA().i0(h.a)) {
        zza.zzA().hashCode();
      }
      return;
    }
    paramString.zzi().name();
    int i = zzbd.zza;
    paramString = zzbc.zza(paramString.zzi());
    zza.zzA().hashCode();
    zza.zzA().h0(paramString);
  }
  
  @JavascriptInterface
  public final void zzrp(String paramString)
  {
    zzb();
    zzfo localzzfo1 = zza.zzb;
    zzfo localzzfo2 = localzzfo1;
    if (localzzfo1 == null) {
      localzzfo2 = null;
    }
    localzzfo2.zza(paramString);
  }
  
  @JavascriptInterface
  public final void zzscd(String paramString)
  {
    zzb();
    paramString = zzsi.zzi(zzbt.zza(paramString));
    paramString.toString();
    r localr = (r)zzja.zzz(zza).remove(paramString.zzk());
    if (localr != null) {
      localr.i0(paramString);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzij
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */