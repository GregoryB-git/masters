package com.google.android.gms.internal.measurement;

public final class n7
  implements k7
{
  public static final S2 a;
  public static final S2 b;
  public static final S2 c;
  public static final S2 d;
  public static final S2 e;
  public static final S2 f;
  public static final S2 g;
  public static final S2 h;
  public static final S2 i;
  public static final S2 j;
  public static final S2 k;
  public static final S2 l;
  public static final S2 m;
  public static final S2 n;
  
  static
  {
    a3 locala3 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
    a = locala3.d("measurement.redaction.app_instance_id", true);
    b = locala3.d("measurement.redaction.client_ephemeral_aiid_generation", true);
    c = locala3.d("measurement.redaction.config_redacted_fields", true);
    d = locala3.d("measurement.redaction.device_info", true);
    e = locala3.d("measurement.redaction.e_tag", true);
    f = locala3.d("measurement.redaction.enhanced_uid", true);
    g = locala3.d("measurement.redaction.populate_ephemeral_app_instance_id", true);
    h = locala3.d("measurement.redaction.google_signals", true);
    i = locala3.d("measurement.redaction.no_aiid_in_config_request", true);
    j = locala3.d("measurement.redaction.retain_major_os_version", true);
    k = locala3.d("measurement.redaction.scion_payload_generator", true);
    l = locala3.d("measurement.redaction.upload_redacted_fields", true);
    m = locala3.d("measurement.redaction.upload_subdomain_override", true);
    n = locala3.d("measurement.redaction.user_id", true);
  }
  
  public final boolean a()
  {
    return ((Boolean)j.f()).booleanValue();
  }
  
  public final boolean b()
  {
    return ((Boolean)k.f()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.n7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */