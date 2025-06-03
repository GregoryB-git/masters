package com.google.android.recaptcha.internal;

public final class zzts
  extends zznd
  implements zzoj
{
  private static final zzts zzb;
  private static volatile zzoq zzd;
  private int zze;
  
  static
  {
    zzts localzzts = new zzts();
    zzb = localzzts;
    zznd.zzI(zzts.class, localzzts);
  }
  
  public static zzts zzg(byte[] paramArrayOfByte)
  {
    return (zzts)zznd.zzx(zzb, paramArrayOfByte);
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
          return new zztr(null);
        }
        return new zzts();
      }
      return zznd.zzF(zzb, "\000\001\000\000\001\001\001\000\000\000\001\f", new Object[] { "zze" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final zztv zzi()
  {
    zztv localzztv1 = zztv.zzb(zze);
    zztv localzztv2 = localzztv1;
    if (localzztv1 == null) {
      localzztv2 = zztv.zzk;
    }
    return localzztv2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzts
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */