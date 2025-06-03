package com.google.android.recaptcha.internal;

public final class zzls
  extends zzna
{
  private static final zzls zzd;
  private static volatile zzoq zze;
  private int zzf;
  private boolean zzg;
  private zzma zzh;
  private boolean zzi;
  private zzmc zzj;
  private zznk zzk = zzot.zze();
  private byte zzl = (byte)2;
  
  static
  {
    zzls localzzls = new zzls();
    zzd = localzzls;
    zznd.zzI(zzls.class, localzzls);
  }
  
  public static zzls zzg()
  {
    return zzd;
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
                zzl = ((byte)paramInt);
                return null;
              }
              paramObject2 = zze;
              paramObject1 = paramObject2;
              if (paramObject2 == null) {
                try
                {
                  paramObject2 = zze;
                  paramObject1 = paramObject2;
                  if (paramObject2 == null)
                  {
                    paramObject1 = new com/google/android/recaptcha/internal/zzmy;
                    ((zzmy)paramObject1).<init>(zzd);
                    zze = (zzoq)paramObject1;
                  }
                }
                finally {}
              }
              return paramObject1;
            }
            return zzd;
          }
          return new zzlr(null);
        }
        return new zzls();
      }
      return new zzou(zzd, "\001\005\000\001\001ϧ\005\000\001\002\001ဇ\000\002ᐉ\001\003ဇ\002\004ဉ\003ϧЛ", new Object[] { "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzmg.class });
    }
    return Byte.valueOf(zzl);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzls
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */