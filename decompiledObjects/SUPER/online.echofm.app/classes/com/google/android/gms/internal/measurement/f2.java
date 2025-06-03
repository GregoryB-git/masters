package com.google.android.gms.internal.measurement;

import java.util.List;

public final class f2
  extends Y3
  implements K4
{
  private static final f2 zzc;
  private static volatile T4 zzd;
  private i4 zze = Y3.A();
  private i4 zzf = Y3.A();
  private h4 zzg = Y3.B();
  private h4 zzh = Y3.B();
  
  static
  {
    f2 localf2 = new f2();
    zzc = localf2;
    Y3.t(f2.class, localf2);
  }
  
  private final void I(Iterable paramIterable)
  {
    h4 localh4 = zzg;
    if (!localh4.c()) {
      zzg = Y3.n(localh4);
    }
    j3.e(paramIterable, zzg);
  }
  
  private final void M(Iterable paramIterable)
  {
    i4 locali4 = zzf;
    if (!locali4.c()) {
      zzf = Y3.o(locali4);
    }
    j3.e(paramIterable, zzf);
  }
  
  private final void Q(Iterable paramIterable)
  {
    h4 localh4 = zzh;
    if (!localh4.c()) {
      zzh = Y3.n(localh4);
    }
    j3.e(paramIterable, zzh);
  }
  
  private final void U(Iterable paramIterable)
  {
    i4 locali4 = zze;
    if (!locali4.c()) {
      zze = Y3.o(locali4);
    }
    j3.e(paramIterable, zze);
  }
  
  public static a V()
  {
    return (a)zzc.w();
  }
  
  public static f2 X()
  {
    return zzc;
  }
  
  private final void c0()
  {
    zzg = Y3.B();
  }
  
  private final void d0()
  {
    zzf = Y3.A();
  }
  
  private final void f0()
  {
    zze = Y3.A();
  }
  
  public final int J()
  {
    return zzf.size();
  }
  
  public final int N()
  {
    return zzh.size();
  }
  
  public final int R()
  {
    return zze.size();
  }
  
  public final List Y()
  {
    return zzg;
  }
  
  public final List Z()
  {
    return zzf;
  }
  
  public final List a0()
  {
    return zzh;
  }
  
  public final List b0()
  {
    return zze;
  }
  
  public final void e0()
  {
    zzh = Y3.B();
  }
  
  public final int k()
  {
    return zzg.size();
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
      return Y3.q(zzc, "\001\004\000\000\001\004\004\000\004\000\001\025\002\025\003\033\004\033", new Object[] { "zze", "zzf", "zzg", X1.class, "zzh", g2.class });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new f2();
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
      f2.S((f2)p);
      return this;
    }
    
    public final a B(Iterable paramIterable)
    {
      s();
      f2.T((f2)p, paramIterable);
      return this;
    }
    
    public final a C()
    {
      s();
      f2.G((f2)p);
      return this;
    }
    
    public final a D(Iterable paramIterable)
    {
      s();
      f2.H((f2)p, paramIterable);
      return this;
    }
    
    public final a w()
    {
      s();
      f2.O((f2)p);
      return this;
    }
    
    public final a x(Iterable paramIterable)
    {
      s();
      f2.P((f2)p, paramIterable);
      return this;
    }
    
    public final a y()
    {
      s();
      f2.K((f2)p);
      return this;
    }
    
    public final a z(Iterable paramIterable)
    {
      s();
      f2.L((f2)p, paramIterable);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.f2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */