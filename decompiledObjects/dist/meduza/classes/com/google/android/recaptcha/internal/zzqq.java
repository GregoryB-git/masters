package com.google.android.recaptcha.internal;

public final class zzqq
  extends zznd
  implements zzoj
{
  private static final zzqq zzb;
  private static volatile zzoq zzd;
  private String zze = "";
  private String zzf = "";
  private int zzg;
  private String zzh = "";
  private String zzi = "";
  private int zzj;
  private int zzk;
  
  static
  {
    zzqq localzzqq = new zzqq();
    zzb = localzzqq;
    zznd.zzI(zzqq.class, localzzqq);
  }
  
  public static zzqo zzg()
  {
    return (zzqo)zzb.zzq();
  }
  
  public static zzqq zzj()
  {
    return zzb;
  }
  
  public final int zzf()
  {
    return zzg;
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
          return new zzqo(null);
        }
        return new zzqq();
      }
      return zznd.zzF(zzb, "\000\007\000\000\001\007\007\000\000\000\001Ȉ\002\004\003Ȉ\004\004\005Ȉ\006Ȉ\007\004", new Object[] { "zze", "zzg", "zzi", "zzj", "zzf", "zzh", "zzk" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final String zzk()
  {
    return zze;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzqq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */