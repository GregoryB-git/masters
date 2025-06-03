package s0;

import java.util.Arrays;

public final class j1
  extends h1<i1, i1>
{
  public final void a(Object paramObject, int paramInt1, int paramInt2)
  {
    ((i1)paramObject).b(paramInt1 << 3 | 0x5, Integer.valueOf(paramInt2));
  }
  
  public final void b(Object paramObject, int paramInt, long paramLong)
  {
    ((i1)paramObject).b(paramInt << 3 | 0x1, Long.valueOf(paramLong));
  }
  
  public final void c(int paramInt, Object paramObject1, Object paramObject2)
  {
    ((i1)paramObject1).b(paramInt << 3 | 0x3, (i1)paramObject2);
  }
  
  public final void d(Object paramObject, int paramInt, g paramg)
  {
    ((i1)paramObject).b(paramInt << 3 | 0x2, paramg);
  }
  
  public final void e(Object paramObject, int paramInt, long paramLong)
  {
    ((i1)paramObject).b(paramInt << 3 | 0x0, Long.valueOf(paramLong));
  }
  
  public final i1 f(Object paramObject)
  {
    v localv = (v)paramObject;
    i1 locali1 = unknownFields;
    paramObject = locali1;
    if (locali1 == i1.f)
    {
      paramObject = new i1();
      unknownFields = ((i1)paramObject);
    }
    return (i1)paramObject;
  }
  
  public final i1 g(Object paramObject)
  {
    return unknownFields;
  }
  
  public final int h(Object paramObject)
  {
    return ((i1)paramObject).a();
  }
  
  public final int i(Object paramObject)
  {
    i1 locali1 = (i1)paramObject;
    int i = d;
    if (i == -1)
    {
      int j = 0;
      i = 0;
      while (j < a)
      {
        int k = b[j];
        paramObject = (g)c[j];
        int m = j.N(1);
        k = j.O(2, k >>> 3);
        i += j.w(3, (g)paramObject) + (k + m * 2);
        j++;
      }
      d = i;
    }
    return i;
  }
  
  public final void j(Object paramObject)
  {
    unknownFields.e = false;
  }
  
  public final i1 k(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (i1)paramObject1;
    i1 locali1 = (i1)paramObject2;
    if (!locali1.equals(i1.f))
    {
      int i = a + a;
      int[] arrayOfInt = Arrays.copyOf(b, i);
      System.arraycopy(b, 0, arrayOfInt, a, a);
      paramObject2 = Arrays.copyOf(c, i);
      System.arraycopy(c, 0, paramObject2, a, a);
      paramObject1 = new i1(i, arrayOfInt, (Object[])paramObject2, true);
    }
    return (i1)paramObject1;
  }
  
  public final i1 m()
  {
    return new i1();
  }
  
  public final void n(Object paramObject1, Object paramObject2)
  {
    paramObject2 = (i1)paramObject2;
    unknownFields = ((i1)paramObject2);
  }
  
  public final void o(Object paramObject1, Object paramObject2)
  {
    paramObject2 = (i1)paramObject2;
    unknownFields = ((i1)paramObject2);
  }
  
  public final void p() {}
  
  public final i1 q(Object paramObject)
  {
    paramObject = (i1)paramObject;
    e = false;
    return (i1)paramObject;
  }
  
  public final void r(Object paramObject, k paramk)
  {
    paramObject = (i1)paramObject;
    paramObject.getClass();
    paramk.getClass();
    for (int i = 0; i < a; i++) {
      paramk.l(b[i] >>> 3, c[i]);
    }
  }
  
  public final void s(Object paramObject, k paramk)
  {
    ((i1)paramObject).c(paramk);
  }
}

/* Location:
 * Qualified Name:     s0.j1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */