package com.google.android.gms.internal.measurement;

public enum zzng
{
  private final zznj zzt;
  private final int zzu;
  
  static
  {
    zzng localzzng1 = new zzng("DOUBLE", 0, zznj.zzd, 1);
    zza = localzzng1;
    zzng localzzng2 = new zzng("FLOAT", 1, zznj.zzc, 5);
    zzb = localzzng2;
    Object localObject1 = zznj.zzb;
    zzng localzzng3 = new zzng("INT64", 2, (zznj)localObject1, 0);
    zzc = localzzng3;
    zzng localzzng4 = new zzng("UINT64", 3, (zznj)localObject1, 0);
    zzd = localzzng4;
    Object localObject2 = zznj.zza;
    zzng localzzng5 = new zzng("INT32", 4, (zznj)localObject2, 0);
    zze = localzzng5;
    zzng localzzng6 = new zzng("FIXED64", 5, (zznj)localObject1, 1);
    zzf = localzzng6;
    zzng localzzng7 = new zzng("FIXED32", 6, (zznj)localObject2, 5);
    zzg = localzzng7;
    zzng localzzng8 = new zzng("BOOL", 7, zznj.zze, 0);
    zzh = localzzng8;
    zznf localzznf = new zznf("STRING", 8, zznj.zzf, 2, null);
    zzi = localzznf;
    Object localObject3 = zznj.zzi;
    zzni localzzni = new zzni("GROUP", 9, (zznj)localObject3, 3, null);
    zzj = localzzni;
    zznh localzznh = new zznh("MESSAGE", 10, (zznj)localObject3, 2, null);
    zzk = localzznh;
    zznk localzznk = new zznk("BYTES", 11, zznj.zzg, 2, null);
    zzl = localzznk;
    zzng localzzng9 = new zzng("UINT32", 12, (zznj)localObject2, 0);
    zzm = localzzng9;
    localObject3 = new zzng("ENUM", 13, zznj.zzh, 0);
    zzn = (zzng)localObject3;
    zzng localzzng10 = new zzng("SFIXED32", 14, (zznj)localObject2, 5);
    zzo = localzzng10;
    zzng localzzng11 = new zzng("SFIXED64", 15, (zznj)localObject1, 1);
    zzp = localzzng11;
    localObject2 = new zzng("SINT32", 16, (zznj)localObject2, 0);
    zzq = (zzng)localObject2;
    localObject1 = new zzng("SINT64", 17, (zznj)localObject1, 0);
    zzr = (zzng)localObject1;
    zzs = new zzng[] { localzzng1, localzzng2, localzzng3, localzzng4, localzzng5, localzzng6, localzzng7, localzzng8, localzznf, localzzni, localzznh, localzznk, localzzng9, localObject3, localzzng10, localzzng11, localObject2, localObject1 };
  }
  
  private zzng(zznj paramzznj, int paramInt)
  {
    zzt = paramzznj;
    zzu = paramInt;
  }
  
  public final int zza()
  {
    return zzu;
  }
  
  public final zznj zzb()
  {
    return zzt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzng
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */