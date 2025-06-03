package com.google.android.recaptcha.internal;

public final class zzrv
  extends zznd
  implements zzoj
{
  private static final zzrv zzb;
  private static volatile zzoq zzd;
  private int zze;
  private zzrt zzf;
  private zzrt zzg;
  
  static
  {
    zzrv localzzrv = new zzrv();
    zzb = localzzrv;
    zznd.zzI(zzrv.class, localzzrv);
  }
  
  public static zzrv zzj(byte[] paramArrayOfByte)
  {
    return (zzrv)zznd.zzx(zzb, paramArrayOfByte);
  }
  
  public final zzrt zzf()
  {
    zzrt localzzrt1 = zzf;
    zzrt localzzrt2 = localzzrt1;
    if (localzzrt1 == null) {
      localzzrt2 = zzrt.zzg();
    }
    return localzzrt2;
  }
  
  public final zzrt zzg()
  {
    zzrt localzzrt1 = zzg;
    zzrt localzzrt2 = localzzrt1;
    if (localzzrt1 == null) {
      localzzrt2 = zzrt.zzg();
    }
    return localzzrt2;
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
          return new zzru(null);
        }
        return new zzrv();
      }
      return zznd.zzF(zzb, "\000\002\000\001\001\002\002\000\000\000\001ဉ\000\002ဉ\001", new Object[] { "zze", "zzf", "zzg" });
    }
    return Byte.valueOf((byte)1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzrv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */