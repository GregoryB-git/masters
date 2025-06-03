package wa;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c extends wa.a {

    /* renamed from: b, reason: collision with root package name */
    public final a f16476b;

    /* renamed from: c, reason: collision with root package name */
    public final MethodCall f16477c;

    public class a implements d {

        /* renamed from: a, reason: collision with root package name */
        public final MethodChannel.Result f16478a;

        public a(MethodChannel.Result result) {
            this.f16478a = result;
        }

        @Override // wa.d
        public final void a(Serializable serializable) {
            this.f16478a.success(serializable);
        }

        @Override // wa.d
        public final void b(String str, HashMap hashMap) {
            this.f16478a.error("sqlite_error", str, hashMap);
        }
    }

    public c(MethodCall methodCall, MethodChannel.Result result) {
        this.f16477c = methodCall;
        this.f16476b = new a(result);
    }

    @Override // m.e
    public final <T> T c(String str) {
        return (T) this.f16477c.argument(str);
    }

    @Override // m.e
    public final String d() {
        return this.f16477c.method;
    }

    @Override // m.e
    public final boolean f() {
        return this.f16477c.hasArgument("transactionId");
    }

    @Override // wa.a
    public final d v() {
        return this.f16476b;
    }
}
