package io.flutter.plugins.firebase.functions;

import android.net.Uri;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.a;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.flutter.plugins.firebase.crashlytics.b;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import m6.j;
import o9.e;
import o9.f;
import o9.i;
import o9.m;
import o9.o;
import o9.p;
import t0.d;
import v5.n;

/* loaded from: classes.dex */
public class FlutterFirebaseFunctionsPlugin implements FlutterPlugin, FlutterFirebasePlugin, MethodChannel.MethodCallHandler {
    private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/firebase_functions";
    private MethodChannel channel;

    private Map<String, Object> getExceptionDetails(Exception exc) {
        HashMap hashMap = new HashMap();
        if (exc == null) {
            return hashMap;
        }
        String message = exc.getMessage();
        Object obj = null;
        String str = "UNAVAILABLE";
        if (exc.getCause() instanceof f) {
            f fVar = (f) exc.getCause();
            String name = fVar.f12103a.name();
            String message2 = fVar.getMessage();
            Object obj2 = fVar.f12104b;
            if (((fVar.getCause() instanceof IOException) && "Canceled".equals(fVar.getCause().getMessage())) || ((fVar.getCause() instanceof InterruptedIOException) && "timeout".equals(fVar.getCause().getMessage()))) {
                f.a aVar = f.a.OK;
                obj = obj2;
                message = "DEADLINE_EXCEEDED";
                str = message;
            } else if (fVar.getCause() instanceof IOException) {
                f.a aVar2 = f.a.OK;
                obj = obj2;
                message = "UNAVAILABLE";
            } else {
                str = name;
                message = message2;
                obj = obj2;
            }
        } else {
            str = "UNKNOWN";
        }
        hashMap.put("code", str.replace("_", "-").toLowerCase());
        hashMap.put(Constants.MESSAGE, message);
        if (obj != null) {
            hashMap.put("additionalData", obj);
        }
        return hashMap;
    }

    private e getFunctions(Map<String, Object> map) {
        e eVar;
        Object obj = map.get("appName");
        Objects.requireNonNull(obj);
        Object obj2 = map.get("region");
        Objects.requireNonNull(obj2);
        String str = (String) obj2;
        u7.f f = u7.f.f((String) obj);
        TaskCompletionSource<Void> taskCompletionSource = e.f12090j;
        i iVar = (i) f.c(i.class);
        j.j(iVar, "Functions component does not exist.");
        synchronized (iVar) {
            eVar = (e) iVar.f12120b.get(str);
            if (eVar == null) {
                eVar = iVar.f12119a.a(str);
                iVar.f12120b.put(str, eVar);
            }
        }
        ec.i.b(eVar);
        return eVar;
    }

    private Task<Object> httpsFunctionCall(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new d(this, map, taskCompletionSource, 10));
        return taskCompletionSource.getTask();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$httpsFunctionCall$0(Map map, TaskCompletionSource taskCompletionSource) {
        p3.f fVar;
        try {
            e functions = getFunctions(map);
            String str = (String) map.get("functionName");
            String str2 = (String) map.get("functionUri");
            String str3 = (String) map.get("origin");
            Integer num = (Integer) map.get("timeout");
            Object obj = map.get("limitedUseAppCheckToken");
            Objects.requireNonNull(obj);
            boolean booleanValue = ((Boolean) obj).booleanValue();
            Object obj2 = map.get(io.flutter.plugins.firebase.analytics.Constants.PARAMETERS);
            if (str3 != null) {
                Uri parse = Uri.parse(str3);
                String host = parse.getHost();
                int port = parse.getPort();
                functions.getClass();
                ec.i.e(host, URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST);
                functions.f12099i = new n(host, port);
            }
            o oVar = new o(booleanValue);
            if (str != null) {
                functions.getClass();
                fVar = new p3.f(functions, str, new m(oVar));
            } else {
                if (str2 == null) {
                    throw new IllegalArgumentException("Either functionName or functionUri must be set");
                }
                URL url = new URL(str2);
                functions.getClass();
                fVar = new p3.f(functions, url, new m(oVar));
            }
            if (num != null) {
                long longValue = num.longValue();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                ec.i.e(timeUnit, "units");
                m mVar = (m) fVar.f12995e;
                mVar.getClass();
                mVar.f12127a = longValue;
                mVar.f12128b = timeUnit;
            }
            taskCompletionSource.setResult(((p) Tasks.await(fVar.a(obj2))).f12134a);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMethodCall$1(MethodChannel.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
        } else {
            Exception exception = task.getException();
            result.error("firebase_functions", exception != null ? exception.getMessage() : null, getExceptionDetails(exception));
        }
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new a(1, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(u7.f fVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new b(3, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), METHOD_CHANNEL_NAME);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.channel.setMethodCallHandler(null);
        this.channel = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (methodCall.method.equals("FirebaseFunctions#call")) {
            httpsFunctionCall((Map) methodCall.arguments()).addOnCompleteListener(new xa.a(this, result, 1));
        } else {
            result.notImplemented();
        }
    }
}
