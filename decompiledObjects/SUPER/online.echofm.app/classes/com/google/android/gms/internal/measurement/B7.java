package com.google.android.gms.internal.measurement;

public final class B7
  implements C7
{
  public static final S2 a;
  public static final S2 b;
  
  static
  {
    a3 locala3 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
    a = locala3.d("measurement.sfmc.client", true);
    b = locala3.d("measurement.sfmc.service", true);
  }
  
  public final boolean a()
  {
    return true;
  }
  
  public final boolean b()
  {
    return ((Boolean)a.f()).booleanValue();
  }
  
  public final boolean c()
  {
    return ((Boolean)b.f()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.B7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */