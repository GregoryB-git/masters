package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class l
  implements r0
{
  public final k a;
  
  public l(k paramk)
  {
    paramk = (k)z.b(paramk, "output");
    a = paramk;
    a = this;
  }
  
  public static l P(k paramk)
  {
    l locall = a;
    if (locall != null) {
      return locall;
    }
    return new l(paramk);
  }
  
  public void A(int paramInt, String paramString)
  {
    a.C0(paramInt, paramString);
  }
  
  public void B(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.D0(paramInt, 2);
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += k.G(((Integer)paramList.get(i)).intValue());
        i++;
      }
      a.F0(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.z0(((Integer)paramList.get(paramInt)).intValue());
      }
    }
    while (i < paramList.size())
    {
      a.y0(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public void C(int paramInt, long paramLong)
  {
    a.G0(paramInt, paramLong);
  }
  
  public void D(int paramInt1, int paramInt2)
  {
    a.d0(paramInt1, paramInt2);
  }
  
  public void E(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.D0(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += k.w(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      a.F0(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.q0(((Long)paramList.get(paramInt)).longValue());
      }
    }
    while (i < paramList.size())
    {
      a.p0(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public void F(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.D0(paramInt, 2);
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += k.k(((Integer)paramList.get(i)).intValue());
        i++;
      }
      a.F0(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.e0(((Integer)paramList.get(paramInt)).intValue());
      }
    }
    while (i < paramList.size())
    {
      a.d0(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public void G(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.D0(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += k.i(((Double)paramList.get(paramInt)).doubleValue());
        paramInt++;
      }
      a.F0(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.c0(((Double)paramList.get(paramInt)).doubleValue());
      }
    }
    while (i < paramList.size())
    {
      a.b0(paramInt, ((Double)paramList.get(i)).doubleValue());
      i++;
    }
  }
  
  public void H(int paramInt1, int paramInt2)
  {
    a.y0(paramInt1, paramInt2);
  }
  
  public void I(int paramInt, List paramList)
  {
    for (int i = 0; i < paramList.size(); i++) {
      a.a0(paramInt, (h)paramList.get(i));
    }
  }
  
  public void J(int paramInt, List paramList, e0 parame0)
  {
    for (int i = 0; i < paramList.size(); i++) {
      O(paramInt, paramList.get(i), parame0);
    }
  }
  
  public void K(int paramInt, List paramList, e0 parame0)
  {
    for (int i = 0; i < paramList.size(); i++) {
      L(paramInt, paramList.get(i), parame0);
    }
  }
  
  public void L(int paramInt, Object paramObject, e0 parame0)
  {
    a.r0(paramInt, (O)paramObject, parame0);
  }
  
  public void M(int paramInt, h paramh)
  {
    a.a0(paramInt, paramh);
  }
  
  public void N(int paramInt, H.a parama, Map paramMap)
  {
    if (a.T())
    {
      Q(paramInt, parama, paramMap);
      return;
    }
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      a.D0(paramInt, 2);
      a.F0(H.a(parama, paramMap.getKey(), paramMap.getValue()));
      H.b(a, parama, paramMap.getKey(), paramMap.getValue());
    }
  }
  
  public void O(int paramInt, Object paramObject, e0 parame0)
  {
    a.l0(paramInt, (O)paramObject, parame0);
  }
  
  public final void Q(int paramInt, H.a parama, Map paramMap)
  {
    parama = a.a;
    throw null;
  }
  
  public final void R(int paramInt, Object paramObject)
  {
    if ((paramObject instanceof String)) {
      a.C0(paramInt, (String)paramObject);
    } else {
      a.a0(paramInt, (h)paramObject);
    }
  }
  
  public void a(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.D0(paramInt, 2);
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += k.u(((Integer)paramList.get(i)).intValue());
        i++;
      }
      a.F0(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.o0(((Integer)paramList.get(paramInt)).intValue());
      }
    }
    while (i < paramList.size())
    {
      a.n0(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public void b(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.D0(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += k.q(((Float)paramList.get(paramInt)).floatValue());
        paramInt++;
      }
      a.F0(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.k0(((Float)paramList.get(paramInt)).floatValue());
      }
    }
    while (i < paramList.size())
    {
      a.j0(paramInt, ((Float)paramList.get(i)).floatValue());
      i++;
    }
  }
  
  public void c(int paramInt, long paramLong)
  {
    a.p0(paramInt, paramLong);
  }
  
  public void d(int paramInt, boolean paramBoolean)
  {
    a.Y(paramInt, paramBoolean);
  }
  
  public void e(int paramInt1, int paramInt2)
  {
    a.E0(paramInt1, paramInt2);
  }
  
  public final void f(int paramInt, Object paramObject)
  {
    if ((paramObject instanceof h)) {
      a.t0(paramInt, (h)paramObject);
    } else {
      a.s0(paramInt, (O)paramObject);
    }
  }
  
  public void g(int paramInt1, int paramInt2)
  {
    a.u0(paramInt1, paramInt2);
  }
  
  public void h(int paramInt)
  {
    a.D0(paramInt, 3);
  }
  
  public void i(int paramInt1, int paramInt2)
  {
    a.n0(paramInt1, paramInt2);
  }
  
  public void j(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.D0(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += k.o(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      a.F0(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.i0(((Long)paramList.get(paramInt)).longValue());
      }
    }
    while (i < paramList.size())
    {
      a.h0(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public void k(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.D0(paramInt, 2);
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += k.C(((Integer)paramList.get(i)).intValue());
        i++;
      }
      a.F0(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.v0(((Integer)paramList.get(paramInt)).intValue());
      }
    }
    while (i < paramList.size())
    {
      a.u0(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public void l(int paramInt1, int paramInt2)
  {
    a.f0(paramInt1, paramInt2);
  }
  
  public void m(int paramInt, double paramDouble)
  {
    a.b0(paramInt, paramDouble);
  }
  
  public void n(int paramInt, long paramLong)
  {
    a.w0(paramInt, paramLong);
  }
  
  public void o(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.D0(paramInt, 2);
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += k.E(((Long)paramList.get(i)).longValue());
        i++;
      }
      a.F0(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.x0(((Long)paramList.get(paramInt)).longValue());
      }
    }
    while (i < paramList.size())
    {
      a.w0(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public void p(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.D0(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += k.m(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      a.F0(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.g0(((Integer)paramList.get(paramInt)).intValue());
      }
    }
    while (i < paramList.size())
    {
      a.f0(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public void q(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.D0(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += k.P(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      a.F0(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.H0(((Long)paramList.get(paramInt)).longValue());
      }
    }
    while (i < paramList.size())
    {
      a.G0(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public void r(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.D0(paramInt, 2);
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += k.e(((Boolean)paramList.get(i)).booleanValue());
        i++;
      }
      a.F0(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.Z(((Boolean)paramList.get(paramInt)).booleanValue());
      }
    }
    while (i < paramList.size())
    {
      a.Y(paramInt, ((Boolean)paramList.get(i)).booleanValue());
      i++;
    }
  }
  
  public void s(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.D0(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += k.N(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      a.F0(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.F0(((Integer)paramList.get(paramInt)).intValue());
      }
    }
    while (i < paramList.size())
    {
      a.E0(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public void t(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.D0(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += k.I(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      a.F0(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.B0(((Long)paramList.get(paramInt)).longValue());
      }
    }
    while (i < paramList.size())
    {
      a.A0(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public void u(int paramInt, long paramLong)
  {
    a.h0(paramInt, paramLong);
  }
  
  public r0.a v()
  {
    return r0.a.o;
  }
  
  public void w(int paramInt, long paramLong)
  {
    a.A0(paramInt, paramLong);
  }
  
  public void x(int paramInt, float paramFloat)
  {
    a.j0(paramInt, paramFloat);
  }
  
  public void y(int paramInt, List paramList)
  {
    boolean bool = paramList instanceof D;
    int i = 0;
    int j = 0;
    if (bool)
    {
      D localD = (D)paramList;
      for (i = j; i < paramList.size(); i++) {
        R(paramInt, localD.n(i));
      }
    }
    while (i < paramList.size())
    {
      a.C0(paramInt, (String)paramList.get(i));
      i++;
    }
  }
  
  public void z(int paramInt)
  {
    a.D0(paramInt, 4);
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */