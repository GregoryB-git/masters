package com.google.android.gms.internal.measurement;

public final class c7
  implements d7
{
  public static final S2 a;
  public static final S2 b;
  public static final S2 c;
  public static final S2 d;
  public static final S2 e;
  
  static
  {
    a3 locala3 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
    a = locala3.d("measurement.test.boolean_flag", false);
    b = locala3.a("measurement.test.double_flag", -3.0D);
    c = locala3.b("measurement.test.int_flag", -2L);
    d = locala3.b("measurement.test.long_flag", -1L);
    e = locala3.c("measurement.test.string_flag", "---");
  }
  
  public final double a()
  {
    return ((Double)b.f()).doubleValue();
  }
  
  public final long b()
  {
    return ((Long)c.f()).longValue();
  }
  
  public final long c()
  {
    return ((Long)d.f()).longValue();
  }
  
  public final String d()
  {
    return (String)e.f();
  }
  
  public final boolean f()
  {
    return ((Boolean)a.f()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.c7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */