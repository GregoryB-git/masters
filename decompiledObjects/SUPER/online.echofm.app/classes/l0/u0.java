package l0;

import W2.s;
import android.util.Base64;
import d0.I;
import d0.I.b;
import d0.I.c;
import g0.M;
import g0.a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import x0.x.b;

public final class u0
  implements x1
{
  public static final s i = new t0();
  public static final Random j = new Random();
  public final I.c a;
  public final I.b b;
  public final HashMap c;
  public final s d;
  public x1.a e;
  public I f;
  public String g;
  public long h;
  
  public u0()
  {
    this(i);
  }
  
  public u0(s params)
  {
    d = params;
    a = new I.c();
    b = new I.b();
    c = new HashMap();
    f = I.a;
    h = -1L;
  }
  
  public static String m()
  {
    byte[] arrayOfByte = new byte[12];
    j.nextBytes(arrayOfByte);
    return Base64.encodeToString(arrayOfByte, 10);
  }
  
  public void a(x1.a parama)
  {
    e = parama;
  }
  
  public String b(I paramI, x.b paramb)
  {
    try
    {
      paramI = a.a(o(ha, b).c, paramb));
      return paramI;
    }
    finally
    {
      paramI = finally;
      throw paramI;
    }
  }
  
  public void c(c.a parama)
  {
    for (;;)
    {
      Iterator localIterator;
      a locala;
      try
      {
        a.e(e);
        I localI = f;
        f = b;
        localIterator = c.values().iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        locala = (a)localIterator.next();
        if (locala.m(localI, f)) {
          if (!locala.j(parama)) {
            continue;
          }
        }
      }
      finally
      {
        break label147;
      }
      localIterator.remove();
      if (a.d(locala))
      {
        if (a.a(locala).equals(g)) {
          l(locala);
        }
        e.f(parama, a.a(locala), false);
      }
    }
    p(parama);
    return;
    label147:
    throw parama;
  }
  
  public String d()
  {
    try
    {
      String str = g;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void e(c.a parama, int paramInt)
  {
    for (;;)
    {
      a locala;
      boolean bool1;
      try
      {
        a.e(e);
        if (paramInt == 0) {
          paramInt = 1;
        } else {
          paramInt = 0;
        }
        Iterator localIterator = c.values().iterator();
        if (!localIterator.hasNext()) {
          break;
        }
        locala = (a)localIterator.next();
        if (!locala.j(parama)) {
          continue;
        }
        localIterator.remove();
        if (!a.d(locala)) {
          continue;
        }
        bool1 = a.a(locala).equals(g);
        if ((paramInt != 0) && (bool1) && (a.f(locala))) {
          bool2 = true;
        }
      }
      finally
      {
        break label160;
      }
      boolean bool2 = false;
      if (bool1) {
        l(locala);
      }
      e.f(parama, a.a(locala), bool2);
    }
    p(parama);
    return;
    label160:
    throw parama;
  }
  
  public void f(c.a parama)
  {
    label412:
    try
    {
      a.e(e);
      boolean bool = b.q();
      if (bool) {
        return;
      }
      localObject1 = d;
      if (localObject1 != null)
      {
        l1 = d;
        long l2 = n();
        if (l1 < l2) {
          return;
        }
        localObject1 = (a)c.get(g);
        if ((localObject1 != null) && (a.b((a)localObject1) == -1L))
        {
          int k = a.c((a)localObject1);
          int m = c;
          if (k != m) {
            return;
          }
        }
      }
    }
    finally
    {
      long l1;
      break label412;
      Object localObject1 = o(c, d);
      if (g == null) {
        g = a.a((a)localObject1);
      }
      Object localObject2 = d;
      if ((localObject2 != null) && (((x.b)localObject2).b()))
      {
        localObject2 = new x0/x$b;
        Object localObject3 = d;
        ((x.b)localObject2).<init>(a, d, b);
        localObject3 = o(c, (x.b)localObject2);
        if (!a.d((a)localObject3))
        {
          a.e((a)localObject3, true);
          b.h(d.a, b);
          l1 = Math.max(0L, M.i1(b.f(d.b)) + b.m());
          c.a locala = new l0/c$a;
          locala.<init>(a, b, c, (x.b)localObject2, l1, f, g, h, i, j);
          e.p0(locala, a.a((a)localObject3));
        }
      }
      if (!a.d((a)localObject1))
      {
        localObject2 = localObject1;
        a.e((a)localObject2, true);
        e.p0(parama, a.a((a)localObject2));
      }
      if ((a.a((a)localObject1).equals(g)) && (!a.f((a)localObject1)))
      {
        a.g((a)localObject1, true);
        e.b0(parama, a.a((a)localObject1));
      }
      return;
    }
  }
  
  public void g(c.a parama)
  {
    Object localObject;
    try
    {
      localObject = g;
      if (localObject != null) {
        l((a)a.e((a)c.get(localObject)));
      }
    }
    finally
    {
      break label114;
    }
    Iterator localIterator = c.values().iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      localIterator.remove();
      if (a.d(locala))
      {
        localObject = e;
        if (localObject != null) {
          ((x1.a)localObject).f(parama, a.a(locala), false);
        }
      }
    }
    return;
    label114:
    throw parama;
  }
  
  public final void l(a parama)
  {
    if (a.b(parama) != -1L) {
      h = a.b(parama);
    }
    g = null;
  }
  
  public final long n()
  {
    a locala = (a)c.get(g);
    long l;
    if ((locala != null) && (a.b(locala) != -1L)) {
      l = a.b(locala);
    } else {
      l = h + 1L;
    }
    return l;
  }
  
  public final a o(int paramInt, x.b paramb)
  {
    Iterator localIterator = c.values().iterator();
    Object localObject1 = null;
    long l1 = Long.MAX_VALUE;
    while (localIterator.hasNext())
    {
      localObject2 = (a)localIterator.next();
      ((a)localObject2).k(paramInt, paramb);
      if (((a)localObject2).i(paramInt, paramb))
      {
        long l2 = a.b((a)localObject2);
        if (l2 != -1L)
        {
          boolean bool = l2 < l1;
          if (!bool)
          {
            if ((bool) || (a.h((a)M.i(localObject1)) == null) || (a.h((a)localObject2) == null)) {
              continue;
            }
            localObject1 = localObject2;
            continue;
          }
        }
        localObject1 = localObject2;
        l1 = l2;
      }
    }
    Object localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject1 = (String)d.get();
      localObject2 = new a((String)localObject1, paramInt, paramb);
      c.put(localObject1, localObject2);
    }
    return (a)localObject2;
  }
  
  public final void p(c.a parama)
  {
    if (b.q())
    {
      parama = g;
      if (parama != null) {
        l((a)a.e((a)c.get(parama)));
      }
      return;
    }
    a locala1 = (a)c.get(g);
    a locala2 = o(c, d);
    g = a.a(locala2);
    f(parama);
    Object localObject = d;
    if ((localObject != null) && (((x.b)localObject).b()) && ((locala1 == null) || (a.b(locala1) != d.d) || (a.h(locala1) == null) || (hb != d.b) || (hc != d.c)))
    {
      localObject = d;
      localObject = new x.b(a, d);
      localObject = o(c, (x.b)localObject);
      e.U(parama, a.a((a)localObject), a.a(locala2));
    }
  }
  
  public final class a
  {
    public final String a;
    public int b;
    public long c;
    public x.b d;
    public boolean e;
    public boolean f;
    
    public a(String paramString, int paramInt, x.b paramb)
    {
      a = paramString;
      b = paramInt;
      long l;
      if (paramb == null) {
        l = -1L;
      } else {
        l = d;
      }
      c = l;
      if ((paramb != null) && (paramb.b())) {
        d = paramb;
      }
    }
    
    public boolean i(int paramInt, x.b paramb)
    {
      boolean bool1 = false;
      boolean bool2 = false;
      boolean bool3 = false;
      if (paramb == null)
      {
        if (paramInt == b) {
          bool3 = true;
        }
        return bool3;
      }
      x.b localb = d;
      if (localb == null)
      {
        bool3 = bool1;
        if (!paramb.b())
        {
          bool3 = bool1;
          if (d == c) {
            bool3 = true;
          }
        }
        return bool3;
      }
      bool3 = bool2;
      if (d == d)
      {
        bool3 = bool2;
        if (b == b)
        {
          bool3 = bool2;
          if (c == c) {
            bool3 = true;
          }
        }
      }
      return bool3;
    }
    
    public boolean j(c.a parama)
    {
      x.b localb = d;
      boolean bool1 = true;
      boolean bool2 = true;
      boolean bool3 = true;
      if (localb == null)
      {
        if (b == c) {
          bool3 = false;
        }
        return bool3;
      }
      long l = c;
      if (l == -1L) {
        return false;
      }
      if (d > l) {
        return true;
      }
      if (d == null) {
        return false;
      }
      int i = b.b(a);
      int j = b.b(d.a);
      localb = d;
      if ((d >= d.d) && (i >= j))
      {
        if (i > j) {
          return true;
        }
        bool3 = localb.b();
        parama = d;
        if (bool3)
        {
          j = b;
          i = c;
          parama = d;
          int k = b;
          bool3 = bool1;
          if (j <= k) {
            if ((j == k) && (i > c)) {
              bool3 = bool1;
            } else {
              bool3 = false;
            }
          }
          return bool3;
        }
        i = e;
        bool3 = bool2;
        if (i != -1) {
          if (i > d.b) {
            bool3 = bool2;
          } else {
            bool3 = false;
          }
        }
        return bool3;
      }
      return false;
    }
    
    public void k(int paramInt, x.b paramb)
    {
      if ((c == -1L) && (paramInt == b) && (paramb != null) && (d >= u0.i(u0.this))) {
        c = d;
      }
    }
    
    public final int l(I paramI1, I paramI2, int paramInt)
    {
      if (paramInt >= paramI1.p())
      {
        if (paramInt >= paramI2.p()) {
          paramInt = -1;
        }
        return paramInt;
      }
      paramI1.n(paramInt, u0.j(u0.this));
      for (paramInt = jn; paramInt <= jo; paramInt++)
      {
        int i = paramI2.b(paramI1.m(paramInt));
        if (i != -1) {
          return fkc;
        }
      }
      return -1;
    }
    
    public boolean m(I paramI1, I paramI2)
    {
      int i = l(paramI1, paramI2, b);
      b = i;
      boolean bool = false;
      if (i == -1) {
        return false;
      }
      paramI1 = d;
      if (paramI1 == null) {
        return true;
      }
      if (paramI2.b(a) != -1) {
        bool = true;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     l0.u0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */