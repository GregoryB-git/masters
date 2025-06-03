package com.google.android.recaptcha.internal;

public final class zzto
  extends zznd
  implements zzoj
{
  private static final zzto zzb;
  private static volatile zzoq zzd;
  private String zze = "";
  private String zzf = "";
  private String zzg = "";
  private int zzh;
  private String zzi = "";
  private String zzj = "";
  private String zzk = "";
  
  static
  {
    zzto localzzto = new zzto();
    zzb = localzzto;
    zznd.zzI(zzto.class, localzzto);
  }
  
  public static zztn zzf()
  {
    return (zztn)zzb.zzq();
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
          return new zztn(null);
        }
        return new zzto();
      }
      return zznd.zzF(zzb, "\000\007\000\000\001\b\007\000\000\000\001Ȉ\002Ȉ\003Ȉ\004\f\006Ȉ\007Ȉ\bȈ", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk" });
    }
    return Byte.valueOf((byte)1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzto
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */