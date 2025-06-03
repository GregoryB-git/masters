package com.google.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class i
  implements n0
{
  public final h a;
  
  public i(h paramh)
  {
    paramh = (h)t.b(paramh, "output");
    a = paramh;
    a = this;
  }
  
  public static i P(h paramh)
  {
    i locali = a;
    if (locali != null) {
      return locali;
    }
    return new i(paramh);
  }
  
  public void A(int paramInt, String paramString)
  {
    a.L0(paramInt, paramString);
  }
  
  public void B(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.N0(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += h.J(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      a.P0(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.I0(((Integer)paramList.get(paramInt)).intValue());
      }
    }
    while (i < paramList.size())
    {
      a.H0(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public void C(int paramInt, long paramLong)
  {
    a.Q0(paramInt, paramLong);
  }
  
  public void D(int paramInt1, int paramInt2)
  {
    a.j0(paramInt1, paramInt2);
  }
  
  public void E(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.N0(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += h.y(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      a.P0(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.y0(((Long)paramList.get(paramInt)).longValue());
      }
    }
    while (i < paramList.size())
    {
      a.x0(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public void F(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.N0(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += h.l(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      a.P0(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.k0(((Integer)paramList.get(paramInt)).intValue());
      }
    }
    while (i < paramList.size())
    {
      a.j0(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public void G(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.N0(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += h.j(((Double)paramList.get(paramInt)).doubleValue());
        paramInt++;
      }
      a.P0(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.i0(((Double)paramList.get(paramInt)).doubleValue());
      }
    }
    while (i < paramList.size())
    {
      a.h0(paramInt, ((Double)paramList.get(i)).doubleValue());
      i++;
    }
  }
  
  public void H(int paramInt1, int paramInt2)
  {
    a.H0(paramInt1, paramInt2);
  }
  
  public void I(int paramInt, List paramList)
  {
    for (int i = 0; i < paramList.size(); i++) {
      a.f0(paramInt, (f)paramList.get(i));
    }
  }
  
  public void J(int paramInt, List paramList, Z paramZ)
  {
    for (int i = 0; i < paramList.size(); i++) {
      N(paramInt, paramList.get(i), paramZ);
    }
  }
  
  public void K(int paramInt, List paramList, Z paramZ)
  {
    for (int i = 0; i < paramList.size(); i++) {
      L(paramInt, paramList.get(i), paramZ);
    }
  }
  
  public void L(int paramInt, Object paramObject, Z paramZ)
  {
    a.s0(paramInt, (K)paramObject, paramZ);
  }
  
  public void M(int paramInt, f paramf)
  {
    a.f0(paramInt, paramf);
  }
  
  public void N(int paramInt, Object paramObject, Z paramZ)
  {
    a.z0(paramInt, (K)paramObject, paramZ);
  }
  
  public void O(int paramInt, D.a parama, Map paramMap)
  {
    if (a.W())
    {
      T(paramInt, parama, paramMap);
      return;
    }
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      a.N0(paramInt, 2);
      a.P0(D.b(parama, localEntry.getKey(), localEntry.getValue()));
      D.e(a, parama, localEntry.getKey(), localEntry.getValue());
    }
  }
  
  public final void Q(int paramInt, boolean paramBoolean, Object paramObject, D.a parama)
  {
    a.N0(paramInt, 2);
    a.P0(D.b(parama, Boolean.valueOf(paramBoolean), paramObject));
    D.e(a, parama, Boolean.valueOf(paramBoolean), paramObject);
  }
  
  public final void R(int paramInt, D.a parama, Map paramMap)
  {
    int i = paramMap.size();
    int[] arrayOfInt = new int[i];
    Object localObject = paramMap.keySet().iterator();
    int j = 0;
    for (int k = 0; ((Iterator)localObject).hasNext(); k++) {
      arrayOfInt[k] = ((Integer)((Iterator)localObject).next()).intValue();
    }
    Arrays.sort(arrayOfInt);
    for (k = j; k < i; k++)
    {
      j = arrayOfInt[k];
      localObject = paramMap.get(Integer.valueOf(j));
      a.N0(paramInt, 2);
      a.P0(D.b(parama, Integer.valueOf(j), localObject));
      D.e(a, parama, Integer.valueOf(j), localObject);
    }
  }
  
  public final void S(int paramInt, D.a parama, Map paramMap)
  {
    int i = paramMap.size();
    long[] arrayOfLong = new long[i];
    Object localObject = paramMap.keySet().iterator();
    int j = 0;
    for (int k = 0; ((Iterator)localObject).hasNext(); k++) {
      arrayOfLong[k] = ((Long)((Iterator)localObject).next()).longValue();
    }
    Arrays.sort(arrayOfLong);
    for (k = j; k < i; k++)
    {
      long l = arrayOfLong[k];
      localObject = paramMap.get(Long.valueOf(l));
      a.N0(paramInt, 2);
      a.P0(D.b(parama, Long.valueOf(l), localObject));
      D.e(a, parama, Long.valueOf(l), localObject);
    }
  }
  
  public final void T(int paramInt, D.a parama, Map paramMap)
  {
    switch (a.a[a.ordinal()])
    {
    default: 
      paramMap = new StringBuilder();
      paramMap.append("does not support key type: ");
      paramMap.append(a);
      throw new IllegalArgumentException(paramMap.toString());
    case 12: 
      U(paramInt, parama, paramMap);
      break;
    case 7: 
    case 8: 
    case 9: 
    case 10: 
    case 11: 
      S(paramInt, parama, paramMap);
      break;
    case 2: 
    case 3: 
    case 4: 
    case 5: 
    case 6: 
      R(paramInt, parama, paramMap);
      break;
    case 1: 
      Object localObject = paramMap.get(Boolean.FALSE);
      if (localObject != null) {
        Q(paramInt, false, localObject, parama);
      }
      paramMap = paramMap.get(Boolean.TRUE);
      if (paramMap != null) {
        Q(paramInt, true, paramMap, parama);
      }
      break;
    }
  }
  
  public final void U(int paramInt, D.a parama, Map paramMap)
  {
    int i = paramMap.size();
    String[] arrayOfString = new String[i];
    Object localObject1 = paramMap.keySet().iterator();
    int j = 0;
    for (int k = 0; ((Iterator)localObject1).hasNext(); k++) {
      arrayOfString[k] = ((String)((Iterator)localObject1).next());
    }
    Arrays.sort(arrayOfString);
    for (k = j; k < i; k++)
    {
      localObject1 = arrayOfString[k];
      Object localObject2 = paramMap.get(localObject1);
      a.N0(paramInt, 2);
      a.P0(D.b(parama, localObject1, localObject2));
      D.e(a, parama, localObject1, localObject2);
    }
  }
  
  public final void V(int paramInt, Object paramObject)
  {
    if ((paramObject instanceof String)) {
      a.L0(paramInt, (String)paramObject);
    } else {
      a.f0(paramInt, (f)paramObject);
    }
  }
  
  public void a(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.N0(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += h.w(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      a.P0(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.w0(((Integer)paramList.get(paramInt)).intValue());
      }
    }
    while (i < paramList.size())
    {
      a.v0(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public void b(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.N0(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += h.r(((Float)paramList.get(paramInt)).floatValue());
        paramInt++;
      }
      a.P0(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.q0(((Float)paramList.get(paramInt)).floatValue());
      }
    }
    while (i < paramList.size())
    {
      a.p0(paramInt, ((Float)paramList.get(i)).floatValue());
      i++;
    }
  }
  
  public void c(int paramInt, long paramLong)
  {
    a.x0(paramInt, paramLong);
  }
  
  public void d(int paramInt, boolean paramBoolean)
  {
    a.b0(paramInt, paramBoolean);
  }
  
  public void e(int paramInt1, int paramInt2)
  {
    a.O0(paramInt1, paramInt2);
  }
  
  public final void f(int paramInt, Object paramObject)
  {
    if ((paramObject instanceof f)) {
      a.C0(paramInt, (f)paramObject);
    } else {
      a.B0(paramInt, (K)paramObject);
    }
  }
  
  public void g(int paramInt1, int paramInt2)
  {
    a.D0(paramInt1, paramInt2);
  }
  
  public void h(int paramInt)
  {
    a.N0(paramInt, 3);
  }
  
  public void i(int paramInt1, int paramInt2)
  {
    a.v0(paramInt1, paramInt2);
  }
  
  public void j(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.N0(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += h.p(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      a.P0(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.o0(((Long)paramList.get(paramInt)).longValue());
      }
    }
    while (i < paramList.size())
    {
      a.n0(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public void k(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.N0(paramInt, 2);
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += h.F(((Integer)paramList.get(i)).intValue());
        i++;
      }
      a.P0(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.E0(((Integer)paramList.get(paramInt)).intValue());
      }
    }
    while (i < paramList.size())
    {
      a.D0(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public void l(int paramInt1, int paramInt2)
  {
    a.l0(paramInt1, paramInt2);
  }
  
  public void m(int paramInt, double paramDouble)
  {
    a.h0(paramInt, paramDouble);
  }
  
  public void n(int paramInt, long paramLong)
  {
    a.F0(paramInt, paramLong);
  }
  
  public void o(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.N0(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += h.H(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      a.P0(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.G0(((Long)paramList.get(paramInt)).longValue());
      }
    }
    while (i < paramList.size())
    {
      a.F0(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public void p(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.N0(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += h.n(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      a.P0(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.m0(((Integer)paramList.get(paramInt)).intValue());
      }
    }
    while (i < paramList.size())
    {
      a.l0(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public void q(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.N0(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += h.S(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      a.P0(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.R0(((Long)paramList.get(paramInt)).longValue());
      }
    }
    while (i < paramList.size())
    {
      a.Q0(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public void r(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.N0(paramInt, 2);
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += h.e(((Boolean)paramList.get(i)).booleanValue());
        i++;
      }
      a.P0(paramInt);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.c0(((Boolean)paramList.get(paramInt)).booleanValue());
      }
    }
    while (i < paramList.size())
    {
      a.b0(paramInt, ((Boolean)paramList.get(i)).booleanValue());
      i++;
    }
  }
  
  public void s(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.N0(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += h.Q(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      a.P0(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.P0(((Integer)paramList.get(paramInt)).intValue());
      }
    }
    while (i < paramList.size())
    {
      a.O0(paramInt, ((Integer)paramList.get(i)).intValue());
      i++;
    }
  }
  
  public void t(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = 0;
    int j = 0;
    if (paramBoolean)
    {
      a.N0(paramInt, 2);
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += h.L(((Long)paramList.get(paramInt)).longValue());
        paramInt++;
      }
      a.P0(i);
      for (paramInt = j; paramInt < paramList.size(); paramInt++) {
        a.K0(((Long)paramList.get(paramInt)).longValue());
      }
    }
    while (i < paramList.size())
    {
      a.J0(paramInt, ((Long)paramList.get(i)).longValue());
      i++;
    }
  }
  
  public void u(int paramInt, long paramLong)
  {
    a.n0(paramInt, paramLong);
  }
  
  public n0.a v()
  {
    return n0.a.o;
  }
  
  public void w(int paramInt, long paramLong)
  {
    a.J0(paramInt, paramLong);
  }
  
  public void x(int paramInt, float paramFloat)
  {
    a.p0(paramInt, paramFloat);
  }
  
  public void y(int paramInt, List paramList)
  {
    boolean bool = paramList instanceof z;
    int i = 0;
    int j = 0;
    if (bool)
    {
      z localz = (z)paramList;
      for (i = j; i < paramList.size(); i++) {
        V(paramInt, localz.n(i));
      }
    }
    while (i < paramList.size())
    {
      a.L0(paramInt, (String)paramList.get(i));
      i++;
    }
  }
  
  public void z(int paramInt)
  {
    a.N0(paramInt, 4);
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */