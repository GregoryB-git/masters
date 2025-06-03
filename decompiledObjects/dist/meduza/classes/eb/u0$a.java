package eb;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import n7.g;
import n7.g.a;
import x6.b;

public final class u0$a
{
  public final int a;
  public final z0 b;
  public final h1 c;
  public final u0.f d;
  public final ScheduledExecutorService e;
  public final d f;
  public final Executor g;
  public final String h;
  
  public u0$a(Integer paramInteger, z0 paramz0, h1 paramh1, u0.f paramf, ScheduledExecutorService paramScheduledExecutorService, d paramd, Executor paramExecutor, String paramString)
  {
    b.y(paramInteger, "defaultPort not set");
    a = paramInteger.intValue();
    b.y(paramz0, "proxyDetector not set");
    b = paramz0;
    b.y(paramh1, "syncContext not set");
    c = paramh1;
    b.y(paramf, "serviceConfigParser not set");
    d = paramf;
    e = paramScheduledExecutorService;
    f = paramd;
    g = paramExecutor;
    h = paramString;
  }
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.d(String.valueOf(a), "defaultPort");
    locala.a(b, "proxyDetector");
    locala.a(c, "syncContext");
    locala.a(d, "serviceConfigParser");
    locala.a(e, "scheduledExecutorService");
    locala.a(f, "channelLogger");
    locala.a(g, "executor");
    locala.a(h, "overrideAuthority");
    return locala.toString();
  }
}

/* Location:
 * Qualified Name:     eb.u0.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */