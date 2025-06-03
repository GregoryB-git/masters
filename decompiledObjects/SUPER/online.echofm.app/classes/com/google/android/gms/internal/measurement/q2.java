package com.google.android.gms.internal.measurement;

import java.util.List;

public final class q2
  extends Y3
  implements K4
{
  private static final q2 zzc;
  private static volatile T4 zzd;
  private int zze;
  private h4 zzf = Y3.B();
  private o2 zzg;
  
  static
  {
    q2 localq2 = new q2();
    zzc = localq2;
    Y3.t(q2.class, localq2);
  }
  
  public final o2 G()
  {
    o2 localo21 = zzg;
    o2 localo22 = localo21;
    if (localo21 == null) {
      localo22 = o2.H();
    }
    return localo22;
  }
  
  public final List I()
  {
    return zzf;
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
      return Y3.q(zzc, "\001\002\000\001\001\002\002\000\001\000\001\033\002ဉ\000", new Object[] { "zze", "zzf", r2.class, "zzg" });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new q2();
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
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.q2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */