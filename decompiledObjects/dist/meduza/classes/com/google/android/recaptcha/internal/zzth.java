package com.google.android.recaptcha.internal;

public final class zzth
  extends zznd
  implements zzoj
{
  private static final zzth zzb;
  private static volatile zzoq zzd;
  private int zze = 0;
  private Object zzf;
  
  static
  {
    zzth localzzth = new zzth();
    zzb = localzzth;
    zznd.zzI(zzth.class, localzzth);
  }
  
  public static zztg zzf()
  {
    return (zztg)zzb.zzq();
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
          return new zztg(null);
        }
        return new zzth();
      }
      return zznd.zzF(zzb, "\000\013\001\000\001\013\013\000\000\000\001:\000\002=\000\003Ȼ\000\004B\000\005B\000\006>\000\007C\000\b6\000\t4\000\n3\000\013Ȼ\000", new Object[] { "zzf", "zze" });
    }
    return Byte.valueOf((byte)1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzth
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */