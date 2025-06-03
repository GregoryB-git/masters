package P5;

import A5.a.b;
import E5.k.c;
import E5.k.d;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.HashMap;
import java.util.concurrent.Executor;

public class j
  implements FlutterFirebasePlugin, A5.a, k.c
{
  public static final HashMap b = new HashMap();
  public static final HashMap c = new HashMap();
  public static int d = 0;
  public static int e = 0;
  public E5.k a;
  
  private void l(E5.c paramc)
  {
    FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_performance", this);
    paramc = new E5.k(paramc, "plugins.flutter.io/firebase_performance");
    a = paramc;
    paramc.e(this);
  }
  
  public static String w(String paramString)
  {
    paramString.hashCode();
    int i = paramString.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 2078049157: 
      if (paramString.equals("HttpMethod.Connect")) {
        j = 8;
      }
      break;
    case 951258085: 
      if (paramString.equals("HttpMethod.Post")) {
        j = 7;
      }
      break;
    case 951009573: 
      if (paramString.equals("HttpMethod.Head")) {
        j = 6;
      }
      break;
    case -122777287: 
      if (paramString.equals("HttpMethod.Options")) {
        j = 5;
      }
      break;
    case -572004704: 
      if (paramString.equals("HttpMethod.Trace")) {
        j = 4;
      }
      break;
    case -576186973: 
      if (paramString.equals("HttpMethod.Patch")) {
        j = 3;
      }
      break;
    case -1022018640: 
      if (paramString.equals("HttpMethod.Delete")) {
        j = 2;
      }
      break;
    case -2047524054: 
      if (paramString.equals("HttpMethod.Put")) {
        j = 1;
      }
      break;
    case -2047533199: 
      if (paramString.equals("HttpMethod.Get")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      throw new IllegalArgumentException(String.format("No HttpMethod for: %s", new Object[] { paramString }));
    case 8: 
      return "CONNECT";
    case 7: 
      return "POST";
    case 6: 
      return "HEAD";
    case 5: 
      return "OPTIONS";
    case 4: 
      return "TRACE";
    case 3: 
      return "PATCH";
    case 2: 
      return "DELETE";
    case 1: 
      return "PUT";
    }
    return "GET";
  }
  
  public V2.j didReinitializeFirebaseCore()
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new a(localk));
    return localk.a();
  }
  
  public V2.j getPluginConstantsForFirebaseApp(s3.e parame)
  {
    parame = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new b(this, parame));
    return parame.a();
  }
  
  public final V2.j j(E5.j paramj)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new f(paramj, localk));
    return localk.a();
  }
  
  public final V2.j k(E5.j paramj)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new e(paramj, localk));
    return localk.a();
  }
  
  public final V2.j m()
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new d(localk));
    return localk.a();
  }
  
  public void onAttachedToEngine(a.b paramb)
  {
    l(paramb.b());
  }
  
  public void onDetachedFromEngine(a.b paramb)
  {
    paramb = a;
    if (paramb != null)
    {
      paramb.e(null);
      a = null;
    }
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
    case 1015242224: 
      if (str.equals("FirebasePerformance#httpMetricStart")) {
        j = 5;
      }
      break;
    case 844329211: 
      if (str.equals("FirebasePerformance#setPerformanceCollectionEnabled")) {
        j = 4;
      }
      break;
    case 610629367: 
      if (str.equals("FirebasePerformance#isPerformanceCollectionEnabled")) {
        j = 3;
      }
      break;
    case 347240045: 
      if (str.equals("FirebasePerformance#traceStop")) {
        j = 2;
      }
      break;
    case -1491270476: 
      if (str.equals("FirebasePerformance#httpMetricStop")) {
        j = 1;
      }
      break;
    case -2120473769: 
      if (str.equals("FirebasePerformance#traceStart")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      paramd.c();
      return;
    case 5: 
      paramj = j(paramj);
      break;
    case 4: 
      paramj = x(paramj);
      break;
    case 3: 
      paramj = m();
      break;
    case 2: 
      paramj = z(paramj);
      break;
    case 1: 
      paramj = k(paramj);
      break;
    case 0: 
      paramj = y(paramj);
    }
    paramj.b(new c(paramd));
  }
  
  public final V2.j x(E5.j paramj)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new h(paramj, localk));
    return localk.a();
  }
  
  public final V2.j y(E5.j paramj)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new g(paramj, localk));
    return localk.a();
  }
  
  public final V2.j z(E5.j paramj)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new i(paramj, localk));
    return localk.a();
  }
  
  public class a
    extends HashMap
  {
    public a() {}
  }
}

/* Location:
 * Qualified Name:     P5.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */