package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class X7
  extends n
{
  public final X4 q;
  public final Map r = new HashMap();
  
  public X7(X4 paramX4)
  {
    super("require");
    q = paramX4;
  }
  
  public final s b(f3 paramf3, List paramList)
  {
    C2.g("require", 1, paramList);
    paramList = paramf3.b((s)paramList.get(0)).g();
    if (r.containsKey(paramList)) {
      return (s)r.get(paramList);
    }
    paramf3 = q.a(paramList);
    if ((paramf3 instanceof n)) {
      r.put(paramList, (n)paramf3);
    }
    return paramf3;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.X7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */