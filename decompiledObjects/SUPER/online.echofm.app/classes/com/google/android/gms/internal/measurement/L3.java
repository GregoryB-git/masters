package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class L3
  implements T5
{
  public final J3 a;
  
  public L3(J3 paramJ3)
  {
    paramJ3 = (J3)a4.f(paramJ3, "output");
    a = paramJ3;
    a = this;
  }
  
  public static L3 P(J3 paramJ3)
  {
    L3 localL3 = a;
    if (localL3 != null) {
      return localL3;
    }
    return new L3(paramJ3);
  }
  
  public final void A(int paramInt, long paramLong)
  {
    a.q0(paramInt, paramLong);
  }
  
  public final void B(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.V(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += J3.c(((Double)paramList.get(paramInt)).doubleValue());
        paramInt++;
      }
      a.U(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.F(((Double)paramList.get(paramInt)).doubleValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      a.I(paramInt, ((Double)paramList.get(i)).doubleValue());
      i++;
    }
  }
  
  public final void C(int paramInt, Object paramObject, Z4 paramZ4)
  {
    J3 localJ3 = a;
    paramObject = (I4)paramObject;
    localJ3.V(paramInt, 3);
    paramZ4.i(paramObject, a);
    localJ3.V(paramInt, 4);
  }
  
  public final void D(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.V(paramInt, 2);
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += J3.d(((Float)paramList.get(i)).floatValue());
        i++;
      }
      a.U(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.G(((Float)paramList.get(paramInt)).floatValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      a.J(paramInt, ((Float)paramList.get(i)).floatValue());
      i++;
    }
  }
  
  public final void E(int paramInt, String paramString)
  {
    a.q(paramInt, paramString);
  }
  
  public final void F(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.V(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += J3.f0(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      a.U(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.s(((Long)paramList.get(paramInt)).longValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      a.m(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void G(int paramInt1, int paramInt2)
  {
    a.y0(paramInt1, paramInt2);
  }
  
  public final void H(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.V(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += J3.o0(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      a.U(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.x0(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      a.y0(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void I(int paramInt, long paramLong)
  {
    a.L(paramInt, paramLong);
  }
  
  public final void J(int paramInt, List paramList)
  {
    for (int i = 0; i < paramList.size(); i++) {
      a.n(paramInt, (q3)paramList.get(i));
    }
  }
  
  public final void K(int paramInt1, int paramInt2)
  {
    a.K(paramInt1, paramInt2);
  }
  
  public final void L(int paramInt, List paramList, Z4 paramZ4)
  {
    for (int i = 0; i < paramList.size(); i++) {
      C(paramInt, paramList.get(i), paramZ4);
    }
  }
  
  public final void M(int paramInt, long paramLong)
  {
    a.m(paramInt, paramLong);
  }
  
  public final void N(int paramInt, double paramDouble)
  {
    a.I(paramInt, paramDouble);
  }
  
  public final void O(int paramInt, float paramFloat)
  {
    a.J(paramInt, paramFloat);
  }
  
  public final int a()
  {
    return W5.a;
  }
  
  public final void b(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.V(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += J3.S(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      a.U(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.s(((Long)paramList.get(paramInt)).longValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      a.m(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void c(int paramInt, boolean paramBoolean)
  {
    a.r(paramInt, paramBoolean);
  }
  
  public final void d(int paramInt, Object paramObject, Z4 paramZ4)
  {
    a.p(paramInt, (I4)paramObject, paramZ4);
  }
  
  public final void e(int paramInt)
  {
    a.V(paramInt, 4);
  }
  
  public final void f(int paramInt, q3 paramq3)
  {
    a.n(paramInt, paramq3);
  }
  
  public final void g(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.V(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += J3.k0(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      a.U(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.k(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      a.l(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void h(int paramInt1, int paramInt2)
  {
    a.b0(paramInt1, paramInt2);
  }
  
  public final void i(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.V(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += J3.n0(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      a.U(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.N(((Long)paramList.get(paramInt)).longValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      a.L(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void j(int paramInt, long paramLong)
  {
    a.L(paramInt, paramLong);
  }
  
  public final void k(int paramInt1, int paramInt2)
  {
    a.l(paramInt1, paramInt2);
  }
  
  public final void l(int paramInt)
  {
    a.V(paramInt, 3);
  }
  
  public final void m(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.V(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += J3.h(((Boolean)paramList.get(paramInt)).booleanValue());
        paramInt++;
      }
      a.U(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.O(((Boolean)paramList.get(paramInt)).booleanValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      a.r(paramInt, ((Boolean)paramList.get(i)).booleanValue());
      i++;
    }
  }
  
  public final void n(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.V(paramInt, 2);
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += J3.c0(((Integer)paramList.get(i)).intValue());
        i++;
      }
      a.U(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.k(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      a.l(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void o(int paramInt, D4 paramD4, Map paramMap)
  {
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      a.V(paramInt, 2);
      a.U(A4.a(paramD4, localEntry.getKey(), localEntry.getValue()));
      A4.b(a, paramD4, localEntry.getKey(), localEntry.getValue());
    }
  }
  
  public final void p(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.V(paramInt, 2);
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += J3.a0(((Long)paramList.get(i)).longValue());
        i++;
      }
      a.U(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.N(((Long)paramList.get(paramInt)).longValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      a.L(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void q(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.V(paramInt, 2);
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += J3.v0(((Integer)paramList.get(i)).intValue());
        i++;
      }
      a.U(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.U(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      a.b0(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void r(int paramInt1, int paramInt2)
  {
    a.K(paramInt1, paramInt2);
  }
  
  public final void s(int paramInt, long paramLong)
  {
    a.m(paramInt, paramLong);
  }
  
  public final void t(int paramInt, Object paramObject)
  {
    if ((paramObject instanceof q3))
    {
      a.M(paramInt, (q3)paramObject);
      return;
    }
    a.o(paramInt, (I4)paramObject);
  }
  
  public final void u(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.V(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += J3.X(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      a.U(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.H(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      a.K(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void v(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.V(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += J3.g0(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      a.U(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.H(((Integer)paramList.get(paramInt)).intValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      a.K(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public final void w(int paramInt, List paramList)
  {
    boolean bool = paramList instanceof n4;
    int i = 0;
    int j = 0;
    if (bool)
    {
      n4 localn4 = (n4)paramList;
      for (i = j; i < paramList.size(); i++)
      {
        Object localObject = localn4.l(i);
        if ((localObject instanceof String)) {
          a.q(paramInt, (String)localObject);
        } else {
          a.n(paramInt, (q3)localObject);
        }
      }
      return;
    }
    while (i < paramList.size())
    {
      a.q(paramInt, (String)paramList.get(i));
      i++;
    }
  }
  
  public final void x(int paramInt1, int paramInt2)
  {
    a.l(paramInt1, paramInt2);
  }
  
  public final void y(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.V(paramInt, 2);
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += J3.j0(((Long)paramList.get(i)).longValue());
        i++;
      }
      a.U(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.r0(((Long)paramList.get(paramInt)).longValue());
      }
      return;
    }
    while (i < paramList.size())
    {
      a.q0(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public final void z(int paramInt, List paramList, Z4 paramZ4)
  {
    for (int i = 0; i < paramList.size(); i++) {
      d(paramInt, paramList.get(i), paramZ4);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.L3
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */