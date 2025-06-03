package N5;

import A5.a.b;
import E5.d.d;
import E5.k;
import E5.k.c;
import E5.k.d;
import V2.m;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class h
  implements FlutterFirebasePlugin, A5.a, k.c
{
  public k a;
  public final Map b = new HashMap();
  public E5.c c;
  
  public V2.j didReinitializeFirebaseCore()
  {
    return m.c(FlutterFirebasePlugin.cachedThreadPool, new b());
  }
  
  public V2.j getPluginConstantsForFirebaseApp(s3.e parame)
  {
    return m.c(FlutterFirebasePlugin.cachedThreadPool, new a());
  }
  
  public final V2.j h(Map paramMap)
  {
    return m.c(FlutterFirebasePlugin.cachedThreadPool, new g(this, paramMap));
  }
  
  public final Map i(Exception paramException)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("code", "unknown");
    if (paramException != null) {}
    for (paramException = paramException.getMessage();; paramException = "An unknown error has occurred.")
    {
      localHashMap.put("message", paramException);
      break;
    }
    return localHashMap;
  }
  
  public final V2.j j(Map paramMap)
  {
    return m.c(FlutterFirebasePlugin.cachedThreadPool, new d(this, paramMap));
  }
  
  public final s4.h k(Map paramMap)
  {
    paramMap = paramMap.get("appName");
    Objects.requireNonNull(paramMap);
    return s4.h.u(s3.e.p((String)paramMap));
  }
  
  public final V2.j l(Map paramMap)
  {
    return m.c(FlutterFirebasePlugin.cachedThreadPool, new e(this, paramMap));
  }
  
  public void onAttachedToEngine(a.b paramb)
  {
    a = v(paramb.b());
    FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_app_installations", this);
  }
  
  public void onDetachedFromEngine(a.b paramb)
  {
    a.e(null);
    a = null;
    c = null;
    u();
  }
  
  public void onMethodCall(E5.j paramj, k.d paramd)
  {
    String str = a;
    str.hashCode();
    int i = str.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1737112764: 
      if (str.equals("FirebaseInstallations#delete")) {
        j = 3;
      }
      break;
    case 751549920: 
      if (str.equals("FirebaseInstallations#getId")) {
        j = 2;
      }
      break;
    case -230254828: 
      if (str.equals("FirebaseInstallations#getToken")) {
        j = 1;
      }
      break;
    case -1186391021: 
      if (str.equals("FirebaseInstallations#registerIdChangeListener")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      paramd.c();
      return;
    case 3: 
      paramj = h((Map)paramj.b());
      break;
    case 2: 
      paramj = j((Map)paramj.b());
      break;
    case 1: 
      paramj = l((Map)paramj.b());
      break;
    case 0: 
      paramj = t((Map)paramj.b());
    }
    paramj.b(new c(this, paramd));
  }
  
  public final V2.j t(Map paramMap)
  {
    return m.c(FlutterFirebasePlugin.cachedThreadPool, new f(this, paramMap));
  }
  
  public final void u()
  {
    Iterator localIterator = b.keySet().iterator();
    while (localIterator.hasNext())
    {
      E5.d locald = (E5.d)localIterator.next();
      ((d.d)b.get(locald)).a(null);
      locald.d(null);
    }
    b.clear();
  }
  
  public final k v(E5.c paramc)
  {
    k localk = new k(paramc, "plugins.flutter.io/firebase_app_installations");
    localk.e(this);
    c = paramc;
    return localk;
  }
}

/* Location:
 * Qualified Name:     N5.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */