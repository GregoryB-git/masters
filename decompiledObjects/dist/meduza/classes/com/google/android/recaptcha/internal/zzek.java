package com.google.android.recaptcha.internal;

import android.content.Context;

public final class zzek
{
  private final String zza;
  private String zzb;
  private String zzc;
  private final Context zzd;
  private final zzeo zze;
  private String zzf;
  private Integer zzg;
  private final int zzh;
  
  private zzek(zzek paramzzek)
  {
    this(zza, zzb, zzc, zzh, zzd, zze);
    zzf = zzf;
    zzg = zzg;
  }
  
  private zzek(String paramString1, String paramString2, String paramString3, int paramInt, Context paramContext, zzeo paramzzeo)
  {
    zza = paramString1;
    zzb = paramString2;
    zzc = paramString3;
    zzh = paramInt;
    zzd = paramContext;
    zze = paramzzeo;
  }
  
  public final zzek zza()
  {
    return new zzek(this);
  }
  
  public final zzek zzb(int paramInt)
  {
    zzg = Integer.valueOf(paramInt);
    return this;
  }
  
  public final zzek zzc(String paramString)
  {
    zzf = paramString;
    return this;
  }
  
  public final String zzd()
  {
    return zzc;
  }
  
  public final void zze(zztx paramzztx)
  {
    zze.zza(paramzztx);
  }
  
  public final zzen zzf(int paramInt)
  {
    String str1 = zzb;
    String str2 = zzc;
    String str3 = zzf;
    zzcc localzzcc = new zzcc();
    Context localContext = zzd;
    Integer localInteger = zzg;
    zzeo localzzeo = zze;
    return new zzen(paramInt, zza, zzh, str1, str2, str3, null, localzzeo, localzzcc, localContext, localInteger);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzek
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */