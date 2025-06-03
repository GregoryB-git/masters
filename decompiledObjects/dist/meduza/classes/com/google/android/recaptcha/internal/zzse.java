package com.google.android.recaptcha.internal;

public final class zzse
  extends zznd
  implements zzoj
{
  private static final zzse zzb;
  private static volatile zzoq zzd;
  private zzle zze;
  private String zzf;
  private long zzg;
  private zzle zzh;
  private String zzi;
  private String zzj;
  
  static
  {
    zzse localzzse = new zzse();
    zzb = localzzse;
    zznd.zzI(zzse.class, localzzse);
  }
  
  private zzse()
  {
    zzle localzzle = zzle.zzb;
    zze = localzzle;
    zzf = "";
    zzh = localzzle;
    zzi = "";
    zzj = "";
  }
  
  public static zzse zzk()
  {
    return zzb;
  }
  
  public final long zzf()
  {
    return zzg;
  }
  
  public final zzle zzg()
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
          return new zzsd(null);
        }
        return new zzse();
      }
      return zznd.zzF(zzb, "\000\006\000\000\001\006\006\000\000\000\001\n\002Ȉ\003\002\004\n\005Ȉ\006Ȉ", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final zzle zzi()
  {
    return zze;
  }
  
  public final String zzl()
  {
    return zzf;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */