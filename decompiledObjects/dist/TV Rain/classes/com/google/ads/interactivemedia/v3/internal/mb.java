package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class mb
  extends lv<mf>
{
  private final List<mf> a;
  private final Set<mc> b;
  private Handler c;
  private final List<mf> d;
  private final Map<mo, mf> e;
  private final Map<Object, mf> f;
  private final Set<mf> g;
  private final boolean h;
  private final boolean i;
  private boolean j;
  private Set<mc> k;
  private ob l;
  
  private mb(boolean paramBoolean, ob paramob, mq... paramVarArgs)
  {
    this(paramBoolean, false, paramob, paramVarArgs);
  }
  
  private mb(boolean paramBoolean1, boolean paramBoolean2, ob paramob, mq... paramVarArgs)
  {
    int m = paramVarArgs.length;
    for (int n = 0; n < m; n++) {
      rp.a(paramVarArgs[n]);
    }
    ob localob = paramob;
    if (paramob.a() > 0) {
      localob = paramob.d();
    }
    l = localob;
    e = new IdentityHashMap();
    f = new HashMap();
    a = new ArrayList();
    d = new ArrayList();
    k = new HashSet();
    b = new HashSet();
    g = new HashSet();
    h = paramBoolean1;
    i = false;
    a(Arrays.asList(paramVarArgs));
  }
  
  private mb(boolean paramBoolean, mq... paramVarArgs)
  {
    this(false, new ob(0), paramVarArgs);
  }
  
  public mb(mq... paramVarArgs)
  {
    this(false, paramVarArgs);
  }
  
  private final mc a(Handler paramHandler, Runnable paramRunnable)
  {
    if ((paramHandler != null) && (paramRunnable != null))
    {
      paramHandler = new mc(paramHandler, paramRunnable);
      b.add(paramHandler);
      return paramHandler;
    }
    return null;
  }
  
  private final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    while (paramInt1 < d.size())
    {
      mf localmf = (mf)d.get(paramInt1);
      d += paramInt2;
      e += paramInt3;
      paramInt1++;
    }
  }
  
  private final void a(int paramInt, mq parammq)
  {
    try
    {
      a(paramInt, Collections.singletonList(parammq), null, null);
      return;
    }
    finally
    {
      parammq = finally;
      throw parammq;
    }
  }
  
  private final void a(int paramInt, Collection<mf> paramCollection)
  {
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      mf localmf1 = (mf)paramCollection.next();
      if (paramInt > 0)
      {
        mf localmf2 = (mf)d.get(paramInt - 1);
        cr localcr = a.f();
        int m = e;
        localmf1.a(paramInt, localcr.b() + m);
      }
      else
      {
        localmf1.a(paramInt, 0);
      }
      a(paramInt, 1, a.f().b());
      d.add(paramInt, localmf1);
      f.put(b, localmf1);
      a(localmf1, a);
      if ((g()) && (e.isEmpty())) {
        g.add(localmf1);
      } else {
        b(localmf1);
      }
      paramInt++;
    }
  }
  
  private final void a(int paramInt, Collection<mq> paramCollection, Handler paramHandler, Runnable paramRunnable)
  {
    rp.b(true);
    paramHandler = c;
    paramRunnable = paramCollection.iterator();
    while (paramRunnable.hasNext()) {
      rp.a((mq)paramRunnable.next());
    }
    paramRunnable = new ArrayList(paramCollection.size());
    Iterator localIterator = paramCollection.iterator();
    while (localIterator.hasNext()) {
      paramRunnable.add(new mf((mq)localIterator.next(), i));
    }
    a.addAll(paramInt, paramRunnable);
    if ((paramHandler != null) && (!paramCollection.isEmpty())) {
      paramHandler.obtainMessage(0, new me(paramInt, paramRunnable, a(null, null))).sendToTarget();
    }
  }
  
  private final void a(mc parammc)
  {
    if (!j)
    {
      h().obtainMessage(4).sendToTarget();
      j = true;
    }
    if (parammc != null) {
      k.add(parammc);
    }
  }
  
  private final void a(mf parammf)
  {
    if ((f) && (c.isEmpty()))
    {
      g.remove(parammf);
      c(parammf);
    }
  }
  
  private final void a(Collection<mq> paramCollection)
  {
    try
    {
      a(a.size(), paramCollection, null, null);
      return;
    }
    finally
    {
      paramCollection = finally;
      throw paramCollection;
    }
  }
  
  private final void a(Set<mc> paramSet)
  {
    try
    {
      Iterator localIterator = paramSet.iterator();
      while (localIterator.hasNext()) {
        ((mc)localIterator.next()).a();
      }
      b.removeAll(paramSet);
      return;
    }
    finally {}
  }
  
  private final mq b(int paramInt)
  {
    try
    {
      mn localmn = a.get(paramInt)).a;
      return localmn;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private final void f()
  {
    j = false;
    Set localSet = k;
    k = new HashSet();
    a(new lr(d, l, h));
    h().obtainMessage(5, localSet).sendToTarget();
  }
  
  private final Handler h()
  {
    return (Handler)rp.a(c);
  }
  
  private final void i()
  {
    Iterator localIterator = g.iterator();
    while (localIterator.hasNext())
    {
      mf localmf = (mf)localIterator.next();
      if (c.isEmpty())
      {
        b(localmf);
        localIterator.remove();
      }
    }
  }
  
  public final mo a(mt parammt, tk paramtk, long paramLong)
  {
    Object localObject = lr.b(a);
    mt localmt = parammt.a(lr.c(a));
    localObject = (mf)f.get(localObject);
    parammt = (mt)localObject;
    if (localObject == null)
    {
      parammt = new mf(new md((byte)0), i);
      f = true;
      a(parammt, a);
    }
    g.add(parammt);
    a(parammt);
    c.add(localmt);
    paramtk = a.b(localmt, paramtk, paramLong);
    e.put(paramtk, parammt);
    i();
    return paramtk;
  }
  
  public final mq a(int paramInt)
  {
    try
    {
      mq localmq = b(paramInt);
      int m = paramInt + 1;
      rp.b(true);
      Handler localHandler = c;
      wl.a(a, paramInt, m);
      if (localHandler != null)
      {
        mc localmc = a(null, null);
        me localme = new com/google/ads/interactivemedia/v3/internal/me;
        localme.<init>(paramInt, Integer.valueOf(m), localmc);
        localHandler.obtainMessage(1, localme).sendToTarget();
      }
      return localmq;
    }
    finally {}
  }
  
  public final void a(mo parammo)
  {
    mf localmf = (mf)rp.a((mf)e.remove(parammo));
    a.a(parammo);
    c.remove(a);
    if (!e.isEmpty()) {
      i();
    }
    a(localmf);
  }
  
  public final void a(mq parammq)
  {
    try
    {
      a(a.size(), parammq);
      return;
    }
    finally
    {
      parammq = finally;
      throw parammq;
    }
  }
  
  public final void a(vc paramvc)
  {
    try
    {
      super.a(paramvc);
      Handler localHandler = new android/os/Handler;
      paramvc = new com/google/ads/interactivemedia/v3/internal/ma;
      paramvc.<init>(this);
      localHandler.<init>(paramvc);
      c = localHandler;
      if (a.isEmpty())
      {
        f();
        return;
      }
      l = l.a(0, a.size());
      a(0, a);
      a(null);
      return;
    }
    finally {}
  }
  
  public final void b() {}
  
  public final void c()
  {
    super.c();
    g.clear();
  }
  
  public final void d()
  {
    try
    {
      super.d();
      d.clear();
      g.clear();
      f.clear();
      l = l.d();
      Handler localHandler = c;
      if (localHandler != null)
      {
        localHandler.removeCallbacksAndMessages(null);
        c = null;
      }
      j = false;
      k.clear();
      a(b);
      return;
    }
    finally {}
  }
  
  public final Object e()
  {
    return null;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.mb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */