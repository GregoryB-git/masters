package com.google.protobuf;

import java.lang.reflect.Constructor;
import java.util.List;

public abstract class b0
{
  public static final Class a = ;
  public static final g0 b = A(false);
  public static final g0 c = A(true);
  public static final g0 d = new i0();
  
  public static g0 A(boolean paramBoolean)
  {
    try
    {
      Object localObject1 = B();
      if (localObject1 == null) {
        return null;
      }
      localObject1 = (g0)((Class)localObject1).getConstructor(new Class[] { Boolean.TYPE }).newInstance(new Object[] { Boolean.valueOf(paramBoolean) });
      return (g0)localObject1;
    }
    finally {}
    return null;
  }
  
  public static Class B()
  {
    try
    {
      Class localClass = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
      return localClass;
    }
    finally {}
    return null;
  }
  
  public static void C(l paraml, Object paramObject1, Object paramObject2)
  {
    paramObject2 = paraml.b(paramObject2);
    if (!((o)paramObject2).j()) {
      paraml.c(paramObject1).p((o)paramObject2);
    }
  }
  
  public static void D(F paramF, Object paramObject1, Object paramObject2, long paramLong)
  {
    k0.R(paramObject1, paramLong, paramF.a(k0.C(paramObject1, paramLong), k0.C(paramObject2, paramLong)));
  }
  
  public static void E(g0 paramg0, Object paramObject1, Object paramObject2)
  {
    paramg0.f(paramObject1, paramg0.e(paramg0.a(paramObject1), paramg0.a(paramObject2)));
  }
  
  public static g0 F()
  {
    return b;
  }
  
  public static g0 G()
  {
    return c;
  }
  
  public static void H(Class paramClass)
  {
    if (!r.class.isAssignableFrom(paramClass))
    {
      Class localClass = a;
      if ((localClass != null) && (!localClass.isAssignableFrom(paramClass))) {
        throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
      }
    }
  }
  
  public static boolean I(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if ((paramObject1 != paramObject2) && ((paramObject1 == null) || (!paramObject1.equals(paramObject2)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static g0 J()
  {
    return d;
  }
  
  public static void K(int paramInt, List paramList, n0 paramn0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramn0.r(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void L(int paramInt, List paramList, n0 paramn0)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramn0.I(paramInt, paramList);
    }
  }
  
  public static void M(int paramInt, List paramList, n0 paramn0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramn0.G(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void N(int paramInt, List paramList, n0 paramn0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramn0.F(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void O(int paramInt, List paramList, n0 paramn0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramn0.p(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void P(int paramInt, List paramList, n0 paramn0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramn0.j(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void Q(int paramInt, List paramList, n0 paramn0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramn0.b(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void R(int paramInt, List paramList, n0 paramn0, Z paramZ)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramn0.K(paramInt, paramList, paramZ);
    }
  }
  
  public static void S(int paramInt, List paramList, n0 paramn0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramn0.a(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void T(int paramInt, List paramList, n0 paramn0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramn0.E(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void U(int paramInt, List paramList, n0 paramn0, Z paramZ)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramn0.J(paramInt, paramList, paramZ);
    }
  }
  
  public static void V(int paramInt, List paramList, n0 paramn0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramn0.k(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void W(int paramInt, List paramList, n0 paramn0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramn0.o(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void X(int paramInt, List paramList, n0 paramn0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramn0.B(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void Y(int paramInt, List paramList, n0 paramn0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramn0.t(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void Z(int paramInt, List paramList, n0 paramn0)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramn0.y(paramInt, paramList);
    }
  }
  
  public static int a(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    if (paramBoolean) {
      return h.O(paramInt) + h.z(i);
    }
    return i * h.d(paramInt, true);
  }
  
  public static void a0(int paramInt, List paramList, n0 paramn0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramn0.s(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int b(List paramList)
  {
    return paramList.size();
  }
  
  public static void b0(int paramInt, List paramList, n0 paramn0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramn0.q(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int c(int paramInt, List paramList)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    i *= h.O(paramInt);
    paramInt = j;
    j = i;
    while (paramInt < paramList.size())
    {
      j += h.h((f)paramList.get(paramInt));
      paramInt++;
    }
    return j;
  }
  
  public static int d(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = e(paramList);
    paramInt = h.O(paramInt);
    if (paramBoolean) {
      return paramInt + h.z(j);
    }
    return j + i * paramInt;
  }
  
  public static int e(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof s))
    {
      paramList = (s)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += h.l(paramList.F(k));
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += h.l(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static int f(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    if (paramBoolean) {
      return h.O(paramInt) + h.z(i * 4);
    }
    return i * h.m(paramInt, 0);
  }
  
  public static int g(List paramList)
  {
    return paramList.size() * 4;
  }
  
  public static int h(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    if (paramBoolean) {
      return h.O(paramInt) + h.z(i * 8);
    }
    return i * h.o(paramInt, 0L);
  }
  
  public static int i(List paramList)
  {
    return paramList.size() * 8;
  }
  
  public static int j(int paramInt, List paramList, Z paramZ)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    int k = 0;
    while (j < i)
    {
      k += h.s(paramInt, (K)paramList.get(j), paramZ);
      j++;
    }
    return k;
  }
  
  public static int k(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = l(paramList);
    paramInt = h.O(paramInt);
    if (paramBoolean) {
      return paramInt + h.z(j);
    }
    return j + i * paramInt;
  }
  
  public static int l(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof s))
    {
      paramList = (s)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += h.w(paramList.F(k));
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += h.w(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static int m(int paramInt, List paramList, boolean paramBoolean)
  {
    if (paramList.size() == 0) {
      return 0;
    }
    int i = n(paramList);
    if (paramBoolean) {
      return h.O(paramInt) + h.z(i);
    }
    return i + paramList.size() * h.O(paramInt);
  }
  
  public static int n(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof B))
    {
      paramList = (B)paramList;
      if (i > 0) {
        throw null;
      }
    }
    else
    {
      j = 0;
      while (k < i)
      {
        j += h.y(((Long)paramList.get(k)).longValue());
        k++;
      }
    }
    return j;
  }
  
  public static int o(int paramInt, Object paramObject, Z paramZ)
  {
    return h.A(paramInt, (K)paramObject, paramZ);
  }
  
  public static int p(int paramInt, List paramList, Z paramZ)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    int k = h.O(paramInt) * i;
    for (paramInt = j; paramInt < i; paramInt++) {
      k += h.C((K)paramList.get(paramInt), paramZ);
    }
    return k;
  }
  
  public static int q(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = r(paramList);
    paramInt = h.O(paramInt);
    if (paramBoolean) {
      return paramInt + h.z(j);
    }
    return j + i * paramInt;
  }
  
  public static int r(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof s))
    {
      paramList = (s)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += h.J(paramList.F(k));
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += h.J(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static int s(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = t(paramList);
    paramInt = h.O(paramInt);
    if (paramBoolean) {
      return paramInt + h.z(j);
    }
    return j + i * paramInt;
  }
  
  public static int t(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof B))
    {
      paramList = (B)paramList;
      if (i > 0) {
        throw null;
      }
    }
    else
    {
      j = 0;
      while (k < i)
      {
        j += h.L(((Long)paramList.get(k)).longValue());
        k++;
      }
    }
    return j;
  }
  
  public static int u(int paramInt, List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    int m = h.O(paramInt) * i;
    paramInt = m;
    Object localObject;
    if ((paramList instanceof z))
    {
      localObject = (z)paramList;
      paramInt = m;
      for (j = k;; j++)
      {
        m = paramInt;
        if (j >= i) {
          break;
        }
        paramList = ((z)localObject).n(j);
        if ((paramList instanceof f)) {}
        for (m = h.h((f)paramList);; m = h.N((String)paramList))
        {
          paramInt += m;
          break;
        }
      }
    }
    for (;;)
    {
      m = paramInt;
      if (j >= i) {
        break;
      }
      localObject = paramList.get(j);
      if ((localObject instanceof f)) {}
      for (m = h.h((f)localObject);; m = h.N((String)localObject))
      {
        paramInt += m;
        break;
      }
      j++;
    }
    return m;
  }
  
  public static int v(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = w(paramList);
    paramInt = h.O(paramInt);
    if (paramBoolean) {
      return paramInt + h.z(j);
    }
    return j + i * paramInt;
  }
  
  public static int w(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof s))
    {
      paramList = (s)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += h.Q(paramList.F(k));
        k++;
      }
    }
    int m = 0;
    for (k = j;; k++)
    {
      j = m;
      if (k >= i) {
        break;
      }
      m += h.Q(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static int x(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = y(paramList);
    paramInt = h.O(paramInt);
    if (paramBoolean) {
      return paramInt + h.z(j);
    }
    return j + i * paramInt;
  }
  
  public static int y(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof B))
    {
      paramList = (B)paramList;
      if (i > 0) {
        throw null;
      }
    }
    else
    {
      j = 0;
      while (k < i)
      {
        j += h.S(((Long)paramList.get(k)).longValue());
        k++;
      }
    }
    return j;
  }
  
  public static Class z()
  {
    try
    {
      Class localClass = Class.forName("com.google.protobuf.GeneratedMessageV3");
      return localClass;
    }
    finally {}
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */