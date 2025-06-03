package com.google.android.gms.internal.measurement;

import f;

final class zzcd
  extends zzcn
{
  private String zza;
  private zzcq zzb;
  private zzcp zzc;
  private byte zzd;
  
  public final zzcn zza(zzcp paramzzcp)
  {
    if (paramzzcp != null)
    {
      zzc = paramzzcp;
      return this;
    }
    throw new NullPointerException("Null filePurpose");
  }
  
  public final zzcn zza(zzcq paramzzcq)
  {
    if (paramzzcq != null)
    {
      zzb = paramzzcq;
      return this;
    }
    throw new NullPointerException("Null fileChecks");
  }
  
  public final zzcn zza(String paramString)
  {
    zza = paramString;
    return this;
  }
  
  public final zzcn zza(boolean paramBoolean)
  {
    zzd = ((byte)(byte)(zzd | 0x1));
    return this;
  }
  
  public final zzco zza()
  {
    if ((zzd == 1) && (zza != null) && (zzb != null) && (zzc != null)) {
      return new zzce(zza, false, zzb, null, null, zzc, null);
    }
    StringBuilder localStringBuilder = new StringBuilder();
    if (zza == null) {
      localStringBuilder.append(" fileOwner");
    }
    if ((0x1 & zzd) == 0) {
      localStringBuilder.append(" hasDifferentDmaOwner");
    }
    if (zzb == null) {
      localStringBuilder.append(" fileChecks");
    }
    if (zzc == null) {
      localStringBuilder.append(" filePurpose");
    }
    throw new IllegalStateException(f.j("Missing required properties:", String.valueOf(localStringBuilder)));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzcd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */