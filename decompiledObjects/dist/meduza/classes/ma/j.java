package ma;

import java.nio.charset.Charset;
import java.util.List;

public final class j
  implements g1
{
  public final i a;
  public int b;
  public int c;
  public int d = 0;
  
  public j(i parami)
  {
    Charset localCharset = a0.a;
    if (parami != null)
    {
      a = parami;
      d = this;
      return;
    }
    throw new NullPointerException("input");
  }
  
  public static void y(int paramInt)
  {
    if ((paramInt & 0x3) == 0) {
      return;
    }
    throw b0.g();
  }
  
  public static void z(int paramInt)
  {
    if ((paramInt & 0x7) == 0) {
      return;
    }
    throw b0.g();
  }
  
  public final int a()
  {
    int i = d;
    if (i != 0)
    {
      b = i;
      d = 0;
    }
    else
    {
      b = a.x();
    }
    i = b;
    if ((i != 0) && (i != c)) {
      return i >>> 3;
    }
    return Integer.MAX_VALUE;
  }
  
  public final <T> void b(T paramT, i1<T> parami1, o paramo)
  {
    int i = c;
    c = (b >>> 3 << 3 | 0x4);
    try
    {
      parami1.i(paramT, this, paramo);
      int j = b;
      int k = c;
      if (j == k) {
        return;
      }
      throw b0.g();
    }
    finally
    {
      c = i;
    }
  }
  
  public final <T> void c(T paramT, i1<T> parami1, o paramo)
  {
    int i = a.y();
    i locali = a;
    if (a < b)
    {
      i = locali.h(i);
      locali = a;
      a += 1;
      parami1.i(paramT, this, paramo);
      a.a(0);
      paramT = a;
      a -= 1;
      paramT.g(i);
      return;
    }
    throw new b0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
  }
  
  public final void d(List<Boolean> paramList)
  {
    int i;
    if ((paramList instanceof g))
    {
      paramList = (g)paramList;
      i = b & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.y();
          i = a.d() + i;
          do
          {
            paramList.h(a.i());
          } while (a.d() < i);
        }
        else
        {
          throw b0.d();
        }
      }
      else
      {
        do
        {
          paramList.h(a.i());
          if (a.e()) {
            return;
          }
          i = a.x();
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
      i = a.y();
      i = a.d() + i;
      do
      {
        paramList.add(Boolean.valueOf(a.i()));
      } while (a.d() < i);
    }
    v(i);
    return;
    label189:
    throw b0.d();
    label193:
    do
    {
      paramList.add(Boolean.valueOf(a.i()));
      if (a.e()) {
        return;
      }
      i = a.x();
    } while (i == b);
    d = i;
  }
  
  public final h e()
  {
    w(2);
    return a.j();
  }
  
  public final void f(List<h> paramList)
  {
    if ((b & 0x7) == 2)
    {
      int i;
      do
      {
        paramList.add(e());
        if (a.e()) {
          return;
        }
        i = a.x();
      } while (i == b);
      d = i;
      return;
    }
    throw b0.d();
  }
  
  public final void g(List<Double> paramList)
  {
    int j;
    if ((paramList instanceof m))
    {
      paramList = (m)paramList;
      i = b & 0x7;
      if (i != 1)
      {
        if (i == 2)
        {
          i = a.y();
          z(i);
          j = a.d();
          do
          {
            paramList.h(a.k());
          } while (a.d() < j + i);
        }
        else
        {
          i = b0.c;
          throw new b0.a();
        }
      }
      else
      {
        do
        {
          paramList.h(a.k());
          if (a.e()) {
            return;
          }
          i = a.x();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = b & 0x7;
      if (i == 1) {
        break label214;
      }
      if (i != 2) {
        break label202;
      }
      i = a.y();
      z(i);
      j = a.d();
      do
      {
        paramList.add(Double.valueOf(a.k()));
      } while (a.d() < j + i);
    }
    return;
    label202:
    int i = b0.c;
    throw new b0.a();
    label214:
    do
    {
      paramList.add(Double.valueOf(a.k()));
      if (a.e()) {
        return;
      }
      i = a.x();
    } while (i == b);
    d = i;
  }
  
  public final void h(List<Integer> paramList)
  {
    int i;
    if ((paramList instanceof z))
    {
      paramList = (z)paramList;
      i = b & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.y();
          i = a.d() + i;
          do
          {
            paramList.h(a.l());
          } while (a.d() < i);
        }
        else
        {
          throw b0.d();
        }
      }
      else
      {
        do
        {
          paramList.h(a.l());
          if (a.e()) {
            return;
          }
          i = a.x();
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
      i = a.y();
      i = a.d() + i;
      do
      {
        paramList.add(Integer.valueOf(a.l()));
      } while (a.d() < i);
    }
    v(i);
    return;
    label189:
    throw b0.d();
    label193:
    do
    {
      paramList.add(Integer.valueOf(a.l()));
      if (a.e()) {
        return;
      }
      i = a.x();
    } while (i == b);
    d = i;
  }
  
  public final Object i(v1 paramv1, Class<?> paramClass, o paramo)
  {
    switch (paramv1.ordinal())
    {
    case 9: 
    default: 
      throw new IllegalArgumentException("unsupported field type.");
    case 17: 
      w(0);
      return Long.valueOf(a.u());
    case 16: 
      w(0);
      return Integer.valueOf(a.t());
    case 15: 
      w(1);
      return Long.valueOf(a.s());
    case 14: 
      w(5);
      return Integer.valueOf(a.r());
    case 13: 
      w(0);
      return Integer.valueOf(a.l());
    case 12: 
      w(0);
      return Integer.valueOf(a.y());
    case 11: 
      return e();
    case 10: 
      w(2);
      paramClass = d1.c.a(paramClass);
      paramv1 = paramClass.f();
      c(paramv1, paramClass, paramo);
      paramClass.b(paramv1);
      return paramv1;
    case 8: 
      w(2);
      return a.w();
    case 7: 
      w(0);
      return Boolean.valueOf(a.i());
    case 6: 
      w(5);
      return Integer.valueOf(a.m());
    case 5: 
      w(1);
      return Long.valueOf(a.n());
    case 4: 
      w(0);
      return Integer.valueOf(a.p());
    case 3: 
      w(0);
      return Long.valueOf(a.z());
    case 2: 
      w(0);
      return Long.valueOf(a.q());
    case 1: 
      w(5);
      return Float.valueOf(a.o());
    }
    w(1);
    return Double.valueOf(a.k());
  }
  
  public final void j(List<Integer> paramList)
  {
    int i;
    int j;
    if ((paramList instanceof z))
    {
      paramList = (z)paramList;
      i = b & 0x7;
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.h(a.m());
            if (a.e()) {
              return;
            }
            i = a.x();
          } while (i == b);
          d = i;
          return;
        }
        i = b0.c;
        throw new b0.a();
      }
      i = a.y();
      y(i);
      j = a.d();
      do
      {
        paramList.h(a.m());
      } while (a.d() < j + i);
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
            paramList.add(Integer.valueOf(a.m()));
            if (a.e()) {
              return;
            }
            i = a.x();
          } while (i == b);
          d = i;
          return;
        }
        i = b0.c;
        throw new b0.a();
      }
      i = a.y();
      y(i);
      j = a.d();
      do
      {
        paramList.add(Integer.valueOf(a.m()));
      } while (a.d() < j + i);
    }
  }
  
  public final void k(List<Long> paramList)
  {
    int j;
    if ((paramList instanceof j0))
    {
      paramList = (j0)paramList;
      i = b & 0x7;
      if (i != 1)
      {
        if (i == 2)
        {
          i = a.y();
          z(i);
          j = a.d();
          do
          {
            paramList.h(a.n());
          } while (a.d() < j + i);
        }
        else
        {
          i = b0.c;
          throw new b0.a();
        }
      }
      else
      {
        do
        {
          paramList.h(a.n());
          if (a.e()) {
            return;
          }
          i = a.x();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = b & 0x7;
      if (i == 1) {
        break label214;
      }
      if (i != 2) {
        break label202;
      }
      j = a.y();
      z(j);
      i = a.d();
      do
      {
        paramList.add(Long.valueOf(a.n()));
      } while (a.d() < i + j);
    }
    return;
    label202:
    int i = b0.c;
    throw new b0.a();
    label214:
    do
    {
      paramList.add(Long.valueOf(a.n()));
      if (a.e()) {
        return;
      }
      i = a.x();
    } while (i == b);
    d = i;
  }
  
  public final void l(List<Float> paramList)
  {
    int i;
    int j;
    if ((paramList instanceof u))
    {
      paramList = (u)paramList;
      i = b & 0x7;
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.h(a.o());
            if (a.e()) {
              return;
            }
            i = a.x();
          } while (i == b);
          d = i;
          return;
        }
        i = b0.c;
        throw new b0.a();
      }
      i = a.y();
      y(i);
      j = a.d();
      do
      {
        paramList.h(a.o());
      } while (a.d() < j + i);
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
            paramList.add(Float.valueOf(a.o()));
            if (a.e()) {
              return;
            }
            i = a.x();
          } while (i == b);
          d = i;
          return;
        }
        i = b0.c;
        throw new b0.a();
      }
      i = a.y();
      y(i);
      j = a.d();
      do
      {
        paramList.add(Float.valueOf(a.o()));
      } while (a.d() < j + i);
    }
  }
  
  public final void m(List<Integer> paramList)
  {
    int i;
    if ((paramList instanceof z))
    {
      paramList = (z)paramList;
      i = b & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.y();
          i = a.d() + i;
          do
          {
            paramList.h(a.p());
          } while (a.d() < i);
        }
        else
        {
          throw b0.d();
        }
      }
      else
      {
        do
        {
          paramList.h(a.p());
          if (a.e()) {
            return;
          }
          i = a.x();
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
      i = a.y();
      i = a.d() + i;
      do
      {
        paramList.add(Integer.valueOf(a.p()));
      } while (a.d() < i);
    }
    v(i);
    return;
    label189:
    throw b0.d();
    label193:
    do
    {
      paramList.add(Integer.valueOf(a.p()));
      if (a.e()) {
        return;
      }
      i = a.x();
    } while (i == b);
    d = i;
  }
  
  public final void n(List<Long> paramList)
  {
    int i;
    if ((paramList instanceof j0))
    {
      paramList = (j0)paramList;
      i = b & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.y();
          i = a.d() + i;
          do
          {
            paramList.h(a.q());
          } while (a.d() < i);
        }
        else
        {
          throw b0.d();
        }
      }
      else
      {
        do
        {
          paramList.h(a.q());
          if (a.e()) {
            return;
          }
          i = a.x();
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
      i = a.y();
      i = a.d() + i;
      do
      {
        paramList.add(Long.valueOf(a.q()));
      } while (a.d() < i);
    }
    v(i);
    return;
    label189:
    throw b0.d();
    label193:
    do
    {
      paramList.add(Long.valueOf(a.q()));
      if (a.e()) {
        return;
      }
      i = a.x();
    } while (i == b);
    d = i;
  }
  
  public final void o(List<Integer> paramList)
  {
    int i;
    int j;
    if ((paramList instanceof z))
    {
      paramList = (z)paramList;
      i = b & 0x7;
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.h(a.r());
            if (a.e()) {
              return;
            }
            i = a.x();
          } while (i == b);
          d = i;
          return;
        }
        i = b0.c;
        throw new b0.a();
      }
      j = a.y();
      y(j);
      i = a.d();
      do
      {
        paramList.h(a.r());
      } while (a.d() < i + j);
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
            paramList.add(Integer.valueOf(a.r()));
            if (a.e()) {
              return;
            }
            i = a.x();
          } while (i == b);
          d = i;
          return;
        }
        i = b0.c;
        throw new b0.a();
      }
      i = a.y();
      y(i);
      j = a.d();
      do
      {
        paramList.add(Integer.valueOf(a.r()));
      } while (a.d() < j + i);
    }
  }
  
  public final void p(List<Long> paramList)
  {
    int j;
    if ((paramList instanceof j0))
    {
      paramList = (j0)paramList;
      i = b & 0x7;
      if (i != 1)
      {
        if (i == 2)
        {
          j = a.y();
          z(j);
          i = a.d();
          do
          {
            paramList.h(a.s());
          } while (a.d() < i + j);
        }
        else
        {
          i = b0.c;
          throw new b0.a();
        }
      }
      else
      {
        do
        {
          paramList.h(a.s());
          if (a.e()) {
            return;
          }
          i = a.x();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = b & 0x7;
      if (i == 1) {
        break label214;
      }
      if (i != 2) {
        break label202;
      }
      i = a.y();
      z(i);
      j = a.d();
      do
      {
        paramList.add(Long.valueOf(a.s()));
      } while (a.d() < j + i);
    }
    return;
    label202:
    int i = b0.c;
    throw new b0.a();
    label214:
    do
    {
      paramList.add(Long.valueOf(a.s()));
      if (a.e()) {
        return;
      }
      i = a.x();
    } while (i == b);
    d = i;
  }
  
  public final void q(List<Integer> paramList)
  {
    int i;
    if ((paramList instanceof z))
    {
      paramList = (z)paramList;
      i = b & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.y();
          i = a.d() + i;
          do
          {
            paramList.h(a.t());
          } while (a.d() < i);
        }
        else
        {
          throw b0.d();
        }
      }
      else
      {
        do
        {
          paramList.h(a.t());
          if (a.e()) {
            return;
          }
          i = a.x();
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
      i = a.y();
      i = a.d() + i;
      do
      {
        paramList.add(Integer.valueOf(a.t()));
      } while (a.d() < i);
    }
    v(i);
    return;
    label189:
    throw b0.d();
    label193:
    do
    {
      paramList.add(Integer.valueOf(a.t()));
      if (a.e()) {
        return;
      }
      i = a.x();
    } while (i == b);
    d = i;
  }
  
  public final void r(List<Long> paramList)
  {
    int i;
    if ((paramList instanceof j0))
    {
      paramList = (j0)paramList;
      i = b & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.y();
          i = a.d() + i;
          do
          {
            paramList.h(a.u());
          } while (a.d() < i);
        }
        else
        {
          throw b0.d();
        }
      }
      else
      {
        do
        {
          paramList.h(a.u());
          if (a.e()) {
            return;
          }
          i = a.x();
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
      i = a.y();
      i = a.d() + i;
      do
      {
        paramList.add(Long.valueOf(a.u()));
      } while (a.d() < i);
    }
    v(i);
    return;
    label189:
    throw b0.d();
    label193:
    do
    {
      paramList.add(Long.valueOf(a.u()));
      if (a.e()) {
        return;
      }
      i = a.x();
    } while (i == b);
    d = i;
  }
  
  public final void s(List<String> paramList, boolean paramBoolean)
  {
    if ((b & 0x7) == 2)
    {
      if (((paramList instanceof h0)) && (!paramBoolean))
      {
        paramList = (h0)paramList;
        do
        {
          paramList.v(e());
          if (a.e()) {
            return;
          }
          i = a.x();
        } while (i == b);
        d = i;
        return;
      }
      do
      {
        String str;
        if (paramBoolean)
        {
          w(2);
          str = a.w();
        }
        else
        {
          w(2);
          str = a.v();
        }
        paramList.add(str);
        if (a.e()) {
          return;
        }
        i = a.x();
      } while (i == b);
      d = i;
      return;
    }
    int i = b0.c;
    throw new b0.a();
  }
  
  public final void t(List<Integer> paramList)
  {
    int i;
    if ((paramList instanceof z))
    {
      paramList = (z)paramList;
      i = b & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.y();
          i = a.d() + i;
          do
          {
            paramList.h(a.y());
          } while (a.d() < i);
        }
        else
        {
          throw b0.d();
        }
      }
      else
      {
        do
        {
          paramList.h(a.y());
          if (a.e()) {
            return;
          }
          i = a.x();
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
      i = a.y();
      i = a.d() + i;
      do
      {
        paramList.add(Integer.valueOf(a.y()));
      } while (a.d() < i);
    }
    v(i);
    return;
    label189:
    throw b0.d();
    label193:
    do
    {
      paramList.add(Integer.valueOf(a.y()));
      if (a.e()) {
        return;
      }
      i = a.x();
    } while (i == b);
    d = i;
  }
  
  public final void u(List<Long> paramList)
  {
    int i;
    if ((paramList instanceof j0))
    {
      paramList = (j0)paramList;
      i = b & 0x7;
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.y();
          i = a.d() + i;
          do
          {
            paramList.h(a.z());
          } while (a.d() < i);
        }
        else
        {
          throw b0.d();
        }
      }
      else
      {
        do
        {
          paramList.h(a.z());
          if (a.e()) {
            return;
          }
          i = a.x();
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
      i = a.y();
      i = a.d() + i;
      do
      {
        paramList.add(Long.valueOf(a.z()));
      } while (a.d() < i);
    }
    v(i);
    return;
    label189:
    throw b0.d();
    label193:
    do
    {
      paramList.add(Long.valueOf(a.z()));
      if (a.e()) {
        return;
      }
      i = a.x();
    } while (i == b);
    d = i;
  }
  
  public final void v(int paramInt)
  {
    if (a.d() == paramInt) {
      return;
    }
    throw b0.h();
  }
  
  public final void w(int paramInt)
  {
    if ((b & 0x7) == paramInt) {
      return;
    }
    throw b0.d();
  }
  
  public final boolean x()
  {
    if (!a.e())
    {
      int i = b;
      if (i != c) {
        return a.A(i);
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     ma.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */