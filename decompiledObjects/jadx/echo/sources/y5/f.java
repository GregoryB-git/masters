package y5;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.s;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import t5.AbstractC1995b;
import t5.C1994a;
import y5.f;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f21505a;

    /* renamed from: b, reason: collision with root package name */
    public c f21506b;

    /* renamed from: c, reason: collision with root package name */
    public long f21507c;

    /* renamed from: d, reason: collision with root package name */
    public C2278b f21508d;

    /* renamed from: e, reason: collision with root package name */
    public FlutterJNI f21509e;

    /* renamed from: f, reason: collision with root package name */
    public ExecutorService f21510f;

    /* renamed from: g, reason: collision with root package name */
    public Future f21511g;

    public class a implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ Context f21512o;

        public a(Context context) {
            this.f21512o = context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b call() {
            T5.f i7 = T5.f.i("FlutterLoader initTask");
            try {
                f.c(f.this, this.f21512o);
                try {
                    f.this.f21509e.loadLibrary();
                    f.this.f21509e.updateRefreshRate();
                    f.this.f21510f.execute(new Runnable() { // from class: y5.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            f.a.this.c();
                        }
                    });
                    b bVar = new b(T5.c.d(this.f21512o), T5.c.a(this.f21512o), T5.c.c(this.f21512o), null);
                    if (i7 != null) {
                        i7.close();
                    }
                    return bVar;
                } catch (UnsatisfiedLinkError e7) {
                    if (!e7.toString().contains("couldn't find \"libflutter.so\"") && !e7.toString().contains("dlopen failed: library \"libflutter.so\" not found")) {
                        throw e7;
                    }
                    String property = System.getProperty("os.arch");
                    File file = new File(f.this.f21508d.f21492f);
                    throw new UnsupportedOperationException("Could not load libflutter.so this is possibly because the application is running on an architecture that Flutter Android does not support (e.g. x86) see https://docs.flutter.dev/deployment/android#what-are-the-supported-target-architectures for more detail.\nApp is using cpu architecture: " + property + ", and the native libraries directory (with path " + file.getAbsolutePath() + ") contains the following files: " + Arrays.toString(file.list()), e7);
                }
            } catch (Throwable th) {
                if (i7 != null) {
                    try {
                        i7.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }

        public final /* synthetic */ void c() {
            f.this.f21509e.prefetchDefaultFontManager();
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final String f21514a;

        /* renamed from: b, reason: collision with root package name */
        public final String f21515b;

        /* renamed from: c, reason: collision with root package name */
        public final String f21516c;

        public b(String str, String str2, String str3) {
            this.f21514a = str;
            this.f21515b = str2;
            this.f21516c = str3;
        }

        public /* synthetic */ b(String str, String str2, String str3, a aVar) {
            this(str, str2, str3);
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public String f21517a;

        public String a() {
            return this.f21517a;
        }
    }

    public f() {
        this(C1994a.e().d().a());
    }

    public static /* synthetic */ g c(f fVar, Context context) {
        fVar.k(context);
        return null;
    }

    public static boolean m(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }

    public boolean g() {
        return this.f21508d.f21493g;
    }

    public void h(Context context, String[] strArr) {
        if (this.f21505a) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f21506b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            T5.f i7 = T5.f.i("FlutterLoader#ensureInitializationComplete");
            try {
                b bVar = (b) this.f21511g.get();
                ArrayList arrayList = new ArrayList();
                arrayList.add("--icu-symbol-prefix=_binary_icudtl_dat");
                StringBuilder sb = new StringBuilder();
                sb.append("--icu-native-lib-path=");
                sb.append(this.f21508d.f21492f);
                String str = File.separator;
                sb.append(str);
                sb.append("libflutter.so");
                arrayList.add(sb.toString());
                if (strArr != null) {
                    Collections.addAll(arrayList, strArr);
                }
                arrayList.add("--aot-shared-library-name=" + this.f21508d.f21487a);
                arrayList.add("--aot-shared-library-name=" + this.f21508d.f21492f + str + this.f21508d.f21487a);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("--cache-dir-path=");
                sb2.append(bVar.f21515b);
                arrayList.add(sb2.toString());
                if (this.f21508d.f21491e != null) {
                    arrayList.add("--domain-network-policy=" + this.f21508d.f21491e);
                }
                if (this.f21506b.a() != null) {
                    arrayList.add("--log-tag=" + this.f21506b.a());
                }
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                int i8 = bundle != null ? bundle.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
                if (i8 == 0) {
                    ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(new ActivityManager.MemoryInfo());
                    i8 = (int) ((r7.totalMem / 1000000.0d) / 2.0d);
                }
                arrayList.add("--old-gen-heap-size=" + i8);
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                arrayList.add("--resource-cache-max-bytes-threshold=" + (displayMetrics.widthPixels * displayMetrics.heightPixels * 48));
                arrayList.add("--prefetched-default-font-manager");
                if (bundle != null) {
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableImpeller", false)) {
                        arrayList.add("--enable-impeller");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                        arrayList.add("--enable-vulkan-validation");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                        arrayList.add("--enable-opengl-gpu-tracing");
                    }
                    if (bundle.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                        arrayList.add("--enable-vulkan-gpu-tracing");
                    }
                    String string = bundle.getString("io.flutter.embedding.android.ImpellerBackend");
                    if (string != null) {
                        arrayList.add("--impeller-backend=" + string);
                    }
                }
                arrayList.add("--leak-vm=" + (m(bundle) ? "true" : "false"));
                this.f21509e.init(context, (String[]) arrayList.toArray(new String[0]), null, bVar.f21514a, bVar.f21515b, SystemClock.uptimeMillis() - this.f21507c);
                this.f21505a = true;
                if (i7 != null) {
                    i7.close();
                }
            } finally {
            }
        } catch (Exception e7) {
            AbstractC1995b.c("FlutterLoader", "Flutter initialization failed.", e7);
            throw new RuntimeException(e7);
        }
    }

    public void i(final Context context, final String[] strArr, final Handler handler, final Runnable runnable) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.f21506b == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        if (this.f21505a) {
            handler.post(runnable);
        } else {
            this.f21510f.execute(new Runnable() { // from class: y5.c
                @Override // java.lang.Runnable
                public final void run() {
                    f.this.o(context, strArr, handler, runnable);
                }
            });
        }
    }

    public String j() {
        return this.f21508d.f21490d;
    }

    public final g k(Context context) {
        return null;
    }

    public boolean l() {
        return this.f21505a;
    }

    public final /* synthetic */ void n(Context context, String[] strArr, Handler handler, Runnable runnable) {
        h(context.getApplicationContext(), strArr);
        handler.post(runnable);
    }

    public final /* synthetic */ void o(final Context context, final String[] strArr, final Handler handler, final Runnable runnable) {
        try {
            T5.a.a(Looper.getMainLooper()).post(new Runnable() { // from class: y5.d
                @Override // java.lang.Runnable
                public final void run() {
                    f.this.n(context, strArr, handler, runnable);
                }
            });
        } catch (Exception e7) {
            AbstractC1995b.c("FlutterLoader", "Flutter initialization failed.", e7);
            throw new RuntimeException(e7);
        }
    }

    public void p(Context context) {
        q(context, new c());
    }

    public void q(Context context, c cVar) {
        if (this.f21506b != null) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("startInitialization must be called on the main thread");
        }
        T5.f i7 = T5.f.i("FlutterLoader#startInitialization");
        try {
            Context applicationContext = context.getApplicationContext();
            this.f21506b = cVar;
            this.f21507c = SystemClock.uptimeMillis();
            this.f21508d = AbstractC2277a.e(applicationContext);
            s.f((DisplayManager) applicationContext.getSystemService("display"), this.f21509e).g();
            this.f21511g = this.f21510f.submit(new a(applicationContext));
            if (i7 != null) {
                i7.close();
            }
        } catch (Throwable th) {
            if (i7 != null) {
                try {
                    i7.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public f(FlutterJNI flutterJNI) {
        this(flutterJNI, C1994a.e().b());
    }

    public f(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.f21505a = false;
        this.f21509e = flutterJNI;
        this.f21510f = executorService;
    }
}
