package com.google.android.recaptcha.internal;

public final class zzml
  extends zznd
  implements zzoj
{
  private static final zzml zzb;
  private static volatile zzoq zzd;
  private long zze;
  private int zzf;
  
  static
  {
    zzml localzzml = new zzml();
    zzb = localzzml;
    zznd.zzI(zzml.class, localzzml);
  }
  
  public static zzmj zzi()
  {
    return (zzmj)zzb.zzq();
  }
  
  public final int zzf()
  {
    return zzf;
  }
  
  public final long zzg()
  {
    return zze;
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
          return new zzmj(null);
        }
        return new zzml();
      }
      return new zzou(zzb, "\000\002\000\000\001\002\002\000\000\000\001\002\002\004", new Object[] { "zze", "zzf" });
    }
    return Byte.valueOf((byte)1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzml
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */