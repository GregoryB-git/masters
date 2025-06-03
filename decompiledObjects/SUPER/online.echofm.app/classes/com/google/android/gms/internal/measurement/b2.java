package com.google.android.gms.internal.measurement;

public final class b2
  extends Y3
  implements K4
{
  private static final b2 zzc;
  private static volatile T4 zzd;
  private int zze;
  private String zzf = "";
  private String zzg = "";
  private U1 zzh;
  
  static
  {
    b2 localb2 = new b2();
    zzc = localb2;
    Y3.t(b2.class, localb2);
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
      return Y3.q(zzc, "\001\003\000\001\001\003\003\000\000\000\001ဈ\000\002ဈ\001\003ဉ\002", new Object[] { "zze", "zzf", "zzg", "zzh" });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new b2();
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
 * Qualified Name:     com.google.android.gms.internal.measurement.b2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */