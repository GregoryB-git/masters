package cb;

import android.app.Activity;
import defpackage.h;
import ec.i;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;

/* loaded from: classes.dex */
public final class c implements FlutterPlugin, h, ActivityAware {

    /* renamed from: a, reason: collision with root package name */
    public b f2557a;

    @Override // defpackage.h
    public final void a(defpackage.b bVar) {
        b bVar2 = this.f2557a;
        i.b(bVar2);
        Activity activity = bVar2.f2556a;
        if (activity == null) {
            throw new a();
        }
        i.b(activity);
        boolean z10 = (activity.getWindow().getAttributes().flags & 128) != 0;
        Boolean bool = bVar.f1557a;
        i.b(bool);
        if (bool.booleanValue()) {
            if (z10) {
                return;
            }
            activity.getWindow().addFlags(128);
        } else if (z10) {
            activity.getWindow().clearFlags(128);
        }
    }

    @Override // defpackage.h
    public final defpackage.a isEnabled() {
        b bVar = this.f2557a;
        i.b(bVar);
        Activity activity = bVar.f2556a;
        if (activity == null) {
            throw new a();
        }
        i.b(activity);
        return new defpackage.a(Boolean.valueOf((activity.getWindow().getAttributes().flags & 128) != 0));
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        i.e(activityPluginBinding, "binding");
        b bVar = this.f2557a;
        if (bVar != null) {
            bVar.f2556a = activityPluginBinding.getActivity();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        i.e(flutterPluginBinding, "flutterPluginBinding");
        h.a aVar = h.f7004g;
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        i.d(binaryMessenger, "getBinaryMessenger(...)");
        h.a.a(aVar, binaryMessenger, this);
        this.f2557a = new b();
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        b bVar = this.f2557a;
        if (bVar != null) {
            bVar.f2556a = null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        i.e(flutterPluginBinding, "binding");
        h.a aVar = h.f7004g;
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        i.d(binaryMessenger, "getBinaryMessenger(...)");
        h.a.a(aVar, binaryMessenger, null);
        this.f2557a = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        i.e(activityPluginBinding, "binding");
        onAttachedToActivity(activityPluginBinding);
    }
}
