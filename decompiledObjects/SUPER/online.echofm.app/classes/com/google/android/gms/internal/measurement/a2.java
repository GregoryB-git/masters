package com.google.android.gms.internal.measurement;

import java.util.List;

public final class a2
  extends Y3
  implements K4
{
  private static final a2 zzc;
  private static volatile T4 zzd;
  private int zze;
  private String zzf = "";
  private String zzg = "";
  private long zzh;
  private float zzi;
  private double zzj;
  private h4 zzk = Y3.B();
  
  static
  {
    a2 locala2 = new a2();
    zzc = locala2;
    Y3.t(a2.class, locala2);
  }
  
  private final void I(long paramLong)
  {
    zze |= 0x4;
    zzh = paramLong;
  }
  
  private final void P(Iterable paramIterable)
  {
    o0();
    j3.e(paramIterable, zzk);
  }
  
  private final void Q(String paramString)
  {
    paramString.getClass();
    zze |= 0x1;
    zzf = paramString;
  }
  
  public static a Z()
  {
    return (a)zzc.w();
  }
  
  public final double G()
  {
    return zzj;
  }
  
  public final void H(double paramDouble)
  {
    zze |= 0x10;
    zzj = paramDouble;
  }
  
  public final float R()
  {
    return zzi;
  }
  
  public final void U(String paramString)
  {
    paramString.getClass();
    zze |= 0x2;
    zzg = paramString;
  }
  
  public final int V()
  {
    return zzk.size();
  }
  
  public final long X()
  {
    return zzh;
  }
  
  public final void a0(a2 parama2)
  {
    parama2.getClass();
    o0();
    zzk.add(parama2);
  }
  
  public final String c0()
  {
    return zzf;
  }
  
  public final String d0()
  {
    return zzg;
  }
  
  public final List e0()
  {
    return zzk;
  }
  
  public final boolean f0()
  {
    return (zze & 0x10) != 0;
  }
  
  public final boolean g0()
  {
    return (zze & 0x8) != 0;
  }
  
  public final boolean h0()
  {
    return (zze & 0x4) != 0;
  }
  
  public final boolean i0()
  {
    return (zze & 0x1) != 0;
  }
  
  public final boolean j0()
  {
    return (zze & 0x2) != 0;
  }
  
  public final void k0()
  {
    zze &= 0xFFFFFFEF;
    zzj = 0.0D;
  }
  
  public final void l0()
  {
    zze &= 0xFFFFFFFB;
    zzh = 0L;
  }
  
  public final void m0()
  {
    zzk = Y3.B();
  }
  
  public final void n0()
  {
    zze &= 0xFFFFFFFD;
    zzg = zzczzg;
  }
  
  public final void o0()
  {
    h4 localh4 = zzk;
    if (!localh4.c()) {
      zzk = Y3.n(localh4);
    }
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
      return Y3.q(zzc, "\001\006\000\001\001\006\006\000\001\000\001ဈ\000\002ဈ\001\003ဂ\002\004ခ\003\005က\004\006\033", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", a2.class });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new a2();
  }
  
  public static final class a
    extends Y3.b
    implements K4
  {
    public a()
    {
      super();
    }
    
    public final a A(Iterable paramIterable)
    {
      s();
      a2.N((a2)p, paramIterable);
      return this;
    }
    
    public final a B(String paramString)
    {
      s();
      a2.O((a2)p, paramString);
      return this;
    }
    
    public final a C()
    {
      s();
      a2.W((a2)p);
      return this;
    }
    
    public final a D(String paramString)
    {
      s();
      a2.T((a2)p, paramString);
      return this;
    }
    
    public final a E()
    {
      s();
      a2.S((a2)p);
      return this;
    }
    
    public final a F()
    {
      s();
      a2.Y((a2)p);
      return this;
    }
    
    public final a G()
    {
      s();
      a2.J((a2)p);
      return this;
    }
    
    public final int w()
    {
      return ((a2)p).V();
    }
    
    public final a x(double paramDouble)
    {
      s();
      a2.K((a2)p, paramDouble);
      return this;
    }
    
    public final a y(long paramLong)
    {
      s();
      a2.L((a2)p, paramLong);
      return this;
    }
    
    public final a z(a parama)
    {
      s();
      a2.M((a2)p, (a2)parama.p());
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.a2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */