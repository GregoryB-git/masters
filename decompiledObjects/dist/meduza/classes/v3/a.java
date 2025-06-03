package v3;

import android.util.Pair;
import z4.e0;

public abstract class a
  extends r1
{
  public final int b;
  public final e0 c;
  public final boolean d;
  
  public a(boolean paramBoolean, e0 parame0)
  {
    d = paramBoolean;
    c = parame0;
    b = parame0.getLength();
  }
  
  public final int a(boolean paramBoolean)
  {
    if (b == 0) {
      return -1;
    }
    boolean bool = d;
    int i = 0;
    if (bool) {
      paramBoolean = false;
    }
    if (paramBoolean) {
      i = c.b();
    }
    while (x(i).p())
    {
      j = w(i, paramBoolean);
      i = j;
      if (j == -1) {
        return -1;
      }
    }
    int j = v(i);
    return x(i).a(paramBoolean) + j;
  }
  
  public final int b(Object paramObject)
  {
    boolean bool = paramObject instanceof Pair;
    int i = -1;
    if (!bool) {
      return -1;
    }
    Object localObject = (Pair)paramObject;
    paramObject = first;
    localObject = second;
    int j = q(paramObject);
    if (j == -1) {
      return -1;
    }
    int k = x(j).b(localObject);
    if (k != -1) {
      i = u(j) + k;
    }
    return i;
  }
  
  public final int c(boolean paramBoolean)
  {
    int i = b;
    if (i == 0) {
      return -1;
    }
    if (d) {
      paramBoolean = false;
    }
    int j;
    if (paramBoolean) {
      j = c.f();
    } else {
      j = i - 1;
    }
    while (x(j).p())
    {
      if (paramBoolean) {
        i = c.c(j);
      } else if (j > 0) {
        i = j - 1;
      } else {
        i = -1;
      }
      j = i;
      if (i == -1) {
        return -1;
      }
    }
    i = v(j);
    return x(j).c(paramBoolean) + i;
  }
  
  public final int e(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    boolean bool = d;
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
    int k = s(paramInt1);
    int m = v(k);
    r1 localr1 = x(k);
    if (j == 2) {
      paramInt2 = i;
    } else {
      paramInt2 = j;
    }
    paramInt1 = localr1.e(paramInt1 - m, paramInt2, paramBoolean);
    if (paramInt1 != -1) {
      return m + paramInt1;
    }
    for (paramInt1 = w(k, paramBoolean); (paramInt1 != -1) && (x(paramInt1).p()); paramInt1 = w(paramInt1, paramBoolean)) {}
    if (paramInt1 != -1)
    {
      paramInt2 = v(paramInt1);
      return x(paramInt1).a(paramBoolean) + paramInt2;
    }
    if (j == 2) {
      return a(paramBoolean);
    }
    return -1;
  }
  
  public final r1.b f(int paramInt, r1.b paramb, boolean paramBoolean)
  {
    int i = r(paramInt);
    int j = v(i);
    int k = u(i);
    x(i).f(paramInt - k, paramb, paramBoolean);
    c += j;
    if (paramBoolean)
    {
      Object localObject1 = t(i);
      Object localObject2 = b;
      localObject2.getClass();
      b = Pair.create(localObject1, localObject2);
    }
    return paramb;
  }
  
  public final r1.b g(Object paramObject, r1.b paramb)
  {
    Object localObject1 = (Pair)paramObject;
    Object localObject2 = first;
    localObject1 = second;
    int i = q(localObject2);
    int j = v(i);
    x(i).g(localObject1, paramb);
    c += j;
    b = paramObject;
    return paramb;
  }
  
  public final int k(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    boolean bool = d;
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
    int k = s(paramInt1);
    int m = v(k);
    r1 localr1 = x(k);
    if (j == 2) {
      paramInt2 = i;
    } else {
      paramInt2 = j;
    }
    paramInt1 = localr1.k(paramInt1 - m, paramInt2, paramBoolean);
    if (paramInt1 != -1) {
      return m + paramInt1;
    }
    if (paramBoolean)
    {
      paramInt1 = c.c(k);
    }
    else
    {
      paramInt2 = j;
      bool = paramBoolean;
      if (k > 0)
      {
        paramInt1 = k - 1;
      }
      else
      {
        paramInt1 = -1;
        paramBoolean = bool;
        j = paramInt2;
      }
    }
    for (;;)
    {
      if ((paramInt1 == -1) || (!x(paramInt1).p())) {
        break label186;
      }
      if (paramBoolean)
      {
        paramInt1 = c.c(paramInt1);
      }
      else
      {
        paramInt2 = j;
        bool = paramBoolean;
        if (paramInt1 <= 0) {
          break;
        }
        paramInt1--;
      }
    }
    label186:
    if (paramInt1 != -1)
    {
      paramInt2 = v(paramInt1);
      return x(paramInt1).c(paramBoolean) + paramInt2;
    }
    if (j == 2) {
      return c(paramBoolean);
    }
    return -1;
  }
  
  public final Object l(int paramInt)
  {
    int i = r(paramInt);
    int j = u(i);
    Object localObject = x(i).l(paramInt - j);
    return Pair.create(t(i), localObject);
  }
  
  public final r1.c n(int paramInt, r1.c paramc, long paramLong)
  {
    int i = s(paramInt);
    int j = v(i);
    int k = u(i);
    x(i).n(paramInt - j, paramc, paramLong);
    Object localObject = t(i);
    if (!r1.c.z.equals(a)) {
      localObject = Pair.create(localObject, a);
    }
    a = localObject;
    w += k;
    x += k;
    return paramc;
  }
  
  public abstract int q(Object paramObject);
  
  public abstract int r(int paramInt);
  
  public abstract int s(int paramInt);
  
  public abstract Object t(int paramInt);
  
  public abstract int u(int paramInt);
  
  public abstract int v(int paramInt);
  
  public final int w(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      paramInt = c.d(paramInt);
    } else if (paramInt < b - 1) {
      paramInt++;
    } else {
      paramInt = -1;
    }
    return paramInt;
  }
  
  public abstract r1 x(int paramInt);
}

/* Location:
 * Qualified Name:     v3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */