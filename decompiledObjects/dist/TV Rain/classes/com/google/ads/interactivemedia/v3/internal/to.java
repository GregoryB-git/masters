package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayList;
import java.util.Map;

public abstract class to
  implements tt
{
  private final boolean a;
  private final ArrayList<vc> b;
  private int c;
  private tx d;
  
  public to(boolean paramBoolean)
  {
    a = paramBoolean;
    b = new ArrayList(1);
  }
  
  public final void a(int paramInt)
  {
    tx localtx = (tx)wl.a(d);
    for (int i = 0; i < c; i++) {
      ((vc)b.get(i)).a(a, paramInt);
    }
  }
  
  public final void a(vc paramvc)
  {
    if (!b.contains(paramvc))
    {
      b.add(paramvc);
      c += 1;
    }
  }
  
  public Map b()
  {
    return rp.c();
  }
  
  public final void b(tx paramtx)
  {
    for (int i = 0; i < c; i++) {
      ((vc)b.get(i)).c();
    }
  }
  
  public final void c(tx paramtx)
  {
    d = paramtx;
    for (int i = 0; i < c; i++) {
      ((vc)b.get(i)).a(a);
    }
  }
  
  public final void d()
  {
    tx localtx = (tx)wl.a(d);
    for (int i = 0; i < c; i++) {
      ((vc)b.get(i)).b(a);
    }
    d = null;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.to
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */