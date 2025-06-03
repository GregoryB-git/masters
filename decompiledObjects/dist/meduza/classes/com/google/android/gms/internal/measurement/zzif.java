package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import n7.e;

public final class zzif
{
  public final String zza;
  public final Uri zzb;
  public final String zzc;
  public final String zzd;
  public final boolean zze;
  public final boolean zzf;
  public final boolean zzg;
  public final e<Context, Boolean> zzh;
  private final boolean zzi;
  
  public zzif(Uri paramUri)
  {
    this(null, paramUri, "", "", false, false, false, false, null);
  }
  
  private zzif(String paramString1, Uri paramUri, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, e<Context, Boolean> parame)
  {
    zza = paramString1;
    zzb = paramUri;
    zzc = paramString2;
    zzd = paramString3;
    zze = paramBoolean1;
    zzf = paramBoolean2;
    zzi = paramBoolean3;
    zzg = paramBoolean4;
    zzh = parame;
  }
  
  public final zzhx<Double> zza(String paramString, double paramDouble)
  {
    return zzhx.zza(this, paramString, Double.valueOf(-3.0D), true);
  }
  
  public final zzhx<Long> zza(String paramString, long paramLong)
  {
    return zzhx.zza(this, paramString, Long.valueOf(paramLong), true);
  }
  
  public final zzhx<String> zza(String paramString1, String paramString2)
  {
    return zzhx.zza(this, paramString1, paramString2, true);
  }
  
  public final zzhx<Boolean> zza(String paramString, boolean paramBoolean)
  {
    return zzhx.zza(this, paramString, Boolean.valueOf(paramBoolean), true);
  }
  
  public final zzif zza()
  {
    return new zzif(zza, zzb, zzc, zzd, zze, zzf, true, zzg, zzh);
  }
  
  public final zzif zzb()
  {
    if (zzc.isEmpty())
    {
      e locale = zzh;
      if (locale == null) {
        return new zzif(zza, zzb, zzc, zzd, true, zzf, zzi, zzg, locale);
      }
      throw new IllegalStateException("Cannot skip gservices both always and conditionally");
    }
    throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzif
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */