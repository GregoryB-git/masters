package k3;

import android.content.Context;
import h3.c;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import p3.d;
import q3.m;

public final class w
  implements v
{
  public static volatile k e;
  public final t3.a a;
  public final t3.a b;
  public final d c;
  public final q3.k d;
  
  public w(t3.a parama1, t3.a parama2, d paramd, q3.k paramk, m paramm)
  {
    a = parama1;
    b = parama2;
    c = paramd;
    d = paramk;
    a.execute(new b.k(paramm, 8));
  }
  
  public static w a()
  {
    k localk = e;
    if (localk != null) {
      return (w)f.get();
    }
    throw new IllegalStateException("Not initialized!");
  }
  
  public static void b(Context paramContext)
  {
    if (e == null) {
      try
      {
        if (e == null)
        {
          paramContext.getClass();
          k localk = new k3/k;
          localk.<init>(paramContext);
          e = localk;
        }
      }
      finally {}
    }
  }
  
  public final t c(i3.a parama)
  {
    Set localSet;
    if ((parama instanceof l))
    {
      parama.getClass();
      localSet = Collections.unmodifiableSet(i3.a.d);
    }
    else
    {
      localSet = Collections.singleton(new c("proto"));
    }
    j.a locala = s.a();
    parama.getClass();
    locala.b("cct");
    b = parama.b();
    return new t(localSet, locala.a(), this);
  }
}

/* Location:
 * Qualified Name:     k3.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */