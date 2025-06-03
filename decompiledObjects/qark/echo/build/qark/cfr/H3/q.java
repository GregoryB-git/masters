/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.ActivityManager
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Environment
 *  android.os.StatFs
 *  android.util.Base64
 *  java.io.ByteArrayOutputStream
 *  java.io.File
 *  java.io.FilenameFilter
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Runtime
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.SortedSet
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ScheduledThreadPoolExecutor
 *  java.util.concurrent.TimeoutException
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package H3;

import E3.e;
import E3.f;
import H3.B;
import H3.C;
import H3.D;
import H3.F;
import H3.G;
import H3.V;
import H3.a;
import H3.c0;
import H3.g;
import H3.h;
import H3.i;
import H3.m;
import H3.n;
import H3.o;
import H3.p;
import H3.s;
import H3.t;
import H3.w;
import H3.y;
import H3.z;
import I3.c;
import J3.B;
import J3.D;
import O3.d;
import V2.j;
import V2.k;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

public class q {
    public static final FilenameFilter t = new p();
    public final Context a;
    public final y b;
    public final t c;
    public final I3.i d;
    public final n e;
    public final C f;
    public final M3.g g;
    public final a h;
    public final c i;
    public final E3.a j;
    public final F3.a k;
    public final m l;
    public final V m;
    public w n;
    public O3.i o = null;
    public final k p = new k();
    public final k q = new k();
    public final k r = new k();
    public final AtomicBoolean s = new AtomicBoolean(false);

    public q(Context context, n n8, C c8, y y8, M3.g g8, t t8, a a8, I3.i i8, c c9, V v8, E3.a a9, F3.a a10, m m8) {
        this.a = context;
        this.e = n8;
        this.f = c8;
        this.b = y8;
        this.g = g8;
        this.c = t8;
        this.h = a8;
        this.d = i8;
        this.i = c9;
        this.j = a9;
        this.k = a10;
        this.l = m8;
        this.m = v8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean C() {
        try {
            Class.forName((String)"com.google.firebase.crash.FirebaseCrash");
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    public static long E() {
        return q.H(System.currentTimeMillis());
    }

    public static List F(E3.g g8, String string2, M3.g g9, byte[] arrby) {
        File file = g9.o(string2, "user-data");
        string2 = g9.o(string2, "keys");
        g9 = new ArrayList();
        g9.add((Object)new g("logs_file", "logs", arrby));
        g9.add((Object)new B("crash_meta_file", "metadata", g8.g()));
        g9.add((Object)new B("session_meta_file", "session", g8.f()));
        g9.add((Object)new B("app_meta_file", "app", g8.a()));
        g9.add((Object)new B("device_meta_file", "device", g8.c()));
        g9.add((Object)new B("os_meta_file", "os", g8.b()));
        g9.add((Object)q.S(g8));
        g9.add((Object)new B("user_meta_file", "user", file));
        g9.add((Object)new B("keys_file", "keys", (File)string2));
        return g9;
    }

    public static long H(long l8) {
        return l8 / 1000L;
    }

    public static boolean R(String string2, File file, B.a a8) {
        StringBuilder stringBuilder;
        f f8;
        if (file == null || !file.exists()) {
            f8 = f.f();
            stringBuilder = new StringBuilder();
            stringBuilder.append("No minidump data found for session ");
            stringBuilder.append(string2);
            f8.k(stringBuilder.toString());
        }
        if (a8 == null) {
            f8 = f.f();
            stringBuilder = new StringBuilder();
            stringBuilder.append("No Tombstones data found for session ");
            stringBuilder.append(string2);
            f8.g(stringBuilder.toString());
        }
        if (!(file != null && file.exists() || a8 != null)) {
            return true;
        }
        return false;
    }

    public static F S(E3.g g8) {
        if ((g8 = g8.e()) != null && g8.exists()) {
            return new B("minidump_file", "minidump", (File)g8);
        }
        return new g("minidump_file", "minidump", new byte[]{0});
    }

    public static byte[] U(InputStream inputStream) {
        int n8;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] arrby = new byte[1024];
        while ((n8 = inputStream.read(arrby)) != -1) {
            byteArrayOutputStream.write(arrby, 0, n8);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static /* synthetic */ boolean a(File file, String string2) {
        return string2.startsWith(".ae");
    }

    public static D.a p(C c8, a a8) {
        return D.a.b(c8.f(), a8.f, a8.g, c8.a().c(), z.c(a8.d).e(), a8.h);
    }

    public static D.b q(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long l8 = statFs.getBlockCount();
        long l9 = statFs.getBlockSize();
        return D.b.c(i.l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), i.b(context), l8 * l9, i.x(), i.m(), Build.MANUFACTURER, Build.PRODUCT);
    }

    public static D.c r() {
        return D.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, i.y());
    }

    public static void s(List list) {
        list = list.iterator();
        while (list.hasNext()) {
            ((File)list.next()).delete();
        }
    }

    public final void A(String string2) {
        Object object = f.f();
        Object object2 = new StringBuilder();
        object2.append("Finalizing native report for session ");
        object2.append(string2);
        object.i(object2.toString());
        object2 = this.j.a(string2);
        Object object3 = object2.e();
        object = object2.d();
        if (q.R(string2, (File)object3, (B.a)object)) {
            f.f().k("No native core present");
            return;
        }
        long l8 = object3.lastModified();
        object3 = new c(this.g, string2);
        File file = this.g.i(string2);
        if (!file.isDirectory()) {
            f.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        this.y(l8);
        object2 = q.F((E3.g)object2, string2, this.g, object3.b());
        G.b(file, (List)object2);
        f.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.m.i(string2, (List)object2, (B.a)object);
        object3.a();
    }

    public boolean B(O3.i i8) {
        this.e.b();
        if (this.L()) {
            f.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        f.f().i("Finalizing previously open sessions.");
        try {
            this.w(true, i8);
        }
        catch (Exception exception) {
            f.f().e("Unable to finalize previously open sessions.", (Throwable)exception);
            return false;
        }
        f.f().i("Closed all previously open sessions.");
        return true;
    }

    public final String D() {
        SortedSet sortedSet = this.m.o();
        if (!sortedSet.isEmpty()) {
            return (String)sortedSet.first();
        }
        return null;
    }

    public final InputStream G(String string2) {
        ClassLoader classLoader = this.getClass().getClassLoader();
        if (classLoader == null) {
            f.f().k("Couldn't get Class Loader");
            return null;
        }
        if ((string2 = classLoader.getResourceAsStream(string2)) == null) {
            f.f().g("No version control information found");
            return null;
        }
        return string2;
    }

    public String I() {
        InputStream inputStream = this.G("META-INF/version-control-info.textproto");
        if (inputStream == null) {
            return null;
        }
        f.f().b("Read version control info");
        return Base64.encodeToString((byte[])q.U(inputStream), (int)0);
    }

    public void J(O3.i i8, Thread thread, Throwable throwable) {
        this.K(i8, thread, throwable, false);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void K(O3.i object, final Thread thread, final Throwable throwable, boolean bl) {
        // MONITORENTER : this
        f f8 = f.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Handling uncaught exception \"");
        stringBuilder.append((Object)throwable);
        stringBuilder.append("\" from thread ");
        stringBuilder.append(thread.getName());
        f8.b(stringBuilder.toString());
        final long l8 = System.currentTimeMillis();
        object = this.e.i(new Callable((O3.i)object, bl){
            public final /* synthetic */ O3.i r;
            public final /* synthetic */ boolean s;
            {
                this.r = i8;
                this.s = bl;
            }

            public j a() {
                long l82 = q.H(l8);
                final String string2 = q.this.D();
                if (string2 == null) {
                    f.f().d("Tried to write a fatal exception while no session was open.");
                    return V2.m.e(null);
                }
                q.this.c.a();
                q.this.m.s(throwable, thread, string2, l82);
                q.this.y(l8);
                q.this.v(this.r);
                q.this.x(new h(q.this.f).toString(), this.s);
                if (!q.this.b.d()) {
                    return V2.m.e(null);
                }
                final Executor executor = q.this.e.c();
                return this.r.a().p(executor, new V2.i(){

                    public j b(d object) {
                        Object var2_2 = null;
                        if (object == null) {
                            f.f().k("Received null app settings, cannot send reports at crash time.");
                            return V2.m.e(null);
                        }
                        j j8 = q.this.P();
                        V v8 = q.this.m;
                        Executor executor2 = executor;
                        object = var2_2;
                        if (b.this.s) {
                            object = string2;
                        }
                        return V2.m.g(j8, v8.x(executor2, (String)object));
                    }
                });
            }

        });
        c0.f((j)object);
        return;
        catch (Exception exception) {
            f.f().e("Error handling uncaught exception", (Throwable)exception);
            return;
        }
        catch (TimeoutException timeoutException) {}
        f.f().d("Cannot send reports. Timed out while fetching settings.");
        // MONITOREXIT : this
    }

    public boolean L() {
        w w8 = this.n;
        if (w8 != null && w8.a()) {
            return true;
        }
        return false;
    }

    public List N() {
        return this.g.f(t);
    }

    public final j O(final long l8) {
        if (q.C()) {
            f.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return V2.m.e(null);
        }
        f.f().b("Logging app exception event to Firebase Analytics");
        return V2.m.c((Executor)new ScheduledThreadPoolExecutor(1), new Callable(){

            public Void a() {
                Bundle bundle = new Bundle();
                bundle.putInt("fatal", 1);
                bundle.putLong("timestamp", l8);
                q.this.k.a("_ae", bundle);
                return null;
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final j P() {
        ArrayList arrayList = new ArrayList();
        Iterator iterator = this.N().iterator();
        do {
            File file;
            block4 : {
                if (!iterator.hasNext()) {
                    return V2.m.f((Collection)arrayList);
                }
                file = (File)iterator.next();
                try {
                    arrayList.add((Object)this.O(Long.parseLong((String)file.getName().substring(3))));
                    break block4;
                }
                catch (NumberFormatException numberFormatException) {}
                f f8 = f.f();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Could not parse app exception timestamp from file ");
                stringBuilder.append(file.getName());
                f8.k(stringBuilder.toString());
            }
            file.delete();
        } while (true);
    }

    public void Q(Thread thread, Throwable throwable) {
        O3.i i8 = this.o;
        if (i8 == null) {
            f.f().k("settingsProvider not set");
            return;
        }
        this.K(i8, thread, throwable, true);
    }

    public void T(final String string2) {
        this.e.h(new Callable(){

            public Void a() {
                q.this.x(string2, Boolean.FALSE);
                return null;
            }
        });
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void V() {
        String string2 = this.I();
        if (string2 == null) return;
        try {
            this.Y("com.crashlytics.version-control-info", string2);
            f.f().g("Saved version control info");
            return;
        }
        catch (IOException iOException) {
            f.f().l("Unable to save version control info", (Throwable)iOException);
        }
    }

    public j W() {
        this.q.e((Object)Boolean.TRUE);
        return this.r.a();
    }

    public void X(String string2, String string3) {
        try {
            this.d.l(string2, string3);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            string3 = this.a;
            if (string3 != null && i.v((Context)string3)) {
                throw illegalArgumentException;
            }
            f.f().d("Attempting to set custom attribute with null key, ignoring.");
            return;
        }
    }

    public void Y(String string2, String string3) {
        try {
            this.d.m(string2, string3);
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            string3 = this.a;
            if (string3 != null && i.v((Context)string3)) {
                throw illegalArgumentException;
            }
            f.f().d("Attempting to set custom attribute with null key, ignoring.");
            return;
        }
    }

    public void Z(String string2) {
        this.d.o(string2);
    }

    public j a0(final j j8) {
        if (!this.m.m()) {
            f.f().i("No crash reports are available to be sent.");
            this.p.e((Object)Boolean.FALSE);
            return V2.m.e(null);
        }
        f.f().i("Crash reports are available to be sent.");
        return this.b0().o(new V2.i(){

            public j b(final Boolean bl) {
                return q.this.e.i(new Callable(){

                    public j a() {
                        if (!bl.booleanValue()) {
                            f.f().i("Deleting cached crash reports...");
                            q.s(q.this.N());
                            q.this.m.v();
                            q.this.r.e(null);
                            return V2.m.e(null);
                        }
                        f.f().b("Sending cached crash reports...");
                        boolean bl2 = bl;
                        q.this.b.c(bl2);
                        final Executor executor = q.this.e.c();
                        return j8.p(executor, new V2.i(){

                            /*
                             * Enabled force condition propagation
                             * Lifted jumps to return sites
                             */
                            public j b(d d8) {
                                if (d8 == null) {
                                    f.f().k("Received null app settings at app startup. Cannot send cached reports");
                                    do {
                                        return V2.m.e(null);
                                        break;
                                    } while (true);
                                }
                                q.this.P();
                                q.this.m.w(executor);
                                q.this.r.e(null);
                                return V2.m.e(null);
                            }
                        });
                    }

                });
            }

        });
    }

    public final j b0() {
        if (this.b.d()) {
            f.f().b("Automatic data collection is enabled. Allowing upload.");
            this.p.e((Object)Boolean.FALSE);
            return V2.m.e((Object)Boolean.TRUE);
        }
        f.f().b("Automatic data collection is disabled.");
        f.f().i("Notifying that unsent reports are available.");
        this.p.e((Object)Boolean.TRUE);
        j j8 = this.b.j().o(new V2.i(){

            public j b(Void void_) {
                return V2.m.e((Object)Boolean.TRUE);
            }
        });
        f.f().b("Waiting for send/deleteUnsentReports to be called.");
        return c0.n(j8, this.q.a());
    }

    public final void c0(String object) {
        int n8 = Build.VERSION.SDK_INT;
        if (n8 >= 30) {
            Object object2 = o.a((ActivityManager)this.a.getSystemService("activity"), null, 0, 0);
            if (object2.size() != 0) {
                c c8 = new c(this.g, (String)object);
                I3.i i8 = I3.i.i((String)object, this.g, this.e);
                this.m.u((String)object, (List)object2, c8, i8);
                return;
            }
            object2 = f.f();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("No ApplicationExitInfo available. Session: ");
            stringBuilder.append((String)object);
            object2.i(stringBuilder.toString());
            return;
        }
        object = f.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ANR feature enabled, but device is API ");
        stringBuilder.append(n8);
        object.i(stringBuilder.toString());
    }

    public void d0(final Thread thread, final Throwable throwable) {
        final long l8 = System.currentTimeMillis();
        this.e.g(new Runnable(){

            public void run() {
                if (!q.this.L()) {
                    long l82 = q.H(l8);
                    String string2 = q.this.D();
                    if (string2 == null) {
                        f.f().k("Tried to write a non-fatal exception while no session was open.");
                        return;
                    }
                    q.this.m.t(throwable, thread, string2, l82);
                }
            }
        });
    }

    public void e0(final long l8, final String string2) {
        this.e.h(new Callable(){

            public Void a() {
                if (!q.this.L()) {
                    q.this.i.g(l8, string2);
                }
                return null;
            }
        });
    }

    public j o() {
        if (!this.s.compareAndSet(false, true)) {
            f.f().k("checkForUnsentReports should only be called once per execution.");
            return V2.m.e((Object)Boolean.FALSE);
        }
        return this.p.a();
    }

    public j t() {
        this.q.e((Object)Boolean.FALSE);
        return this.r.a();
    }

    public boolean u() {
        if (!this.c.c()) {
            String string2 = this.D();
            if (string2 != null && this.j.d(string2)) {
                return true;
            }
            return false;
        }
        f.f().i("Found previous crash marker.");
        this.c.d();
        return true;
    }

    public void v(O3.i i8) {
        this.w(false, i8);
    }

    public final void w(boolean bl, O3.i i8) {
        RuntimeException runtimeException;
        super("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
        throw runtimeException;
    }

    public final void x(String string2, Boolean bl) {
        long l8 = q.E();
        Object object = f.f();
        Object object2 = new StringBuilder();
        object2.append("Opening a new session with ID ");
        object2.append(string2);
        object.b(object2.toString());
        object = String.format((Locale)Locale.US, (String)"Crashlytics Android SDK/%s", (Object[])new Object[]{s.l()});
        object2 = q.p(this.f, this.h);
        D.c c8 = q.r();
        D.b b8 = q.q(this.a);
        this.j.c(string2, (String)object, l8, J3.D.b((D.a)object2, c8, b8));
        if (bl.booleanValue() && string2 != null) {
            this.d.n(string2);
        }
        this.i.e(string2);
        this.l.e(string2);
        this.m.p(string2, l8);
    }

    public final void y(long l8) {
        try {
            M3.g g8 = this.g;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(".ae");
            stringBuilder.append(l8);
            if (g8.e(stringBuilder.toString()).createNewFile()) {
                return;
            }
            throw new IOException("Create new file failed.");
        }
        catch (IOException iOException) {
            f.f().l("Could not create app exception marker file.", (Throwable)iOException);
            return;
        }
    }

    public void z(String object, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, O3.i i8) {
        this.o = i8;
        this.T((String)object);
        this.n = object = new w(new w.a(){

            @Override
            public void a(O3.i i8, Thread thread, Throwable throwable) {
                q.this.J(i8, thread, throwable);
            }
        }, i8, uncaughtExceptionHandler, this.j);
        Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)object);
    }

}

