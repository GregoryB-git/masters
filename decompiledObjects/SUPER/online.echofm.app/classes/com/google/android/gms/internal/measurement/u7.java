package com.google.android.gms.internal.measurement;

public final class u7
  implements v7
{
  public static final S2 a;
  public static final S2 b;
  public static final S2 c;
  public static final S2 d;
  
  static
  {
    a3 locala3 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
    a = locala3.d("measurement.collection.enable_session_stitching_token.client.dev", true);
    b = locala3.d("measurement.collection.enable_session_stitching_token.first_open_fix", true);
    c = locala3.d("measurement.session_stitching_token_enabled", false);
    d = locala3.d("measurement.link_sst_to_sid", true);
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
  
  public final boolean d()
  {
    return ((Boolean)c.f()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.u7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */