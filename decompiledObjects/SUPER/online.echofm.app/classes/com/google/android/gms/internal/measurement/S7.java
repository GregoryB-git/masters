package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class S7
  extends n
{
  public boolean q;
  public boolean r;
  
  public S7(P7 paramP7, boolean paramBoolean1, boolean paramBoolean2)
  {
    super("log");
    q = paramBoolean1;
    r = paramBoolean2;
  }
  
  public final s b(f3 paramf3, List paramList)
  {
    C2.k("log", 1, paramList);
    if (paramList.size() == 1)
    {
      P7.h(s).a(Q7.r, paramf3.b((s)paramList.get(0)).g(), Collections.emptyList(), q, r);
      return s.d;
    }
    Q7 localQ7 = Q7.c(C2.i(paramf3.b((s)paramList.get(0)).f().doubleValue()));
    String str = paramf3.b((s)paramList.get(1)).g();
    int i = paramList.size();
    int j = 2;
    if (i == 2) {
      paramf3 = P7.h(s);
    }
    ArrayList localArrayList;
    for (paramList = Collections.emptyList();; paramList = localArrayList)
    {
      paramf3.a(localQ7, str, paramList, q, r);
      break;
      localArrayList = new ArrayList();
      while (j < Math.min(paramList.size(), 5))
      {
        localArrayList.add(paramf3.b((s)paramList.get(j)).g());
        j++;
      }
      paramf3 = P7.h(s);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.S7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */