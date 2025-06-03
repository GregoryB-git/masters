package com.google.android.recaptcha.internal;

import java.util.List;

public final class zzsr
  extends zznd
  implements zzoj
{
  private static final zzsr zzb;
  private static volatile zzoq zzd;
  private int zze;
  private String zzf = "";
  private long zzg;
  private int zzh;
  private zznk zzi = zznd.zzB();
  private zzle zzj = zzle.zzb;
  private String zzk = "";
  private String zzl = "";
  
  static
  {
    zzsr localzzsr = new zzsr();
    zzb = localzzsr;
    zznd.zzI(zzsr.class, localzzsr);
  }
  
  public static zzsr zzi()
  {
    return zzb;
  }
  
  public final zzle zzf()
  {
    return zzj;
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
          return new zzsq(null);
        }
        return new zzsr();
      }
      return zznd.zzF(zzb, "\000\007\000\001\001\b\007\000\001\000\001ለ\000\002ဂ\001\004ဌ\002\005\033\006ည\003\007ለ\004\bለ\005", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", zzst.class, "zzj", "zzk", "zzl" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final String zzj()
  {
    return zzf;
  }
  
  public final List zzk()
  {
    return zzi;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzsr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */