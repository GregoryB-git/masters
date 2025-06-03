package com.google.android.gms.internal.measurement;

import java.lang.reflect.Constructor;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public abstract class a5
{
  public static final Class a = ;
  public static final x5 b = A();
  public static final x5 c = new z5();
  
  public static x5 A()
  {
    try
    {
      Object localObject1 = I();
      if (localObject1 == null) {
        return null;
      }
      localObject1 = (x5)((Class)localObject1).getConstructor(new Class[0]).newInstance(new Object[0]);
      return (x5)localObject1;
    }
    finally {}
    return null;
  }
  
  public static void B(int paramInt, List paramList, T5 paramT5, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramT5.u(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int C(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return i * J3.P(paramInt, 0L);
  }
  
  public static int D(List paramList)
  {
    return paramList.size() << 3;
  }
  
  public static Class E()
  {
    try
    {
      Class localClass = Class.forName("com.google.protobuf.GeneratedMessage");
      return localClass;
    }
    finally {}
    return null;
  }
  
  public static void F(int paramInt, List paramList, T5 paramT5, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramT5.n(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int G(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return H(paramList) + i * J3.s0(paramInt);
  }
  
  public static int H(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof c4))
    {
      paramList = (c4)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += J3.g0(paramList.d(k));
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
      m += J3.g0(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static Class I()
  {
    try
    {
      Class localClass = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
      return localClass;
    }
    finally {}
    return null;
  }
  
  public static void J(int paramInt, List paramList, T5 paramT5, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramT5.b(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int K(int paramInt, List paramList, boolean paramBoolean)
  {
    if (paramList.size() == 0) {
      return 0;
    }
    return L(paramList) + paramList.size() * J3.s0(paramInt);
  }
  
  public static int L(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof w4))
    {
      paramList = (w4)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += J3.a0(paramList.l(k));
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
      m += J3.a0(((Long)paramList.get(k)).longValue());
    }
    return j;
  }
  
  public static void M(int paramInt, List paramList, T5 paramT5, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramT5.D(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int N(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return O(paramList) + i * J3.s0(paramInt);
  }
  
  public static int O(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof c4))
    {
      paramList = (c4)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += J3.o0(paramList.d(k));
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
      m += J3.o0(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static void P(int paramInt, List paramList, T5 paramT5, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramT5.v(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int Q(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return R(paramList) + i * J3.s0(paramInt);
  }
  
  public static int R(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof w4))
    {
      paramList = (w4)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += J3.j0(paramList.l(k));
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
      m += J3.j0(((Long)paramList.get(k)).longValue());
    }
    return j;
  }
  
  public static void S(int paramInt, List paramList, T5 paramT5, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramT5.p(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int T(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return U(paramList) + i * J3.s0(paramInt);
  }
  
  public static int U(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof c4))
    {
      paramList = (c4)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += J3.v0(paramList.d(k));
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
      m += J3.v0(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static void V(int paramInt, List paramList, T5 paramT5, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramT5.g(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int W(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return X(paramList) + i * J3.s0(paramInt);
  }
  
  public static int X(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof w4))
    {
      paramList = (w4)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += J3.n0(paramList.l(k));
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
      m += J3.n0(((Long)paramList.get(k)).longValue());
    }
    return j;
  }
  
  public static void Y(int paramInt, List paramList, T5 paramT5, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramT5.F(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void Z(int paramInt, List paramList, T5 paramT5, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramT5.H(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int a(int paramInt, Object paramObject, Z4 paramZ4)
  {
    return J3.R(paramInt, (I4)paramObject, paramZ4);
  }
  
  public static void a0(int paramInt, List paramList, T5 paramT5, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramT5.y(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int b(int paramInt, List paramList)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    i *= J3.s0(paramInt);
    paramInt = j;
    j = i;
    while (paramInt < paramList.size())
    {
      j += J3.A((q3)paramList.get(paramInt));
      paramInt++;
    }
    return j;
  }
  
  public static void b0(int paramInt, List paramList, T5 paramT5, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramT5.q(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int c(int paramInt, List paramList, Z4 paramZ4)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    int k = 0;
    while (j < i)
    {
      k += J3.x(paramInt, (I4)paramList.get(j), paramZ4);
      j++;
    }
    return k;
  }
  
  public static void c0(int paramInt, List paramList, T5 paramT5, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramT5.i(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int d(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return i * J3.z(paramInt, true);
  }
  
  public static int e(List paramList)
  {
    return paramList.size();
  }
  
  public static x5 f()
  {
    return b;
  }
  
  public static Object g(Object paramObject1, int paramInt1, int paramInt2, Object paramObject2, x5 paramx5)
  {
    Object localObject = paramObject2;
    if (paramObject2 == null) {
      localObject = paramx5.i(paramObject1);
    }
    paramx5.f(localObject, paramInt1, paramInt2);
    return localObject;
  }
  
  public static Object h(Object paramObject1, int paramInt, List paramList, g4 paramg4, Object paramObject2, x5 paramx5)
  {
    if (paramg4 == null) {
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
        if (paramg4.e(m))
        {
          if (j != k) {
            paramList.set(k, localObject);
          }
          k++;
        }
        else
        {
          paramObject2 = g(paramObject1, paramInt, m, paramObject2, paramx5);
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
        if (!paramg4.e(j))
        {
          paramObject2 = g(paramObject1, paramInt, j, paramObject2, paramx5);
          paramList.remove();
        }
      }
    }
    return localObject;
  }
  
  public static void i(int paramInt, List paramList, T5 paramT5)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramT5.J(paramInt, paramList);
    }
  }
  
  public static void j(int paramInt, List paramList, T5 paramT5, Z4 paramZ4)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramT5.L(paramInt, paramList, paramZ4);
    }
  }
  
  public static void k(int paramInt, List paramList, T5 paramT5, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramT5.m(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void l(O3 paramO3, Object paramObject1, Object paramObject2)
  {
    paramObject2 = paramO3.b(paramObject2);
    if (!a.isEmpty()) {
      paramO3.e(paramObject1).f((S3)paramObject2);
    }
  }
  
  public static void m(F4 paramF4, Object paramObject1, Object paramObject2, long paramLong)
  {
    D5.j(paramObject1, paramLong, paramF4.d(D5.B(paramObject1, paramLong), D5.B(paramObject2, paramLong)));
  }
  
  public static void n(x5 paramx5, Object paramObject1, Object paramObject2)
  {
    paramx5.j(paramObject1, paramx5.b(paramx5.k(paramObject1), paramx5.k(paramObject2)));
  }
  
  public static void o(Class paramClass)
  {
    if (!Y3.class.isAssignableFrom(paramClass))
    {
      Class localClass = a;
      if ((localClass != null) && (!localClass.isAssignableFrom(paramClass))) {
        throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
      }
    }
  }
  
  public static boolean p(Object paramObject1, Object paramObject2)
  {
    return (paramObject1 == paramObject2) || ((paramObject1 != null) && (paramObject1.equals(paramObject2)));
  }
  
  public static int q(int paramInt, List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    int m = J3.s0(paramInt) * i;
    paramInt = m;
    Object localObject;
    if ((paramList instanceof n4))
    {
      localObject = (n4)paramList;
      paramInt = m;
      for (j = k;; j++)
      {
        m = paramInt;
        if (j >= i) {
          break;
        }
        paramList = ((n4)localObject).l(j);
        if ((paramList instanceof q3)) {}
        for (m = J3.A((q3)paramList);; m = J3.C((String)paramList))
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
      if ((localObject instanceof q3)) {}
      for (m = J3.A((q3)localObject);; m = J3.C((String)localObject))
      {
        paramInt += m;
        break;
      }
      j++;
    }
    return m;
  }
  
  public static int r(int paramInt, List paramList, Z4 paramZ4)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    paramInt = J3.s0(paramInt) * i;
    while (j < i)
    {
      paramInt += J3.g((I4)paramList.get(j), paramZ4);
      j++;
    }
    return paramInt;
  }
  
  public static int s(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return t(paramList) + i * J3.s0(paramInt);
  }
  
  public static int t(List paramList)
  {
    int i = paramList.size();
    int j = 0;
    int k = 0;
    if (i == 0) {
      return 0;
    }
    if ((paramList instanceof c4))
    {
      paramList = (c4)paramList;
      m = 0;
      for (;;)
      {
        j = m;
        if (k >= i) {
          break;
        }
        m += J3.X(paramList.d(k));
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
      m += J3.X(((Integer)paramList.get(k)).intValue());
    }
    return j;
  }
  
  public static x5 u()
  {
    return c;
  }
  
  public static void v(int paramInt, List paramList, T5 paramT5)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramT5.w(paramInt, paramList);
    }
  }
  
  public static void w(int paramInt, List paramList, T5 paramT5, Z4 paramZ4)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramT5.z(paramInt, paramList, paramZ4);
    }
  }
  
  public static void x(int paramInt, List paramList, T5 paramT5, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      paramT5.B(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int y(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    return i * J3.h0(paramInt, 0);
  }
  
  public static int z(List paramList)
  {
    return paramList.size() << 2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.a5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */