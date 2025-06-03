package com.google.android.gms.internal.measurement;

public enum V3
{
  public final boolean o;
  
  static
  {
    V3 localV31 = new V3("SCALAR", 0, false);
    p = localV31;
    V3 localV32 = new V3("VECTOR", 1, true);
    q = localV32;
    V3 localV33 = new V3("PACKED_VECTOR", 2, true);
    r = localV33;
    V3 localV34 = new V3("MAP", 3, false);
    s = localV34;
    t = new V3[] { localV31, localV32, localV33, localV34 };
  }
  
  public V3(boolean paramBoolean)
  {
    o = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.V3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */