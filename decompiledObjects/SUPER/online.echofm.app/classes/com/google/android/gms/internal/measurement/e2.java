package com.google.android.gms.internal.measurement;

import java.util.List;

public final class e2
  extends Y3
  implements K4
{
  private static final e2 zzc;
  private static volatile T4 zzd;
  private int zze;
  private int zzf = 1;
  private h4 zzg = Y3.B();
  
  static
  {
    e2 locale2 = new e2();
    zzc = locale2;
    Y3.t(e2.class, locale2);
  }
  
  public static b G()
  {
    return (b)zzc.w();
  }
  
  public final void H(Z1 paramZ1)
  {
    paramZ1.getClass();
    h4 localh4 = zzg;
    if (!localh4.c()) {
      zzg = Y3.n(localh4);
    }
    zzg.add(paramZ1);
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
      paramObject1 = a.e();
      return Y3.q(zzc, "\001\002\000\001\001\002\002\000\001\000\001᠌\000\002\033", new Object[] { "zze", "zzf", paramObject1, "zzg", Z1.class });
    case 2: 
      label114:
      label119:
      return new b(null);
    }
    return new e2();
  }
  
  public static enum a
    implements e4
  {
    public static final d4 r = new m2();
    public final int o;
    
    static
    {
      a locala1 = new a("RADS", 0, 1);
      p = locala1;
      a locala2 = new a("PROVISIONING", 1, 2);
      q = locala2;
      s = new a[] { locala1, locala2 };
    }
    
    public a(int paramInt1)
    {
      o = paramInt1;
    }
    
    public static a c(int paramInt)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2) {
          return null;
        }
        return q;
      }
      return p;
    }
    
    public static g4 e()
    {
      return l2.a;
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
    
    public final b w(Z1.a parama)
    {
      s();
      e2.I((e2)p, (Z1)parama.p());
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.e2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */