package io.flutter.plugins.firebase.messaging;

import aa.y;
import aa.z;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import b1.t;
import b1.x;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import g.q;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.firebase.messaging.FlutterFirebasePermissionManager;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import u.u;

/* loaded from: classes.dex */
public class FlutterFirebaseMessagingPlugin implements FlutterFirebasePlugin, MethodChannel.MethodCallHandler, PluginRegistry.NewIntentListener, FlutterPlugin, ActivityAware {
    private MethodChannel channel;
    private z initialMessage;
    private Map<String, Object> initialMessageNotification;
    private Activity mainActivity;
    public FlutterFirebasePermissionManager permissionManager;
    private x<z> remoteMessageObserver;
    private x<String> tokenObserver;
    private final HashMap<String, Boolean> consumedInitialMessages = new HashMap<>();
    private final t<z> liveDataRemoteMessage = FlutterFirebaseRemoteMessageLiveData.getInstance();
    private final t<String> liveDataToken = FlutterFirebaseTokenLiveData.getInstance();

    private Boolean checkPermissions() {
        return Boolean.valueOf(ContextHolder.getApplicationContext().checkSelfPermission("android.permission.POST_NOTIFICATIONS") == 0);
    }

    private Task<Void> deleteToken() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new db.a(1, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Map<String, Object> getExceptionDetails(Exception exc) {
        HashMap hashMap = new HashMap();
        hashMap.put("code", "unknown");
        hashMap.put(Constants.MESSAGE, exc != null ? exc.getMessage() : "An unknown error has occurred.");
        return hashMap;
    }

    private Task<Map<String, Object>> getInitialMessage() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new e(this, taskCompletionSource, 1));
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Integer>> getPermissions() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(0, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Object>> getToken() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new Runnable() { // from class: io.flutter.plugins.firebase.messaging.i
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseMessagingPlugin.this.lambda$getToken$3(taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    private void initInstance(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/firebase_messaging");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.permissionManager = new FlutterFirebasePermissionManager();
        x<z> xVar = new x() { // from class: io.flutter.plugins.firebase.messaging.j
            @Override // b1.x
            public final void a(Object obj) {
                FlutterFirebaseMessagingPlugin.this.lambda$initInstance$0((z) obj);
            }
        };
        this.remoteMessageObserver = xVar;
        this.tokenObserver = new x() { // from class: io.flutter.plugins.firebase.messaging.k
            @Override // b1.x
            public final void a(Object obj) {
                FlutterFirebaseMessagingPlugin.this.lambda$initInstance$1((String) obj);
            }
        };
        this.liveDataRemoteMessage.observeForever(xVar);
        this.liveDataToken.observeForever(this.tokenObserver);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_messaging", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$deleteToken$2(TaskCompletionSource taskCompletionSource) {
        try {
            Tasks.await(FirebaseMessaging.d().b());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getInitialMessage$9(TaskCompletionSource taskCompletionSource) {
        Map<String, Object> map;
        try {
            z zVar = this.initialMessage;
            if (zVar != null) {
                Map<String, Object> remoteMessageToMap = FlutterFirebaseMessagingUtils.remoteMessageToMap(zVar);
                Map<String, Object> map2 = this.initialMessageNotification;
                if (map2 != null) {
                    remoteMessageToMap.put(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE, map2);
                }
                taskCompletionSource.setResult(remoteMessageToMap);
                this.initialMessage = null;
                this.initialMessageNotification = null;
                return;
            }
            Activity activity = this.mainActivity;
            if (activity == null) {
                taskCompletionSource.setResult(null);
                return;
            }
            Intent intent = activity.getIntent();
            if (intent != null && intent.getExtras() != null) {
                String string = intent.getExtras().getString("google.message_id");
                if (string == null) {
                    string = intent.getExtras().getString("message_id");
                }
                if (string != null && this.consumedInitialMessages.get(string) == null) {
                    z zVar2 = FlutterFirebaseMessagingReceiver.notifications.get(string);
                    if (zVar2 == null) {
                        Map<String, Object> firebaseMessageMap = FlutterFirebaseMessagingStore.getInstance().getFirebaseMessageMap(string);
                        if (firebaseMessageMap != null) {
                            zVar2 = FlutterFirebaseMessagingUtils.getRemoteMessageForArguments(firebaseMessageMap);
                            if (firebaseMessageMap.get(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE) != null) {
                                map = uncheckedCastToMap(firebaseMessageMap.get(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE));
                                FlutterFirebaseMessagingStore.getInstance().removeFirebaseMessage(string);
                            }
                        }
                        map = null;
                        FlutterFirebaseMessagingStore.getInstance().removeFirebaseMessage(string);
                    } else {
                        map = null;
                    }
                    if (zVar2 == null) {
                        taskCompletionSource.setResult(null);
                        return;
                    }
                    this.consumedInitialMessages.put(string, Boolean.TRUE);
                    Map<String, Object> remoteMessageToMap2 = FlutterFirebaseMessagingUtils.remoteMessageToMap(zVar2);
                    if (zVar2.F() == null && map != null) {
                        remoteMessageToMap2.put(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE, map);
                    }
                    taskCompletionSource.setResult(remoteMessageToMap2);
                    return;
                }
                taskCompletionSource.setResult(null);
                return;
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$getPermissions$13(TaskCompletionSource taskCompletionSource) {
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("authorizationStatus", Integer.valueOf(Build.VERSION.SDK_INT >= 33 ? checkPermissions().booleanValue() : new u(this.mainActivity).a() ? 1 : 0));
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$getPluginConstantsForFirebaseApp$15(u7.f fVar, TaskCompletionSource taskCompletionSource) {
        boolean booleanValue;
        try {
            HashMap hashMap = new HashMap();
            fVar.a();
            if (fVar.f15085b.equals("[DEFAULT]")) {
                FirebaseMessaging.a aVar = FirebaseMessaging.d().f;
                synchronized (aVar) {
                    aVar.a();
                    Boolean bool = aVar.f3245d;
                    booleanValue = bool != null ? bool.booleanValue() : FirebaseMessaging.this.f3232a.k();
                }
                hashMap.put("AUTO_INIT_ENABLED", Boolean.valueOf(booleanValue));
            }
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$getToken$3(TaskCompletionSource taskCompletionSource) {
        Task<String> task;
        try {
            FirebaseMessaging d10 = FirebaseMessaging.d();
            s9.a aVar = d10.f3233b;
            if (aVar != null) {
                task = aVar.d();
            } else {
                TaskCompletionSource taskCompletionSource2 = new TaskCompletionSource();
                d10.f3237g.execute(new q(22, d10, taskCompletionSource2));
                task = taskCompletionSource2.getTask();
            }
            taskCompletionSource.setResult(new HashMap<String, Object>((String) Tasks.await(task)) { // from class: io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin.1
                public final /* synthetic */ String val$token;

                {
                    this.val$token = r2;
                    put("token", r2);
                }
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initInstance$0(z zVar) {
        this.channel.invokeMethod("Messaging#onMessage", FlutterFirebaseMessagingUtils.remoteMessageToMap(zVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initInstance$1(String str) {
        this.channel.invokeMethod("Messaging#onTokenRefresh", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMethodCall$14(MethodChannel.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
        } else {
            Exception exception = task.getException();
            result.error("firebase_messaging", exception != null ? exception.getMessage() : null, getExceptionDetails(exception));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$requestPermissions$10(Map map, TaskCompletionSource taskCompletionSource, int i10) {
        map.put("authorizationStatus", Integer.valueOf(i10));
        taskCompletionSource.setResult(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$requestPermissions$11(TaskCompletionSource taskCompletionSource, String str) {
        taskCompletionSource.setException(new Exception(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestPermissions$12(final TaskCompletionSource taskCompletionSource) {
        final HashMap hashMap = new HashMap();
        try {
            if (checkPermissions().booleanValue()) {
                hashMap.put("authorizationStatus", 1);
                taskCompletionSource.setResult(hashMap);
            } else {
                this.permissionManager.requestPermissions(this.mainActivity, new FlutterFirebasePermissionManager.RequestPermissionsSuccessCallback() { // from class: io.flutter.plugins.firebase.messaging.c
                    @Override // io.flutter.plugins.firebase.messaging.FlutterFirebasePermissionManager.RequestPermissionsSuccessCallback
                    public final void onSuccess(int i10) {
                        FlutterFirebaseMessagingPlugin.lambda$requestPermissions$10(hashMap, taskCompletionSource, i10);
                    }
                }, new ErrorCallback() { // from class: io.flutter.plugins.firebase.messaging.d
                    @Override // io.flutter.plugins.firebase.messaging.ErrorCallback
                    public final void onError(String str) {
                        FlutterFirebaseMessagingPlugin.lambda$requestPermissions$11(TaskCompletionSource.this, str);
                    }
                });
            }
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$sendMessage$6(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map).j(FlutterFirebaseMessagingUtils.getRemoteMessageForArguments(map));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setAutoInitEnabled$7(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            firebaseMessagingForArguments.k(((Boolean) obj).booleanValue());
            taskCompletionSource.setResult(new HashMap<String, Object>(firebaseMessagingForArguments) { // from class: io.flutter.plugins.firebase.messaging.FlutterFirebaseMessagingPlugin.2
                public final /* synthetic */ FirebaseMessaging val$firebaseMessaging;

                {
                    boolean booleanValue;
                    this.val$firebaseMessaging = firebaseMessagingForArguments;
                    FirebaseMessaging.a aVar = firebaseMessagingForArguments.f;
                    synchronized (aVar) {
                        aVar.a();
                        Boolean bool = aVar.f3245d;
                        booleanValue = bool != null ? bool.booleanValue() : FirebaseMessaging.this.f3232a.k();
                    }
                    put(FlutterFirebaseMessagingUtils.IS_AUTO_INIT_ENABLED, Boolean.valueOf(booleanValue));
                }
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$setDeliveryMetricsExportToBigQuery$8(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            boolean booleanValue = ((Boolean) obj).booleanValue();
            firebaseMessagingForArguments.getClass();
            u7.f e10 = u7.f.e();
            e10.a();
            e10.f15084a.getSharedPreferences("com.google.firebase.messaging", 0).edit().putBoolean("export_to_big_query", booleanValue).apply();
            y.b(firebaseMessagingForArguments.f3234c, firebaseMessagingForArguments.f3235d, firebaseMessagingForArguments.l());
            taskCompletionSource.setResult(null);
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$subscribeToTopic$4(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            Tasks.await(firebaseMessagingForArguments.f3239i.onSuccessTask(new defpackage.d((String) obj, 13)));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$unsubscribeFromTopic$5(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseMessaging firebaseMessagingForArguments = FlutterFirebaseMessagingUtils.getFirebaseMessagingForArguments(map);
            Object obj = map.get("topic");
            Objects.requireNonNull(obj);
            Tasks.await(firebaseMessagingForArguments.f3239i.onSuccessTask(new io.flutter.plugins.firebase.auth.g((String) obj, 22)));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Map<String, Integer>> requestPermissions() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new e(this, taskCompletionSource, 0));
        return taskCompletionSource.getTask();
    }

    private Task<Void> sendMessage(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new io.flutter.plugins.firebase.crashlytics.a(map, taskCompletionSource, 2));
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Object>> setAutoInitEnabled(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new x0.d(this, map, taskCompletionSource, 8));
        return taskCompletionSource.getTask();
    }

    private Task<Void> setDeliveryMetricsExportToBigQuery(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new h(map, taskCompletionSource, 1));
        return taskCompletionSource.getTask();
    }

    private Task<Void> subscribeToTopic(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new h(map, taskCompletionSource, 0));
        return taskCompletionSource.getTask();
    }

    private Map<String, Object> uncheckedCastToMap(Object obj) {
        return (Map) obj;
    }

    private Task<Void> unsubscribeFromTopic(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new io.flutter.plugins.firebase.crashlytics.c(map, taskCompletionSource, 1));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new io.flutter.plugins.firebase.core.a(2, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(u7.f fVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new io.flutter.plugins.googlesignin.a(1, fVar, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addOnNewIntentListener(this);
        activityPluginBinding.addRequestPermissionsResultListener(this.permissionManager);
        Activity activity = activityPluginBinding.getActivity();
        this.mainActivity = activity;
        if (activity.getIntent() == null || this.mainActivity.getIntent().getExtras() == null || (this.mainActivity.getIntent().getFlags() & 1048576) == 1048576) {
            return;
        }
        onNewIntent(this.mainActivity.getIntent());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        ContextHolder.setApplicationContext(flutterPluginBinding.getApplicationContext());
        initInstance(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        this.mainActivity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        this.mainActivity = null;
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.liveDataToken.removeObserver(this.tokenObserver);
        this.liveDataRemoteMessage.removeObserver(this.remoteMessageObserver);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, final MethodChannel.Result result) {
        Task initialMessage;
        Long valueOf;
        Long valueOf2;
        String str = methodCall.method;
        str.getClass();
        switch (str) {
            case "Messaging#getInitialMessage":
                initialMessage = getInitialMessage();
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.g
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(result, task);
                    }
                });
                return;
            case "Messaging#setAutoInitEnabled":
                initialMessage = setAutoInitEnabled((Map) methodCall.arguments());
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.g
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(result, task);
                    }
                });
                return;
            case "Messaging#deleteToken":
                initialMessage = deleteToken();
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.g
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(result, task);
                    }
                });
                return;
            case "Messaging#unsubscribeFromTopic":
                initialMessage = unsubscribeFromTopic((Map) methodCall.arguments());
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.g
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(result, task);
                    }
                });
                return;
            case "Messaging#subscribeToTopic":
                initialMessage = subscribeToTopic((Map) methodCall.arguments());
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.g
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(result, task);
                    }
                });
                return;
            case "Messaging#setDeliveryMetricsExportToBigQuery":
                initialMessage = setDeliveryMetricsExportToBigQuery((Map) methodCall.arguments());
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.g
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(result, task);
                    }
                });
                return;
            case "Messaging#startBackgroundIsolate":
                Map map = (Map) methodCall.arguments;
                Object obj = map.get("pluginCallbackHandle");
                Object obj2 = map.get("userCallbackHandle");
                if (obj instanceof Long) {
                    valueOf = (Long) obj;
                } else {
                    if (!(obj instanceof Integer)) {
                        throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'pluginCallbackHandle'.");
                    }
                    valueOf = Long.valueOf(((Integer) obj).intValue());
                }
                long longValue = valueOf.longValue();
                if (obj2 instanceof Long) {
                    valueOf2 = (Long) obj2;
                } else {
                    if (!(obj2 instanceof Integer)) {
                        throw new IllegalArgumentException("Expected 'Long' or 'Integer' type for 'userCallbackHandle'.");
                    }
                    valueOf2 = Long.valueOf(((Integer) obj2).intValue());
                }
                long longValue2 = valueOf2.longValue();
                Activity activity = this.mainActivity;
                FlutterShellArgs fromIntent = activity != null ? FlutterShellArgs.fromIntent(activity.getIntent()) : null;
                FlutterFirebaseMessagingBackgroundService.setCallbackDispatcher(longValue);
                FlutterFirebaseMessagingBackgroundService.setUserCallbackHandle(longValue2);
                FlutterFirebaseMessagingBackgroundService.startBackgroundIsolate(longValue, fromIntent);
                initialMessage = Tasks.forResult(null);
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.g
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(result, task);
                    }
                });
                return;
            case "Messaging#sendMessage":
                initialMessage = sendMessage((Map) methodCall.arguments());
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.g
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(result, task);
                    }
                });
                return;
            case "Messaging#requestPermission":
                if (Build.VERSION.SDK_INT >= 33) {
                    initialMessage = requestPermissions();
                    initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.g
                        @Override // com.google.android.gms.tasks.OnCompleteListener
                        public final void onComplete(Task task) {
                            FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(result, task);
                        }
                    });
                    return;
                }
            case "Messaging#getNotificationSettings":
                initialMessage = getPermissions();
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.g
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(result, task);
                    }
                });
                return;
            case "Messaging#getToken":
                initialMessage = getToken();
                initialMessage.addOnCompleteListener(new OnCompleteListener() { // from class: io.flutter.plugins.firebase.messaging.g
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        FlutterFirebaseMessagingPlugin.this.lambda$onMethodCall$14(result, task);
                    }
                });
                return;
            default:
                result.notImplemented();
                return;
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
    public boolean onNewIntent(Intent intent) {
        Map<String, Object> map;
        Map<String, Object> firebaseMessageMap;
        if (intent.getExtras() == null) {
            return false;
        }
        String string = intent.getExtras().getString("google.message_id");
        if (string == null) {
            string = intent.getExtras().getString("message_id");
        }
        if (string == null) {
            return false;
        }
        z zVar = FlutterFirebaseMessagingReceiver.notifications.get(string);
        Map<String, Object> map2 = null;
        if (zVar == null && (firebaseMessageMap = FlutterFirebaseMessagingStore.getInstance().getFirebaseMessageMap(string)) != null) {
            zVar = FlutterFirebaseMessagingUtils.getRemoteMessageForArguments(firebaseMessageMap);
            map2 = FlutterFirebaseMessagingUtils.getRemoteMessageNotificationForArguments(firebaseMessageMap);
        }
        if (zVar == null) {
            return false;
        }
        this.initialMessage = zVar;
        this.initialMessageNotification = map2;
        FlutterFirebaseMessagingReceiver.notifications.remove(string);
        Map<String, Object> remoteMessageToMap = FlutterFirebaseMessagingUtils.remoteMessageToMap(zVar);
        if (zVar.F() == null && (map = this.initialMessageNotification) != null) {
            remoteMessageToMap.put(FlutterFirebaseMessagingUtils.EXTRA_REMOTE_MESSAGE, map);
        }
        this.channel.invokeMethod("Messaging#onMessageOpenedApp", remoteMessageToMap);
        this.mainActivity.setIntent(intent);
        return true;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        activityPluginBinding.addOnNewIntentListener(this);
        this.mainActivity = activityPluginBinding.getActivity();
    }
}
