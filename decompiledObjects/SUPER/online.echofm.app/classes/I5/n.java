package I5;

import A5.a.b;
import E5.k.c;
import E5.k.d;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;

public class n
  implements FlutterFirebasePlugin, k.c, A5.a
{
  public FirebaseAnalytics a;
  public E5.k b;
  
  private static Bundle n(Map paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    Object localObject1 = new Bundle();
    Iterator localIterator1 = paramMap.entrySet().iterator();
    while (localIterator1.hasNext())
    {
      paramMap = (Map.Entry)localIterator1.next();
      Object localObject2 = paramMap.getValue();
      paramMap = (String)paramMap.getKey();
      if ((localObject2 instanceof String))
      {
        ((BaseBundle)localObject1).putString(paramMap, (String)localObject2);
      }
      else
      {
        if ((localObject2 instanceof Integer)) {}
        for (long l = ((Integer)localObject2).intValue();; l = ((Long)localObject2).longValue())
        {
          ((BaseBundle)localObject1).putLong(paramMap, l);
          break;
          if (!(localObject2 instanceof Long)) {
            break label127;
          }
        }
        label127:
        if ((localObject2 instanceof Double))
        {
          ((BaseBundle)localObject1).putDouble(paramMap, ((Double)localObject2).doubleValue());
        }
        else if ((localObject2 instanceof Boolean))
        {
          ((BaseBundle)localObject1).putBoolean(paramMap, ((Boolean)localObject2).booleanValue());
        }
        else if (localObject2 == null)
        {
          ((BaseBundle)localObject1).putString(paramMap, null);
        }
        else if ((localObject2 instanceof Iterable))
        {
          ArrayList localArrayList = new ArrayList();
          Iterator localIterator2 = ((Iterable)localObject2).iterator();
          while (localIterator2.hasNext())
          {
            localObject2 = localIterator2.next();
            if ((localObject2 instanceof Map))
            {
              localArrayList.add(n((Map)localObject2));
            }
            else
            {
              localObject1 = new StringBuilder();
              ((StringBuilder)localObject1).append("Unsupported value type: ");
              ((StringBuilder)localObject1).append(localObject2.getClass().getCanonicalName());
              ((StringBuilder)localObject1).append(" in list at key ");
              ((StringBuilder)localObject1).append(paramMap);
              throw new IllegalArgumentException(((StringBuilder)localObject1).toString());
            }
          }
          ((Bundle)localObject1).putParcelableArrayList(paramMap, localArrayList);
        }
        else if ((localObject2 instanceof Map))
        {
          ((Bundle)localObject1).putParcelable(paramMap, n((Map)localObject2));
        }
        else
        {
          paramMap = new StringBuilder();
          paramMap.append("Unsupported value type: ");
          paramMap.append(localObject2.getClass().getCanonicalName());
          throw new IllegalArgumentException(paramMap.toString());
        }
      }
    }
    return (Bundle)localObject1;
  }
  
  private void w(E5.c paramc, Context paramContext)
  {
    a = FirebaseAnalytics.getInstance(paramContext);
    paramc = new E5.k(paramc, "plugins.flutter.io/firebase_analytics");
    b = paramc;
    paramc.e(this);
    FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_analytics", this);
  }
  
  public final V2.j K(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new b(this, paramMap, localk));
    return localk.a();
  }
  
  public final V2.j L(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new d(this, paramMap, localk));
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
    parame = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new a(this, parame));
    return parame.a();
  }
  
  public final V2.j o()
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new j(this, localk));
    return localk.a();
  }
  
  public void onAttachedToEngine(a.b paramb)
  {
    w(paramb.b(), paramb.a());
  }
  
  public void onDetachedFromEngine(a.b paramb)
  {
    paramb = b;
    if (paramb != null)
    {
      paramb.e(null);
      b = null;
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
    case 1992044651: 
      if (str.equals("Analytics#setUserId")) {
        j = 9;
      }
      break;
    case 1751063748: 
      if (str.equals("Analytics#setSessionTimeoutDuration")) {
        j = 8;
      }
      break;
    case 1083589925: 
      if (str.equals("Analytics#setUserProperty")) {
        j = 7;
      }
      break;
    case 179244440: 
      if (str.equals("Analytics#getSessionId")) {
        j = 6;
      }
      break;
    case -45011405: 
      if (str.equals("Analytics#logEvent")) {
        j = 5;
      }
      break;
    case -99047480: 
      if (str.equals("Analytics#setDefaultEventParameters")) {
        j = 4;
      }
      break;
    case -273201790: 
      if (str.equals("Analytics#setAnalyticsCollectionEnabled")) {
        j = 3;
      }
      break;
    case -1572470123: 
      if (str.equals("Analytics#setConsent")) {
        j = 2;
      }
      break;
    case -1931910274: 
      if (str.equals("Analytics#resetAnalyticsData")) {
        j = 1;
      }
      break;
    case -2090892968: 
      if (str.equals("Analytics#getAppInstanceId")) {
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
      paramj = u((Map)paramj.b());
      break;
    case 8: 
      paramj = t((Map)paramj.b());
      break;
    case 7: 
      paramj = v((Map)paramj.b());
      break;
    case 6: 
      paramj = p();
      break;
    case 5: 
      paramj = q((Map)paramj.b());
      break;
    case 4: 
      paramj = L((Map)paramj.b());
      break;
    case 3: 
      paramj = s((Map)paramj.b());
      break;
    case 2: 
      paramj = K((Map)paramj.b());
      break;
    case 1: 
      paramj = r();
      break;
    case 0: 
      paramj = o();
    }
    paramj.b(new f(paramd));
  }
  
  public final V2.j p()
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new g(this, localk));
    return localk.a();
  }
  
  public final V2.j q(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new i(this, paramMap, localk));
    return localk.a();
  }
  
  public final V2.j r()
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new m(this, localk));
    return localk.a();
  }
  
  public final V2.j s(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new l(this, paramMap, localk));
    return localk.a();
  }
  
  public final V2.j t(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new k(this, paramMap, localk));
    return localk.a();
  }
  
  public final V2.j u(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new c(this, paramMap, localk));
    return localk.a();
  }
  
  public final V2.j v(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new h(this, paramMap, localk));
    return localk.a();
  }
  
  public class a
    extends HashMap
  {
    public a() {}
  }
}

/* Location:
 * Qualified Name:     I5.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */