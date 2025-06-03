package com.google.android.recaptcha.internal;

public final class zztx
  extends zznd
  implements zzoj
{
  private static final zztx zzb;
  private static volatile zzoq zzd;
  private int zze = 0;
  private Object zzf;
  
  static
  {
    zztx localzztx = new zztx();
    zzb = localzztx;
    zznd.zzI(zztx.class, localzztx);
  }
  
  public static zztw zzi()
  {
    return (zztw)zzb.zzq();
  }
  
  public static zztx zzk(byte[] paramArrayOfByte)
  {
    return (zztx)zznd.zzx(zzb, paramArrayOfByte);
  }
  
  public final int zzN()
  {
    int i = zze;
    if (i != 0)
    {
      int j = 1;
      if (i != 1)
      {
        j = 2;
        if (i != 2) {
          return 0;
        }
      }
      return j;
    }
    return 3;
  }
  
  public final zzrc zzf()
  {
    if (zze == 1) {
      return (zzrc)zzf;
    }
    return zzrc.zzk();
  }
  
  public final zzrr zzg()
  {
    if (zze == 2) {
      return (zzrr)zzf;
    }
    return zzrr.zzg();
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
          return new zztw(null);
        }
        return new zztx();
      }
      return zznd.zzF(zzb, "\000\002\001\000\001\002\002\000\000\000\001<\000\002<\000", new Object[] { "zzf", "zze", zzrc.class, zzrr.class });
    }
    return Byte.valueOf((byte)1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zztx
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */