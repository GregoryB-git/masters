package gb;

import b.z;
import eb.e1;
import eb.h1;
import eb.u0;
import eb.u0.a;
import eb.u0.b;
import eb.u0.d;
import eb.u0.f;
import eb.z0;
import f;
import java.io.IOException;
import java.io.StringReader;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import la.a;
import n7.p;
import n7.w;
import x6.b;

public final class i0
  extends u0
{
  public static final Logger s;
  public static final Set<String> t;
  public static boolean u;
  public static boolean v;
  public static boolean w;
  public static final e x;
  public static String y;
  public final z0 a;
  public final Random b = new Random();
  public volatile b c = b.a;
  public final AtomicReference<d> d = new AtomicReference();
  public final String e;
  public final String f;
  public final int g;
  public final h3.c<Executor> h;
  public final long i;
  public final h1 j;
  public final p k;
  public boolean l;
  public boolean m;
  public Executor n;
  public final boolean o;
  public final u0.f p;
  public boolean q;
  public u0.d r;
  
  /* Error */
  static
  {
    // Byte code:
    //   0: ldc 2
    //   2: invokevirtual 75	java/lang/Class:getName	()Ljava/lang/String;
    //   5: invokestatic 81	java/util/logging/Logger:getLogger	(Ljava/lang/String;)Ljava/util/logging/Logger;
    //   8: astore_0
    //   9: aload_0
    //   10: putstatic 83	gb/i0:s	Ljava/util/logging/Logger;
    //   13: new 85	java/util/HashSet
    //   16: dup
    //   17: iconst_4
    //   18: anewarray 87	java/lang/String
    //   21: dup
    //   22: iconst_0
    //   23: ldc 89
    //   25: aastore
    //   26: dup
    //   27: iconst_1
    //   28: ldc 91
    //   30: aastore
    //   31: dup
    //   32: iconst_2
    //   33: ldc 93
    //   35: aastore
    //   36: dup
    //   37: iconst_3
    //   38: ldc 95
    //   40: aastore
    //   41: invokestatic 101	java/util/Arrays:asList	([Ljava/lang/Object;)Ljava/util/List;
    //   44: invokespecial 105	java/util/HashSet:<init>	(Ljava/util/Collection;)V
    //   47: invokestatic 111	java/util/Collections:unmodifiableSet	(Ljava/util/Set;)Ljava/util/Set;
    //   50: putstatic 113	gb/i0:t	Ljava/util/Set;
    //   53: ldc 115
    //   55: ldc 117
    //   57: invokestatic 123	java/lang/System:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   60: astore_1
    //   61: ldc 125
    //   63: ldc 127
    //   65: invokestatic 123	java/lang/System:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   68: astore_2
    //   69: ldc -127
    //   71: ldc 127
    //   73: invokestatic 123	java/lang/System:getProperty	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   76: astore_3
    //   77: aload_1
    //   78: invokestatic 135	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   81: putstatic 137	gb/i0:u	Z
    //   84: aload_2
    //   85: invokestatic 135	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   88: putstatic 139	gb/i0:v	Z
    //   91: aload_3
    //   92: invokestatic 135	java/lang/Boolean:parseBoolean	(Ljava/lang/String;)Z
    //   95: putstatic 141	gb/i0:w	Z
    //   98: ldc 2
    //   100: invokevirtual 145	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   103: astore_2
    //   104: ldc -109
    //   106: iconst_1
    //   107: aload_2
    //   108: invokestatic 151	java/lang/Class:forName	(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   111: ldc 20
    //   113: invokevirtual 155	java/lang/Class:asSubclass	(Ljava/lang/Class;)Ljava/lang/Class;
    //   116: astore_2
    //   117: aload_2
    //   118: iconst_0
    //   119: anewarray 71	java/lang/Class
    //   122: invokevirtual 159	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   125: astore_2
    //   126: aload_2
    //   127: iconst_0
    //   128: anewarray 161	java/lang/Object
    //   131: invokevirtual 167	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   134: checkcast 20	gb/i0$e
    //   137: astore_1
    //   138: aload_1
    //   139: astore_2
    //   140: aload_1
    //   141: invokeinterface 170 1 0
    //   146: ifnull +86 -> 232
    //   149: getstatic 176	java/util/logging/Level:FINE	Ljava/util/logging/Level;
    //   152: astore_3
    //   153: aload_1
    //   154: invokeinterface 170 1 0
    //   159: astore_2
    //   160: ldc -78
    //   162: astore_1
    //   163: goto +60 -> 223
    //   166: astore_2
    //   167: getstatic 83	gb/i0:s	Ljava/util/logging/Logger;
    //   170: astore_0
    //   171: getstatic 176	java/util/logging/Level:FINE	Ljava/util/logging/Level;
    //   174: astore_3
    //   175: ldc -76
    //   177: astore_1
    //   178: goto +45 -> 223
    //   181: astore_2
    //   182: getstatic 83	gb/i0:s	Ljava/util/logging/Logger;
    //   185: astore_0
    //   186: getstatic 176	java/util/logging/Level:FINE	Ljava/util/logging/Level;
    //   189: astore_3
    //   190: ldc -74
    //   192: astore_1
    //   193: goto +30 -> 223
    //   196: astore_2
    //   197: getstatic 83	gb/i0:s	Ljava/util/logging/Logger;
    //   200: astore_0
    //   201: getstatic 176	java/util/logging/Level:FINE	Ljava/util/logging/Level;
    //   204: astore_3
    //   205: ldc -72
    //   207: astore_1
    //   208: goto +15 -> 223
    //   211: astore_2
    //   212: getstatic 83	gb/i0:s	Ljava/util/logging/Logger;
    //   215: astore_0
    //   216: getstatic 176	java/util/logging/Level:FINE	Ljava/util/logging/Level;
    //   219: astore_3
    //   220: ldc -70
    //   222: astore_1
    //   223: aload_0
    //   224: aload_3
    //   225: aload_1
    //   226: aload_2
    //   227: invokevirtual 190	java/util/logging/Logger:log	(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V
    //   230: aconst_null
    //   231: astore_2
    //   232: aload_2
    //   233: putstatic 192	gb/i0:x	Lgb/i0$e;
    //   236: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   8	216	0	localLogger	Logger
    //   60	166	1	localObject1	Object
    //   68	92	2	localObject2	Object
    //   166	1	2	localException1	Exception
    //   181	1	2	localException2	Exception
    //   196	1	2	localClassCastException	ClassCastException
    //   211	16	2	localClassNotFoundException	ClassNotFoundException
    //   231	2	2	locale	e
    //   76	149	3	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   126	138	166	java/lang/Exception
    //   117	126	181	java/lang/Exception
    //   104	117	196	java/lang/ClassCastException
    //   104	117	211	java/lang/ClassNotFoundException
  }
  
  public i0(String paramString, u0.a parama, v0.b paramb, p paramp, boolean paramBoolean)
  {
    b.y(parama, "args");
    h = paramb;
    paramb = new StringBuilder();
    paramb.append("//");
    b.y(paramString, "name");
    paramb.append(paramString);
    paramb = URI.create(paramb.toString());
    String str = paramb.getHost();
    boolean bool1 = true;
    boolean bool2;
    if (str != null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    b.n(paramString, "Invalid DNS name: %s", bool2);
    paramString = paramb.getAuthority();
    b.z("nameUri (%s) doesn't have an authority", paramString, paramb);
    e = paramString;
    f = paramb.getHost();
    int i1;
    if (paramb.getPort() == -1) {
      i1 = a;
    } else {
      i1 = paramb.getPort();
    }
    g = i1;
    paramString = b;
    b.y(paramString, "proxyDetector");
    a = paramString;
    long l1 = 0L;
    if (!paramBoolean)
    {
      paramb = System.getProperty("networkaddress.cache.ttl");
      long l2 = 30L;
      l1 = l2;
      if (paramb != null) {
        try
        {
          l1 = Long.parseLong(paramb);
        }
        catch (NumberFormatException paramString)
        {
          s.log(Level.WARNING, "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[] { "networkaddress.cache.ttl", paramb, Long.valueOf(30L) });
          l1 = l2;
        }
      }
      if (l1 > 0L) {
        l1 = TimeUnit.SECONDS.toNanos(l1);
      }
    }
    i = l1;
    k = paramp;
    paramString = c;
    b.y(paramString, "syncContext");
    j = paramString;
    paramString = g;
    n = paramString;
    if (paramString == null) {
      paramBoolean = bool1;
    } else {
      paramBoolean = false;
    }
    o = paramBoolean;
    paramString = d;
    b.y(paramString, "serviceConfigParser");
    p = paramString;
  }
  
  public static Map<String, ?> f(Map<String, ?> paramMap, Random paramRandom, String paramString)
  {
    Iterator localIterator = paramMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      localObject = (Map.Entry)localIterator.next();
      z.r(localObject, "Bad key: %s", t.contains(((Map.Entry)localObject).getKey()));
    }
    Object localObject = n1.d("clientLanguage", paramMap);
    int i1;
    if ((localObject != null) && (!((List)localObject).isEmpty()))
    {
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext()) {
        if ("java".equalsIgnoreCase((String)((Iterator)localObject).next()))
        {
          i1 = 1;
          break label128;
        }
      }
      i1 = 0;
      label128:
      if (i1 == 0) {
        return null;
      }
    }
    localObject = n1.e("percentage", paramMap);
    if (localObject != null)
    {
      i1 = ((Double)localObject).intValue();
      boolean bool;
      if ((i1 >= 0) && (i1 <= 100)) {
        bool = true;
      } else {
        bool = false;
      }
      z.r(localObject, "Bad percentage: %s", bool);
      if (paramRandom.nextInt(100) >= i1) {
        return null;
      }
    }
    paramRandom = n1.d("clientHostname", paramMap);
    if ((paramRandom != null) && (!paramRandom.isEmpty()))
    {
      paramRandom = paramRandom.iterator();
      while (paramRandom.hasNext()) {
        if (((String)paramRandom.next()).equals(paramString))
        {
          i1 = 1;
          break label260;
        }
      }
      i1 = 0;
      label260:
      if (i1 == 0) {
        return null;
      }
    }
    paramRandom = n1.g("serviceConfig", paramMap);
    if (paramRandom != null) {
      return paramRandom;
    }
    throw new w(String.format("key '%s' missing in '%s'", new Object[] { paramMap, "serviceConfig" }));
  }
  
  public static ArrayList g(List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Object localObject1 = (String)paramList.next();
      if (!((String)localObject1).startsWith("grpc_config="))
      {
        s.log(Level.FINE, "Ignoring non service config {0}", new Object[] { localObject1 });
      }
      else
      {
        localObject1 = ((String)localObject1).substring(12);
        Object localObject2 = m1.a;
        localObject2 = new a(new StringReader((String)localObject1));
        try
        {
          localObject1 = m1.a((a)localObject2);
          try
          {
            ((a)localObject2).close();
          }
          catch (IOException localIOException2)
          {
            m1.a.log(Level.WARNING, "Failed to close", localIOException2);
          }
          if ((localObject1 instanceof List))
          {
            localObject1 = (List)localObject1;
            n1.a((List)localObject1);
            localArrayList.addAll((Collection)localObject1);
          }
          else
          {
            paramList = new StringBuilder();
            paramList.append("wrong type ");
            paramList.append(localObject1);
            throw new ClassCastException(paramList.toString());
          }
        }
        finally
        {
          try
          {
            localIOException2.close();
          }
          catch (IOException localIOException1)
          {
            m1.a.log(Level.WARNING, "Failed to close", localIOException1);
          }
        }
      }
    }
    return localIOException1;
  }
  
  public final String a()
  {
    return e;
  }
  
  public final void b()
  {
    boolean bool;
    if (r != null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "not started");
    h();
  }
  
  public final void c()
  {
    if (m) {
      return;
    }
    m = true;
    Executor localExecutor = n;
    if ((localExecutor != null) && (o))
    {
      h3.b(h, localExecutor);
      n = null;
    }
  }
  
  public final void d(u0.d paramd)
  {
    boolean bool;
    if (r == null) {
      bool = true;
    } else {
      bool = false;
    }
    b.I(bool, "already started");
    if (o) {
      n = ((Executor)h3.a(h));
    }
    r = paramd;
    h();
  }
  
  public final a e()
  {
    a locala = new a();
    try
    {
      b = i();
      if (w)
      {
        Object localObject1 = Collections.emptyList();
        boolean bool1 = u;
        boolean bool2 = v;
        Object localObject2 = f;
        if (bool1)
        {
          if ("localhost".equalsIgnoreCase((String)localObject2)) {
            break label161;
          }
          if (!((String)localObject2).contains(":")) {}
        }
        else
        {
          bool2 = false;
          break label161;
        }
        int i1 = 0;
        int i4;
        for (int i2 = 1; i1 < ((String)localObject2).length(); i2 = i4)
        {
          int i3 = ((String)localObject2).charAt(i1);
          i4 = i2;
          if (i3 != 46)
          {
            if ((i3 >= 48) && (i3 <= 57)) {
              i4 = 1;
            } else {
              i4 = 0;
            }
            i4 = i2 & i4;
          }
          i1++;
        }
        bool2 = i2 ^ 0x1;
        label161:
        locale1 = null;
        Object localObject6;
        if (!bool2)
        {
          localObject2 = null;
        }
        else
        {
          localObject5 = (d)d.get();
          localObject2 = localObject5;
          if (localObject5 == null)
          {
            localObject6 = x;
            localObject2 = localObject5;
            if (localObject6 != null) {
              localObject2 = ((e)localObject6).a();
            }
          }
        }
        localObject5 = localObject1;
        if (localObject2 != null) {
          try
          {
            localObject5 = new java/lang/StringBuilder;
            ((StringBuilder)localObject5).<init>();
            ((StringBuilder)localObject5).append("_grpc_config.");
            ((StringBuilder)localObject5).append(f);
            localObject5 = ((d)localObject2).a(((StringBuilder)localObject5).toString());
          }
          catch (Exception localException1)
          {
            s.log(Level.FINE, "ServiceConfig resolution failure", localException1);
            localObject5 = localObject1;
          }
        }
        if (!((List)localObject5).isEmpty())
        {
          localObject6 = b;
          if (y == null) {
            try
            {
              y = InetAddress.getLocalHost().getHostName();
            }
            catch (UnknownHostException localUnknownHostException)
            {
              throw new RuntimeException(localUnknownHostException);
            }
          }
          localObject1 = y;
          try
          {
            Object localObject3 = g((List)localObject5);
            Iterator localIterator = ((ArrayList)localObject3).iterator();
            localObject3 = null;
            u0.b localb;
            for (;;)
            {
              if (localIterator.hasNext())
              {
                localObject3 = (Map)localIterator.next();
                try
                {
                  localObject5 = f((Map)localObject3, (Random)localObject6, (String)localObject1);
                  localObject3 = localObject5;
                  if (localObject5 != null) {
                    localObject3 = localObject5;
                  }
                }
                catch (RuntimeException localRuntimeException1)
                {
                  localb = new u0.b(e1.g.g("failed to pick service config choice").f(localRuntimeException1));
                  break label490;
                }
              }
            }
            if (localb == null) {
              localb = null;
            } else {
              localb = new u0.b(localb);
            }
          }
          catch (RuntimeException localRuntimeException2) {}catch (IOException localIOException) {}
          Object localObject4 = new u0.b(e1.g.g("failed to parse TXT records").f(localIOException));
          label490:
          localObject5 = locale1;
          if (localObject4 != null)
          {
            localObject5 = a;
            if (localObject5 != null)
            {
              localObject5 = new u0.b((e1)localObject5);
            }
            else
            {
              localObject4 = (Map)b;
              localObject5 = p.a((Map)localObject4);
            }
          }
        }
        else
        {
          s.log(Level.FINE, "No TXT records found for {0}", new Object[] { f });
          localObject5 = locale1;
        }
        c = ((u0.b)localObject5);
      }
      return locala;
    }
    catch (Exception localException2)
    {
      e1 locale1 = e1.n;
      Object localObject5 = f.l("Unable to resolve host ");
      ((StringBuilder)localObject5).append(f);
      a = locale1.g(((StringBuilder)localObject5).toString()).f(localException2);
    }
    return locala;
  }
  
  public final void h()
  {
    if ((!q) && (!m))
    {
      if (l)
      {
        bool = i < 0L;
        if ((bool) && ((!bool) || (k.a(TimeUnit.NANOSECONDS) <= i)))
        {
          bool = false;
          break label64;
        }
      }
      boolean bool = true;
      label64:
      if (bool)
      {
        q = true;
        n.execute(new c(r));
      }
    }
  }
  
  public final List<eb.u> i()
  {
    Object localObject1 = null;
    Object localObject3 = localObject1;
    try
    {
      b localb = c;
      localObject3 = localObject1;
      localObject4 = f;
      localObject3 = localObject1;
      localb.getClass();
      localObject3 = localObject1;
      localObject1 = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName((String)localObject4)));
      localObject3 = new ArrayList(((List)localObject1).size());
      localObject1 = ((List)localObject1).iterator();
      while (((Iterator)localObject1).hasNext()) {
        ((ArrayList)localObject3).add(new eb.u(new InetSocketAddress((InetAddress)((Iterator)localObject1).next(), g)));
      }
      return Collections.unmodifiableList((List)localObject3);
    }
    catch (Exception localException)
    {
      localObject3 = localException;
      Object localObject4 = n7.u.a;
      localObject3 = localException;
      if (!(localException instanceof RuntimeException))
      {
        localObject3 = localException;
        if (!(localException instanceof Error))
        {
          localObject3 = localException;
          localObject4 = new java/lang/RuntimeException;
          localObject3 = localException;
          ((RuntimeException)localObject4).<init>(localException);
          localObject3 = localException;
          throw ((Throwable)localObject4);
        }
        localObject3 = localException;
        throw ((Error)localException);
      }
    }
    finally
    {
      break label172;
      localObject3 = localObject2;
      throw ((RuntimeException)localObject2);
      label172:
      if (localObject3 != null) {
        s.log(Level.FINE, "Address resolution failure", (Throwable)localObject3);
      }
    }
  }
  
  public static final class a
  {
    public e1 a;
    public List<eb.u> b;
    public u0.b c;
  }
  
  public static enum b
  {
    static
    {
      b localb = new b();
      a = localb;
      b = new b[] { localb };
    }
    
    public b() {}
  }
  
  public final class c
    implements Runnable
  {
    public final u0.d a;
    
    public c(u0.d paramd)
    {
      b.y(paramd, "savedListener");
      a = paramd;
    }
    
    /* Error */
    public final void run()
    {
      // Byte code:
      //   0: getstatic 40	gb/i0:s	Ljava/util/logging/Logger;
      //   3: astore_1
      //   4: getstatic 46	java/util/logging/Level:FINER	Ljava/util/logging/Level;
      //   7: astore_2
      //   8: aload_1
      //   9: aload_2
      //   10: invokevirtual 52	java/util/logging/Logger:isLoggable	(Ljava/util/logging/Level;)Z
      //   13: ifeq +29 -> 42
      //   16: ldc 54
      //   18: invokestatic 60	f:l	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   21: astore_3
      //   22: aload_3
      //   23: aload_0
      //   24: getfield 19	gb/i0$c:b	Lgb/i0;
      //   27: getfield 63	gb/i0:f	Ljava/lang/String;
      //   30: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   33: pop
      //   34: aload_1
      //   35: aload_3
      //   36: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   39: invokevirtual 76	java/util/logging/Logger:finer	(Ljava/lang/String;)V
      //   42: aconst_null
      //   43: astore 4
      //   45: aconst_null
      //   46: astore 5
      //   48: aconst_null
      //   49: astore 6
      //   51: aconst_null
      //   52: astore 7
      //   54: iconst_1
      //   55: istore 8
      //   57: iconst_1
      //   58: istore 9
      //   60: iconst_1
      //   61: istore 10
      //   63: iconst_1
      //   64: istore 11
      //   66: aload 5
      //   68: astore_3
      //   69: aload_0
      //   70: getfield 19	gb/i0$c:b	Lgb/i0;
      //   73: astore 12
      //   75: aload 5
      //   77: astore_3
      //   78: aload 12
      //   80: getfield 63	gb/i0:f	Ljava/lang/String;
      //   83: aload 12
      //   85: getfield 80	gb/i0:g	I
      //   88: invokestatic 86	java/net/InetSocketAddress:createUnresolved	(Ljava/lang/String;I)Ljava/net/InetSocketAddress;
      //   91: astore 13
      //   93: aload 5
      //   95: astore_3
      //   96: aload 12
      //   98: getfield 89	gb/i0:a	Leb/z0;
      //   101: aload 13
      //   103: invokeinterface 94 2 0
      //   108: astore 12
      //   110: aload 12
      //   112: ifnull +24 -> 136
      //   115: aload 5
      //   117: astore_3
      //   118: new 96	eb/u
      //   121: astore 13
      //   123: aload 5
      //   125: astore_3
      //   126: aload 13
      //   128: aload 12
      //   130: invokespecial 99	eb/u:<init>	(Ljava/net/SocketAddress;)V
      //   133: goto +6 -> 139
      //   136: aconst_null
      //   137: astore 13
      //   139: aload 5
      //   141: astore_3
      //   142: invokestatic 105	java/util/Collections:emptyList	()Ljava/util/List;
      //   145: astore 12
      //   147: aload 5
      //   149: astore_3
      //   150: getstatic 110	eb/a:b	Leb/a;
      //   153: astore 14
      //   155: aload 13
      //   157: ifnull +83 -> 240
      //   160: aload 5
      //   162: astore_3
      //   163: aload_1
      //   164: aload_2
      //   165: invokevirtual 52	java/util/logging/Logger:isLoggable	(Ljava/util/logging/Level;)Z
      //   168: ifeq +53 -> 221
      //   171: aload 5
      //   173: astore_3
      //   174: new 65	java/lang/StringBuilder
      //   177: astore 7
      //   179: aload 5
      //   181: astore_3
      //   182: aload 7
      //   184: invokespecial 111	java/lang/StringBuilder:<init>	()V
      //   187: aload 5
      //   189: astore_3
      //   190: aload 7
      //   192: ldc 113
      //   194: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   197: pop
      //   198: aload 5
      //   200: astore_3
      //   201: aload 7
      //   203: aload 13
      //   205: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   208: pop
      //   209: aload 5
      //   211: astore_3
      //   212: aload_1
      //   213: aload 7
      //   215: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   218: invokevirtual 76	java/util/logging/Logger:finer	(Ljava/lang/String;)V
      //   221: aload 5
      //   223: astore_3
      //   224: aload 13
      //   226: invokestatic 120	java/util/Collections:singletonList	(Ljava/lang/Object;)Ljava/util/List;
      //   229: astore 13
      //   231: aconst_null
      //   232: astore_3
      //   233: aload 4
      //   235: astore 7
      //   237: goto +112 -> 349
      //   240: aload 5
      //   242: astore_3
      //   243: aload_0
      //   244: getfield 19	gb/i0$c:b	Lgb/i0;
      //   247: invokevirtual 124	gb/i0:e	()Lgb/i0$a;
      //   250: astore 13
      //   252: aload 13
      //   254: getfield 129	gb/i0$a:a	Leb/e1;
      //   257: astore_3
      //   258: aload_3
      //   259: ifnull +46 -> 305
      //   262: aload_0
      //   263: getfield 32	gb/i0$c:a	Leb/u0$d;
      //   266: aload_3
      //   267: invokevirtual 134	eb/u0$d:a	(Leb/e1;)V
      //   270: aload 13
      //   272: getfield 129	gb/i0$a:a	Leb/e1;
      //   275: ifnonnull +6 -> 281
      //   278: goto +6 -> 284
      //   281: iconst_0
      //   282: istore 11
      //   284: aload_0
      //   285: getfield 19	gb/i0$c:b	Lgb/i0;
      //   288: getfield 138	gb/i0:j	Leb/h1;
      //   291: new 11	gb/i0$c$a
      //   294: dup
      //   295: aload_0
      //   296: iload 11
      //   298: invokespecial 141	gb/i0$c$a:<init>	(Lgb/i0$c;Z)V
      //   301: invokevirtual 147	eb/h1:execute	(Ljava/lang/Runnable;)V
      //   304: return
      //   305: aload 13
      //   307: getfield 150	gb/i0$a:b	Ljava/util/List;
      //   310: astore 4
      //   312: aload 12
      //   314: astore_3
      //   315: aload 4
      //   317: ifnull +6 -> 323
      //   320: aload 4
      //   322: astore_3
      //   323: aload 13
      //   325: getfield 153	gb/i0$a:c	Leb/u0$b;
      //   328: astore 4
      //   330: aload 4
      //   332: ifnull +7 -> 339
      //   335: aload 4
      //   337: astore 7
      //   339: aload 13
      //   341: astore 4
      //   343: aload_3
      //   344: astore 13
      //   346: aload 4
      //   348: astore_3
      //   349: aload_0
      //   350: getfield 32	gb/i0$c:a	Leb/u0$d;
      //   353: astore 4
      //   355: new 155	eb/u0$e
      //   358: astore 6
      //   360: aload 6
      //   362: aload 13
      //   364: aload 14
      //   366: aload 7
      //   368: invokespecial 158	eb/u0$e:<init>	(Ljava/util/List;Leb/a;Leb/u0$b;)V
      //   371: aload 4
      //   373: aload 6
      //   375: invokevirtual 161	eb/u0$d:b	(Leb/u0$e;)V
      //   378: aload_3
      //   379: ifnull +17 -> 396
      //   382: aload_3
      //   383: getfield 129	gb/i0$a:a	Leb/e1;
      //   386: ifnonnull +10 -> 396
      //   389: iload 8
      //   391: istore 11
      //   393: goto +6 -> 399
      //   396: iconst_0
      //   397: istore 11
      //   399: aload_0
      //   400: getfield 19	gb/i0$c:b	Lgb/i0;
      //   403: getfield 138	gb/i0:j	Leb/h1;
      //   406: astore_3
      //   407: new 11	gb/i0$c$a
      //   410: dup
      //   411: aload_0
      //   412: iload 11
      //   414: invokespecial 141	gb/i0$c$a:<init>	(Lgb/i0$c;Z)V
      //   417: astore 13
      //   419: goto +167 -> 586
      //   422: astore 13
      //   424: goto +169 -> 593
      //   427: astore 7
      //   429: aload_3
      //   430: astore 13
      //   432: aload 7
      //   434: astore_3
      //   435: goto +22 -> 457
      //   438: astore_3
      //   439: goto +164 -> 603
      //   442: astore 7
      //   444: goto +16 -> 460
      //   447: astore 13
      //   449: goto +144 -> 593
      //   452: astore_3
      //   453: aload 6
      //   455: astore 13
      //   457: aload_3
      //   458: astore 7
      //   460: aload 13
      //   462: astore_3
      //   463: aload_0
      //   464: getfield 32	gb/i0$c:a	Leb/u0$d;
      //   467: astore 4
      //   469: aload 13
      //   471: astore_3
      //   472: getstatic 166	eb/e1:n	Leb/e1;
      //   475: astore 6
      //   477: aload 13
      //   479: astore_3
      //   480: new 65	java/lang/StringBuilder
      //   483: astore 5
      //   485: aload 13
      //   487: astore_3
      //   488: aload 5
      //   490: invokespecial 111	java/lang/StringBuilder:<init>	()V
      //   493: aload 13
      //   495: astore_3
      //   496: aload 5
      //   498: ldc -88
      //   500: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   503: pop
      //   504: aload 13
      //   506: astore_3
      //   507: aload 5
      //   509: aload_0
      //   510: getfield 19	gb/i0$c:b	Lgb/i0;
      //   513: getfield 63	gb/i0:f	Ljava/lang/String;
      //   516: invokevirtual 68	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   519: pop
      //   520: aload 13
      //   522: astore_3
      //   523: aload 4
      //   525: aload 6
      //   527: aload 5
      //   529: invokevirtual 72	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   532: invokevirtual 171	eb/e1:g	(Ljava/lang/String;)Leb/e1;
      //   535: aload 7
      //   537: invokevirtual 174	eb/e1:f	(Ljava/lang/Throwable;)Leb/e1;
      //   540: invokevirtual 134	eb/u0$d:a	(Leb/e1;)V
      //   543: aload 13
      //   545: ifnull +18 -> 563
      //   548: aload 13
      //   550: getfield 129	gb/i0$a:a	Leb/e1;
      //   553: ifnonnull +10 -> 563
      //   556: iload 9
      //   558: istore 11
      //   560: goto +6 -> 566
      //   563: iconst_0
      //   564: istore 11
      //   566: aload_0
      //   567: getfield 19	gb/i0$c:b	Lgb/i0;
      //   570: getfield 138	gb/i0:j	Leb/h1;
      //   573: astore_3
      //   574: new 11	gb/i0$c$a
      //   577: dup
      //   578: aload_0
      //   579: iload 11
      //   581: invokespecial 141	gb/i0$c$a:<init>	(Lgb/i0$c;Z)V
      //   584: astore 13
      //   586: aload_3
      //   587: aload 13
      //   589: invokevirtual 147	eb/h1:execute	(Ljava/lang/Runnable;)V
      //   592: return
      //   593: aload 13
      //   595: astore 7
      //   597: aload_3
      //   598: astore 13
      //   600: aload 7
      //   602: astore_3
      //   603: aload 13
      //   605: ifnull +18 -> 623
      //   608: aload 13
      //   610: getfield 129	gb/i0$a:a	Leb/e1;
      //   613: ifnonnull +10 -> 623
      //   616: iload 10
      //   618: istore 11
      //   620: goto +6 -> 626
      //   623: iconst_0
      //   624: istore 11
      //   626: aload_0
      //   627: getfield 19	gb/i0$c:b	Lgb/i0;
      //   630: getfield 138	gb/i0:j	Leb/h1;
      //   633: new 11	gb/i0$c$a
      //   636: dup
      //   637: aload_0
      //   638: iload 11
      //   640: invokespecial 141	gb/i0$c$a:<init>	(Lgb/i0$c;Z)V
      //   643: invokevirtual 147	eb/h1:execute	(Ljava/lang/Runnable;)V
      //   646: aload_3
      //   647: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	648	0	this	c
      //   3	210	1	localLogger	Logger
      //   7	158	2	localLevel	Level
      //   21	414	3	localObject1	Object
      //   438	1	3	localObject2	Object
      //   452	6	3	localIOException1	IOException
      //   462	185	3	localObject3	Object
      //   43	481	4	localObject4	Object
      //   46	482	5	localStringBuilder	StringBuilder
      //   49	477	6	localObject5	Object
      //   52	315	7	localObject6	Object
      //   427	6	7	localIOException2	IOException
      //   442	1	7	localIOException3	IOException
      //   458	143	7	localObject7	Object
      //   55	335	8	bool1	boolean
      //   58	499	9	bool2	boolean
      //   61	556	10	bool3	boolean
      //   64	575	11	bool4	boolean
      //   73	240	12	localObject8	Object
      //   91	327	13	localObject9	Object
      //   422	1	13	localObject10	Object
      //   430	1	13	localObject11	Object
      //   447	1	13	localObject12	Object
      //   455	154	13	localObject13	Object
      //   153	212	14	locala	eb.a
      // Exception table:
      //   from	to	target	type
      //   349	378	422	finally
      //   349	378	427	java/io/IOException
      //   252	258	438	finally
      //   262	270	438	finally
      //   305	312	438	finally
      //   323	330	438	finally
      //   252	258	442	java/io/IOException
      //   262	270	442	java/io/IOException
      //   305	312	442	java/io/IOException
      //   323	330	442	java/io/IOException
      //   69	75	447	finally
      //   78	93	447	finally
      //   96	110	447	finally
      //   118	123	447	finally
      //   126	133	447	finally
      //   142	147	447	finally
      //   150	155	447	finally
      //   163	171	447	finally
      //   174	179	447	finally
      //   182	187	447	finally
      //   190	198	447	finally
      //   201	209	447	finally
      //   212	221	447	finally
      //   224	231	447	finally
      //   243	252	447	finally
      //   463	469	447	finally
      //   472	477	447	finally
      //   480	485	447	finally
      //   488	493	447	finally
      //   496	504	447	finally
      //   507	520	447	finally
      //   523	543	447	finally
      //   69	75	452	java/io/IOException
      //   78	93	452	java/io/IOException
      //   96	110	452	java/io/IOException
      //   118	123	452	java/io/IOException
      //   126	133	452	java/io/IOException
      //   142	147	452	java/io/IOException
      //   150	155	452	java/io/IOException
      //   163	171	452	java/io/IOException
      //   174	179	452	java/io/IOException
      //   182	187	452	java/io/IOException
      //   190	198	452	java/io/IOException
      //   201	209	452	java/io/IOException
      //   212	221	452	java/io/IOException
      //   224	231	452	java/io/IOException
      //   243	252	452	java/io/IOException
    }
    
    public final class a
      implements Runnable
    {
      public a(boolean paramBoolean) {}
      
      public final void run()
      {
        if (bool4)
        {
          Object localObject = i0.this;
          l = true;
          if (i > 0L)
          {
            localObject = k;
            b = false;
            ((p)localObject).b();
          }
        }
        q = false;
      }
    }
  }
  
  public static abstract interface d
  {
    public abstract List<String> a(String paramString);
  }
  
  public static abstract interface e
  {
    public abstract l1.b a();
    
    public abstract Throwable b();
  }
}

/* Location:
 * Qualified Name:     gb.i0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */