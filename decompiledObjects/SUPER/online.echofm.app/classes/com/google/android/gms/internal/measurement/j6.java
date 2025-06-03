package com.google.android.gms.internal.measurement;

public final class j6
  implements g6
{
  public static final S2 a;
  public static final S2 b;
  public static final S2 c;
  public static final S2 d;
  
  static
  {
    a3 locala3 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
    a = locala3.d("measurement.client.consent_state_v1", true);
    b = locala3.d("measurement.client.3p_consent_state_v1", true);
    c = locala3.d("measurement.service.consent_state_v1_W36", true);
    d = locala3.b("measurement.service.storage_consent_support_version", 203600L);
  }
  
  public final long a()
  {
    return ((Long)d.f()).longValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.j6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */