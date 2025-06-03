package com.google.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class c0$f
  implements Iterator
{
  public int o = -1;
  public boolean p;
  public Iterator q;
  
  public c0$f(c0 paramc0) {}
  
  public final Iterator b()
  {
    if (q == null) {
      q = c0.c(r).entrySet().iterator();
    }
    return q;
  }
  
  public Map.Entry d()
  {
    p = true;
    int i = o + 1;
    o = i;
    if (i < c0.b(r).size()) {}
    for (Object localObject = c0.b(r).get(o);; localObject = b().next()) {
      return (Map.Entry)localObject;
    }
  }
  
  public boolean hasNext()
  {
    int i = o;
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (i + 1 >= c0.b(r).size()) {
      if ((!c0.c(r).isEmpty()) && (b().hasNext())) {
        bool2 = bool1;
      } else {
        bool2 = false;
      }
    }
    return bool2;
  }
  
  public void remove()
  {
    if (p)
    {
      p = false;
      c0.a(r);
      if (o < c0.b(r).size())
      {
        c0 localc0 = r;
        int i = o;
        o = (i - 1);
        c0.d(localc0, i);
      }
      else
      {
        b().remove();
      }
      return;
    }
    throw new IllegalStateException("remove() was called before next()");
  }
}

/* Location:
 * Qualified Name:     com.google.protobuf.c0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */