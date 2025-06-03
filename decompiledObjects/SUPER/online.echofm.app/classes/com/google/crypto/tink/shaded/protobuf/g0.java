package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public abstract class g0
{
  public static final Class a = ;
  public static final k0 b = B(false);
  public static final k0 c = B(true);
  public static final k0 d = new m0();
  
  public static Class A()
  {
    try
    {
      Class localClass = Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessageV3");
      return localClass;
    }
    finally {}
    return null;
  }
  
  public static k0 B(boolean paramBoolean)
  {
    try
    {
      Object localObject1 = C();
      if (localObject1 == null) {
        return null;
      }
      localObject1 = (k0)((Class)localObject1).getConstructor(new Class[] { Boolean.TYPE }).newInstance(new Object[] { Boolean.valueOf(paramBoolean) });
      return (k0)localObject1;
    }
    finally {}
    return null;
  }
  
  public static Class C()
  {
    try
    {
      Class localClass = Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
      return localClass;
    }
    finally {}
    return null;
  }
  
  public static void D(q paramq, Object paramObject1, Object paramObject2)
  {
    paramObject2 = paramq.c(paramObject2);
    if (!((t)paramObject2).d()) {
      paramq.d(paramObject1).h((t)paramObject2);
    }
  }
  
  public static void E(J paramJ, Object paramObject1, Object paramObject2, long paramLong)
  {
    o0.R(paramObject1, paramLong, paramJ.a(o0.C(paramObject1, paramLong), o0.C(paramObject2, paramLong)));
  }
  
  public static void F(k0 paramk0, Object paramObject1, Object paramObject2)
  {
    paramk0.p(paramObject1, paramk0.k(paramk0.g(paramObject1), paramk0.g(paramObject2)));
  }
  
  public static k0 G()
  {
    return b;
  }
  
  public static k0 H()
  {
    return c;
  }
  
  public static void I(Class paramClass)
  {
    if (!x.class.isAssignableFrom(paramClass))
    {
      Class localClass = a;
      if ((localClass != null) && (!localClass.isAssignableFrom(paramClass))) {
        throw new IllegalArgumentException("Message classes must extend GeneratedMessageV3 or GeneratedMessageLite");
      }
    }
  }
  
  public static boolean J(Object paramObject1, Object paramObject2)
  {
    boolean bool;
    if ((paramObject1 != paramObject2) && ((paramObject1 == null) || (!paramObject1.equals(paramObject2)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  public static Object K(Object paramObject1, int paramInt1, int paramInt2, Object paramObject2, k0 paramk0)
  {
    Object localObject = paramObject2;
    if (paramObject2 == null) {
      localObject = paramk0.f(paramObject1);
    }
    paramk0.e(localObject, paramInt1, paramInt2);
    return localObject;
  }
  
  public static k0 L()
  {
    return d;
  }
  
  public static void M(int paramInt, List paramList, r0 paramr0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramr0.r(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void N(int paramInt, List paramList, r0 paramr0)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramr0.I(paramInt, paramList);
    }
  }
  
  public static void O(int paramInt, List paramList, r0 paramr0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramr0.G(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void P(int paramInt, List paramList, r0 paramr0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramr0.F(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void Q(int paramInt, List paramList, r0 paramr0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramr0.p(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void R(int paramInt, List paramList, r0 paramr0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramr0.j(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void S(int paramInt, List paramList, r0 paramr0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramr0.b(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void T(int paramInt, List paramList, r0 paramr0, e0 parame0)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramr0.J(paramInt, paramList, parame0);
    }
  }
  
  public static void U(int paramInt, List paramList, r0 paramr0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramr0.a(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void V(int paramInt, List paramList, r0 paramr0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramr0.E(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void W(int paramInt, List paramList, r0 paramr0, e0 parame0)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramr0.K(paramInt, paramList, parame0);
    }
  }
  
  public static void X(int paramInt, List paramList, r0 paramr0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramr0.k(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void Y(int paramInt, List paramList, r0 paramr0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramr0.o(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void Z(int paramInt, List paramList, r0 paramr0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramr0.B(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int a(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    if (paramBoolean) {
      return k.L(paramInt) + k.x(i);
    }
    return i * k.d(paramInt, true);
  }
  
  public static void a0(int paramInt, List paramList, r0 paramr0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramr0.t(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int b(List paramList)
  {
    return paramList.size();
  }
  
  public static void b0(int paramInt, List paramList, r0 paramr0)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramr0.y(paramInt, paramList);
    }
  }
  
  public static int c(int paramInt, List paramList)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    i *= k.L(paramInt);
    paramInt = j;
    j = i;
    while (paramInt < paramList.size())
    {
      j += k.g((h)paramList.get(paramInt));
      paramInt++;
    }
    return j;
  }
  
  public static void c0(int paramInt, List paramList, r0 paramr0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramr0.s(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int d(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = e(paramList);
    paramInt = k.L(paramInt);
    if (paramBoolean) {
      return paramInt + k.x(j);
    }
    return j + i * paramInt;
  }
  
  public static void d0(int paramInt, List paramList, r0 paramr0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramr0.q(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int e(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof y))
    {
      paramList = (y)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += k.k(paramList.F(k));
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
      m += k.k(((Integer)paramList.get(k)).intValue());
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
      return k.L(paramInt) + k.x(i * 4);
    }
    return i * k.l(paramInt, 0);
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
      return k.L(paramInt) + k.x(i * 8);
    }
    return i * k.n(paramInt, 0L);
  }
  
  public static int i(List paramList)
  {
    return paramList.size() * 8;
  }
  
  public static int j(int paramInt, List paramList, e0 parame0)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    int k = 0;
    while (j < i)
    {
      k += k.r(paramInt, (O)paramList.get(j), parame0);
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
    paramInt = k.L(paramInt);
    if (paramBoolean) {
      return paramInt + k.x(j);
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
    if ((paramList instanceof y))
    {
      paramList = (y)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += k.u(paramList.F(k));
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
      m += k.u(((Integer)paramList.get(k)).intValue());
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
      return k.L(paramInt) + k.x(i);
    }
    return i + paramList.size() * k.L(paramInt);
  }
  
  public static int n(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof F))
    {
      paramList = (F)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += k.w(paramList.f(k));
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
      m += k.w(((Long)paramList.get(k)).longValue());
    }
    return j;
  }
  
  public static int o(int paramInt, Object paramObject, e0 parame0)
  {
    return k.y(paramInt, (O)paramObject, parame0);
  }
  
  public static int p(int paramInt, List paramList, e0 parame0)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    paramInt = k.L(paramInt) * i;
    while (j < i)
    {
      paramInt += k.z((O)paramList.get(j), parame0);
      j++;
    }
    return paramInt;
  }
  
  public static int q(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = r(paramList);
    paramInt = k.L(paramInt);
    if (paramBoolean) {
      return paramInt + k.x(j);
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
    if ((paramList instanceof y))
    {
      paramList = (y)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += k.G(paramList.F(k));
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
      m += k.G(((Integer)paramList.get(k)).intValue());
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
    paramInt = k.L(paramInt);
    if (paramBoolean) {
      return paramInt + k.x(j);
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
    if ((paramList instanceof F))
    {
      paramList = (F)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += k.I(paramList.f(k));
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
      m += k.I(((Long)paramList.get(k)).longValue());
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
    int m = k.L(paramInt) * i;
    paramInt = m;
    Object localObject;
    if ((paramList instanceof D))
    {
      paramList = (D)paramList;
      paramInt = m;
      for (j = k;; j++)
      {
        m = paramInt;
        if (j >= i) {
          break;
        }
        localObject = paramList.n(j);
        if ((localObject instanceof h)) {}
        for (m = k.g((h)localObject);; m = k.K((String)localObject))
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
      if ((localObject instanceof h)) {}
      for (m = k.g((h)localObject);; m = k.K((String)localObject))
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
    paramInt = k.L(paramInt);
    if (paramBoolean) {
      return paramInt + k.x(j);
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
    if ((paramList instanceof y))
    {
      paramList = (y)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += k.N(paramList.F(k));
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
      m += k.N(((Integer)paramList.get(k)).intValue());
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
    paramInt = k.L(paramInt);
    if (paramBoolean) {
      return paramInt + k.x(j);
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
    if ((paramList instanceof F))
    {
      paramList = (F)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += k.P(paramList.f(k));
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
      m += k.P(((Long)paramList.get(k)).longValue());
    }
    return j;
  }
  
  public static Object z(Object paramObject1, int paramInt, List paramList, z.c paramc, Object paramObject2, k0 paramk0)
  {
    if (paramc == null) {
      return paramObject2;
    }
    int j;
    Object localObject;
    if ((paramList instanceof RandomAccess))
    {
      int i = paramList.size();
      j = 0;
      int k = 0;
      while (j < i)
      {
        localObject = (Integer)paramList.get(j);
        int m = ((Integer)localObject).intValue();
        if (paramc.a(m))
        {
          if (j != k) {
            paramList.set(k, localObject);
          }
          k++;
        }
        else
        {
          paramObject2 = K(paramObject1, paramInt, m, paramObject2, paramk0);
        }
        j++;
      }
      localObject = paramObject2;
      if (k != i)
      {
        paramList.subList(k, i).clear();
        localObject = paramObject2;
      }
    }
    else
    {
      paramList = paramList.iterator();
      for (;;)
      {
        localObject = paramObject2;
        if (!paramList.hasNext()) {
          break;
        }
        j = ((Integer)paramList.next()).intValue();
        if (!paramc.a(j))
        {
          paramObject2 = K(paramObject1, paramInt, j, paramObject2, paramk0);
          paramList.remove();
        }
      }
    }
    return localObject;
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.g0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */