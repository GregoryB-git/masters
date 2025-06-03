package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class k
  implements s0
{
  public final j a;
  
  public k(j paramj)
  {
    paramj = (j)y.b(paramj, "output");
    a = paramj;
    a = this;
  }
  
  public static k P(j paramj)
  {
    k localk = a;
    if (localk != null) {
      return localk;
    }
    return new k(paramj);
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
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += j.K(((Integer)paramList.get(i)).intValue());
        i++;
      }
      a.P0(paramInt);
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
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += j.x(((Long)paramList.get(i)).longValue());
        i++;
      }
      a.P0(paramInt);
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
        i += j.k(((Integer)paramList.get(paramInt)).intValue());
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
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += j.i(((Double)paramList.get(i)).doubleValue());
        i++;
      }
      a.P0(paramInt);
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
      a.f0(paramInt, (g)paramList.get(i));
    }
  }
  
  public void J(int paramInt, g paramg)
  {
    a.f0(paramInt, paramg);
  }
  
  public void K(int paramInt, Object paramObject, e0 parame0)
  {
    a.z0(paramInt, (O)paramObject, parame0);
  }
  
  public void L(int paramInt, List paramList, e0 parame0)
  {
    for (int i = 0; i < paramList.size(); i++) {
      K(paramInt, paramList.get(i), parame0);
    }
  }
  
  public void M(int paramInt, List paramList, e0 parame0)
  {
    for (int i = 0; i < paramList.size(); i++) {
      O(paramInt, paramList.get(i), parame0);
    }
  }
  
  public void N(int paramInt, H.a parama, Map paramMap)
  {
    if (a.Y())
    {
      T(paramInt, parama, paramMap);
      return;
    }
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      paramMap = (Map.Entry)localIterator.next();
      a.N0(paramInt, 2);
      a.P0(H.b(parama, paramMap.getKey(), paramMap.getValue()));
      H.e(a, parama, paramMap.getKey(), paramMap.getValue());
    }
  }
  
  public void O(int paramInt, Object paramObject, e0 parame0)
  {
    a.s0(paramInt, (O)paramObject, parame0);
  }
  
  public final void Q(int paramInt, boolean paramBoolean, Object paramObject, H.a parama)
  {
    a.N0(paramInt, 2);
    a.P0(H.b(parama, Boolean.valueOf(paramBoolean), paramObject));
    H.e(a, parama, Boolean.valueOf(paramBoolean), paramObject);
  }
  
  public final void R(int paramInt, H.a parama, Map paramMap)
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
      a.P0(H.b(parama, Integer.valueOf(j), localObject));
      H.e(a, parama, Integer.valueOf(j), localObject);
    }
  }
  
  public final void S(int paramInt, H.a parama, Map paramMap)
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
      a.P0(H.b(parama, Long.valueOf(l), localObject));
      H.e(a, parama, Long.valueOf(l), localObject);
    }
  }
  
  public final void T(int paramInt, H.a parama, Map paramMap)
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
  
  public final void U(int paramInt, H.a parama, Map paramMap)
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
      a.P0(H.b(parama, localObject1, localObject2));
      H.e(a, parama, localObject1, localObject2);
    }
  }
  
  public final void V(int paramInt, Object paramObject)
  {
    if ((paramObject instanceof String)) {
      a.L0(paramInt, (String)paramObject);
    } else {
      a.f0(paramInt, (g)paramObject);
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
        i += j.v(((Integer)paramList.get(paramInt)).intValue());
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
        i += j.q(((Float)paramList.get(paramInt)).floatValue());
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
    if ((paramObject instanceof g)) {
      a.C0(paramInt, (g)paramObject);
    } else {
      a.B0(paramInt, (O)paramObject);
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
        i += j.o(((Long)paramList.get(paramInt)).longValue());
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
      paramInt = 0;
      i = paramInt;
      while (paramInt < paramList.size())
      {
        i += j.G(((Integer)paramList.get(paramInt)).intValue());
        paramInt++;
      }
      a.P0(i);
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
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += j.I(((Long)paramList.get(i)).longValue());
        i++;
      }
      a.P0(paramInt);
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
        i += j.m(((Integer)paramList.get(paramInt)).intValue());
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
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += j.T(((Long)paramList.get(i)).longValue());
        i++;
      }
      a.P0(paramInt);
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
        paramInt += j.d(((Boolean)paramList.get(i)).booleanValue());
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
      i = 0;
      paramInt = i;
      while (i < paramList.size())
      {
        paramInt += j.R(((Integer)paramList.get(i)).intValue());
        i++;
      }
      a.P0(paramInt);
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
        i += j.M(((Long)paramList.get(paramInt)).longValue());
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
  
  public s0.a v()
  {
    return s0.a.o;
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
    boolean bool = paramList instanceof D;
    int i = 0;
    int j = 0;
    if (bool)
    {
      D localD = (D)paramList;
      for (i = j; i < paramList.size(); i++) {
        V(paramInt, localD.n(i));
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
 * Qualified Name:     androidx.datastore.preferences.protobuf.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */