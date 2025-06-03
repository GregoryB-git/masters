package E1;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import x1.B;

public final class a
{
  public static final a a = new a();
  public static final String b = a.class.getCanonicalName();
  public static final AtomicBoolean c = new AtomicBoolean(false);
  public static Boolean d;
  public static Boolean e;
  public static ServiceConnection f;
  public static Application.ActivityLifecycleCallbacks g;
  public static Intent h;
  public static Object i;
  
  public static final void g()
  {
    a locala = a;
    locala.e();
    if (Intrinsics.a(d, Boolean.FALSE)) {
      return;
    }
    if (G1.i.c()) {
      locala.h();
    }
  }
  
  public final void e()
  {
    if (d != null) {
      return;
    }
    Object localObject = m.a("com.android.vending.billing.IInAppBillingService$Stub");
    boolean bool1 = false;
    if (localObject != null) {
      bool2 = true;
    } else {
      bool2 = false;
    }
    localObject = Boolean.valueOf(bool2);
    d = (Boolean)localObject;
    if (Intrinsics.a(localObject, Boolean.FALSE)) {
      return;
    }
    boolean bool2 = bool1;
    if (m.a("com.android.billingclient.api.ProxyBillingActivity") != null) {
      bool2 = true;
    }
    e = Boolean.valueOf(bool2);
    i.b();
    localObject = new Intent("com.android.vending.billing.InAppBillingService.BIND").setPackage("com.android.vending");
    Intrinsics.checkNotNullExpressionValue(localObject, "Intent(\"com.android.vending.billing.InAppBillingService.BIND\")\n            .setPackage(\"com.android.vending\")");
    h = (Intent)localObject;
    f = new a();
    g = new b();
  }
  
  public final void f(Context paramContext, ArrayList paramArrayList, boolean paramBoolean)
  {
    if (paramArrayList.isEmpty()) {
      return;
    }
    HashMap localHashMap = new HashMap();
    Object localObject1 = new ArrayList();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      String str = (String)paramArrayList.next();
      try
      {
        Object localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>(str);
        localObject2 = ((JSONObject)localObject2).getString("productId");
        Intrinsics.checkNotNullExpressionValue(localObject2, "sku");
        Intrinsics.checkNotNullExpressionValue(str, "purchase");
        localHashMap.put(localObject2, str);
        ((ArrayList)localObject1).add(localObject2);
      }
      catch (JSONException localJSONException)
      {
        Log.e(b, "Error parsing in-app purchase data.", localJSONException);
      }
    }
    paramArrayList = i.a;
    paramContext = i.k(paramContext, (ArrayList)localObject1, i, paramBoolean).entrySet().iterator();
    while (paramContext.hasNext())
    {
      paramArrayList = (Map.Entry)paramContext.next();
      localObject1 = (String)paramArrayList.getKey();
      paramArrayList = (String)paramArrayList.getValue();
      localObject1 = (String)localHashMap.get(localObject1);
      if (localObject1 != null) {
        G1.i.f((String)localObject1, paramArrayList, paramBoolean);
      }
    }
  }
  
  public final void h()
  {
    if (!c.compareAndSet(false, true)) {
      return;
    }
    Context localContext = B.l();
    if ((localContext instanceof Application))
    {
      Object localObject1 = (Application)localContext;
      Object localObject2 = g;
      if (localObject2 != null)
      {
        ((Application)localObject1).registerActivityLifecycleCallbacks((Application.ActivityLifecycleCallbacks)localObject2);
        localObject1 = h;
        if (localObject1 != null)
        {
          localObject2 = f;
          if (localObject2 != null)
          {
            localContext.bindService((Intent)localObject1, (ServiceConnection)localObject2, 1);
          }
          else
          {
            Intrinsics.n("serviceConnection");
            throw null;
          }
        }
        else
        {
          Intrinsics.n("intent");
          throw null;
        }
      }
      else
      {
        Intrinsics.n("callbacks");
        throw null;
      }
    }
  }
  
  public static final class a
    implements ServiceConnection
  {
    public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
    {
      Intrinsics.checkNotNullParameter(paramComponentName, "name");
      Intrinsics.checkNotNullParameter(paramIBinder, "service");
      paramComponentName = a.a;
      paramComponentName = i.a;
      a.d(i.a(B.l(), paramIBinder));
    }
    
    public void onServiceDisconnected(ComponentName paramComponentName)
    {
      Intrinsics.checkNotNullParameter(paramComponentName, "name");
    }
  }
  
  public static final class b
    implements Application.ActivityLifecycleCallbacks
  {
    public static final void c()
    {
      Context localContext = B.l();
      Object localObject = i.a;
      localObject = i.i(localContext, a.b());
      a locala = a.a;
      a.c(locala, localContext, (ArrayList)localObject, false);
      a.c(locala, localContext, i.j(localContext, a.b()), true);
    }
    
    public static final void d()
    {
      Context localContext = B.l();
      Object localObject = i.a;
      ArrayList localArrayList = i.i(localContext, a.b());
      localObject = localArrayList;
      if (localArrayList.isEmpty()) {
        localObject = i.g(localContext, a.b());
      }
      a.c(a.a, localContext, (ArrayList)localObject, false);
    }
    
    public void onActivityCreated(Activity paramActivity, Bundle paramBundle)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
    }
    
    public void onActivityDestroyed(Activity paramActivity)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
    }
    
    public void onActivityPaused(Activity paramActivity)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
    }
    
    public void onActivityResumed(Activity paramActivity)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
      try
      {
        Executor localExecutor = B.t();
        paramActivity = new E1/c;
        paramActivity.<init>();
        localExecutor.execute(paramActivity);
        return;
      }
      catch (Exception paramActivity)
      {
        for (;;) {}
      }
    }
    
    public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
      Intrinsics.checkNotNullParameter(paramBundle, "outState");
    }
    
    public void onActivityStarted(Activity paramActivity)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
    }
    
    public void onActivityStopped(Activity paramActivity)
    {
      Intrinsics.checkNotNullParameter(paramActivity, "activity");
      try
      {
        if ((Intrinsics.a(a.a(), Boolean.TRUE)) && (Intrinsics.a(paramActivity.getLocalClassName(), "com.android.billingclient.api.ProxyBillingActivity")))
        {
          Executor localExecutor = B.t();
          paramActivity = new E1/b;
          paramActivity.<init>();
          localExecutor.execute(paramActivity);
        }
        return;
      }
      catch (Exception paramActivity)
      {
        for (;;) {}
      }
    }
  }
}

/* Location:
 * Qualified Name:     E1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */