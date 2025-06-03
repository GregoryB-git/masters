package com.google.android.recaptcha.internal;

public final class zzrl
  extends zznd
  implements zzoj
{
  private static final zzrl zzb;
  private static volatile zzoq zzd;
  private int zze;
  private zzml zzf;
  private zzpj zzg;
  private zzml zzh;
  private zzpj zzi;
  
  static
  {
    zzrl localzzrl = new zzrl();
    zzb = localzzrl;
    zznd.zzI(zzrl.class, localzzrl);
  }
  
  public static zzrj zzf()
  {
    return (zzrj)zzb.zzq();
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
          return new zzrj(null);
        }
        return new zzrl();
      }
      return zznd.zzF(zzb, "\000\004\000\001\001\004\004\000\000\000\001ဉ\000\002ဉ\001\003ဉ\002\004ဉ\003", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
    }
    return Byte.valueOf((byte)1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzrl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */