package io.flutter.embedding.engine.systemchannels;

import io.flutter.FlutterInjector;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.deferredcomponents.DeferredComponentManager;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.StandardMethodCodec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class DeferredComponentChannel {
    private static final String TAG = "DeferredComponentChannel";
    private final MethodChannel channel;
    private Map<String, List<MethodChannel.Result>> componentNameToResults;
    private DeferredComponentManager deferredComponentManager;
    public final MethodChannel.MethodCallHandler parsingMethodHandler;

    public DeferredComponentChannel(DartExecutor dartExecutor) {
        MethodChannel.MethodCallHandler methodCallHandler = new MethodChannel.MethodCallHandler() { // from class: io.flutter.embedding.engine.systemchannels.DeferredComponentChannel.1
            @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
            public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
                int intValue;
                String str;
                String str2;
                if (DeferredComponentChannel.this.deferredComponentManager == null) {
                    return;
                }
                String str3 = methodCall.method;
                Map map = (Map) methodCall.arguments();
                Log.v(DeferredComponentChannel.TAG, "Received '" + str3 + "' message.");
                intValue = ((Integer) map.get("loadingUnitId")).intValue();
                str = (String) map.get("componentName");
                str3.getClass();
                switch (str3) {
                    case "uninstallDeferredComponent":
                        DeferredComponentChannel.this.deferredComponentManager.uninstallDeferredComponent(intValue, str);
                        str2 = null;
                        break;
                    case "getDeferredComponentInstallState":
                        str2 = DeferredComponentChannel.this.deferredComponentManager.getDeferredComponentInstallState(intValue, str);
                        break;
                    case "installDeferredComponent":
                        DeferredComponentChannel.this.deferredComponentManager.installDeferredComponent(intValue, str);
                        if (!DeferredComponentChannel.this.componentNameToResults.containsKey(str)) {
                            DeferredComponentChannel.this.componentNameToResults.put(str, new ArrayList());
                        }
                        ((List) DeferredComponentChannel.this.componentNameToResults.get(str)).add(result);
                        return;
                    default:
                        result.notImplemented();
                        return;
                }
                result.success(str2);
            }
        };
        this.parsingMethodHandler = methodCallHandler;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/deferredcomponent", StandardMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(methodCallHandler);
        this.deferredComponentManager = FlutterInjector.instance().deferredComponentManager();
        this.componentNameToResults = new HashMap();
    }

    public void completeInstallError(String str, String str2) {
        if (this.componentNameToResults.containsKey(str)) {
            Iterator<MethodChannel.Result> it = this.componentNameToResults.get(str).iterator();
            while (it.hasNext()) {
                it.next().error("DeferredComponent Install failure", str2, null);
            }
            this.componentNameToResults.get(str).clear();
        }
    }

    public void completeInstallSuccess(String str) {
        if (this.componentNameToResults.containsKey(str)) {
            Iterator<MethodChannel.Result> it = this.componentNameToResults.get(str).iterator();
            while (it.hasNext()) {
                it.next().success(null);
            }
            this.componentNameToResults.get(str).clear();
        }
    }

    public void setDeferredComponentManager(DeferredComponentManager deferredComponentManager) {
        this.deferredComponentManager = deferredComponentManager;
    }
}
