package d2;

import android.net.Uri;
import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebResourceError;
import android.webkit.WebSettings;
import android.webkit.WebView;
import c2.k;
import c2.p;

/* loaded from: classes.dex */
public final class c {

    public class a extends WebMessagePort.WebMessageCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k.a f3351a;

        public a(k.a aVar) {
            this.f3351a = aVar;
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f3351a.onMessage(new f0(webMessagePort), c.d(webMessage));
        }
    }

    public class b extends WebMessagePort.WebMessageCallback {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k.a f3352a;

        public b(k.a aVar) {
            this.f3352a = aVar;
        }

        @Override // android.webkit.WebMessagePort.WebMessageCallback
        public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
            this.f3352a.onMessage(new f0(webMessagePort), c.d(webMessage));
        }
    }

    /* renamed from: d2.c$c, reason: collision with other inner class name */
    public class C0062c extends WebView.VisualStateCallback {
        public C0062c(p.a aVar) {
        }

        @Override // android.webkit.WebView.VisualStateCallback
        public final void onComplete(long j10) {
            throw null;
        }
    }

    public static void a(WebMessagePort webMessagePort) {
        webMessagePort.close();
    }

    public static WebMessage b(c2.j jVar) {
        WebMessagePort[] webMessagePortArr;
        jVar.a(0);
        String str = jVar.f2222b;
        c2.k[] kVarArr = jVar.f2221a;
        if (kVarArr == null) {
            webMessagePortArr = null;
        } else {
            int length = kVarArr.length;
            WebMessagePort[] webMessagePortArr2 = new WebMessagePort[length];
            for (int i10 = 0; i10 < length; i10++) {
                webMessagePortArr2[i10] = kVarArr[i10].b();
            }
            webMessagePortArr = webMessagePortArr2;
        }
        return new WebMessage(str, webMessagePortArr);
    }

    public static WebMessagePort[] c(WebView webView) {
        return webView.createWebMessageChannel();
    }

    public static c2.j d(WebMessage webMessage) {
        c2.k[] kVarArr;
        String data = webMessage.getData();
        WebMessagePort[] ports = webMessage.getPorts();
        if (ports == null) {
            kVarArr = null;
        } else {
            c2.k[] kVarArr2 = new c2.k[ports.length];
            for (int i10 = 0; i10 < ports.length; i10++) {
                kVarArr2[i10] = new f0(ports[i10]);
            }
            kVarArr = kVarArr2;
        }
        return new c2.j(data, kVarArr);
    }

    public static CharSequence e(WebResourceError webResourceError) {
        return webResourceError.getDescription();
    }

    public static int f(WebResourceError webResourceError) {
        return webResourceError.getErrorCode();
    }

    public static boolean g(WebSettings webSettings) {
        return webSettings.getOffscreenPreRaster();
    }

    public static void h(WebMessagePort webMessagePort, WebMessage webMessage) {
        webMessagePort.postMessage(webMessage);
    }

    public static void i(WebView webView, long j10, p.a aVar) {
        webView.postVisualStateCallback(j10, new C0062c(aVar));
    }

    public static void j(WebView webView, WebMessage webMessage, Uri uri) {
        webView.postWebMessage(webMessage, uri);
    }

    public static void k(WebSettings webSettings, boolean z10) {
        webSettings.setOffscreenPreRaster(z10);
    }

    public static void l(WebMessagePort webMessagePort, k.a aVar) {
        webMessagePort.setWebMessageCallback(new a(aVar));
    }

    public static void m(WebMessagePort webMessagePort, k.a aVar, Handler handler) {
        webMessagePort.setWebMessageCallback(new b(aVar), handler);
    }
}
