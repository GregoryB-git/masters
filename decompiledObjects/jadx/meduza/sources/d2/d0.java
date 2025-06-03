package d2;

import android.net.Uri;
import android.webkit.WebView;
import c2.p;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.JsReplyProxyBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;

/* loaded from: classes.dex */
public final class d0 implements WebMessageListenerBoundaryInterface {

    /* renamed from: a, reason: collision with root package name */
    public p.b f3354a;

    public d0(p.b bVar) {
        this.f3354a = bVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface
    public final void onPostMessage(WebView webView, InvocationHandler invocationHandler, Uri uri, boolean z10, InvocationHandler invocationHandler2) {
        c2.j a10 = b0.a((WebMessageBoundaryInterface) zc.a.a(WebMessageBoundaryInterface.class, invocationHandler));
        if (a10 != null) {
            JsReplyProxyBoundaryInterface jsReplyProxyBoundaryInterface = (JsReplyProxyBoundaryInterface) zc.a.a(JsReplyProxyBoundaryInterface.class, invocationHandler2);
            this.f3354a.onPostMessage(webView, a10, uri, z10, (t) jsReplyProxyBoundaryInterface.getOrCreatePeer(new s(jsReplyProxyBoundaryInterface)));
        }
    }
}
