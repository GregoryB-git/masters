package io.flutter.plugins.firebase.messaging;

import aa.y;
import aa.z;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import b1.t;
import b1.x;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessaging.a;
import g.q;
import io.flutter.embedding.engine.FlutterShellArgs;
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
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.crashlytics.c;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import u.u;

public class FlutterFirebaseMessagingPlugin
  implements FlutterFirebasePlugin, MethodChannel.MethodCallHandler, PluginRegistry.NewIntentListener, FlutterPlugin, ActivityAware
{
  private MethodChannel channel;
  private final HashMap<String, Boolean> consumedInitialMessages = new HashMap();
  private z initialMessage;
  private Map<String, Object> initialMessageNotification;
  private final t<z> liveDataRemoteMessage = FlutterFirebaseRemoteMessageLiveData.getInstance();
  private final t<String> liveDataToken = FlutterFirebaseTokenLiveData.getInstance();
  private Activity mainActivity;
  public FlutterFirebasePermissionManager permissionManager;
  private x<z> remoteMessageObserver;
  private x<String> tokenObserver;
  
  private Boolean checkPermissions()
  {
    boolean bool;
    if (ContextHolder.getApplicationContext().checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return Boolean.valueOf(bool);
  }
  
  private Task<Void> deleteToken()
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new db.a(1, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
  
  private Map<String, Object> getExceptionDetails(Exception paramException)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("code", "unknown");
    if (paramException != null) {
      paramException = paramException.getMessage();
    } else {
      paramException = "An unknown error has occurred.";
    }
    localHashMap.put("message", paramException);
    return localHashMap;
  }
  
  private Task<Map<String, Object>> getInitialMessage()
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new e(this, localTaskCompletionSource, 1));
    return localTaskCompletionSource.getTask();
  }
  
  private Task<Map<String, Integer>> getPermissions()
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new f(0, this, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
  
  private Task<Map<String, Object>> getToken()
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new i(this, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
  
  private void initInstance(BinaryMessenger paramBinaryMessenger)
  {
    paramBinaryMessenger = new MethodChannel(paramBinaryMessenger, "plugins.flutter.io/firebase_messaging");
    channel = paramBinaryMessenger;
    paramBinaryMessenger.setMethodCallHandler(this);
    permissionManager = new FlutterFirebasePermissionManager();
    paramBinaryMessenger = new j(this);
    remoteMessageObserver = paramBinaryMessenger;
    tokenObserver = new k(this);
    liveDataRemoteMessage.observeForever(paramBinaryMessenger);
    liveDataToken.observeForever(tokenObserver);
    FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_messaging", this);
  }
  
  private void lambda$getPermissions$13(TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      boolean bool;
      if (Build.VERSION.SDK_INT >= 33)
      {
        bool = checkPermissions().booleanValue();
      }
      else
      {
        Activity localActivity = mainActivity;
        u localu = new u/u;
        localu.<init>(localActivity);
        bool = localu.a();
      }
      int i;
      if (bool) {
        i = 1;
      } else {
        i = 0;
      }
      localHashMap.put("authorizationStatus", Integer.valueOf(i));
      paramTaskCompletionSource.setResult(localHashMap);
    }
    catch (Exception localException)
    {
      paramTaskCompletionSource.setException(localException);
    }
  }
  
  private static void lambda$getPluginConstantsForFirebaseApp$15(u7.f arg0, TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      ???.a();
      if (b.equals("[DEFAULT]")) {
        synchronized (df)
        {
          ???.a();
          Boolean localBoolean = d;
          boolean bool;
          if (localBoolean != null) {
            bool = localBoolean.booleanValue();
          } else {
            bool = e.a.k();
          }
          localHashMap.put("AUTO_INIT_ENABLED", Boolean.valueOf(bool));
        }
      }
      paramTaskCompletionSource.setResult(localObject);
    }
    catch (Exception ???)
    {
      paramTaskCompletionSource.setException(???);
    }
  }
  
  private void lambda$getToken$3(TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      Object localObject1 = FirebaseMessaging.d();
      Object localObject2 = b;
      if (localObject2 != null)
      {
        localObject1 = ((s9.a)localObject2).d();
      }
      else
      {
        TaskCompletionSource localTaskCompletionSource = new com/google/android/gms/tasks/TaskCompletionSource;
        localTaskCompletionSource.<init>();
        Executor localExecutor = g;
        localObject2 = new g/q;
        ((q)localObject2).<init>(22, localObject1, localTaskCompletionSource);
        localExecutor.execute((Runnable)localObject2);
        localObject1 = localTaskCompletionSource.getTask();
      }
      localObject1 = (String)Tasks.await((Task)localObject1);
      localObject2 = new io/flutter/plugins/firebase/messaging/FlutterFirebaseMessagingPlugin$1;
      ((1)localObject2).<init>(this, (String)localObject1);
      paramTaskCompletionSource.setResult(localObject2);
    }
    catch (Exception localException)
    {
      paramTaskCompletionSource.setException(localException);
    }
  }
  
  private static void lambda$setDeliveryMetricsExportToBigQuery$8(Map paramMap, TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      FirebaseMessaging localFirebaseMessaging = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(paramMap);
      paramMap = paramMap.get("enabled");
      Objects.requireNonNull(paramMap);
      boolean bool = ((Boolean)paramMap).booleanValue();
      localFirebaseMessaging.getClass();
      paramMap = u7.f.e();
      paramMap.a();
      a.getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", bool).apply();
      y.b(c, d, localFirebaseMessaging.l());
      paramTaskCompletionSource.setResult(null);
    }
    catch (Exception paramMap)
    {
      paramTaskCompletionSource.setException(paramMap);
    }
  }
  
  private static void lambda$subscribeToTopic$4(Map paramMap, TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      Object localObject = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(paramMap);
      paramMap = paramMap.get("topic");
      Objects.requireNonNull(paramMap);
      paramMap = (String)paramMap;
      Task localTask = i;
      localObject = new d;
      ((d)localObject).<init>(paramMap, 13);
      Tasks.await(localTask.onSuccessTask((SuccessContinuation)localObject));
      paramTaskCompletionSource.setResult(null);
    }
    catch (Exception paramMap)
    {
      paramTaskCompletionSource.setException(paramMap);
    }
  }
  
  private static void lambda$unsubscribeFromTopic$5(Map paramMap, TaskCompletionSource paramTaskCompletionSource)
  {
    try
    {
      Object localObject = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(paramMap);
      paramMap = paramMap.get("topic");
      Objects.requireNonNull(paramMap);
      paramMap = (String)paramMap;
      localObject = i;
      io.flutter.plugins.firebase.auth.g localg = new io/flutter/plugins/firebase/auth/g;
      localg.<init>(paramMap, 22);
      Tasks.await(((Task)localObject).onSuccessTask(localg));
      paramTaskCompletionSource.setResult(null);
    }
    catch (Exception paramMap)
    {
      paramTaskCompletionSource.setException(paramMap);
    }
  }
  
  private Task<Map<String, Integer>> requestPermissions()
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new e(this, localTaskCompletionSource, 0));
    return localTaskCompletionSource.getTask();
  }
  
  private Task<Void> sendMessage(Map<String, Object> paramMap)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new io.flutter.plugins.firebase.crashlytics.a(paramMap, localTaskCompletionSource, 2));
    return localTaskCompletionSource.getTask();
  }
  
  private Task<Map<String, Object>> setAutoInitEnabled(Map<String, Object> paramMap)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new x0.d(this, paramMap, localTaskCompletionSource, 8));
    return localTaskCompletionSource.getTask();
  }
  
  private Task<Void> setDeliveryMetricsExportToBigQuery(Map<String, Object> paramMap)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new h(paramMap, localTaskCompletionSource, 1));
    return localTaskCompletionSource.getTask();
  }
  
  private Task<Void> subscribeToTopic(Map<String, Object> paramMap)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new h(paramMap, localTaskCompletionSource, 0));
    return localTaskCompletionSource.getTask();
  }
  
  private Map<String, Object> uncheckedCastToMap(Object paramObject)
  {
    return (Map)paramObject;
  }
  
  private Task<Void> unsubscribeFromTopic(Map<String, Object> paramMap)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new c(paramMap, localTaskCompletionSource, 1));
    return localTaskCompletionSource.getTask();
  }
  
  public Task<Void> didReinitializeFirebaseCore()
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new io.flutter.plugins.firebase.core.a(2, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
  
  public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(u7.f paramf)
  {
    TaskCompletionSource localTaskCompletionSource = new TaskCompletionSource();
    FlutterFirebasePlugin.cachedThreadPool.execute(new io.flutter.plugins.googlesignin.a(1, paramf, localTaskCompletionSource));
    return localTaskCompletionSource.getTask();
  }
  
  public void onAttachedToActivity(ActivityPluginBinding paramActivityPluginBinding)
  {
    paramActivityPluginBinding.addOnNewIntentListener(this);
    paramActivityPluginBinding.addRequestPermissionsResultListener(permissionManager);
    paramActivityPluginBinding = paramActivityPluginBinding.getActivity();
    mainActivity = paramActivityPluginBinding;
    if ((paramActivityPluginBinding.getIntent() != null) && (mainActivity.getIntent().getExtras() != null) && ((mainActivity.getIntent().getFlags() & 0x100000) != 1048576)) {
      onNewIntent(mainActivity.getIntent());
    }
  }
  
  public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    ContextHolder.setApplicationContext(paramFlutterPluginBinding.getApplicationContext());
    initInstance(paramFlutterPluginBinding.getBinaryMessenger());
  }
  
  public void onDetachedFromActivity()
  {
    mainActivity = null;
  }
  
  public void onDetachedFromActivityForConfigChanges()
  {
    mainActivity = null;
  }
  
  public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding paramFlutterPluginBinding)
  {
    liveDataToken.removeObserver(tokenObserver);
    liveDataRemoteMessage.removeObserver(remoteMessageObserver);
  }
  
  public void onMethodCall(MethodCall paramMethodCall, MethodChannel.Result paramResult)
  {
    Object localObject = method;
    localObject.getClass();
    int i = ((String)localObject).hashCode();
    int j = -1;
    switch (i)
    {
    default: 
      break;
    case 1459336962: 
      if (((String)localObject).equals("Messaging#getToken")) {
        j = 10;
      }
      break;
    case 1243856389: 
      if (((String)localObject).equals("Messaging#getNotificationSettings")) {
        j = 9;
      }
      break;
    case 1231338975: 
      if (((String)localObject).equals("Messaging#requestPermission")) {
        j = 8;
      }
      break;
    case 1165917248: 
      if (((String)localObject).equals("Messaging#sendMessage")) {
        j = 7;
      }
      break;
    case 928431066: 
      if (((String)localObject).equals("Messaging#startBackgroundIsolate")) {
        j = 6;
      }
      break;
    case 607887267: 
      if (((String)localObject).equals("Messaging#setDeliveryMetricsExportToBigQuery")) {
        j = 5;
      }
      break;
    case 506322569: 
      if (((String)localObject).equals("Messaging#subscribeToTopic")) {
        j = 4;
      }
      break;
    case 421314579: 
      if (((String)localObject).equals("Messaging#unsubscribeFromTopic")) {
        j = 3;
      }
      break;
    case -657665041: 
      if (((String)localObject).equals("Messaging#deleteToken")) {
        j = 2;
      }
      break;
    case -1661255137: 
      if (((String)localObject).equals("Messaging#setAutoInitEnabled")) {
        j = 1;
      }
      break;
    case -1704007366: 
      if (((String)localObject).equals("Messaging#getInitialMessage")) {
        j = 0;
      }
      break;
    }
    switch (j)
    {
    default: 
      paramResult.notImplemented();
      return;
    case 10: 
      paramMethodCall = getToken();
      break;
    case 9: 
    case 8: 
      do
      {
        paramMethodCall = getPermissions();
        break;
      } while (Build.VERSION.SDK_INT < 33);
      paramMethodCall = requestPermissions();
      break;
    case 7: 
      paramMethodCall = sendMessage((Map)paramMethodCall.arguments());
      break;
    case 6: 
      localObject = (Map)arguments;
      paramMethodCall = ((Map)localObject).get("pluginCallbackHandle");
      localObject = ((Map)localObject).get("userCallbackHandle");
      if ((paramMethodCall instanceof Long)) {}
      long l1;
      for (paramMethodCall = (Long)paramMethodCall;; paramMethodCall = Long.valueOf(((Integer)paramMethodCall).intValue()))
      {
        l1 = paramMethodCall.longValue();
        break;
        if (!(paramMethodCall instanceof Integer)) {
          break label621;
        }
      }
      if ((localObject instanceof Long)) {}
      long l2;
      for (paramMethodCall = (Long)localObject;; paramMethodCall = Long.valueOf(((Integer)localObject).intValue()))
      {
        l2 = paramMethodCall.longValue();
        break;
        if (!(localObject instanceof Integer)) {
          break label610;
        }
      }
      paramMethodCall = mainActivity;
      if (paramMethodCall != null) {
        paramMethodCall = FlutterShellArgs.fromIntent(paramMethodCall.getIntent());
      } else {
        paramMethodCall = null;
      }
      FlutterFirebaseMessagingBackgroundService.setCallbackDispatcher(l1);
      FlutterFirebaseMessagingBackgroundService.setUserCallbackHandle(l2);
      FlutterFirebaseMessagingBackgroundService.startBackgroundIsolate(l1, paramMethodCall);
      paramMethodCall = Tasks.forResult(null);
      break;
      throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'userCallbackHandle'.");
      throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'pluginCallbackHandle'.");
    case 5: 
      paramMethodCall = setDeliveryMetricsExportToBigQuery((Map)paramMethodCall.arguments());
      break;
    case 4: 
      paramMethodCall = subscribeToTopic((Map)paramMethodCall.arguments());
      break;
    case 3: 
      paramMethodCall = unsubscribeFromTopic((Map)paramMethodCall.arguments());
      break;
    case 2: 
      paramMethodCall = deleteToken();
      break;
    case 1: 
      paramMethodCall = setAutoInitEnabled((Map)paramMethodCall.arguments());
      break;
    case 0: 
      label610:
      label621:
      paramMethodCall = getInitialMessage();
    }
    paramMethodCall.addOnCompleteListener(new g(this, paramResult));
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
    z localz1 = (z)FlutterFirebaseMessagingReceiver.notifications.get(localObject2);
    Object localObject3 = null;
    z localz2 = localz1;
    localObject1 = localObject3;
    if (localz1 == null)
    {
      Map localMap = FlutterFirebaseMessagingStore.getInstance().getFirebaseMessageMap((String)localObject2);
      localz2 = localz1;
      localObject1 = localObject3;
      if (localMap != null)
      {
        localz2 = FlutterFirebaseMessagingUtils.getRemoteMessageForArguments(localMap);
        localObject1 = FlutterFirebaseMessagingUtils.getRemoteMessageNotificationForArguments(localMap);
      }
    }
    if (localz2 == null) {
      return false;
    }
    initialMessage = localz2;
    initialMessageNotification = ((Map)localObject1);
    FlutterFirebaseMessagingReceiver.notifications.remove(localObject2);
    localObject2 = FlutterFirebaseMessagingUtils.remoteMessageToMap(localz2);
    if (localz2.F() == null)
    {
      localObject1 = initialMessageNotification;
      if (localObject1 != null) {
        ((Map)localObject2).put("notification", localObject1);
      }
    }
    channel.invokeMethod("Messaging#onMessageOpenedApp", localObject2);
    mainActivity.setIntent(paramIntent);
    return true;
  }
  
  public void onReattachedToActivityForConfigChanges(ActivityPluginBinding paramActivityPluginBinding)
  {
    paramActivityPluginBinding.addOnNewIntentListener(this);
    mainActivity = paramActivityPluginBinding.getActivity();
  }
}

/* Location:
 * Qualified Name:     io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */