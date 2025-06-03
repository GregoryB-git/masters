package com.google.android.gms.internal.measurement;

public final class k6
  implements l6
{
  public static final S2 a;
  public static final S2 b;
  
  static
  {
    a3 locala3 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
    a = locala3.d("measurement.service.deferred_first_open", false);
    b = locala3.b("measurement.id.service.deferred_first_open", 0L);
  }
  
  public final boolean a()
  {
    return true;
  }
  
  public final boolean b()
  {
    return ((Boolean)a.f()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.k6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */