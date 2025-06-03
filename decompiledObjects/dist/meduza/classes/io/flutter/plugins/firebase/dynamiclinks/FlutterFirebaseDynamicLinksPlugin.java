package io.flutter.plugins.firebase.dynamiclinks;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodChannel.MethodCallHandler;
import io.flutter.plugin.common.MethodChannel.Result;
import io.flutter.plugin.common.PluginRegistry.NewIntentListener;
import io.flutter.plugins.firebase.analytics.e;
import io.flutter.plugins.firebase.auth.g;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import m6.j;
import u7.f;
import v8.d.a;

public class FlutterFirebaseDynamicLinksPlugin
  implements FlutterFirebasePlugin, FlutterPlugin, ActivityAware, MethodChannel.MethodCallHandler, PluginRegistry.NewIntentListener
{
  private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/firebase_dynamic_links";
  private static final String TAG = "FLTFirebaseDynamicLinks";
  private final AtomicReference<Activity> activity = new AtomicReference(null);
  private Map<String, Object> cachedDynamicLinkData;
  private Map<String, Object> cachedDynamicLinkException;
  private MethodChannel channel;
  
  private String buildLink(Map<String, Object> paramMap)
  {
    paramMap = setupParameters(paramMap);
    com.google.firebase.dynamiclinks.internal.b.d(b);
    Object localObject1 = b;
    com.google.firebase.dynamiclinks.internal.b.d((Bundle)localObject1);
    Object localObject2 = (Uri)((Bundle)localObject1).getParcelable("dynamicLink");
    paramMap = (Map<String, Object>)localObject2;
    if (localObject2 == null)
    {
      paramMap = new Uri.Builder();
      localObject2 = ((BaseBundle)localObject1).getString("domainUriPrefix");
      j.i(localObject2);
      localObject2 = Uri.parse((String)localObject2);
      paramMap.scheme(((Uri)localObject2).getScheme());
      paramMap.authority(((Uri)localObject2).getAuthority());
      paramMap.path(((Uri)localObject2).getPath());
      Bundle localBundle = ((Bundle)localObject1).getBundle("parameters");
      if (localBundle != null)
      {
        localObject1 = localBundle.keySet().iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (String)((Iterator)localObject1).next();
          Object localObject3 = localBundle.get((String)localObject2);
          if (localObject3 != null) {
            paramMap.appendQueryParameter((String)localObject2, localObject3.toString());
          }
        }
      }
      paramMap = paramMap.build();
    }
    return paramMap.toString();
  }
  
  private Task<Map<String, Object>> buildShortLink(Map<String, Object> paramMap)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new x0.d(this, paramMap, localTaskCompletionSource, 6));
    return localTaskCompletionSource.getTask();
  }
  
  private void checkForCachedData()
  {
    Map localMap = cachedDynamicLinkData;
    if (localMap != null)
    {
      channel.invokeMethod("FirebaseDynamicLink#onLinkSuccess", localMap);
      cachedDynamicLinkData = null;
    }
    localMap = cachedDynamicLinkException;
    if (localMap != null)
    {
      channel.invokeMethod("FirebaseDynamicLink#onLinkError", localMap);
      cachedDynamicLinkException = null;
    }
  }
  
  private void detachToActivity()
  {
    activity.set(null);
  }
  
  private Task<Map<String, Object>> getDynamicLink(v8.b paramb, String paramString)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new p3.a(this, paramString, paramb, localTaskCompletionSource, 2));
    return localTaskCompletionSource.getTask();
  }
  
  /* Error */
  public static v8.b getDynamicLinkInstance(Map<String, Object> paramMap)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +52 -> 53
    //   4: aload_0
    //   5: ldc -6
    //   7: invokeinterface 255 2 0
    //   12: checkcast 149	java/lang/String
    //   15: astore_0
    //   16: aload_0
    //   17: ifnull +36 -> 53
    //   20: aload_0
    //   21: invokestatic 260	u7/f:f	(Ljava/lang/String;)Lu7/f;
    //   24: astore_0
    //   25: ldc_w 262
    //   28: monitorenter
    //   29: aload_0
    //   30: ldc_w 262
    //   33: invokevirtual 265	u7/f:c	(Ljava/lang/Class;)Ljava/lang/Object;
    //   36: checkcast 262	v8/b
    //   39: astore_0
    //   40: ldc_w 262
    //   43: monitorexit
    //   44: aload_0
    //   45: areturn
    //   46: astore_0
    //   47: ldc_w 262
    //   50: monitorexit
    //   51: aload_0
    //   52: athrow
    //   53: ldc_w 262
    //   56: monitorenter
    //   57: invokestatic 268	u7/f:e	()Lu7/f;
    //   60: astore_0
    //   61: ldc_w 262
    //   64: monitorenter
    //   65: aload_0
    //   66: ldc_w 262
    //   69: invokevirtual 265	u7/f:c	(Ljava/lang/Class;)Ljava/lang/Object;
    //   72: checkcast 262	v8/b
    //   75: astore_0
    //   76: ldc_w 262
    //   79: monitorexit
    //   80: ldc_w 262
    //   83: monitorexit
    //   84: aload_0
    //   85: areturn
    //   86: astore_0
    //   87: ldc_w 262
    //   90: monitorexit
    //   91: aload_0
    //   92: athrow
    //   93: astore_0
    //   94: ldc_w 262
    //   97: monitorexit
    //   98: aload_0
    //   99: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	100	0	paramMap	Map<String, Object>
    // Exception table:
    //   from	to	target	type
    //   29	40	46	finally
    //   65	76	86	finally
    //   57	65	93	finally
    //   76	80	93	finally
    //   87	93	93	finally
  }
  
  private void initInstance(BinaryMessenger paramBinaryMessenger)
  {
    paramBinaryMessenger = new MethodChannel(paramBinaryMessenger, "plugins.flutter.io/firebase_dynamic_links");
    channel = paramBinaryMessenger;
    paramBinaryMessenger.setMethodCallHandler(this);
    FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_dynamic_links", this);
    checkForCachedData();
  }
  
  private void lambda$buildShortLink$3(Map paramMap, TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      Object localObject1 = setupParameters(paramMap);
      Object localObject2 = (String)paramMap.get("longDynamicLink");
      if (localObject2 != null)
      {
        localObject2 = Uri.parse((String)localObject2);
        b.putParcelable("dynamicLink", (Parcelable)localObject2);
      }
      localObject2 = Integer.valueOf(1);
      Object localObject3 = (Integer)paramMap.get("shortLinkType");
      paramMap = (Map)localObject2;
      if (localObject3 != null)
      {
        int i = ((Integer)localObject3).intValue();
        if (i != 0)
        {
          if (i != 1) {
            paramMap = (Map)localObject2;
          } else {
            paramMap = Integer.valueOf(2);
          }
        }
        else {
          paramMap = Integer.valueOf(1);
        }
      }
      localObject2 = new java/util/HashMap;
      ((HashMap)localObject2).<init>();
      localObject1 = (v8.d)Tasks.await(((v8.a)localObject1).a(paramMap.intValue()));
      localObject3 = new java/util/ArrayList;
      ((ArrayList)localObject3).<init>();
      paramMap = ((v8.d)localObject1).x().iterator();
      while (paramMap.hasNext()) {
        ((ArrayList)localObject3).add(((d.a)paramMap.next()).i());
      }
      ((HashMap)localObject2).put("url", ((v8.d)localObject1).y().toString());
      ((HashMap)localObject2).put("warnings", localObject3);
      ((HashMap)localObject2).put("previewLink", ((v8.d)localObject1).p().toString());
      paramTaskCompletionSource.setResult(localObject2);
    }
    catch (Exception paramMap)
    {
      paramTaskCompletionSource.setException(paramMap);
    }
  }
  
  private v8.a setupParameters(Map<String, Object> paramMap)
  {
    v8.a locala = getDynamicLinkInstance(paramMap).a();
    Object localObject1 = paramMap.get("uriPrefix");
    Objects.requireNonNull(localObject1);
    Object localObject2 = (String)localObject1;
    localObject1 = (String)paramMap.get("link");
    locala.getClass();
    if ((((String)localObject2).matches("(https:\\/\\/)?[a-z0-9]{3,}\\.app\\.goo\\.gl$")) || (((String)localObject2).matches("(https:\\/\\/)?[a-z0-9]{3,}\\.page\\.link$"))) {
      b.putString("domain", ((String)localObject2).replace("https://", ""));
    }
    b.putString("domainUriPrefix", (String)localObject2);
    localObject1 = Uri.parse((String)localObject1);
    c.putParcelable("link", (Parcelable)localObject1);
    Object localObject3 = (Map)paramMap.get("androidParameters");
    Object localObject4;
    if (localObject3 != null)
    {
      localObject1 = (String)valueFor("packageName", (Map)localObject3);
      localObject2 = (String)valueFor("fallbackUrl", (Map)localObject3);
      localObject3 = (Integer)valueFor("minimumVersion", (Map)localObject3);
      localObject4 = new Bundle();
      ((BaseBundle)localObject4).putString("apn", (String)localObject1);
      if (localObject2 != null) {
        ((Bundle)localObject4).putParcelable("afl", Uri.parse((String)localObject2));
      }
      if (localObject3 != null) {
        ((BaseBundle)localObject4).putInt("amv", ((Integer)localObject3).intValue());
      }
      c.putAll((Bundle)localObject4);
    }
    Object localObject5 = (Map)paramMap.get("googleAnalyticsParameters");
    Object localObject6;
    if (localObject5 != null)
    {
      localObject2 = (String)valueFor("campaign", (Map)localObject5);
      localObject4 = (String)valueFor("content", (Map)localObject5);
      localObject1 = (String)valueFor("medium", (Map)localObject5);
      localObject3 = (String)valueFor("source", (Map)localObject5);
      localObject5 = (String)valueFor("term", (Map)localObject5);
      localObject6 = new Bundle();
      if (localObject2 != null) {
        ((BaseBundle)localObject6).putString("utm_campaign", (String)localObject2);
      }
      if (localObject4 != null) {
        ((BaseBundle)localObject6).putString("utm_content", (String)localObject4);
      }
      if (localObject1 != null) {
        ((BaseBundle)localObject6).putString("utm_medium", (String)localObject1);
      }
      if (localObject3 != null) {
        ((BaseBundle)localObject6).putString("utm_source", (String)localObject3);
      }
      if (localObject5 != null) {
        ((BaseBundle)localObject6).putString("utm_term", (String)localObject5);
      }
      c.putAll((Bundle)localObject6);
    }
    Object localObject7 = (Map)paramMap.get("iosParameters");
    if (localObject7 != null)
    {
      localObject2 = (String)valueFor("bundleId", (Map)localObject7);
      localObject4 = (String)valueFor("appStoreId", (Map)localObject7);
      localObject3 = (String)valueFor("customScheme", (Map)localObject7);
      localObject1 = (String)valueFor("fallbackUrl", (Map)localObject7);
      localObject6 = (String)valueFor("ipadBundleId", (Map)localObject7);
      localObject5 = (String)valueFor("ipadFallbackUrl", (Map)localObject7);
      localObject7 = (String)valueFor("minimumVersion", (Map)localObject7);
      Bundle localBundle = new Bundle();
      localBundle.putString("ibi", (String)localObject2);
      if (localObject4 != null) {
        localBundle.putString("isi", (String)localObject4);
      }
      if (localObject3 != null) {
        localBundle.putString("ius", (String)localObject3);
      }
      if (localObject1 != null) {
        localBundle.putParcelable("ifl", Uri.parse((String)localObject1));
      }
      if (localObject6 != null) {
        localBundle.putString("ipbi", (String)localObject6);
      }
      if (localObject5 != null) {
        localBundle.putParcelable("ipfl", Uri.parse((String)localObject5));
      }
      if (localObject7 != null) {
        localBundle.putString("imv", (String)localObject7);
      }
      c.putAll(localBundle);
    }
    localObject3 = (Map)paramMap.get("itunesConnectAnalyticsParameters");
    if (localObject3 != null)
    {
      localObject2 = (String)valueFor("affiliateToken", (Map)localObject3);
      localObject1 = (String)valueFor("campaignToken", (Map)localObject3);
      localObject3 = (String)valueFor("providerToken", (Map)localObject3);
      localObject4 = new Bundle();
      if (localObject2 != null) {
        ((BaseBundle)localObject4).putString("at", (String)localObject2);
      }
      if (localObject1 != null) {
        ((BaseBundle)localObject4).putString("ct", (String)localObject1);
      }
      if (localObject3 != null) {
        ((BaseBundle)localObject4).putString("pt", (String)localObject3);
      }
      c.putAll((Bundle)localObject4);
    }
    localObject1 = (Map)paramMap.get("navigationInfoParameters");
    if (localObject1 != null)
    {
      localObject1 = (Boolean)valueFor("forcedRedirectEnabled", (Map)localObject1);
      localObject2 = new Bundle();
      if (localObject1 != null) {
        ((BaseBundle)localObject2).putInt("efr", ((Boolean)localObject1).booleanValue());
      }
      c.putAll((Bundle)localObject2);
    }
    localObject2 = (Map)paramMap.get("socialMetaTagParameters");
    if (localObject2 != null)
    {
      localObject1 = (String)valueFor("description", (Map)localObject2);
      paramMap = (String)valueFor("imageUrl", (Map)localObject2);
      localObject2 = (String)valueFor("title", (Map)localObject2);
      localObject3 = new Bundle();
      if (localObject1 != null) {
        ((BaseBundle)localObject3).putString("sd", (String)localObject1);
      }
      if (paramMap != null) {
        ((Bundle)localObject3).putParcelable("si", Uri.parse(paramMap));
      }
      if (localObject2 != null) {
        ((BaseBundle)localObject3).putString("st", (String)localObject2);
      }
      c.putAll((Bundle)localObject3);
    }
    return locala;
  }
  
  private static <T> T valueFor(String paramString, Map<String, Object> paramMap)
  {
    return (T)paramMap.get(paramString);
  }
  
  public Task<Void> didReinitializeFirebaseCore()
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new e(2, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
  
  public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(f paramf)
  {
    paramf = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new db.a(0, paramf));
    return paramf.getTask();
  }
  
  public void onAttachedToActivity(ActivityPluginBinding paramActivityPluginBinding)
  {
    activity.set(paramActivityPluginBinding.getActivity());
    paramActivityPluginBinding.addOnNewIntentListener(this);
  }
  
  public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    initInstance(paramFlutterPluginBinding.getBinaryMessenger());
  }
  
  public void onDetachedFromActivity()
  {
    detachToActivity();
  }
  
  public void onDetachedFromActivityForConfigChanges()
  {
    detachToActivity();
  }
  
  public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    channel.setMethodCallHandler(null);
    channel = null;
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    v8.b localb = getDynamicLinkInstance((Map)paramMethodCall.arguments());
    String str = method;
    str.getClass();
    int i = str.hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1658258438: 
      if (str.equals("FirebaseDynamicLinks#buildLink")) {
        j = 3;
      }
      break;
    case -579002774: 
      if (str.equals("FirebaseDynamicLinks#getInitialLink")) {
        j = 2;
      }
      break;
    case -1769644534: 
      if (str.equals("FirebaseDynamicLinks#buildShortLink")) {
        j = 1;
      }
      break;
    case -2071055899: 
      if (str.equals("FirebaseDynamicLinks#getDynamicLink")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      paramResult.notImplemented();
      return;
    case 3: 
      paramResult.success(buildLink((Map)paramMethodCall.arguments()));
      return;
    case 1: 
      paramMethodCall = (Map)paramMethodCall.arguments();
      Objects.requireNonNull(paramMethodCall);
      paramMethodCall = buildShortLink((Map)paramMethodCall);
      break;
    case 0: 
    case 2: 
      paramMethodCall = getDynamicLink(localb, (String)paramMethodCall.argument("url"));
    }
    paramMethodCall.addOnCompleteListener(new io.flutter.plugins.firebase.crashlytics.d(1, paramResult));
  }
  
  public boolean onNewIntent(Intent paramIntent)
  {
    getDynamicLinkInstance(null).b(paramIntent).addOnSuccessListener(new g(this, 29)).addOnFailureListener(new d(this, 20));
    return false;
  }
  
  public void onReattachedToActivityForConfigChanges(ActivityPluginBinding paramActivityPluginBinding)
  {
    activity.set(paramActivityPluginBinding.getActivity());
    paramActivityPluginBinding.addOnNewIntentListener(this);
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.dynamiclinks.FlutterFirebaseDynamicLinksPlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */