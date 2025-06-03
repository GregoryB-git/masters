package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

public final class y4
  extends n
{
  public final d q;
  
  public y4(d paramd)
  {
    super("internal.eventLogger");
    q = paramd;
  }
  
  public final s b(f3 paramf3, List paramList)
  {
    C2.g(o, 3, paramList);
    String str = paramf3.b((s)paramList.get(0)).g();
    long l = C2.a(paramf3.b((s)paramList.get(1)).f().doubleValue());
    paramf3 = paramf3.b((s)paramList.get(2));
    if ((paramf3 instanceof r)) {
      paramf3 = C2.e((r)paramf3);
    } else {
      paramf3 = new HashMap();
    }
    q.c(str, l, paramf3);
    return s.d;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.y4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */