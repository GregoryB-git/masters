package com.google.android.gms.internal.measurement;

final class zzce
  extends zzco
{
  private final String zzc;
  private final boolean zzd;
  private final zzcq zze;
  private final zzcc zzf;
  private final zzcb zzg;
  private final zzcp zzh;
  
  private zzce(String paramString, boolean paramBoolean, zzcq paramzzcq, zzcc paramzzcc, zzcb paramzzcb, zzcp paramzzcp)
  {
    zzc = paramString;
    zzd = paramBoolean;
    zze = paramzzcq;
    zzf = null;
    zzg = null;
    zzh = paramzzcp;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof zzco))
    {
      paramObject = (zzco)paramObject;
      if ((zzc.equals(((zzco)paramObject).zze())) && (zzd == ((zzco)paramObject).zzf()) && (zze.equals(((zzco)paramObject).zzc())))
      {
        Object localObject = zzf;
        if (localObject == null ? ((zzco)paramObject).zza() == null : localObject.equals(((zzco)paramObject).zza()))
        {
          localObject = zzg;
          if ((localObject == null ? ((zzco)paramObject).zzb() == null : localObject.equals(((zzco)paramObject).zzb())) && (zzh.equals(((zzco)paramObject).zzd()))) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = zzc.hashCode();
    int j;
    if (zzd) {
      j = 1231;
    } else {
      j = 1237;
    }
    int k = zze.hashCode();
    Object localObject = zzf;
    int m = 0;
    int n;
    if (localObject == null) {
      n = 0;
    } else {
      n = localObject.hashCode();
    }
    localObject = zzg;
    if (localObject != null) {
      m = localObject.hashCode();
    }
    return (((((i ^ 0xF4243) * 1000003 ^ j) * 1000003 ^ k) * 1000003 ^ n) * 1000003 ^ m) * 1000003 ^ zzh.hashCode();
  }
  
  public final String toString()
  {
    String str1 = zzc;
    boolean bool = zzd;
    String str2 = String.valueOf(zze);
    String str3 = String.valueOf(zzf);
    String str4 = String.valueOf(zzg);
    String str5 = String.valueOf(zzh);
    StringBuilder localStringBuilder = new StringBuilder("FileComplianceOptions{fileOwner=");
    localStringBuilder.append(str1);
    localStringBuilder.append(", hasDifferentDmaOwner=");
    localStringBuilder.append(bool);
    localStringBuilder.append(", fileChecks=");
    localStringBuilder.append(str2);
    localStringBuilder.append(", dataForwardingNotAllowedResolver=");
    localStringBuilder.append(str3);
    localStringBuilder.append(", multipleProductIdGroupsResolver=");
    localStringBuilder.append(str4);
    localStringBuilder.append(", filePurpose=");
    localStringBuilder.append(str5);
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }
  
  public final zzcc zza()
  {
    return zzf;
  }
  
  public final zzcb zzb()
  {
    return zzg;
  }
  
  public final zzcq zzc()
  {
    return zze;
  }
  
  public final zzcp zzd()
  {
    return zzh;
  }
  
  public final String zze()
  {
    return zzc;
  }
  
  public final boolean zzf()
  {
    return zzd;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzce
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */