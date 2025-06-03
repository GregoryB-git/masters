package M5;

import A5.a.b;
import E5.d.b;
import E5.d.d;
import E5.k.c;
import E5.k.d;
import P4.o;
import P4.q;
import P4.s;
import P4.s.b;
import P4.t;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;

public class e
  implements FlutterFirebasePlugin, k.c, A5.a, d.d
{
  public E5.k a;
  public final Map b = new HashMap();
  public E5.d c;
  public final Handler d = new Handler(Looper.getMainLooper());
  
  public void a(Object paramObject)
  {
    paramObject = ((Map)paramObject).get("appName");
    Objects.requireNonNull(paramObject);
    paramObject = (String)paramObject;
    P4.d locald = (P4.d)b.get(paramObject);
    if (locald != null)
    {
      locald.remove();
      b.remove(paramObject);
    }
  }
  
  public void b(Object paramObject, final d.b paramb)
  {
    Object localObject = (Map)paramObject;
    paramObject = i((Map)localObject);
    localObject = ((Map)localObject).get("appName");
    Objects.requireNonNull(localObject);
    localObject = (String)localObject;
    b.put(localObject, ((P4.m)paramObject).i(new a(paramb)));
  }
  
  public V2.j didReinitializeFirebaseCore()
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new a(localk));
    return localk.a();
  }
  
  public final Map g(t paramt)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("value", paramt.e());
    localHashMap.put("source", n(paramt.f()));
    return localHashMap;
  }
  
  public V2.j getPluginConstantsForFirebaseApp(s3.e parame)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new b(this, parame, localk));
    return localk.a();
  }
  
  public final Map h(P4.m paramm)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("fetchTimeout", Long.valueOf(paramm.n().b().a()));
    localHashMap.put("minimumFetchInterval", Long.valueOf(paramm.n().b().b()));
    localHashMap.put("lastFetchTime", Long.valueOf(paramm.n().a()));
    localHashMap.put("lastFetchStatus", m(paramm.n().c()));
    paramm = new StringBuilder();
    paramm.append("Sending fetchTimeout: ");
    paramm.append(localHashMap.get("fetchTimeout"));
    t5.b.a("FRCPlugin", paramm.toString());
    return localHashMap;
  }
  
  public final P4.m i(Map paramMap)
  {
    paramMap = paramMap.get("appName");
    Objects.requireNonNull(paramMap);
    return P4.m.o(s3.e.p((String)paramMap));
  }
  
  public final String m(int paramInt)
  {
    if (paramInt != -1)
    {
      if (paramInt != 0)
      {
        if (paramInt != 2) {
          return "failure";
        }
        return "throttled";
      }
      return "noFetchYet";
    }
    return "success";
  }
  
  public final String n(int paramInt)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2) {
        return "static";
      }
      return "remote";
    }
    return "default";
  }
  
  public final Map o(Map paramMap)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      t localt = (t)paramMap.get(str);
      Objects.requireNonNull(localt);
      localHashMap.put(str, g((t)localt));
    }
    return localHashMap;
  }
  
  public void onAttachedToEngine(a.b paramb)
  {
    p(paramb.b());
  }
  
  public void onDetachedFromEngine(a.b paramb)
  {
    q();
  }
  
  public void onMethodCall(E5.j paramj, k.d paramd)
  {
    P4.m localm = i((Map)paramj.b());
    Object localObject = a;
    ((String)localObject).hashCode();
    int i = ((String)localObject).hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1069772825: 
      if (((String)localObject).equals("RemoteConfig#setDefaults")) {
        j = 7;
      }
      break;
    case 198105259: 
      if (((String)localObject).equals("RemoteConfig#fetchAndActivate")) {
        j = 6;
      }
      break;
    case 120001542: 
      if (((String)localObject).equals("RemoteConfig#getAll")) {
        j = 5;
      }
      break;
    case 47629262: 
      if (((String)localObject).equals("RemoteConfig#activate")) {
        j = 4;
      }
      break;
    case 2948543: 
      if (((String)localObject).equals("RemoteConfig#fetch")) {
        j = 3;
      }
      break;
    case -824350930: 
      if (((String)localObject).equals("RemoteConfig#getProperties")) {
        j = 2;
      }
      break;
    case -967766516: 
      if (((String)localObject).equals("RemoteConfig#setConfigSettings")) {
        j = 1;
      }
      break;
    case -1145383109: 
      if (((String)localObject).equals("RemoteConfig#ensureInitialized")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      paramd.c();
      return;
    case 7: 
      paramj = (Map)paramj.a("defaults");
      Objects.requireNonNull(paramj);
      paramj = localm.z((Map)paramj);
      break;
    case 6: 
      paramj = localm.l();
      break;
    case 5: 
    case 4: 
    case 3: 
    case 2: 
      for (paramj = o(localm.m());; paramj = h(localm))
      {
        paramj = V2.m.e(paramj);
        break;
        paramj = localm.h();
        break;
        paramj = localm.k();
        break;
      }
    case 1: 
      localObject = (Integer)paramj.a("fetchTimeout");
      Objects.requireNonNull(localObject);
      j = ((Integer)localObject).intValue();
      paramj = (Integer)paramj.a("minimumFetchInterval");
      Objects.requireNonNull(paramj);
      i = paramj.intValue();
      paramj = localm.x(new s.b().d(j).e(i).c());
      break;
    case 0: 
      paramj = V2.m.g(new V2.j[] { localm.j() });
    }
    paramj.b(new c(paramd));
  }
  
  public final void p(E5.c paramc)
  {
    FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_remote_config", this);
    E5.k localk = new E5.k(paramc, "plugins.flutter.io/firebase_remote_config");
    a = localk;
    localk.e(this);
    paramc = new E5.d(paramc, "plugins.flutter.io/firebase_remote_config_updated");
    c = paramc;
    paramc.d(this);
  }
  
  public final void q()
  {
    a.e(null);
    a = null;
    c.d(null);
    c = null;
  }
  
  public class a
    implements P4.c
  {
    public a(d.b paramb) {}
    
    public void a(o paramo)
    {
      paramb.b("firebase_remote_config", paramo.getMessage(), null);
    }
    
    public void b(P4.b paramb)
    {
      paramb = new ArrayList(paramb.b());
      e.f(e.this).post(new d(paramb, paramb));
    }
  }
}

/* Location:
 * Qualified Name:     M5.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */