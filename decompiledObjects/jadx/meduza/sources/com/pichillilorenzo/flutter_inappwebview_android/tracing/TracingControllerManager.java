package com.pichillilorenzo.flutter_inappwebview_android.tracing;

import c2.h;
import c2.i;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.types.Disposable;
import io.flutter.plugin.common.MethodChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import x6.b;

/* loaded from: classes.dex */
public class TracingControllerManager implements Disposable {
    public static final String LOG_TAG = "TracingControllerMan";
    public static final String METHOD_CHANNEL_NAME = "com.pichillilorenzo/flutter_inappwebview_tracingcontroller";
    public static i tracingController;
    public TracingControllerChannelDelegate channelDelegate;
    public InAppWebViewFlutterPlugin plugin;

    public TracingControllerManager(InAppWebViewFlutterPlugin inAppWebViewFlutterPlugin) {
        this.plugin = inAppWebViewFlutterPlugin;
        this.channelDelegate = new TracingControllerChannelDelegate(this, new MethodChannel(inAppWebViewFlutterPlugin.messenger, METHOD_CHANNEL_NAME));
    }

    public static h buildTracingConfig(TracingSettings tracingSettings) {
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = tracingSettings.categories.iterator();
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next instanceof String) {
                arrayList.addAll(Arrays.asList((String) next));
            }
            if (next instanceof Integer) {
                int[] iArr = {((Integer) next).intValue()};
                for (int i11 = 0; i11 < 1; i11++) {
                    i10 |= iArr[i11];
                }
            }
        }
        Integer num = tracingSettings.tracingMode;
        return new h(i10, num != null ? num.intValue() : 1, arrayList);
    }

    public static void init() {
        if (tracingController == null && b.c0("TRACING_CONTROLLER_BASIC_USAGE")) {
            tracingController = i.a.f2220a;
        }
    }

    @Override // com.pichillilorenzo.flutter_inappwebview_android.types.Disposable
    public void dispose() {
        TracingControllerChannelDelegate tracingControllerChannelDelegate = this.channelDelegate;
        if (tracingControllerChannelDelegate != null) {
            tracingControllerChannelDelegate.dispose();
            this.channelDelegate = null;
        }
        this.plugin = null;
    }
}
