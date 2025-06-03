package d2;

import c2.k;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;

/* loaded from: classes.dex */
public final class c0 implements WebMessageCallbackBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    public final k.a f3353a;

    public c0(k.a aVar) {
        this.f3353a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
    public final void onMessage(InvocationHandler invocationHandler, InvocationHandler invocationHandler2) {
        c2.j a10 = b0.a((WebMessageBoundaryInterface) zc.a.a(WebMessageBoundaryInterface.class, invocationHandler2));
        if (a10 != null) {
            this.f3353a.onMessage(new f0(invocationHandler), a10);
        }
    }
}
