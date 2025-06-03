package com.google.android.recaptcha.internal;

public final class zzsi
  extends zznd
  implements zzoj
{
  private static final zzsi zzb;
  private static volatile zzoq zzd;
  private int zze;
  private String zzf = "";
  private String zzg = "";
  private String zzh = "";
  private String zzi = "";
  private String zzj = "";
  private zzsm zzk;
  private zzsg zzl;
  private zzsk zzm;
  private zzry zzn;
  
  static
  {
    zzsi localzzsi = new zzsi();
    zzb = localzzsi;
    zznd.zzI(zzsi.class, localzzsi);
  }
  
  public static zzsh zzf()
  {
    return (zzsh)zzb.zzq();
  }
  
  public static zzsi zzi(byte[] paramArrayOfByte)
  {
    return (zzsi)zznd.zzx(zzb, paramArrayOfByte);
  }
  
  @Deprecated
  public final String zzM()
  {
    return zzh;
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
          return new zzsh(null);
        }
        return new zzsi();
      }
      return zznd.zzF(zzb, "\000\t\000\001\001\t\t\000\000\000\001ለ\000\002ለ\001\003ለ\002\004ለ\003\005ለ\004\006ဉ\005\007ဉ\006\bဉ\007\tဉ\b", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn" });
    }
    return Byte.valueOf((byte)1);
  }
  
  @Deprecated
  public final String zzj()
  {
    return zzi;
  }
  
  public final String zzk()
  {
    return zzf;
  }
  
  @Deprecated
  public final String zzl()
  {
    return zzg;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzsi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */