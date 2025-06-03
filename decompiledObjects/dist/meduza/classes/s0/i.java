package s0;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;

public final class i
  implements b1
{
  public final h a;
  public int b;
  public int c;
  public int d = 0;
  
  public i(h paramh)
  {
    Charset localCharset = x.a;
    if (paramh != null)
    {
      a = paramh;
      d = this;
      return;
    }
    throw new NullPointerException("input");
  }
  
  public final int A()
  {
    int i = d;
    if (i != 0)
    {
      b = i;
      d = 0;
    }
    else
    {
      b = a.u();
    }
    i = b;
    if ((i != 0) && (i != c)) {
      return i >>> 3;
    }
    return Integer.MAX_VALUE;
  }
  
  public final <T> T B(c1<T> paramc1, n paramn)
  {
    T(3);
    return (T)P(paramc1, paramn);
  }
  
  public final void C(List<String> paramList)
  {
    R(paramList, false);
  }
  
  public final void D(List<String> paramList)
  {
    R(paramList, true);
  }
  
  public final g E()
  {
    T(2);
    return a.g();
  }
  
  public final void F(List<Float> paramList)
  {
    int i;
    int j;
    if ((paramList instanceof t))
    {
      paramList = (t)paramList;
      i = b & 0x7;
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.h(a.l());
            if (a.c()) {
              return;
            }
            i = a.u();
          } while (i == b);
          d = i;
          return;
        }
        throw y.b();
      }
      j = a.v();
      U(j);
      i = a.b();
      do
      {
        paramList.h(a.l());
      } while (a.b() < i + j);
    }
    else
    {
      i = b & 0x7;
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.add(Float.valueOf(a.l()));
            if (a.c()) {
              return;
            }
            i = a.u();
          } while (i == b);
          d = i;
          return;
        }
        throw y.b();
      }
      j = a.v();
      U(j);
      i = a.b();
      do
      {
        paramList.add(Float.valueOf(a.l()));
      } while (a.b() < i + j);
    }
  }
  
  public final int G()
  {
    T(0);
    return a.m();
  }
  
  public final boolean H()
  {
    if (!a.c())
    {
      int i = b;
      if (i != c) {
        return a.x(i);
      }
    }
    return false;
  }
  
  public final int I()
  {
    T(5);
    return a.o();
  }
  
  public final void J(List<g> paramList)
  {
    if ((b & 0x7) == 2)
    {
      int i;
      do
      {
        paramList.add(E());
        if (a.c()) {
          return;
        }
        i = a.u();
      } while (i == b);
      d = i;
      return;
    }
    throw y.b();
  }
  
  public final void K(List<Double> paramList)
  {
    int i;
    int j;
    if ((paramList instanceof l))
    {
      paramList = (l)paramList;
      i = b & 0x7;
      if (i != 1)
      {
        if (i == 2)
        {
          j = a.v();
          V(j);
          i = a.b();
          do
          {
            paramList.h(a.h());
          } while (a.b() < i + j);
        }
        else
        {
          throw y.b();
        }
      }
      else
      {
        do
        {
          paramList.h(a.h());
          if (a.c()) {
            return;
          }
          i = a.u();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = b & 0x7;
      if (i == 1) {
        break label200;
      }
      if (i != 2) {
        break label196;
      }
      i = a.v();
      V(i);
      j = a.b();
      do
      {
        paramList.add(Double.valueOf(a.h()));
      } while (a.b() < j + i);
    }
    return;
    label196:
    throw y.b();
    label200:
    do
    {
      paramList.add(Double.valueOf(a.h()));
      if (a.c()) {
        return;
      }
      i = a.u();
    } while (i == b);
    d = i;
  }
  
  public final long L()
  {
    T(0);
    return a.n();
  }
  
  public final String M()
  {
    T(2);
    return a.t();
  }
  
  public final void N(List<Long> paramList)
  {
    int i;
    int j;
    if ((paramList instanceof f0))
    {
      paramList = (f0)paramList;
      i = b & 0x7;
      if (i != 1)
      {
        if (i == 2)
        {
          j = a.v();
          V(j);
          i = a.b();
          do
          {
            paramList.h(a.k());
          } while (a.b() < i + j);
        }
        else
        {
          throw y.b();
        }
      }
      else
      {
        do
        {
          paramList.h(a.k());
          if (a.c()) {
            return;
          }
          i = a.u();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = b & 0x7;
      if (i == 1) {
        break label200;
      }
      if (i != 2) {
        break label196;
      }
      j = a.v();
      V(j);
      i = a.b();
      do
      {
        paramList.add(Long.valueOf(a.k()));
      } while (a.b() < i + j);
    }
    return;
    label196:
    throw y.b();
    label200:
    do
    {
      paramList.add(Long.valueOf(a.k()));
      if (a.c()) {
        return;
      }
      i = a.u();
    } while (i == b);
    d = i;
  }
  
  public final Object O(n1 paramn1, Class<?> paramClass, n paramn)
  {
    switch (paramn1.ordinal())
    {
    case 9: 
    default: 
      throw new RuntimeException("unsupported field type.");
    case 17: 
      return Long.valueOf(w());
    case 16: 
      return Integer.valueOf(v());
    case 15: 
      return Long.valueOf(l());
    case 14: 
      return Integer.valueOf(I());
    case 13: 
      return Integer.valueOf(t());
    case 12: 
      return Integer.valueOf(n());
    case 11: 
      return E();
    case 10: 
      T(2);
      return Q(y0.c.a(paramClass), paramn);
    case 8: 
      return M();
    case 7: 
      return Boolean.valueOf(k());
    case 6: 
      return Integer.valueOf(j());
    case 5: 
      return Long.valueOf(d());
    case 4: 
      return Integer.valueOf(G());
    case 3: 
      return Long.valueOf(c());
    case 2: 
      return Long.valueOf(L());
    case 1: 
      return Float.valueOf(readFloat());
    }
    return Double.valueOf(readDouble());
  }
  
  public final <T> T P(c1<T> paramc1, n paramn)
  {
    int i = c;
    c = (b >>> 3 << 3 | 0x4);
    try
    {
      Object localObject = paramc1.f();
      paramc1.i(localObject, this, paramn);
      paramc1.b(localObject);
      int j = b;
      int k = c;
      if (j == k) {
        return (T)localObject;
      }
      throw y.e();
    }
    finally
    {
      c = i;
    }
  }
  
  public final <T> T Q(c1<T> paramc1, n paramn)
  {
    int i = a.v();
    Object localObject = a;
    if (a < b)
    {
      i = ((h)localObject).e(i);
      localObject = paramc1.f();
      h localh = a;
      a += 1;
      paramc1.i(localObject, this, paramn);
      paramc1.b(localObject);
      a.a(0);
      paramc1 = a;
      a -= 1;
      paramc1.d(i);
      return (T)localObject;
    }
    throw new y("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
  }
  
  public final void R(List<String> paramList, boolean paramBoolean)
  {
    if ((b & 0x7) == 2)
    {
      int i;
      if (((paramList instanceof d0)) && (!paramBoolean))
      {
        paramList = (d0)paramList;
        do
        {
          paramList.w(E());
          if (a.c()) {
            return;
          }
          i = a.u();
        } while (i == b);
        d = i;
        return;
      }
      do
      {
        String str;
        if (paramBoolean) {
          str = M();
        } else {
          str = z();
        }
        paramList.add(str);
        if (a.c()) {
          return;
        }
        i = a.u();
      } while (i == b);
      d = i;
      return;
    }
    throw y.b();
  }
  
  public final void S(int paramInt)
  {
    if (a.b() == paramInt) {
      return;
    }
    throw y.f();
  }
  
  public final void T(int paramInt)
  {
    if ((b & 0x7) == paramInt) {
      return;
    }
    throw y.b();
  }
  
  public final void U(int paramInt)
  {
    if ((paramInt & 0x3) == 0) {
      return;
    }
    throw y.e();
  }
  
  public final void V(int paramInt)
  {
    if ((paramInt & 0x7) == 0) {
      return;
    }
    throw y.e();
  }
  
  public final <K, V> void a(Map<K, V> paramMap, h0.a<K, V> parama, n paramn)
  {
    T(2);
    int i = a.v();
    int j = a.e(i);
    Object localObject1 = b;
    Object localObject2 = d;
    try
    {
      do
      {
        for (;;)
        {
          i = A();
          if (i == Integer.MAX_VALUE) {
            break;
          }
          boolean bool = a.c();
          if (bool) {
            break;
          }
          if ((i == 1) || (i != 2)) {}
          try
          {
            if (H()) {
              continue;
            }
            localObject3 = new s0/y;
            ((y)localObject3).<init>("Unable to parse map entry.");
            throw ((Throwable)localObject3);
          }
          catch (y.a locala) {}
          Object localObject3 = O(c, d.getClass(), paramn);
          localObject2 = localObject3;
          continue;
          localObject3 = O(a, null, null);
          localObject1 = localObject3;
        }
      } while (H());
      paramMap = new s0/y;
      paramMap.<init>("Unable to parse map entry.");
      throw paramMap;
      paramMap.put(localObject1, localObject2);
      return;
    }
    finally
    {
      a.d(j);
    }
  }
  
  public final void b(List<Integer> paramList)
  {
    int i;
    if ((paramList instanceof w))
    {
      paramList = (w)paramList;
      i = b & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.v();
          i = a.b() + i;
          do
          {
            paramList.h(a.q());
          } while (a.b() < i);
        }
        else
        {
          throw y.b();
        }
      }
      else
      {
        do
        {
          paramList.h(a.q());
          if (a.c()) {
            return;
          }
          i = a.u();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = b & 0x7;
      if (i == 0) {
        break label193;
      }
      if (i != 2) {
        break label189;
      }
      i = a.v();
      i = a.b() + i;
      do
      {
        paramList.add(Integer.valueOf(a.q()));
      } while (a.b() < i);
    }
    S(i);
    return;
    label189:
    throw y.b();
    label193:
    do
    {
      paramList.add(Integer.valueOf(a.q()));
      if (a.c()) {
        return;
      }
      i = a.u();
    } while (i == b);
    d = i;
  }
  
  public final long c()
  {
    T(0);
    return a.w();
  }
  
  public final long d()
  {
    T(1);
    return a.k();
  }
  
  public final void e(List<Integer> paramList)
  {
    int i;
    int j;
    if ((paramList instanceof w))
    {
      paramList = (w)paramList;
      i = b & 0x7;
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.h(a.o());
            if (a.c()) {
              return;
            }
            i = a.u();
          } while (i == b);
          d = i;
          return;
        }
        throw y.b();
      }
      i = a.v();
      U(i);
      j = a.b();
      do
      {
        paramList.h(a.o());
      } while (a.b() < j + i);
    }
    else
    {
      i = b & 0x7;
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.add(Integer.valueOf(a.o()));
            if (a.c()) {
              return;
            }
            i = a.u();
          } while (i == b);
          d = i;
          return;
        }
        throw y.b();
      }
      j = a.v();
      U(j);
      i = a.b();
      do
      {
        paramList.add(Integer.valueOf(a.o()));
      } while (a.b() < i + j);
    }
  }
  
  public final void f(List<Long> paramList)
  {
    int i;
    if ((paramList instanceof f0))
    {
      paramList = (f0)paramList;
      i = b & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.v();
          i = a.b() + i;
          do
          {
            paramList.h(a.r());
          } while (a.b() < i);
        }
        else
        {
          throw y.b();
        }
      }
      else
      {
        do
        {
          paramList.h(a.r());
          if (a.c()) {
            return;
          }
          i = a.u();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = b & 0x7;
      if (i == 0) {
        break label193;
      }
      if (i != 2) {
        break label189;
      }
      i = a.v();
      i = a.b() + i;
      do
      {
        paramList.add(Long.valueOf(a.r()));
      } while (a.b() < i);
    }
    S(i);
    return;
    label189:
    throw y.b();
    label193:
    do
    {
      paramList.add(Long.valueOf(a.r()));
      if (a.c()) {
        return;
      }
      i = a.u();
    } while (i == b);
    d = i;
  }
  
  public final <T> void g(List<T> paramList, c1<T> paramc1, n paramn)
  {
    int i = b;
    if ((i & 0x7) == 3)
    {
      int j;
      do
      {
        paramList.add(P(paramc1, paramn));
        if ((a.c()) || (d != 0)) {
          break;
        }
        j = a.u();
      } while (j == i);
      d = j;
      return;
    }
    i = y.a;
    throw new y.a();
  }
  
  public final void h(List<Integer> paramList)
  {
    int i;
    if ((paramList instanceof w))
    {
      paramList = (w)paramList;
      i = b & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.v();
          i = a.b() + i;
          do
          {
            paramList.h(a.v());
          } while (a.b() < i);
        }
        else
        {
          throw y.b();
        }
      }
      else
      {
        do
        {
          paramList.h(a.v());
          if (a.c()) {
            return;
          }
          i = a.u();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = b & 0x7;
      if (i == 0) {
        break label193;
      }
      if (i != 2) {
        break label189;
      }
      i = a.v();
      i = a.b() + i;
      do
      {
        paramList.add(Integer.valueOf(a.v()));
      } while (a.b() < i);
    }
    S(i);
    return;
    label189:
    throw y.b();
    label193:
    do
    {
      paramList.add(Integer.valueOf(a.v()));
      if (a.c()) {
        return;
      }
      i = a.u();
    } while (i == b);
    d = i;
  }
  
  public final <T> void i(List<T> paramList, c1<T> paramc1, n paramn)
  {
    int i = b;
    if ((i & 0x7) == 2)
    {
      int j;
      do
      {
        paramList.add(Q(paramc1, paramn));
        if ((a.c()) || (d != 0)) {
          break;
        }
        j = a.u();
      } while (j == i);
      d = j;
      return;
    }
    i = y.a;
    throw new y.a();
  }
  
  public final int j()
  {
    T(5);
    return a.j();
  }
  
  public final boolean k()
  {
    T(0);
    return a.f();
  }
  
  public final long l()
  {
    T(1);
    return a.p();
  }
  
  public final void m(List<Long> paramList)
  {
    int i;
    if ((paramList instanceof f0))
    {
      paramList = (f0)paramList;
      i = b & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.v();
          i = a.b() + i;
          do
          {
            paramList.h(a.w());
          } while (a.b() < i);
        }
        else
        {
          throw y.b();
        }
      }
      else
      {
        do
        {
          paramList.h(a.w());
          if (a.c()) {
            return;
          }
          i = a.u();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = b & 0x7;
      if (i == 0) {
        break label193;
      }
      if (i != 2) {
        break label189;
      }
      i = a.v();
      i = a.b() + i;
      do
      {
        paramList.add(Long.valueOf(a.w()));
      } while (a.b() < i);
    }
    S(i);
    return;
    label189:
    throw y.b();
    label193:
    do
    {
      paramList.add(Long.valueOf(a.w()));
      if (a.c()) {
        return;
      }
      i = a.u();
    } while (i == b);
    d = i;
  }
  
  public final int n()
  {
    T(0);
    return a.v();
  }
  
  public final void o(List<Long> paramList)
  {
    int i;
    if ((paramList instanceof f0))
    {
      paramList = (f0)paramList;
      i = b & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.v();
          i = a.b() + i;
          do
          {
            paramList.h(a.n());
          } while (a.b() < i);
        }
        else
        {
          throw y.b();
        }
      }
      else
      {
        do
        {
          paramList.h(a.n());
          if (a.c()) {
            return;
          }
          i = a.u();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = b & 0x7;
      if (i == 0) {
        break label193;
      }
      if (i != 2) {
        break label189;
      }
      i = a.v();
      i = a.b() + i;
      do
      {
        paramList.add(Long.valueOf(a.n()));
      } while (a.b() < i);
    }
    S(i);
    return;
    label189:
    throw y.b();
    label193:
    do
    {
      paramList.add(Long.valueOf(a.n()));
      if (a.c()) {
        return;
      }
      i = a.u();
    } while (i == b);
    d = i;
  }
  
  public final int p()
  {
    return b;
  }
  
  public final void q(List<Long> paramList)
  {
    int i;
    int j;
    if ((paramList instanceof f0))
    {
      paramList = (f0)paramList;
      i = b & 0x7;
      if (i != 1)
      {
        if (i == 2)
        {
          j = a.v();
          V(j);
          i = a.b();
          do
          {
            paramList.h(a.p());
          } while (a.b() < i + j);
        }
        else
        {
          throw y.b();
        }
      }
      else
      {
        do
        {
          paramList.h(a.p());
          if (a.c()) {
            return;
          }
          i = a.u();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = b & 0x7;
      if (i == 1) {
        break label200;
      }
      if (i != 2) {
        break label196;
      }
      i = a.v();
      V(i);
      j = a.b();
      do
      {
        paramList.add(Long.valueOf(a.p()));
      } while (a.b() < j + i);
    }
    return;
    label196:
    throw y.b();
    label200:
    do
    {
      paramList.add(Long.valueOf(a.p()));
      if (a.c()) {
        return;
      }
      i = a.u();
    } while (i == b);
    d = i;
  }
  
  public final void r(List<Integer> paramList)
  {
    int i;
    if ((paramList instanceof w))
    {
      paramList = (w)paramList;
      i = b & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.v();
          i = a.b() + i;
          do
          {
            paramList.h(a.m());
          } while (a.b() < i);
        }
        else
        {
          throw y.b();
        }
      }
      else
      {
        do
        {
          paramList.h(a.m());
          if (a.c()) {
            return;
          }
          i = a.u();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = b & 0x7;
      if (i == 0) {
        break label193;
      }
      if (i != 2) {
        break label189;
      }
      i = a.v();
      i = a.b() + i;
      do
      {
        paramList.add(Integer.valueOf(a.m()));
      } while (a.b() < i);
    }
    S(i);
    return;
    label189:
    throw y.b();
    label193:
    do
    {
      paramList.add(Integer.valueOf(a.m()));
      if (a.c()) {
        return;
      }
      i = a.u();
    } while (i == b);
    d = i;
  }
  
  public final double readDouble()
  {
    T(1);
    return a.h();
  }
  
  public final float readFloat()
  {
    T(5);
    return a.l();
  }
  
  public final void s(List<Integer> paramList)
  {
    int i;
    if ((paramList instanceof w))
    {
      paramList = (w)paramList;
      i = b & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.v();
          i = a.b() + i;
          do
          {
            paramList.h(a.i());
          } while (a.b() < i);
        }
        else
        {
          throw y.b();
        }
      }
      else
      {
        do
        {
          paramList.h(a.i());
          if (a.c()) {
            return;
          }
          i = a.u();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = b & 0x7;
      if (i == 0) {
        break label193;
      }
      if (i != 2) {
        break label189;
      }
      i = a.v();
      i = a.b() + i;
      do
      {
        paramList.add(Integer.valueOf(a.i()));
      } while (a.b() < i);
    }
    S(i);
    return;
    label189:
    throw y.b();
    label193:
    do
    {
      paramList.add(Integer.valueOf(a.i()));
      if (a.c()) {
        return;
      }
      i = a.u();
    } while (i == b);
    d = i;
  }
  
  public final int t()
  {
    T(0);
    return a.i();
  }
  
  public final void u(List<Integer> paramList)
  {
    int i;
    int j;
    if ((paramList instanceof w))
    {
      paramList = (w)paramList;
      i = b & 0x7;
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.h(a.j());
            if (a.c()) {
              return;
            }
            i = a.u();
          } while (i == b);
          d = i;
          return;
        }
        throw y.b();
      }
      j = a.v();
      U(j);
      i = a.b();
      do
      {
        paramList.h(a.j());
      } while (a.b() < i + j);
    }
    else
    {
      i = b & 0x7;
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.add(Integer.valueOf(a.j()));
            if (a.c()) {
              return;
            }
            i = a.u();
          } while (i == b);
          d = i;
          return;
        }
        throw y.b();
      }
      i = a.v();
      U(i);
      j = a.b();
      do
      {
        paramList.add(Integer.valueOf(a.j()));
      } while (a.b() < j + i);
    }
  }
  
  public final int v()
  {
    T(0);
    return a.q();
  }
  
  public final long w()
  {
    T(0);
    return a.r();
  }
  
  public final void x(List<Boolean> paramList)
  {
    int i;
    if ((paramList instanceof e))
    {
      paramList = (e)paramList;
      i = b & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.v();
          i = a.b() + i;
          do
          {
            paramList.h(a.f());
          } while (a.b() < i);
        }
        else
        {
          throw y.b();
        }
      }
      else
      {
        do
        {
          paramList.h(a.f());
          if (a.c()) {
            return;
          }
          i = a.u();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = b & 0x7;
      if (i == 0) {
        break label193;
      }
      if (i != 2) {
        break label189;
      }
      i = a.v();
      i = a.b() + i;
      do
      {
        paramList.add(Boolean.valueOf(a.f()));
      } while (a.b() < i);
    }
    S(i);
    return;
    label189:
    throw y.b();
    label193:
    do
    {
      paramList.add(Boolean.valueOf(a.f()));
      if (a.c()) {
        return;
      }
      i = a.u();
    } while (i == b);
    d = i;
  }
  
  public final <T> T y(c1<T> paramc1, n paramn)
  {
    T(2);
    return (T)Q(paramc1, paramn);
  }
  
  public final String z()
  {
    T(2);
    return a.s();
  }
}

/* Location:
 * Qualified Name:     s0.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */