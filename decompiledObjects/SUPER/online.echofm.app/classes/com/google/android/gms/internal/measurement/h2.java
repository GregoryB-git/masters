package com.google.android.gms.internal.measurement;

public final class h2
  extends Y3
  implements K4
{
  private static final h2 zzc;
  private static volatile T4 zzd;
  private int zze;
  private long zzf;
  private String zzg = "";
  private String zzh = "";
  private long zzi;
  private float zzj;
  private double zzk;
  
  static
  {
    h2 localh2 = new h2();
    zzc = localh2;
    Y3.t(h2.class, localh2);
  }
  
  private final void H(double paramDouble)
  {
    zze |= 0x20;
    zzk = paramDouble;
  }
  
  private final void I(long paramLong)
  {
    zze |= 0x8;
    zzi = paramLong;
  }
  
  private final void N(String paramString)
  {
    paramString.getClass();
    zze |= 0x2;
    zzg = paramString;
  }
  
  private final void P(long paramLong)
  {
    zze |= 0x1;
    zzf = paramLong;
  }
  
  private final void T(String paramString)
  {
    paramString.getClass();
    zze |= 0x4;
    zzh = paramString;
  }
  
  public static a X()
  {
    return (a)zzc.w();
  }
  
  private final void g0()
  {
    zze &= 0xFFFFFFDF;
    zzk = 0.0D;
  }
  
  private final void h0()
  {
    zze &= 0xFFFFFFF7;
    zzi = 0L;
  }
  
  private final void i0()
  {
    zze &= 0xFFFFFFFB;
    zzh = zzczzh;
  }
  
  public final double G()
  {
    return zzk;
  }
  
  public final float O()
  {
    return zzj;
  }
  
  public final long U()
  {
    return zzi;
  }
  
  public final long W()
  {
    return zzf;
  }
  
  public final String Z()
  {
    return zzg;
  }
  
  public final String a0()
  {
    return zzh;
  }
  
  public final boolean b0()
  {
    return (zze & 0x20) != 0;
  }
  
  public final boolean c0()
  {
    return (zze & 0x10) != 0;
  }
  
  public final boolean d0()
  {
    return (zze & 0x8) != 0;
  }
  
  public final boolean e0()
  {
    return (zze & 0x1) != 0;
  }
  
  public final boolean f0()
  {
    return (zze & 0x4) != 0;
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
      return Y3.q(zzc, "\001\006\000\001\001\006\006\000\000\000\001ဂ\000\002ဈ\001\003ဈ\002\004ဂ\003\005ခ\004\006က\005", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk" });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new h2();
  }
  
  public static final class a
    extends Y3.b
    implements K4
  {
    public a()
    {
      super();
    }
    
    public final a A()
    {
      s();
      h2.Q((h2)p);
      return this;
    }
    
    public final a B(long paramLong)
    {
      s();
      h2.L((h2)p, paramLong);
      return this;
    }
    
    public final a C(String paramString)
    {
      s();
      h2.S((h2)p, paramString);
      return this;
    }
    
    public final a D()
    {
      s();
      h2.J((h2)p);
      return this;
    }
    
    public final a w()
    {
      s();
      h2.V((h2)p);
      return this;
    }
    
    public final a x(double paramDouble)
    {
      s();
      h2.K((h2)p, paramDouble);
      return this;
    }
    
    public final a y(long paramLong)
    {
      s();
      h2.R((h2)p, paramLong);
      return this;
    }
    
    public final a z(String paramString)
    {
      s();
      h2.M((h2)p, paramString);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.h2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */