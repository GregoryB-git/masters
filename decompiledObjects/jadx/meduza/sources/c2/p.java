package c2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebView;
import com.pichillilorenzo.flutter_inappwebview_android.webview.in_app_webview.InAppWebViewRenderProcessClient;
import d2.a;
import d2.b0;
import d2.i0;
import d2.j0;
import d2.l0;
import d2.w;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import zc.a;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f2234a = Uri.parse("*");

    /* renamed from: b, reason: collision with root package name */
    public static final Uri f2235b = Uri.parse("");

    public interface a {
        void a();
    }

    public interface b {
        void onPostMessage(WebView webView, j jVar, Uri uri, boolean z10, c2.a aVar);
    }

    public static w a(WebView webView, String str, Set set) {
        if (i0.J.d()) {
            return new w((ScriptHandlerBoundaryInterface) zc.a.a(ScriptHandlerBoundaryInterface.class, j0.b.f3390a.createWebView(webView).addDocumentStartJavaScript(str, (String[]) set.toArray(new String[0]))));
        }
        throw i0.a();
    }

    public static PackageInfo b(Context context) {
        PackageInfo packageInfo;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            packageInfo = d2.f.a();
        } else {
            try {
                packageInfo = c();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfo = null;
            }
        }
        if (packageInfo != null) {
            return packageInfo;
        }
        try {
            String str = (String) (i10 <= 23 ? Class.forName("android.webkit.WebViewFactory").getMethod("getWebViewPackageName", new Class[0]).invoke(null, new Object[0]) : Class.forName("android.webkit.WebViewUpdateService").getMethod("getCurrentWebViewPackageName", new Class[0]).invoke(null, new Object[0]));
            if (str == null) {
                return null;
            }
            return context.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            return null;
        }
    }

    public static PackageInfo c() {
        return (PackageInfo) Class.forName("android.webkit.WebViewFactory").getMethod("getLoadedPackageInfo", new Class[0]).invoke(null, new Object[0]);
    }

    public static void d(InAppWebView inAppWebView, j jVar, Uri uri) {
        if (f2234a.equals(uri)) {
            uri = f2235b;
        }
        a.b bVar = i0.f3385x;
        bVar.getClass();
        if (jVar.f2224d == 0) {
            d2.c.j(inAppWebView, d2.c.b(jVar), uri);
            return;
        }
        if (bVar.d()) {
            int i10 = jVar.f2224d;
            boolean z10 = true;
            if (i10 != 0 && (i10 != 1 || !i0.f3382u.d())) {
                z10 = false;
            }
            if (z10) {
                j0.b.f3390a.createWebView(inAppWebView).postMessageToMainFrame(new a.C0270a(new b0(jVar)), uri);
                return;
            }
        }
        throw i0.a();
    }

    public static void e(HashSet hashSet, ValueCallback valueCallback) {
        a.f fVar = i0.f;
        a.f fVar2 = i0.f3368e;
        if (fVar.d()) {
            j0.b.f3390a.getStatics().setSafeBrowsingAllowlist(hashSet, valueCallback);
            return;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        if (fVar2.c()) {
            d2.j.d(arrayList, valueCallback);
        } else {
            if (!fVar2.d()) {
                throw i0.a();
            }
            j0.b.f3390a.getStatics().setSafeBrowsingWhitelist(arrayList, valueCallback);
        }
    }

    public static void f(WebView webView, InAppWebViewRenderProcessClient inAppWebViewRenderProcessClient) {
        a.h hVar = i0.C;
        if (hVar.c()) {
            d2.m.e(webView, inAppWebViewRenderProcessClient);
        } else {
            if (!hVar.d()) {
                throw i0.a();
            }
            j0.b.f3390a.createWebView(webView).setWebViewRendererClient(inAppWebViewRenderProcessClient != null ? new a.C0270a(new l0(inAppWebViewRenderProcessClient)) : null);
        }
    }
}
