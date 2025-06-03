package com.google.android.gms.internal.auth;

public enum zzho
{
  private final zzhp zzt;
  
  static
  {
    zzho localzzho1 = new zzho("DOUBLE", 0, zzhp.zzd, 1);
    zza = localzzho1;
    zzho localzzho2 = new zzho("FLOAT", 1, zzhp.zzc, 5);
    zzb = localzzho2;
    Object localObject1 = zzhp.zzb;
    zzho localzzho3 = new zzho("INT64", 2, (zzhp)localObject1, 0);
    zzc = localzzho3;
    zzho localzzho4 = new zzho("UINT64", 3, (zzhp)localObject1, 0);
    zzd = localzzho4;
    Object localObject2 = zzhp.zza;
    zzho localzzho5 = new zzho("INT32", 4, (zzhp)localObject2, 0);
    zze = localzzho5;
    zzho localzzho6 = new zzho("FIXED64", 5, (zzhp)localObject1, 1);
    zzf = localzzho6;
    zzho localzzho7 = new zzho("FIXED32", 6, (zzhp)localObject2, 5);
    zzg = localzzho7;
    zzho localzzho8 = new zzho("BOOL", 7, zzhp.zze, 0);
    zzh = localzzho8;
    zzho localzzho9 = new zzho("STRING", 8, zzhp.zzf, 2);
    zzi = localzzho9;
    Object localObject3 = zzhp.zzi;
    zzho localzzho10 = new zzho("GROUP", 9, (zzhp)localObject3, 3);
    zzj = localzzho10;
    zzho localzzho11 = new zzho("MESSAGE", 10, (zzhp)localObject3, 2);
    zzk = localzzho11;
    zzho localzzho12 = new zzho("BYTES", 11, zzhp.zzg, 2);
    zzl = localzzho12;
    zzho localzzho13 = new zzho("UINT32", 12, (zzhp)localObject2, 0);
    zzm = localzzho13;
    zzho localzzho14 = new zzho("ENUM", 13, zzhp.zzh, 0);
    zzn = localzzho14;
    localObject3 = new zzho("SFIXED32", 14, (zzhp)localObject2, 5);
    zzo = (zzho)localObject3;
    zzho localzzho15 = new zzho("SFIXED64", 15, (zzhp)localObject1, 1);
    zzp = localzzho15;
    localObject2 = new zzho("SINT32", 16, (zzhp)localObject2, 0);
    zzq = (zzho)localObject2;
    localObject1 = new zzho("SINT64", 17, (zzhp)localObject1, 0);
    zzr = (zzho)localObject1;
    zzs = new zzho[] { localzzho1, localzzho2, localzzho3, localzzho4, localzzho5, localzzho6, localzzho7, localzzho8, localzzho9, localzzho10, localzzho11, localzzho12, localzzho13, localzzho14, localObject3, localzzho15, localObject2, localObject1 };
  }
  
  private zzho(zzhp paramzzhp, int paramInt1)
  {
    zzt = paramzzhp;
  }
  
  public final zzhp zza()
  {
    return zzt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzho
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */