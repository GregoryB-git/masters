package com.google.android.recaptcha.internal;

import java.util.List;

public final class zztz
  extends zznd
  implements zzoj
{
  private static final zztz zzb;
  private static volatile zzoq zzd;
  private zznk zze = zznd.zzB();
  
  static
  {
    zztz localzztz = new zztz();
    zzb = localzztz;
    zznd.zzI(zztz.class, localzztz);
  }
  
  public static zztz zzg(byte[] paramArrayOfByte)
  {
    return (zztz)zznd.zzx(zzb, paramArrayOfByte);
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
          return new zzty(null);
        }
        return new zztz();
      }
      return zznd.zzF(zzb, "\000\001\000\000\001\001\001\000\001\000\001\033", new Object[] { "zze", zzuf.class });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final List zzi()
  {
    return zze;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zztz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */