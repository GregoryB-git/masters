package ma;

import java.util.Arrays;

public final class r1
  extends p1<q1, q1>
{
  public final void a(Object paramObject, int paramInt1, int paramInt2)
  {
    ((q1)paramObject).c(paramInt1 << 3 | 0x5, Integer.valueOf(paramInt2));
  }
  
  public final void b(Object paramObject, int paramInt, long paramLong)
  {
    ((q1)paramObject).c(paramInt << 3 | 0x1, Long.valueOf(paramLong));
  }
  
  public final void c(int paramInt, Object paramObject1, Object paramObject2)
  {
    ((q1)paramObject1).c(paramInt << 3 | 0x3, (q1)paramObject2);
  }
  
  public final void d(Object paramObject, int paramInt, h paramh)
  {
    ((q1)paramObject).c(paramInt << 3 | 0x2, paramh);
  }
  
  public final void e(Object paramObject, int paramInt, long paramLong)
  {
    ((q1)paramObject).c(paramInt << 3 | 0x0, Long.valueOf(paramLong));
  }
  
  public final q1 f(Object paramObject)
  {
    w localw = (w)paramObject;
    q1 localq1 = unknownFields;
    paramObject = localq1;
    if (localq1 == q1.f)
    {
      paramObject = new q1();
      unknownFields = ((q1)paramObject);
    }
    return (q1)paramObject;
  }
  
  public final q1 g(Object paramObject)
  {
    return unknownFields;
  }
  
  public final int h(Object paramObject)
  {
    return ((q1)paramObject).b();
  }
  
  public final int i(Object paramObject)
  {
    q1 localq1 = (q1)paramObject;
    int i = d;
    if (i == -1)
    {
      int j = 0;
      i = 0;
      while (j < a)
      {
        int k = b[j];
        paramObject = (h)c[j];
        int m = k.N(1);
        k = k.O(2, k >>> 3);
        i += k.w(3, (h)paramObject) + (k + m * 2);
        j++;
      }
      d = i;
    }
    return i;
  }
  
  public final void j(Object paramObject)
  {
    paramObject = unknownFields;
    if (e) {
      e = false;
    }
  }
  
  public final q1 k(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (q1)paramObject1;
    paramObject2 = (q1)paramObject2;
    Object localObject = q1.f;
    if (!((q1)localObject).equals(paramObject2))
    {
      int i;
      if (((q1)localObject).equals(paramObject1))
      {
        i = a + a;
        localObject = Arrays.copyOf(b, i);
        System.arraycopy(b, 0, localObject, a, a);
        Object[] arrayOfObject = Arrays.copyOf(c, i);
        System.arraycopy(c, 0, arrayOfObject, a, a);
        paramObject1 = new q1(i, (int[])localObject, arrayOfObject, true);
      }
      else
      {
        paramObject1.getClass();
        if (!((q1)paramObject2).equals(localObject))
        {
          if (!e) {
            break label205;
          }
          i = a + a;
          ((q1)paramObject1).a(i);
          System.arraycopy(b, 0, b, a, a);
          System.arraycopy(c, 0, c, a, a);
          a = i;
        }
      }
    }
    return (q1)paramObject1;
    label205:
    throw new UnsupportedOperationException();
  }
  
  public final q1 m()
  {
    return new q1();
  }
  
  public final void n(Object paramObject1, Object paramObject2)
  {
    paramObject2 = (q1)paramObject2;
    unknownFields = ((q1)paramObject2);
  }
  
  public final void o(Object paramObject1, Object paramObject2)
  {
    paramObject2 = (q1)paramObject2;
    unknownFields = ((q1)paramObject2);
  }
  
  public final void p() {}
  
  public final q1 q(Object paramObject)
  {
    paramObject = (q1)paramObject;
    if (e) {
      e = false;
    }
    return (q1)paramObject;
  }
  
  public final void r(Object paramObject, l paraml)
  {
    paramObject = (q1)paramObject;
    paramObject.getClass();
    paraml.getClass();
    for (int i = 0; i < a; i++) {
      paraml.l(b[i] >>> 3, c[i]);
    }
  }
  
  public final void s(Object paramObject, l paraml)
  {
    ((q1)paramObject).d(paraml);
  }
}

/* Location:
 * Qualified Name:     ma.r1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */