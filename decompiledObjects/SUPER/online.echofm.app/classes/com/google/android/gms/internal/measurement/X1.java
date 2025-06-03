package com.google.android.gms.internal.measurement;

public final class X1
  extends Y3
  implements K4
{
  private static final X1 zzc;
  private static volatile T4 zzd;
  private int zze;
  private int zzf;
  private long zzg;
  
  static
  {
    X1 localX1 = new X1();
    zzc = localX1;
    Y3.t(X1.class, localX1);
  }
  
  private final void G(int paramInt)
  {
    zze |= 0x1;
    zzf = paramInt;
  }
  
  public static a L()
  {
    return (a)zzc.w();
  }
  
  public final void H(long paramLong)
  {
    zze |= 0x2;
    zzg = paramLong;
  }
  
  public final long K()
  {
    return zzg;
  }
  
  public final boolean N()
  {
    return (zze & 0x2) != 0;
  }
  
  public final boolean O()
  {
    return (zze & 0x1) != 0;
  }
  
  public final int k()
  {
    return zzf;
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
      return Y3.q(zzc, "\001\002\000\001\001\002\002\000\000\000\001င\000\002ဂ\001", new Object[] { "zze", "zzf", "zzg" });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new X1();
  }
  
  public static final class a
    extends Y3.b
    implements K4
  {
    public a()
    {
      super();
    }
    
    public final a w(int paramInt)
    {
      s();
      X1.I((X1)p, paramInt);
      return this;
    }
    
    public final a x(long paramLong)
    {
      s();
      X1.J((X1)p, paramLong);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.X1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */