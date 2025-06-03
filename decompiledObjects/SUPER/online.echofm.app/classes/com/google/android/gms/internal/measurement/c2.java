package com.google.android.gms.internal.measurement;

import java.util.List;

public final class c2
  extends Y3
  implements K4
{
  private static final c2 zzc;
  private static volatile T4 zzd;
  private int zze;
  private h4 zzf = Y3.B();
  private String zzg = "";
  
  static
  {
    c2 localc2 = new c2();
    zzc = localc2;
    Y3.t(c2.class, localc2);
  }
  
  private final void I(d2 paramd2)
  {
    paramd2.getClass();
    h4 localh4 = zzf;
    if (!localh4.c()) {
      zzf = Y3.n(localh4);
    }
    zzf.add(paramd2);
  }
  
  public static a J()
  {
    return (a)zzc.w();
  }
  
  public final d2 G(int paramInt)
  {
    return (d2)zzf.get(0);
  }
  
  public final List L()
  {
    return zzf;
  }
  
  public final int k()
  {
    return zzf.size();
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
      return Y3.q(zzc, "\001\002\000\001\001\007\002\000\001\000\001\033\007ဈ\000", new Object[] { "zze", "zzf", d2.class, "zzg" });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new c2();
  }
  
  public static final class a
    extends Y3.b
    implements K4
  {
    public a()
    {
      super();
    }
    
    public final int w()
    {
      return ((c2)p).k();
    }
    
    public final a x(d2.a parama)
    {
      s();
      c2.H((c2)p, (d2)parama.p());
      return this;
    }
    
    public final d2 y(int paramInt)
    {
      return ((c2)p).G(0);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.c2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */