package androidx.webkit;

import android.app.PendingIntent;
import android.webkit.SafeBrowsingResponse;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import c2.d;
import c2.l;
import d2.c;
import d2.g0;
import d2.h0;
import d2.i0;
import d2.j0;
import d2.v;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebViewClientBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import x6.b;

/* loaded from: classes.dex */
public class WebViewClientCompat extends WebViewClient implements WebViewClientBoundaryInterface {
    private static final String[] sSupportedFeatures = {"VISUAL_STATE_CALLBACK", "RECEIVE_WEB_RESOURCE_ERROR", "RECEIVE_HTTP_ERROR", "SHOULD_OVERRIDE_WITH_REDIRECTS", "SAFE_BROWSING_HIT"};

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return sSupportedFeatures;
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onPageCommitVisible(WebView webView, String str) {
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        onReceivedError(webView, webResourceRequest, new g0(webResourceError));
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, l lVar) {
        if (b.c0("WEB_RESOURCE_ERROR_GET_CODE") && b.c0("WEB_RESOURCE_ERROR_GET_DESCRIPTION") && d2.b.b(webResourceRequest)) {
            g0 g0Var = (g0) lVar;
            g0Var.getClass();
            i0.f3377o.getClass();
            if (g0Var.f3360a == null) {
                h0 h0Var = j0.a.f3389a;
                g0Var.f3360a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) h0Var.f3363b).convertWebResourceError(Proxy.getInvocationHandler(g0Var.f3361b));
            }
            int f = c.f(g0Var.f3360a);
            g0 g0Var2 = (g0) lVar;
            i0.f3376n.getClass();
            if (g0Var2.f3360a == null) {
                h0 h0Var2 = j0.a.f3389a;
                g0Var2.f3360a = (WebResourceError) ((WebkitToCompatConverterBoundaryInterface) h0Var2.f3363b).convertWebResourceError(Proxy.getInvocationHandler(g0Var2.f3361b));
            }
            onReceivedError(webView, f, c.e(g0Var2.f3360a).toString(), d2.b.a(webResourceRequest).toString());
        }
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, InvocationHandler invocationHandler) {
        onReceivedError(webView, webResourceRequest, new g0(invocationHandler));
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
    }

    @Override // android.webkit.WebViewClient
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, SafeBrowsingResponse safeBrowsingResponse) {
        onSafeBrowsingHit(webView, webResourceRequest, i10, new v(safeBrowsingResponse));
    }

    public void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, d dVar) {
        if (!b.c0("SAFE_BROWSING_RESPONSE_SHOW_INTERSTITIAL")) {
            throw i0.a();
        }
        dVar.a(true);
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i10, InvocationHandler invocationHandler) {
        onSafeBrowsingHit(webView, webResourceRequest, i10, new v(invocationHandler));
    }

    @Override // org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean onWebAuthnIntent(WebView webView, PendingIntent pendingIntent, InvocationHandler invocationHandler) {
        return false;
    }

    @Override // android.webkit.WebViewClient, org.chromium.support_lib_boundary.WebViewClientBoundaryInterface
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return shouldOverrideUrlLoading(webView, d2.b.a(webResourceRequest).toString());
    }
}
