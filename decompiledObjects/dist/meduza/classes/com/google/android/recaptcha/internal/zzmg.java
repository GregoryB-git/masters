package com.google.android.recaptcha.internal;

public final class zzmg
  extends zznd
  implements zzoj
{
  private static final zzmg zzb;
  private static volatile zzoq zzd;
  private int zze;
  private zznk zzf = zzot.zze();
  private String zzg = "";
  private long zzh;
  private long zzi;
  private double zzj;
  private zzle zzk = zzle.zzb;
  private String zzl = "";
  private byte zzm = (byte)2;
  
  static
  {
    zzmg localzzmg = new zzmg();
    zzb = localzzmg;
    zznd.zzI(zzmg.class, localzzmg);
  }
  
  public final Object zzh(int paramInt, Object paramObject1, Object paramObject2)
  {
    int i = paramInt - 1;
    if (i != 0)
    {
      paramInt = 1;
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4)
          {
            if (i != 5)
            {
              if (i != 6)
              {
                if (paramObject1 == null) {
                  paramInt = 0;
                }
                zzm = ((byte)paramInt);
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
          return new zzmd(null);
        }
        return new zzmg();
      }
      return new zzou(zzb, "\001\007\000\001\002\b\007\000\001\001\002Л\003ဈ\000\004ဃ\001\005ဂ\002\006က\003\007ည\004\bဈ\005", new Object[] { "zze", "zzf", zzmf.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl" });
    }
    return Byte.valueOf(zzm);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzmg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */