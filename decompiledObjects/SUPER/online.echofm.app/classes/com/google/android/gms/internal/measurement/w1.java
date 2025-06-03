package com.google.android.gms.internal.measurement;

import java.util.List;

public final class w1
  extends Y3
  implements K4
{
  private static final w1 zzc;
  private static volatile T4 zzd;
  private int zze;
  private int zzf;
  private h4 zzg = Y3.B();
  private h4 zzh = Y3.B();
  private boolean zzi;
  private boolean zzj;
  
  static
  {
    w1 localw1 = new w1();
    zzc = localw1;
    Y3.t(w1.class, localw1);
  }
  
  public final x1 G(int paramInt)
  {
    return (x1)zzh.get(paramInt);
  }
  
  public final void H(int paramInt, x1 paramx1)
  {
    paramx1.getClass();
    h4 localh4 = zzh;
    if (!localh4.c()) {
      zzh = Y3.n(localh4);
    }
    zzh.set(paramInt, paramx1);
  }
  
  public final void I(int paramInt, A1 paramA1)
  {
    paramA1.getClass();
    h4 localh4 = zzg;
    if (!localh4.c()) {
      zzg = Y3.n(localh4);
    }
    zzg.set(paramInt, paramA1);
  }
  
  public final int L()
  {
    return zzh.size();
  }
  
  public final A1 M(int paramInt)
  {
    return (A1)zzg.get(paramInt);
  }
  
  public final int N()
  {
    return zzg.size();
  }
  
  public final List P()
  {
    return zzh;
  }
  
  public final List Q()
  {
    return zzg;
  }
  
  public final boolean R()
  {
    return (zze & 0x1) != 0;
  }
  
  public final int k()
  {
    return zzf;
  }
  
  public final Object p(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (v1.a[(paramInt - 1)])
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
      return Y3.q(zzc, "\001\005\000\001\001\005\005\000\002\000\001င\000\002\033\003\033\004ဇ\001\005ဇ\002", new Object[] { "zze", "zzf", "zzg", A1.class, "zzh", x1.class, "zzi", "zzj" });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new w1();
  }
  
  public static final class a
    extends Y3.b
    implements K4
  {
    public a()
    {
      super();
    }
    
    public final int A()
    {
      return ((w1)p).N();
    }
    
    public final A1 B(int paramInt)
    {
      return ((w1)p).M(paramInt);
    }
    
    public final int w()
    {
      return ((w1)p).L();
    }
    
    public final a x(int paramInt, x1.a parama)
    {
      s();
      w1.J((w1)p, paramInt, (x1)parama.p());
      return this;
    }
    
    public final a y(int paramInt, A1.a parama)
    {
      s();
      w1.K((w1)p, paramInt, (A1)parama.p());
      return this;
    }
    
    public final x1 z(int paramInt)
    {
      return ((w1)p).G(paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.w1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */