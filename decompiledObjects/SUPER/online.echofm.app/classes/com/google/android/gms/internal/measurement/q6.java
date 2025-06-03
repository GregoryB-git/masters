package com.google.android.gms.internal.measurement;

public final class q6
  implements r6
{
  public static final S2 a;
  public static final S2 b;
  public static final S2 c;
  
  static
  {
    a3 locala3 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
    a = locala3.d("measurement.collection.event_safelist", true);
    b = locala3.d("measurement.service.store_null_safelist", true);
    c = locala3.d("measurement.service.store_safelist", true);
  }
  
  public final boolean a()
  {
    return true;
  }
  
  public final boolean b()
  {
    return ((Boolean)b.f()).booleanValue();
  }
  
  public final boolean c()
  {
    return ((Boolean)c.f()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.q6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */