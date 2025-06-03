package com.google.android.gms.internal.measurement;

public final class C6
  implements z6
{
  public static final S2 a;
  public static final S2 b;
  public static final S2 c;
  public static final S2 d;
  
  static
  {
    a3 locala3 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
    a = locala3.d("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
    b = locala3.d("measurement.audience.refresh_event_count_filters_timestamp", false);
    c = locala3.d("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
    d = locala3.d("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
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
  
  public final boolean d()
  {
    return ((Boolean)d.f()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.C6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */