package com.google.android.gms.internal.measurement;

public final class z7
  implements w7
{
  public static final S2 a;
  public static final S2 b;
  public static final S2 c;
  public static final S2 d;
  public static final S2 e;
  public static final S2 f;
  
  static
  {
    a3 locala3 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
    a = locala3.d("measurement.client.sessions.background_sessions_enabled", true);
    b = locala3.d("measurement.client.sessions.enable_fix_background_engagement", false);
    c = locala3.d("measurement.client.sessions.immediate_start_enabled_foreground", true);
    d = locala3.d("measurement.client.sessions.remove_expired_session_properties_enabled", true);
    e = locala3.d("measurement.client.sessions.session_id_enabled", true);
    f = locala3.b("measurement.id.client.sessions.enable_fix_background_engagement", 0L);
  }
  
  public final boolean a()
  {
    return ((Boolean)b.f()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.z7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */