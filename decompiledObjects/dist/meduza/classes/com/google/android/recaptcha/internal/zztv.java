package com.google.android.recaptcha.internal;

public enum zztv
  implements zznf
{
  private final int zzm;
  
  static
  {
    zztv localzztv1 = new zztv("JS_CODE_UNSPECIFIED", 0, 0);
    zza = localzztv1;
    zztv localzztv2 = new zztv("JS_CODE_SUCCESS", 1, 1);
    zzb = localzztv2;
    zztv localzztv3 = new zztv("JS_NETWORK_ERROR", 2, 2);
    zzc = localzztv3;
    zztv localzztv4 = new zztv("JS_INTERNAL_ERROR", 3, 3);
    zzd = localzztv4;
    zztv localzztv5 = new zztv("JS_INVALID_SITE_KEY", 4, 4);
    zze = localzztv5;
    zztv localzztv6 = new zztv("JS_INVALID_SITE_KEY_TYPE", 5, 5);
    zzf = localzztv6;
    zztv localzztv7 = new zztv("JS_3P_APP_PACKAGE_NAME_NOT_ALLOWED", 6, 6);
    zzg = localzztv7;
    zztv localzztv8 = new zztv("JS_INVALID_ACTION", 7, 7);
    zzh = localzztv8;
    zztv localzztv9 = new zztv("JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED", 8, 8);
    zzi = localzztv9;
    zztv localzztv10 = new zztv("JS_PROGRAM_ERROR", 9, 9);
    zzj = localzztv10;
    zztv localzztv11 = new zztv("UNRECOGNIZED", 10, -1);
    zzk = localzztv11;
    zzl = new zztv[] { localzztv1, localzztv2, localzztv3, localzztv4, localzztv5, localzztv6, localzztv7, localzztv8, localzztv9, localzztv10, localzztv11 };
  }
  
  private zztv(int paramInt1)
  {
    zzm = paramInt1;
  }
  
  public static zztv zzb(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 9: 
      return zzj;
    case 8: 
      return zzi;
    case 7: 
      return zzh;
    case 6: 
      return zzg;
    case 5: 
      return zzf;
    case 4: 
      return zze;
    case 3: 
      return zzd;
    case 2: 
      return zzc;
    case 1: 
      return zzb;
    }
    return zza;
  }
  
  public final String toString()
  {
    return Integer.toString(zza());
  }
  
  public final int zza()
  {
    if (this != zzk) {
      return zzm;
    }
    throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zztv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */