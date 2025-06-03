package com.google.android.gms.internal.measurement;

public final class K1
  extends Y3
  implements K4
{
  private static final K1 zzc;
  private static volatile T4 zzd;
  private int zze;
  private String zzf = "";
  private boolean zzg;
  private boolean zzh;
  private int zzi;
  
  static
  {
    K1 localK1 = new K1();
    zzc = localK1;
    Y3.t(K1.class, localK1);
  }
  
  private final void H(String paramString)
  {
    paramString.getClass();
    zze |= 0x1;
    zzf = paramString;
  }
  
  public final String J()
  {
    return zzf;
  }
  
  public final boolean K()
  {
    return zzg;
  }
  
  public final boolean L()
  {
    return zzh;
  }
  
  public final boolean M()
  {
    return (zze & 0x2) != 0;
  }
  
  public final boolean N()
  {
    return (zze & 0x4) != 0;
  }
  
  public final boolean O()
  {
    return (zze & 0x8) != 0;
  }
  
  public final int k()
  {
    return zzi;
  }
  
  public final Object p(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (H1.a[(paramInt - 1)])
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
      return Y3.q(zzc, "\001\004\000\001\001\004\004\000\000\000\001ဈ\000\002ဇ\001\003ဇ\002\004င\003", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new K1();
  }
  
  public static final class a
    extends Y3.b
    implements K4
  {
    public a()
    {
      super();
    }
    
    public final boolean A()
    {
      return ((K1)p).L();
    }
    
    public final boolean B()
    {
      return ((K1)p).M();
    }
    
    public final boolean C()
    {
      return ((K1)p).N();
    }
    
    public final boolean D()
    {
      return ((K1)p).O();
    }
    
    public final int w()
    {
      return ((K1)p).k();
    }
    
    public final a x(String paramString)
    {
      s();
      K1.G((K1)p, paramString);
      return this;
    }
    
    public final String y()
    {
      return ((K1)p).J();
    }
    
    public final boolean z()
    {
      return ((K1)p).K();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.K1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */