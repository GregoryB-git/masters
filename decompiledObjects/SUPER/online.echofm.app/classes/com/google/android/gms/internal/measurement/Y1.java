package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;

public final class Y1
  extends Y3
  implements K4
{
  private static final Y1 zzc;
  private static volatile T4 zzd;
  private int zze;
  private h4 zzf = Y3.B();
  private String zzg = "";
  private long zzh;
  private long zzi;
  private int zzj;
  
  static
  {
    Y1 localY1 = new Y1();
    zzc = localY1;
    Y3.t(Y1.class, localY1);
  }
  
  private final void I(long paramLong)
  {
    zze |= 0x4;
    zzi = paramLong;
  }
  
  private final void Q(a2 parama2)
  {
    parama2.getClass();
    h0();
    zzf.add(parama2);
  }
  
  private final void S(String paramString)
  {
    paramString.getClass();
    zze |= 0x1;
    zzg = paramString;
  }
  
  public static a Z()
  {
    return (a)zzc.w();
  }
  
  public final a2 G(int paramInt)
  {
    return (a2)zzf.get(paramInt);
  }
  
  public final void H(int paramInt, a2 parama2)
  {
    parama2.getClass();
    h0();
    zzf.set(paramInt, parama2);
  }
  
  public final void R(Iterable paramIterable)
  {
    h0();
    j3.e(paramIterable, zzf);
  }
  
  public final int T()
  {
    return zzf.size();
  }
  
  public final void U(int paramInt)
  {
    h0();
    zzf.remove(paramInt);
  }
  
  public final void V(long paramLong)
  {
    zze |= 0x2;
    zzh = paramLong;
  }
  
  public final long X()
  {
    return zzi;
  }
  
  public final long Y()
  {
    return zzh;
  }
  
  public final String b0()
  {
    return zzg;
  }
  
  public final List c0()
  {
    return zzf;
  }
  
  public final boolean d0()
  {
    return (zze & 0x8) != 0;
  }
  
  public final boolean e0()
  {
    return (zze & 0x4) != 0;
  }
  
  public final boolean f0()
  {
    return (zze & 0x2) != 0;
  }
  
  public final void g0()
  {
    zzf = Y3.B();
  }
  
  public final void h0()
  {
    h4 localh4 = zzf;
    if (!localh4.c()) {
      zzf = Y3.n(localh4);
    }
  }
  
  public final int k()
  {
    return zzj;
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
      return Y3.q(zzc, "\001\005\000\001\001\005\005\000\001\000\001\033\002ဈ\000\003ဂ\001\004ဂ\002\005င\003", new Object[] { "zze", "zzf", a2.class, "zzg", "zzh", "zzi", "zzj" });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new Y1();
  }
  
  public static final class a
    extends Y3.b
    implements K4
  {
    public a()
    {
      super();
    }
    
    public final a A(long paramLong)
    {
      s();
      Y1.W((Y1)p, paramLong);
      return this;
    }
    
    public final a B(a2.a parama)
    {
      s();
      Y1.N((Y1)p, (a2)parama.p());
      return this;
    }
    
    public final a C(a2 parama2)
    {
      s();
      Y1.N((Y1)p, parama2);
      return this;
    }
    
    public final a D(Iterable paramIterable)
    {
      s();
      Y1.O((Y1)p, paramIterable);
      return this;
    }
    
    public final a E(String paramString)
    {
      s();
      Y1.P((Y1)p, paramString);
      return this;
    }
    
    public final long F()
    {
      return ((Y1)p).X();
    }
    
    public final a G(long paramLong)
    {
      s();
      Y1.M((Y1)p, paramLong);
      return this;
    }
    
    public final a2 H(int paramInt)
    {
      return ((Y1)p).G(paramInt);
    }
    
    public final long I()
    {
      return ((Y1)p).Y();
    }
    
    public final a J()
    {
      s();
      Y1.J((Y1)p);
      return this;
    }
    
    public final String K()
    {
      return ((Y1)p).b0();
    }
    
    public final List L()
    {
      return Collections.unmodifiableList(((Y1)p).c0());
    }
    
    public final boolean M()
    {
      return ((Y1)p).f0();
    }
    
    public final int w()
    {
      return ((Y1)p).T();
    }
    
    public final a x(int paramInt)
    {
      s();
      Y1.K((Y1)p, paramInt);
      return this;
    }
    
    public final a y(int paramInt, a2.a parama)
    {
      s();
      Y1.L((Y1)p, paramInt, (a2)parama.p());
      return this;
    }
    
    public final a z(int paramInt, a2 parama2)
    {
      s();
      Y1.L((Y1)p, paramInt, parama2);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.Y1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */