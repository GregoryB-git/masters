package com.google.android.gms.internal.measurement;

import java.util.List;

public final class Z6
  extends n
{
  public Z6(w5 paramw5, String paramString, y6 paramy6)
  {
    super(paramString);
  }
  
  public final s b(f3 paramf3, List paramList)
  {
    C2.g("getValue", 2, paramList);
    s locals = paramf3.b((s)paramList.get(0));
    paramf3 = paramf3.b((s)paramList.get(1));
    paramList = locals.g();
    paramList = q.i(paramList);
    if (paramList != null) {
      paramf3 = new u(paramList);
    }
    return paramf3;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.Z6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */