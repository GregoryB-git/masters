package e7;

import android.os.BaseBundle;
import android.os.Bundle;
import d2.q;
import java.util.Iterator;
import r.b;
import r.g.c;
import r.h;

public final class a
  extends o0
{
  public final b c = new b();
  public final b d = new b();
  public long e;
  
  public a(j2 paramj2)
  {
    super(paramj2);
  }
  
  public final void s(long paramLong)
  {
    q4 localq4 = p().v(false);
    Iterator localIterator = ((g.c)c.keySet()).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      v(str, paramLong - ((Long)c.getOrDefault(str, null)).longValue(), localq4);
    }
    if (!c.isEmpty()) {
      t(paramLong - e, localq4);
    }
    w(paramLong);
  }
  
  public final void t(long paramLong, q4 paramq4)
  {
    if (paramq4 == null)
    {
      zzjw.b("Not logging ad exposure. No active activity");
      return;
    }
    if (paramLong < 1000L)
    {
      zzjw.c("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(paramLong));
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putLong("_xt", paramLong);
    r6.L(paramq4, localBundle, true);
    o().Q("am", "_xa", localBundle);
  }
  
  public final void u(String paramString, long paramLong)
  {
    if ((paramString != null) && (paramString.length() != 0))
    {
      zzl().u(new u(this, paramString, paramLong, 1));
      return;
    }
    zzjo.b("Ad unit id must be a non-empty string");
  }
  
  public final void v(String paramString, long paramLong, q4 paramq4)
  {
    if (paramq4 == null)
    {
      zzjw.b("Not logging ad unit exposure. No active activity");
      return;
    }
    if (paramLong < 1000L)
    {
      zzjw.c("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(paramLong));
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("_ai", paramString);
    localBundle.putLong("_xt", paramLong);
    r6.L(paramq4, localBundle, true);
    o().Q("am", "_xu", localBundle);
  }
  
  public final void w(long paramLong)
  {
    Iterator localIterator = ((g.c)c.keySet()).iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      c.put(str, Long.valueOf(paramLong));
    }
    if (!c.isEmpty()) {
      e = paramLong;
    }
  }
  
  public final void x(String paramString, long paramLong)
  {
    if ((paramString != null) && (paramString.length() != 0))
    {
      zzl().u(new u(this, paramString, paramLong, 0));
      return;
    }
    zzjo.b("Ad unit id must be a non-empty string");
  }
}

/* Location:
 * Qualified Name:     e7.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */