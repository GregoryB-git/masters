package com.google.android.recaptcha.internal;

import java.io.InputStream;

public final class zztu
  extends zznd
  implements zzoj
{
  private static final zztu zzb;
  private static volatile zzoq zzd;
  private int zze;
  private int zzf;
  private int zzg;
  
  static
  {
    zztu localzztu = new zztu();
    zzb = localzztu;
    zznd.zzI(zztu.class, localzztu);
  }
  
  public static zztu zzg(InputStream paramInputStream)
  {
    return (zztu)zznd.zzw(zzb, paramInputStream);
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
          return new zztt(null);
        }
        return new zztu();
      }
      return zznd.zzF(zzb, "\000\002\000\001\001\002\002\000\000\000\001ဌ\000\002ဌ\001", new Object[] { "zze", "zzf", "zzg" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final zztv zzi()
  {
    zztv localzztv1 = zztv.zzb(zzg);
    zztv localzztv2 = localzztv1;
    if (localzztv1 == null) {
      localzztv2 = zztv.zzk;
    }
    return localzztv2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zztu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */