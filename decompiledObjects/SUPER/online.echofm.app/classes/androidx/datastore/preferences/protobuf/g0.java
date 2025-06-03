package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public abstract class g0
{
  public static final Class a = ;
  public static final l0 b = B(false);
  public static final l0 c = B(true);
  public static final l0 d = new n0();
  
  public static Class A()
  {
    try
    {
      Class localClass = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
      return localClass;
    }
    finally {}
    return null;
  }
  
  public static l0 B(boolean paramBoolean)
  {
    try
    {
      Object localObject1 = C();
      if (localObject1 == null) {
        return null;
      }
      localObject1 = (l0)((Class)localObject1).getConstructor(new Class[] { Boolean.TYPE }).newInstance(new Object[] { Boolean.valueOf(paramBoolean) });
      return (l0)localObject1;
    }
    finally {}
    return null;
  }
  
  public static Class C()
  {
    try
    {
      Class localClass = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
      return localClass;
    }
    finally {}
    return null;
  }
  
  public static void D(p paramp, Object paramObject1, Object paramObject2)
  {
    paramObject2 = paramp.c(paramObject2);
    if (!((s)paramObject2).j()) {
      paramp.d(paramObject1).p((s)paramObject2);
    }
  }
  
  public static void E(J paramJ, Object paramObject1, Object paramObject2, long paramLong)
  {
    p0.O(paramObject1, paramLong, paramJ.a(p0.A(paramObject1, paramLong), p0.A(paramObject2, paramLong)));
  }
  
  public static void F(l0 paraml0, Object paramObject1, Object paramObject2)
  {
    paraml0.p(paramObject1, paraml0.k(paraml0.g(paramObject1), paraml0.g(paramObject2)));
  }
  
  public static l0 G()
  {
    return b;
  }
  
  public static l0 H()
  {
    return c;
  }
  
  public static void I(Class paramClass)
  {
    if (!w.class.isAssignableFrom(paramClass))
    {
      Class localClass = a;
      if ((localClass != null) && (!localClass.isAssignableFrom(paramClass))) {
        throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
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
  
  public static Object K(int paramInt1, int paramInt2, Object paramObject, l0 paraml0)
  {
    Object localObject = paramObject;
    if (paramObject == null) {
      localObject = paraml0.n();
    }
    paraml0.e(localObject, paramInt1, paramInt2);
    return localObject;
  }
  
  public static l0 L()
  {
    return d;
  }
  
  public static void M(int paramInt, List paramList, s0 params0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      params0.r(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void N(int paramInt, List paramList, s0 params0)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      params0.I(paramInt, paramList);
    }
  }
  
  public static void O(int paramInt, List paramList, s0 params0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      params0.G(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void P(int paramInt, List paramList, s0 params0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      params0.F(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void Q(int paramInt, List paramList, s0 params0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      params0.p(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void R(int paramInt, List paramList, s0 params0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      params0.j(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void S(int paramInt, List paramList, s0 params0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      params0.b(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void T(int paramInt, List paramList, s0 params0, e0 parame0)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      params0.M(paramInt, paramList, parame0);
    }
  }
  
  public static void U(int paramInt, List paramList, s0 params0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      params0.a(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void V(int paramInt, List paramList, s0 params0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      params0.E(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void W(int paramInt, List paramList, s0 params0, e0 parame0)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      params0.L(paramInt, paramList, parame0);
    }
  }
  
  public static void X(int paramInt, List paramList, s0 params0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      params0.k(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void Y(int paramInt, List paramList, s0 params0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      params0.o(paramInt, paramList, paramBoolean);
    }
  }
  
  public static void Z(int paramInt, List paramList, s0 params0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      params0.B(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int a(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    if (paramBoolean) {
      return j.P(paramInt) + j.y(i);
    }
    return i * j.c(paramInt, true);
  }
  
  public static void a0(int paramInt, List paramList, s0 params0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      params0.t(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int b(List paramList)
  {
    return paramList.size();
  }
  
  public static void b0(int paramInt, List paramList, s0 params0)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      params0.y(paramInt, paramList);
    }
  }
  
  public static int c(int paramInt, List paramList)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    i *= j.P(paramInt);
    paramInt = j;
    j = i;
    while (paramInt < paramList.size())
    {
      j += j.g((g)paramList.get(paramInt));
      paramInt++;
    }
    return j;
  }
  
  public static void c0(int paramInt, List paramList, s0 params0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      params0.s(paramInt, paramList, paramBoolean);
    }
  }
  
  public static int d(int paramInt, List paramList, boolean paramBoolean)
  {
    int i = paramList.size();
    if (i == 0) {
      return 0;
    }
    int j = e(paramList);
    paramInt = j.P(paramInt);
    if (paramBoolean) {
      return paramInt + j.y(j);
    }
    return j + i * paramInt;
  }
  
  public static void d0(int paramInt, List paramList, s0 params0, boolean paramBoolean)
  {
    if ((paramList != null) && (!paramList.isEmpty())) {
      params0.q(paramInt, paramList, paramBoolean);
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
    if ((paramList instanceof x))
    {
      paramList = (x)paramList;
      if (i > 0) {
        throw null;
      }
    }
    else
    {
      j = 0;
      while (k < i)
      {
        j += j.k(((Integer)paramList.get(k)).intValue());
        k++;
      }
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
      return j.P(paramInt) + j.y(i * 4);
    }
    return i * j.l(paramInt, 0);
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
      return j.P(paramInt) + j.y(i * 8);
    }
    return i * j.n(paramInt, 0L);
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
      k += j.r(paramInt, (O)paramList.get(j), parame0);
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
    paramInt = j.P(paramInt);
    if (paramBoolean) {
      return paramInt + j.y(j);
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
    if ((paramList instanceof x))
    {
      paramList = (x)paramList;
      if (i > 0) {
        throw null;
      }
    }
    else
    {
      j = 0;
      while (k < i)
      {
        j += j.v(((Integer)paramList.get(k)).intValue());
        k++;
      }
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
      return j.P(paramInt) + j.y(i);
    }
    return i + paramList.size() * j.P(paramInt);
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
      if (i > 0) {
        throw null;
      }
    }
    else
    {
      j = 0;
      while (k < i)
      {
        j += j.x(((Long)paramList.get(k)).longValue());
        k++;
      }
    }
    return j;
  }
  
  public static int o(int paramInt, Object paramObject, e0 parame0)
  {
    return j.z(paramInt, (O)paramObject, parame0);
  }
  
  public static int p(int paramInt, List paramList, e0 parame0)
  {
    int i = paramList.size();
    int j = 0;
    if (i == 0) {
      return 0;
    }
    int k = j.P(paramInt) * i;
    for (paramInt = j; paramInt < i; paramInt++) {
      k += j.B((O)paramList.get(paramInt), parame0);
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
    paramInt = j.P(paramInt);
    if (paramBoolean) {
      return paramInt + j.y(j);
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
    if ((paramList instanceof x))
    {
      paramList = (x)paramList;
      if (i > 0) {
        throw null;
      }
    }
    else
    {
      j = 0;
      while (k < i)
      {
        j += j.K(((Integer)paramList.get(k)).intValue());
        k++;
      }
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
    paramInt = j.P(paramInt);
    if (paramBoolean) {
      return paramInt + j.y(j);
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
      if (i > 0) {
        throw null;
      }
    }
    else
    {
      j = 0;
      while (k < i)
      {
        j += j.M(((Long)paramList.get(k)).longValue());
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
    int m = j.P(paramInt) * i;
    paramInt = m;
    Object localObject;
    if ((paramList instanceof D))
    {
      localObject = (D)paramList;
      paramInt = m;
      for (j = k;; j++)
      {
        m = paramInt;
        if (j >= i) {
          break;
        }
        paramList = ((D)localObject).n(j);
        if ((paramList instanceof g)) {}
        for (m = j.g((g)paramList);; m = j.O((String)paramList))
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
      if ((localObject instanceof g)) {}
      for (m = j.g((g)localObject);; m = j.O((String)localObject))
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
    paramInt = j.P(paramInt);
    if (paramBoolean) {
      return paramInt + j.y(j);
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
    if ((paramList instanceof x))
    {
      paramList = (x)paramList;
      if (i > 0) {
        throw null;
      }
    }
    else
    {
      j = 0;
      while (k < i)
      {
        j += j.R(((Integer)paramList.get(k)).intValue());
        k++;
      }
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
    paramInt = j.P(paramInt);
    if (paramBoolean) {
      return paramInt + j.y(j);
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
      if (i > 0) {
        throw null;
      }
    }
    else
    {
      j = 0;
      while (k < i)
      {
        j += j.T(((Long)paramList.get(k)).longValue());
        k++;
      }
    }
    return j;
  }
  
  public static Object z(int paramInt, List paramList, y.a parama, Object paramObject, l0 paraml0)
  {
    if (parama == null) {
      return paramObject;
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
        if (parama.a(m))
        {
          if (j != k) {
            paramList.set(k, localObject);
          }
          k++;
        }
        else
        {
          paramObject = K(paramInt, m, paramObject, paraml0);
        }
        j++;
      }
      localObject = paramObject;
      if (k != i)
      {
        paramList.subList(k, i).clear();
        localObject = paramObject;
      }
    }
    else
    {
      paramList = paramList.iterator();
      for (;;)
      {
        localObject = paramObject;
        if (!paramList.hasNext()) {
          break;
        }
        j = ((Integer)paramList.next()).intValue();
        if (!parama.a(j))
        {
          paramObject = K(paramInt, j, paramObject, paraml0);
          paramList.remove();
        }
      }
    }
    return localObject;
  }
}

/* Location:
 * Qualified Name:     androidx.datastore.preferences.protobuf.g0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */