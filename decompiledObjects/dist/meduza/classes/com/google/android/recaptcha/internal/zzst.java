package com.google.android.recaptcha.internal;

public final class zzst
  extends zznd
  implements zzoj
{
  private static final zzst zzb;
  private static volatile zzoq zzd;
  private int zze;
  private String zzf = "";
  private String zzg = "";
  
  static
  {
    zzst localzzst = new zzst();
    zzb = localzzst;
    zznd.zzI(zzst.class, localzzst);
  }
  
  public final String zzg()
  {
    return zzf;
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
          return new zzss(null);
        }
        return new zzst();
      }
      return zznd.zzF(zzb, "\000\002\000\001\001\002\002\000\000\000\001ለ\000\002ለ\001", new Object[] { "zze", "zzf", "zzg" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final String zzi()
  {
    return zzg;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzst
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */