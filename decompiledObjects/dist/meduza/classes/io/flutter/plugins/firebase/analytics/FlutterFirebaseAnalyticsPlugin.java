package io.flutter.plugins.firebase.analytics;

import aa.m0;
import android.content.Context;
import android.os.BaseBundle;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzed;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import g.q;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import w.g;

public class FlutterFirebaseAnalyticsPlugin
  implements FlutterFirebasePlugin, MethodChannel.MethodCallHandler, FlutterPlugin
{
  private FirebaseAnalytics analytics;
  private MethodChannel channel;
  
  private static Bundle createBundleFromMap(Map<String, Object> paramMap)
  {
    if (paramMap == null) {
      return null;
    }
    Bundle localBundle = new Bundle();
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Object localObject1 = (Map.Entry)paramMap.next();
      Object localObject2 = ((Map.Entry)localObject1).getValue();
      localObject1 = (String)((Map.Entry)localObject1).getKey();
      if ((localObject2 instanceof String))
      {
        localBundle.putString((String)localObject1, (String)localObject2);
      }
      else
      {
        long l;
        if ((localObject2 instanceof Integer))
        {
          l = ((Integer)localObject2).intValue();
        }
        else
        {
          if (!(localObject2 instanceof Long)) {
            break label127;
          }
          l = ((Long)localObject2).longValue();
        }
        localBundle.putLong((String)localObject1, l);
        continue;
        label127:
        if ((localObject2 instanceof Double))
        {
          localBundle.putDouble((String)localObject1, ((Double)localObject2).doubleValue());
        }
        else if ((localObject2 instanceof Boolean))
        {
          localBundle.putBoolean((String)localObject1, ((Boolean)localObject2).booleanValue());
        }
        else if (localObject2 == null)
        {
          localBundle.putString((String)localObject1, null);
        }
        else if ((localObject2 instanceof Iterable))
        {
          ArrayList localArrayList = new ArrayList();
          Iterator localIterator = ((Iterable)localObject2).iterator();
          while (localIterator.hasNext())
          {
            localObject2 = localIterator.next();
            if ((localObject2 instanceof Map))
            {
              localArrayList.add(createBundleFromMap((Map)localObject2));
            }
            else
            {
              paramMap = f.l("Unsupported value type: ");
              paramMap.append(localObject2.getClass().getCanonicalName());
              paramMap.append(" in list at key ");
              paramMap.append((String)localObject1);
              throw new IllegalArgumentException(paramMap.toString());
            }
          }
          localBundle.putParcelableArrayList((String)localObject1, localArrayList);
        }
        else if ((localObject2 instanceof Map))
        {
          localBundle.putParcelable((String)localObject1, createBundleFromMap((Map)localObject2));
        }
        else
        {
          paramMap = f.l("Unsupported value type: ");
          paramMap.append(localObject2.getClass().getCanonicalName());
          throw new IllegalArgumentException(paramMap.toString());
        }
      }
    }
    return localBundle;
  }
  
  private Task<String> handleGetAppInstanceId()
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new c(this, localTaskCompletionSource, 0));
    return localTaskCompletionSource.getTask();
  }
  
  private Task<Long> handleGetSessionId()
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new g(27, this, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
  
  private Task<Void> handleLogEvent(Map<String, Object> paramMap)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new d(this, paramMap, localTaskCompletionSource, 1));
    return localTaskCompletionSource.getTask();
  }
  
  private Task<Void> handleResetAnalyticsData()
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new q(26, this, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
  
  private Task<Void> handleSetAnalyticsCollectionEnabled(Map<String, Object> paramMap)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new b(this, paramMap, localTaskCompletionSource, 2));
    return localTaskCompletionSource.getTask();
  }
  
  private Task<Void> handleSetSessionTimeoutDuration(Map<String, Object> paramMap)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new b(this, paramMap, localTaskCompletionSource, 0));
    return localTaskCompletionSource.getTask();
  }
  
  private Task<Void> handleSetUserId(Map<String, Object> paramMap)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new a(this, paramMap, localTaskCompletionSource, 0));
    return localTaskCompletionSource.getTask();
  }
  
  private Task<Void> handleSetUserProperty(Map<String, Object> paramMap)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new d(this, paramMap, localTaskCompletionSource, 0));
    return localTaskCompletionSource.getTask();
  }
  
  private void initInstance(BinaryMessenger paramBinaryMessenger, Context paramContext)
  {
    analytics = FirebaseAnalytics.getInstance(paramContext);
    paramBinaryMessenger = new MethodChannel(paramBinaryMessenger, "plugins.flutter.io/firebase_analytics");
    channel = paramBinaryMessenger;
    paramBinaryMessenger.setMethodCallHandler(this);
    FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_analytics", this);
  }
  
  private void lambda$handleGetAppInstanceId$10(TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      FirebaseAnalytics localFirebaseAnalytics = analytics;
      localFirebaseAnalytics.getClass();
      Task localTask;
      try
      {
        Object localObject = localFirebaseAnalytics.b();
        v7.a locala = new v7/a;
        locala.<init>(localFirebaseAnalytics);
        localObject = Tasks.call((Executor)localObject, locala);
      }
      catch (RuntimeException localRuntimeException)
      {
        a.zza(5, "Failed to schedule task for getAppInstanceId", null, null, null);
        localTask = Tasks.forException(localRuntimeException);
      }
      paramTaskCompletionSource.setResult((String)Tasks.await(localTask));
    }
    catch (Exception localException)
    {
      paramTaskCompletionSource.setException(localException);
    }
  }
  
  private void lambda$handleGetSessionId$1(TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      FirebaseAnalytics localFirebaseAnalytics = analytics;
      localFirebaseAnalytics.getClass();
      Task localTask;
      try
      {
        Object localObject = localFirebaseAnalytics.b();
        v7.d locald = new v7/d;
        locald.<init>(localFirebaseAnalytics);
        localObject = Tasks.call((Executor)localObject, locald);
      }
      catch (RuntimeException localRuntimeException)
      {
        a.zza(5, "Failed to schedule task for getSessionId", null, null, null);
        localTask = Tasks.forException(localRuntimeException);
      }
      paramTaskCompletionSource.setResult((Long)Tasks.await(localTask));
    }
    catch (Exception localException)
    {
      paramTaskCompletionSource.setException(localException);
    }
  }
  
  private void lambda$handleLogEvent$2(Map paramMap, TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      Object localObject = paramMap.get("eventName");
      Objects.requireNonNull(localObject);
      localObject = (String)localObject;
      paramMap = createBundleFromMap((Map)paramMap.get("parameters"));
      analytics.a.zza((String)localObject, paramMap);
      paramTaskCompletionSource.setResult(null);
    }
    catch (Exception paramMap)
    {
      paramTaskCompletionSource.setException(paramMap);
    }
  }
  
  private void lambda$handleResetAnalyticsData$7(TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      analytics.a.zzj();
      paramTaskCompletionSource.setResult(null);
    }
    catch (Exception localException)
    {
      paramTaskCompletionSource.setException(localException);
    }
  }
  
  private void lambda$handleSetAnalyticsCollectionEnabled$4(Map paramMap, TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      paramMap = paramMap.get("enabled");
      Objects.requireNonNull(paramMap);
      Boolean localBoolean = (Boolean)paramMap;
      paramMap = analytics;
      boolean bool = localBoolean.booleanValue();
      a.zza(Boolean.valueOf(bool));
      paramTaskCompletionSource.setResult(null);
    }
    catch (Exception paramMap)
    {
      paramTaskCompletionSource.setException(paramMap);
    }
  }
  
  private void lambda$handleSetSessionTimeoutDuration$5(Map paramMap, TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      paramMap = paramMap.get("milliseconds");
      Objects.requireNonNull(paramMap);
      paramMap = (Integer)paramMap;
      FirebaseAnalytics localFirebaseAnalytics = analytics;
      long l = paramMap.intValue();
      a.zza(l);
      paramTaskCompletionSource.setResult(null);
    }
    catch (Exception paramMap)
    {
      paramTaskCompletionSource.setException(paramMap);
    }
  }
  
  private void lambda$handleSetUserId$3(Map paramMap, TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      paramMap = (String)paramMap.get("userId");
      analytics.a.zzd(paramMap);
      paramTaskCompletionSource.setResult(null);
    }
    catch (Exception paramMap)
    {
      paramTaskCompletionSource.setException(paramMap);
    }
  }
  
  private void lambda$handleSetUserProperty$6(Map paramMap, TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      Object localObject = paramMap.get("name");
      Objects.requireNonNull(localObject);
      localObject = (String)localObject;
      paramMap = (String)paramMap.get("value");
      analytics.a.zzb((String)localObject, paramMap);
      paramTaskCompletionSource.setResult(null);
    }
    catch (Exception paramMap)
    {
      paramTaskCompletionSource.setException(paramMap);
    }
  }
  
  private void lambda$setDefaultEventParameters$9(Map paramMap, TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      FirebaseAnalytics localFirebaseAnalytics = analytics;
      Bundle localBundle = createBundleFromMap(paramMap);
      paramMap = localBundle;
      if (localBundle != null)
      {
        localFirebaseAnalytics.getClass();
        paramMap = new android/os/Bundle;
        paramMap.<init>(localBundle);
      }
      a.zzd(paramMap);
      paramTaskCompletionSource.setResult(null);
    }
    catch (Exception paramMap)
    {
      paramTaskCompletionSource.setException(paramMap);
    }
  }
  
  private Task<Void> setConsent(Map<String, Object> paramMap)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new a(this, paramMap, localTaskCompletionSource, 1));
    return localTaskCompletionSource.getTask();
  }
  
  private Task<Void> setDefaultEventParameters(Map<String, Object> paramMap)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new b(this, paramMap, localTaskCompletionSource, 1));
    return localTaskCompletionSource.getTask();
  }
  
  public Task<Void> didReinitializeFirebaseCore()
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new e(0, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
  
  public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(u7.f paramf)
  {
    paramf = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new c(this, paramf, 1));
    return paramf.getTask();
  }
  
  public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    initInstance(paramFlutterPluginBinding.getBinaryMessenger(), paramFlutterPluginBinding.getApplicationContext());
  }
  
  public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    paramFlutterPluginBinding = channel;
    if (paramFlutterPluginBinding != null)
    {
      paramFlutterPluginBinding.setMethodCallHandler(null);
      channel = null;
    }
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    String str = method;
    str.getClass();
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
      paramResult.notImplemented();
      return;
    case 9: 
      paramMethodCall = handleSetUserId((Map)paramMethodCall.arguments());
      break;
    case 8: 
      paramMethodCall = handleSetSessionTimeoutDuration((Map)paramMethodCall.arguments());
      break;
    case 7: 
      paramMethodCall = handleSetUserProperty((Map)paramMethodCall.arguments());
      break;
    case 6: 
      paramMethodCall = handleGetSessionId();
      break;
    case 5: 
      paramMethodCall = handleLogEvent((Map)paramMethodCall.arguments());
      break;
    case 4: 
      paramMethodCall = setDefaultEventParameters((Map)paramMethodCall.arguments());
      break;
    case 3: 
      paramMethodCall = handleSetAnalyticsCollectionEnabled((Map)paramMethodCall.arguments());
      break;
    case 2: 
      paramMethodCall = setConsent((Map)paramMethodCall.arguments());
      break;
    case 1: 
      paramMethodCall = handleResetAnalyticsData();
      break;
    case 0: 
      paramMethodCall = handleGetAppInstanceId();
    }
    paramMethodCall.addOnCompleteListener(new m0(paramResult, 1));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */