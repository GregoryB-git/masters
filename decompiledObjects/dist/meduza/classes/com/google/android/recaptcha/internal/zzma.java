package com.google.android.recaptcha.internal;

public final class zzma
  extends zzna
{
  private static final zzma zzd;
  private static volatile zzoq zze;
  private int zzf;
  private int zzg;
  private int zzh;
  private int zzi;
  private int zzj;
  private int zzk;
  private int zzl;
  private byte zzm = (byte)2;
  
  static
  {
    zzma localzzma = new zzma();
    zzd = localzzma;
    zznd.zzI(zzma.class, localzzma);
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
          return new zzlt(null);
        }
        return new zzma();
      }
      paramObject2 = zzlv.zza;
      zznh localzznh1 = zzlu.zza;
      zznh localzznh2 = zzly.zza;
      zznh localzznh3 = zzlz.zza;
      paramObject1 = zzlx.zza;
      zznh localzznh4 = zzlw.zza;
      return new zzou(zzd, "\001\006\000\001\001\006\006\000\000\000\001᠌\000\002᠌\001\003᠌\002\004᠌\003\005᠌\004\006᠌\005", new Object[] { "zzf", "zzg", paramObject2, "zzh", localzznh1, "zzi", localzznh2, "zzj", localzznh3, "zzk", paramObject1, "zzl", localzznh4 });
    }
    return Byte.valueOf(zzm);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzma
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */