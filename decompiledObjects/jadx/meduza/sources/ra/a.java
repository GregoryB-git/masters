package ra;

import android.content.Intent;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;

/* loaded from: classes.dex */
public class a implements FlutterPlugin, MethodChannel.MethodCallHandler, EventChannel.StreamHandler, ActivityAware, PluginRegistry.NewIntentListener {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f13833a;

    /* renamed from: b, reason: collision with root package name */
    public EventChannel f13834b;

    /* renamed from: c, reason: collision with root package name */
    public EventChannel.EventSink f13835c;

    /* renamed from: d, reason: collision with root package name */
    public ActivityPluginBinding f13836d;

    /* renamed from: e, reason: collision with root package name */
    public String f13837e;
    public boolean f = false;

    /* renamed from: o, reason: collision with root package name */
    public String f13838o;

    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(android.content.Intent r8) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r8.toString()
            java.lang.String r2 = "com.llfbandit.app_links"
            android.util.Log.d(r2, r1)
            int r1 = r8.getFlags()
            r3 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r3
            if (r1 != r3) goto L17
            return r0
        L17:
            java.lang.String r1 = "com.google.firebase.dynamiclinks.DYNAMIC_LINK_DATA"
            byte[] r1 = r8.getByteArrayExtra(r1)
            r3 = 0
            if (r1 == 0) goto L54
            int r4 = r1.length
            if (r4 != 0) goto L24
            goto L54
        L24:
            android.os.Parcel r4 = android.os.Parcel.obtain()
            int r5 = r1.length
            r4.unmarshall(r1, r0, r5)
            r4.setDataPosition(r0)
            int r1 = r4.readInt()
            r5 = -65536(0xffffffffffff0000, float:NaN)
            r6 = r1 & r5
            if (r6 == r5) goto L40
            int r1 = r1 >> 16
            r5 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r5
            goto L44
        L40:
            int r1 = r4.readInt()
        L44:
            if (r1 != 0) goto L47
            goto L54
        L47:
            int r5 = r4.dataPosition()
            java.lang.String r6 = r4.readString()
            int r5 = r5 + r1
            r4.setDataPosition(r5)
            goto L55
        L54:
            r6 = r3
        L55:
            if (r6 == 0) goto L6c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r1 = "handleIntent: (Data) (short deep link)"
            r8.append(r1)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r2, r8)
            goto Lac
        L6c:
            java.lang.String r1 = r8.getAction()
            java.lang.String r4 = "android.intent.action.SEND"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto Lab
            java.lang.String r4 = "android.intent.action.SEND_MULTIPLE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto Lab
            java.lang.String r4 = "android.intent.action.SENDTO"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L89
            goto Lab
        L89:
            java.lang.String r3 = r8.getDataString()
            if (r3 == 0) goto Lab
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r4 = "Handled intent: action: "
            r8.append(r4)
            r8.append(r1)
            java.lang.String r1 = " / data: "
            r8.append(r1)
            r8.append(r3)
            java.lang.String r8 = r8.toString()
            android.util.Log.d(r2, r8)
        Lab:
            r6 = r3
        Lac:
            if (r6 != 0) goto Laf
            return r0
        Laf:
            java.lang.String r8 = r7.f13837e
            if (r8 != 0) goto Lb5
            r7.f13837e = r6
        Lb5:
            r7.f13838o = r6
            io.flutter.plugin.common.EventChannel$EventSink r8 = r7.f13835c
            r0 = 1
            if (r8 == 0) goto Lc1
            r7.f = r0
            r8.success(r6)
        Lc1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ra.a.a(android.content.Intent):boolean");
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.f13836d = activityPluginBinding;
        activityPluginBinding.addOnNewIntentListener(this);
        a(activityPluginBinding.getActivity().getIntent());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "com.llfbandit.app_links/messages");
        this.f13833a = methodChannel;
        methodChannel.setMethodCallHandler(this);
        EventChannel eventChannel = new EventChannel(flutterPluginBinding.getBinaryMessenger(), "com.llfbandit.app_links/events");
        this.f13834b = eventChannel;
        eventChannel.setStreamHandler(this);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onCancel(Object obj) {
        this.f13835c = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivity() {
        ActivityPluginBinding activityPluginBinding = this.f13836d;
        if (activityPluginBinding != null) {
            activityPluginBinding.removeOnNewIntentListener(this);
        }
        this.f13836d = null;
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onDetachedFromActivityForConfigChanges() {
        onDetachedFromActivity();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f13833a.setMethodCallHandler(null);
        this.f13834b.setStreamHandler(null);
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public final void onListen(Object obj, EventChannel.EventSink eventSink) {
        String str;
        this.f13835c = eventSink;
        if (this.f || (str = this.f13837e) == null) {
            return;
        }
        this.f = true;
        eventSink.success(str);
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        String str;
        if (methodCall.method.equals("getLatestLink")) {
            str = this.f13838o;
        } else {
            if (!methodCall.method.equals("getInitialLink")) {
                result.notImplemented();
                return;
            }
            str = this.f13837e;
        }
        result.success(str);
    }

    @Override // io.flutter.plugin.common.PluginRegistry.NewIntentListener
    public final boolean onNewIntent(Intent intent) {
        return a(intent);
    }

    @Override // io.flutter.embedding.engine.plugins.activity.ActivityAware
    public final void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        this.f13836d = activityPluginBinding;
        activityPluginBinding.addOnNewIntentListener(this);
    }
}
