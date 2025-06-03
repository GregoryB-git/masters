package io.flutter.plugins.firebase.functions;

import android.net.Uri;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.crashlytics.b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import m6.j;
import o9.e;
import o9.f.a;
import o9.i.a;
import o9.m;
import o9.o;
import o9.p;
import t0.d;
import v5.n;

public class FlutterFirebaseFunctionsPlugin
  implements FlutterPlugin, FlutterFirebasePlugin, MethodChannel.MethodCallHandler
{
  private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/firebase_functions";
  private MethodChannel channel;
  
  private Map<String, Object> getExceptionDetails(Exception paramException)
  {
    HashMap localHashMap = new HashMap();
    if (paramException == null) {
      return localHashMap;
    }
    Object localObject1 = paramException.getMessage();
    Object localObject2 = null;
    boolean bool = paramException.getCause() instanceof o9.f;
    Object localObject3 = "UNAVAILABLE";
    if (bool)
    {
      o9.f localf = (o9.f)paramException.getCause();
      localObject1 = a.name();
      localObject2 = localf.getMessage();
      paramException = b;
      if (((localf.getCause() instanceof IOException)) && ("Canceled".equals(localf.getCause().getMessage()))) {}
      while (((localf.getCause() instanceof InterruptedIOException)) && ("timeout".equals(localf.getCause().getMessage())))
      {
        localObject2 = f.a.a;
        localObject2 = paramException;
        paramException = "DEADLINE_EXCEEDED";
        localObject3 = paramException;
        break;
      }
      if ((localf.getCause() instanceof IOException))
      {
        localObject2 = f.a.a;
        localObject2 = paramException;
        paramException = "UNAVAILABLE";
      }
      else
      {
        localObject3 = localObject1;
        localObject1 = paramException;
        paramException = (Exception)localObject2;
        localObject2 = localObject1;
      }
    }
    else
    {
      localObject3 = "UNKNOWN";
      paramException = (Exception)localObject1;
    }
    localHashMap.put("code", ((String)localObject3).replace("_", "-").toLowerCase());
    localHashMap.put("message", paramException);
    if (localObject2 != null) {
      localHashMap.put("additionalData", localObject2);
    }
    return localHashMap;
  }
  
  private e getFunctions(Map<String, Object> paramMap)
  {
    Object localObject = paramMap.get("appName");
    Objects.requireNonNull(localObject);
    localObject = (String)localObject;
    paramMap = paramMap.get("region");
    Objects.requireNonNull(paramMap);
    String str = (String)paramMap;
    localObject = u7.f.f((String)localObject);
    paramMap = e.j;
    o9.i locali = (o9.i)((u7.f)localObject).c(o9.i.class);
    j.j(locali, "Functions component does not exist.");
    try
    {
      localObject = (e)b.get(str);
      paramMap = (Map<String, Object>)localObject;
      if (localObject == null)
      {
        paramMap = a.a(str);
        b.put(str, paramMap);
      }
      ec.i.b(paramMap);
      return paramMap;
    }
    finally {}
  }
  
  private Task<Object> httpsFunctionCall(Map<String, Object> paramMap)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new d(this, paramMap, localTaskCompletionSource, 10));
    return localTaskCompletionSource.getTask();
  }
  
  private void lambda$httpsFunctionCall$0(Map paramMap, TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      Object localObject1 = getFunctions(paramMap);
      Object localObject2 = (String)paramMap.get("functionName");
      Object localObject3 = (String)paramMap.get("functionUri");
      Object localObject4 = (String)paramMap.get("origin");
      Object localObject5 = (Integer)paramMap.get("timeout");
      Object localObject6 = paramMap.get("limitedUseAppCheckToken");
      Objects.requireNonNull(localObject6);
      boolean bool = ((Boolean)localObject6).booleanValue();
      localObject6 = paramMap.get("parameters");
      if (localObject4 != null)
      {
        localObject4 = Uri.parse((String)localObject4);
        paramMap = ((Uri)localObject4).getHost();
        int i = ((Uri)localObject4).getPort();
        localObject1.getClass();
        ec.i.e(paramMap, "host");
        localObject4 = new v5/n;
        ((n)localObject4).<init>(paramMap, i);
        i = ((n)localObject4);
      }
      localObject4 = new o9/o;
      ((o)localObject4).<init>(bool);
      if (localObject2 != null)
      {
        localObject1.getClass();
        paramMap = new p3/f;
        localObject3 = new o9/m;
        ((m)localObject3).<init>((o)localObject4);
        paramMap.<init>((e)localObject1, (String)localObject2, (m)localObject3);
      }
      else
      {
        if (localObject3 == null) {
          break label315;
        }
        paramMap = new java/net/URL;
        paramMap.<init>((String)localObject3);
        localObject1.getClass();
        localObject2 = new o9/m;
        ((m)localObject2).<init>((o)localObject4);
        paramMap = new p3.f((e)localObject1, paramMap, (m)localObject2);
      }
      if (localObject5 != null)
      {
        long l = ((Integer)localObject5).longValue();
        localObject5 = TimeUnit.MILLISECONDS;
        ec.i.e(localObject5, "units");
        localObject1 = (m)e;
        localObject1.getClass();
        a = l;
        b = ((TimeUnit)localObject5);
      }
      paramTaskCompletionSource.setResult(awaitaa);
      return;
      label315:
      paramMap = new java/lang/IllegalArgumentException;
      paramMap.<init>("Either functionName or functionUri must be set");
      throw paramMap;
    }
    catch (Exception paramMap)
    {
      paramTaskCompletionSource.setException(paramMap);
    }
  }
  
  public Task<Void> didReinitializeFirebaseCore()
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new io.flutter.plugins.firebase.core.a(1, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
  
  public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(u7.f paramf)
  {
    paramf = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new b(3, paramf));
    return paramf.getTask();
  }
  
  public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    paramFlutterPluginBinding = new MethodChannel(paramFlutterPluginBinding.getBinaryMessenger(), "plugins.flutter.io/firebase_functions");
    channel = paramFlutterPluginBinding;
    paramFlutterPluginBinding.setMethodCallHandler(this);
  }
  
  public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    channel.setMethodCallHandler(null);
    channel = null;
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    if (!method.equals("FirebaseFunctions#call"))
    {
      paramResult.notImplemented();
      return;
    }
    httpsFunctionCall((Map)paramMethodCall.arguments()).addOnCompleteListener(new xa.a(this, paramResult, 1));
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.functions.FlutterFirebaseFunctionsPlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */