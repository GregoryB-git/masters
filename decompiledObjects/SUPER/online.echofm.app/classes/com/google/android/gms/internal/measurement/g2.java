package com.google.android.gms.internal.measurement;

import java.util.List;

public final class g2
  extends Y3
  implements K4
{
  private static final g2 zzc;
  private static volatile T4 zzd;
  private int zze;
  private int zzf;
  private i4 zzg = Y3.A();
  
  static
  {
    g2 localg2 = new g2();
    zzc = localg2;
    Y3.t(g2.class, localg2);
  }
  
  private final void J(Iterable paramIterable)
  {
    i4 locali4 = zzg;
    if (!locali4.c()) {
      zzg = Y3.o(locali4);
    }
    j3.e(paramIterable, zzg);
  }
  
  private final void L(int paramInt)
  {
    zze |= 0x1;
    zzf = paramInt;
  }
  
  public static a M()
  {
    return (a)zzc.w();
  }
  
  public final long G(int paramInt)
  {
    return zzg.l(paramInt);
  }
  
  public final int K()
  {
    return zzf;
  }
  
  public final List O()
  {
    return zzg;
  }
  
  public final boolean P()
  {
    return (zze & 0x1) != 0;
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
      return Y3.q(zzc, "\001\002\000\001\001\002\002\000\001\000\001င\000\002\024", new Object[] { "zze", "zzf", "zzg" });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new g2();
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
      g2.H((g2)p, paramInt);
      return this;
    }
    
    public final a x(Iterable paramIterable)
    {
      s();
      g2.I((g2)p, paramIterable);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.g2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */