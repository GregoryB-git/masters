package bb;

import android.content.Context;
import ec.i;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes.dex */
public final class e implements FlutterPlugin, ActivityAware {

    /* renamed from: a, reason: collision with root package name */
    public d f2199a;

    /* renamed from: b, reason: collision with root package name */
    public f f2200b;

    /* renamed from: c, reason: collision with root package name */
    public MethodChannel f2201c;

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        i.e(activityPluginBinding, "binding");
        f fVar = this.f2200b;
        if (fVar == null) {
            i.i("manager");
            throw null;
        }
        activityPluginBinding.addActivityResultListener(fVar);
        d dVar = this.f2199a;
        if (dVar != null) {
            dVar.f2195b = activityPluginBinding.getActivity();
        } else {
            i.i("share");
            throw null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        i.e(flutterPluginBinding, "binding");
        this.f2201c = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "dev.fluttercommunity.plus/share");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        i.d(applicationContext, "getApplicationContext(...)");
        this.f2200b = new f(applicationContext);
        Context applicationContext2 = flutterPluginBinding.getApplicationContext();
        i.d(applicationContext2, "getApplicationContext(...)");
        f fVar = this.f2200b;
        if (fVar == null) {
            i.i("manager");
            throw null;
        }
        d dVar = new d(applicationContext2, fVar);
        this.f2199a = dVar;
        f fVar2 = this.f2200b;
        if (fVar2 == null) {
            i.i("manager");
            throw null;
        }
        a aVar = new a(dVar, fVar2);
        MethodChannel methodChannel = this.f2201c;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(aVar);
        } else {
            i.i("methodChannel");
            throw null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        d dVar = this.f2199a;
        if (dVar != null) {
            dVar.f2195b = null;
        } else {
            i.i("share");
            throw null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        i.e(flutterPluginBinding, "binding");
        MethodChannel methodChannel = this.f2201c;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        } else {
            i.i("methodChannel");
            throw null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        i.e(activityPluginBinding, "binding");
        onAttachedToActivity(activityPluginBinding);
    }
}
