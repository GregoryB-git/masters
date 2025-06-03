package com.google.android.recaptcha.internal;

public final class zzqn
  extends zznd
  implements zzoj
{
  private static final zzqn zzb;
  private static volatile zzoq zzd;
  private zzle zze;
  private String zzf;
  private zzle zzg;
  private String zzh;
  private String zzi;
  private zzle zzj;
  private String zzk;
  private zzle zzl;
  
  static
  {
    zzqn localzzqn = new zzqn();
    zzb = localzzqn;
    zznd.zzI(zzqn.class, localzzqn);
  }
  
  private zzqn()
  {
    zzle localzzle = zzle.zzb;
    zze = localzzle;
    zzf = "";
    zzg = localzzle;
    zzh = "";
    zzi = "";
    zzj = localzzle;
    zzk = "";
    zzl = localzzle;
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
          return new zzql(null);
        }
        return new zzqn();
      }
      return zznd.zzF(zzb, "\000\b\000\000\001\b\b\000\000\000\001\n\002Ȉ\003\n\004Ȉ\005Ȉ\006\n\007Ȉ\b\n", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl" });
    }
    return Byte.valueOf((byte)1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzqn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */