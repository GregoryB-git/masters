package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class n5
  implements Iterator
{
  public int o = -1;
  public boolean p;
  public Iterator q;
  
  public n5(d5 paramd5) {}
  
  public final Iterator b()
  {
    if (q == null) {
      q = d5.i(r).entrySet().iterator();
    }
    return q;
  }
  
  public final boolean hasNext()
  {
    return (o + 1 < d5.e(r).size()) || ((!d5.i(r).isEmpty()) && (b().hasNext()));
  }
  
  public final void remove()
  {
    if (p)
    {
      p = false;
      d5.n(r);
      if (o < d5.e(r).size())
      {
        d5 locald5 = r;
        int i = o;
        o = (i - 1);
        d5.c(locald5, i);
        return;
      }
      b().remove();
      return;
    }
    throw new IllegalStateException("remove() was called before next()");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.n5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */