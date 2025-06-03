package androidx.webkit;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class ProcessGlobalConfig {

    /* renamed from: a, reason: collision with root package name */
    public String f1397a;

    /* renamed from: b, reason: collision with root package name */
    public String f1398b;

    /* renamed from: c, reason: collision with root package name */
    public String f1399c;
    private static final AtomicReference<HashMap<String, Object>> sProcessGlobalConfig = new AtomicReference<>();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f1395d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static boolean f1396e = false;

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(androidx.webkit.ProcessGlobalConfig r6) {
        /*
            java.lang.Object r0 = androidx.webkit.ProcessGlobalConfig.f1395d
            monitor-enter(r0)
            boolean r1 = androidx.webkit.ProcessGlobalConfig.f1396e     // Catch: java.lang.Throwable -> L82
            if (r1 != 0) goto L7a
            r1 = 1
            androidx.webkit.ProcessGlobalConfig.f1396e = r1     // Catch: java.lang.Throwable -> L82
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L82
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2 = 0
            r3 = 0
            java.lang.String r4 = "android.webkit.WebViewFactory"
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch: java.lang.Exception -> L29
            java.lang.String r5 = "sProviderInstance"
            java.lang.reflect.Field r4 = r4.getDeclaredField(r5)     // Catch: java.lang.Exception -> L29
            r4.setAccessible(r1)     // Catch: java.lang.Exception -> L29
            java.lang.Object r4 = r4.get(r2)     // Catch: java.lang.Exception -> L29
            if (r4 == 0) goto L29
            r4 = r1
            goto L2a
        L29:
            r4 = r3
        L2a:
            if (r4 != 0) goto L72
            java.lang.String r4 = r6.f1397a
            if (r4 == 0) goto L45
            d2.z$b r4 = d2.i0.A
            boolean r4 = r4.b()
            if (r4 == 0) goto L3e
            java.lang.String r4 = r6.f1397a
            d2.l.e(r4)
            goto L45
        L3e:
            java.lang.String r4 = "DATA_DIRECTORY_SUFFIX"
            java.lang.String r5 = r6.f1397a
            r0.put(r4, r5)
        L45:
            java.lang.String r4 = r6.f1398b
            if (r4 == 0) goto L4e
            java.lang.String r5 = "DATA_DIRECTORY_BASE_PATH"
            r0.put(r5, r4)
        L4e:
            java.lang.String r6 = r6.f1399c
            if (r6 == 0) goto L57
            java.lang.String r4 = "CACHE_DIRECTORY_BASE_PATH"
            r0.put(r4, r6)
        L57:
            java.util.concurrent.atomic.AtomicReference<java.util.HashMap<java.lang.String, java.lang.Object>> r6 = androidx.webkit.ProcessGlobalConfig.sProcessGlobalConfig
        L59:
            boolean r4 = r6.compareAndSet(r2, r0)
            if (r4 == 0) goto L60
            goto L67
        L60:
            java.lang.Object r4 = r6.get()
            if (r4 == 0) goto L59
            r1 = r3
        L67:
            if (r1 == 0) goto L6a
            return
        L6a:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.String r0 = "Attempting to set ProcessGlobalConfig#sProcessGlobalConfig when it was already set"
            r6.<init>(r0)
            throw r6
        L72:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "WebView has already been loaded in the current process, so any attempt to apply the settings in ProcessGlobalConfig will have no effect. ProcessGlobalConfig#apply needs to be called before any calls to android.webkit APIs, such as during early app startup."
            r6.<init>(r0)
            throw r6
        L7a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L82
            java.lang.String r1 = "ProcessGlobalConfig#apply was called more than once, which is an illegal operation. The configuration settings provided by ProcessGlobalConfig take effect only once, when WebView is first loaded into the current process. Every process should only ever create a single instance of ProcessGlobalConfig and apply it once, before any calls to android.webkit APIs, such as during early app startup."
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L82
            throw r6     // Catch: java.lang.Throwable -> L82
        L82:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L82
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.webkit.ProcessGlobalConfig.a(androidx.webkit.ProcessGlobalConfig):void");
    }
}
