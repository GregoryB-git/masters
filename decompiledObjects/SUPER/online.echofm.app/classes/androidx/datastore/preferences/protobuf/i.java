package androidx.datastore.preferences.protobuf;

import java.util.List;
import java.util.Map;

public final class i
  implements d0
{
  public final h a;
  public int b;
  public int c;
  public int d = 0;
  
  public i(h paramh)
  {
    paramh = (h)y.b(paramh, "input");
    a = paramh;
    d = this;
  }
  
  public static i O(h paramh)
  {
    i locali = d;
    if (locali != null) {
      return locali;
    }
    return new i(paramh);
  }
  
  private Object P(r0.b paramb, Class paramClass, o paramo)
  {
    switch (a.a[paramb.ordinal()])
    {
    default: 
      throw new RuntimeException("unsupported field type.");
    case 17: 
      return Long.valueOf(c());
    case 16: 
      return Integer.valueOf(w());
    case 15: 
      return F();
    case 14: 
      return Long.valueOf(j());
    case 13: 
      return Integer.valueOf(h());
    case 12: 
      return Long.valueOf(r());
    case 11: 
      return Integer.valueOf(z());
    case 10: 
      return S(paramClass, paramo);
    case 9: 
      return Long.valueOf(E());
    case 8: 
      return Integer.valueOf(x());
    case 7: 
      return Float.valueOf(readFloat());
    case 6: 
      return Long.valueOf(f());
    case 5: 
      return Integer.valueOf(n());
    case 4: 
      return Integer.valueOf(b());
    case 3: 
      return Double.valueOf(readDouble());
    case 2: 
      return u();
    }
    return Boolean.valueOf(o());
  }
  
  private Object Q(e0 parame0, o paramo)
  {
    int i = c;
    c = r0.c(r0.a(b), 4);
    try
    {
      Object localObject = parame0.f();
      parame0.h(localObject, this, paramo);
      parame0.b(localObject);
      int j = b;
      int k = c;
      if (j == k) {
        return localObject;
      }
      throw z.g();
    }
    finally
    {
      c = i;
    }
  }
  
  private Object R(e0 parame0, o paramo)
  {
    int i = a.C();
    Object localObject = a;
    if (a < b)
    {
      i = ((h)localObject).l(i);
      localObject = parame0.f();
      h localh = a;
      a += 1;
      parame0.h(localObject, this, paramo);
      parame0.b(localObject);
      a.a(0);
      parame0 = a;
      a -= 1;
      parame0.k(i);
      return localObject;
    }
    throw z.h();
  }
  
  private void U(int paramInt)
  {
    if (a.d() == paramInt) {
      return;
    }
    throw z.k();
  }
  
  private void V(int paramInt)
  {
    if (r0.b(b) == paramInt) {
      return;
    }
    throw z.d();
  }
  
  private void W(int paramInt)
  {
    if ((paramInt & 0x3) == 0) {
      return;
    }
    throw z.g();
  }
  
  private void X(int paramInt)
  {
    if ((paramInt & 0x7) == 0) {
      return;
    }
    throw z.g();
  }
  
  public void A(List paramList)
  {
    if (r0.b(b) == 2)
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
    throw z.d();
  }
  
  public void B(List paramList)
  {
    if ((paramList instanceof l))
    {
      paramList = (l)paramList;
      i = r0.b(b);
      if (i != 1)
      {
        if (i != 2) {
          throw z.d();
        }
        X(a.C());
        a.d();
        a.o();
        throw null;
      }
      a.o();
      throw null;
    }
    int i = r0.b(b);
    if (i != 1)
    {
      if (i == 2)
      {
        int j = a.C();
        X(j);
        i = a.d();
        do
        {
          paramList.add(Double.valueOf(a.o()));
        } while (a.d() < i + j);
        return;
      }
      throw z.d();
    }
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
    if ((paramList instanceof F))
    {
      paramList = (F)paramList;
      i = r0.b(b);
      if (i != 0)
      {
        if (i != 2) {
          throw z.d();
        }
        a.C();
        a.d();
        a.u();
        throw null;
      }
      a.u();
      throw null;
    }
    int i = r0.b(b);
    if (i != 0)
    {
      if (i == 2)
      {
        i = a.C();
        i = a.d() + i;
        do
        {
          paramList.add(Long.valueOf(a.u()));
        } while (a.d() < i);
        U(i);
        return;
      }
      throw z.d();
    }
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
    if ((paramList instanceof F))
    {
      paramList = (F)paramList;
      i = r0.b(b);
      if (i != 1)
      {
        if (i != 2) {
          throw z.d();
        }
        X(a.C());
        a.d();
        a.w();
        throw null;
      }
      a.w();
      throw null;
    }
    int i = r0.b(b);
    if (i != 1)
    {
      if (i == 2)
      {
        int j = a.C();
        X(j);
        i = a.d();
        do
        {
          paramList.add(Long.valueOf(a.w()));
        } while (a.d() < i + j);
        return;
      }
      throw z.d();
    }
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
    if ((paramList instanceof F))
    {
      paramList = (F)paramList;
      i = r0.b(b);
      if (i != 1)
      {
        if (i != 2) {
          throw z.d();
        }
        X(a.C());
        a.d();
        a.r();
        throw null;
      }
      a.r();
      throw null;
    }
    int i = r0.b(b);
    if (i != 1)
    {
      if (i == 2)
      {
        i = a.C();
        X(i);
        int j = a.d();
        do
        {
          paramList.add(Long.valueOf(a.r()));
        } while (a.d() < j + i);
        return;
      }
      throw z.d();
    }
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
    if ((paramList instanceof x))
    {
      paramList = (x)paramList;
      i = r0.b(b);
      if (i != 0)
      {
        if (i != 2) {
          throw z.d();
        }
        a.C();
        a.d();
        a.t();
        throw null;
      }
      a.t();
      throw null;
    }
    int i = r0.b(b);
    if (i != 0)
    {
      if (i == 2)
      {
        i = a.C();
        i = a.d() + i;
        do
        {
          paramList.add(Integer.valueOf(a.t()));
        } while (a.d() < i);
        U(i);
        return;
      }
      throw z.d();
    }
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
    if ((paramList instanceof x))
    {
      paramList = (x)paramList;
      i = r0.b(b);
      if (i != 0)
      {
        if (i != 2) {
          throw z.d();
        }
        a.C();
        a.d();
        a.p();
        throw null;
      }
      a.p();
      throw null;
    }
    int i = r0.b(b);
    if (i != 0)
    {
      if (i == 2)
      {
        i = a.C();
        i = a.d() + i;
        do
        {
          paramList.add(Integer.valueOf(a.p()));
        } while (a.d() < i);
        U(i);
        return;
      }
      throw z.d();
    }
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
  
  public Object J(e0 parame0, o paramo)
  {
    V(2);
    return R(parame0, paramo);
  }
  
  public void K(Map paramMap, H.a parama, o paramo)
  {
    V(2);
    int i = a.C();
    i = a.l(i);
    Object localObject1 = b;
    Object localObject2 = d;
    try
    {
      int j = p();
      if (j != Integer.MAX_VALUE)
      {
        boolean bool = a.e();
        if (!bool) {
          if (j != 1) {
            if (j == 2) {}
          }
        }
      }
    }
    finally
    {
      do
      {
        for (;;)
        {
          try
          {
            if (y()) {
              continue;
            }
            localObject3 = new androidx/datastore/preferences/protobuf/z;
            ((z)localObject3).<init>("Unable to parse map entry.");
            throw ((Throwable)localObject3);
          }
          catch (z.a locala) {}
          paramMap = finally;
          break;
          Object localObject3 = P(c, d.getClass(), paramo);
          localObject2 = localObject3;
          continue;
          localObject3 = P(a, null, null);
          localObject1 = localObject3;
        }
      } while (y());
      paramMap = new androidx/datastore/preferences/protobuf/z;
      paramMap.<init>("Unable to parse map entry.");
      throw paramMap;
      paramMap.put(localObject1, localObject2);
      a.k(i);
      return;
      a.k(i);
    }
  }
  
  public void L(List paramList, e0 parame0, o paramo)
  {
    if (r0.b(b) == 3)
    {
      int i = b;
      int j;
      do
      {
        paramList.add(Q(parame0, paramo));
        if ((a.e()) || (d != 0)) {
          break;
        }
        j = a.B();
      } while (j == i);
      d = j;
      return;
    }
    throw z.d();
  }
  
  public void M(List paramList, e0 parame0, o paramo)
  {
    if (r0.b(b) == 2)
    {
      int i = b;
      int j;
      do
      {
        paramList.add(R(parame0, paramo));
        if ((a.e()) || (d != 0)) {
          break;
        }
        j = a.B();
      } while (j == i);
      d = j;
      return;
    }
    throw z.d();
  }
  
  public Object N(e0 parame0, o paramo)
  {
    V(3);
    return Q(parame0, paramo);
  }
  
  public Object S(Class paramClass, o paramo)
  {
    V(2);
    return R(a0.a().c(paramClass), paramo);
  }
  
  public void T(List paramList, boolean paramBoolean)
  {
    if (r0.b(b) == 2)
    {
      int i;
      if (((paramList instanceof D)) && (!paramBoolean))
      {
        paramList = (D)paramList;
        do
        {
          paramList.H(u());
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
    throw z.d();
  }
  
  public void a(List paramList)
  {
    if ((paramList instanceof x))
    {
      paramList = (x)paramList;
      i = r0.b(b);
      if (i != 0)
      {
        if (i != 2) {
          throw z.d();
        }
        a.C();
        a.d();
        a.x();
        throw null;
      }
      a.x();
      throw null;
    }
    int i = r0.b(b);
    if (i != 0)
    {
      if (i == 2)
      {
        i = a.C();
        i = a.d() + i;
        do
        {
          paramList.add(Integer.valueOf(a.x()));
        } while (a.d() < i);
        U(i);
        return;
      }
      throw z.d();
    }
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
    if ((paramList instanceof x))
    {
      paramList = (x)paramList;
      i = r0.b(b);
      if (i != 2)
      {
        if (i != 5) {
          throw z.d();
        }
        a.q();
        throw null;
      }
      W(a.C());
      a.d();
      a.q();
      throw null;
    }
    int i = r0.b(b);
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
      throw z.d();
    }
    i = a.C();
    W(i);
    int j = a.d();
    do
    {
      paramList.add(Integer.valueOf(a.q()));
    } while (a.d() < j + i);
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
    if ((paramList instanceof x))
    {
      paramList = (x)paramList;
      i = r0.b(b);
      if (i != 2)
      {
        if (i != 5) {
          throw z.d();
        }
        a.v();
        throw null;
      }
      W(a.C());
      a.d();
      a.v();
      throw null;
    }
    int i = r0.b(b);
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
      throw z.d();
    }
    i = a.C();
    W(i);
    int j = a.d();
    do
    {
      paramList.add(Integer.valueOf(a.v()));
    } while (a.d() < j + i);
  }
  
  public int h()
  {
    V(0);
    return a.x();
  }
  
  public void i(List paramList)
  {
    if ((paramList instanceof F))
    {
      paramList = (F)paramList;
      i = r0.b(b);
      if (i != 0)
      {
        if (i != 2) {
          throw z.d();
        }
        a.C();
        a.d();
        a.y();
        throw null;
      }
      a.y();
      throw null;
    }
    int i = r0.b(b);
    if (i != 0)
    {
      if (i == 2)
      {
        i = a.C();
        i = a.d() + i;
        do
        {
          paramList.add(Long.valueOf(a.y()));
        } while (a.d() < i);
        U(i);
        return;
      }
      throw z.d();
    }
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
    if ((paramList instanceof x))
    {
      paramList = (x)paramList;
      i = r0.b(b);
      if (i != 0)
      {
        if (i != 2) {
          throw z.d();
        }
        a.C();
        a.d();
        a.C();
        throw null;
      }
      a.C();
      throw null;
    }
    int i = r0.b(b);
    if (i != 0)
    {
      if (i == 2)
      {
        i = a.C();
        i = a.d() + i;
        do
        {
          paramList.add(Integer.valueOf(a.C()));
        } while (a.d() < i);
        U(i);
        return;
      }
      throw z.d();
    }
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
    if ((paramList instanceof e))
    {
      paramList = (e)paramList;
      i = r0.b(b);
      if (i != 0)
      {
        if (i != 2) {
          throw z.d();
        }
        a.C();
        a.d();
        a.m();
        throw null;
      }
      a.m();
      throw null;
    }
    int i = r0.b(b);
    if (i != 0)
    {
      if (i == 2)
      {
        i = a.C();
        i = a.d() + i;
        do
        {
          paramList.add(Boolean.valueOf(a.m()));
        } while (a.d() < i);
        U(i);
        return;
      }
      throw z.d();
    }
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
      return r0.a(i);
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
    if ((paramList instanceof F))
    {
      paramList = (F)paramList;
      i = r0.b(b);
      if (i != 0)
      {
        if (i != 2) {
          throw z.d();
        }
        a.C();
        a.d();
        a.D();
        throw null;
      }
      a.D();
      throw null;
    }
    int i = r0.b(b);
    if (i != 0)
    {
      if (i == 2)
      {
        i = a.C();
        i = a.d() + i;
        do
        {
          paramList.add(Long.valueOf(a.D()));
        } while (a.d() < i);
        U(i);
        return;
      }
      throw z.d();
    }
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
  
  public g u()
  {
    V(2);
    return a.n();
  }
  
  public void v(List paramList)
  {
    if ((paramList instanceof u))
    {
      paramList = (u)paramList;
      i = r0.b(b);
      if (i != 2)
      {
        if (i != 5) {
          throw z.d();
        }
        a.s();
        throw null;
      }
      W(a.C());
      a.d();
      a.s();
      throw null;
    }
    int i = r0.b(b);
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
      throw z.d();
    }
    int j = a.C();
    W(j);
    i = a.d();
    do
    {
      paramList.add(Float.valueOf(a.s()));
    } while (a.d() < i + j);
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
 * Qualified Name:     androidx.datastore.preferences.protobuf.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */