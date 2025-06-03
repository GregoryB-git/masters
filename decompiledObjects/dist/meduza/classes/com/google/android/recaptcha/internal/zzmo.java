package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzmo
{
  public static final zzmo zza = new zzmo(true);
  private static volatile boolean zzc = false;
  private final Map zzd;
  
  public zzmo()
  {
    zzd = new HashMap();
  }
  
  public zzmo(boolean paramBoolean)
  {
    zzd = Collections.emptyMap();
  }
  
  public final zznc zza(zzoi paramzzoi, int paramInt)
  {
    paramzzoi = new zzmn(paramzzoi, paramInt);
    return (zznc)zzd.get(paramzzoi);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzmo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */