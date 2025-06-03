package com.google.ads.interactivemedia.v3.internal;

import a;
import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

final class bc
  extends au
{
  private final tg b;
  private final te c;
  private final Handler d;
  private final bo e;
  private final Handler f;
  private final CopyOnWriteArrayList<at> g;
  private final ct h;
  private final ArrayDeque<Runnable> i;
  private boolean j;
  private boolean k;
  private int l;
  private boolean m;
  private int n;
  private boolean o;
  private boolean p;
  private int q;
  private cg r;
  private cd s;
  private int t;
  private int u;
  private long v;
  
  @SuppressLint({"HandlerLeak"})
  public bc(cj[] paramArrayOfcj, te paramte, ca paramca, tm paramtm, vh paramvh, Looper paramLooper)
  {
    Object localObject1 = Integer.toHexString(System.identityHashCode(this));
    Object localObject2 = wl.e;
    localObject1 = a.q(a.b((String)localObject2, a.b((String)localObject1, 30)), "Init ", (String)localObject1, " [ExoPlayerLib/2.10.4", "] [");
    ((StringBuilder)localObject1).append((String)localObject2);
    ((StringBuilder)localObject1).append("]");
    Log.i("ExoPlayerImpl", ((StringBuilder)localObject1).toString());
    boolean bool;
    if (paramArrayOfcj.length > 0) {
      bool = true;
    } else {
      bool = false;
    }
    rp.c(bool);
    localObject2 = (cj[])rp.a(paramArrayOfcj);
    c = ((te)rp.a(paramte));
    j = false;
    l = 0;
    m = false;
    g = new CopyOnWriteArrayList();
    localObject2 = new tg(new cl[paramArrayOfcj.length], new sy[paramArrayOfcj.length], null);
    b = ((tg)localObject2);
    h = new ct();
    r = cg.a;
    paramLooper = new bd(this, paramLooper);
    d = paramLooper;
    s = cd.a(0L, (tg)localObject2);
    i = new ArrayDeque();
    paramArrayOfcj = new bo(paramArrayOfcj, paramte, (tg)localObject2, paramca, paramtm, j, 0, false, paramLooper, paramvh);
    e = paramArrayOfcj;
    f = new Handler(paramArrayOfcj.b());
  }
  
  private final cd a(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, int paramInt)
  {
    long l1 = 0L;
    int i1;
    Object localObject;
    if (paramBoolean1)
    {
      t = 0;
      u = 0;
      v = 0L;
    }
    else
    {
      t = e();
      if (n())
      {
        i1 = u;
      }
      else
      {
        localObject = s;
        i1 = a.a(b.a);
      }
      u = i1;
      v = g();
    }
    if ((!paramBoolean1) && (!paramBoolean2)) {
      i1 = 0;
    } else {
      i1 = 1;
    }
    if (i1 != 0) {
      localObject = s.a(false, a, h);
    } else {
      localObject = s.b;
    }
    if (i1 == 0) {
      l1 = s.m;
    }
    long l2;
    if (i1 != 0) {
      l2 = -9223372036854775807L;
    } else {
      l2 = s.d;
    }
    cr localcr;
    if (paramBoolean2) {
      localcr = cr.a;
    } else {
      localcr = s.a;
    }
    ba localba;
    if (paramBoolean3) {
      localba = null;
    } else {
      localba = s.f;
    }
    of localof;
    if (paramBoolean2) {
      localof = of.a;
    } else {
      localof = s.h;
    }
    tg localtg;
    if (paramBoolean2) {
      localtg = b;
    } else {
      localtg = s.i;
    }
    return new cd(localcr, (mt)localObject, l1, l2, paramInt, localba, false, localof, localtg, (mt)localObject, l1, 0L, l1);
  }
  
  private final void a(aw paramaw)
  {
    a(new be(new CopyOnWriteArrayList(g), paramaw));
  }
  
  private final void a(cd paramcd, boolean paramBoolean1, int paramInt1, int paramInt2, boolean paramBoolean2)
  {
    cd localcd = s;
    s = paramcd;
    a(new bg(paramcd, localcd, g, c, paramBoolean1, paramInt1, paramInt2, paramBoolean2, j));
  }
  
  private final void a(Runnable paramRunnable)
  {
    boolean bool = i.isEmpty();
    i.addLast(paramRunnable);
    if ((bool ^ true)) {
      return;
    }
    while (!i.isEmpty())
    {
      ((Runnable)i.peekFirst()).run();
      i.removeFirst();
    }
  }
  
  private static void c(CopyOnWriteArrayList<at> paramCopyOnWriteArrayList, aw paramaw)
  {
    paramCopyOnWriteArrayList = paramCopyOnWriteArrayList.iterator();
    while (paramCopyOnWriteArrayList.hasNext()) {
      paramaw.a(nexta);
    }
  }
  
  private final boolean m()
  {
    return (!n()) && (s.b.a());
  }
  
  private final boolean n()
  {
    return (s.a.a()) || (n > 0);
  }
  
  public final Looper a()
  {
    return d.getLooper();
  }
  
  public final ch a(cj paramcj)
  {
    return new ch(e, paramcj, s.a, e(), f);
  }
  
  public final void a(int paramInt, long paramLong)
  {
    cr localcr = s.a;
    if ((paramInt >= 0) && ((localcr.a()) || (paramInt < localcr.b())))
    {
      p = true;
      n += 1;
      if (m())
      {
        Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
        d.obtainMessage(0, 1, -1, s).sendToTarget();
        return;
      }
      t = paramInt;
      boolean bool = localcr.a();
      long l1 = 0L;
      if (bool)
      {
        if (paramLong != -9223372036854775807L) {
          l1 = paramLong;
        }
        v = l1;
        u = 0;
      }
      else
      {
        if (paramLong == -9223372036854775807L) {
          l1 = aa, 0L).g;
        } else {
          l1 = av.b(paramLong);
        }
        Pair localPair = localcr.a(a, h, paramInt, l1);
        v = av.a(l1);
        u = localcr.a(first);
      }
      e.a(localcr, paramInt, av.b(paramLong));
      a(bb.a);
      return;
    }
    throw new bx(localcr, paramInt, paramLong);
  }
  
  public final void a(Message paramMessage)
  {
    int i1 = what;
    boolean bool1 = true;
    int i2 = 0;
    if (i1 != 0)
    {
      if (i1 == 1)
      {
        localObject = (cg)obj;
        if (arg1 != 0) {
          i2 = 1;
        }
        if (i2 != 0) {
          q -= 1;
        }
        if ((q == 0) && (!r.equals(localObject)))
        {
          r = ((cg)localObject);
          a(new cp((cg)localObject));
        }
        return;
      }
      throw new IllegalStateException();
    }
    Object localObject = (cd)obj;
    i2 = arg1;
    i1 = arg2;
    if (i1 == -1) {
      bool1 = false;
    }
    i2 = n - i2;
    n = i2;
    if (i2 == 0)
    {
      paramMessage = (Message)localObject;
      if (c == -9223372036854775807L) {
        paramMessage = ((cd)localObject).a(b, 0L, d, l);
      }
      if ((!s.a.a()) && (a.a()))
      {
        u = 0;
        t = 0;
        v = 0L;
      }
      if (o) {
        i2 = 0;
      } else {
        i2 = 2;
      }
      boolean bool2 = p;
      o = false;
      p = false;
      a(paramMessage, bool1, i1, i2, bool2);
    }
  }
  
  public final void a(ci paramci)
  {
    g.addIfAbsent(new at(paramci));
  }
  
  public final void a(mq parammq, boolean paramBoolean1, boolean paramBoolean2)
  {
    cd localcd = a(paramBoolean1, paramBoolean2, true, 2);
    o = true;
    n += 1;
    e.a(parammq, paramBoolean1, paramBoolean2);
    a(localcd, false, 4, 1, false);
  }
  
  public final void a(boolean paramBoolean)
  {
    cd localcd = a(paramBoolean, paramBoolean, paramBoolean, 1);
    n += 1;
    e.b(paramBoolean);
    a(localcd, false, 4, 1, false);
  }
  
  public final void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if ((paramBoolean1) && (!paramBoolean2)) {
      paramBoolean2 = true;
    } else {
      paramBoolean2 = false;
    }
    if (k != paramBoolean2)
    {
      k = paramBoolean2;
      e.a(paramBoolean2);
    }
    if (j != paramBoolean1)
    {
      j = paramBoolean1;
      a(new bq(paramBoolean1, s.e));
    }
  }
  
  public final int b()
  {
    return s.e;
  }
  
  public final boolean c()
  {
    return j;
  }
  
  public final void d()
  {
    Object localObject = Integer.toHexString(System.identityHashCode(this));
    String str1 = wl.e;
    String str2 = bt.a();
    localObject = a.q(a.b(str2, a.b(str1, a.b((String)localObject, 36))), "Release ", (String)localObject, " [ExoPlayerLib/2.10.4", "] [");
    ((StringBuilder)localObject).append(str1);
    ((StringBuilder)localObject).append("] [");
    ((StringBuilder)localObject).append(str2);
    ((StringBuilder)localObject).append("]");
    Log.i("ExoPlayerImpl", ((StringBuilder)localObject).toString());
    e.a();
    d.removeCallbacksAndMessages(null);
    s = a(false, false, false, 1);
  }
  
  public final int e()
  {
    if (n()) {
      return t;
    }
    cd localcd = s;
    return a.a(b.a, h).b;
  }
  
  public final long f()
  {
    if (m())
    {
      cd localcd = s;
      localObject = b;
      a.a(a, h);
      return av.a(h.c(b, c));
    }
    Object localObject = l();
    if (((cr)localObject).a()) {
      return -9223372036854775807L;
    }
    return av.a(aea, 0L).h);
  }
  
  public final long g()
  {
    if (n()) {
      return v;
    }
    if (s.b.a()) {
      return av.a(s.m);
    }
    cd localcd = s;
    mt localmt = b;
    long l1 = av.a(m);
    s.a.a(a, h);
    return h.a() + l1;
  }
  
  public final long h()
  {
    return av.a(s.l);
  }
  
  public final int i()
  {
    if (m()) {
      return s.b.b;
    }
    return -1;
  }
  
  public final int j()
  {
    if (m()) {
      return s.b.c;
    }
    return -1;
  }
  
  public final long k()
  {
    if (m())
    {
      cd localcd = s;
      a.a(b.a, h);
      localcd = s;
      if (d == -9223372036854775807L) {
        return av.a(a.a(e(), a, 0L).g);
      }
      long l1 = h.a();
      return av.a(s.d) + l1;
    }
    return g();
  }
  
  public final cr l()
  {
    return s.a;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.bc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */