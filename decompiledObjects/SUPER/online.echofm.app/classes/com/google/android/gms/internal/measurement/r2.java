package com.google.android.gms.internal.measurement;

import java.util.List;

public final class r2
  extends Y3
  implements K4
{
  private static final r2 zzc;
  private static volatile T4 zzd;
  private int zze;
  private int zzf;
  private h4 zzg = Y3.B();
  private String zzh = "";
  private String zzi = "";
  private boolean zzj;
  private double zzk;
  
  static
  {
    r2 localr2 = new r2();
    zzc = localr2;
    Y3.t(r2.class, localr2);
  }
  
  public final double G()
  {
    return zzk;
  }
  
  public final b H()
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
    return zzi;
  }
  
  public final List L()
  {
    return zzg;
  }
  
  public final boolean M()
  {
    return zzj;
  }
  
  public final boolean N()
  {
    return (zze & 0x8) != 0;
  }
  
  public final boolean O()
  {
    return (zze & 0x10) != 0;
  }
  
  public final boolean P()
  {
    return (zze & 0x4) != 0;
  }
  
  public final Object p(int paramInt, Object paramObject1, Object paramObject2)
  {
    switch (n2.a[(paramInt - 1)])
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
      return Y3.q(zzc, "\001\006\000\001\001\006\006\000\001\000\001᠌\000\002\033\003ဈ\001\004ဈ\002\005ဇ\003\006က\004", new Object[] { "zze", "zzf", paramObject1, "zzg", r2.class, "zzh", "zzi", "zzj", "zzk" });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new r2();
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
    public static final d4 u = new s2();
    public final int o;
    
    static
    {
      b localb1 = new b("UNKNOWN", 0, 0);
      p = localb1;
      b localb2 = new b("STRING", 1, 1);
      q = localb2;
      b localb3 = new b("NUMBER", 2, 2);
      r = localb3;
      b localb4 = new b("BOOLEAN", 3, 3);
      s = localb4;
      b localb5 = new b("STATEMENT", 4, 4);
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
      return u2.a;
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
 * Qualified Name:     com.google.android.gms.internal.measurement.r2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */