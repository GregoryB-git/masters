package com.google.android.recaptcha.internal;

public final class zzmc
  extends zznd
  implements zzoj
{
  private static final zzmc zzb;
  private static volatile zzoq zzd;
  private int zze;
  private int zzf;
  private int zzg;
  private String zzh = "";
  private int zzi;
  
  static
  {
    zzmc localzzmc = new zzmc();
    zzb = localzzmc;
    zznd.zzI(zzmc.class, localzzmc);
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
          return new zzmb(null);
        }
        return new zzmc();
      }
      paramObject1 = zzlp.zza;
      return new zzou(zzb, "\001\004\000\001\001\004\004\000\000\000\001᠌\000\002᠌\001\003ဈ\002\004᠌\003", new Object[] { "zze", "zzf", paramObject1, "zzg", paramObject1, "zzh", "zzi", paramObject1 });
    }
    return Byte.valueOf((byte)1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzmc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */