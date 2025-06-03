package com.google.android.recaptcha.internal;

public final class zzmf
  extends zznd
  implements zzoj
{
  private static final zzmf zzb;
  private static volatile zzoq zzd;
  private int zze;
  private String zzf = "";
  private boolean zzg;
  private byte zzh = (byte)2;
  
  static
  {
    zzmf localzzmf = new zzmf();
    zzb = localzzmf;
    zznd.zzI(zzmf.class, localzzmf);
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
                zzh = ((byte)paramInt);
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
          return new zzme(null);
        }
        return new zzmf();
      }
      return new zzou(zzb, "\001\002\000\001\001\002\002\000\000\002\001ᔈ\000\002ᔇ\001", new Object[] { "zze", "zzf", "zzg" });
    }
    return Byte.valueOf(zzh);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzmf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */