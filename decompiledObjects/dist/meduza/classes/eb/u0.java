package eb;

import gb.i0;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import n7.g;
import n7.g.a;
import x6.b;

public abstract class u0
{
  public abstract String a();
  
  public abstract void b();
  
  public abstract void c();
  
  public abstract void d(d paramd);
  
  public static final class a
  {
    public final int a;
    public final z0 b;
    public final h1 c;
    public final u0.f d;
    public final ScheduledExecutorService e;
    public final d f;
    public final Executor g;
    public final String h;
    
    public a(Integer paramInteger, z0 paramz0, h1 paramh1, u0.f paramf, ScheduledExecutorService paramScheduledExecutorService, d paramd, Executor paramExecutor, String paramString)
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
  
  public static final class b
  {
    public final e1 a;
    public final Object b;
    
    public b(e1 parame1)
    {
      b = null;
      b.y(parame1, "status");
      a = parame1;
      b.n(parame1, "cannot use OK status: %s", parame1.e() ^ true);
    }
    
    public b(Object paramObject)
    {
      b = paramObject;
      a = null;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool = true;
      if (this == paramObject) {
        return true;
      }
      if ((paramObject != null) && (b.class == paramObject.getClass()))
      {
        paramObject = (b)paramObject;
        if ((!b.Q(a, a)) || (!b.Q(b, b))) {
          bool = false;
        }
        return bool;
      }
      return false;
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { a, b });
    }
    
    public final String toString()
    {
      g.a locala;
      Object localObject;
      String str;
      if (b != null)
      {
        locala = g.b(this);
        localObject = b;
        str = "config";
      }
      else
      {
        locala = g.b(this);
        localObject = a;
        str = "error";
      }
      locala.a(localObject, str);
      return locala.toString();
    }
  }
  
  public static abstract class c
  {
    public abstract void a();
    
    public abstract i0 b(URI paramURI, u0.a parama);
  }
  
  public static abstract class d
  {
    public abstract void a(e1 parame1);
    
    public abstract void b(u0.e parame);
  }
  
  public static final class e
  {
    public final List<u> a;
    public final a b;
    public final u0.b c;
    
    public e(List<u> paramList, a parama, u0.b paramb)
    {
      a = Collections.unmodifiableList(new ArrayList(paramList));
      b.y(parama, "attributes");
      b = parama;
      c = paramb;
    }
    
    public final boolean equals(Object paramObject)
    {
      boolean bool1 = paramObject instanceof e;
      boolean bool2 = false;
      if (!bool1) {
        return false;
      }
      paramObject = (e)paramObject;
      bool1 = bool2;
      if (b.Q(a, a))
      {
        bool1 = bool2;
        if (b.Q(b, b))
        {
          bool1 = bool2;
          if (b.Q(c, c)) {
            bool1 = true;
          }
        }
      }
      return bool1;
    }
    
    public final int hashCode()
    {
      return Arrays.hashCode(new Object[] { a, b, c });
    }
    
    public final String toString()
    {
      g.a locala = g.b(this);
      locala.a(a, "addresses");
      locala.a(b, "attributes");
      locala.a(c, "serviceConfig");
      return locala.toString();
    }
  }
  
  public static abstract class f
  {
    public abstract u0.b a(Map<String, ?> paramMap);
  }
}

/* Location:
 * Qualified Name:     eb.u0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */