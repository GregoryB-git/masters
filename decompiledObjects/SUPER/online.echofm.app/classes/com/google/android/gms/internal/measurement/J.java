package com.google.android.gms.internal.measurement;

import java.util.List;

public final class J
  extends A
{
  public J()
  {
    a.add(Z.q);
    a.add(Z.k0);
    a.add(Z.n0);
  }
  
  public final s b(String paramString, f3 paramf3, List paramList)
  {
    int i = M.a[C2.c(paramString).ordinal()];
    if (i != 1) {
      if (i != 2)
      {
        if (i != 3) {
          return super.a(paramString);
        }
        C2.f(Z.n0, 2, paramList);
        paramString = paramf3.b((s)paramList.get(0));
        if (paramString.d().booleanValue()) {
          return paramString;
        }
      }
    }
    do
    {
      return paramf3.b((s)paramList.get(1));
      C2.f(Z.k0, 1, paramList);
      return new h(Boolean.valueOf(paramf3.b((s)paramList.get(0)).d().booleanValue() ^ true));
      C2.f(Z.q, 2, paramList);
      paramString = paramf3.b((s)paramList.get(0));
    } while (paramString.d().booleanValue());
    return paramString;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.J
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */