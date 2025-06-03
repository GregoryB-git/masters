package com.google.crypto.tink.shaded.protobuf;

import android.support.v4.media.a;
import java.util.Iterator;
import java.util.Map.Entry;

public final class T
  implements e0
{
  public final O a;
  public final k0 b;
  public final boolean c;
  public final q d;
  
  public T(k0 paramk0, q paramq, O paramO)
  {
    b = paramk0;
    c = paramq.e(paramO);
    d = paramq;
    a = paramO;
  }
  
  private int k(k0 paramk0, Object paramObject)
  {
    return paramk0.i(paramk0.g(paramObject));
  }
  
  private void l(k0 paramk0, q paramq, Object paramObject, d0 paramd0, p paramp)
  {
    Object localObject = paramk0.f(paramObject);
    t localt = paramq.d(paramObject);
    try
    {
      boolean bool;
      do
      {
        int i = paramd0.p();
        if (i == Integer.MAX_VALUE) {
          return;
        }
        bool = n(paramd0, paramp, paramq, localt, paramk0, localObject);
      } while (bool);
      return;
    }
    finally
    {
      paramk0.o(paramObject, localObject);
    }
  }
  
  public static T m(k0 paramk0, q paramq, O paramO)
  {
    return new T(paramk0, paramq, paramO);
  }
  
  public void a(Object paramObject1, Object paramObject2)
  {
    g0.F(b, paramObject1, paramObject2);
    if (c) {
      g0.D(d, paramObject1, paramObject2);
    }
  }
  
  public void b(Object paramObject)
  {
    b.j(paramObject);
    d.f(paramObject);
  }
  
  public final boolean c(Object paramObject)
  {
    return d.c(paramObject).e();
  }
  
  public boolean d(Object paramObject1, Object paramObject2)
  {
    if (!b.g(paramObject1).equals(b.g(paramObject2))) {
      return false;
    }
    if (c) {
      return d.c(paramObject1).equals(d.c(paramObject2));
    }
    return true;
  }
  
  public int e(Object paramObject)
  {
    int i = k(b, paramObject);
    int j = i;
    if (c) {
      j = i + d.c(paramObject).b();
    }
    return j;
  }
  
  public Object f()
  {
    O localO = a;
    if ((localO instanceof x)) {
      return ((x)localO).J();
    }
    return localO.d().c();
  }
  
  public int g(Object paramObject)
  {
    int i = b.g(paramObject).hashCode();
    int j = i;
    if (c) {
      j = i * 53 + d.c(paramObject).hashCode();
    }
    return j;
  }
  
  public void h(Object paramObject, byte[] paramArrayOfByte, int paramInt1, int paramInt2, e.a parama)
  {
    paramArrayOfByte = (x)paramObject;
    if (unknownFields == l0.c()) {
      unknownFields = l0.k();
    }
    a.a(paramObject);
    throw null;
  }
  
  public void i(Object paramObject, r0 paramr0)
  {
    Iterator localIterator = d.c(paramObject).f();
    if (!localIterator.hasNext())
    {
      o(b, paramObject, paramr0);
      return;
    }
    a.a(((Map.Entry)localIterator.next()).getKey());
    throw null;
  }
  
  public void j(Object paramObject, d0 paramd0, p paramp)
  {
    l(b, d, paramObject, paramd0, paramp);
  }
  
  public final boolean n(d0 paramd0, p paramp, q paramq, t paramt, k0 paramk0, Object paramObject)
  {
    int i = paramd0.e();
    if (i != q0.a)
    {
      if (q0.b(i) == 2)
      {
        localObject1 = paramq.b(paramp, a, q0.a(i));
        if (localObject1 != null)
        {
          paramq.h(paramd0, localObject1, paramp, paramt);
          return true;
        }
        return paramk0.m(paramObject, paramd0);
      }
      return paramd0.y();
    }
    Object localObject2 = null;
    i = 0;
    Object localObject1 = null;
    do
    {
      for (;;)
      {
        if (paramd0.p() == Integer.MAX_VALUE) {
          break label183;
        }
        int j = paramd0.e();
        if (j == q0.c)
        {
          i = paramd0.w();
          localObject2 = paramq.b(paramp, a, i);
        }
        else
        {
          if (j != q0.d) {
            break;
          }
          if (localObject2 != null) {
            paramq.h(paramd0, localObject2, paramp, paramt);
          } else {
            localObject1 = paramd0.u();
          }
        }
      }
    } while (paramd0.y());
    label183:
    if (paramd0.e() == q0.b)
    {
      if (localObject1 != null) {
        if (localObject2 != null) {
          paramq.i((h)localObject1, localObject2, paramp, paramt);
        } else {
          paramk0.d(paramObject, i, (h)localObject1);
        }
      }
      return true;
    }
    throw A.b();
  }
  
  public final void o(k0 paramk0, Object paramObject, r0 paramr0)
  {
    paramk0.s(paramk0.g(paramObject), paramr0);
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.T
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */