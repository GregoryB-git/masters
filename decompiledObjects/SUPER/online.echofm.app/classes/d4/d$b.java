package d4;

import Y3.m;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class d$b
{
  public StringBuilder a = null;
  public Stack b = new Stack();
  public int c = -1;
  public int d;
  public boolean e = true;
  public final List f = new ArrayList();
  public final List g = new ArrayList();
  public final d.d h;
  
  public d$b(d.d paramd)
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

/* Location:
 * Qualified Name:     d4.d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */