package ya;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

/* loaded from: classes.dex */
public final class c implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public final a f17461a;

    public c(a aVar) {
        this.f17461a = aVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (!"check".equals(methodCall.method)) {
            result.notImplemented();
            return;
        }
        a aVar = this.f17461a;
        result.success(a.a(aVar.f17454a.getNetworkCapabilities(aVar.f17454a.getActiveNetwork())));
    }
}
