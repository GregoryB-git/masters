package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public final class ps
  implements Handler.Callback
{
  private final tk a;
  private final pu b;
  private final kj c;
  private final Handler d;
  private final TreeMap<Long, Long> e;
  private aaa f;
  private long g;
  private long h;
  private long i;
  private boolean j;
  private boolean k;
  
  public ps(aaa paramaaa, pu parampu, tk paramtk)
  {
    f = paramaaa;
    b = parampu;
    a = paramtk;
    e = new TreeMap();
    d = wl.a(wl.a(), this);
    c = new kj();
    h = -9223372036854775807L;
    i = -9223372036854775807L;
  }
  
  private static long b(kh paramkh)
  {
    try
    {
      long l = wl.g(wl.a(e));
      return l;
    }
    catch (ce paramkh) {}
    return -9223372036854775807L;
  }
  
  private final void c()
  {
    long l = i;
    if ((l != -9223372036854775807L) && (l == h)) {
      return;
    }
    j = true;
    i = h;
    b.a();
  }
  
  public final px a()
  {
    return new px(this, new nv(a));
  }
  
  public final void a(aaa paramaaa)
  {
    j = false;
    g = -9223372036854775807L;
    f = paramaaa;
    paramaaa = e.entrySet().iterator();
    while (paramaaa.hasNext()) {
      if (((Long)((Map.Entry)paramaaa.next()).getKey()).longValue() < f.h) {
        paramaaa.remove();
      }
    }
  }
  
  public final boolean a(long paramLong)
  {
    Object localObject = f;
    boolean bool1 = d;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    if (j) {
      return true;
    }
    long l = h;
    localObject = e.ceilingEntry(Long.valueOf(l));
    bool1 = bool2;
    if (localObject != null)
    {
      bool1 = bool2;
      if (((Long)((Map.Entry)localObject).getValue()).longValue() < paramLong)
      {
        paramLong = ((Long)((Map.Entry)localObject).getKey()).longValue();
        g = paramLong;
        b.a(paramLong);
        bool1 = true;
      }
    }
    if (bool1) {
      c();
    }
    return bool1;
  }
  
  public final boolean a(ok paramok)
  {
    if (!f.d) {
      return false;
    }
    if (j) {
      return true;
    }
    long l = h;
    int m;
    if ((l != -9223372036854775807L) && (l < h)) {
      m = 1;
    } else {
      m = 0;
    }
    if (m != 0)
    {
      c();
      return true;
    }
    return false;
  }
  
  public final void b()
  {
    k = true;
    d.removeCallbacksAndMessages(null);
  }
  
  public final void b(ok paramok)
  {
    long l = h;
    if ((l != -9223372036854775807L) || (i > l)) {
      h = i;
    }
  }
  
  public final boolean handleMessage(Message paramMessage)
  {
    if (k) {
      return true;
    }
    if (what != 1) {
      return false;
    }
    paramMessage = (pv)obj;
    long l1 = a;
    long l2 = b;
    paramMessage = (Long)e.get(Long.valueOf(l2));
    if (paramMessage == null) {
      e.put(Long.valueOf(l2), Long.valueOf(l1));
    } else if (paramMessage.longValue() > l1) {
      e.put(Long.valueOf(l2), Long.valueOf(l1));
    }
    return true;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.ps
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */