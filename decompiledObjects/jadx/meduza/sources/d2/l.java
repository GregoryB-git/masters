package d2;

import android.os.Looper;
import android.webkit.TracingController;
import android.webkit.WebView;
import java.io.OutputStream;
import java.util.Collection;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class l {
    public static TracingController a() {
        return TracingController.getInstance();
    }

    public static ClassLoader b() {
        ClassLoader webViewClassLoader;
        webViewClassLoader = WebView.getWebViewClassLoader();
        return webViewClassLoader;
    }

    public static Looper c(WebView webView) {
        Looper webViewLooper;
        webViewLooper = webView.getWebViewLooper();
        return webViewLooper;
    }

    public static boolean d(TracingController tracingController) {
        return tracingController.isTracing();
    }

    public static void e(String str) {
        WebView.setDataDirectorySuffix(str);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.webkit.TracingConfig$Builder] */
    public static void f(TracingController tracingController, c2.h hVar) {
        tracingController.start(new Object() { // from class: android.webkit.TracingConfig$Builder
            static {
                throw new NoClassDefFoundError();
            }

            public native /* synthetic */ TracingConfig$Builder addCategories(Collection<String> collection);

            public native /* synthetic */ TracingConfig$Builder addCategories(int... iArr);

            public native /* synthetic */ TracingConfig build();

            public native /* synthetic */ TracingConfig$Builder setTracingMode(int i10);
        }.addCategories(hVar.f2217a).addCategories(hVar.f2218b).setTracingMode(hVar.f2219c).build());
    }

    public static boolean g(TracingController tracingController, OutputStream outputStream, Executor executor) {
        return tracingController.stop(outputStream, executor);
    }
}
