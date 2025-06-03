package com.google.android.recaptcha.internal;

public enum zzpw
{
  private final zzpx zzt;
  
  static
  {
    zzpw localzzpw1 = new zzpw("DOUBLE", 0, zzpx.zzd, 1);
    zza = localzzpw1;
    zzpw localzzpw2 = new zzpw("FLOAT", 1, zzpx.zzc, 5);
    zzb = localzzpw2;
    Object localObject1 = zzpx.zzb;
    zzpw localzzpw3 = new zzpw("INT64", 2, (zzpx)localObject1, 0);
    zzc = localzzpw3;
    zzpw localzzpw4 = new zzpw("UINT64", 3, (zzpx)localObject1, 0);
    zzd = localzzpw4;
    Object localObject2 = zzpx.zza;
    zzpw localzzpw5 = new zzpw("INT32", 4, (zzpx)localObject2, 0);
    zze = localzzpw5;
    zzpw localzzpw6 = new zzpw("FIXED64", 5, (zzpx)localObject1, 1);
    zzf = localzzpw6;
    zzpw localzzpw7 = new zzpw("FIXED32", 6, (zzpx)localObject2, 5);
    zzg = localzzpw7;
    zzpw localzzpw8 = new zzpw("BOOL", 7, zzpx.zze, 0);
    zzh = localzzpw8;
    zzpw localzzpw9 = new zzpw("STRING", 8, zzpx.zzf, 2);
    zzi = localzzpw9;
    Object localObject3 = zzpx.zzi;
    zzpw localzzpw10 = new zzpw("GROUP", 9, (zzpx)localObject3, 3);
    zzj = localzzpw10;
    zzpw localzzpw11 = new zzpw("MESSAGE", 10, (zzpx)localObject3, 2);
    zzk = localzzpw11;
    localObject3 = new zzpw("BYTES", 11, zzpx.zzg, 2);
    zzl = (zzpw)localObject3;
    zzpw localzzpw12 = new zzpw("UINT32", 12, (zzpx)localObject2, 0);
    zzm = localzzpw12;
    zzpw localzzpw13 = new zzpw("ENUM", 13, zzpx.zzh, 0);
    zzn = localzzpw13;
    zzpw localzzpw14 = new zzpw("SFIXED32", 14, (zzpx)localObject2, 5);
    zzo = localzzpw14;
    zzpw localzzpw15 = new zzpw("SFIXED64", 15, (zzpx)localObject1, 1);
    zzp = localzzpw15;
    localObject2 = new zzpw("SINT32", 16, (zzpx)localObject2, 0);
    zzq = (zzpw)localObject2;
    localObject1 = new zzpw("SINT64", 17, (zzpx)localObject1, 0);
    zzr = (zzpw)localObject1;
    zzs = new zzpw[] { localzzpw1, localzzpw2, localzzpw3, localzzpw4, localzzpw5, localzzpw6, localzzpw7, localzzpw8, localzzpw9, localzzpw10, localzzpw11, localObject3, localzzpw12, localzzpw13, localzzpw14, localzzpw15, localObject2, localObject1 };
  }
  
  private zzpw(zzpx paramzzpx, int paramInt1)
  {
    zzt = paramzzpx;
  }
  
  public final zzpx zza()
  {
    return zzt;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzpw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */