package qa;

import android.content.Context;
import io.flutter.FlutterInjector;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterEngineGroup;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.view.FlutterCallbackInformation;
import java.util.HashMap;
import java.util.LinkedList;

/* loaded from: classes.dex */
public class a implements FlutterPlugin, MethodChannel.MethodCallHandler, EventChannel.StreamHandler {

    /* renamed from: a, reason: collision with root package name */
    public LinkedList f13376a;

    /* renamed from: b, reason: collision with root package name */
    public HashMap f13377b;

    /* renamed from: c, reason: collision with root package name */
    public Context f13378c;

    /* renamed from: d, reason: collision with root package name */
    public FlutterEngineGroup f13379d;

    public final void a() {
        b bVar = (b) this.f13376a.peek();
        FlutterInjector.instance().flutterLoader().ensureInitializationComplete(this.f13378c, null);
        FlutterCallbackInformation lookupCallbackInformation = FlutterCallbackInformation.lookupCallbackInformation(bVar.f13383d.longValue());
        FlutterEngine createAndRunEngine = this.f13379d.createAndRunEngine(this.f13378c, new DartExecutor.DartEntrypoint(FlutterInjector.instance().flutterLoader().findAppBundlePath(), lookupCallbackInformation.callbackLibraryPath, lookupCallbackInformation.callbackName));
        bVar.f13380a = createAndRunEngine;
        bVar.f13382c = new MethodChannel(createAndRunEngine.getDartExecutor().getBinaryMessenger(), "com.lib.dart_ui_isolate/control");
        new EventChannel(bVar.f13380a.getDartExecutor().getBinaryMessenger(), "com.lib.dart_ui_isolate/event").setStreamHandler(this);
        bVar.f13382c.setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f13379d = new FlutterEngineGroup(flutterPluginBinding.getApplicationContext());
        BinaryMessenger binaryMessenger = flutterPluginBinding.getBinaryMessenger();
        this.f13378c = flutterPluginBinding.getApplicationContext();
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "com.lib.dart_ui_isolate/control");
        this.f13376a = new LinkedList();
        this.f13377b = new HashMap();
        methodChannel.setMethodCallHandler(this);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        if (this.f13376a.size() != 0) {
            b bVar = (b) this.f13376a.remove();
            eventSink.success(bVar.f13381b);
            eventSink.endOfStream();
            this.f13377b.put(bVar.f13381b, bVar);
            bVar.f13384e.success(null);
            bVar.f13384e = null;
        }
        if (this.f13376a.size() != 0) {
            a();
        }
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (!methodCall.method.equals("spawn_isolate")) {
            if (!methodCall.method.equals("kill_isolate")) {
                result.notImplemented();
                return;
            }
            String str = (String) methodCall.argument("isolate_id");
            try {
                ((b) this.f13377b.get(str)).f13380a.destroy();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            this.f13377b.remove(str);
            result.success(Boolean.TRUE);
            return;
        }
        b bVar = new b();
        Object argument = methodCall.argument("entry_point");
        if (argument instanceof Long) {
            bVar.f13383d = (Long) argument;
        }
        if (argument instanceof Integer) {
            bVar.f13383d = Long.valueOf(((Integer) argument).intValue());
        }
        bVar.f13381b = (String) methodCall.argument("isolate_id");
        bVar.f13384e = result;
        this.f13376a.add(bVar);
        if (this.f13376a.size() == 1) {
            a();
        }
    }
}
