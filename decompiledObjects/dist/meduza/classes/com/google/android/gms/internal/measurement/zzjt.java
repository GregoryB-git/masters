package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzjt
{
  public static final zzjt zza = new zzjt(true);
  private static volatile boolean zzb = false;
  private static volatile zzjt zzc;
  private final Map<zza, zzkg.zzd<?, ?>> zzd;
  
  public zzjt()
  {
    zzd = new HashMap();
  }
  
  private zzjt(boolean paramBoolean)
  {
    zzd = Collections.emptyMap();
  }
  
  public static zzjt zza()
  {
    zzjt localzzjt = zzc;
    if (localzzjt != null) {
      return localzzjt;
    }
    try
    {
      localzzjt = zzc;
      if (localzzjt != null) {
        return localzzjt;
      }
      localzzjt = zzkf.zza(zzjt.class);
      zzc = localzzjt;
      return localzzjt;
    }
    finally {}
  }
  
  public final <ContainingType extends zzlm> zzkg.zzd<ContainingType, ?> zza(ContainingType paramContainingType, int paramInt)
  {
    return (zzkg.zzd)zzd.get(new zza(paramContainingType, paramInt));
  }
  
  public static final class zza
  {
    private final Object zza;
    private final int zzb;
    
    public zza(Object paramObject, int paramInt)
    {
      zza = paramObject;
      zzb = paramInt;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof zza)) {
        return false;
      }
      paramObject = (zza)paramObject;
      return (zza == zza) && (zzb == zzb);
    }
    
    public final int hashCode()
    {
      return System.identityHashCode(zza) * 65535 + zzb;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzjt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */