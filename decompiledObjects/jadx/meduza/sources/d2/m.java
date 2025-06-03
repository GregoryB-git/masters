package d2;

import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class m {
    @Deprecated
    public static int a(WebSettings webSettings) {
        int forceDark;
        forceDark = webSettings.getForceDark();
        return forceDark;
    }

    public static WebViewRenderProcess b(WebView webView) {
        WebViewRenderProcess webViewRenderProcess;
        webViewRenderProcess = webView.getWebViewRenderProcess();
        return webViewRenderProcess;
    }

    public static WebViewRenderProcessClient c(WebView webView) {
        WebViewRenderProcessClient webViewRenderProcessClient;
        webViewRenderProcessClient = webView.getWebViewRenderProcessClient();
        return webViewRenderProcessClient;
    }

    @Deprecated
    public static void d(WebSettings webSettings, int i10) {
        webSettings.setForceDark(i10);
    }

    public static void e(WebView webView, c2.r rVar) {
        webView.setWebViewRenderProcessClient(rVar != null ? new m0(rVar) : null);
    }

    public static void f(WebView webView, Executor executor, c2.r rVar) {
        webView.setWebViewRenderProcessClient(executor, rVar != null ? new m0(rVar) : null);
    }

    public static boolean g(WebViewRenderProcess webViewRenderProcess) {
        return webViewRenderProcess.terminate();
    }
}
