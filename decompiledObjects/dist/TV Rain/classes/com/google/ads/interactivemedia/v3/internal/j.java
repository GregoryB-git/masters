package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Handler;
import java.util.Collection;
import java.util.Iterator;

public class j
  implements p
{
  private static j a;
  private float b = 0.0F;
  private final l c;
  private final g d;
  private i e;
  private k f;
  
  public j(l paraml, g paramg)
  {
    c = paraml;
    d = paramg;
  }
  
  public static j a()
  {
    if (a == null)
    {
      g localg = new g();
      a = new j(new l(), localg);
    }
    return a;
  }
  
  private k e()
  {
    if (f == null) {
      f = k.a();
    }
    return f;
  }
  
  public void a(float paramFloat)
  {
    b = paramFloat;
    Iterator localIterator = e().c().iterator();
    while (localIterator.hasNext()) {
      ((e)localIterator.next()).e().a(paramFloat);
    }
  }
  
  public void a(Context paramContext)
  {
    h localh = new h();
    e = new i(new Handler(), paramContext, localh, this);
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      af.a().b();
      return;
    }
    af.a().d();
  }
  
  public void b()
  {
    n.a().a(this);
    n.a().b();
    if (n.a().d()) {
      af.a().b();
    }
    e.a();
  }
  
  public void c()
  {
    af.a().c();
    n.a().c();
    e.b();
  }
  
  public float d()
  {
    return b;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */