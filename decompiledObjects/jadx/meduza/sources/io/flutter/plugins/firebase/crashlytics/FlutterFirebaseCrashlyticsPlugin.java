package io.flutter.plugins.firebase.crashlytics;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import g.q;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import j8.n;
import j8.s;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import v3.x0;
import x0.f;
import x0.g;

/* loaded from: classes.dex */
public class FlutterFirebaseCrashlyticsPlugin implements FlutterFirebasePlugin, FlutterPlugin, MethodChannel.MethodCallHandler {
    private static final String FIREBASE_CRASHLYTICS_COLLECTION_ENABLED = "firebase_crashlytics_collection_enabled";
    public static final String TAG = "FLTFirebaseCrashlytics";
    private MethodChannel channel;

    private Task<Map<String, Object>> checkForUnsentReports() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new q(27, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private void crash() {
        new Handler(Looper.myLooper()).postDelayed(new Runnable() { // from class: io.flutter.plugins.firebase.crashlytics.e
            @Override // java.lang.Runnable
            public final void run() {
                FlutterFirebaseCrashlyticsPlugin.lambda$crash$1();
            }
        }, 50L);
    }

    private Task<Void> deleteUnsentReports() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(0, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Object>> didCrashOnPreviousExecution() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new f(27, this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private StackTraceElement generateStackTraceElement(Map<String, String> map) {
        try {
            String str = map.get(Constants.FILE);
            String str2 = map.get(Constants.LINE);
            String str3 = map.get(Constants.CLASS);
            String str4 = map.get(Constants.METHOD);
            if (str3 == null) {
                str3 = "";
            }
            Objects.requireNonNull(str2);
            return new StackTraceElement(str3, str4, str, Integer.parseInt(str2));
        } catch (Exception unused) {
            Log.e(TAG, "Unable to generate stack trace element from Dart error.");
            return null;
        }
    }

    private SharedPreferences getCrashlyticsSharedPrefs(Context context) {
        return context.getSharedPreferences("com.google.firebase.crashlytics", 0);
    }

    private void initInstance(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "plugins.flutter.io/firebase_crashlytics");
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        FlutterFirebasePluginRegistry.registerPlugin("plugins.flutter.io/firebase_crashlytics", this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isCrashlyticsCollectionEnabled(u7.f fVar) {
        fVar.a();
        SharedPreferences crashlyticsSharedPrefs = getCrashlyticsSharedPrefs(fVar.f15084a);
        if (crashlyticsSharedPrefs.contains(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED)) {
            return crashlyticsSharedPrefs.getBoolean(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED, true);
        }
        fVar.a();
        Boolean readCrashlyticsDataCollectionEnabledFromManifest = readCrashlyticsDataCollectionEnabledFromManifest(fVar.f15084a);
        f8.c.a().c(readCrashlyticsDataCollectionEnabledFromManifest);
        return readCrashlyticsDataCollectionEnabledFromManifest.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$checkForUnsentReports$0(TaskCompletionSource taskCompletionSource) {
        Task<Boolean> task;
        try {
            n nVar = f8.c.a().f5482a.f8631h;
            if (nVar.f8610s.compareAndSet(false, true)) {
                task = nVar.f8607p.getTask();
            } else {
                Log.w("FirebaseCrashlytics", "checkForUnsentReports should only be called once per execution.", null);
                task = Tasks.forResult(Boolean.FALSE);
            }
            taskCompletionSource.setResult(new HashMap<String, Object>(((Boolean) Tasks.await(task)).booleanValue()) { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.1
                public final /* synthetic */ boolean val$unsentReports;

                {
                    this.val$unsentReports = r2;
                    put(Constants.UNSENT_REPORTS, Boolean.valueOf(r2));
                }
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$crash$1() {
        throw new FirebaseCrashlyticsTestCrash();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$deleteUnsentReports$2(TaskCompletionSource taskCompletionSource) {
        try {
            n nVar = f8.c.a().f5482a.f8631h;
            nVar.f8608q.trySetResult(Boolean.FALSE);
            nVar.f8609r.getTask();
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$didCrashOnPreviousExecution$3(TaskCompletionSource taskCompletionSource) {
        try {
            taskCompletionSource.setResult(new HashMap<String, Object>(f8.c.a().f5482a.f8630g) { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.2
                public final /* synthetic */ boolean val$didCrashOnPreviousExecution;

                {
                    this.val$didCrashOnPreviousExecution = r2;
                    put(Constants.DID_CRASH_ON_PREVIOUS_EXECUTION, Boolean.valueOf(r2));
                }
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
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
    public /* synthetic */ void lambda$getPluginConstantsForFirebaseApp$11(TaskCompletionSource taskCompletionSource, u7.f fVar) {
        try {
            taskCompletionSource.setResult(new HashMap<String, Object>(fVar) { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.4
                public final /* synthetic */ u7.f val$firebaseApp;

                {
                    this.val$firebaseApp = fVar;
                    fVar.a();
                    if (fVar.f15085b.equals("[DEFAULT]")) {
                        put(Constants.IS_CRASHLYTICS_COLLECTION_ENABLED, Boolean.valueOf(FlutterFirebaseCrashlyticsPlugin.this.isCrashlyticsCollectionEnabled(u7.f.e())));
                    }
                }
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$log$5(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get(Constants.MESSAGE);
            Objects.requireNonNull(obj);
            s sVar = f8.c.a().f5482a;
            sVar.getClass();
            sVar.f8639p.f9140a.a(new j8.q(sVar, System.currentTimeMillis() - sVar.f8628d, (String) obj));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onMethodCall$10(MethodChannel.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
        } else {
            Exception exception = task.getException();
            result.error("firebase_crashlytics", exception != null ? exception.getMessage() : "An unknown error occurred", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$recordError$4(Map map, TaskCompletionSource taskCompletionSource) {
        FlutterError flutterError;
        try {
            f8.c a10 = f8.c.a();
            Object obj = map.get(Constants.EXCEPTION);
            Objects.requireNonNull(obj);
            String str = (String) obj;
            String str2 = (String) map.get(Constants.REASON);
            Object obj2 = map.get(Constants.INFORMATION);
            Objects.requireNonNull(obj2);
            String str3 = (String) obj2;
            Object obj3 = map.get(Constants.FATAL);
            Objects.requireNonNull(obj3);
            boolean booleanValue = ((Boolean) obj3).booleanValue();
            Object obj4 = map.get(Constants.BUILD_ID);
            Objects.requireNonNull(obj4);
            String str4 = (String) obj4;
            Object obj5 = map.get(Constants.LOADING_UNITS);
            Objects.requireNonNull(obj5);
            List<String> list = (List) obj5;
            int i10 = 7;
            if (str4.length() > 0) {
                s sVar = f8.c.a().f5482a;
                sVar.f8639p.f9140a.a(new g(sVar, "com.crashlytics.flutter.build-id.0", str4, i10));
            }
            int i11 = 0;
            for (String str5 : list) {
                i11++;
                s sVar2 = f8.c.a().f5482a;
                sVar2.f8639p.f9140a.a(new g(sVar2, "com.crashlytics.flutter.build-id." + i11, str5, i10));
            }
            int i12 = 4;
            if (str2 != null) {
                s sVar3 = a10.f5482a;
                sVar3.f8639p.f9140a.a(new t0.d(sVar3, Constants.FLUTTER_ERROR_REASON, "thrown " + str2, i12));
                flutterError = new FlutterError(str + ". Error thrown " + str2 + ".");
            } else {
                flutterError = new FlutterError(str);
            }
            String str6 = Constants.FLUTTER_ERROR_EXCEPTION;
            s sVar4 = a10.f5482a;
            sVar4.f8639p.f9140a.a(new t0.d(sVar4, str6, str, i12));
            ArrayList arrayList = new ArrayList();
            Object obj6 = map.get(Constants.STACK_TRACE_ELEMENTS);
            Objects.requireNonNull(obj6);
            Iterator it = ((List) obj6).iterator();
            while (it.hasNext()) {
                try {
                    StackTraceElement generateStackTraceElement = generateStackTraceElement((Map) it.next());
                    if (generateStackTraceElement != null) {
                        arrayList.add(generateStackTraceElement);
                    }
                } catch (Exception e10) {
                    e = e10;
                    taskCompletionSource.setException(e);
                    return;
                }
            }
            flutterError.setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[0]));
            if (!str3.isEmpty()) {
                s sVar5 = a10.f5482a;
                sVar5.getClass();
                sVar5.f8639p.f9140a.a(new j8.q(sVar5, System.currentTimeMillis() - sVar5.f8628d, str3));
            }
            if (booleanValue) {
                x6.b.n0(flutterError);
            } else {
                a10.b(flutterError);
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e11) {
            e = e11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$sendUnsentReports$6(TaskCompletionSource taskCompletionSource) {
        try {
            n nVar = f8.c.a().f5482a.f8631h;
            nVar.f8608q.trySetResult(Boolean.TRUE);
            nVar.f8609r.getTask();
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setCrashlyticsCollectionEnabled$7(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get("enabled");
            Objects.requireNonNull(obj);
            f8.c.a().c((Boolean) obj);
            taskCompletionSource.setResult(new HashMap<String, Object>() { // from class: io.flutter.plugins.firebase.crashlytics.FlutterFirebaseCrashlyticsPlugin.3
                {
                    put(Constants.IS_CRASHLYTICS_COLLECTION_ENABLED, Boolean.valueOf(FlutterFirebaseCrashlyticsPlugin.this.isCrashlyticsCollectionEnabled(u7.f.e())));
                }
            });
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$setCustomKey$9(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get(Constants.KEY);
            Objects.requireNonNull(obj);
            Object obj2 = map.get("value");
            Objects.requireNonNull(obj2);
            s sVar = f8.c.a().f5482a;
            sVar.f8639p.f9140a.a(new t0.d(sVar, (String) obj, (String) obj2, 4));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$setUserIdentifier$8(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            Object obj = map.get(Constants.IDENTIFIER);
            Objects.requireNonNull(obj);
            s sVar = f8.c.a().f5482a;
            sVar.f8639p.f9140a.a(new f(15, sVar, (String) obj));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private Task<Void> log(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new c(map, taskCompletionSource, 0));
        return taskCompletionSource.getTask();
    }

    private static Boolean readCrashlyticsDataCollectionEnabledFromManifest(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED)) {
                return Boolean.valueOf(applicationInfo.metaData.getBoolean(FIREBASE_CRASHLYTICS_COLLECTION_ENABLED));
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e10);
        }
        return Boolean.TRUE;
    }

    private Task<Void> recordError(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new x0(this, map, taskCompletionSource, 11));
        return taskCompletionSource.getTask();
    }

    private Task<Void> sendUnsentReports() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(1, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    private Task<Map<String, Object>> setCrashlyticsCollectionEnabled(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(this, map, taskCompletionSource, 13));
        return taskCompletionSource.getTask();
    }

    private Task<Void> setCustomKey(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new a(map, taskCompletionSource, 1));
        return taskCompletionSource.getTask();
    }

    private Task<Void> setUserIdentifier(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new a(map, taskCompletionSource, 0));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new io.flutter.plugins.firebase.analytics.e(1, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(u7.f fVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new t0.d(this, taskCompletionSource, fVar, 7));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger());
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
        Task didCrashOnPreviousExecution;
        String str = methodCall.method;
        str.getClass();
        int i10 = 0;
        switch (str) {
            case "Crashlytics#didCrashOnPreviousExecution":
                didCrashOnPreviousExecution = didCrashOnPreviousExecution();
                break;
            case "Crashlytics#recordError":
                didCrashOnPreviousExecution = recordError((Map) methodCall.arguments());
                break;
            case "Crashlytics#checkForUnsentReports":
                didCrashOnPreviousExecution = checkForUnsentReports();
                break;
            case "Crashlytics#sendUnsentReports":
                didCrashOnPreviousExecution = sendUnsentReports();
                break;
            case "Crashlytics#setCrashlyticsCollectionEnabled":
                didCrashOnPreviousExecution = setCrashlyticsCollectionEnabled((Map) methodCall.arguments());
                break;
            case "Crashlytics#log":
                didCrashOnPreviousExecution = log((Map) methodCall.arguments());
                break;
            case "Crashlytics#setCustomKey":
                didCrashOnPreviousExecution = setCustomKey((Map) methodCall.arguments());
                break;
            case "Crashlytics#deleteUnsentReports":
                didCrashOnPreviousExecution = deleteUnsentReports();
                break;
            case "Crashlytics#setUserIdentifier":
                didCrashOnPreviousExecution = setUserIdentifier((Map) methodCall.arguments());
                break;
            case "Crashlytics#crash":
                crash();
                return;
            default:
                result.notImplemented();
                return;
        }
        didCrashOnPreviousExecution.addOnCompleteListener(new d(i10, result));
    }
}
