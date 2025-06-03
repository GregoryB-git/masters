package s4;

import A2.n;
import B3.x;
import V2.k;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import t4.a;

public class h
  implements i
{
  public static final Object m = new Object();
  public static final ThreadFactory n = new a();
  public final s3.e a;
  public final v4.c b;
  public final u4.c c;
  public final q d;
  public final x e;
  public final o f;
  public final Object g = new Object();
  public final ExecutorService h;
  public final Executor i;
  public String j;
  public Set k = new HashSet();
  public final List l = new ArrayList();
  
  public h(ExecutorService paramExecutorService, Executor paramExecutor, s3.e parame, v4.c paramc, u4.c paramc1, q paramq, x paramx, o paramo)
  {
    a = parame;
    b = paramc;
    c = paramc1;
    d = paramq;
    e = paramx;
    f = paramo;
    h = paramExecutorService;
    i = paramExecutor;
  }
  
  public h(s3.e parame, r4.b paramb, ExecutorService paramExecutorService, Executor paramExecutor)
  {
    this(paramExecutorService, paramExecutor, parame, new v4.c(parame.m(), paramb), new u4.c(parame), q.c(), new x(new c(parame)), new o());
  }
  
  public static h t()
  {
    return u(s3.e.o());
  }
  
  public static h u(s3.e parame)
  {
    boolean bool;
    if (parame != null) {
      bool = true;
    } else {
      bool = false;
    }
    n.b(bool, "Null is not a valid value of FirebaseApp.");
    return (h)parame.k(i.class);
  }
  
  public final void D()
  {
    n.f(q(), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
    n.f(x(), "Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
    n.f(p(), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
    n.b(q.h(q()), "Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.");
    n.b(q.g(p()), "Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.");
  }
  
  public final String E(u4.d paramd)
  {
    if (((!a.q().equals("CHIME_ANDROID_SDK")) && (!a.y())) || (!paramd.m())) {
      return f.a();
    }
    String str = s().f();
    paramd = str;
    if (TextUtils.isEmpty(str)) {
      paramd = f.a();
    }
    return paramd;
  }
  
  public t4.b F(final a parama)
  {
    try
    {
      k.add(parama);
      parama = new b(parama);
      return parama;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public final u4.d G(u4.d paramd)
  {
    if ((paramd.d() != null) && (paramd.d().length() == 11)) {}
    for (Object localObject = s().i();; localObject = null) {
      break;
    }
    localObject = b.d(p(), paramd.d(), x(), q(), (String)localObject);
    int i1 = c.a[localObject.e().ordinal()];
    if (i1 != 1)
    {
      if (i1 == 2) {
        return paramd.q("BAD CONFIG");
      }
      throw new j("Firebase Installations Service is unavailable. Please try again later.", j.a.p);
    }
    return paramd.s(((v4.d)localObject).c(), ((v4.d)localObject).d(), d.b(), ((v4.d)localObject).b().c(), ((v4.d)localObject).b().d());
  }
  
  public final void H(Exception paramException)
  {
    synchronized (g)
    {
      Iterator localIterator = l.iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
      } while (!((p)localIterator.next()).a(paramException));
      localIterator.remove();
    }
  }
  
  public final void I(u4.d paramd)
  {
    synchronized (g)
    {
      Iterator localIterator = l.iterator();
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
      } while (!((p)localIterator.next()).b(paramd));
      localIterator.remove();
    }
  }
  
  public final void J(String paramString)
  {
    try
    {
      j = paramString;
      return;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  /* Error */
  public final void K(u4.d paramd1, u4.d paramd2)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 58	s4/h:k	Ljava/util/Set;
    //   6: invokeinterface 325 1 0
    //   11: ifeq +61 -> 72
    //   14: aload_1
    //   15: invokevirtual 230	u4/d:d	()Ljava/lang/String;
    //   18: aload_2
    //   19: invokevirtual 230	u4/d:d	()Ljava/lang/String;
    //   22: invokestatic 328	android/text/TextUtils:equals	(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z
    //   25: ifne +47 -> 72
    //   28: aload_0
    //   29: getfield 58	s4/h:k	Ljava/util/Set;
    //   32: invokeinterface 329 1 0
    //   37: astore_1
    //   38: aload_1
    //   39: invokeinterface 299 1 0
    //   44: ifeq +28 -> 72
    //   47: aload_1
    //   48: invokeinterface 303 1 0
    //   53: checkcast 331	t4/a
    //   56: aload_2
    //   57: invokevirtual 230	u4/d:d	()Ljava/lang/String;
    //   60: invokeinterface 333 2 0
    //   65: goto -27 -> 38
    //   68: astore_1
    //   69: goto +6 -> 75
    //   72: aload_0
    //   73: monitorexit
    //   74: return
    //   75: aload_0
    //   76: monitorexit
    //   77: aload_1
    //   78: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	79	0	this	h
    //   0	79	1	paramd1	u4.d
    //   0	79	2	paramd2	u4.d
    // Exception table:
    //   from	to	target	type
    //   2	38	68	finally
    //   38	65	68	finally
  }
  
  public V2.j a()
  {
    D();
    Object localObject = r();
    if (localObject != null) {
      return V2.m.e(localObject);
    }
    localObject = i();
    h.execute(new d(this));
    return (V2.j)localObject;
  }
  
  public V2.j b(boolean paramBoolean)
  {
    D();
    V2.j localj = h();
    h.execute(new f(this, paramBoolean));
    return localj;
  }
  
  public final V2.j h()
  {
    k localk = new k();
    j(new l(d, localk));
    return localk.a();
  }
  
  public final V2.j i()
  {
    k localk = new k();
    j(new m(localk));
    return localk.a();
  }
  
  public final void j(p paramp)
  {
    synchronized (g)
    {
      l.add(paramp);
      return;
    }
  }
  
  public V2.j k()
  {
    return V2.m.c(h, new g(this));
  }
  
  public final Void l()
  {
    J(null);
    u4.d locald = v();
    if (locald.k()) {
      b.e(p(), locald.d(), x(), locald.f());
    }
    y(locald.r());
    return null;
  }
  
  public final void m(boolean paramBoolean)
  {
    u4.d locald = v();
    try
    {
      if ((!locald.i()) && (!locald.l())) {
        if ((!paramBoolean) && (!d.f(locald))) {
          return;
        }
      }
    }
    catch (j localj)
    {
      break label139;
      Object localObject = o(locald);
      break label60;
      localObject = G(locald);
      label60:
      y((u4.d)localObject);
      K(locald, (u4.d)localObject);
      if (((u4.d)localObject).k()) {
        J(((u4.d)localObject).d());
      }
      if (((u4.d)localObject).i()) {}
      for (localObject = new j(j.a.o);; localObject = new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."))
      {
        H((Exception)localObject);
        break label138;
        if (!((u4.d)localObject).j()) {
          break;
        }
      }
      I((u4.d)localObject);
      label138:
      return;
      label139:
      H((Exception)localObject);
    }
  }
  
  public final void n(boolean paramBoolean)
  {
    u4.d locald1 = w();
    u4.d locald2 = locald1;
    if (paramBoolean) {
      locald2 = locald1.p();
    }
    I(locald2);
    i.execute(new e(this, paramBoolean));
  }
  
  public final u4.d o(u4.d paramd)
  {
    v4.f localf = b.f(p(), paramd.d(), x(), paramd.f());
    int i1 = c.b[localf.b().ordinal()];
    if (i1 != 1)
    {
      if (i1 != 2)
      {
        if (i1 == 3)
        {
          J(null);
          return paramd.r();
        }
        throw new j("Firebase Installations Service is unavailable. Please try again later.", j.a.p);
      }
      return paramd.q("BAD CONFIG");
    }
    return paramd.o(localf.c(), localf.d(), d.b());
  }
  
  public String p()
  {
    return a.r().b();
  }
  
  public String q()
  {
    return a.r().c();
  }
  
  public final String r()
  {
    try
    {
      String str = j;
      return str;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final u4.b s()
  {
    return (u4.b)e.get();
  }
  
  public final u4.d v()
  {
    b localb;
    synchronized (m)
    {
      localb = b.a(a.m(), "generatefid.lock");
    }
    try
    {
      u4.d locald = c.d();
      if (localb != null)
      {
        localb.b();
        break label43;
        localObject2 = finally;
        break label58;
      }
      label43:
      return locald;
    }
    finally
    {
      localObject3 = finally;
      if (localObject2 != null) {
        ((b)localObject2).b();
      }
      throw ((Throwable)localObject3);
    }
    label58:
    throw ((Throwable)localObject2);
  }
  
  public final u4.d w()
  {
    b localb;
    synchronized (m)
    {
      localb = b.a(a.m(), "generatefid.lock");
      try
      {
        u4.d locald1 = c.d();
        Object localObject2 = locald1;
        if (locald1.j())
        {
          localObject2 = E(locald1);
          localObject2 = c.b(locald1.t((String)localObject2));
        }
      }
      finally
      {
        break label89;
      }
      if (localb != null) {
        localb.b();
      }
    }
    return locald2;
    label89:
    if (localb != null) {
      localb.b();
    }
    throw locald2;
  }
  
  public String x()
  {
    return a.r().g();
  }
  
  public final void y(u4.d paramd)
  {
    b localb;
    synchronized (m)
    {
      localb = b.a(a.m(), "generatefid.lock");
    }
    try
    {
      c.b(paramd);
      if (localb != null)
      {
        localb.b();
        break label44;
        paramd = finally;
        break label58;
      }
      label44:
      return;
    }
    finally
    {
      paramd = finally;
      if (localb != null) {
        localb.b();
      }
      throw paramd;
    }
    label58:
    throw paramd;
  }
  
  public class a
    implements ThreadFactory
  {
    public final AtomicInteger a = new AtomicInteger(1);
    
    public Thread newThread(Runnable paramRunnable)
    {
      return new Thread(paramRunnable, String.format("firebase-installations-executor-%d", new Object[] { Integer.valueOf(a.getAndIncrement()) }));
    }
  }
  
  public class b
    implements t4.b
  {
    public b(a parama) {}
  }
}

/* Location:
 * Qualified Name:     s4.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */