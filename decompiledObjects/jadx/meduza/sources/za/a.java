package za;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageManager;
import ec.i;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes.dex */
public final class a implements FlutterPlugin {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f17821a;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        i.e(flutterPluginBinding, "binding");
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        i.d(binaryMessenger, "getBinaryMessenger(...)");
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        i.d(applicationContext, "getApplicationContext(...)");
        this.f17821a = new MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/device_info");
        PackageManager packageManager = applicationContext.getPackageManager();
        i.d(packageManager, "getPackageManager(...)");
        Object systemService = applicationContext.getSystemService("activity");
        i.c(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        b bVar = new b(packageManager, (ActivityManager) systemService);
        MethodChannel methodChannel = this.f17821a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(bVar);
        } else {
            i.i("methodChannel");
            throw null;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        i.e(flutterPluginBinding, "binding");
        MethodChannel methodChannel = this.f17821a;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        } else {
            i.i("methodChannel");
            throw null;
        }
    }
}
