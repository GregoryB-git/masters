package com.google.android.gms.internal.measurement;

import java.util.List;

public final class S
  extends A
{
  public S()
  {
    a.add(Z.p);
    a.add(Z.K);
    a.add(Z.h0);
    a.add(Z.i0);
    a.add(Z.j0);
    a.add(Z.p0);
    a.add(Z.q0);
    a.add(Z.s0);
    a.add(Z.t0);
    a.add(Z.w0);
  }
  
  public final s b(String paramString, f3 paramf3, List paramList)
  {
    switch (V.a[C2.c(paramString).ordinal()])
    {
    default: 
      return super.a(paramString);
    case 10: 
      C2.f(Z.w0, 2, paramList);
      paramString = paramf3.b((s)paramList.get(0));
      paramf3 = new k(Double.valueOf(paramf3.b((s)paramList.get(1)).f().doubleValue() * -1.0D));
      return new k(Double.valueOf(paramString.f().doubleValue() + paramf3.f().doubleValue()));
    case 8: 
    case 9: 
      C2.g(paramString, 1, paramList);
      return paramf3.b((s)paramList.get(0));
    case 6: 
    case 7: 
      C2.g(paramString, 2, paramList);
      paramString = paramf3.b((s)paramList.get(0));
      paramf3.b((s)paramList.get(1));
      return paramString;
    case 5: 
      C2.f(Z.j0, 1, paramList);
      return new k(Double.valueOf(paramf3.b((s)paramList.get(0)).f().doubleValue() * -1.0D));
    case 4: 
      C2.f(Z.i0, 2, paramList);
      return new k(Double.valueOf(paramf3.b((s)paramList.get(0)).f().doubleValue() * paramf3.b((s)paramList.get(1)).f().doubleValue()));
    case 3: 
      C2.f(Z.h0, 2, paramList);
      return new k(Double.valueOf(paramf3.b((s)paramList.get(0)).f().doubleValue() % paramf3.b((s)paramList.get(1)).f().doubleValue()));
    case 2: 
      C2.f(Z.K, 2, paramList);
      return new k(Double.valueOf(paramf3.b((s)paramList.get(0)).f().doubleValue() / paramf3.b((s)paramList.get(1)).f().doubleValue()));
    }
    C2.f(Z.p, 2, paramList);
    paramString = paramf3.b((s)paramList.get(0));
    paramf3 = paramf3.b((s)paramList.get(1));
    if ((!(paramString instanceof m)) && (!(paramString instanceof u)) && (!(paramf3 instanceof m)) && (!(paramf3 instanceof u))) {
      return new k(Double.valueOf(paramString.f().doubleValue() + paramf3.f().doubleValue()));
    }
    paramString = paramString.g();
    paramf3 = paramf3.g();
    paramList = new StringBuilder();
    paramList.append(paramString);
    paramList.append(paramf3);
    return new u(paramList.toString());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.S
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */