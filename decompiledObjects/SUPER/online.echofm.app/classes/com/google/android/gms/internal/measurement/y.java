package com.google.android.gms.internal.measurement;

import java.util.List;

public final class y
  extends A
{
  public y()
  {
    a.add(Z.t);
    a.add(Z.u);
    a.add(Z.v);
    a.add(Z.w);
    a.add(Z.x);
    a.add(Z.y);
    a.add(Z.z);
  }
  
  public final s b(String paramString, f3 paramf3, List paramList)
  {
    switch (B.a[C2.c(paramString).ordinal()])
    {
    default: 
      return super.a(paramString);
    case 7: 
      C2.f(Z.z, 2, paramList);
      return new k(Double.valueOf(C2.i(paramf3.b((s)paramList.get(0)).f().doubleValue()) ^ C2.i(paramf3.b((s)paramList.get(1)).f().doubleValue())));
    case 6: 
      C2.f(Z.y, 2, paramList);
      return new k(Double.valueOf(C2.m(paramf3.b((s)paramList.get(0)).f().doubleValue()) >>> (int)(C2.m(paramf3.b((s)paramList.get(1)).f().doubleValue()) & 0x1F)));
    case 5: 
      C2.f(Z.x, 2, paramList);
      return new k(Double.valueOf(C2.i(paramf3.b((s)paramList.get(0)).f().doubleValue()) >> (int)(C2.m(paramf3.b((s)paramList.get(1)).f().doubleValue()) & 0x1F)));
    case 4: 
      C2.f(Z.w, 2, paramList);
      return new k(Double.valueOf(C2.i(paramf3.b((s)paramList.get(0)).f().doubleValue()) | C2.i(paramf3.b((s)paramList.get(1)).f().doubleValue())));
    case 3: 
      C2.f(Z.v, 1, paramList);
      return new k(Double.valueOf(C2.i(paramf3.b((s)paramList.get(0)).f().doubleValue())));
    case 2: 
      C2.f(Z.u, 2, paramList);
      return new k(Double.valueOf(C2.i(paramf3.b((s)paramList.get(0)).f().doubleValue()) << (int)(C2.m(paramf3.b((s)paramList.get(1)).f().doubleValue()) & 0x1F)));
    }
    C2.f(Z.t, 2, paramList);
    return new k(Double.valueOf(C2.i(paramf3.b((s)paramList.get(0)).f().doubleValue()) & C2.i(paramf3.b((s)paramList.get(1)).f().doubleValue())));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */