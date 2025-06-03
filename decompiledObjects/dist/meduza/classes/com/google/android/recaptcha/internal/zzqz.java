package com.google.android.recaptcha.internal;

public final class zzqz
  extends zznd
  implements zzoj
{
  private static final zzqz zzb;
  private static volatile zzoq zzd;
  private int zze;
  private String zzf = "";
  private int zzg;
  private String zzh = "";
  private int zzi;
  private String zzj = "";
  private int zzk;
  
  static
  {
    zzqz localzzqz = new zzqz();
    zzb = localzzqz;
    zznd.zzI(zzqz.class, localzzqz);
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
          return new zzqx(null);
        }
        return new zzqz();
      }
      return zznd.zzF(zzb, "\000\007\000\000\001\007\007\000\000\000\001\004\002Ȉ\003\004\004Ȉ\005\004\006Ȉ\007\004", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk" });
    }
    return Byte.valueOf((byte)1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzqz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */