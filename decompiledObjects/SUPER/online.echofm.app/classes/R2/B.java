package R2;

import android.os.BaseBundle;
import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class B
  extends G1
{
  public final Map b = new t.a();
  public final Map c = new t.a();
  public long d;
  
  public B(N2 paramN2)
  {
    super(paramN2);
  }
  
  public final void A(String paramString, long paramLong, w4 paramw4)
  {
    if (paramw4 == null)
    {
      j().K().a("Not logging ad unit exposure. No active activity");
      return;
    }
    if (paramLong < 1000L)
    {
      j().K().b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(paramLong));
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putString("_ai", paramString);
    localBundle.putLong("_xt", paramLong);
    S5.L(paramw4, localBundle, true);
    r().z0("am", "_xu", localBundle);
  }
  
  public final void B(long paramLong)
  {
    Iterator localIterator = b.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      b.put(str, Long.valueOf(paramLong));
    }
    if (!b.isEmpty()) {
      d = paramLong;
    }
  }
  
  public final void D(String paramString, long paramLong)
  {
    if ((paramString != null) && (paramString.length() != 0))
    {
      e().D(new E0(this, paramString, paramLong));
      return;
    }
    j().G().a("Ad unit id must be a non-empty string");
  }
  
  public final void v(long paramLong)
  {
    w4 localw4 = s().C(false);
    Iterator localIterator = b.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      A(str, paramLong - ((Long)b.get(str)).longValue(), localw4);
    }
    if (!b.isEmpty()) {
      w(paramLong - d, localw4);
    }
    B(paramLong);
  }
  
  public final void w(long paramLong, w4 paramw4)
  {
    if (paramw4 == null)
    {
      j().K().a("Not logging ad exposure. No active activity");
      return;
    }
    if (paramLong < 1000L)
    {
      j().K().b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(paramLong));
      return;
    }
    Bundle localBundle = new Bundle();
    localBundle.putLong("_xt", paramLong);
    S5.L(paramw4, localBundle, true);
    r().z0("am", "_xa", localBundle);
  }
  
  public final void z(String paramString, long paramLong)
  {
    if ((paramString != null) && (paramString.length() != 0))
    {
      e().D(new a(this, paramString, paramLong));
      return;
    }
    j().G().a("Ad unit id must be a non-empty string");
  }
}

/* Location:
 * Qualified Name:     R2.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */