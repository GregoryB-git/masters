package io.flutter.plugins.firebase.core;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import defpackage.e;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l6.b;
import l8.m;
import u7.f;
import u7.j;
import v3.x0;
import x0.g;

/* loaded from: classes.dex */
public class FlutterFirebaseCorePlugin implements FlutterPlugin, GeneratedAndroidFirebaseCore.FirebaseCoreHostApi, GeneratedAndroidFirebaseCore.FirebaseAppHostApi {
    public static Map<String, String> customAuthDomain = new HashMap();
    private Context applicationContext;
    private boolean coreInitialized = false;

    private Task<GeneratedAndroidFirebaseCore.PigeonInitializeResponse> firebaseAppToMap(f fVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(this, fVar, taskCompletionSource, 11));
        return taskCompletionSource.getTask();
    }

    private GeneratedAndroidFirebaseCore.PigeonFirebaseOptions firebaseOptionsToMap(j jVar) {
        GeneratedAndroidFirebaseCore.PigeonFirebaseOptions.Builder builder = new GeneratedAndroidFirebaseCore.PigeonFirebaseOptions.Builder();
        builder.setApiKey(jVar.f15096a);
        builder.setAppId(jVar.f15097b);
        String str = jVar.f15100e;
        if (str != null) {
            builder.setMessagingSenderId(str);
        }
        String str2 = jVar.f15101g;
        if (str2 != null) {
            builder.setProjectId(str2);
        }
        builder.setDatabaseURL(jVar.f15098c);
        builder.setStorageBucket(jVar.f);
        builder.setTrackingId(jVar.f15099d);
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$delete$7(String str, TaskCompletionSource taskCompletionSource) {
        try {
            try {
                f.f(str).b();
            } catch (IllegalStateException unused) {
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$firebaseAppToMap$0(f fVar, TaskCompletionSource taskCompletionSource) {
        try {
            GeneratedAndroidFirebaseCore.PigeonInitializeResponse.Builder builder = new GeneratedAndroidFirebaseCore.PigeonInitializeResponse.Builder();
            fVar.a();
            builder.setName(fVar.f15085b);
            fVar.a();
            builder.setOptions(firebaseOptionsToMap(fVar.f15086c));
            builder.setIsAutomaticDataCollectionEnabled(Boolean.valueOf(fVar.k()));
            builder.setPluginConstants((Map) Tasks.await(FlutterFirebasePluginRegistry.getPluginConstantsForFirebaseApp(fVar)));
            taskCompletionSource.setResult(builder.build());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initializeApp$2(GeneratedAndroidFirebaseCore.PigeonFirebaseOptions pigeonFirebaseOptions, String str, TaskCompletionSource taskCompletionSource) {
        try {
            String apiKey = pigeonFirebaseOptions.getApiKey();
            m6.j.f("ApiKey must be set.", apiKey);
            String appId = pigeonFirebaseOptions.getAppId();
            m6.j.f("ApplicationId must be set.", appId);
            String databaseURL = pigeonFirebaseOptions.getDatabaseURL();
            String messagingSenderId = pigeonFirebaseOptions.getMessagingSenderId();
            String projectId = pigeonFirebaseOptions.getProjectId();
            j jVar = new j(appId, apiKey, databaseURL, pigeonFirebaseOptions.getTrackingId(), messagingSenderId, pigeonFirebaseOptions.getStorageBucket(), projectId);
            try {
                Looper.prepare();
            } catch (Exception unused) {
            }
            if (pigeonFirebaseOptions.getAuthDomain() != null) {
                customAuthDomain.put(str, pigeonFirebaseOptions.getAuthDomain());
            }
            taskCompletionSource.setResult((GeneratedAndroidFirebaseCore.PigeonInitializeResponse) Tasks.await(firebaseAppToMap(f.j(this.applicationContext, jVar, str))));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$initializeCore$3(TaskCompletionSource taskCompletionSource) {
        ArrayList arrayList;
        try {
            if (this.coreInitialized) {
                Tasks.await(FlutterFirebasePluginRegistry.didReinitializeFirebaseCore());
            } else {
                this.coreInitialized = true;
            }
            synchronized (f.f15082k) {
                arrayList = new ArrayList(f.f15083l.values());
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((GeneratedAndroidFirebaseCore.PigeonInitializeResponse) Tasks.await(firebaseAppToMap((f) it.next())));
            }
            taskCompletionSource.setResult(arrayList2);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$listenToResponse$1(GeneratedAndroidFirebaseCore.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
        } else {
            result.error(task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$optionsFromResource$4(TaskCompletionSource taskCompletionSource) {
        try {
            j a10 = j.a(this.applicationContext);
            if (a10 == null) {
                taskCompletionSource.setException(new Exception("Failed to load FirebaseOptions from resource. Check that you have defined values.xml correctly."));
            } else {
                taskCompletionSource.setResult(firebaseOptionsToMap(a10));
            }
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setAutomaticDataCollectionEnabled$5(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        try {
            f.f(str).m(bool);
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$setAutomaticResourceManagementEnabled$6(String str, Boolean bool, TaskCompletionSource taskCompletionSource) {
        boolean z10;
        try {
            f f = f.f(str);
            boolean booleanValue = bool.booleanValue();
            f.a();
            if (f.f15088e.compareAndSet(!booleanValue, booleanValue)) {
                boolean z11 = b.f9632e.f9633a.get();
                if (!booleanValue || !z11) {
                    z10 = booleanValue || !z11;
                }
                f.l(z10);
            }
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private <T> void listenToResponse(TaskCompletionSource<T> taskCompletionSource, GeneratedAndroidFirebaseCore.Result<T> result) {
        taskCompletionSource.getTask().addOnCompleteListener(new e(result, 2));
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi
    public void delete(String str, GeneratedAndroidFirebaseCore.Result<Void> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new x0.f(25, str, taskCompletionSource));
        listenToResponse(taskCompletionSource, result);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi
    public void initializeApp(String str, GeneratedAndroidFirebaseCore.PigeonFirebaseOptions pigeonFirebaseOptions, GeneratedAndroidFirebaseCore.Result<GeneratedAndroidFirebaseCore.PigeonInitializeResponse> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new m(this, pigeonFirebaseOptions, str, taskCompletionSource));
        listenToResponse(taskCompletionSource, result);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi
    public void initializeCore(GeneratedAndroidFirebaseCore.Result<List<GeneratedAndroidFirebaseCore.PigeonInitializeResponse>> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new x0.f(26, this, taskCompletionSource));
        listenToResponse(taskCompletionSource, result);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.e(flutterPluginBinding.getBinaryMessenger(), this);
        GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.e(flutterPluginBinding.getBinaryMessenger(), this);
        this.applicationContext = flutterPluginBinding.getApplicationContext();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.applicationContext = null;
        GeneratedAndroidFirebaseCore.FirebaseCoreHostApi.CC.e(flutterPluginBinding.getBinaryMessenger(), null);
        GeneratedAndroidFirebaseCore.FirebaseAppHostApi.CC.e(flutterPluginBinding.getBinaryMessenger(), null);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseCoreHostApi
    public void optionsFromResource(GeneratedAndroidFirebaseCore.Result<GeneratedAndroidFirebaseCore.PigeonFirebaseOptions> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new w.g(29, this, taskCompletionSource));
        listenToResponse(taskCompletionSource, result);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi
    public void setAutomaticDataCollectionEnabled(String str, Boolean bool, GeneratedAndroidFirebaseCore.Result<Void> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new x0(str, bool, taskCompletionSource, 10));
        listenToResponse(taskCompletionSource, result);
    }

    @Override // io.flutter.plugins.firebase.core.GeneratedAndroidFirebaseCore.FirebaseAppHostApi
    public void setAutomaticResourceManagementEnabled(String str, Boolean bool, GeneratedAndroidFirebaseCore.Result<Void> result) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new g(str, bool, taskCompletionSource, 12));
        listenToResponse(taskCompletionSource, result);
    }
}
