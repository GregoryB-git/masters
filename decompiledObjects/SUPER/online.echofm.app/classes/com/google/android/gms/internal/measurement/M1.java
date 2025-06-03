package com.google.android.gms.internal.measurement;

public final class M1
  extends Y3
  implements K4
{
  private static final M1 zzc;
  private static volatile T4 zzd;
  private int zze;
  private int zzf = 14;
  private int zzg = 11;
  private int zzh = 60;
  
  static
  {
    M1 localM1 = new M1();
    zzc = localM1;
    Y3.t(M1.class, localM1);
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
      return Y3.q(zzc, "\001\003\000\001\001\003\003\000\000\000\001င\000\002င\001\003င\002", new Object[] { "zze", "zzf", "zzg", "zzh" });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new M1();
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
 * Qualified Name:     com.google.android.gms.internal.measurement.M1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */