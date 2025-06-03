package ua;

import android.content.Context;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes.dex */
public class c implements FlutterPlugin {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f15151a;

    /* renamed from: b, reason: collision with root package name */
    public d f15152b;

    public class a implements FlutterEngine.EngineLifecycleListener {
        public a() {
        }

        @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
        public final void onEngineWillDestroy() {
        }

        @Override // io.flutter.embedding.engine.FlutterEngine.EngineLifecycleListener
        public final void onPreEngineRestart() {
            c.this.f15152b.a();
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        this.f15152b = new d(binaryMessenger, applicationContext);
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.ryanheise.just_audio.methods");
        this.f15151a = methodChannel;
        methodChannel.setMethodCallHandler(this.f15152b);
        flutterPluginBinding.getFlutterEngine().addEngineLifecycleListener(new a());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f15152b.a();
        this.f15152b = null;
        this.f15151a.setMethodCallHandler(null);
    }
}
