package ma;

import java.util.Iterator;
import java.util.Map.Entry;

public final class w0<T>
  implements i1<T>
{
  public final s0 a;
  public final p1<?, ?> b;
  public final boolean c;
  public final p<?> d;
  
  public w0(p1<?, ?> paramp1, p<?> paramp, s0 params0)
  {
    b = paramp1;
    c = paramp.e(params0);
    d = paramp;
    a = params0;
  }
  
  public final void a(T paramT1, T paramT2)
  {
    p1 localp1 = b;
    Class localClass = j1.a;
    localp1.o(paramT1, localp1.k(localp1.g(paramT1), localp1.g(paramT2)));
    if (c) {
      j1.A(d, paramT1, paramT2);
    }
  }
  
  public final void b(T paramT)
  {
    b.j(paramT);
    d.f(paramT);
  }
  
  public final boolean c(T paramT)
  {
    return d.c(paramT).j();
  }
  
  public final boolean d(T paramT1, T paramT2)
  {
    if (!b.g(paramT1).equals(b.g(paramT2))) {
      return false;
    }
    if (c) {
      return d.c(paramT1).equals(d.c(paramT2));
    }
    return true;
  }
  
  public final int e(T paramT)
  {
    p1 localp1 = b;
    int i = localp1.i(localp1.g(paramT));
    int j = 0;
    int k = i + 0;
    i = k;
    if (c)
    {
      paramT = d.c(paramT);
      i = 0;
      while (j < a.e())
      {
        i += s.g(a.d(j));
        j++;
      }
      paramT = a.f().iterator();
      while (paramT.hasNext()) {
        i += s.g((Map.Entry)paramT.next());
      }
      i = k + i;
    }
    return i;
  }
  
  public final T f()
  {
    s0 locals0 = a;
    if ((locals0 instanceof w)) {
      return (w)((w)locals0).t(w.f.d);
    }
    return locals0.e().l();
  }
  
  public final int g(T paramT)
  {
    int i = b.g(paramT).hashCode();
    int j = i;
    if (c) {
      j = i * 53 + d.c(paramT).hashCode();
    }
    return j;
  }
  
  public final void h(Object paramObject, l paraml)
  {
    Iterator localIterator = d.c(paramObject).l();
    while (localIterator.hasNext())
    {
      localObject = (Map.Entry)localIterator.next();
      s.a locala = (s.a)((Map.Entry)localObject).getKey();
      if (locala.d() == w1.r)
      {
        locala.b();
        locala.e();
        boolean bool = localObject instanceof e0.a;
        locala.a();
        if (bool) {
          localObject = ((e0)a.getValue()).b();
        } else {
          localObject = ((Map.Entry)localObject).getValue();
        }
        paraml.l(0, localObject);
      }
      else
      {
        throw new IllegalStateException("Found invalid MessageSet item.");
      }
    }
    Object localObject = b;
    ((p1)localObject).r(((p1)localObject).g(paramObject), paraml);
  }
  
  public final void i(T paramT, g1 paramg1, o paramo)
  {
    p1 localp1 = b;
    p localp = d;
    q1 localq1 = localp1.f(paramT);
    s locals = localp.d(paramT);
    try
    {
      boolean bool;
      do
      {
        j localj = (j)paramg1;
        if (localj.a() == Integer.MAX_VALUE) {
          break;
        }
        bool = k(localj, paramo, localp, locals, localp1, localq1);
      } while (bool);
      return;
    }
    finally
    {
      localp1.n(paramT, localq1);
    }
  }
  
  public final void j(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, f.a parama)
  {
    w localw = (w)paramT;
    Object localObject1 = unknownFields;
    Object localObject2 = localObject1;
    if (localObject1 == q1.f)
    {
      localObject2 = new q1();
      unknownFields = ((q1)localObject2);
    }
    paramT = (w.c)paramT;
    localObject1 = extensions;
    if (b) {
      extensions = ((s)localObject1).a();
    }
    paramT = null;
    while (paramInt1 < paramInt2)
    {
      paramInt1 = f.G(paramArrayOfByte, paramInt1, parama);
      int i = a;
      if (i != 11)
      {
        if ((i & 0x7) == 2)
        {
          paramT = d.b(d, a, i >>> 3);
          if (paramT == null)
          {
            paramInt1 = f.E(i, paramArrayOfByte, paramInt1, paramInt2, (q1)localObject2, parama);
          }
          else
          {
            paramT = d1.c;
            throw null;
          }
        }
        else
        {
          paramInt1 = f.M(i, paramArrayOfByte, paramInt1, paramInt2, parama);
        }
      }
      else
      {
        int j = 0;
        localObject1 = null;
        for (;;)
        {
          i = paramInt1;
          if (paramInt1 >= paramInt2) {
            break;
          }
          i = f.G(paramArrayOfByte, paramInt1, parama);
          int k = a;
          paramInt1 = k >>> 3;
          int m = k & 0x7;
          if (paramInt1 != 2)
          {
            if (paramInt1 == 3) {
              if (paramT == null)
              {
                if (m == 2)
                {
                  paramInt1 = f.b(paramArrayOfByte, i, parama);
                  localObject1 = (h)c;
                }
              }
              else
              {
                paramT = d1.c;
                throw null;
              }
            }
          }
          else if (m == 0)
          {
            paramInt1 = f.G(paramArrayOfByte, i, parama);
            j = a;
            paramT = d.b(d, a, j);
            continue;
          }
          if (k == 12) {
            break;
          }
          paramInt1 = f.M(k, paramArrayOfByte, i, paramInt2, parama);
        }
        if (localObject1 != null) {
          ((q1)localObject2).c(j << 3 | 0x2, localObject1);
        }
        paramInt1 = i;
      }
    }
    if (paramInt1 == paramInt2) {
      return;
    }
    throw b0.g();
  }
  
  public final <UT, UB, ET extends s.a<ET>> boolean k(g1 paramg1, o paramo, p<ET> paramp, s<ET> params, p1<UT, UB> paramp1, UB paramUB)
  {
    j localj = (j)paramg1;
    int i = b;
    if (i != 11)
    {
      if ((i & 0x7) == 2)
      {
        paramo = paramp.b(paramo, a, i >>> 3);
        if (paramo != null)
        {
          paramp.h(paramo);
          return true;
        }
        return paramp1.l(paramUB, paramg1);
      }
      return localj.x();
    }
    paramg1 = null;
    params = null;
    i = 0;
    do
    {
      for (;;)
      {
        if (localj.a() == Integer.MAX_VALUE) {
          break label172;
        }
        int j = b;
        if (j == 16)
        {
          localj.w(0);
          i = a.y();
          paramg1 = paramp.b(paramo, a, i);
        }
        else
        {
          if (j != 26) {
            break;
          }
          if (paramg1 != null) {
            paramp.h(paramg1);
          } else {
            params = localj.e();
          }
        }
      }
    } while (localj.x());
    label172:
    if (b == 12)
    {
      if (params != null) {
        if (paramg1 != null) {
          paramp.i(paramg1);
        } else {
          paramp1.d(paramUB, i, params);
        }
      }
      return true;
    }
    throw b0.a();
  }
}

/* Location:
 * Qualified Name:     ma.w0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */