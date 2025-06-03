package com.google.android.gms.internal.measurement;

public final class V6
  implements W6
{
  public static final S2 a;
  public static final S2 b;
  public static final S2 c;
  public static final S2 d;
  
  static
  {
    a3 locala3 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
    a = locala3.d("measurement.sdk.collection.enable_extend_user_property_size", true);
    b = locala3.d("measurement.sdk.collection.last_deep_link_referrer2", true);
    c = locala3.d("measurement.sdk.collection.last_deep_link_referrer_campaign2", false);
    d = locala3.b("measurement.id.sdk.collection.last_deep_link_referrer2", 0L);
  }
  
  public final boolean a()
  {
    return ((Boolean)c.f()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.V6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */