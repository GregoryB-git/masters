package O5;

import A5.a.b;
import E5.k.c;
import E5.k.d;
import E5.n;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import androidx.lifecycle.LiveData;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.T;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingBackgroundService;
import io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingReceiver;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import s3.e;

public class x
  implements FlutterFirebasePlugin, k.c, n, A5.a, B5.a
{
  public final HashMap a = new HashMap();
  public E5.k b;
  public Activity c;
  public final LiveData d = B.k();
  public androidx.lifecycle.m e;
  public final LiveData f = C.k();
  public androidx.lifecycle.m g;
  public T h;
  public Map i;
  public A j;
  
  private Map t(Exception paramException)
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
  
  private void x(E5.c paramc)
  {
    paramc = new E5.k(paramc, "plugins.flutter.io/firebase_messaging");
    b = paramc;
    paramc.e(this);
    j = new A();
    e = new o(this);
    g = new p(this);
    d.e(e);
    f.e(g);
    FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_messaging", this);
  }
  
  public final V2.j P()
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new s(this, localk));
    return localk.a();
  }
  
  public final V2.j Q(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new t(paramMap, localk));
    return localk.a();
  }
  
  public final V2.j R(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new k(this, paramMap, localk));
    return localk.a();
  }
  
  public final V2.j S(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new j(paramMap, localk));
    return localk.a();
  }
  
  public final V2.j T(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new l(paramMap, localk));
    return localk.a();
  }
  
  public final V2.j U(Map paramMap)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new i(paramMap, localk));
    return localk.a();
  }
  
  public V2.j didReinitializeFirebaseCore()
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new q(localk));
    return localk.a();
  }
  
  public V2.j getPluginConstantsForFirebaseApp(e parame)
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new g(parame, localk));
    return localk.a();
  }
  
  public void onAttachedToActivity(B5.c paramc)
  {
    paramc.g(this);
    paramc.e(j);
    paramc = paramc.c();
    c = paramc;
    if ((paramc.getIntent() != null) && (c.getIntent().getExtras() != null) && ((c.getIntent().getFlags() & 0x100000) != 1048576)) {
      onNewIntent(c.getIntent());
    }
  }
  
  public void onAttachedToEngine(a.b paramb)
  {
    x(paramb.b());
  }
  
  public void onDetachedFromActivity()
  {
    c = null;
  }
  
  public void onDetachedFromActivityForConfigChanges()
  {
    c = null;
  }
  
  public void onDetachedFromEngine(a.b paramb)
  {
    f.i(g);
    d.i(e);
  }
  
  public void onMethodCall(E5.j paramj, k.d paramd)
  {
    Object localObject = a;
    ((String)localObject).hashCode();
    int k = ((String)localObject).hashCode();
    int m = -1;
    switch (k)
    {
    default: 
      break;
    case 1459336962: 
      if (((String)localObject).equals("Messaging#getToken")) {
        m = 10;
      }
      break;
    case 1243856389: 
      if (((String)localObject).equals("Messaging#getNotificationSettings")) {
        m = 9;
      }
      break;
    case 1231338975: 
      if (((String)localObject).equals("Messaging#requestPermission")) {
        m = 8;
      }
      break;
    case 1165917248: 
      if (((String)localObject).equals("Messaging#sendMessage")) {
        m = 7;
      }
      break;
    case 928431066: 
      if (((String)localObject).equals("Messaging#startBackgroundIsolate")) {
        m = 6;
      }
      break;
    case 607887267: 
      if (((String)localObject).equals("Messaging#setDeliveryMetricsExportToBigQuery")) {
        m = 5;
      }
      break;
    case 506322569: 
      if (((String)localObject).equals("Messaging#subscribeToTopic")) {
        m = 4;
      }
      break;
    case 421314579: 
      if (((String)localObject).equals("Messaging#unsubscribeFromTopic")) {
        m = 3;
      }
      break;
    case -657665041: 
      if (((String)localObject).equals("Messaging#deleteToken")) {
        m = 2;
      }
      break;
    case -1661255137: 
      if (((String)localObject).equals("Messaging#setAutoInitEnabled")) {
        m = 1;
      }
      break;
    case -1704007366: 
      if (((String)localObject).equals("Messaging#getInitialMessage")) {
        m = 0;
      }
      break;
    }
    switch (m)
    {
    default: 
      paramd.c();
      return;
    case 10: 
      paramj = w();
      break;
    case 9: 
    case 8: 
      do
      {
        paramj = v();
        break;
      } while (Build.VERSION.SDK_INT < 33);
      paramj = P();
      break;
    case 7: 
      paramj = Q((Map)paramj.b());
      break;
    case 6: 
      localObject = (Map)b;
      paramj = ((Map)localObject).get("pluginCallbackHandle");
      localObject = ((Map)localObject).get("userCallbackHandle");
      long l1;
      if ((paramj instanceof Long))
      {
        l1 = ((Long)paramj).longValue();
      }
      else
      {
        if (!(paramj instanceof Integer)) {
          break label607;
        }
        l1 = ((Integer)paramj).intValue();
      }
      long l2;
      if ((localObject instanceof Long))
      {
        l2 = ((Long)localObject).longValue();
      }
      else
      {
        if (!(localObject instanceof Integer)) {
          break label596;
        }
        l2 = ((Integer)localObject).intValue();
      }
      paramj = c;
      if (paramj != null) {
        paramj = v5.j.a(paramj.getIntent());
      } else {
        paramj = null;
      }
      FlutterFirebaseMessagingBackgroundService.n(l1);
      FlutterFirebaseMessagingBackgroundService.o(l2);
      FlutterFirebaseMessagingBackgroundService.p(l1, paramj);
      paramj = V2.m.e(null);
      break;
      throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'userCallbackHandle'.");
      throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'pluginCallbackHandle'.");
    case 5: 
      paramj = S((Map)paramj.b());
      break;
    case 4: 
      paramj = T((Map)paramj.b());
      break;
    case 3: 
      paramj = U((Map)paramj.b());
      break;
    case 2: 
      paramj = s();
      break;
    case 1: 
      paramj = R((Map)paramj.b());
      break;
    case 0: 
      label596:
      label607:
      paramj = u();
    }
    paramj.b(new r(this, paramd));
  }
  
  public boolean onNewIntent(Intent paramIntent)
  {
    if (paramIntent.getExtras() == null) {
      return false;
    }
    Object localObject1 = paramIntent.getExtras().getString("google.message_id");
    Object localObject2 = localObject1;
    if (localObject1 == null) {
      localObject2 = paramIntent.getExtras().getString("message_id");
    }
    if (localObject2 == null) {
      return false;
    }
    localObject1 = (T)FlutterFirebaseMessagingReceiver.a.get(localObject2);
    if (localObject1 == null)
    {
      localMap = y.b().a((String)localObject2);
      if (localMap != null)
      {
        localObject1 = z.b(localMap);
        localMap = z.c(localMap);
        break label91;
      }
    }
    Map localMap = null;
    label91:
    if (localObject1 == null) {
      return false;
    }
    h = ((T)localObject1);
    i = localMap;
    FlutterFirebaseMessagingReceiver.a.remove(localObject2);
    localObject2 = z.f((T)localObject1);
    if (((T)localObject1).q() == null)
    {
      localObject1 = i;
      if (localObject1 != null) {
        ((Map)localObject2).put("notification", localObject1);
      }
    }
    b.c("Messaging#onMessageOpenedApp", localObject2);
    c.setIntent(paramIntent);
    return true;
  }
  
  public void onReattachedToActivityForConfigChanges(B5.c paramc)
  {
    paramc.g(this);
    c = paramc.c();
  }
  
  public final Boolean r()
  {
    boolean bool;
    if (a.a().checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return Boolean.valueOf(bool);
  }
  
  public final V2.j s()
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new v(localk));
    return localk.a();
  }
  
  public final V2.j u()
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new h(this, localk));
    return localk.a();
  }
  
  public final V2.j v()
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new w(this, localk));
    return localk.a();
  }
  
  public final V2.j w()
  {
    V2.k localk = new V2.k();
    FlutterFirebasePlugin.cachedThreadPool.execute(new u(this, localk));
    return localk.a();
  }
  
  public class a
    extends HashMap
  {
    public a(String paramString)
    {
      put("token", paramString);
    }
  }
  
  public class b
    extends HashMap
  {
    public b(FirebaseMessaging paramFirebaseMessaging)
    {
      put("isAutoInitEnabled", Boolean.valueOf(paramFirebaseMessaging.y()));
    }
  }
}

/* Location:
 * Qualified Name:     O5.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */