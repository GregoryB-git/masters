package com.google.android.recaptcha.internal;

import java.util.List;

public final class zzub
  extends zznd
  implements zzoj
{
  private static final zzub zzb;
  private static volatile zzoq zzd;
  private int zze;
  private String zzf = "";
  private zzni zzg = zznd.zzy();
  private zznj zzh = zznd.zzA();
  private zztl zzi;
  
  static
  {
    zzub localzzub = new zzub();
    zzb = localzzub;
    zznd.zzI(zzub.class, localzzub);
  }
  
  public static zzub zzi(byte[] paramArrayOfByte)
  {
    return (zzub)zznd.zzx(zzb, paramArrayOfByte);
  }
  
  public final zztl zzf()
  {
    zztl localzztl1 = zzi;
    zztl localzztl2 = localzztl1;
    if (localzztl1 == null) {
      localzztl2 = zztl.zzg();
    }
    return localzztl2;
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
          return new zzua(null);
        }
        return new zzub();
      }
      return zznd.zzF(zzb, "\000\004\000\001\001\004\004\000\002\000\001Ȉ\002'\003%\004ဉ\000", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final String zzj()
  {
    return zzf;
  }
  
  public final List zzk()
  {
    return zzh;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzub
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */