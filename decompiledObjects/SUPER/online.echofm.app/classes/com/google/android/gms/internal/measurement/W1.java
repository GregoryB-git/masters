package com.google.android.gms.internal.measurement;

public final class W1
  extends Y3
  implements K4
{
  private static final W1 zzc;
  private static volatile T4 zzd;
  private int zze;
  private int zzf;
  private f2 zzg;
  private f2 zzh;
  private boolean zzi;
  
  static
  {
    W1 localW1 = new W1();
    zzc = localW1;
    Y3.t(W1.class, localW1);
  }
  
  private final void K(f2 paramf2)
  {
    paramf2.getClass();
    zzg = paramf2;
    zze |= 0x2;
  }
  
  private final void L(boolean paramBoolean)
  {
    zze |= 0x8;
    zzi = paramBoolean;
  }
  
  public static a M()
  {
    return (a)zzc.w();
  }
  
  private final void O(f2 paramf2)
  {
    paramf2.getClass();
    zzh = paramf2;
    zze |= 0x4;
  }
  
  public final void G(int paramInt)
  {
    zze |= 0x1;
    zzf = paramInt;
  }
  
  public final f2 Q()
  {
    f2 localf21 = zzg;
    f2 localf22 = localf21;
    if (localf21 == null) {
      localf22 = f2.X();
    }
    return localf22;
  }
  
  public final f2 R()
  {
    f2 localf21 = zzh;
    f2 localf22 = localf21;
    if (localf21 == null) {
      localf22 = f2.X();
    }
    return localf22;
  }
  
  public final boolean S()
  {
    return zzi;
  }
  
  public final boolean T()
  {
    return (zze & 0x1) != 0;
  }
  
  public final boolean U()
  {
    return (zze & 0x8) != 0;
  }
  
  public final boolean V()
  {
    return (zze & 0x4) != 0;
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
      return Y3.q(zzc, "\001\004\000\001\001\004\004\000\000\000\001င\000\002ဉ\001\003ဉ\002\004ဇ\003", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new W1();
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
      W1.H((W1)p, paramInt);
      return this;
    }
    
    public final a x(f2.a parama)
    {
      s();
      W1.I((W1)p, (f2)parama.p());
      return this;
    }
    
    public final a y(f2 paramf2)
    {
      s();
      W1.N((W1)p, paramf2);
      return this;
    }
    
    public final a z(boolean paramBoolean)
    {
      s();
      W1.J((W1)p, paramBoolean);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.W1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */