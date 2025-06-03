package w3;

import e0.d;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import v3.r1;
import v3.r1.b;
import v3.r1.c;
import v5.e0;
import z4.s;
import z4.t.b;

public final class x
{
  public static final d g = new d(1);
  public static final Random h = new Random();
  public final r1.c a = new r1.c();
  public final r1.b b = new r1.b();
  public final HashMap<String, a> c = new HashMap();
  public z d;
  public r1 e = r1.a;
  public String f;
  
  public final a a(int paramInt, t.b paramb)
  {
    Iterator localIterator = c.values().iterator();
    Object localObject1 = null;
    long l1 = Long.MAX_VALUE;
    while (localIterator.hasNext())
    {
      localObject2 = (a)localIterator.next();
      if ((c == -1L) && (paramInt == b) && (paramb != null)) {
        c = d;
      }
      if (paramb == null)
      {
        if (paramInt != b) {
          break label169;
        }
      }
      else
      {
        t.b localb = d;
        if (localb == null ? (paramb.a()) || (d != c) : (d != d) || (b != b) || (c != c)) {
          break label169;
        }
      }
      boolean bool = true;
      break label172;
      label169:
      bool = false;
      label172:
      if (bool)
      {
        long l2 = c;
        if (l2 != -1L)
        {
          bool = l2 < l1;
          if (!bool)
          {
            if (bool) {
              continue;
            }
            int i = e0.a;
            if ((d == null) || (d == null)) {
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
      localObject1 = (String)g.get();
      localObject2 = new a((String)localObject1, paramInt, paramb);
      c.put(localObject1, localObject2);
    }
    return (a)localObject2;
  }
  
  public final void b(b.a parama)
  {
    if (b.p())
    {
      f = null;
      return;
    }
    Object localObject = (a)c.get(f);
    f = ac, d).a;
    c(parama);
    t.b localb = d;
    if ((localb != null) && (localb.a()))
    {
      if (localObject != null)
      {
        long l = c;
        localb = d;
        if (l == d)
        {
          localObject = d;
          if ((localObject != null) && (b == b) && (c == c)) {
            return;
          }
        }
      }
      localb = d;
      localb = new t.b(a, d);
      a(c, localb);
      d.getClass();
    }
  }
  
  public final void c(b.a parama)
  {
    try
    {
      d.getClass();
      boolean bool = b.p();
      if (bool) {
        return;
      }
      Object localObject1 = (a)c.get(f);
      Object localObject2 = d;
      long l1;
      if ((localObject2 != null) && (localObject1 != null))
      {
        l1 = c;
        int i = 0;
        if (l1 == -1L)
        {
          if (b == c) {
            break label105;
          }
        }
        else
        {
          long l2 = d;
          if (l2 >= l1) {
            break label105;
          }
        }
        i = 1;
        label105:
        if (i != 0) {
          return;
        }
      }
      localObject1 = a(c, (t.b)localObject2);
      if (f == null) {
        f = a;
      }
      localObject2 = d;
      if ((localObject2 != null) && (((s)localObject2).a()))
      {
        t.b localb1 = new z4/t$b;
        t.b localb2 = d;
        localObject2 = a;
        l1 = d;
        localb1.<init>(localObject2, b, l1);
        localObject2 = a(c, localb1);
        if (!e)
        {
          e = true;
          b.g(d.a, b);
          Math.max(0L, e0.R(b.d(d.b)) + e0.R(b.e));
          d.getClass();
        }
      }
      if (!e)
      {
        e = true;
        d.getClass();
      }
      if ((a.equals(f)) && (!f))
      {
        f = true;
        localObject2 = d;
        localObject1 = a;
        ((y)localObject2).l(parama, (String)localObject1);
      }
      return;
    }
    finally {}
  }
  
  public final class a
  {
    public final String a;
    public int b;
    public long c;
    public t.b d;
    public boolean e;
    public boolean f;
    
    public a(String paramString, int paramInt, t.b paramb)
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
      if ((paramb != null) && (paramb.a())) {
        d = paramb;
      }
    }
    
    public final boolean a(b.a parama)
    {
      t.b localb = d;
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
        bool3 = localb.a();
        parama = d;
        if (bool3)
        {
          j = b;
          int k = c;
          parama = d;
          i = b;
          bool3 = bool1;
          if (j <= i) {
            if ((j == i) && (k > c)) {
              bool3 = bool1;
            } else {
              bool3 = false;
            }
          }
          return bool3;
        }
        j = e;
        bool3 = bool2;
        if (j != -1) {
          if (j > d.b) {
            bool3 = bool2;
          } else {
            bool3 = false;
          }
        }
        return bool3;
      }
      return false;
    }
    
    public final boolean b(r1 paramr11, r1 paramr12)
    {
      int i = b;
      int j = paramr11.o();
      boolean bool = false;
      if (i >= j)
      {
        if (i < paramr12.o()) {}
      }
      else {
        for (;;)
        {
          i = -1;
          break;
          paramr11.m(i, a);
          for (i = a.w; i <= a.x; i++)
          {
            j = paramr12.b(paramr11.l(i));
            if (j != -1)
            {
              i = fb, false).c;
              break label118;
            }
          }
        }
      }
      label118:
      b = i;
      if (i == -1) {
        return false;
      }
      paramr11 = d;
      if (paramr11 == null) {
        return true;
      }
      if (paramr12.b(a) != -1) {
        bool = true;
      }
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     w3.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */