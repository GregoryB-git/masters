package com.google.android.recaptcha.internal;

public final class zzqk
  extends zznd
  implements zzoj
{
  private static final zzqk zzb;
  private static volatile zzoq zzd;
  private int zze;
  private String zzf = "";
  private String zzg = "";
  private String zzh = "";
  private String zzi = "";
  private String zzj = "";
  private zzni zzk = zznd.zzy();
  
  static
  {
    zzqk localzzqk = new zzqk();
    zzb = localzzqk;
    zznd.zzI(zzqk.class, localzzqk);
  }
  
  public static zzqh zzf()
  {
    return (zzqh)zzb.zzq();
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
          return new zzqh(null);
        }
        return new zzqk();
      }
      return zznd.zzF(zzb, "\000\007\000\000\001\007\007\000\001\000\001\004\002Ȉ\003Ȉ\004Ȉ\005Ȉ\006Ȉ\007,", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk" });
    }
    return Byte.valueOf((byte)1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzqk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */