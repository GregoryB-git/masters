package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;

public abstract class mq
{
  private final ArrayList<ms> a = new ArrayList(1);
  private final HashSet<ms> b = new HashSet(1);
  private final mu c = new mu();
  private Looper d;
  private cr e;
  
  public abstract mo a(mt parammt, tk paramtk, long paramLong);
  
  public mu a(int paramInt, mt parammt, long paramLong)
  {
    return c.a(paramInt, parammt, 0L);
  }
  
  public mu a(mt parammt, long paramLong)
  {
    boolean bool;
    if (parammt != null) {
      bool = true;
    } else {
      bool = false;
    }
    rp.b(bool);
    return c.a(0, parammt, paramLong);
  }
  
  public abstract void a()
    throws IOException;
  
  public void a(Handler paramHandler, mv parammv)
  {
    c.a(paramHandler, parammv);
  }
  
  public void a(cr paramcr)
  {
    e = paramcr;
    ArrayList localArrayList = a;
    int i = localArrayList.size();
    int j = 0;
    while (j < i)
    {
      Object localObject = localArrayList.get(j);
      j++;
      ((ms)localObject).a(this, paramcr);
    }
  }
  
  public abstract void a(mo parammo);
  
  public void a(ms paramms)
  {
    rp.a(d);
    boolean bool = b.isEmpty();
    b.add(paramms);
    if (bool) {
      b();
    }
  }
  
  public void a(ms paramms, vc paramvc)
  {
    Looper localLooper = Looper.myLooper();
    Object localObject = d;
    boolean bool;
    if ((localObject != null) && (localObject != localLooper)) {
      bool = false;
    } else {
      bool = true;
    }
    rp.b(bool);
    localObject = e;
    a.add(paramms);
    if (d == null)
    {
      d = localLooper;
      b.add(paramms);
      a(paramvc);
      return;
    }
    if (localObject != null)
    {
      a(paramms);
      paramms.a(this, (cr)localObject);
    }
  }
  
  public void a(mv parammv)
  {
    c.a(parammv);
  }
  
  public abstract void a(vc paramvc);
  
  public mu b(mt parammt)
  {
    return c.a(0, parammt, 0L);
  }
  
  public void b() {}
  
  public void b(ms paramms)
  {
    boolean bool = b.isEmpty();
    b.remove(paramms);
    if (((bool ^ true)) && (b.isEmpty())) {
      c();
    }
  }
  
  public void c() {}
  
  public void c(ms paramms)
  {
    a.remove(paramms);
    if (a.isEmpty())
    {
      d = null;
      e = null;
      b.clear();
      d();
      return;
    }
    b(paramms);
  }
  
  public abstract void d();
  
  public Object e()
  {
    return null;
  }
  
  public boolean g()
  {
    return !b.isEmpty();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.mq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */