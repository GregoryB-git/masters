package com.google.android.gms.internal.auth;

import android.net.Uri;

public final class zzcz
{
  public final Uri zza;
  public final String zzb;
  public final String zzc;
  public final boolean zzd;
  public final boolean zze;
  
  public zzcz(Uri paramUri)
  {
    this(null, paramUri, "", "", false, false, false, false, null);
  }
  
  private zzcz(String paramString1, Uri paramUri, String paramString2, String paramString3, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, zzdg paramzzdg)
  {
    zza = paramUri;
    zzb = "";
    zzc = "";
    zzd = paramBoolean1;
    zze = paramBoolean3;
  }
  
  public final zzcz zza()
  {
    return new zzcz(null, zza, zzb, zzc, zzd, false, true, false, null);
  }
  
  public final zzcz zzb()
  {
    if (zzb.isEmpty()) {
      return new zzcz(null, zza, zzb, zzc, true, false, zze, false, null);
    }
    throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
  }
  
  public final zzdc zzc(String paramString, double paramDouble)
  {
    return new zzcx(this, paramString, Double.valueOf(0.0D), true);
  }
  
  public final zzdc zzd(String paramString, long paramLong)
  {
    return new zzcv(this, paramString, Long.valueOf(paramLong), true);
  }
  
  public final zzdc zze(String paramString, boolean paramBoolean)
  {
    return new zzcw(this, paramString, Boolean.valueOf(paramBoolean), true);
  }
  
  public final zzdc zzf(String paramString, Object paramObject, zzhy paramzzhy)
  {
    return new zzcy(this, "getTokenRefactor__blocked_packages", paramObject, true, paramzzhy);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzcz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */