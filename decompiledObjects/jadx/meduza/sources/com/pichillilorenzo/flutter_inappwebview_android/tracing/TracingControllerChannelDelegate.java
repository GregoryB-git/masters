package com.pichillilorenzo.flutter_inappwebview_android.tracing;

import c2.i;
import com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.concurrent.Executors;
import x6.b;

/* loaded from: classes.dex */
public class TracingControllerChannelDelegate extends ChannelDelegateImpl {
    private TracingControllerManager tracingControllerManager;

    public TracingControllerChannelDelegate(TracingControllerManager tracingControllerManager, MethodChannel methodChannel) {
        super(methodChannel);
        this.tracingControllerManager = tracingControllerManager;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        super.dispose();
        this.tracingControllerManager = null;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.ChannelDelegateImpl, io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        char c10;
        Boolean valueOf;
        FileOutputStream fileOutputStream;
        TracingControllerManager.init();
        i iVar = TracingControllerManager.tracingController;
        String str = methodCall.method;
        str.getClass();
        int hashCode = str.hashCode();
        if (hashCode == -1647175624) {
            if (str.equals("isTracing")) {
                c10 = 0;
            }
            c10 = 65535;
        } else if (hashCode != 3540994) {
            if (hashCode == 109757538 && str.equals("start")) {
                c10 = 2;
            }
            c10 = 65535;
        } else {
            if (str.equals("stop")) {
                c10 = 1;
            }
            c10 = 65535;
        }
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    result.notImplemented();
                    return;
                } else if (iVar != null && b.c0("TRACING_CONTROLLER_BASIC_USAGE")) {
                    Map<String, Object> map = (Map) methodCall.argument("settings");
                    TracingSettings tracingSettings = new TracingSettings();
                    tracingSettings.parse2(map);
                    iVar.b(TracingControllerManager.buildTracingConfig(tracingSettings));
                    valueOf = Boolean.TRUE;
                }
            } else if (iVar != null && b.c0("TRACING_CONTROLLER_BASIC_USAGE")) {
                String str2 = (String) methodCall.argument("filePath");
                if (str2 != null) {
                    try {
                        fileOutputStream = new FileOutputStream(str2);
                    } catch (FileNotFoundException e10) {
                        e10.printStackTrace();
                    }
                } else {
                    fileOutputStream = null;
                }
                result.success(Boolean.valueOf(iVar.c(fileOutputStream, Executors.newSingleThreadExecutor())));
                return;
            }
            valueOf = Boolean.FALSE;
        } else {
            if (iVar != null) {
                valueOf = Boolean.valueOf(iVar.a());
            }
            valueOf = Boolean.FALSE;
        }
        result.success(valueOf);
    }
}
