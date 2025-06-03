package com.google.android.recaptcha.internal;

public final class zzti
  extends zznd
  implements zzoj
{
  private static final zzti zzb;
  private static volatile zzoq zzd;
  private zznk zze = zznd.zzB();
  private int zzf;
  
  static
  {
    zzti localzzti = new zzti();
    zzb = localzzti;
    zznd.zzI(zzti.class, localzzti);
  }
  
  public static zztf zzf()
  {
    return (zztf)zzb.zzq();
  }
  
  private final void zzl()
  {
    zznk localzznk = zze;
    if (!localzznk.zzc()) {
      zze = zznd.zzC(localzznk);
    }
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
          return new zztf(null);
        }
        return new zzti();
      }
      return zznd.zzF(zzb, "\000\002\000\000\001\002\002\000\001\000\001\033\002\013", new Object[] { "zze", zzth.class, "zzf" });
    }
    return Byte.valueOf((byte)1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzti
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */