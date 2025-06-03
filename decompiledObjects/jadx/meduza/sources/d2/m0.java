package d2;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class m0 extends WebViewRenderProcessClient {

    /* renamed from: a, reason: collision with root package name */
    public c2.r f3400a;

    public m0(c2.r rVar) {
        this.f3400a = rVar;
    }

    public final void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        c2.r rVar = this.f3400a;
        WeakHashMap<WebViewRenderProcess, o0> weakHashMap = o0.f3403c;
        o0 o0Var = weakHashMap.get(webViewRenderProcess);
        if (o0Var == null) {
            o0Var = new o0(webViewRenderProcess);
            weakHashMap.put(webViewRenderProcess, o0Var);
        }
        rVar.onRenderProcessResponsive(webView, o0Var);
    }

    public final void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        c2.r rVar = this.f3400a;
        WeakHashMap<WebViewRenderProcess, o0> weakHashMap = o0.f3403c;
        o0 o0Var = weakHashMap.get(webViewRenderProcess);
        if (o0Var == null) {
            o0Var = new o0(webViewRenderProcess);
            weakHashMap.put(webViewRenderProcess, o0Var);
        }
        rVar.onRenderProcessUnresponsive(webView, o0Var);
    }
}
