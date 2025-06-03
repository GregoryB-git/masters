package com.google.android.recaptcha.internal;

public final class zzsx
  extends zznd
  implements zzoj
{
  private static final zzsx zzb;
  private static volatile zzoq zzd;
  private int zze;
  private String zzf = "";
  private String zzg = "";
  private zzni zzh = zznd.zzy();
  private int zzi;
  private int zzj;
  
  static
  {
    zzsx localzzsx = new zzsx();
    zzb = localzzsx;
    zznd.zzI(zzsx.class, localzzsx);
  }
  
  public static zzsv zzf()
  {
    return (zzsv)zzb.zzq();
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
          return new zzsv(null);
        }
        return new zzsx();
      }
      paramObject1 = zzsw.zza;
      return zznd.zzF(zzb, "\001\005\000\001\001\005\005\000\001\000\001ဈ\000\002ဈ\001\003'\004᠌\002\005င\003", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", paramObject1, "zzj" });
    }
    return Byte.valueOf((byte)1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzsx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */