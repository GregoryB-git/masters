package com.google.android.gms.internal.measurement;

public final class U6
  implements R6
{
  public static final S2 a;
  public static final S2 b;
  public static final S2 c;
  
  static
  {
    a3 locala3 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
    a = locala3.d("measurement.item_scoped_custom_parameters.client", true);
    b = locala3.d("measurement.item_scoped_custom_parameters.service", false);
    c = locala3.b("measurement.id.item_scoped_custom_parameters.service", 0L);
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
 * Qualified Name:     com.google.android.gms.internal.measurement.U6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */