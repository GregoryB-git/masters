package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

public final class P7
  extends n
{
  public final T7 q;
  
  public P7(T7 paramT7)
  {
    super("internal.logger");
    q = paramT7;
    p.put("log", new S7(this, false, true));
    p.put("silent", new A7(this, "silent"));
    ((n)p.get("silent")).a("log", new S7(this, true, true));
    p.put("unmonitored", new R7(this, "unmonitored"));
    ((n)p.get("unmonitored")).a("log", new S7(this, false, false));
  }
  
  public final s b(f3 paramf3, List paramList)
  {
    return s.d;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.P7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */