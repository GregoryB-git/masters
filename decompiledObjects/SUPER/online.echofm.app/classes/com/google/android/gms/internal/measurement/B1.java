package com.google.android.gms.internal.measurement;

import java.util.List;

public final class B1
  extends Y3
  implements K4
{
  private static final B1 zzc;
  private static volatile T4 zzd;
  private int zze;
  private int zzf;
  private String zzg = "";
  private boolean zzh;
  private h4 zzi = Y3.B();
  
  static
  {
    B1 localB1 = new B1();
    zzc = localB1;
    Y3.t(B1.class, localB1);
  }
  
  public static B1 I()
  {
    return zzc;
  }
  
  public final a G()
  {
    a locala1 = a.c(zzf);
    a locala2 = locala1;
    if (locala1 == null) {
      locala2 = a.p;
    }
    return locala2;
  }
  
  public final String J()
  {
    return zzg;
  }
  
  public final List K()
  {
    return zzi;
  }
  
  public final boolean L()
  {
    return zzh;
  }
  
  public final boolean M()
  {
    return (zze & 0x4) != 0;
  }
  
  public final boolean N()
  {
    return (zze & 0x2) != 0;
  }
  
  public final boolean O()
  {
    return (zze & 0x1) != 0;
  }
  
  public final int k()
  {
    return zzi.size();
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
      paramObject1 = a.e();
      return Y3.q(zzc, "\001\004\000\001\001\004\004\000\001\000\001᠌\000\002ဈ\001\003ဇ\002\004\032", new Object[] { "zze", "zzf", paramObject1, "zzg", "zzh", "zzi" });
    case 2: 
      label114:
      label119:
      return new b(null);
    }
    return new B1();
  }
  
  public static enum a
    implements e4
  {
    public static final d4 w = new G1();
    public final int o;
    
    static
    {
      a locala1 = new a("UNKNOWN_MATCH_TYPE", 0, 0);
      p = locala1;
      a locala2 = new a("REGEXP", 1, 1);
      q = locala2;
      a locala3 = new a("BEGINS_WITH", 2, 2);
      r = locala3;
      a locala4 = new a("ENDS_WITH", 3, 3);
      s = locala4;
      a locala5 = new a("PARTIAL", 4, 4);
      t = locala5;
      a locala6 = new a("EXACT", 5, 5);
      u = locala6;
      a locala7 = new a("IN_LIST", 6, 6);
      v = locala7;
      x = new a[] { locala1, locala2, locala3, locala4, locala5, locala6, locala7 };
    }
    
    public a(int paramInt1)
    {
      o = paramInt1;
    }
    
    public static a c(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        return null;
      case 6: 
        return v;
      case 5: 
        return u;
      case 4: 
        return t;
      case 3: 
        return s;
      case 2: 
        return r;
      case 1: 
        return q;
      }
      return p;
    }
    
    public static g4 e()
    {
      return E1.a;
    }
    
    public final int a()
    {
      return o;
    }
    
    public final String toString()
    {
      StringBuilder localStringBuilder = new StringBuilder("<");
      localStringBuilder.append(a.class.getName());
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
  
  public static final class b
    extends Y3.b
    implements K4
  {
    public b()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.B1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */