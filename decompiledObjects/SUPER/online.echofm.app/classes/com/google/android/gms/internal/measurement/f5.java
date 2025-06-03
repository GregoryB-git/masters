package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class f5
  implements Iterator
{
  public int o;
  public Iterator p;
  
  public f5(d5 paramd5)
  {
    o = d5.e(paramd5).size();
  }
  
  public final Iterator b()
  {
    if (p == null) {
      p = d5.l(q).entrySet().iterator();
    }
    return p;
  }
  
  public final boolean hasNext()
  {
    int i = o;
    return ((i > 0) && (i <= d5.e(q).size())) || (b().hasNext());
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.f5
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */