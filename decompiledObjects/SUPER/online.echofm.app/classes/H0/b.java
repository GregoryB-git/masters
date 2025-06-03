package H0;

import F0.J;
import F0.L;
import F0.M;
import F0.M.a;
import F0.M.b;
import F0.N;
import F0.T;
import F0.r;
import F0.s;
import F0.t;
import c1.t.a;
import d0.A;
import d0.q;
import d0.q.b;
import g0.o;
import java.util.ArrayList;
import java.util.Iterator;

public final class b
  implements r
{
  public final g0.z a;
  public final c b;
  public final boolean c;
  public final t.a d;
  public int e;
  public t f;
  public c g;
  public long h;
  public e[] i;
  public long j;
  public e k;
  public int l;
  public long m;
  public long n;
  public int o;
  public boolean p;
  
  public b(int paramInt, t.a parama)
  {
    d = parama;
    boolean bool = true;
    if ((paramInt & 0x1) != 0) {
      bool = false;
    }
    c = bool;
    a = new g0.z(12);
    b = new c(null);
    f = new J();
    i = new e[0];
    m = -1L;
    n = -1L;
    l = -1;
    h = -9223372036854775807L;
  }
  
  public static void f(s params)
  {
    if ((params.p() & 1L) == 1L) {
      params.i(1);
    }
  }
  
  public void a(long paramLong1, long paramLong2)
  {
    j = -1L;
    k = null;
    e[] arrayOfe = i;
    int i1 = arrayOfe.length;
    for (int i2 = 0; i2 < i1; i2++) {
      arrayOfe[i2].o(paramLong1);
    }
    if (paramLong1 == 0L)
    {
      if (i.length == 0) {
        e = 0;
      } else {
        e = 3;
      }
      return;
    }
    e = 6;
  }
  
  public void b(t paramt)
  {
    e = 0;
    Object localObject = paramt;
    if (c) {
      localObject = new c1.v(paramt, d);
    }
    f = ((t)localObject);
    j = -1L;
  }
  
  public boolean e(s params)
  {
    byte[] arrayOfByte = a.e();
    boolean bool = false;
    params.n(arrayOfByte, 0, 12);
    a.T(0);
    if (a.t() != 1179011410) {
      return false;
    }
    a.U(4);
    if (a.t() == 541677121) {
      bool = true;
    }
    return bool;
  }
  
  public final e h(int paramInt)
  {
    for (e locale : i) {
      if (locale.j(paramInt)) {
        return locale;
      }
    }
    return null;
  }
  
  public int i(s params, L paramL)
  {
    if (o(params, paramL)) {
      return 1;
    }
    int i1;
    int i2;
    switch (e)
    {
    default: 
      throw new AssertionError();
    case 6: 
      return n(params);
    case 5: 
      paramL = new g0.z(o);
      params.readFully(paramL.e(), 0, o);
      k(paramL);
      e = 6;
      j = m;
      return 0;
    case 4: 
      params.readFully(a.e(), 0, 8);
      a.T(0);
      i1 = a.t();
      i2 = a.t();
      if (i1 == 829973609)
      {
        e = 5;
        o = i2;
      }
      else
      {
        j = (params.p() + i2);
      }
      return 0;
    case 3: 
      long l2;
      if (m != -1L)
      {
        long l1 = params.p();
        l2 = m;
        if (l1 != l2)
        {
          j = l2;
          return 0;
        }
      }
      params.n(a.e(), 0, 12);
      params.h();
      a.T(0);
      b.a(a);
      i2 = a.t();
      i1 = b.a;
      if (i1 == 1179011410)
      {
        params.i(12);
        return 0;
      }
      if ((i1 == 1414744396) && (i2 == 1769369453))
      {
        l2 = params.p();
        m = l2;
        n = (l2 + b.b + 8L);
        if (!p)
        {
          if (((c)g0.a.e(g)).b())
          {
            e = 4;
            j = n;
            return 0;
          }
          f.e(new M.b(h));
          p = true;
        }
        j = (params.p() + 12L);
        e = 6;
        return 0;
      }
      j = (params.p() + b.b + 8L);
      return 0;
    case 2: 
      i1 = l - 4;
      paramL = new g0.z(i1);
      params.readFully(paramL.e(), 0, i1);
      j(paramL);
      e = 3;
      return 0;
    case 1: 
      params.readFully(a.e(), 0, 12);
      a.T(0);
      b.b(a);
      params = b;
      if (c == 1819436136)
      {
        l = b;
        e = 2;
        return 0;
      }
      params = new StringBuilder();
      params.append("hdrl expected, found: ");
      params.append(b.c);
      throw A.a(params.toString(), null);
    }
    if (e(params))
    {
      params.i(12);
      e = 1;
      return 0;
    }
    throw A.a("AVI Header List not found", null);
  }
  
  public final void j(g0.z paramz)
  {
    Object localObject1 = f.d(1819436136, paramz);
    if (((f)localObject1).a() == 1819436136)
    {
      paramz = (c)((f)localObject1).c(c.class);
      if (paramz != null)
      {
        g = paramz;
        h = (c * a);
        paramz = new ArrayList();
        localObject1 = a.q();
        int i1 = 0;
        while (((Iterator)localObject1).hasNext())
        {
          Object localObject2 = (a)((Iterator)localObject1).next();
          if (((a)localObject2).a() == 1819440243)
          {
            localObject2 = m((f)localObject2, i1);
            if (localObject2 != null) {
              paramz.add(localObject2);
            }
            i1++;
          }
        }
        i = ((e[])paramz.toArray(new e[0]));
        f.j();
        return;
      }
      throw A.a("AviHeader not found", null);
    }
    paramz = new StringBuilder();
    paramz.append("Unexpected header list type ");
    paramz.append(((f)localObject1).a());
    throw A.a(paramz.toString(), null);
  }
  
  public final void k(g0.z paramz)
  {
    long l1 = l(paramz);
    while (paramz.a() >= 16)
    {
      i1 = paramz.t();
      i2 = paramz.t();
      long l2 = paramz.t();
      paramz.t();
      e locale = h(i1);
      if (locale != null)
      {
        if ((i2 & 0x10) == 16) {
          locale.b(l2 + l1);
        }
        locale.k();
      }
    }
    paramz = i;
    int i1 = paramz.length;
    for (int i2 = 0; i2 < i1; i2++) {
      paramz[i2].c();
    }
    p = true;
    f.e(new b(h));
  }
  
  public final long l(g0.z paramz)
  {
    int i1 = paramz.a();
    long l1 = 0L;
    if (i1 < 16) {
      return 0L;
    }
    i1 = paramz.f();
    paramz.U(8);
    long l2 = paramz.t();
    long l3 = m;
    if (l2 <= l3) {
      l1 = l3 + 8L;
    }
    paramz.T(i1);
    return l1;
  }
  
  public final e m(f paramf, int paramInt)
  {
    d locald = (d)paramf.c(d.class);
    Object localObject = (g)paramf.c(g.class);
    if (locald == null) {}
    for (paramf = "Missing Stream Header";; paramf = "Missing Stream Format")
    {
      o.h("AviExtractor", paramf);
      return null;
      if (localObject != null) {
        break;
      }
    }
    long l1 = locald.b();
    q localq = a;
    localObject = localq.a();
    ((q.b)localObject).Z(paramInt);
    int i1 = f;
    if (i1 != 0) {
      ((q.b)localObject).f0(i1);
    }
    paramf = (h)paramf.c(h.class);
    if (paramf != null) {
      ((q.b)localObject).c0(a);
    }
    i1 = d0.z.k(n);
    if ((i1 != 1) && (i1 != 2)) {
      return null;
    }
    paramf = f.a(paramInt, i1);
    paramf.d(((q.b)localObject).K());
    paramf = new e(paramInt, i1, l1, e, paramf);
    h = l1;
    return paramf;
  }
  
  public final int n(s params)
  {
    if (params.p() >= n) {
      return -1;
    }
    Object localObject = k;
    if (localObject != null)
    {
      if (((e)localObject).m(params)) {
        k = null;
      }
    }
    else
    {
      f(params);
      localObject = a.e();
      int i1 = 12;
      params.n((byte[])localObject, 0, 12);
      a.T(0);
      int i2 = a.t();
      if (i2 == 1414744396)
      {
        a.T(8);
        if (a.t() != 1769369453) {
          i1 = 8;
        }
        params.i(i1);
        params.h();
        return 0;
      }
      i1 = a.t();
      if (i2 == 1263424842)
      {
        j = (params.p() + i1 + 8L);
        return 0;
      }
      params.i(8);
      params.h();
      localObject = h(i2);
      if (localObject == null)
      {
        j = (params.p() + i1);
        return 0;
      }
      ((e)localObject).n(i1);
      k = ((e)localObject);
    }
    return 0;
  }
  
  public final boolean o(s params, L paramL)
  {
    if (j != -1L)
    {
      long l1 = params.p();
      long l2 = j;
      if ((l2 >= l1) && (l2 <= 262144L + l1))
      {
        params.i((int)(l2 - l1));
      }
      else
      {
        a = l2;
        bool = true;
        break label74;
      }
    }
    boolean bool = false;
    label74:
    j = -1L;
    return bool;
  }
  
  public void release() {}
  
  public class b
    implements M
  {
    public final long a;
    
    public b(long paramLong)
    {
      a = paramLong;
    }
    
    public boolean h()
    {
      return true;
    }
    
    public M.a j(long paramLong)
    {
      Object localObject1 = b.c(b.this)[0].i(paramLong);
      int i = 1;
      while (i < b.c(b.this).length)
      {
        M.a locala = b.c(b.this)[i].i(paramLong);
        Object localObject2 = localObject1;
        if (a.b < a.b) {
          localObject2 = locala;
        }
        i++;
        localObject1 = localObject2;
      }
      return (M.a)localObject1;
    }
    
    public long l()
    {
      return a;
    }
  }
  
  public static class c
  {
    public int a;
    public int b;
    public int c;
    
    public void a(g0.z paramz)
    {
      a = paramz.t();
      b = paramz.t();
      c = 0;
    }
    
    public void b(g0.z paramz)
    {
      a(paramz);
      if (a == 1414744396)
      {
        c = paramz.t();
        return;
      }
      paramz = new StringBuilder();
      paramz.append("LIST expected, found: ");
      paramz.append(a);
      throw A.a(paramz.toString(), null);
    }
  }
}

/* Location:
 * Qualified Name:     H0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */