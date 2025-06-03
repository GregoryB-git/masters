package P4;

import E2.h;
import Q4.l;
import Q4.p;
import Q4.r;
import android.app.Application;
import android.content.Context;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.d;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import r4.b;
import s4.i;
import t0.f;
import z2.c.a;

public class x
{
  public static final E2.e j = ;
  public static final Random k = new Random();
  public static final Map l = new HashMap();
  public final Map a = new HashMap();
  public final Context b;
  public final ScheduledExecutorService c;
  public final s3.e d;
  public final i e;
  public final t3.c f;
  public final b g;
  public final String h;
  public Map i = new HashMap();
  
  public x(Context paramContext, ScheduledExecutorService paramScheduledExecutorService, s3.e parame, i parami, t3.c paramc, b paramb)
  {
    this(paramContext, paramScheduledExecutorService, parame, parami, paramc, paramb, true);
  }
  
  public x(Context paramContext, ScheduledExecutorService paramScheduledExecutorService, s3.e parame, i parami, t3.c paramc, b paramb, boolean paramBoolean)
  {
    b = paramContext;
    c = paramScheduledExecutorService;
    d = parame;
    e = parami;
    f = paramc;
    g = paramb;
    h = parame.r().c();
    a.b(paramContext);
    if (paramBoolean) {
      V2.m.c(paramScheduledExecutorService, new v(this));
    }
  }
  
  public static d j(Context paramContext, String paramString1, String paramString2)
  {
    return new d(paramContext.getSharedPreferences(String.format("%s_%s_%s_%s", new Object[] { "frc", paramString1, paramString2, "settings" }), 0));
  }
  
  public static r k(s3.e parame, String paramString, b paramb)
  {
    if ((n(parame)) && (paramString.equals("firebase"))) {
      return new r(paramb);
    }
    return null;
  }
  
  public static boolean m(s3.e parame, String paramString)
  {
    boolean bool;
    if ((paramString.equals("firebase")) && (n(parame))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static boolean n(s3.e parame)
  {
    return parame.q().equals("[DEFAULT]");
  }
  
  /* Error */
  public static void p(boolean paramBoolean)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 49	P4/x:l	Ljava/util/Map;
    //   6: invokeinterface 158 1 0
    //   11: invokeinterface 164 1 0
    //   16: astore_1
    //   17: aload_1
    //   18: invokeinterface 170 1 0
    //   23: ifeq +23 -> 46
    //   26: aload_1
    //   27: invokeinterface 174 1 0
    //   32: checkcast 176	P4/m
    //   35: iload_0
    //   36: invokevirtual 179	P4/m:y	(Z)V
    //   39: goto -22 -> 17
    //   42: astore_1
    //   43: goto +7 -> 50
    //   46: ldc 2
    //   48: monitorexit
    //   49: return
    //   50: ldc 2
    //   52: monitorexit
    //   53: aload_1
    //   54: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	paramBoolean	boolean
    //   16	11	1	localIterator	java.util.Iterator
    //   42	12	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   3	17	42	finally
    //   17	39	42	finally
  }
  
  public m c(String paramString)
  {
    Q4.e locale1;
    Q4.e locale2;
    Q4.e locale3;
    d locald;
    l locall;
    try
    {
      locale1 = e(paramString, "fetch");
      locale2 = e(paramString, "activate");
      locale3 = e(paramString, "defaults");
      locald = j(b, h, paramString);
      locall = i(locale2, locale3);
      r localr = k(d, paramString, g);
      if (localr != null)
      {
        u localu = new P4/u;
        localu.<init>(localr);
        locall.b(localu);
      }
    }
    finally
    {
      break label137;
    }
    paramString = d(d, paramString, e, f, c, locale1, locale2, locale3, g(paramString, locale1, locald), locall, locald);
    return paramString;
    label137:
    throw paramString;
  }
  
  public m d(s3.e parame, String paramString, i parami, t3.c paramc, Executor paramExecutor, Q4.e parame1, Q4.e parame2, Q4.e parame3, com.google.firebase.remoteconfig.internal.c paramc1, l paraml, d paramd)
  {
    try
    {
      if (!a.containsKey(paramString))
      {
        m localm = new P4/m;
        Context localContext = b;
        if (!m(parame, paramString)) {
          paramc = null;
        }
        localm.<init>(localContext, parame, parami, paramc, paramExecutor, parame1, parame2, parame3, paramc1, paraml, paramd, l(parame, parami, paramc1, parame2, b, paramString, paramd));
        localm.B();
        a.put(paramString, localm);
        l.put(paramString, localm);
      }
    }
    finally
    {
      break label137;
    }
    parame = (m)a.get(paramString);
    return parame;
    label137:
    throw parame;
  }
  
  public final Q4.e e(String paramString1, String paramString2)
  {
    paramString1 = String.format("%s_%s_%s_%s.json", new Object[] { "frc", h, paramString1, paramString2 });
    return Q4.e.h(c, p.c(b, paramString1));
  }
  
  public m f()
  {
    return c("firebase");
  }
  
  public com.google.firebase.remoteconfig.internal.c g(String paramString, Q4.e parame, d paramd)
  {
    i locali;
    Object localObject;
    for (;;)
    {
      try
      {
        locali = e;
        if (n(d)) {
          localObject = g;
        }
      }
      finally
      {
        break;
      }
      localObject = new w();
    }
    paramString = new com.google.firebase.remoteconfig.internal.c(locali, (b)localObject, c, j, k, parame, h(d.r().b(), paramString, paramd), paramd, i);
    return paramString;
    throw paramString;
  }
  
  public ConfigFetchHttpClient h(String paramString1, String paramString2, d paramd)
  {
    String str = d.r().c();
    return new ConfigFetchHttpClient(b, str, paramString1, paramString2, paramd.b(), paramd.b());
  }
  
  public final l i(Q4.e parame1, Q4.e parame2)
  {
    return new l(c, parame1, parame2);
  }
  
  public Q4.m l(s3.e parame, i parami, com.google.firebase.remoteconfig.internal.c paramc, Q4.e parame1, Context paramContext, String paramString, d paramd)
  {
    try
    {
      parame = new Q4.m(parame, parami, paramc, parame1, paramContext, paramString, paramd, c);
      return parame;
    }
    finally
    {
      parame = finally;
      throw parame;
    }
  }
  
  public static class a
    implements c.a
  {
    public static final AtomicReference a = new AtomicReference();
    
    public static void c(Context paramContext)
    {
      paramContext = (Application)paramContext.getApplicationContext();
      AtomicReference localAtomicReference = a;
      if (localAtomicReference.get() == null)
      {
        a locala = new a();
        if (f.a(localAtomicReference, null, locala))
        {
          z2.c.c(paramContext);
          z2.c.b().a(locala);
        }
      }
    }
    
    public void a(boolean paramBoolean)
    {
      x.b(paramBoolean);
    }
  }
}

/* Location:
 * Qualified Name:     P4.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */