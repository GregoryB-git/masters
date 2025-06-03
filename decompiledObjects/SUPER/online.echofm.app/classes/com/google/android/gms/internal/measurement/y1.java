package com.google.android.gms.internal.measurement;

public final class y1
  extends Y3
  implements K4
{
  private static final y1 zzc;
  private static volatile T4 zzd;
  private int zze;
  private B1 zzf;
  private z1 zzg;
  private boolean zzh;
  private String zzi = "";
  
  static
  {
    y1 localy1 = new y1();
    zzc = localy1;
    Y3.t(y1.class, localy1);
  }
  
  private final void I(String paramString)
  {
    paramString.getClass();
    zze |= 0x8;
    zzi = paramString;
  }
  
  public static y1 J()
  {
    return zzc;
  }
  
  public final z1 K()
  {
    z1 localz11 = zzg;
    z1 localz12 = localz11;
    if (localz11 == null) {
      localz12 = z1.I();
    }
    return localz12;
  }
  
  public final B1 L()
  {
    B1 localB11 = zzf;
    B1 localB12 = localB11;
    if (localB11 == null) {
      localB12 = B1.I();
    }
    return localB12;
  }
  
  public final String M()
  {
    return zzi;
  }
  
  public final boolean N()
  {
    return zzh;
  }
  
  public final boolean O()
  {
    return (zze & 0x4) != 0;
  }
  
  public final boolean P()
  {
    return (zze & 0x2) != 0;
  }
  
  public final boolean Q()
  {
    return (zze & 0x8) != 0;
  }
  
  public final boolean R()
  {
    return (zze & 0x1) != 0;
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
      return Y3.q(zzc, "\001\004\000\001\001\004\004\000\000\000\001ဉ\000\002ဉ\001\003ဇ\002\004ဈ\003", new Object[] { "zze", "zzf", "zzg", "zzh", "zzi" });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new y1();
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
      y1.H((y1)p, paramString);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.y1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */