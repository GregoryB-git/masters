package f3;

import android.app.Activity;
import android.content.Context;
import ec.i;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodChannel;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class a implements FlutterPlugin, ActivityAware, MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f5327a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference<Activity> f5328b = new WeakReference<>(null);

    /* renamed from: c, reason: collision with root package name */
    public WeakReference<Context> f5329c = new WeakReference<>(null);

    public final Context a() {
        Context context = this.f5329c.get();
        if (context != null) {
            return context;
        }
        Activity activity = this.f5328b.get();
        if (activity != null) {
            return activity.getApplicationContext();
        }
        return null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        i.e(activityPluginBinding, "binding");
        this.f5328b = new WeakReference<>(activityPluginBinding.getActivity());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        i.e(flutterPluginBinding, "flutterPluginBinding");
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), ((b) this).f5330d);
        this.f5327a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f5329c = new WeakReference<>(flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        this.f5328b.clear();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        this.f5328b.clear();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        i.e(flutterPluginBinding, "binding");
        MethodChannel methodChannel = this.f5327a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        } else {
            i.i("channel");
            throw null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        i.e(activityPluginBinding, "binding");
        this.f5328b = new WeakReference<>(activityPluginBinding.getActivity());
    }
}
