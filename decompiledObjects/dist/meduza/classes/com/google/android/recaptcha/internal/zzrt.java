package com.google.android.recaptcha.internal;

import java.util.List;

public final class zzrt
  extends zznd
  implements zzoj
{
  private static final zzrt zzb;
  private static volatile zzoq zzd;
  private zznk zze = zznd.zzB();
  
  static
  {
    zzrt localzzrt = new zzrt();
    zzb = localzzrt;
    zznd.zzI(zzrt.class, localzzrt);
  }
  
  public static zzrt zzg()
  {
    return zzb;
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
          return new zzrs(null);
        }
        return new zzrt();
      }
      return zznd.zzF(zzb, "\000\001\000\000\001\001\001\000\001\000\001Ț", new Object[] { "zze" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final List zzi()
  {
    return zze;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzrt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */