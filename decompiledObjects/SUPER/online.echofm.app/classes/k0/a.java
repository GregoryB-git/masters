package k0;

import android.util.Pair;
import d0.I;
import d0.I.b;
import d0.I.c;
import x0.T;

public abstract class a
  extends I
{
  public final int e;
  public final T f;
  public final boolean g;
  
  public a(boolean paramBoolean, T paramT)
  {
    g = paramBoolean;
    f = paramT;
    e = paramT.a();
  }
  
  public static Object v(Object paramObject)
  {
    return second;
  }
  
  public static Object w(Object paramObject)
  {
    return first;
  }
  
  public static Object y(Object paramObject1, Object paramObject2)
  {
    return Pair.create(paramObject1, paramObject2);
  }
  
  public abstract int A(int paramInt);
  
  public final int B(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramInt = f.c(paramInt);
    } else if (paramInt < e - 1) {
      paramInt++;
    } else {
      paramInt = -1;
    }
    return paramInt;
  }
  
  public final int C(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramInt = f.f(paramInt);
    } else if (paramInt > 0) {
      paramInt--;
    } else {
      paramInt = -1;
    }
    return paramInt;
  }
  
  public abstract I D(int paramInt);
  
  public int a(boolean paramBoolean)
  {
    if (e == 0) {
      return -1;
    }
    boolean bool = g;
    int i = 0;
    if (bool) {
      paramBoolean = false;
    }
    if (paramBoolean) {
      i = f.e();
    }
    while (D(i).q())
    {
      int j = B(i, paramBoolean);
      i = j;
      if (j == -1) {
        return -1;
      }
    }
    return A(i) + D(i).a(paramBoolean);
  }
  
  public final int b(Object paramObject)
  {
    boolean bool = paramObject instanceof Pair;
    int i = -1;
    if (!bool) {
      return -1;
    }
    Object localObject = w(paramObject);
    paramObject = v(paramObject);
    int j = s(localObject);
    if (j == -1) {
      return -1;
    }
    int k = D(j).b(paramObject);
    if (k != -1) {
      i = z(j) + k;
    }
    return i;
  }
  
  public int c(boolean paramBoolean)
  {
    int i = e;
    if (i == 0) {
      return -1;
    }
    if (g) {
      paramBoolean = false;
    }
    if (paramBoolean) {
      i = f.g();
    } else {
      i--;
    }
    while (D(i).q())
    {
      int j = C(i, paramBoolean);
      i = j;
      if (j == -1) {
        return -1;
      }
    }
    return A(i) + D(i).c(paramBoolean);
  }
  
  public int e(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    boolean bool = g;
    int i = 0;
    int j = paramInt2;
    if (bool)
    {
      j = paramInt2;
      if (paramInt2 == 1) {
        j = 2;
      }
      paramBoolean = false;
    }
    int k = u(paramInt1);
    int m = A(k);
    I localI = D(k);
    if (j == 2) {
      paramInt2 = i;
    } else {
      paramInt2 = j;
    }
    paramInt1 = localI.e(paramInt1 - m, paramInt2, paramBoolean);
    if (paramInt1 != -1) {
      return m + paramInt1;
    }
    for (paramInt1 = B(k, paramBoolean); (paramInt1 != -1) && (D(paramInt1).q()); paramInt1 = B(paramInt1, paramBoolean)) {}
    if (paramInt1 != -1) {
      return A(paramInt1) + D(paramInt1).a(paramBoolean);
    }
    if (j == 2) {
      return a(paramBoolean);
    }
    return -1;
  }
  
  public final I.b g(int paramInt, I.b paramb, boolean paramBoolean)
  {
    int i = t(paramInt);
    int j = A(i);
    int k = z(i);
    D(i).g(paramInt - k, paramb, paramBoolean);
    c += j;
    if (paramBoolean) {
      b = y(x(i), g0.a.e(b));
    }
    return paramb;
  }
  
  public final I.b h(Object paramObject, I.b paramb)
  {
    Object localObject1 = w(paramObject);
    Object localObject2 = v(paramObject);
    int i = s(localObject1);
    int j = A(i);
    D(i).h(localObject2, paramb);
    c += j;
    b = paramObject;
    return paramb;
  }
  
  public int l(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    boolean bool = g;
    int i = 0;
    int j = paramInt2;
    if (bool)
    {
      j = paramInt2;
      if (paramInt2 == 1) {
        j = 2;
      }
      paramBoolean = false;
    }
    int k = u(paramInt1);
    int m = A(k);
    I localI = D(k);
    if (j == 2) {
      paramInt2 = i;
    } else {
      paramInt2 = j;
    }
    paramInt1 = localI.l(paramInt1 - m, paramInt2, paramBoolean);
    if (paramInt1 != -1) {
      return m + paramInt1;
    }
    for (paramInt1 = C(k, paramBoolean); (paramInt1 != -1) && (D(paramInt1).q()); paramInt1 = C(paramInt1, paramBoolean)) {}
    if (paramInt1 != -1) {
      return A(paramInt1) + D(paramInt1).c(paramBoolean);
    }
    if (j == 2) {
      return c(paramBoolean);
    }
    return -1;
  }
  
  public final Object m(int paramInt)
  {
    int i = t(paramInt);
    int j = z(i);
    Object localObject = D(i).m(paramInt - j);
    return y(x(i), localObject);
  }
  
  public final I.c o(int paramInt, I.c paramc, long paramLong)
  {
    int i = u(paramInt);
    int j = A(i);
    int k = z(i);
    D(i).o(paramInt - j, paramc, paramLong);
    Object localObject = x(i);
    if (!I.c.q.equals(a)) {
      localObject = y(localObject, a);
    }
    a = localObject;
    n += k;
    o += k;
    return paramc;
  }
  
  public abstract int s(Object paramObject);
  
  public abstract int t(int paramInt);
  
  public abstract int u(int paramInt);
  
  public abstract Object x(int paramInt);
  
  public abstract int z(int paramInt);
}

/* Location:
 * Qualified Name:     k0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */