package io.flutter.plugins.firebase.crashlytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import j8.n;
import j8.s;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import k8.i;
import v3.x0;
import x0.g;

public class FlutterFirebaseCrashlyticsPlugin
  implements FlutterFirebasePlugin, FlutterPlugin, MethodChannel.MethodCallHandler
{
  private static final String FIREBASE_CRASHLYTICS_COLLECTION_ENABLED = "firebase_crashlytics_collection_enabled";
  public static final String TAG = "FLTFirebaseCrashlytics";
  private MethodChannel channel;
  
  private Task<Map<String, Object>> checkForUnsentReports()
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new g.q(27, this, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
  
  private void crash()
  {
    new Handler(Looper.myLooper()).postDelayed(new e(), 50L);
  }
  
  private Task<Void> deleteUnsentReports()
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new b(0, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
  
  private Task<Map<String, Object>> didCrashOnPreviousExecution()
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new x0.f(27, this, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
  
  private StackTraceElement generateStackTraceElement(Map<String, String> paramMap)
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
  
  private SharedPreferences getCrashlyticsSharedPrefs(Context paramContext)
  {
    return paramContext.getSharedPreferences("com.google.firebase.crashlytics", 0);
  }
  
  private void initInstance(BinaryMessenger paramBinaryMessenger)
  {
    paramBinaryMessenger = new MethodChannel(paramBinaryMessenger, "plugins.flutter.io/firebase_crashlytics");
    channel = paramBinaryMessenger;
    paramBinaryMessenger.setMethodCallHandler(this);
    FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_crashlytics", this);
  }
  
  private boolean isCrashlyticsCollectionEnabled(u7.f paramf)
  {
    paramf.a();
    SharedPreferences localSharedPreferences = getCrashlyticsSharedPrefs(a);
    boolean bool;
    if (localSharedPreferences.contains("firebase_crashlytics_collection_enabled"))
    {
      bool = localSharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true);
    }
    else
    {
      paramf.a();
      paramf = readCrashlyticsDataCollectionEnabledFromManifest(a);
      f8.c.a().c(paramf);
      bool = paramf.booleanValue();
    }
    return bool;
  }
  
  private void lambda$checkForUnsentReports$0(TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      Object localObject = aa.h;
      if (!s.compareAndSet(false, true))
      {
        Log.w("FirebaseCrashlytics", "checkForUnsentReports should only be called once per execution.", null);
        localObject = Tasks.forResult(Boolean.FALSE);
      }
      else
      {
        localObject = p.getTask();
      }
      boolean bool = ((Boolean)Tasks.await((Task)localObject)).booleanValue();
      localObject = new io/flutter/plugins/firebase/crashlytics/FlutterFirebaseCrashlyticsPlugin$1;
      ((1)localObject).<init>(this, bool);
      paramTaskCompletionSource.setResult(localObject);
    }
    catch (Exception localException)
    {
      paramTaskCompletionSource.setException(localException);
    }
  }
  
  private static void lambda$deleteUnsentReports$2(TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      n localn = aa.h;
      q.trySetResult(Boolean.FALSE);
      r.getTask();
      paramTaskCompletionSource.setResult(null);
    }
    catch (Exception localException)
    {
      paramTaskCompletionSource.setException(localException);
    }
  }
  
  private void lambda$didCrashOnPreviousExecution$3(TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      boolean bool = aa.g;
      HashMap local2 = new io/flutter/plugins/firebase/crashlytics/FlutterFirebaseCrashlyticsPlugin$2;
      local2.<init>(this, bool);
      paramTaskCompletionSource.setResult(local2);
    }
    catch (Exception localException)
    {
      paramTaskCompletionSource.setException(localException);
    }
  }
  
  private static void lambda$log$5(Map paramMap, TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      paramMap = paramMap.get("message");
      Objects.requireNonNull(paramMap);
      String str = (String)paramMap;
      s locals = aa;
      locals.getClass();
      long l1 = System.currentTimeMillis();
      long l2 = d;
      paramMap = p.a;
      j8.q localq = new j8/q;
      localq.<init>(locals, l1 - l2, str);
      paramMap.a(localq);
      paramTaskCompletionSource.setResult(null);
    }
    catch (Exception paramMap)
    {
      paramTaskCompletionSource.setException(paramMap);
    }
  }
  
  private void lambda$recordError$4(Map paramMap, TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      f8.c localc = f8.c.a();
      Object localObject1 = paramMap.get("exception");
      Objects.requireNonNull(localObject1);
      Object localObject2 = (String)localObject1;
      Object localObject3 = (String)paramMap.get("reason");
      localObject1 = paramMap.get("information");
      Objects.requireNonNull(localObject1);
      String str = (String)localObject1;
      localObject1 = paramMap.get("fatal");
      Objects.requireNonNull(localObject1);
      boolean bool = ((Boolean)localObject1).booleanValue();
      localObject1 = paramMap.get("buildId");
      Objects.requireNonNull(localObject1);
      localObject1 = (String)localObject1;
      Object localObject4 = paramMap.get("loadingUnits");
      Objects.requireNonNull(localObject4);
      localObject4 = (List)localObject4;
      Object localObject5;
      Object localObject6;
      if (((String)localObject1).length() > 0)
      {
        localObject5 = aa;
        localObject6 = p.a;
        localObject7 = new x0/g;
        ((g)localObject7).<init>(localObject5, "com.crashlytics.flutter.build-id.0", localObject1, 7);
        ((k8.b)localObject6).a((Runnable)localObject7);
      }
      localObject4 = ((List)localObject4).iterator();
      int i = 0;
      while (((Iterator)localObject4).hasNext())
      {
        localObject1 = (String)((Iterator)localObject4).next();
        i++;
        localObject7 = aa;
        localObject6 = new java/lang/StringBuilder;
        ((StringBuilder)localObject6).<init>();
        ((StringBuilder)localObject6).append("com.crashlytics.flutter.build-id.");
        ((StringBuilder)localObject6).append(i);
        localObject5 = ((StringBuilder)localObject6).toString();
        k8.b localb = p.a;
        localObject6 = new x0/g;
        ((g)localObject6).<init>(localObject7, localObject5, localObject1, 7);
        localb.a((Runnable)localObject6);
      }
      if (localObject3 != null)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("thrown ");
        ((StringBuilder)localObject1).append((String)localObject3);
        localObject6 = ((StringBuilder)localObject1).toString();
        localObject4 = a;
        localObject7 = p.a;
        localObject1 = new t0/d;
        ((t0.d)localObject1).<init>(localObject4, "flutter_error_reason", localObject6, 4);
        ((k8.b)localObject7).a((Runnable)localObject1);
        localObject1 = new io/flutter/plugins/firebase/crashlytics/FlutterError;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>();
        ((StringBuilder)localObject4).append((String)localObject2);
        ((StringBuilder)localObject4).append(". Error thrown ");
        ((StringBuilder)localObject4).append((String)localObject3);
        ((StringBuilder)localObject4).append(".");
        ((FlutterError)localObject1).<init>(((StringBuilder)localObject4).toString());
      }
      else
      {
        localObject1 = new FlutterError((String)localObject2);
      }
      localObject4 = a;
      Object localObject7 = p.a;
      localObject3 = new t0/d;
      ((t0.d)localObject3).<init>(localObject4, "flutter_error_exception", localObject2, 4);
      ((k8.b)localObject7).a((Runnable)localObject3);
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      paramMap = paramMap.get("stackTraceElements");
      Objects.requireNonNull(paramMap);
      paramMap = ((List)paramMap).iterator();
      for (;;)
      {
        if (paramMap.hasNext()) {
          localObject3 = (Map)paramMap.next();
        }
        try
        {
          localObject3 = generateStackTraceElement((Map)localObject3);
          if (localObject3 != null) {
            ((ArrayList)localObject2).add(localObject3);
          }
        }
        catch (Exception paramMap)
        {
          long l1;
          long l2;
          break label702;
        }
      }
      ((Throwable)localObject1).setStackTrace((StackTraceElement[])((ArrayList)localObject2).toArray(new StackTraceElement[0]));
      if (!str.isEmpty())
      {
        localObject2 = a;
        localObject2.getClass();
        l1 = System.currentTimeMillis();
        l2 = d;
        localObject3 = p.a;
        paramMap = new j8/q;
        paramMap.<init>((s)localObject2, l1 - l2, str);
        ((k8.b)localObject3).a(paramMap);
      }
      if (bool) {
        x6.b.n0((FlutterError)localObject1);
      } else {
        localc.b((Exception)localObject1);
      }
      paramTaskCompletionSource.setResult(null);
    }
    catch (Exception paramMap) {}
    label702:
    paramTaskCompletionSource.setException(paramMap);
  }
  
  private static void lambda$sendUnsentReports$6(TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      n localn = aa.h;
      q.trySetResult(Boolean.TRUE);
      r.getTask();
      paramTaskCompletionSource.setResult(null);
    }
    catch (Exception localException)
    {
      paramTaskCompletionSource.setException(localException);
    }
  }
  
  private static void lambda$setCustomKey$9(Map paramMap, TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      Object localObject = paramMap.get("key");
      Objects.requireNonNull(localObject);
      localObject = (String)localObject;
      paramMap = paramMap.get("value");
      Objects.requireNonNull(paramMap);
      String str = (String)paramMap;
      paramMap = aa;
      k8.b localb = p.a;
      t0.d locald = new t0/d;
      locald.<init>(paramMap, localObject, str, 4);
      localb.a(locald);
      paramTaskCompletionSource.setResult(null);
    }
    catch (Exception paramMap)
    {
      paramTaskCompletionSource.setException(paramMap);
    }
  }
  
  private static void lambda$setUserIdentifier$8(Map paramMap, TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      paramMap = paramMap.get("identifier");
      Objects.requireNonNull(paramMap);
      String str = (String)paramMap;
      s locals = aa;
      k8.b localb = p.a;
      paramMap = new x0/f;
      paramMap.<init>(15, locals, str);
      localb.a(paramMap);
      paramTaskCompletionSource.setResult(null);
    }
    catch (Exception paramMap)
    {
      paramTaskCompletionSource.setException(paramMap);
    }
  }
  
  private Task<Void> log(Map<String, Object> paramMap)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new c(paramMap, localTaskCompletionSource, 0));
    return localTaskCompletionSource.getTask();
  }
  
  private static Boolean readCrashlyticsDataCollectionEnabledFromManifest(Context paramContext)
  {
    try
    {
      Object localObject = paramContext.getPackageManager();
      if (localObject != null)
      {
        paramContext = ((PackageManager)localObject).getApplicationInfo(paramContext.getPackageName(), 128);
        if (paramContext != null)
        {
          localObject = metaData;
          if ((localObject != null) && (((BaseBundle)localObject).containsKey("firebase_crashlytics_collection_enabled")))
          {
            boolean bool = metaData.getBoolean("firebase_crashlytics_collection_enabled");
            return Boolean.valueOf(bool);
          }
        }
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", paramContext);
    }
    return Boolean.TRUE;
  }
  
  private Task<Void> recordError(Map<String, Object> paramMap)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new x0(this, paramMap, localTaskCompletionSource, 11));
    return localTaskCompletionSource.getTask();
  }
  
  private Task<Void> sendUnsentReports()
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new b(1, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
  
  private Task<Map<String, Object>> setCrashlyticsCollectionEnabled(Map<String, Object> paramMap)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new g(this, paramMap, localTaskCompletionSource, 13));
    return localTaskCompletionSource.getTask();
  }
  
  private Task<Void> setCustomKey(Map<String, Object> paramMap)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new a(paramMap, localTaskCompletionSource, 1));
    return localTaskCompletionSource.getTask();
  }
  
  private Task<Void> setUserIdentifier(Map<String, Object> paramMap)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new a(paramMap, localTaskCompletionSource, 0));
    return localTaskCompletionSource.getTask();
  }
  
  public Task<Void> didReinitializeFirebaseCore()
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new io.flutter.plugins.firebase.analytics.e(1, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
  
  public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(u7.f paramf)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new t0.d(this, localTaskCompletionSource, paramf, 7));
    return localTaskCompletionSource.getTask();
  }
  
  public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    initInstance(paramFlutterPluginBinding.getBinaryMessenger());
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
      paramResult.notImplemented();
      return;
    case 9: 
      crash();
      return;
    case 8: 
      paramMethodCall = setUserIdentifier((Map)paramMethodCall.arguments());
      break;
    case 7: 
      paramMethodCall = deleteUnsentReports();
      break;
    case 6: 
      paramMethodCall = setCustomKey((Map)paramMethodCall.arguments());
      break;
    case 5: 
      paramMethodCall = log((Map)paramMethodCall.arguments());
      break;
    case 4: 
      paramMethodCall = setCrashlyticsCollectionEnabled((Map)paramMethodCall.arguments());
      break;
    case 3: 
      paramMethodCall = sendUnsentReports();
      break;
    case 2: 
      paramMethodCall = checkForUnsentReports();
      break;
    case 1: 
      paramMethodCall = recordError((Map)paramMethodCall.arguments());
      break;
    case 0: 
      paramMethodCall = didCrashOnPreviousExecution();
    }
    paramMethodCall.addOnCompleteListener(new d(0, paramResult));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */