package com.google.android.recaptcha.internal;

public final class zzue
  extends zznd
  implements zzoj
{
  private static final zzue zzb;
  private static volatile zzoq zzd;
  private int zze = 0;
  private Object zzf;
  
  static
  {
    zzue localzzue = new zzue();
    zzb = localzzue;
    zznd.zzI(zzue.class, localzzue);
  }
  
  public final zzle zzM()
  {
    if (zze == 3) {
      return (zzle)zzf;
    }
    return zzle.zzb;
  }
  
  public final String zzO()
  {
    if (zze == 4) {
      return (String)zzf;
    }
    return "";
  }
  
  public final String zzP()
  {
    if (zze == 12) {
      return (String)zzf;
    }
    return "";
  }
  
  public final boolean zzQ()
  {
    if (zze == 2) {
      return ((Boolean)zzf).booleanValue();
    }
    return false;
  }
  
  public final boolean zzR()
  {
    return zze == 1;
  }
  
  public final int zzS()
  {
    switch (zze)
    {
    default: 
      return 0;
    case 15: 
      return 15;
    case 14: 
      return 14;
    case 13: 
      return 13;
    case 12: 
      return 12;
    case 11: 
      return 11;
    case 10: 
      return 10;
    case 9: 
      return 9;
    case 8: 
      return 8;
    case 7: 
      return 7;
    case 6: 
      return 6;
    case 5: 
      return 5;
    case 4: 
      return 4;
    case 3: 
      return 3;
    case 2: 
      return 2;
    case 1: 
      return 1;
    }
    return 16;
  }
  
  public final double zzf()
  {
    if (zze == 11) {
      return ((Double)zzf).doubleValue();
    }
    return 0.0D;
  }
  
  public final float zzg()
  {
    if (zze == 10) {
      return ((Float)zzf).floatValue();
    }
    return 0.0F;
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
          return new zzud(null);
        }
        return new zzue();
      }
      return zznd.zzF(zzb, "\000\017\001\000\001\017\017\000\000\000\001>\000\002:\000\003=\000\004Ȼ\000\005B\000\006B\000\007>\000\bC\000\t6\000\n4\000\0133\000\fȻ\000\r:\000\016?\000\017?\000", new Object[] { "zzf", "zze" });
    }
    return Byte.valueOf((byte)1);
  }
  
  public final int zzi()
  {
    if (zze == 1) {
      return ((Integer)zzf).intValue();
    }
    return 0;
  }
  
  public final int zzj()
  {
    if (zze == 5) {
      return ((Integer)zzf).intValue();
    }
    return 0;
  }
  
  public final int zzk()
  {
    if (zze == 6) {
      return ((Integer)zzf).intValue();
    }
    return 0;
  }
  
  public final long zzl()
  {
    if (zze == 8) {
      return ((Long)zzf).longValue();
    }
    return 0L;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzue
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */