package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class cq
  extends au
{
  private final cj[] b;
  private final bc c;
  private final Handler d;
  private final cs e;
  private final CopyOnWriteArraySet<wx> f;
  private final CopyOnWriteArraySet<dm> g;
  private final CopyOnWriteArraySet<Object> h;
  private final CopyOnWriteArraySet<xa> i;
  private final CopyOnWriteArraySet<dn> j;
  private final tm k;
  private final cv l;
  private final dh m;
  private Surface n;
  private boolean o;
  private SurfaceHolder p;
  private int q;
  private int r;
  private int s;
  private float t;
  private mq u;
  private boolean v;
  private boolean w;
  
  @Deprecated
  public cq(Context paramContext, co paramco, te paramte, ca paramca, fj<fn> paramfj, tm paramtm, cv paramcv, vh paramvh, Looper paramLooper)
  {
    k = paramtm;
    l = paramcv;
    cs localcs = new cs(this, (byte)0);
    e = localcs;
    CopyOnWriteArraySet localCopyOnWriteArraySet1 = new CopyOnWriteArraySet();
    f = localCopyOnWriteArraySet1;
    CopyOnWriteArraySet localCopyOnWriteArraySet2 = new CopyOnWriteArraySet();
    g = localCopyOnWriteArraySet2;
    new CopyOnWriteArraySet();
    CopyOnWriteArraySet localCopyOnWriteArraySet3 = new CopyOnWriteArraySet();
    h = localCopyOnWriteArraySet3;
    CopyOnWriteArraySet localCopyOnWriteArraySet4 = new CopyOnWriteArraySet();
    i = localCopyOnWriteArraySet4;
    CopyOnWriteArraySet localCopyOnWriteArraySet5 = new CopyOnWriteArraySet();
    j = localCopyOnWriteArraySet5;
    Handler localHandler = new Handler(paramLooper);
    d = localHandler;
    paramco = paramco.a(localHandler, localcs, localcs);
    b = paramco;
    t = 1.0F;
    s = 0;
    Collections.emptyList();
    paramco = new bc(paramco, paramte, paramca, paramtm, paramvh, paramLooper);
    c = paramco;
    paramcv.a(paramco);
    a(paramcv);
    a(localcs);
    localCopyOnWriteArraySet4.add(paramcv);
    localCopyOnWriteArraySet1.add(paramcv);
    localCopyOnWriteArraySet5.add(paramcv);
    localCopyOnWriteArraySet2.add(paramcv);
    localCopyOnWriteArraySet3.add(paramcv);
    paramtm.a(localHandler, paramcv);
    if ((paramfj instanceof fb))
    {
      paramco = (fb)paramfj;
      fb.a();
    }
    m = new dh(paramContext, localcs);
  }
  
  private final void a(int paramInt1, int paramInt2)
  {
    if ((paramInt1 != q) || (paramInt2 != r))
    {
      q = paramInt1;
      r = paramInt2;
      Iterator localIterator = f.iterator();
      while (localIterator.hasNext()) {
        ((wx)localIterator.next()).a(paramInt1, paramInt2);
      }
    }
  }
  
  private final void a(Surface paramSurface, boolean paramBoolean)
  {
    ArrayList localArrayList = new ArrayList();
    cj[] arrayOfcj = b;
    int i1 = arrayOfcj.length;
    int i2 = 0;
    for (int i3 = 0; i3 < i1; i3++)
    {
      localObject = arrayOfcj[i3];
      if (((cj)localObject).a() == 2) {
        localArrayList.add(c.a((cj)localObject).a(1).a(paramSurface).i());
      }
    }
    Object localObject = n;
    if ((localObject != null) && (localObject != paramSurface)) {
      try
      {
        i1 = localArrayList.size();
        i3 = i2;
        while (i3 < i1)
        {
          localObject = localArrayList.get(i3);
          i3++;
          ((ch)localObject).k();
        }
        n = paramSurface;
      }
      catch (InterruptedException localInterruptedException)
      {
        Thread.currentThread().interrupt();
        if (o) {
          n.release();
        }
      }
    }
    o = paramBoolean;
  }
  
  private final void a(ci paramci)
  {
    n();
    c.a(paramci);
  }
  
  private final void a(boolean paramBoolean, int paramInt)
  {
    bc localbc = c;
    boolean bool = false;
    if ((paramBoolean) && (paramInt != -1)) {
      paramBoolean = true;
    } else {
      paramBoolean = false;
    }
    if (paramInt != 1) {
      bool = true;
    }
    localbc.a(paramBoolean, bool);
  }
  
  private final void f()
  {
    SurfaceHolder localSurfaceHolder = p;
    if (localSurfaceHolder != null)
    {
      localSurfaceHolder.removeCallback(e);
      p = null;
    }
  }
  
  private final void m()
  {
    float f1 = t;
    float f2 = m.a();
    for (cj localcj : b) {
      if (localcj.a() == 1) {
        c.a(localcj).a(2).a(Float.valueOf(f2 * f1)).i();
      }
    }
  }
  
  private final void n()
  {
    if (Looper.myLooper() != c.a())
    {
      IllegalStateException localIllegalStateException;
      if (v) {
        localIllegalStateException = null;
      } else {
        localIllegalStateException = new IllegalStateException();
      }
      vr.a("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", localIllegalStateException);
      v = true;
    }
  }
  
  public final int a()
  {
    n();
    return c.b();
  }
  
  public final void a(int paramInt, long paramLong)
  {
    n();
    l.b();
    c.a(paramInt, paramLong);
  }
  
  public final void a(Surface paramSurface)
  {
    n();
    f();
    a(null, false);
    a(0, 0);
  }
  
  public final void a(SurfaceHolder paramSurfaceHolder)
  {
    n();
    f();
    p = paramSurfaceHolder;
    if (paramSurfaceHolder != null)
    {
      paramSurfaceHolder.addCallback(e);
      Surface localSurface = paramSurfaceHolder.getSurface();
      if ((localSurface != null) && (localSurface.isValid()))
      {
        a(localSurface, false);
        paramSurfaceHolder = paramSurfaceHolder.getSurfaceFrame();
        a(paramSurfaceHolder.width(), paramSurfaceHolder.height());
        return;
      }
    }
    a(null, false);
    a(0, 0);
  }
  
  public final void a(SurfaceView paramSurfaceView)
  {
    if (paramSurfaceView == null) {
      paramSurfaceView = null;
    } else {
      paramSurfaceView = paramSurfaceView.getHolder();
    }
    a(paramSurfaceView);
  }
  
  public final void a(da paramda)
  {
    n();
    l.a(paramda);
  }
  
  public final void a(mq parammq)
  {
    n();
    mq localmq = u;
    if (localmq != null)
    {
      localmq.a(l);
      l.c();
    }
    u = parammq;
    parammq.a(d, l);
    int i1 = m.a(b());
    a(b(), i1);
    c.a(parammq, true, true);
  }
  
  public final void a(wx paramwx)
  {
    f.add(paramwx);
  }
  
  public final void a(boolean paramBoolean)
  {
    n();
    c.a(paramBoolean);
    mq localmq = u;
    if (localmq != null)
    {
      localmq.a(l);
      l.c();
      if (paramBoolean) {
        u = null;
      }
    }
    m.b();
    Collections.emptyList();
  }
  
  public final void b(da paramda)
  {
    n();
    l.b(paramda);
  }
  
  public final void b(wx paramwx)
  {
    f.remove(paramwx);
  }
  
  public final void b(boolean paramBoolean)
  {
    n();
    a(paramBoolean, m.a(paramBoolean, a()));
  }
  
  public final boolean b()
  {
    n();
    return c.c();
  }
  
  public final void c()
  {
    n();
    m.b();
    c.d();
    f();
    Object localObject = n;
    if (localObject != null)
    {
      if (o) {
        ((Surface)localObject).release();
      }
      n = null;
    }
    localObject = u;
    if (localObject != null)
    {
      ((mq)localObject).a(l);
      u = null;
    }
    if (w)
    {
      ((wa)rp.a(null)).a(0);
      w = false;
    }
    k.a(l);
    Collections.emptyList();
  }
  
  public final long d()
  {
    n();
    return c.f();
  }
  
  public final int e()
  {
    n();
    return c.e();
  }
  
  public final long g()
  {
    n();
    return c.g();
  }
  
  public final long h()
  {
    n();
    return c.h();
  }
  
  public final int i()
  {
    n();
    return c.i();
  }
  
  public final int j()
  {
    n();
    return c.j();
  }
  
  public final long k()
  {
    n();
    return c.k();
  }
  
  public final cr l()
  {
    n();
    return c.l();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.cq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */