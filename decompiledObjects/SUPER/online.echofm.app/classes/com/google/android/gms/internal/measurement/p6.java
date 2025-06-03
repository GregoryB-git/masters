package com.google.android.gms.internal.measurement;

public final class p6
  implements m6
{
  public static final S2 a;
  public static final S2 b;
  public static final S2 c;
  public static final S2 d;
  public static final S2 e;
  public static final S2 f;
  public static final S2 g;
  
  static
  {
    a3 locala3 = new a3(P2.a("com.google.android.gms.measurement")).f().e();
    a = locala3.d("measurement.dma_consent.client", false);
    b = locala3.d("measurement.dma_consent.client_bow_check", false);
    c = locala3.d("measurement.dma_consent.service", false);
    d = locala3.d("measurement.dma_consent.service_gcs_v2", false);
    e = locala3.d("measurement.dma_consent.service_npa_remote_default", false);
    f = locala3.d("measurement.dma_consent.service_split_batch_on_consent", false);
    g = locala3.b("measurement.id.dma_consent.service", 0L);
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
  
  public final boolean m()
  {
    return ((Boolean)f.f()).booleanValue();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.p6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */