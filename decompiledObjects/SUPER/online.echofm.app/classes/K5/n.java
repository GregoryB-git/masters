package K5;

import A5.a.b;
import E5.k.c;
import E5.k.d;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

public class n
  implements FlutterFirebasePlugin, A5.a, k.c
{
  public E5.k a;
  
  public final V2.j J(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new c(paramMap, localk));
    return localk.a();
  }
  
  public final V2.j K(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new g(this, paramMap, localk));
    return localk.a();
  }
  
  public final V2.j L()
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new l(localk));
    return localk.a();
  }
  
  public final V2.j M(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new h(this, paramMap, localk));
    return localk.a();
  }
  
  public final V2.j N(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new b(paramMap, localk));
    return localk.a();
  }
  
  public final V2.j O(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new j(paramMap, localk));
    return localk.a();
  }
  
  public V2.j didReinitializeFirebaseCore()
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new e(localk));
    return localk.a();
  }
  
  public V2.j getPluginConstantsForFirebaseApp(s3.e parame)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new a(this, localk, parame));
    return localk.a();
  }
  
  public final V2.j o()
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new i(this, localk));
    return localk.a();
  }
  
  public void onAttachedToEngine(a.b paramb)
  {
    u(paramb.b());
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
    case 1219454365: 
      if (str.equals("Crashlytics#crash")) {
        j = 9;
      }
      break;
    case 679831756: 
      if (str.equals("Crashlytics#setUserIdentifier")) {
        j = 8;
      }
      break;
    case 213629529: 
      if (str.equals("Crashlytics#deleteUnsentReports")) {
        j = 7;
      }
      break;
    case 108415030: 
      if (str.equals("Crashlytics#setCustomKey")) {
        j = 6;
      }
      break;
    case 28093114: 
      if (str.equals("Crashlytics#log")) {
        j = 5;
      }
      break;
    case -108157790: 
      if (str.equals("Crashlytics#setCrashlyticsCollectionEnabled")) {
        j = 4;
      }
      break;
    case -424770276: 
      if (str.equals("Crashlytics#sendUnsentReports")) {
        j = 3;
      }
      break;
    case -1025128541: 
      if (str.equals("Crashlytics#checkForUnsentReports")) {
        j = 2;
      }
      break;
    case -1437158995: 
      if (str.equals("Crashlytics#recordError")) {
        j = 1;
      }
      break;
    case -2094964816: 
      if (str.equals("Crashlytics#didCrashOnPreviousExecution")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      paramd.c();
      return;
    case 9: 
      p();
      return;
    case 8: 
      paramj = O((Map)paramj.b());
      break;
    case 7: 
      paramj = q();
      break;
    case 6: 
      paramj = N((Map)paramj.b());
      break;
    case 5: 
      paramj = J((Map)paramj.b());
      break;
    case 4: 
      paramj = M((Map)paramj.b());
      break;
    case 3: 
      paramj = L();
      break;
    case 2: 
      paramj = o();
      break;
    case 1: 
      paramj = K((Map)paramj.b());
      break;
    case 0: 
      paramj = r();
    }
    paramj.b(new f(paramd));
  }
  
  public final void p()
  {
    new Handler(Looper.myLooper()).postDelayed(new d(), 50L);
  }
  
  public final V2.j q()
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new k(localk));
    return localk.a();
  }
  
  public final V2.j r()
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new m(this, localk));
    return localk.a();
  }
  
  public final StackTraceElement s(Map paramMap)
  {
    try
    {
      String str1 = (String)paramMap.get("file");
      String str2 = (String)paramMap.get("line");
      String str3 = (String)paramMap.get("class");
      String str4 = (String)paramMap.get("method");
      paramMap = str3;
      if (str3 == null) {
        paramMap = "";
      }
      Objects.requireNonNull(str2);
      paramMap = new StackTraceElement(paramMap, str4, str1, Integer.parseInt(str2));
      return paramMap;
    }
    catch (Exception paramMap)
    {
      Log.e("FLTFirebaseCrashlytics", "Unable to generate stack trace element from Dart error.");
    }
    return null;
  }
  
  public final SharedPreferences t(Context paramContext)
  {
    return paramContext.getSharedPreferences("com.google.firebase.crashlytics", 0);
  }
  
  public final void u(E5.c paramc)
  {
    paramc = new E5.k(paramc, "plugins.flutter.io/firebase_crashlytics");
    a = paramc;
    paramc.e(this);
    FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_crashlytics", this);
  }
  
  public final boolean v(s3.e parame)
  {
    SharedPreferences localSharedPreferences = t(parame.m());
    boolean bool1 = localSharedPreferences.contains("firebase_crashlytics_collection_enabled");
    boolean bool2 = true;
    if (bool1) {
      bool2 = localSharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true);
    } else if (parame.x()) {
      D3.g.d().j(true);
    } else {
      bool2 = false;
    }
    return bool2;
  }
  
  public class a
    extends HashMap
  {
    public a(boolean paramBoolean)
    {
      put("unsentReports", Boolean.valueOf(paramBoolean));
    }
  }
  
  public class b
    extends HashMap
  {
    public b(boolean paramBoolean)
    {
      put("didCrashOnPreviousExecution", Boolean.valueOf(paramBoolean));
    }
  }
  
  public class c
    extends HashMap
  {
    public c()
    {
      put("isCrashlyticsCollectionEnabled", Boolean.valueOf(n.n(n.this, s3.e.o())));
    }
  }
  
  public class d
    extends HashMap
  {
    public d(s3.e parame)
    {
      if (parame.q().equals("[DEFAULT]")) {
        put("isCrashlyticsCollectionEnabled", Boolean.valueOf(n.n(n.this, s3.e.o())));
      }
    }
  }
}

/* Location:
 * Qualified Name:     K5.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */