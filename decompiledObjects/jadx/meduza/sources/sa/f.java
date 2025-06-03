package sa;

import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sa.e;

/* loaded from: classes.dex */
public class f implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: c, reason: collision with root package name */
    public static Map<?, ?> f14288c;

    /* renamed from: d, reason: collision with root package name */
    public static ArrayList f14289d = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f14290a;

    /* renamed from: b, reason: collision with root package name */
    public e f14291b;

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.ryanheise.audio_session");
        this.f14290a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f14291b = new e(binaryMessenger, flutterPluginBinding.getApplicationContext());
        f14289d.add(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f14290a.setMethodCallHandler(null);
        this.f14290a = null;
        e eVar = this.f14291b;
        eVar.f14280b.setMethodCallHandler(null);
        e.f14278c.f14281a.remove(eVar);
        if (e.f14278c.f14281a.size() == 0) {
            e.a aVar = e.f14278c;
            aVar.a();
            aVar.f.unregisterAudioDeviceCallback(aVar.f14286g);
            aVar.f14285e = null;
            aVar.f = null;
            e.f14278c = null;
        }
        eVar.f14280b = null;
        this.f14291b = null;
        f14289d.remove(this);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        List list = (List) methodCall.arguments;
        String str = methodCall.method;
        str.getClass();
        if (!str.equals("setConfiguration")) {
            if (str.equals("getConfiguration")) {
                result.success(f14288c);
                return;
            } else {
                result.notImplemented();
                return;
            }
        }
        f14288c = (Map) list.get(0);
        result.success(null);
        Object[] objArr = {f14288c};
        Iterator it = f14289d.iterator();
        while (it.hasNext()) {
            ((f) it.next()).f14290a.invokeMethod("onConfigurationChanged", new ArrayList(Arrays.asList(objArr)));
        }
    }
}
