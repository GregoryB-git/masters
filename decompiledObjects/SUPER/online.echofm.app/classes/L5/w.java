package L5;

import A5.a;
import A5.a.b;
import E5.c;
import E5.d.d;
import E5.k.c;
import E5.k.d;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

public class w
  implements FlutterFirebasePlugin, a, k.c
{
  public static final HashMap e = new HashMap();
  public int a = 0;
  public final Map b = new HashMap();
  public E5.k c;
  public c d;
  
  public static void b0(Q3.h paramh, String paramString)
  {
    synchronized (e)
    {
      if ((Q3.h)???.get(paramString) == null) {
        ???.put(paramString, paramh);
      }
    }
  }
  
  public static Q3.h v(String paramString)
  {
    synchronized (e)
    {
      paramString = (Q3.h)???.get(paramString);
      return paramString;
    }
  }
  
  public final V2.j A(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new u(this, paramMap, localk));
    return localk.a();
  }
  
  public final void B(c paramc)
  {
    FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_database", this);
    d = paramc;
    paramc = new E5.k(paramc, "plugins.flutter.io/firebase_database");
    c = paramc;
    paramc.e(this);
  }
  
  public final V2.j V(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new g(this, paramMap, localk));
    return localk.a();
  }
  
  public final V2.j W(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new q(this, paramMap, localk));
    return localk.a();
  }
  
  public final V2.j X(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new k(this, paramMap, localk));
    return localk.a();
  }
  
  public final V2.j Y(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new f(this, paramMap, localk));
    return localk.a();
  }
  
  public final void Z()
  {
    Iterator localIterator = b.keySet().iterator();
    while (localIterator.hasNext())
    {
      E5.d locald = (E5.d)localIterator.next();
      d.d locald1 = (d.d)b.get(locald);
      if (locald1 != null)
      {
        locald1.a(null);
        locald.d(null);
      }
    }
    b.clear();
  }
  
  public final V2.j a0(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new s(this, paramMap, localk));
    return localk.a();
  }
  
  public final V2.j c0(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new v(this, paramMap, localk));
    return localk.a();
  }
  
  public final V2.j d0(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new j(this, paramMap, localk));
    return localk.a();
  }
  
  public V2.j didReinitializeFirebaseCore()
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new n(this, localk));
    return localk.a();
  }
  
  public final V2.j e0(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new i(this, paramMap, localk));
    return localk.a();
  }
  
  public final V2.j f0(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new t(this, paramMap, localk));
    return localk.a();
  }
  
  public final V2.j g0(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new r(this, paramMap, localk));
    return localk.a();
  }
  
  public V2.j getPluginConstantsForFirebaseApp(s3.e parame)
  {
    parame = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new d(parame));
    return parame.a();
  }
  
  public final V2.j h0(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new l(this, paramMap, localk));
    return localk.a();
  }
  
  public final V2.j i0(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new p(this, paramMap, localk));
    return localk.a();
  }
  
  public void onAttachedToEngine(a.b paramb)
  {
    B(paramb.b());
  }
  
  public void onDetachedFromEngine(a.b paramb)
  {
    c.e(null);
    u();
  }
  
  public void onMethodCall(E5.j paramj, k.d paramd)
  {
    Map localMap = (Map)paramj.b();
    Object localObject = a;
    ((String)localObject).hashCode();
    int i = ((String)localObject).hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1749611585: 
      if (((String)localObject).equals("Query#observe")) {
        j = 14;
      }
      break;
    case 1653150716: 
      if (((String)localObject).equals("FirebaseDatabase#goOnline")) {
        j = 13;
      }
      break;
    case 1185022340: 
      if (((String)localObject).equals("OnDisconnect#setWithPriority")) {
        j = 12;
      }
      break;
    case 734082383: 
      if (((String)localObject).equals("DatabaseReference#set")) {
        j = 11;
      }
      break;
    case 485025361: 
      if (((String)localObject).equals("OnDisconnect#update")) {
        j = 10;
      }
      break;
    case 272980762: 
      if (((String)localObject).equals("Query#keepSynced")) {
        j = 9;
      }
      break;
    case 195628283: 
      if (((String)localObject).equals("Query#get")) {
        j = 8;
      }
      break;
    case -43852798: 
      if (((String)localObject).equals("OnDisconnect#cancel")) {
        j = 7;
      }
      break;
    case -429179942: 
      if (((String)localObject).equals("OnDisconnect#set")) {
        j = 6;
      }
      break;
    case -526424742: 
      if (((String)localObject).equals("FirebaseDatabase#goOffline")) {
        j = 5;
      }
      break;
    case -858161988: 
      if (((String)localObject).equals("DatabaseReference#update")) {
        j = 4;
      }
      break;
    case -1481870471: 
      if (((String)localObject).equals("DatabaseReference#setWithPriority")) {
        j = 3;
      }
      break;
    case -1666493916: 
      if (((String)localObject).equals("FirebaseDatabase#purgeOutstandingWrites")) {
        j = 2;
      }
      break;
    case -2059578349: 
      if (((String)localObject).equals("DatabaseReference#setPriority")) {
        j = 1;
      }
      break;
    case -2082411450: 
      if (((String)localObject).equals("DatabaseReference#runTransaction")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      paramd.c();
      return;
    case 14: 
      localObject = V(localMap);
      break;
    case 13: 
      localObject = A(localMap);
      break;
    case 12: 
      localObject = g0(localMap);
      break;
    case 11: 
      localObject = e0(localMap);
      break;
    case 10: 
      localObject = i0(localMap);
      break;
    case 9: 
      localObject = Y(localMap);
      break;
    case 8: 
      localObject = X(localMap);
      break;
    case 7: 
      localObject = t(localMap);
      break;
    case 6: 
      localObject = c0(localMap);
      break;
    case 5: 
      localObject = z(localMap);
      break;
    case 4: 
      localObject = h0(localMap);
      break;
    case 3: 
      localObject = f0(localMap);
      break;
    case 2: 
      localObject = W(localMap);
      break;
    case 1: 
      localObject = d0(localMap);
      break;
    case 0: 
      localObject = a0(localMap);
    }
    ((V2.j)localObject).b(new o(paramd, paramj));
  }
  
  public final V2.j t(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new e(this, paramMap, localk));
    return localk.a();
  }
  
  public final void u()
  {
    Z();
    e.clear();
  }
  
  public Q3.h w(Map paramMap)
  {
    Object localObject1 = (String)paramMap.get("appName");
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = "[DEFAULT]";
    }
    String str = (String)paramMap.get("databaseURL");
    localObject1 = str;
    if (str == null) {
      localObject1 = "";
    }
    str = ((String)localObject2).concat((String)localObject1);
    Object localObject3 = v(str);
    if (localObject3 != null) {
      return (Q3.h)localObject3;
    }
    localObject2 = s3.e.p((String)localObject2);
    if (!((String)localObject1).isEmpty()) {
      localObject2 = Q3.h.e((s3.e)localObject2, (String)localObject1);
    } else {
      localObject2 = Q3.h.d((s3.e)localObject2);
    }
    Boolean localBoolean = (Boolean)paramMap.get("loggingEnabled");
    localObject1 = (Boolean)paramMap.get("persistenceEnabled");
    localObject3 = (String)paramMap.get("emulatorHost");
    Integer localInteger = (Integer)paramMap.get("emulatorPort");
    Object localObject4 = paramMap.get("cacheSizeBytes");
    if (localBoolean != null)
    {
      try
      {
        if (localBoolean.booleanValue()) {
          paramMap = Q3.l.o;
        }
      }
      catch (Q3.d paramMap)
      {
        break label287;
      }
      paramMap = Q3.l.s;
      ((Q3.h)localObject2).k(paramMap);
    }
    if ((localObject3 != null) && (localInteger != null)) {
      ((Q3.h)localObject2).n((String)localObject3, localInteger.intValue());
    }
    if (localObject1 != null) {
      ((Q3.h)localObject2).m(((Boolean)localObject1).booleanValue());
    }
    if (localObject4 != null)
    {
      if ((localObject4 instanceof Long)) {}
      int i;
      for (long l = ((Long)localObject4).longValue();; l = i)
      {
        ((Q3.h)localObject2).l(l);
        break;
        if (!(localObject4 instanceof Integer)) {
          break;
        }
        i = ((Integer)localObject4).intValue();
      }
      label287:
      localObject1 = paramMap.getMessage();
      if (localObject1 != null)
      {
        if (!((String)localObject1).contains("must be made before any other usage of FirebaseDatabase")) {
          throw paramMap;
        }
      }
      else {
        throw paramMap;
      }
    }
    b0((Q3.h)localObject2, str);
    return (Q3.h)localObject2;
  }
  
  public final Q3.p x(Map paramMap)
  {
    Q3.e locale = y(paramMap);
    paramMap = paramMap.get("modifiers");
    Objects.requireNonNull(paramMap);
    return new A(locale, (List)paramMap).a();
  }
  
  public final Q3.e y(Map paramMap)
  {
    Q3.h localh = w(paramMap);
    paramMap = paramMap.get("path");
    Objects.requireNonNull(paramMap);
    return localh.f((String)paramMap);
  }
  
  public final V2.j z(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new h(this, paramMap, localk));
    return localk.a();
  }
}

/* Location:
 * Qualified Name:     L5.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */