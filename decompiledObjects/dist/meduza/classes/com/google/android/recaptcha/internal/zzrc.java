package com.google.android.recaptcha.internal;

public final class zzrc
  extends zznd
  implements zzoj
{
  private static final zzrc zzb;
  private static volatile zzoq zzd;
  private int zze;
  private int zzf = 0;
  private Object zzg;
  private int zzh;
  private int zzi;
  private String zzj = "";
  private String zzk = "";
  private String zzl = "";
  private String zzm = "";
  private long zzn;
  private zzml zzo;
  private int zzp;
  private zzqq zzq;
  private zzro zzr;
  private String zzs = "";
  private zzpj zzt;
  private zzml zzu;
  private zzni zzv = zznd.zzy();
  private int zzw;
  
  static
  {
    zzrc localzzrc = new zzrc();
    zzb = localzzrc;
    zznd.zzI(zzrc.class, localzzrc);
  }
  
  public static zzra zzi()
  {
    return (zzra)zzb.zzq();
  }
  
  public static zzrc zzk()
  {
    return zzb;
  }
  
  public static zzrc zzl(byte[] paramArrayOfByte)
  {
    return (zzrc)zznd.zzx(zzb, paramArrayOfByte);
  }
  
  public final String zzM()
  {
    return zzk;
  }
  
  public final String zzN()
  {
    return zzl;
  }
  
  public final boolean zzX()
  {
    return (zze & 0x2) != 0;
  }
  
  public final int zzY()
  {
    int i;
    switch (zzh)
    {
    default: 
      i = 0;
      break;
    case 40: 
      i = 42;
      break;
    case 39: 
      i = 41;
      break;
    case 38: 
      i = 40;
      break;
    case 37: 
      i = 39;
      break;
    case 36: 
      i = 38;
      break;
    case 35: 
      i = 37;
      break;
    case 34: 
      i = 36;
      break;
    case 33: 
      i = 35;
      break;
    case 32: 
      i = 34;
      break;
    case 31: 
      i = 33;
      break;
    case 30: 
      i = 32;
      break;
    case 29: 
      i = 31;
      break;
    case 28: 
      i = 30;
      break;
    case 27: 
      i = 29;
      break;
    case 26: 
      i = 28;
      break;
    case 25: 
      i = 27;
      break;
    case 24: 
      i = 26;
      break;
    case 23: 
      i = 25;
      break;
    case 22: 
      i = 24;
      break;
    case 21: 
      i = 23;
      break;
    case 20: 
      i = 22;
      break;
    case 19: 
      i = 21;
      break;
    case 18: 
      i = 20;
      break;
    case 17: 
      i = 19;
      break;
    case 16: 
      i = 18;
      break;
    case 15: 
      i = 17;
      break;
    case 14: 
      i = 16;
      break;
    case 13: 
      i = 15;
      break;
    case 12: 
      i = 14;
      break;
    case 11: 
      i = 13;
      break;
    case 10: 
      i = 12;
      break;
    case 9: 
      i = 11;
      break;
    case 8: 
      i = 10;
      break;
    case 7: 
      i = 9;
      break;
    case 6: 
      i = 8;
      break;
    case 5: 
      i = 7;
      break;
    case 4: 
      i = 6;
      break;
    case 3: 
      i = 5;
      break;
    case 2: 
      i = 4;
      break;
    case 1: 
      i = 3;
      break;
    case 0: 
      i = 2;
    }
    int j = i;
    if (i == 0) {
      j = 1;
    }
    return j;
  }
  
  public final int zzZ()
  {
    int i = zzp;
    int j = 2;
    if (i != 0) {
      if (i != 1)
      {
        if (i != 2) {
          j = 0;
        } else {
          j = 4;
        }
      }
      else {
        j = 3;
      }
    }
    if (j == 0) {
      return 1;
    }
    return j;
  }
  
  @Deprecated
  public final long zzf()
  {
    return zzn;
  }
  
  public final zzqq zzg()
  {
    zzqq localzzqq1 = zzq;
    zzqq localzzqq2 = localzzqq1;
    if (localzzqq1 == null) {
      localzzqq2 = zzqq.zzj();
    }
    return localzzqq2;
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
          return new zzra(null);
        }
        return new zzrc();
      }
      return zznd.zzF(zzb, "\000\021\001\001\001\023\021\000\001\000\001\f\002Ȉ\003\003\004\f\005ဉ\001\006ဉ\002\007Ȉ\bȈ\tȈ\nဉ\000\013ဉ\003\rဉ\004\016Ȉ\017<\000\021'\022င\005\023\f", new Object[] { "zzg", "zzf", "zze", "zzh", "zzk", "zzn", "zzp", "zzq", "zzr", "zzs", "zzl", "zzm", "zzo", "zzt", "zzu", "zzj", zzqg.class, "zzv", "zzw", "zzi" });
    }
    return Byte.valueOf((byte)1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzrc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */