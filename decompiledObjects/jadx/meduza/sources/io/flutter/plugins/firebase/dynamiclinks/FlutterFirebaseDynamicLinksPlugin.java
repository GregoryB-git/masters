package io.flutter.plugins.firebase.dynamiclinks;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.dynamiclinks.internal.b;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.firebase.analytics.e;
import io.flutter.plugins.firebase.auth.g;
import io.flutter.plugins.firebase.core.FlutterFirebasePlugin;
import io.flutter.plugins.firebase.core.FlutterFirebasePluginRegistry;
import io.flutter.plugins.urllauncher.WebViewActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import m6.j;
import u7.f;
import v8.a;
import v8.c;
import v8.d;
import x0.d;

/* loaded from: classes.dex */
public class FlutterFirebaseDynamicLinksPlugin implements FlutterFirebasePlugin, FlutterPlugin, ActivityAware, MethodChannel.MethodCallHandler, PluginRegistry.NewIntentListener {
    private static final String METHOD_CHANNEL_NAME = "plugins.flutter.io/firebase_dynamic_links";
    private static final String TAG = "FLTFirebaseDynamicLinks";
    private final AtomicReference<Activity> activity = new AtomicReference<>(null);
    private Map<String, Object> cachedDynamicLinkData;
    private Map<String, Object> cachedDynamicLinkException;
    private MethodChannel channel;

    private String buildLink(Map<String, Object> map) {
        a aVar = setupParameters(map);
        b.d(aVar.f16005b);
        Bundle bundle = aVar.f16005b;
        b.d(bundle);
        Uri uri = (Uri) bundle.getParcelable("dynamicLink");
        if (uri == null) {
            Uri.Builder builder = new Uri.Builder();
            String string = bundle.getString("domainUriPrefix");
            j.i(string);
            Uri parse = Uri.parse(string);
            builder.scheme(parse.getScheme());
            builder.authority(parse.getAuthority());
            builder.path(parse.getPath());
            Bundle bundle2 = bundle.getBundle(io.flutter.plugins.firebase.analytics.Constants.PARAMETERS);
            if (bundle2 != null) {
                for (String str : bundle2.keySet()) {
                    Object obj = bundle2.get(str);
                    if (obj != null) {
                        builder.appendQueryParameter(str, obj.toString());
                    }
                }
            }
            uri = builder.build();
        }
        return uri.toString();
    }

    private Task<Map<String, Object>> buildShortLink(Map<String, Object> map) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new d(this, map, taskCompletionSource, 6));
        return taskCompletionSource.getTask();
    }

    private void checkForCachedData() {
        Map<String, Object> map = this.cachedDynamicLinkData;
        if (map != null) {
            this.channel.invokeMethod("FirebaseDynamicLink#onLinkSuccess", map);
            this.cachedDynamicLinkData = null;
        }
        Map<String, Object> map2 = this.cachedDynamicLinkException;
        if (map2 != null) {
            this.channel.invokeMethod("FirebaseDynamicLink#onLinkError", map2);
            this.cachedDynamicLinkException = null;
        }
    }

    private void detachToActivity() {
        this.activity.set(null);
    }

    private Task<Map<String, Object>> getDynamicLink(v8.b bVar, String str) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new p3.a(this, str, bVar, taskCompletionSource, 2));
        return taskCompletionSource.getTask();
    }

    public static v8.b getDynamicLinkInstance(Map<String, Object> map) {
        v8.b bVar;
        String str;
        v8.b bVar2;
        if (map != null && (str = (String) map.get("appName")) != null) {
            f f = f.f(str);
            synchronized (v8.b.class) {
                bVar2 = (v8.b) f.c(v8.b.class);
            }
            return bVar2;
        }
        synchronized (v8.b.class) {
            f e10 = f.e();
            synchronized (v8.b.class) {
                bVar = (v8.b) e10.c(v8.b.class);
            }
            return bVar;
        }
        return bVar;
    }

    private void initInstance(BinaryMessenger binaryMessenger) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, METHOD_CHANNEL_NAME);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(this);
        FlutterFirebasePluginRegistry.registerPlugin(METHOD_CHANNEL_NAME, this);
        checkForCachedData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$buildShortLink$3(Map map, TaskCompletionSource taskCompletionSource) {
        try {
            a aVar = setupParameters(map);
            String str = (String) map.get("longDynamicLink");
            if (str != null) {
                aVar.f16005b.putParcelable("dynamicLink", Uri.parse(str));
            }
            Integer num = 1;
            Integer num2 = (Integer) map.get("shortLinkType");
            if (num2 != null) {
                int intValue = num2.intValue();
                if (intValue == 0) {
                    num = 1;
                } else if (intValue == 1) {
                    num = 2;
                }
            }
            HashMap hashMap = new HashMap();
            v8.d dVar = (v8.d) Tasks.await(aVar.a(num.intValue()));
            ArrayList arrayList = new ArrayList();
            Iterator<? extends d.a> it = dVar.x().iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().i());
            }
            hashMap.put(WebViewActivity.URL_EXTRA, dVar.y().toString());
            hashMap.put("warnings", arrayList);
            hashMap.put("previewLink", dVar.p().toString());
            taskCompletionSource.setResult(hashMap);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getDynamicLink$4(String str, v8.b bVar, TaskCompletionSource taskCompletionSource) {
        Object await;
        try {
            if (str == null) {
                if (this.activity.get() != null && this.activity.get().getIntent() != null && !this.activity.get().getIntent().getBooleanExtra("flutterfire-used-link", false)) {
                    this.activity.get().getIntent().putExtra("flutterfire-used-link", true);
                    await = Tasks.await(bVar.b(this.activity.get().getIntent()));
                }
                taskCompletionSource.setResult(null);
                return;
            }
            await = Tasks.await(bVar.c(Uri.parse(str)));
            taskCompletionSource.setResult(Utils.getMapFromPendingDynamicLinkData((c) await));
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onMethodCall$2(MethodChannel.Result result, Task task) {
        if (task.isSuccessful()) {
            result.success(task.getResult());
        } else {
            Exception exception = task.getException();
            result.error(Constants.DEFAULT_ERROR_CODE, exception != null ? exception.getMessage() : null, Utils.getExceptionDetails(exception));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNewIntent$0(c cVar) {
        Map<String, Object> mapFromPendingDynamicLinkData = Utils.getMapFromPendingDynamicLinkData(cVar);
        if (mapFromPendingDynamicLinkData != null) {
            MethodChannel methodChannel = this.channel;
            if (methodChannel != null) {
                methodChannel.invokeMethod("FirebaseDynamicLink#onLinkSuccess", mapFromPendingDynamicLinkData);
            } else {
                this.cachedDynamicLinkData = mapFromPendingDynamicLinkData;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onNewIntent$1(Exception exc) {
        Map<String, Object> exceptionDetails = Utils.getExceptionDetails(exc);
        MethodChannel methodChannel = this.channel;
        if (methodChannel != null) {
            methodChannel.invokeMethod("FirebaseDynamicLink#onLinkError", exceptionDetails);
        } else {
            this.cachedDynamicLinkException = exceptionDetails;
        }
    }

    private a setupParameters(Map<String, Object> map) {
        a a10 = getDynamicLinkInstance(map).a();
        Object obj = map.get("uriPrefix");
        Objects.requireNonNull(obj);
        String str = (String) obj;
        String str2 = (String) map.get("link");
        a10.getClass();
        if (str.matches("(https:\\/\\/)?[a-z0-9]{3,}\\.app\\.goo\\.gl$") || str.matches("(https:\\/\\/)?[a-z0-9]{3,}\\.page\\.link$")) {
            a10.f16005b.putString("domain", str.replace("https://", ""));
        }
        a10.f16005b.putString("domainUriPrefix", str);
        a10.f16006c.putParcelable("link", Uri.parse(str2));
        Map map2 = (Map) map.get("androidParameters");
        if (map2 != null) {
            String str3 = (String) valueFor("packageName", map2);
            String str4 = (String) valueFor("fallbackUrl", map2);
            Integer num = (Integer) valueFor("minimumVersion", map2);
            Bundle bundle = new Bundle();
            bundle.putString("apn", str3);
            if (str4 != null) {
                bundle.putParcelable("afl", Uri.parse(str4));
            }
            if (num != null) {
                bundle.putInt("amv", num.intValue());
            }
            a10.f16006c.putAll(bundle);
        }
        Map map3 = (Map) map.get("googleAnalyticsParameters");
        if (map3 != null) {
            String str5 = (String) valueFor("campaign", map3);
            String str6 = (String) valueFor("content", map3);
            String str7 = (String) valueFor("medium", map3);
            String str8 = (String) valueFor("source", map3);
            String str9 = (String) valueFor("term", map3);
            Bundle bundle2 = new Bundle();
            if (str5 != null) {
                bundle2.putString("utm_campaign", str5);
            }
            if (str6 != null) {
                bundle2.putString("utm_content", str6);
            }
            if (str7 != null) {
                bundle2.putString("utm_medium", str7);
            }
            if (str8 != null) {
                bundle2.putString("utm_source", str8);
            }
            if (str9 != null) {
                bundle2.putString("utm_term", str9);
            }
            a10.f16006c.putAll(bundle2);
        }
        Map map4 = (Map) map.get("iosParameters");
        if (map4 != null) {
            String str10 = (String) valueFor("bundleId", map4);
            String str11 = (String) valueFor("appStoreId", map4);
            String str12 = (String) valueFor("customScheme", map4);
            String str13 = (String) valueFor("fallbackUrl", map4);
            String str14 = (String) valueFor("ipadBundleId", map4);
            String str15 = (String) valueFor("ipadFallbackUrl", map4);
            String str16 = (String) valueFor("minimumVersion", map4);
            Bundle bundle3 = new Bundle();
            bundle3.putString("ibi", str10);
            if (str11 != null) {
                bundle3.putString("isi", str11);
            }
            if (str12 != null) {
                bundle3.putString("ius", str12);
            }
            if (str13 != null) {
                bundle3.putParcelable("ifl", Uri.parse(str13));
            }
            if (str14 != null) {
                bundle3.putString("ipbi", str14);
            }
            if (str15 != null) {
                bundle3.putParcelable("ipfl", Uri.parse(str15));
            }
            if (str16 != null) {
                bundle3.putString("imv", str16);
            }
            a10.f16006c.putAll(bundle3);
        }
        Map map5 = (Map) map.get("itunesConnectAnalyticsParameters");
        if (map5 != null) {
            String str17 = (String) valueFor("affiliateToken", map5);
            String str18 = (String) valueFor("campaignToken", map5);
            String str19 = (String) valueFor("providerToken", map5);
            Bundle bundle4 = new Bundle();
            if (str17 != null) {
                bundle4.putString("at", str17);
            }
            if (str18 != null) {
                bundle4.putString("ct", str18);
            }
            if (str19 != null) {
                bundle4.putString("pt", str19);
            }
            a10.f16006c.putAll(bundle4);
        }
        Map map6 = (Map) map.get("navigationInfoParameters");
        if (map6 != null) {
            Boolean bool = (Boolean) valueFor("forcedRedirectEnabled", map6);
            Bundle bundle5 = new Bundle();
            if (bool != null) {
                bundle5.putInt("efr", bool.booleanValue() ? 1 : 0);
            }
            a10.f16006c.putAll(bundle5);
        }
        Map map7 = (Map) map.get("socialMetaTagParameters");
        if (map7 != null) {
            String str20 = (String) valueFor("description", map7);
            String str21 = (String) valueFor("imageUrl", map7);
            String str22 = (String) valueFor("title", map7);
            Bundle bundle6 = new Bundle();
            if (str20 != null) {
                bundle6.putString("sd", str20);
            }
            if (str21 != null) {
                bundle6.putParcelable("si", Uri.parse(str21));
            }
            if (str22 != null) {
                bundle6.putString("st", str22);
            }
            a10.f16006c.putAll(bundle6);
        }
        return a10;
    }

    private static <T> T valueFor(String str, Map<String, Object> map) {
        return (T) map.get(str);
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Void> didReinitializeFirebaseCore() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new e(2, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.plugins.firebase.core.FlutterFirebasePlugin
    public Task<Map<String, Object>> getPluginConstantsForFirebaseApp(f fVar) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        FlutterFirebasePlugin.cachedThreadPool.execute(new db.a(0, taskCompletionSource));
        return taskCompletionSource.getTask();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.activity.set(activityPluginBinding.getActivity());
        activityPluginBinding.addOnNewIntentListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        initInstance(flutterPluginBinding.getBinaryMessenger());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivity() {
        detachToActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onDetachedFromActivityForConfigChanges() {
        detachToActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.channel.setMethodCallHandler(null);
        this.channel = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        v8.b dynamicLinkInstance;
        Task<Map<String, Object>> dynamicLink;
        dynamicLinkInstance = getDynamicLinkInstance((Map) methodCall.arguments());
        String str = methodCall.method;
        str.getClass();
        int i10 = 1;
        switch (str) {
            case "FirebaseDynamicLinks#getDynamicLink":
            case "FirebaseDynamicLinks#getInitialLink":
                dynamicLink = getDynamicLink(dynamicLinkInstance, (String) methodCall.argument(WebViewActivity.URL_EXTRA));
                break;
            case "FirebaseDynamicLinks#buildShortLink":
                Map<String, Object> map = (Map) methodCall.arguments();
                Objects.requireNonNull(map);
                dynamicLink = buildShortLink(map);
                break;
            case "FirebaseDynamicLinks#buildLink":
                result.success(buildLink((Map) methodCall.arguments()));
                return;
            default:
                result.notImplemented();
                return;
        }
        dynamicLink.addOnCompleteListener(new io.flutter.plugins.firebase.crashlytics.d(i10, result));
    }

    @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
    public boolean onNewIntent(Intent intent) {
        getDynamicLinkInstance(null).b(intent).addOnSuccessListener(new g(this, 29)).addOnFailureListener(new defpackage.d(this, 20));
        return false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        this.activity.set(activityPluginBinding.getActivity());
        activityPluginBinding.addOnNewIntentListener(this);
    }
}
