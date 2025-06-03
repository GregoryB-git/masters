package d4;

import Y3.e;
import Y3.m;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class d
{
  public final List a;
  public final List b;
  
  public d(List paramList1, List paramList2)
  {
    if (paramList1.size() == paramList2.size() - 1)
    {
      a = paramList1;
      b = paramList2;
      return;
    }
    throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
  }
  
  public static d b(n paramn)
  {
    return c(paramn, new c(paramn));
  }
  
  public static d c(n paramn, d paramd)
  {
    if (paramn.isEmpty()) {
      return new d(Collections.emptyList(), Collections.singletonList(""));
    }
    paramd = new b(paramd);
    f(paramn, paramd);
    b.a(paramd);
    return new d(b.b(paramd), b.c(paramd));
  }
  
  public static void f(n paramn, b paramb)
  {
    if (paramn.B())
    {
      b.d(paramb, (k)paramn);
    }
    else
    {
      if (paramn.isEmpty()) {
        break label86;
      }
      if (!(paramn instanceof c)) {
        break label53;
      }
      ((c)paramn).S(new a(paramb), true);
    }
    return;
    label53:
    paramb = new StringBuilder();
    paramb.append("Expected children node, but got: ");
    paramb.append(paramn);
    throw new IllegalStateException(paramb.toString());
    label86:
    throw new IllegalArgumentException("Can't calculate hash on empty node!");
  }
  
  public List d()
  {
    return Collections.unmodifiableList(b);
  }
  
  public List e()
  {
    return Collections.unmodifiableList(a);
  }
  
  public class a
    extends c.c
  {
    public a() {}
    
    public void b(b paramb, n paramn)
    {
      d.b.e(d.this, paramb);
      d.a(paramn, d.this);
      d.b.f(d.this);
    }
  }
  
  public static class b
  {
    public StringBuilder a = null;
    public Stack b = new Stack();
    public int c = -1;
    public int d;
    public boolean e = true;
    public final List f = new ArrayList();
    public final List g = new ArrayList();
    public final d.d h;
    
    public b(d.d paramd)
    {
      h = paramd;
    }
    
    public final void g(StringBuilder paramStringBuilder, b paramb)
    {
      paramStringBuilder.append(m.j(paramb.e()));
    }
    
    public boolean h()
    {
      boolean bool;
      if (a != null) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    
    public int i()
    {
      return a.length();
    }
    
    public V3.k j()
    {
      return k(d);
    }
    
    public final V3.k k(int paramInt)
    {
      b[] arrayOfb = new b[paramInt];
      for (int i = 0; i < paramInt; i++) {
        arrayOfb[i] = ((b)b.get(i));
      }
      return new V3.k(arrayOfb);
    }
    
    public final void l()
    {
      d -= 1;
      if (h()) {
        a.append(")");
      }
      e = true;
    }
    
    public final void m()
    {
      m.g(h(), "Can't end range without starting a range!");
      for (int i = 0; i < d; i++) {
        a.append(")");
      }
      a.append(")");
      V3.k localk = k(c);
      String str = m.i(a.toString());
      g.add(str);
      f.add(localk);
      a = null;
    }
    
    public final void n()
    {
      if (!h())
      {
        Object localObject = new StringBuilder();
        a = ((StringBuilder)localObject);
        ((StringBuilder)localObject).append("(");
        Iterator localIterator = k(d).iterator();
        while (localIterator.hasNext())
        {
          localObject = (b)localIterator.next();
          g(a, (b)localObject);
          a.append(":(");
        }
        e = false;
      }
    }
    
    public final void o()
    {
      boolean bool;
      if (d == 0) {
        bool = true;
      } else {
        bool = false;
      }
      m.g(bool, "Can't finish hashing in the middle processing a child");
      if (h()) {
        m();
      }
      g.add("");
    }
    
    public final void p(k paramk)
    {
      n();
      c = d;
      a.append(paramk.O(n.b.p));
      e = true;
      if (h.a(this)) {
        m();
      }
    }
    
    public final void q(b paramb)
    {
      n();
      if (e) {
        a.append(",");
      }
      g(a, paramb);
      a.append(":(");
      if (d == b.size()) {
        b.add(paramb);
      } else {
        b.set(d, paramb);
      }
      d += 1;
      e = false;
    }
  }
  
  public static class c
    implements d.d
  {
    public final long a;
    
    public c(n paramn)
    {
      a = Math.max(512L, Math.sqrt(e.b(paramn) * 100L));
    }
    
    public boolean a(d.b paramb)
    {
      boolean bool;
      if ((paramb.i() > a) && ((paramb.j().isEmpty()) || (!paramb.j().X().equals(b.o())))) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
  }
  
  public static abstract interface d
  {
    public abstract boolean a(d.b paramb);
  }
}

/* Location:
 * Qualified Name:     d4.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */