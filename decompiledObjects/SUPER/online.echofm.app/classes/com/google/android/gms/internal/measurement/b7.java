package com.google.android.gms.internal.measurement;

public final class b7
  implements X6
{
  public static final S2 a;
  public static final S2 b;
  public static final S2 c;
  
  static
  {
    a3 locala3 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
    a = locala3.b("measurement.id.lifecycle.app_in_background_parameter", 0L);
    b = locala3.d("measurement.lifecycle.app_backgrounded_tracking", true);
    c = locala3.d("measurement.lifecycle.app_in_background_parameter", false);
  }
  
  public final boolean a()
  {
    return ((Boolean)c.f()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.b7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */