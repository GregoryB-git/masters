package u9;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import nc.g0;
import w9.a;

public final class k
{
  public static final long b = TimeUnit.HOURS.toSeconds(1L);
  public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
  public static k d;
  public final g0 a;
  
  public k(g0 paramg0)
  {
    a = paramg0;
  }
  
  public static k a()
  {
    if (g0.b == null) {
      g0.b = new g0(17);
    }
    g0 localg0 = g0.b;
    if (d == null) {
      d = new k(localg0);
    }
    return d;
  }
  
  public final boolean b(a parama)
  {
    if (TextUtils.isEmpty(d)) {
      return true;
    }
    long l1 = g;
    long l2 = f;
    parama = TimeUnit.MILLISECONDS;
    a.getClass();
    return l2 + l1 < parama.toSeconds(System.currentTimeMillis()) + b;
  }
}

/* Location:
 * Qualified Name:     u9.k
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */