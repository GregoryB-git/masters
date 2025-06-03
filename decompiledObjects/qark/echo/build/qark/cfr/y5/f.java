/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.app.ActivityManager$MemoryInfo
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.res.Resources
 *  android.hardware.display.DisplayManager
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.SystemClock
 *  android.util.DisplayMetrics
 *  java.io.File
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.concurrent.Callable
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Future
 */
package y5;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
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
import java.util.Collection;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import y5.a;
import y5.d;
import y5.g;

public class f {
    public boolean a = false;
    public c b;
    public long c;
    public y5.b d;
    public FlutterJNI e;
    public ExecutorService f;
    public Future g;

    public f() {
        this(t5.a.e().d().a());
    }

    public f(FlutterJNI flutterJNI) {
        this(flutterJNI, t5.a.e().b());
    }

    public f(FlutterJNI flutterJNI, ExecutorService executorService) {
        this.e = flutterJNI;
        this.f = executorService;
    }

    public static /* synthetic */ void a(f f8, Context context, String[] arrstring, Handler handler, Runnable runnable) {
        f8.n(context, arrstring, handler, runnable);
    }

    public static /* synthetic */ void b(f f8, Context context, String[] arrstring, Handler handler, Runnable runnable) {
        f8.o(context, arrstring, handler, runnable);
    }

    public static /* synthetic */ g c(f f8, Context context) {
        f8.k(context);
        return null;
    }

    public static /* synthetic */ y5.b e(f f8) {
        return f8.d;
    }

    public static /* synthetic */ ExecutorService f(f f8) {
        return f8.f;
    }

    public static boolean m(Bundle bundle) {
        if (bundle == null) {
            return true;
        }
        return bundle.getBoolean("io.flutter.embedding.android.LeakVM", true);
    }

    public boolean g() {
        return this.d.g;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void h(Context context, String[] object) {
        Exception exception222;
        if (this.a) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        if (this.b == null) throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        T5.f f8 = T5.f.i("FlutterLoader#ensureInitializationComplete");
        {
            catch (Exception exception222) {}
        }
        b b8 = (b)this.g.get();
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)"--icu-symbol-prefix=_binary_icudtl_dat");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("--icu-native-lib-path=");
        stringBuilder.append(this.d.f);
        String string2 = File.separator;
        stringBuilder.append(string2);
        stringBuilder.append("libflutter.so");
        arrayList.add((Object)stringBuilder.toString());
        if (object != null) {
            Collections.addAll((Collection)arrayList, (Object[])object);
        }
        object = new StringBuilder();
        object.append("--aot-shared-library-name=");
        object.append(this.d.a);
        arrayList.add((Object)object.toString());
        object = new StringBuilder();
        object.append("--aot-shared-library-name=");
        object.append(this.d.f);
        object.append(string2);
        object.append(this.d.a);
        arrayList.add((Object)object.toString());
        object = new StringBuilder();
        object.append("--cache-dir-path=");
        object.append(b8.b);
        arrayList.add((Object)object.toString());
        if (this.d.e != null) {
            object = new StringBuilder();
            object.append("--domain-network-policy=");
            object.append(this.d.e);
            arrayList.add((Object)object.toString());
        }
        if (this.b.a() != null) {
            object = new StringBuilder();
            object.append("--log-tag=");
            object.append(this.b.a());
            arrayList.add((Object)object.toString());
        }
        int n8 = (object = context.getPackageManager().getApplicationInfo((String)context.getPackageName(), (int)128).metaData) != null ? object.getInt("io.flutter.embedding.android.OldGenHeapSize") : 0;
        if (n8 == 0) {
            string2 = (ActivityManager)context.getSystemService("activity");
            stringBuilder = new ActivityManager.MemoryInfo();
            string2.getMemoryInfo((ActivityManager.MemoryInfo)stringBuilder);
            n8 = (int)((double)stringBuilder.totalMem / 1000000.0 / 2.0);
        }
        string2 = new StringBuilder();
        string2.append("--old-gen-heap-size=");
        string2.append(n8);
        arrayList.add((Object)string2.toString());
        string2 = context.getResources().getDisplayMetrics();
        n8 = string2.widthPixels;
        int n9 = string2.heightPixels;
        string2 = new StringBuilder();
        string2.append("--resource-cache-max-bytes-threshold=");
        string2.append(n8 * n9 * 48);
        arrayList.add((Object)string2.toString());
        arrayList.add((Object)"--prefetched-default-font-manager");
        if (object != null) {
            if (object.getBoolean("io.flutter.embedding.android.EnableImpeller", false)) {
                arrayList.add((Object)"--enable-impeller");
            }
            if (object.getBoolean("io.flutter.embedding.android.EnableVulkanValidation", false)) {
                arrayList.add((Object)"--enable-vulkan-validation");
            }
            if (object.getBoolean("io.flutter.embedding.android.EnableOpenGLGPUTracing", false)) {
                arrayList.add((Object)"--enable-opengl-gpu-tracing");
            }
            if (object.getBoolean("io.flutter.embedding.android.EnableVulkanGPUTracing", false)) {
                arrayList.add((Object)"--enable-vulkan-gpu-tracing");
            }
            if ((string2 = object.getString("io.flutter.embedding.android.ImpellerBackend")) != null) {
                stringBuilder = new StringBuilder();
                stringBuilder.append("--impeller-backend=");
                stringBuilder.append(string2);
                arrayList.add((Object)stringBuilder.toString());
            }
        }
        object = f.m((Bundle)object) ? "true" : "false";
        string2 = new StringBuilder();
        string2.append("--leak-vm=");
        string2.append((String)object);
        arrayList.add((Object)string2.toString());
        long l8 = SystemClock.uptimeMillis();
        long l9 = this.c;
        this.e.init(context, (String[])arrayList.toArray((Object[])new String[0]), null, b8.a, b8.b, l8 - l9);
        this.a = true;
        if (f8 == null) return;
        f8.close();
        return;
        catch (Throwable throwable) {}
        if (f8 == null) throw throwable;
        try {
            f8.close();
            throw throwable;
        }
        catch (Throwable throwable) {
            throwable.addSuppressed(throwable);
            throw throwable;
        }
        t5.b.c("FlutterLoader", "Flutter initialization failed.", (Throwable)exception222);
        throw new RuntimeException((Throwable)exception222);
    }

    public void i(Context context, String[] arrstring, Handler handler, Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.b != null) {
                if (this.a) {
                    handler.post(runnable);
                    return;
                }
                this.f.execute((Runnable)new y5.c(this, context, arrstring, handler, runnable));
                return;
            }
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
    }

    public String j() {
        return this.d.d;
    }

    public final g k(Context context) {
        return null;
    }

    public boolean l() {
        return this.a;
    }

    public final /* synthetic */ void n(Context context, String[] arrstring, Handler handler, Runnable runnable) {
        this.h(context.getApplicationContext(), arrstring);
        handler.post(runnable);
    }

    public final /* synthetic */ void o(Context context, String[] arrstring, Handler handler, Runnable runnable) {
        try {
            b b8 = (b)this.g.get();
        }
        catch (Exception exception) {
            t5.b.c("FlutterLoader", "Flutter initialization failed.", (Throwable)exception);
            throw new RuntimeException((Throwable)exception);
        }
        T5.a.a(Looper.getMainLooper()).post((Runnable)new d(this, context, arrstring, handler, runnable));
    }

    public void p(Context context) {
        this.q(context, new c());
    }

    public void q(Context object, c c8) {
        if (this.b != null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            block7 : {
                T5.f f8 = T5.f.i("FlutterLoader#startInitialization");
                try {
                    object = object.getApplicationContext();
                    this.b = c8;
                    this.c = SystemClock.uptimeMillis();
                    this.d = a.e((Context)object);
                    s.f((DisplayManager)object.getSystemService("display"), this.e).g();
                    object = new Callable((Context)object){
                        public final /* synthetic */ Context o;
                        {
                            this.o = context;
                        }

                        public static /* synthetic */ void a( a8) {
                            a8.c();
                        }

                        /*
                         * Exception decompiling
                         */
                        public b b() {
                            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                            // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 5[CATCHBLOCK]
                            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:420)
                            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:472)
                            // org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:2880)
                            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:838)
                            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
                            // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
                            // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
                            // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
                            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
                            // org.benf.cfr.reader.entities.ClassFile.analyseInnerClassesPass1(ClassFile.java:682)
                            // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:765)
                            // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
                            // org.benf.cfr.reader.Main.doJar(Main.java:134)
                            // org.benf.cfr.reader.Main.main(Main.java:189)
                            throw new IllegalStateException("Decompilation failed");
                        }

                        public final /* synthetic */ void c() {
                            f.this.e.prefetchDefaultFontManager();
                        }
                    };
                    this.g = this.f.submit((Callable)object);
                    if (f8 == null) break block7;
                }
                catch (Throwable throwable) {
                    if (f8 != null) {
                        try {
                            f8.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                f8.close();
            }
            return;
        }
        throw new IllegalStateException("startInitialization must be called on the main thread");
    }

    public static class b {
        public final String a;
        public final String b;
        public final String c;

        public b(String string2, String string3, String string4) {
            this.a = string2;
            this.b = string3;
            this.c = string4;
        }

        public /* synthetic */ b(String string2, String string3, String string4,  a8) {
            this(string2, string3, string4);
        }
    }

    public static class c {
        public String a;

        public String a() {
            return this.a;
        }
    }

}

