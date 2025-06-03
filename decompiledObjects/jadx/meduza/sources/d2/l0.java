package d2;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewRenderProcessClient;
import java.lang.reflect.InvocationHandler;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import org.chromium.support_lib_boundary.WebViewRendererBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface;

/* loaded from: classes.dex */
public final class l0 implements WebViewRendererClientBoundaryInterface {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f3391c = {"WEB_VIEW_RENDERER_CLIENT_BASIC_USAGE"};

    /* renamed from: a, reason: collision with root package name */
    public final Executor f3392a = null;

    /* renamed from: b, reason: collision with root package name */
    public final c2.r f3393b;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c2.r f3394a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WebView f3395b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c2.q f3396c;

        public a(c2.r rVar, WebView webView, o0 o0Var) {
            this.f3394a = rVar;
            this.f3395b = webView;
            this.f3396c = o0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f3394a.onRenderProcessUnresponsive(this.f3395b, this.f3396c);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c2.r f3397a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ WebView f3398b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c2.q f3399c;

        public b(c2.r rVar, WebView webView, o0 o0Var) {
            this.f3397a = rVar;
            this.f3398b = webView;
            this.f3399c = o0Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f3397a.onRenderProcessResponsive(this.f3398b, this.f3399c);
        }
    }

    public l0(InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient) {
        this.f3393b = inAppWebViewRenderProcessClient;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return f3391c;
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererResponsive(WebView webView, InvocationHandler invocationHandler) {
        WeakHashMap<WebViewRenderProcess, o0> weakHashMap = o0.f3403c;
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) zc.a.a(WebViewRendererBoundaryInterface.class, invocationHandler);
        o0 o0Var = (o0) webViewRendererBoundaryInterface.getOrCreatePeer(new n0(webViewRendererBoundaryInterface));
        c2.r rVar = this.f3393b;
        Executor executor = this.f3392a;
        if (executor == null) {
            rVar.onRenderProcessResponsive(webView, o0Var);
        } else {
            executor.execute(new b(rVar, webView, o0Var));
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewRendererClientBoundaryInterface
    public final void onRendererUnresponsive(WebView webView, InvocationHandler invocationHandler) {
        WeakHashMap<WebViewRenderProcess, o0> weakHashMap = o0.f3403c;
        WebViewRendererBoundaryInterface webViewRendererBoundaryInterface = (WebViewRendererBoundaryInterface) zc.a.a(WebViewRendererBoundaryInterface.class, invocationHandler);
        o0 o0Var = (o0) webViewRendererBoundaryInterface.getOrCreatePeer(new n0(webViewRendererBoundaryInterface));
        c2.r rVar = this.f3393b;
        Executor executor = this.f3392a;
        if (executor == null) {
            rVar.onRenderProcessUnresponsive(webView, o0Var);
        } else {
            executor.execute(new a(rVar, webView, o0Var));
        }
    }
}
