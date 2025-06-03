package com.google.android.gms.internal.measurement;

public final class I6
  implements F6
{
  public static final S2 a;
  public static final S2 b;
  public static final S2 c;
  
  static
  {
    a3 locala3 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
    a = locala3.d("measurement.client.sessions.check_on_reset_and_enable2", true);
    b = locala3.d("measurement.client.sessions.check_on_startup", true);
    c = locala3.d("measurement.client.sessions.start_session_before_view_screen", true);
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
 * Qualified Name:     com.google.android.gms.internal.measurement.I6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */