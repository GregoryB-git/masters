package bb;

import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import ec.i;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a implements MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public final d f2190a;

    /* renamed from: b, reason: collision with root package name */
    public final f f2191b;

    public a(d dVar, f fVar) {
        this.f2190a = dVar;
        this.f2191b = fVar;
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        MethodChannel.Result result2;
        i.e(methodCall, "call");
        i.e(result, "result");
        if (!(methodCall.arguments instanceof Map)) {
            throw new IllegalArgumentException("Map arguments expected".toString());
        }
        f fVar = this.f2191b;
        fVar.getClass();
        if (!fVar.f2203b.compareAndSet(true, false) && (result2 = fVar.f2202a) != null) {
            result2.success("dev.fluttercommunity.plus/share/unavailable");
        }
        SharePlusPendingIntent.f3743a = "";
        fVar.f2203b.set(false);
        fVar.f2202a = result;
        try {
            String str = methodCall.method;
            if (str != null) {
                int hashCode = str.hashCode();
                if (hashCode != -1811378728) {
                    if (hashCode != -743768819) {
                        if (hashCode == 109400031 && str.equals("share")) {
                            d dVar = this.f2190a;
                            Object argument = methodCall.argument("text");
                            i.c(argument, "null cannot be cast to non-null type kotlin.String");
                            dVar.d((String) argument, (String) methodCall.argument("subject"));
                        }
                    } else if (str.equals("shareUri")) {
                        d dVar2 = this.f2190a;
                        Object argument2 = methodCall.argument("uri");
                        i.c(argument2, "null cannot be cast to non-null type kotlin.String");
                        dVar2.d((String) argument2, null);
                    }
                } else if (str.equals("shareFiles")) {
                    d dVar3 = this.f2190a;
                    Object argument3 = methodCall.argument("paths");
                    i.b(argument3);
                    dVar3.e((List) argument3, (List) methodCall.argument("mimeTypes"), (String) methodCall.argument("text"), (String) methodCall.argument("subject"));
                }
            }
            result.notImplemented();
        } catch (Throwable th) {
            f fVar2 = this.f2191b;
            fVar2.f2203b.set(true);
            fVar2.f2202a = null;
            result.error("Share failed", th.getMessage(), th);
        }
    }
}
