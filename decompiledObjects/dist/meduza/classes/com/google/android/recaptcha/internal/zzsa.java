package com.google.android.recaptcha.internal;

public final class zzsa
  extends zznd
  implements zzoj
{
  private static final zzsa zzb;
  private static volatile zzoq zzd;
  private zzle zze = zzle.zzb;
  
  static
  {
    zzsa localzzsa = new zzsa();
    zzb = localzzsa;
    zznd.zzI(zzsa.class, localzzsa);
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
          return new zzrz(null);
        }
        return new zzsa();
      }
      return zznd.zzF(zzb, "\000\001\000\000\001\001\001\000\000\000\001\n", new Object[] { "zze" });
    }
    return Byte.valueOf((byte)1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzsa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */