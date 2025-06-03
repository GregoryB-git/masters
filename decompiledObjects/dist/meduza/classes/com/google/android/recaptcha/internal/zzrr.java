package com.google.android.recaptcha.internal;

public final class zzrr
  extends zznd
  implements zzoj
{
  private static final zzrr zzb;
  private static volatile zzoq zzd;
  private int zze;
  private int zzf;
  private int zzg;
  private String zzh = "";
  private String zzi = "";
  private zzml zzj;
  private zzpj zzk;
  private int zzl;
  private zzqz zzm;
  private zznk zzn = zznd.zzB();
  
  static
  {
    zzrr localzzrr = new zzrr();
    zzb = localzzrr;
    zznd.zzI(zzrr.class, localzzrr);
  }
  
  public static zzrr zzg()
  {
    return zzb;
  }
  
  public static zzrr zzi(byte[] paramArrayOfByte)
  {
    return (zzrr)zznd.zzx(zzb, paramArrayOfByte);
  }
  
  public final Object zzh(int paramInt, Object paramObject1, Object paramObject2)
  {
    
    if (paramInt != 0)
    {
      if (paramInt != 2)
      {
        if (paramInt != 3)
        {
          if (paramInt != 4)
          {
            if (paramInt != 5)
            {
              if (paramInt != 6) {
                return null;
              }
              paramObject2 = zzd;
              paramObject1 = paramObject2;
              if (paramObject2 == null) {
                try
                {
                  paramObject2 = zzd;
                  paramObject1 = paramObject2;
                  if (paramObject2 == null)
                  {
                    paramObject1 = new com/google/android/recaptcha/internal/zzmy;
                    ((zzmy)paramObject1).<init>(zzb);
                    zzd = (zzoq)paramObject1;
                  }
                }
                finally {}
              }
              return paramObject1;
            }
            return zzb;
          }
          return new zzrp(null);
        }
        return new zzrr();
      }
      return zznd.zzF(zzb, "\000\t\000\001\001\013\t\000\001\000\001\004\003ဉ\000\004ဉ\001\005\f\007\033\b\f\tȈ\nȈ\013ဉ\002", new Object[] { "zze", "zzf", "zzj", "zzk", "zzl", "zzn", zzri.class, "zzg", "zzh", "zzi", "zzm" });
    }
    return Byte.valueOf((byte)1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzrr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */