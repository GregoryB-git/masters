package io.flutter.plugins.firebase.analytics;

import aa.m0;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.f;
import g.q;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import w.g;

/* loaded from: classes.dex */
public class FlutterFirebaseAnalyticsPlugin implements FlutterFirebasePlugin, MethodChannel.MethodCallHandler, FlutterPlugin {
    private FirebaseAnalytics analytics;
    private MethodChannel channel;

    private static Bundle createBundleFromMap(Map<String, Object> map) {
        long intValue;
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            Object value = entry.getValue();
            String key = entry.getKey();
            if (value instanceof String) {
                bundle.putString(key, (String) value);
            } else {
                if (value instanceof Integer) {
                    intValue = ((Integer) value).intValue();
                } else if (value instanceof Long) {
                    intValue = ((Long) value).longValue();
                } else if (value instanceof Double) {
                    bundle.putDouble(key, ((Double) value).doubleValue());
                } else if (value instanceof Boolean) {
                    bundle.putBoolean(key, ((Boolean) value).booleanValue());
                } else if (value == null) {
                    bundle.putString(key, null);
                } else if (value instanceof Iterable) {
                    ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                    for (Object obj : (Iterable) value) {
                        if (!(obj instanceof Map)) {
                            StringBuilder l10 = f.l("Unsupported value type: ");
                            l10.append(obj.getClass().getCanonicalName());
                            l10.append(" in list at key ");
                            l10.append(key);
                            throw new IllegalArgumentException(l10.toString());
                        }
                        arrayList.add(createBundleFromMap((Map) obj));
                    }
                    bundle.putParcelableArrayList(key, arrayList);
                } else {
                    if (!(value instanceof Map)) {
                        StringBuilder l11 = f.l("Unsupported value type: ");
                        l11.append(value.getClass().getCanonicalName());
                        throw new IllegalArgumentException(l11.toString());
                    }
                    bundle.putParcelable(key, createBundleFromMap((Map) value));
                }
                bundle.putLong(key, intValue);
            }
        }
        return bundle;
    }

    private Task<String> handleGetAppInstanceId() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(this, taskCompletionSource, 0));
        return taskCompletionSource.getTask();
    }

    private Task<Long> handleGetSessionId() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(27, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> handleLogEvent(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new d(this, map, taskCompletionSource, 1));
        return taskCompletionSource.getTask();
    }

    private Task<Void> handleResetAnalyticsData() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new q(26, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Void> handleSetAnalyticsCollectionEnabled(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(this, map, taskCompletionSource, 2));
        return taskCompletionSource.getTask();
    }

    private Task<Void> handleSetSessionTimeoutDuration(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(this, map, taskCompletionSource, 0));
        return taskCompletionSource.getTask();
    }

    private Task<Void> handleSetUserId(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new a(this, map, taskCompletionSource, 0));
        return taskCompletionSource.getTask();
    }

    private Task<Void> handleSetUserProperty(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new d(this, map, taskCompletionSource, 0));
        return taskCompletionSource.getTask();
    }

    private void initInstance(BinaryMessenger binaryMessenger, Context context) {
        this.analytics = FirebaseAnalytics.getInstance(context);
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/firebase_analytics");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_analytics", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$didReinitializeFirebaseCore$12(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$11(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(new HashMap<String, Object>() { // from class: io.flutter.plugins.firebase.analytics.FlutterFirebaseAnalyticsPlugin.1
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$handleGetAppInstanceId$10(TaskCompletionSource taskCompletionSource) {
        Task forException;
        try {
            FirebaseAnalytics firebaseAnalytics = this.analytics;
            firebaseAnalytics.getClass();
            try {
                forException = Tasks.call(firebaseAnalytics.b(), new v7.a(firebaseAnalytics));
            } catch (RuntimeException e10) {
                firebaseAnalytics.f3047a.zza(5, "Failed to schedule task for getAppInstanceId", (Object) null, (Object) null, (Object) null);
                forException = Tasks.forException(e10);
            }
            taskCompletionSource.setResult((String) Tasks.await(forException));
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$handleGetSessionId$1(TaskCompletionSource taskCompletionSource) {
        Task forException;
        try {
            FirebaseAnalytics firebaseAnalytics = this.analytics;
            firebaseAnalytics.getClass();
            try {
                forException = Tasks.call(firebaseAnalytics.b(), new v7.d(firebaseAnalytics));
            } catch (RuntimeException e10) {
                firebaseAnalytics.f3047a.zza(5, "Failed to schedule task for getSessionId", (Object) null, (Object) null, (Object) null);
                forException = Tasks.forException(e10);
            }
            taskCompletionSource.setResult((Long) Tasks.await(forException));
        } catch (Exception e11) {
            taskCompletionSource.setException(e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$handleLogEvent$2(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get(Constants.EVENT_NAME);
            Objects.requireNonNull(obj);
            Bundle createBundleFromMap = createBundleFromMap((Map) map.get(Constants.PARAMETERS));
            this.analytics.f3047a.zza((String) obj, createBundleFromMap);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$handleResetAnalyticsData$7(TaskCompletionSource taskCompletionSource) {
        try {
            this.analytics.f3047a.zzj();
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$handleSetAnalyticsCollectionEnabled$4(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            this.analytics.f3047a.zza(Boolean.valueOf(((Boolean) obj).booleanValue()));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$handleSetSessionTimeoutDuration$5(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Objects.requireNonNull(map.get(Constants.MILLISECONDS));
            this.analytics.f3047a.zza(((Integer) r4).intValue());
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$handleSetUserId$3(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            this.analytics.f3047a.zzd((String) map.get(Constants.USER_ID));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$handleSetUserProperty$6(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("name");
            Objects.requireNonNull(obj);
            String str = (String) map.get("value");
            this.analytics.f3047a.zzb((String) obj, str);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onMethodCall$0(MethodChannel.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
        } else {
            Exception exception = task.getException();
            result.error("firebase_analytics", exception != null ? exception.getMessage() : "An unknown error occurred", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setConsent$8(Map map, TaskCompletionSource taskCompletionSource) {
        FirebaseAnalytics.a aVar = FirebaseAnalytics.a.GRANTED;
        FirebaseAnalytics.a aVar2 = FirebaseAnalytics.a.DENIED;
        try {
            Boolean bool = (Boolean) map.get(Constants.AD_STORAGE_CONSENT_GRANTED);
            Boolean bool2 = (Boolean) map.get(Constants.ANALYTICS_STORAGE_CONSENT_GRANTED);
            Boolean bool3 = (Boolean) map.get(Constants.AD_PERSONALIZATION_SIGNALS_CONSENT_GRANTED);
            Boolean bool4 = (Boolean) map.get(Constants.AD_USER_DATA_CONSENT_GRANTED);
            HashMap hashMap = new HashMap();
            if (bool != null) {
                hashMap.put(FirebaseAnalytics.b.AD_STORAGE, bool.booleanValue() ? aVar : aVar2);
            }
            if (bool2 != null) {
                hashMap.put(FirebaseAnalytics.b.ANALYTICS_STORAGE, bool2.booleanValue() ? aVar : aVar2);
            }
            if (bool3 != null) {
                hashMap.put(FirebaseAnalytics.b.AD_PERSONALIZATION, bool3.booleanValue() ? aVar : aVar2);
            }
            if (bool4 != null) {
                FirebaseAnalytics.b bVar = FirebaseAnalytics.b.AD_USER_DATA;
                if (!bool4.booleanValue()) {
                    aVar = aVar2;
                }
                hashMap.put(bVar, aVar);
            }
            this.analytics.a(hashMap);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setDefaultEventParameters$9(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            FirebaseAnalytics firebaseAnalytics = this.analytics;
            Bundle createBundleFromMap = createBundleFromMap(map);
            if (createBundleFromMap != null) {
                firebaseAnalytics.getClass();
                createBundleFromMap = new Bundle(createBundleFromMap);
            }
            firebaseAnalytics.f3047a.zzd(createBundleFromMap);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Void> setConsent(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new a(this, map, taskCompletionSource, 1));
        return taskCompletionSource.getTask();
    }

    private Task<Void> setDefaultEventParameters(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(this, map, taskCompletionSource, 1));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new e(0, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(u7.f fVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(this, taskCompletionSource, 1));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
            this.channel = null;
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Task handleGetAppInstanceId;
        String str = methodCall.method;
        str.getClass();
        int i10 = 1;
        switch (str) {
            case "Analytics#getAppInstanceId":
                handleGetAppInstanceId = handleGetAppInstanceId();
                break;
            case "Analytics#resetAnalyticsData":
                handleGetAppInstanceId = handleResetAnalyticsData();
                break;
            case "Analytics#setConsent":
                handleGetAppInstanceId = setConsent((Map) methodCall.arguments());
                break;
            case "Analytics#setAnalyticsCollectionEnabled":
                handleGetAppInstanceId = handleSetAnalyticsCollectionEnabled((Map) methodCall.arguments());
                break;
            case "Analytics#setDefaultEventParameters":
                handleGetAppInstanceId = setDefaultEventParameters((Map) methodCall.arguments());
                break;
            case "Analytics#logEvent":
                handleGetAppInstanceId = handleLogEvent((Map) methodCall.arguments());
                break;
            case "Analytics#getSessionId":
                handleGetAppInstanceId = handleGetSessionId();
                break;
            case "Analytics#setUserProperty":
                handleGetAppInstanceId = handleSetUserProperty((Map) methodCall.arguments());
                break;
            case "Analytics#setSessionTimeoutDuration":
                handleGetAppInstanceId = handleSetSessionTimeoutDuration((Map) methodCall.arguments());
                break;
            case "Analytics#setUserId":
                handleGetAppInstanceId = handleSetUserId((Map) methodCall.arguments());
                break;
            default:
                result.notImplemented();
                return;
        }
        handleGetAppInstanceId.addOnCompleteListener(new m0(result, i10));
    }
}
