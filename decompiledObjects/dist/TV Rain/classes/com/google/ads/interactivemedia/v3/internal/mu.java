package com.google.ads.interactivemedia.v3.internal;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public final class mu
{
  public final int a;
  public final mt b;
  private final CopyOnWriteArrayList<ne> c;
  private final long d;
  
  public mu()
  {
    this(new CopyOnWriteArrayList(), 0, null, 0L);
  }
  
  private mu(CopyOnWriteArrayList<ne> paramCopyOnWriteArrayList, int paramInt, mt parammt, long paramLong)
  {
    c = paramCopyOnWriteArrayList;
    a = paramInt;
    b = parammt;
    d = paramLong;
  }
  
  private final long a(long paramLong)
  {
    paramLong = av.a(paramLong);
    if (paramLong == -9223372036854775807L) {
      return -9223372036854775807L;
    }
    return d + paramLong;
  }
  
  private static void a(Handler paramHandler, Runnable paramRunnable)
  {
    if (paramHandler.getLooper() == Looper.myLooper())
    {
      paramRunnable.run();
      return;
    }
    paramHandler.post(paramRunnable);
  }
  
  public final mu a(int paramInt, mt parammt, long paramLong)
  {
    return new mu(c, paramInt, parammt, paramLong);
  }
  
  public final void a()
  {
    mt localmt = (mt)rp.a(b);
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      ne localne = (ne)localIterator.next();
      mv localmv = b;
      a(a, new mx(this, localmv, localmt));
    }
  }
  
  public final void a(int paramInt, long paramLong1, long paramLong2)
  {
    a(new ng(1, paramInt, null, 3, null, a(paramLong1), a(paramLong2)));
  }
  
  public final void a(int paramInt1, bw parambw, int paramInt2, Object paramObject, long paramLong)
  {
    b(new ng(1, paramInt1, parambw, paramInt2, paramObject, a(paramLong), -9223372036854775807L));
  }
  
  public final void a(Handler paramHandler, mv parammv)
  {
    boolean bool;
    if ((paramHandler != null) && (parammv != null)) {
      bool = true;
    } else {
      bool = false;
    }
    rp.b(bool);
    c.add(new ne(paramHandler, parammv));
  }
  
  public final void a(mv parammv)
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      ne localne = (ne)localIterator.next();
      if (b == parammv) {
        c.remove(localne);
      }
    }
  }
  
  public final void a(ng paramng)
  {
    mt localmt = (mt)rp.a(b);
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      ne localne = (ne)localIterator.next();
      mv localmv = b;
      a(a, new nc(this, localmv, localmt, paramng));
    }
  }
  
  public final void a(nh paramnh, ng paramng)
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      ne localne = (ne)localIterator.next();
      mv localmv = b;
      a(a, new mz(this, localmv, paramnh, paramng));
    }
  }
  
  public final void a(nh paramnh, ng paramng, IOException paramIOException, boolean paramBoolean)
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      ne localne = (ne)localIterator.next();
      mv localmv = b;
      a(a, new na(this, localmv, paramnh, paramng, paramIOException, paramBoolean));
    }
  }
  
  public final void a(tx paramtx, int paramInt1, int paramInt2, bw parambw, int paramInt3, Object paramObject, long paramLong1, long paramLong2, long paramLong3)
  {
    a(new nh(paramtx, a, Collections.emptyMap(), paramLong3, 0L, 0L), new ng(paramInt1, paramInt2, parambw, paramInt3, paramObject, a(paramLong1), a(paramLong2)));
  }
  
  public final void a(tx paramtx, int paramInt, long paramLong)
  {
    a(paramtx, paramInt, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, paramLong);
  }
  
  public final void a(tx paramtx, Uri paramUri, Map<String, List<String>> paramMap, int paramInt1, int paramInt2, bw parambw, int paramInt3, Object paramObject, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5)
  {
    b(new nh(paramtx, paramUri, paramMap, paramLong3, paramLong4, paramLong5), new ng(paramInt1, paramInt2, parambw, paramInt3, paramObject, a(paramLong1), a(paramLong2)));
  }
  
  public final void a(tx paramtx, Uri paramUri, Map<String, List<String>> paramMap, int paramInt1, int paramInt2, bw parambw, int paramInt3, Object paramObject, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5, IOException paramIOException, boolean paramBoolean)
  {
    a(new nh(paramtx, paramUri, paramMap, paramLong3, paramLong4, paramLong5), new ng(paramInt1, paramInt2, parambw, paramInt3, paramObject, a(paramLong1), a(paramLong2)), paramIOException, paramBoolean);
  }
  
  public final void a(tx paramtx, Uri paramUri, Map<String, List<String>> paramMap, int paramInt, long paramLong1, long paramLong2, long paramLong3)
  {
    a(paramtx, paramUri, paramMap, paramInt, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, paramLong1, paramLong2, paramLong3);
  }
  
  public final void a(tx paramtx, Uri paramUri, Map<String, List<String>> paramMap, int paramInt, long paramLong1, long paramLong2, long paramLong3, IOException paramIOException, boolean paramBoolean)
  {
    a(paramtx, paramUri, paramMap, paramInt, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, paramLong1, paramLong2, paramLong3, paramIOException, paramBoolean);
  }
  
  public final void b()
  {
    mt localmt = (mt)rp.a(b);
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      ne localne = (ne)localIterator.next();
      mv localmv = b;
      a(a, new mw(this, localmv, localmt));
    }
  }
  
  public final void b(ng paramng)
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      ne localne = (ne)localIterator.next();
      mv localmv = b;
      a(a, new nf(this, localmv, paramng));
    }
  }
  
  public final void b(nh paramnh, ng paramng)
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      ne localne = (ne)localIterator.next();
      mv localmv = b;
      a(a, new my(this, localmv, paramnh, paramng));
    }
  }
  
  public final void b(tx paramtx, Uri paramUri, Map<String, List<String>> paramMap, int paramInt1, int paramInt2, bw parambw, int paramInt3, Object paramObject, long paramLong1, long paramLong2, long paramLong3, long paramLong4, long paramLong5)
  {
    c(new nh(paramtx, paramUri, paramMap, paramLong3, paramLong4, paramLong5), new ng(paramInt1, paramInt2, parambw, paramInt3, paramObject, a(paramLong1), a(paramLong2)));
  }
  
  public final void b(tx paramtx, Uri paramUri, Map<String, List<String>> paramMap, int paramInt, long paramLong1, long paramLong2, long paramLong3)
  {
    b(paramtx, paramUri, paramMap, paramInt, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L, paramLong1, paramLong2, paramLong3);
  }
  
  public final void c()
  {
    mt localmt = (mt)rp.a(b);
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      ne localne = (ne)localIterator.next();
      mv localmv = b;
      a(a, new nd(this, localmv, localmt));
    }
  }
  
  public final void c(nh paramnh, ng paramng)
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext())
    {
      ne localne = (ne)localIterator.next();
      mv localmv = b;
      a(a, new nb(this, localmv, paramnh, paramng));
    }
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.mu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */