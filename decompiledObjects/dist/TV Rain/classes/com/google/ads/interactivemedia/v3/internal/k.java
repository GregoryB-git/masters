package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public final class k
{
  private static k a = new k();
  private final ArrayList<e> b = new ArrayList();
  private final ArrayList<e> c = new ArrayList();
  
  public static k a()
  {
    return a;
  }
  
  private final boolean d()
  {
    return c.size() > 0;
  }
  
  public final void a(e parame)
  {
    b.add(parame);
  }
  
  public final Collection<e> b()
  {
    return Collections.unmodifiableCollection(b);
  }
  
  public final void b(e parame)
  {
    boolean bool = d();
    c.add(parame);
    if (!bool) {
      j.a().b();
    }
  }
  
  public final Collection<e> c()
  {
    return Collections.unmodifiableCollection(c);
  }
  
  public final void c(e parame)
  {
    boolean bool = d();
    b.remove(parame);
    c.remove(parame);
    if ((bool) && (!d())) {
      j.a().c();
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */