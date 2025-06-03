package com.google.android.gms.internal.measurement;

public final class Z1
  extends Y3
  implements K4
{
  private static final Z1 zzc;
  private static volatile T4 zzd;
  private int zze;
  private String zzf = "";
  private long zzg;
  
  static
  {
    Z1 localZ1 = new Z1();
    zzc = localZ1;
    Y3.t(Z1.class, localZ1);
  }
  
  public static a G()
  {
    return (a)zzc.w();
  }
  
  private final void H(long paramLong)
  {
    zze |= 0x2;
    zzg = paramLong;
  }
  
  private final void K(String paramString)
  {
    paramString.getClass();
    zze |= 0x1;
    zzf = paramString;
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
      return Y3.q(zzc, "\001\002\000\001\001\002\002\000\000\000\001ဈ\000\002ဂ\001", new Object[] { "zze", "zzf", "zzg" });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new Z1();
  }
  
  public static final class a
    extends Y3.b
    implements K4
  {
    public a()
    {
      super();
    }
    
    public final a w(long paramLong)
    {
      s();
      Z1.I((Z1)p, paramLong);
      return this;
    }
    
    public final a x(String paramString)
    {
      s();
      Z1.J((Z1)p, paramString);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.Z1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */