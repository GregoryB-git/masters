package ya;

import android.content.Context;
import android.net.ConnectivityManager;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes.dex */
public class d implements FlutterPlugin {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f17462a;

    /* renamed from: b, reason: collision with root package name */
    public EventChannel f17463b;

    /* renamed from: c, reason: collision with root package name */
    public b f17464c;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        this.f17462a = new MethodChannel(binaryMessenger, "dev.fluttercommunity.plus/connectivity");
        this.f17463b = new EventChannel(binaryMessenger, "dev.fluttercommunity.plus/connectivity_status");
        a aVar = new a((ConnectivityManager) applicationContext.getSystemService("connectivity"));
        c cVar = new c(aVar);
        this.f17464c = new b(applicationContext, aVar);
        this.f17462a.setMethodCallHandler(cVar);
        this.f17463b.setStreamHandler(this.f17464c);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f17462a.setMethodCallHandler(null);
        this.f17463b.setStreamHandler(null);
        this.f17464c.onCancel(null);
        this.f17462a = null;
        this.f17463b = null;
        this.f17464c = null;
    }
}
