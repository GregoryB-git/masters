package e3;

import android.app.Activity;
import android.content.Context;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel;
import p2.m0;

/* loaded from: classes.dex */
public final class e implements FlutterPlugin, ActivityAware {

    /* renamed from: a, reason: collision with root package name */
    public f f3884a;

    /* renamed from: b, reason: collision with root package name */
    public MethodChannel f3885b;

    /* renamed from: c, reason: collision with root package name */
    public ActivityPluginBinding f3886c;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        Activity activity = activityPluginBinding.getActivity();
        f fVar = this.f3884a;
        if (fVar != null) {
            fVar.f3889c = activity;
        }
        this.f3886c = activityPluginBinding;
        activityPluginBinding.addActivityResultListener(fVar);
        this.f3886c.addRequestPermissionsResultListener(this.f3884a);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f3884a = new f(flutterPluginBinding.getApplicationContext());
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "flutter.baseflow.com/permissions/methods");
        this.f3885b = methodChannel;
        methodChannel.setMethodCallHandler(new d(applicationContext, new m0(), this.f3884a, new h()));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        f fVar = this.f3884a;
        if (fVar != null) {
            fVar.f3889c = null;
        }
        ActivityPluginBinding activityPluginBinding = this.f3886c;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeActivityResultListener(fVar);
            this.f3886c.removeRequestPermissionsResultListener(this.f3884a);
        }
        this.f3886c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f3885b.setMethodCallHandler(null);
        this.f3885b = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
