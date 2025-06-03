package com.google.android.gms.internal.measurement;

public final class i7
  implements j7
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
    a = locala3.d("measurement.rb.attribution.client2", false);
    b = locala3.d("measurement.rb.attribution.followup1.service", false);
    c = locala3.d("measurement.rb.attribution.service", false);
    d = locala3.d("measurement.rb.attribution.enable_trigger_redaction", true);
    e = locala3.d("measurement.rb.attribution.uuid_generation", true);
    f = locala3.b("measurement.id.rb.attribution.service", 0L);
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
  
  public final boolean f()
  {
    return ((Boolean)d.f()).booleanValue();
  }
  
  public final boolean g()
  {
    return ((Boolean)e.f()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.i7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */