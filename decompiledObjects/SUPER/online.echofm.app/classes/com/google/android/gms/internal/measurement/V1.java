package com.google.android.gms.internal.measurement;

public final class V1
  extends Y3
  implements K4
{
  private static final V1 zzc;
  private static volatile T4 zzd;
  private int zze;
  private boolean zzf;
  private boolean zzg;
  private boolean zzh;
  private boolean zzi;
  private boolean zzj;
  private boolean zzk;
  private boolean zzl;
  
  static
  {
    V1 localV1 = new V1();
    zzc = localV1;
    Y3.t(V1.class, localV1);
  }
  
  public static a G()
  {
    return (a)zzc.w();
  }
  
  public static V1 M()
  {
    return zzc;
  }
  
  public final void I(boolean paramBoolean)
  {
    zze |= 0x20;
    zzk = paramBoolean;
  }
  
  public final void L(boolean paramBoolean)
  {
    zze |= 0x10;
    zzj = paramBoolean;
  }
  
  public final void O(boolean paramBoolean)
  {
    zze |= 0x1;
    zzf = paramBoolean;
  }
  
  public final void Q(boolean paramBoolean)
  {
    zze |= 0x40;
    zzl = paramBoolean;
  }
  
  public final boolean R()
  {
    return zzk;
  }
  
  public final void T(boolean paramBoolean)
  {
    zze |= 0x2;
    zzg = paramBoolean;
  }
  
  public final boolean U()
  {
    return zzj;
  }
  
  public final void W(boolean paramBoolean)
  {
    zze |= 0x4;
    zzh = paramBoolean;
  }
  
  public final boolean X()
  {
    return zzf;
  }
  
  public final void Z(boolean paramBoolean)
  {
    zze |= 0x8;
    zzi = paramBoolean;
  }
  
  public final boolean a0()
  {
    return zzl;
  }
  
  public final boolean b0()
  {
    return zzg;
  }
  
  public final boolean c0()
  {
    return zzh;
  }
  
  public final boolean d0()
  {
    return zzi;
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
      return Y3.q(zzc, "\001\007\000\001\001\007\007\000\000\000\001ဇ\000\002ဇ\001\003ဇ\002\004ဇ\003\005ဇ\004\006ဇ\005\007ဇ\006", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl" });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new V1();
  }
  
  public static final class a
    extends Y3.b
    implements K4
  {
    public a()
    {
      super();
    }
    
    public final a A(boolean paramBoolean)
    {
      s();
      V1.K((V1)p, paramBoolean);
      return this;
    }
    
    public final a B(boolean paramBoolean)
    {
      s();
      V1.N((V1)p, paramBoolean);
      return this;
    }
    
    public final a C(boolean paramBoolean)
    {
      s();
      V1.P((V1)p, paramBoolean);
      return this;
    }
    
    public final a w(boolean paramBoolean)
    {
      s();
      V1.V((V1)p, paramBoolean);
      return this;
    }
    
    public final a x(boolean paramBoolean)
    {
      s();
      V1.S((V1)p, paramBoolean);
      return this;
    }
    
    public final a y(boolean paramBoolean)
    {
      s();
      V1.H((V1)p, paramBoolean);
      return this;
    }
    
    public final a z(boolean paramBoolean)
    {
      s();
      V1.Y((V1)p, paramBoolean);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.V1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */