package d3;

import android.app.Activity;
import android.os.Build;
import android.view.Display;
import android.view.Window;
import android.view.WindowManager;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public class b implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware {

    /* renamed from: a, reason: collision with root package name */
    public Activity f3423a;

    public final Display a() {
        Display display;
        if (Build.VERSION.SDK_INT < 30) {
            return ((WindowManager) this.f3423a.getSystemService("window")).getDefaultDisplay();
        }
        display = this.f3423a.getDisplay();
        return display;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f3423a = activityPluginBinding.getActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "flutter_display_mode").setMethodCallHandler(this);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        this.f3423a = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        int i10;
        HashMap hashMap;
        Object valueOf;
        if (this.f3423a == null) {
            result.error("noActivity", "Activity not attached to plugin. App is probably in background.", null);
        }
        String str = methodCall.method;
        str.getClass();
        i10 = 0;
        switch (str) {
            case "getPreferredMode":
                WindowManager.LayoutParams attributes = this.f3423a.getWindow().getAttributes();
                Display.Mode[] supportedModes = a().getSupportedModes();
                int length = supportedModes.length;
                while (true) {
                    if (i10 < length) {
                        Display.Mode mode = supportedModes[i10];
                        if (attributes.preferredDisplayModeId == mode.getModeId()) {
                            hashMap = new HashMap();
                            hashMap.put("id", Integer.valueOf(mode.getModeId()));
                            hashMap.put("width", Integer.valueOf(mode.getPhysicalWidth()));
                            hashMap.put("height", Integer.valueOf(mode.getPhysicalHeight()));
                            valueOf = Float.valueOf(mode.getRefreshRate());
                        } else {
                            i10++;
                        }
                    } else {
                        hashMap = new HashMap();
                        hashMap.put("id", 0);
                        hashMap.put("width", 0);
                        hashMap.put("height", 0);
                        valueOf = Double.valueOf(0.0d);
                    }
                }
                hashMap.put("refreshRate", valueOf);
                result.success(hashMap);
                break;
            case "setPreferredMode":
                int intValue = ((Integer) methodCall.argument("mode")).intValue();
                Window window = this.f3423a.getWindow();
                WindowManager.LayoutParams attributes2 = window.getAttributes();
                attributes2.preferredDisplayModeId = intValue;
                window.setAttributes(attributes2);
                result.success(null);
                break;
            case "getActiveMode":
                Display.Mode mode2 = a().getMode();
                HashMap hashMap2 = new HashMap();
                hashMap2.put("id", Integer.valueOf(mode2.getModeId()));
                hashMap2.put("width", Integer.valueOf(mode2.getPhysicalWidth()));
                hashMap2.put("height", Integer.valueOf(mode2.getPhysicalHeight()));
                hashMap2.put("refreshRate", Float.valueOf(mode2.getRefreshRate()));
                result.success(hashMap2);
                break;
            case "getSupportedModes":
                ArrayList arrayList = new ArrayList();
                Display.Mode[] supportedModes2 = a().getSupportedModes();
                int length2 = supportedModes2.length;
                while (i10 < length2) {
                    Display.Mode mode3 = supportedModes2[i10];
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("id", Integer.valueOf(mode3.getModeId()));
                    hashMap3.put("width", Integer.valueOf(mode3.getPhysicalWidth()));
                    hashMap3.put("height", Integer.valueOf(mode3.getPhysicalHeight()));
                    hashMap3.put("refreshRate", Float.valueOf(mode3.getRefreshRate()));
                    arrayList.add(hashMap3);
                    i10++;
                }
                result.success(arrayList);
                break;
            default:
                result.notImplemented();
                break;
        }
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        onAttachedToActivity(activityPluginBinding);
    }
}
