package c3;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import b.e;
import ec.i;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.urllauncher.WebViewActivity;
import p.o;

/* loaded from: classes.dex */
public final class a implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware, PluginRegistry.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public static MethodChannel.Result f2236d;

    /* renamed from: e, reason: collision with root package name */
    public static e f2237e;

    /* renamed from: a, reason: collision with root package name */
    public final int f2238a = 1001;

    /* renamed from: b, reason: collision with root package name */
    public MethodChannel f2239b;

    /* renamed from: c, reason: collision with root package name */
    public ActivityPluginBinding f2240c;

    @Override // io.flutter.plugin.common.PluginRegistry.ActivityResultListener
    public final boolean onActivityResult(int i10, int i11, Intent intent) {
        MethodChannel.Result result;
        if (i10 != this.f2238a || (result = f2236d) == null) {
            return false;
        }
        result.error("authorization-error/canceled", "The user closed the Custom Tab", null);
        f2236d = null;
        f2237e = null;
        return false;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        i.e(activityPluginBinding, "binding");
        this.f2240c = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        i.e(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.aboutyou.dart_packages.sign_in_with_apple");
        this.f2239b = methodChannel;
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        ActivityPluginBinding activityPluginBinding = this.f2240c;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(this);
        }
        this.f2240c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        i.e(flutterPluginBinding, "binding");
        MethodChannel methodChannel = this.f2239b;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
        this.f2239b = null;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        Object obj;
        String str;
        String str2;
        i.e(methodCall, "call");
        i.e(result, "result");
        String str3 = methodCall.method;
        if (i.a(str3, "isAvailable")) {
            result.success(Boolean.TRUE);
            return;
        }
        if (!i.a(str3, "performAuthorizationRequest")) {
            result.notImplemented();
            return;
        }
        ActivityPluginBinding activityPluginBinding = this.f2240c;
        Activity activity = activityPluginBinding != null ? activityPluginBinding.getActivity() : null;
        if (activity == null) {
            obj = methodCall.arguments;
            str = "MISSING_ACTIVITY";
            str2 = "Plugin is not attached to an activity";
        } else {
            String str4 = (String) methodCall.argument(WebViewActivity.URL_EXTRA);
            if (str4 != null) {
                MethodChannel.Result result2 = f2236d;
                if (result2 != null) {
                    result2.error("NEW_REQUEST", "A new request came in while this was still pending. The previous request (this one) was then cancelled.", null);
                }
                e eVar = f2237e;
                if (eVar != null) {
                    eVar.invoke();
                }
                f2236d = result;
                f2237e = new e(activity, 1);
                o a10 = new o.d().a();
                a10.f12724a.setData(Uri.parse(str4));
                activity.startActivityForResult(a10.f12724a, this.f2238a, a10.f12725b);
                return;
            }
            obj = methodCall.arguments;
            str = "MISSING_ARG";
            str2 = "Missing 'url' argument";
        }
        result.error(str, str2, obj);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        i.e(activityPluginBinding, "binding");
        onAttachedToActivity(activityPluginBinding);
    }
}
