package com.google.android.gms.internal.measurement;

public final class A1
  extends Y3
  implements K4
{
  private static final A1 zzc;
  private static volatile T4 zzd;
  private int zze;
  private int zzf;
  private String zzg = "";
  private y1 zzh;
  private boolean zzi;
  private boolean zzj;
  private boolean zzk;
  
  static
  {
    A1 localA1 = new A1();
    zzc = localA1;
    Y3.t(A1.class, localA1);
  }
  
  private final void H(String paramString)
  {
    paramString.getClass();
    zze |= 0x2;
    zzg = paramString;
  }
  
  public static a J()
  {
    return (a)zzc.w();
  }
  
  public final y1 I()
  {
    y1 localy11 = zzh;
    y1 localy12 = localy11;
    if (localy11 == null) {
      localy12 = y1.J();
    }
    return localy12;
  }
  
  public final String L()
  {
    return zzg;
  }
  
  public final boolean M()
  {
    return zzi;
  }
  
  public final boolean N()
  {
    return zzj;
  }
  
  public final boolean O()
  {
    return zzk;
  }
  
  public final boolean P()
  {
    return (zze & 0x1) != 0;
  }
  
  public final boolean Q()
  {
    return (zze & 0x20) != 0;
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
      return Y3.q(zzc, "\001\006\000\001\001\006\006\000\000\000\001င\000\002ဈ\001\003ဉ\002\004ဇ\003\005ဇ\004\006ဇ\005", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk" });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new A1();
  }
  
  public static final class a
    extends Y3.b
    implements K4
  {
    public a()
    {
      super();
    }
    
    public final a w(String paramString)
    {
      s();
      A1.G((A1)p, paramString);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.A1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */