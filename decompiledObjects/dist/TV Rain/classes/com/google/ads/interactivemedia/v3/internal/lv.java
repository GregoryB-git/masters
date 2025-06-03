package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public abstract class lv<T>
  extends mq
{
  private final HashMap<T, lw> a = new HashMap();
  private Handler b;
  private vc c;
  
  public int a(T paramT, int paramInt)
  {
    return paramInt;
  }
  
  public mt a(T paramT, mt parammt)
  {
    return parammt;
  }
  
  public void a()
    throws IOException
  {
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext()) {
      nexta.a();
    }
  }
  
  public void a(vc paramvc)
  {
    c = paramvc;
    b = new Handler();
  }
  
  public final void a(T paramT)
  {
    paramT = (lw)rp.a((lw)a.get(paramT));
    a.a(b);
  }
  
  public final void a(T paramT, mq parammq)
  {
    rp.b(a.containsKey(paramT) ^ true);
    lu locallu = new lu(this, paramT);
    lx locallx = new lx(this, paramT);
    a.put(paramT, new lw(parammq, locallu, locallx));
    parammq.a((Handler)rp.a(b), locallx);
    parammq.a(locallu, c);
    if (!g()) {
      parammq.b(locallu);
    }
  }
  
  public abstract void a(T paramT, mq parammq, cr paramcr);
  
  public boolean a(mt parammt)
  {
    return true;
  }
  
  public void b()
  {
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      lw locallw = (lw)localIterator.next();
      a.a(b);
    }
  }
  
  public final void b(T paramT)
  {
    paramT = (lw)rp.a((lw)a.get(paramT));
    a.b(b);
  }
  
  public void c()
  {
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      lw locallw = (lw)localIterator.next();
      a.b(b);
    }
  }
  
  public final void c(T paramT)
  {
    paramT = (lw)rp.a((lw)a.remove(paramT));
    a.c(b);
    a.a(c);
  }
  
  public void d()
  {
    Iterator localIterator = a.values().iterator();
    while (localIterator.hasNext())
    {
      lw locallw = (lw)localIterator.next();
      a.c(b);
      a.a(c);
    }
    a.clear();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.lv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */