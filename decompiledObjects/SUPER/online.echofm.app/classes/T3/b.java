package T3;

import c4.d;
import java.util.HashMap;
import java.util.Map;

public class b
  implements q.c
{
  public static long f;
  public f a;
  public q b;
  public a c;
  public c d;
  public final c4.c e;
  
  public b(c paramc, f paramf, String paramString1, a parama, String paramString2, String paramString3)
  {
    long l = f;
    f = 1L + l;
    a = paramf;
    c = parama;
    d locald = paramc.f();
    parama = new StringBuilder();
    parama.append("conn_");
    parama.append(l);
    e = new c4.c(locald, "Connection", parama.toString());
    d = c.o;
    b = new q(paramc, paramf, paramString1, paramString3, this, paramString2);
  }
  
  public void a(Map paramMap)
  {
    try
    {
      localObject1 = (String)paramMap.get("t");
      if (localObject1 != null) {
        if (((String)localObject1).equals("d")) {
          h((Map)paramMap.get("d"));
        }
      }
    }
    catch (ClassCastException paramMap)
    {
      Object localObject1;
      if (((String)localObject1).equals("c"))
      {
        g((Map)paramMap.get("d"));
      }
      else if (e.f())
      {
        Object localObject2 = e;
        paramMap = new java/lang/StringBuilder;
        paramMap.<init>();
        paramMap.append("Ignoring unknown server message type: ");
        paramMap.append((String)localObject1);
        ((c4.c)localObject2).b(paramMap.toString(), new Object[0]);
        return;
        if (e.f())
        {
          localObject1 = e;
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append("Failed to parse server message: missing message type:");
          ((StringBuilder)localObject2).append(paramMap.toString());
          ((c4.c)localObject1).b(((StringBuilder)localObject2).toString(), new Object[0]);
        }
        c();
        return;
        if (e.f())
        {
          localObject2 = e;
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append("Failed to parse server message: ");
          ((StringBuilder)localObject1).append(paramMap.toString());
          ((c4.c)localObject2).b(((StringBuilder)localObject1).toString(), new Object[0]);
        }
        c();
      }
    }
  }
  
  public void b(boolean paramBoolean)
  {
    b = null;
    if ((!paramBoolean) && (d == c.o))
    {
      if (e.f()) {
        e.b("Realtime connection failed", new Object[0]);
      }
    }
    else if (e.f()) {
      e.b("Realtime connection lost", new Object[0]);
    }
    c();
  }
  
  public void c()
  {
    d(b.p);
  }
  
  public void d(b paramb)
  {
    c localc = d;
    Object localObject = c.q;
    if (localc != localObject)
    {
      if (e.f()) {
        e.b("closing realtime connection", new Object[0]);
      }
      d = ((c)localObject);
      localObject = b;
      if (localObject != null)
      {
        ((q)localObject).k();
        b = null;
      }
      c.g(paramb);
    }
  }
  
  public final void e(long paramLong, String paramString)
  {
    if (e.f()) {
      e.b("realtime connection established", new Object[0]);
    }
    d = c.p;
    c.c(paramLong, paramString);
  }
  
  public final void f(String paramString)
  {
    if (e.f()) {
      e.b("Connection shutdown command received. Shutting down...", new Object[0]);
    }
    c.q(paramString);
    c();
  }
  
  public final void g(Map paramMap)
  {
    Object localObject;
    if (e.f())
    {
      localObject = e;
      StringBuilder localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append("Got control message: ");
      localStringBuilder1.append(paramMap.toString());
      ((c4.c)localObject).b(localStringBuilder1.toString(), new Object[0]);
    }
    try
    {
      localObject = (String)paramMap.get("t");
      if (localObject != null)
      {
        boolean bool = ((String)localObject).equals("s");
        if (bool) {
          f((String)paramMap.get("d"));
        }
      }
    }
    catch (ClassCastException localClassCastException)
    {
      if (((String)localObject).equals("r"))
      {
        j((String)paramMap.get("d"));
      }
      else if (((String)localObject).equals("h"))
      {
        i((Map)paramMap.get("d"));
      }
      else if (e.f())
      {
        paramMap = e;
        StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
        localStringBuilder2.<init>();
        localStringBuilder2.append("Ignoring unknown control message: ");
        localStringBuilder2.append((String)localObject);
        paramMap.b(localStringBuilder2.toString(), new Object[0]);
        return;
        if (e.f())
        {
          localObject = e;
          localStringBuilder2 = new java/lang/StringBuilder;
          localStringBuilder2.<init>();
          localStringBuilder2.append("Got invalid control message: ");
          localStringBuilder2.append(paramMap.toString());
          ((c4.c)localObject).b(localStringBuilder2.toString(), new Object[0]);
        }
        c();
        return;
        if (e.f())
        {
          paramMap = e;
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Failed to parse control message: ");
          ((StringBuilder)localObject).append(localStringBuilder2.toString());
          paramMap.b(((StringBuilder)localObject).toString(), new Object[0]);
        }
        c();
      }
    }
  }
  
  public final void h(Map paramMap)
  {
    if (e.f())
    {
      c4.c localc = e;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("received data message: ");
      localStringBuilder.append(paramMap.toString());
      localc.b(localStringBuilder.toString(), new Object[0]);
    }
    c.i(paramMap);
  }
  
  public final void i(Map paramMap)
  {
    long l = ((Long)paramMap.get("ts")).longValue();
    String str = (String)paramMap.get("h");
    c.o(str);
    paramMap = (String)paramMap.get("s");
    if (d == c.o)
    {
      b.y();
      e(l, paramMap);
    }
  }
  
  public final void j(String paramString)
  {
    if (e.f())
    {
      c4.c localc = e;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Got a reset; killing connection to ");
      localStringBuilder.append(a.b());
      localStringBuilder.append("; Updating internalHost to ");
      localStringBuilder.append(paramString);
      localc.b(localStringBuilder.toString(), new Object[0]);
    }
    c.o(paramString);
    d(b.o);
  }
  
  public void k()
  {
    if (e.f()) {
      e.b("Opening a connection", new Object[0]);
    }
    b.t();
  }
  
  public final void l(Map paramMap, boolean paramBoolean)
  {
    if (d != c.p)
    {
      e.b("Tried to send on an unconnected connection", new Object[0]);
    }
    else
    {
      if (paramBoolean) {
        e.b("Sending data (contents hidden)", new Object[0]);
      } else {
        e.b("Sending data: %s", new Object[] { paramMap });
      }
      b.v(paramMap);
    }
  }
  
  public void m(Map paramMap, boolean paramBoolean)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("t", "d");
    localHashMap.put("d", paramMap);
    l(localHashMap, paramBoolean);
  }
  
  public static abstract interface a
  {
    public abstract void c(long paramLong, String paramString);
    
    public abstract void g(b.b paramb);
    
    public abstract void i(Map paramMap);
    
    public abstract void o(String paramString);
    
    public abstract void q(String paramString);
  }
  
  public static enum b
  {
    static
    {
      b localb1 = new b("SERVER_RESET", 0);
      o = localb1;
      b localb2 = new b("OTHER", 1);
      p = localb2;
      q = new b[] { localb1, localb2 };
    }
  }
  
  public static enum c
  {
    static
    {
      c localc1 = new c("REALTIME_CONNECTING", 0);
      o = localc1;
      c localc2 = new c("REALTIME_CONNECTED", 1);
      p = localc2;
      c localc3 = new c("REALTIME_DISCONNECTED", 2);
      q = localc3;
      r = new c[] { localc1, localc2, localc3 };
    }
  }
}

/* Location:
 * Qualified Name:     T3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */