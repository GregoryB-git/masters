package com.google.android.gms.internal.measurement;

public final class I1$b
  extends Y3
  implements K4
{
  private static final b zzc;
  private static volatile T4 zzd;
  private int zze;
  private int zzf;
  private int zzg;
  
  static
  {
    b localb = new b();
    zzc = localb;
    Y3.t(b.class, localb);
  }
  
  public final I1.d H()
  {
    I1.d locald1 = I1.d.c(zzg);
    I1.d locald2 = locald1;
    if (locald1 == null) {
      locald2 = I1.d.p;
    }
    return locald2;
  }
  
  public final I1.e I()
  {
    I1.e locale1 = I1.e.c(zzf);
    I1.e locale2 = locale1;
    if (locale1 == null) {
      locale2 = I1.e.p;
    }
    return locale2;
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
      paramObject1 = I1.e.e();
      paramObject2 = I1.d.e();
      return Y3.q(zzc, "\001\002\000\001\001\002\002\000\000\000\001᠌\000\002᠌\001", new Object[] { "zze", "zzf", paramObject1, "zzg", paramObject2 });
    case 2: 
      label114:
      label119:
      return new a(null);
    }
    return new b();
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
 * Qualified Name:     com.google.android.gms.internal.measurement.I1.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */