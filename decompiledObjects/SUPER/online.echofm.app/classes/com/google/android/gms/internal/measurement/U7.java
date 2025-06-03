package com.google.android.gms.internal.measurement;

import java.util.List;

public final class U7
  extends n
{
  public b q;
  
  public U7(b paramb)
  {
    super("internal.registerCallback");
    q = paramb;
  }
  
  public final s b(f3 paramf3, List paramList)
  {
    C2.g(o, 3, paramList);
    String str = paramf3.b((s)paramList.get(0)).g();
    s locals = paramf3.b((s)paramList.get(1));
    if ((locals instanceof t))
    {
      paramf3 = paramf3.b((s)paramList.get(2));
      if ((paramf3 instanceof r))
      {
        paramf3 = (r)paramf3;
        if (paramf3.q("type"))
        {
          paramList = paramf3.i("type").g();
          int i;
          if (paramf3.q("priority")) {
            i = C2.i(paramf3.i("priority").f().doubleValue());
          } else {
            i = 1000;
          }
          q.c(str, i, (t)locals, paramList);
          return s.d;
        }
        throw new IllegalArgumentException("Undefined rule type");
      }
      throw new IllegalArgumentException("Invalid callback params");
    }
    throw new IllegalArgumentException("Invalid callback type");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.U7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */