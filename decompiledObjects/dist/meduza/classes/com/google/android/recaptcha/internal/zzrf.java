package com.google.android.recaptcha.internal;

import java.util.List;

public final class zzrf
  extends zznd
  implements zzoj
{
  private static final zzrf zzb;
  private static volatile zzoq zzd;
  private int zze;
  private zznk zzf = zznd.zzB();
  private zznk zzg = zznd.zzB();
  private zzqn zzh;
  
  static
  {
    zzrf localzzrf = new zzrf();
    zzb = localzzrf;
    zznd.zzI(zzrf.class, localzzrf);
  }
  
  public static zzrd zzi()
  {
    return (zzrd)zzb.zzq();
  }
  
  public static zzrf zzk(byte[] paramArrayOfByte)
  {
    return (zzrf)zznd.zzx(zzb, paramArrayOfByte);
  }
  
  public final int zzf()
  {
    return zzf.size();
  }
  
  public final int zzg()
  {
    return zzg.size();
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
          return new zzrd(null);
        }
        return new zzrf();
      }
      return zznd.zzF(zzb, "\000\003\000\001\001\003\003\000\002\000\001\033\002\033\003ဉ\000", new Object[] { "zze", "zzf", zzrc.class, "zzg", zzrr.class, "zzh" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final List zzl()
  {
    return zzf;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzrf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */