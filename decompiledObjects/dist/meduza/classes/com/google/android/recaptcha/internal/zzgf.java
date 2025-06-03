package com.google.android.recaptcha.internal;

import java.util.HashMap;
import java.util.Map;

public final class zzgf
{
  private final zzge zza;
  private final HashMap zzb;
  private final zzfw zzc;
  private final zzcg zzd;
  
  public zzgf(zzfw paramzzfw, zzcg paramzzcg, zzbo paramzzbo)
  {
    zzc = paramzzfw;
    zzd = paramzzcg;
    paramzzfw = new zzge();
    zza = paramzzfw;
    paramzzcg = new HashMap();
    zzb = paramzzcg;
    paramzzfw.zzd(173, paramzzcg);
  }
  
  public final zzge zza()
  {
    return zza;
  }
  
  public final void zzb()
  {
    zza.zzc();
    HashMap localHashMap = zzb;
    zza.zzd(173, localHashMap);
  }
  
  public final zzcg zzc()
  {
    return zzd;
  }
  
  public final zzfw zzd()
  {
    return zzc;
  }
  
  public final void zze(int paramInt, Object paramObject)
  {
    zzb.put(Integer.valueOf(paramInt - 2), paramObject);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzgf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */