package com.google.android.gms.internal.measurement;

public final class z1
  extends Y3
  implements K4
{
  private static final z1 zzc;
  private static volatile T4 zzd;
  private int zze;
  private int zzf;
  private boolean zzg;
  private String zzh = "";
  private String zzi = "";
  private String zzj = "";
  
  static
  {
    z1 localz1 = new z1();
    zzc = localz1;
    Y3.t(z1.class, localz1);
  }
  
  public static z1 I()
  {
    return zzc;
  }
  
  public final b G()
  {
    b localb1 = b.c(zzf);
    b localb2 = localb1;
    if (localb1 == null) {
      localb2 = b.p;
    }
    return localb2;
  }
  
  public final String J()
  {
    return zzh;
  }
  
  public final String K()
  {
    return zzj;
  }
  
  public final String L()
  {
    return zzi;
  }
  
  public final boolean M()
  {
    return zzg;
  }
  
  public final boolean N()
  {
    return (zze & 0x1) != 0;
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
    return (zze & 0x10) != 0;
  }
  
  public final boolean R()
  {
    return (zze & 0x8) != 0;
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
      paramObject1 = b.e();
      return Y3.q(zzc, "\001\005\000\001\001\005\005\000\000\000\001᠌\000\002ဇ\001\003ဈ\002\004ဈ\003\005ဈ\004", new Object[] { "zze", "zzf", paramObject1, "zzg", "zzh", "zzi", "zzj" });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new z1();
  }
  
  public static final class a
    extends Y3.b
    implements K4
  {
    public a()
    {
      super();
    }
  }
  
  public static enum b
    implements e4
  {
    public static final d4 u = new C1();
    public final int o;
    
    static
    {
      b localb1 = new b("UNKNOWN_COMPARISON_TYPE", 0, 0);
      p = localb1;
      b localb2 = new b("LESS_THAN", 1, 1);
      q = localb2;
      b localb3 = new b("GREATER_THAN", 2, 2);
      r = localb3;
      b localb4 = new b("EQUAL", 3, 3);
      s = localb4;
      b localb5 = new b("BETWEEN", 4, 4);
      t = localb5;
      v = new b[] { localb1, localb2, localb3, localb4, localb5 };
    }
    
    public b(int paramInt1)
    {
      o = paramInt1;
    }
    
    public static b c(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2)
          {
            if (paramInt != 3)
            {
              if (paramInt != 4) {
                return null;
              }
              return t;
            }
            return s;
          }
          return r;
        }
        return q;
      }
      return p;
    }
    
    public static g4 e()
    {
      return D1.a;
    }
    
    public final int a()
    {
      return o;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("<");
      localStringBuilder.append(b.class.getName());
      localStringBuilder.append('@');
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
      localStringBuilder.append(" number=");
      localStringBuilder.append(o);
      localStringBuilder.append(" name=");
      localStringBuilder.append(name());
      localStringBuilder.append('>');
      return localStringBuilder.toString();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.z1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */