package com.google.android.gms.internal.measurement;

public final class U1
  extends Y3
  implements K4
{
  private static final U1 zzc;
  private static volatile T4 zzd;
  private int zze;
  private String zzf = "";
  private String zzg = "";
  private String zzh = "";
  private String zzi = "";
  private String zzj = "";
  private String zzk = "";
  private String zzl = "";
  
  static
  {
    U1 localU1 = new U1();
    zzc = localU1;
    Y3.t(U1.class, localU1);
  }
  
  public final Object p(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (T1.a[(paramInt - 1)])
    {
    default: 
      throw new UnsupportedOperationException();
    case 7: 
      return null;
    case 6: 
      return Byte.valueOf((byte)1);
    case 5: 
      paramObject2 = zzd;
      paramObject1 = paramObject2;
      if (paramObject2 == null)
      {
        try
        {
          paramObject2 = zzd;
          paramObject1 = paramObject2;
          if (paramObject2 == null)
          {
            paramObject1 = new com/google/android/gms/internal/measurement/Y3$a;
            ((Y3.a)paramObject1).<init>(zzc);
            zzd = (T4)paramObject1;
          }
        }
        finally
        {
          break label114;
        }
        break label119;
        throw ((Throwable)paramObject1);
      }
      return paramObject1;
    case 4: 
      return zzc;
    case 3: 
      return Y3.q(zzc, "\001\007\000\001\001\007\007\000\000\000\001ဈ\000\002ဈ\001\003ဈ\002\004ဈ\003\005ဈ\004\006ဈ\005\007ဈ\006", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl" });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new U1();
  }
  
  public static final class a
    extends Y3.b
    implements K4
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.U1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */