package com.google.crypto.tink.shaded.protobuf;

import java.util.List;
import java.util.Map;

public final class j
  implements d0
{
  public final i a;
  public int b;
  public int c;
  public int d = 0;
  
  public j(i parami)
  {
    parami = (i)z.b(parami, "input");
    a = parami;
    d = this;
  }
  
  public static j O(i parami)
  {
    j localj = d;
    if (localj != null) {
      return localj;
    }
    return new j(parami);
  }
  
  public void A(List paramList)
  {
    if (q0.b(b) == 2)
    {
      int i;
      do
      {
        paramList.add(u());
        if (a.e()) {
          return;
        }
        i = a.B();
      } while (i == b);
      d = i;
      return;
    }
    throw A.e();
  }
  
  public void B(List paramList)
  {
    int i;
    int j;
    if ((paramList instanceof m))
    {
      paramList = (m)paramList;
      i = q0.b(b);
      if (i != 1)
      {
        if (i == 2)
        {
          i = a.C();
          X(i);
          j = a.d();
          do
          {
            paramList.d(a.o());
          } while (a.d() < j + i);
        }
        else
        {
          throw A.e();
        }
      }
      else
      {
        do
        {
          paramList.d(a.o());
          if (a.e()) {
            return;
          }
          i = a.B();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = q0.b(b);
      if (i == 1) {
        break label200;
      }
      if (i != 2) {
        break label196;
      }
      i = a.C();
      X(i);
      j = a.d();
      do
      {
        paramList.add(Double.valueOf(a.o()));
      } while (a.d() < j + i);
    }
    return;
    label196:
    throw A.e();
    label200:
    do
    {
      paramList.add(Double.valueOf(a.o()));
      if (a.e()) {
        return;
      }
      i = a.B();
    } while (i == b);
    d = i;
  }
  
  public void C(List paramList)
  {
    int i;
    if ((paramList instanceof F))
    {
      paramList = (F)paramList;
      i = q0.b(b);
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.C();
          i = a.d() + i;
          do
          {
            paramList.d(a.u());
          } while (a.d() < i);
        }
        else
        {
          throw A.e();
        }
      }
      else
      {
        do
        {
          paramList.d(a.u());
          if (a.e()) {
            return;
          }
          i = a.B();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = q0.b(b);
      if (i == 0) {
        break label193;
      }
      if (i != 2) {
        break label189;
      }
      i = a.C();
      i = a.d() + i;
      do
      {
        paramList.add(Long.valueOf(a.u()));
      } while (a.d() < i);
    }
    U(i);
    return;
    label189:
    throw A.e();
    label193:
    do
    {
      paramList.add(Long.valueOf(a.u()));
      if (a.e()) {
        return;
      }
      i = a.B();
    } while (i == b);
    d = i;
  }
  
  public void D(List paramList)
  {
    int i;
    int j;
    if ((paramList instanceof F))
    {
      paramList = (F)paramList;
      i = q0.b(b);
      if (i != 1)
      {
        if (i == 2)
        {
          i = a.C();
          X(i);
          j = a.d();
          do
          {
            paramList.d(a.w());
          } while (a.d() < j + i);
        }
        else
        {
          throw A.e();
        }
      }
      else
      {
        do
        {
          paramList.d(a.w());
          if (a.e()) {
            return;
          }
          i = a.B();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = q0.b(b);
      if (i == 1) {
        break label200;
      }
      if (i != 2) {
        break label196;
      }
      i = a.C();
      X(i);
      j = a.d();
      do
      {
        paramList.add(Long.valueOf(a.w()));
      } while (a.d() < j + i);
    }
    return;
    label196:
    throw A.e();
    label200:
    do
    {
      paramList.add(Long.valueOf(a.w()));
      if (a.e()) {
        return;
      }
      i = a.B();
    } while (i == b);
    d = i;
  }
  
  public long E()
  {
    V(0);
    return a.u();
  }
  
  public String F()
  {
    V(2);
    return a.A();
  }
  
  public void G(List paramList)
  {
    int i;
    int j;
    if ((paramList instanceof F))
    {
      paramList = (F)paramList;
      i = q0.b(b);
      if (i != 1)
      {
        if (i == 2)
        {
          j = a.C();
          X(j);
          i = a.d();
          do
          {
            paramList.d(a.r());
          } while (a.d() < i + j);
        }
        else
        {
          throw A.e();
        }
      }
      else
      {
        do
        {
          paramList.d(a.r());
          if (a.e()) {
            return;
          }
          i = a.B();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = q0.b(b);
      if (i == 1) {
        break label200;
      }
      if (i != 2) {
        break label196;
      }
      i = a.C();
      X(i);
      j = a.d();
      do
      {
        paramList.add(Long.valueOf(a.r()));
      } while (a.d() < j + i);
    }
    return;
    label196:
    throw A.e();
    label200:
    do
    {
      paramList.add(Long.valueOf(a.r()));
      if (a.e()) {
        return;
      }
      i = a.B();
    } while (i == b);
    d = i;
  }
  
  public void H(List paramList)
  {
    int i;
    if ((paramList instanceof y))
    {
      paramList = (y)paramList;
      i = q0.b(b);
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.C();
          i = a.d() + i;
          do
          {
            paramList.z(a.t());
          } while (a.d() < i);
        }
        else
        {
          throw A.e();
        }
      }
      else
      {
        do
        {
          paramList.z(a.t());
          if (a.e()) {
            return;
          }
          i = a.B();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = q0.b(b);
      if (i == 0) {
        break label193;
      }
      if (i != 2) {
        break label189;
      }
      i = a.C();
      i = a.d() + i;
      do
      {
        paramList.add(Integer.valueOf(a.t()));
      } while (a.d() < i);
    }
    U(i);
    return;
    label189:
    throw A.e();
    label193:
    do
    {
      paramList.add(Integer.valueOf(a.t()));
      if (a.e()) {
        return;
      }
      i = a.B();
    } while (i == b);
    d = i;
  }
  
  public void I(List paramList)
  {
    int i;
    if ((paramList instanceof y))
    {
      paramList = (y)paramList;
      i = q0.b(b);
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.C();
          i = a.d() + i;
          do
          {
            paramList.z(a.p());
          } while (a.d() < i);
        }
        else
        {
          throw A.e();
        }
      }
      else
      {
        do
        {
          paramList.z(a.p());
          if (a.e()) {
            return;
          }
          i = a.B();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = q0.b(b);
      if (i == 0) {
        break label193;
      }
      if (i != 2) {
        break label189;
      }
      i = a.C();
      i = a.d() + i;
      do
      {
        paramList.add(Integer.valueOf(a.p()));
      } while (a.d() < i);
    }
    U(i);
    return;
    label189:
    throw A.e();
    label193:
    do
    {
      paramList.add(Integer.valueOf(a.p()));
      if (a.e()) {
        return;
      }
      i = a.B();
    } while (i == b);
    d = i;
  }
  
  public void J(Object paramObject, e0 parame0, p paramp)
  {
    V(2);
    Q(paramObject, parame0, paramp);
  }
  
  public void K(List paramList, e0 parame0, p paramp)
  {
    if (q0.b(b) == 2)
    {
      int i = b;
      int j;
      do
      {
        paramList.add(S(parame0, paramp));
        if ((a.e()) || (d != 0)) {
          break;
        }
        j = a.B();
      } while (j == i);
      d = j;
      return;
    }
    throw A.e();
  }
  
  public void L(Object paramObject, e0 parame0, p paramp)
  {
    V(3);
    P(paramObject, parame0, paramp);
  }
  
  public void M(Map paramMap, H.a parama, p paramp)
  {
    V(2);
    int i = a.C();
    a.l(i);
    throw null;
  }
  
  public void N(List paramList, e0 parame0, p paramp)
  {
    if (q0.b(b) == 3)
    {
      int i = b;
      int j;
      do
      {
        paramList.add(R(parame0, paramp));
        if ((a.e()) || (d != 0)) {
          break;
        }
        j = a.B();
      } while (j == i);
      d = j;
      return;
    }
    throw A.e();
  }
  
  public final void P(Object paramObject, e0 parame0, p paramp)
  {
    int i = c;
    c = q0.c(q0.a(b), 4);
    try
    {
      parame0.j(paramObject, this, paramp);
      int j = b;
      int k = c;
      if (j == k) {
        return;
      }
      throw A.h();
    }
    finally
    {
      c = i;
    }
  }
  
  public final void Q(Object paramObject, e0 parame0, p paramp)
  {
    int i = a.C();
    i locali = a;
    if (a < b)
    {
      i = locali.l(i);
      locali = a;
      a += 1;
      parame0.j(paramObject, this, paramp);
      a.a(0);
      paramObject = a;
      a -= 1;
      ((i)paramObject).k(i);
      return;
    }
    throw A.i();
  }
  
  public final Object R(e0 parame0, p paramp)
  {
    Object localObject = parame0.f();
    P(localObject, parame0, paramp);
    parame0.b(localObject);
    return localObject;
  }
  
  public final Object S(e0 parame0, p paramp)
  {
    Object localObject = parame0.f();
    Q(localObject, parame0, paramp);
    parame0.b(localObject);
    return localObject;
  }
  
  public void T(List paramList, boolean paramBoolean)
  {
    if (q0.b(b) == 2)
    {
      int i;
      if (((paramList instanceof D)) && (!paramBoolean))
      {
        paramList = (D)paramList;
        do
        {
          paramList.C(u());
          if (a.e()) {
            return;
          }
          i = a.B();
        } while (i == b);
        d = i;
        return;
      }
      do
      {
        String str;
        if (paramBoolean) {
          str = F();
        } else {
          str = m();
        }
        paramList.add(str);
        if (a.e()) {
          return;
        }
        i = a.B();
      } while (i == b);
      d = i;
      return;
    }
    throw A.e();
  }
  
  public final void U(int paramInt)
  {
    if (a.d() == paramInt) {
      return;
    }
    throw A.m();
  }
  
  public final void V(int paramInt)
  {
    if (q0.b(b) == paramInt) {
      return;
    }
    throw A.e();
  }
  
  public final void W(int paramInt)
  {
    if ((paramInt & 0x3) == 0) {
      return;
    }
    throw A.h();
  }
  
  public final void X(int paramInt)
  {
    if ((paramInt & 0x7) == 0) {
      return;
    }
    throw A.h();
  }
  
  public void a(List paramList)
  {
    int i;
    if ((paramList instanceof y))
    {
      paramList = (y)paramList;
      i = q0.b(b);
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.C();
          i = a.d() + i;
          do
          {
            paramList.z(a.x());
          } while (a.d() < i);
        }
        else
        {
          throw A.e();
        }
      }
      else
      {
        do
        {
          paramList.z(a.x());
          if (a.e()) {
            return;
          }
          i = a.B();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = q0.b(b);
      if (i == 0) {
        break label193;
      }
      if (i != 2) {
        break label189;
      }
      i = a.C();
      i = a.d() + i;
      do
      {
        paramList.add(Integer.valueOf(a.x()));
      } while (a.d() < i);
    }
    U(i);
    return;
    label189:
    throw A.e();
    label193:
    do
    {
      paramList.add(Integer.valueOf(a.x()));
      if (a.e()) {
        return;
      }
      i = a.B();
    } while (i == b);
    d = i;
  }
  
  public int b()
  {
    V(0);
    return a.p();
  }
  
  public long c()
  {
    V(0);
    return a.D();
  }
  
  public void d(List paramList)
  {
    int i;
    int j;
    if ((paramList instanceof y))
    {
      paramList = (y)paramList;
      i = q0.b(b);
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.z(a.q());
            if (a.e()) {
              return;
            }
            i = a.B();
          } while (i == b);
          d = i;
          return;
        }
        throw A.e();
      }
      i = a.C();
      W(i);
      j = a.d();
      do
      {
        paramList.z(a.q());
      } while (a.d() < j + i);
    }
    else
    {
      i = q0.b(b);
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.add(Integer.valueOf(a.q()));
            if (a.e()) {
              return;
            }
            i = a.B();
          } while (i == b);
          d = i;
          return;
        }
        throw A.e();
      }
      i = a.C();
      W(i);
      j = a.d();
      do
      {
        paramList.add(Integer.valueOf(a.q()));
      } while (a.d() < j + i);
    }
  }
  
  public int e()
  {
    return b;
  }
  
  public long f()
  {
    V(1);
    return a.r();
  }
  
  public void g(List paramList)
  {
    int i;
    int j;
    if ((paramList instanceof y))
    {
      paramList = (y)paramList;
      i = q0.b(b);
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.z(a.v());
            if (a.e()) {
              return;
            }
            i = a.B();
          } while (i == b);
          d = i;
          return;
        }
        throw A.e();
      }
      j = a.C();
      W(j);
      i = a.d();
      do
      {
        paramList.z(a.v());
      } while (a.d() < i + j);
    }
    else
    {
      i = q0.b(b);
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.add(Integer.valueOf(a.v()));
            if (a.e()) {
              return;
            }
            i = a.B();
          } while (i == b);
          d = i;
          return;
        }
        throw A.e();
      }
      i = a.C();
      W(i);
      j = a.d();
      do
      {
        paramList.add(Integer.valueOf(a.v()));
      } while (a.d() < j + i);
    }
  }
  
  public int h()
  {
    V(0);
    return a.x();
  }
  
  public void i(List paramList)
  {
    int i;
    if ((paramList instanceof F))
    {
      paramList = (F)paramList;
      i = q0.b(b);
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.C();
          i = a.d() + i;
          do
          {
            paramList.d(a.y());
          } while (a.d() < i);
        }
        else
        {
          throw A.e();
        }
      }
      else
      {
        do
        {
          paramList.d(a.y());
          if (a.e()) {
            return;
          }
          i = a.B();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = q0.b(b);
      if (i == 0) {
        break label193;
      }
      if (i != 2) {
        break label189;
      }
      i = a.C();
      i = a.d() + i;
      do
      {
        paramList.add(Long.valueOf(a.y()));
      } while (a.d() < i);
    }
    U(i);
    return;
    label189:
    throw A.e();
    label193:
    do
    {
      paramList.add(Long.valueOf(a.y()));
      if (a.e()) {
        return;
      }
      i = a.B();
    } while (i == b);
    d = i;
  }
  
  public long j()
  {
    V(0);
    return a.y();
  }
  
  public void k(List paramList)
  {
    int i;
    if ((paramList instanceof y))
    {
      paramList = (y)paramList;
      i = q0.b(b);
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.C();
          i = a.d() + i;
          do
          {
            paramList.z(a.C());
          } while (a.d() < i);
        }
        else
        {
          throw A.e();
        }
      }
      else
      {
        do
        {
          paramList.z(a.C());
          if (a.e()) {
            return;
          }
          i = a.B();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = q0.b(b);
      if (i == 0) {
        break label193;
      }
      if (i != 2) {
        break label189;
      }
      i = a.C();
      i = a.d() + i;
      do
      {
        paramList.add(Integer.valueOf(a.C()));
      } while (a.d() < i);
    }
    U(i);
    return;
    label189:
    throw A.e();
    label193:
    do
    {
      paramList.add(Integer.valueOf(a.C()));
      if (a.e()) {
        return;
      }
      i = a.B();
    } while (i == b);
    d = i;
  }
  
  public void l(List paramList)
  {
    int i;
    if ((paramList instanceof f))
    {
      paramList = (f)paramList;
      i = q0.b(b);
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.C();
          i = a.d() + i;
          do
          {
            paramList.d(a.m());
          } while (a.d() < i);
        }
        else
        {
          throw A.e();
        }
      }
      else
      {
        do
        {
          paramList.d(a.m());
          if (a.e()) {
            return;
          }
          i = a.B();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = q0.b(b);
      if (i == 0) {
        break label193;
      }
      if (i != 2) {
        break label189;
      }
      i = a.C();
      i = a.d() + i;
      do
      {
        paramList.add(Boolean.valueOf(a.m()));
      } while (a.d() < i);
    }
    U(i);
    return;
    label189:
    throw A.e();
    label193:
    do
    {
      paramList.add(Boolean.valueOf(a.m()));
      if (a.e()) {
        return;
      }
      i = a.B();
    } while (i == b);
    d = i;
  }
  
  public String m()
  {
    V(2);
    return a.z();
  }
  
  public int n()
  {
    V(5);
    return a.q();
  }
  
  public boolean o()
  {
    V(0);
    return a.m();
  }
  
  public int p()
  {
    int i = d;
    if (i != 0)
    {
      b = i;
      d = 0;
    }
    else
    {
      b = a.B();
    }
    i = b;
    if ((i != 0) && (i != c)) {
      return q0.a(i);
    }
    return Integer.MAX_VALUE;
  }
  
  public void q(List paramList)
  {
    T(paramList, false);
  }
  
  public long r()
  {
    V(1);
    return a.w();
  }
  
  public double readDouble()
  {
    V(1);
    return a.o();
  }
  
  public float readFloat()
  {
    V(5);
    return a.s();
  }
  
  public void s(List paramList)
  {
    int i;
    if ((paramList instanceof F))
    {
      paramList = (F)paramList;
      i = q0.b(b);
      if (i != 0)
      {
        if (i == 2)
        {
          i = a.C();
          i = a.d() + i;
          do
          {
            paramList.d(a.D());
          } while (a.d() < i);
        }
        else
        {
          throw A.e();
        }
      }
      else
      {
        do
        {
          paramList.d(a.D());
          if (a.e()) {
            return;
          }
          i = a.B();
        } while (i == b);
        d = i;
      }
    }
    else
    {
      i = q0.b(b);
      if (i == 0) {
        break label193;
      }
      if (i != 2) {
        break label189;
      }
      i = a.C();
      i = a.d() + i;
      do
      {
        paramList.add(Long.valueOf(a.D()));
      } while (a.d() < i);
    }
    U(i);
    return;
    label189:
    throw A.e();
    label193:
    do
    {
      paramList.add(Long.valueOf(a.D()));
      if (a.e()) {
        return;
      }
      i = a.B();
    } while (i == b);
    d = i;
  }
  
  public void t(List paramList)
  {
    T(paramList, true);
  }
  
  public h u()
  {
    V(2);
    return a.n();
  }
  
  public void v(List paramList)
  {
    int i;
    int j;
    if ((paramList instanceof v))
    {
      paramList = (v)paramList;
      i = q0.b(b);
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.d(a.s());
            if (a.e()) {
              return;
            }
            i = a.B();
          } while (i == b);
          d = i;
          return;
        }
        throw A.e();
      }
      i = a.C();
      W(i);
      j = a.d();
      do
      {
        paramList.d(a.s());
      } while (a.d() < j + i);
    }
    else
    {
      i = q0.b(b);
      if (i != 2)
      {
        if (i == 5)
        {
          do
          {
            paramList.add(Float.valueOf(a.s()));
            if (a.e()) {
              return;
            }
            i = a.B();
          } while (i == b);
          d = i;
          return;
        }
        throw A.e();
      }
      j = a.C();
      W(j);
      i = a.d();
      do
      {
        paramList.add(Float.valueOf(a.s()));
      } while (a.d() < i + j);
    }
  }
  
  public int w()
  {
    V(0);
    return a.C();
  }
  
  public int x()
  {
    V(0);
    return a.t();
  }
  
  public boolean y()
  {
    if (!a.e())
    {
      int i = b;
      if (i != c) {
        return a.E(i);
      }
    }
    return false;
  }
  
  public int z()
  {
    V(5);
    return a.v();
  }
}

/* Location:
 * Qualified Name:     com.google.crypto.tink.shaded.protobuf.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */