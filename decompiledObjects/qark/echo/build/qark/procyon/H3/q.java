// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import android.os.BaseBundle;
import java.util.Locale;
import android.app.ActivityManager;
import java.io.IOException;
import java.util.Collection;
import android.os.Bundle;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import O3.d;
import java.util.concurrent.Executor;
import java.util.concurrent.Callable;
import android.util.Base64;
import java.util.SortedSet;
import java.util.Iterator;
import android.os.Build$VERSION;
import android.os.Build;
import android.os.StatFs;
import android.os.Environment;
import J3.D;
import V2.j;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import E3.f;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import V2.k;
import I3.c;
import M3.g;
import I3.i;
import android.content.Context;
import java.io.FilenameFilter;

public class q
{
    public static final FilenameFilter t;
    public final Context a;
    public final y b;
    public final t c;
    public final i d;
    public final n e;
    public final C f;
    public final g g;
    public final a h;
    public final c i;
    public final E3.a j;
    public final F3.a k;
    public final m l;
    public final V m;
    public w n;
    public O3.i o;
    public final k p;
    public final k q;
    public final k r;
    public final AtomicBoolean s;
    
    static {
        t = new p();
    }
    
    public q(final Context a, final n e, final C f, final y b, final g g, final t c, final a h, final i d, final c i, final V m, final E3.a j, final F3.a k, final m l) {
        this.o = null;
        this.p = new k();
        this.q = new k();
        this.r = new k();
        this.s = new AtomicBoolean(false);
        this.a = a;
        this.e = e;
        this.f = f;
        this.b = b;
        this.g = g;
        this.c = c;
        this.h = h;
        this.d = d;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    public static boolean C() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        }
        catch (ClassNotFoundException ex) {
            return false;
        }
    }
    
    public static long E() {
        return H(System.currentTimeMillis());
    }
    
    public static List F(final E3.g g, final String s, final g g2, final byte[] array) {
        final File o = g2.o(s, "user-data");
        final File o2 = g2.o(s, "keys");
        final ArrayList<B> list = new ArrayList<B>();
        list.add(new H3.g("logs_file", "logs", array));
        list.add((H3.g)new B("crash_meta_file", "metadata", g.g()));
        list.add((H3.g)new B("session_meta_file", "session", g.f()));
        list.add((H3.g)new B("app_meta_file", "app", g.a()));
        list.add((H3.g)new B("device_meta_file", "device", g.c()));
        list.add((H3.g)new B("os_meta_file", "os", g.b()));
        list.add((H3.g)S(g));
        list.add((H3.g)new B("user_meta_file", "user", o));
        list.add((H3.g)new B("keys_file", "keys", o2));
        return list;
    }
    
    public static long H(final long n) {
        return n / 1000L;
    }
    
    public static boolean R(final String s, final File file, final J3.B.a a) {
        if (file == null || !file.exists()) {
            final f f = E3.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("No minidump data found for session ");
            sb.append(s);
            f.k(sb.toString());
        }
        if (a == null) {
            final f f2 = f.f();
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("No Tombstones data found for session ");
            sb2.append(s);
            f2.g(sb2.toString());
        }
        return (file == null || !file.exists()) && a == null;
    }
    
    public static F S(final E3.g g) {
        final File e = g.e();
        if (e != null && e.exists()) {
            return new B("minidump_file", "minidump", e);
        }
        return new H3.g("minidump_file", "minidump", new byte[] { 0 });
    }
    
    public static byte[] U(final InputStream inputStream) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        final byte[] array = new byte[1024];
        while (true) {
            final int read = inputStream.read(array);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(array, 0, read);
        }
        return byteArrayOutputStream.toByteArray();
    }
    
    public static /* synthetic */ c e(final q q) {
        return q.i;
    }
    
    public static /* synthetic */ F3.a f(final q q) {
        return q.k;
    }
    
    public static /* synthetic */ t g(final q q) {
        return q.c;
    }
    
    public static /* synthetic */ V h(final q q) {
        return q.m;
    }
    
    public static /* synthetic */ C j(final q q) {
        return q.f;
    }
    
    public static /* synthetic */ y l(final q q) {
        return q.b;
    }
    
    public static /* synthetic */ n m(final q q) {
        return q.e;
    }
    
    public static D.a p(final C c, final a a) {
        return D.a.b(c.f(), a.f, a.g, c.a().c(), z.c(a.d).e(), a.h);
    }
    
    public static D.b q(final Context context) {
        final StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return D.b.c(H3.i.l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), H3.i.b(context), statFs.getBlockCount() * (long)statFs.getBlockSize(), H3.i.x(), H3.i.m(), Build.MANUFACTURER, Build.PRODUCT);
    }
    
    public static D.c r() {
        return D.c.a(Build$VERSION.RELEASE, Build$VERSION.CODENAME, H3.i.y());
    }
    
    public static void s(final List list) {
        final Iterator<File> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next().delete();
        }
    }
    
    public final void A(final String str) {
        final f f = E3.f.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("Finalizing native report for session ");
        sb.append(str);
        f.i(sb.toString());
        final E3.g a = this.j.a(str);
        final File e = a.e();
        final J3.B.a d = a.d();
        if (R(str, e, d)) {
            E3.f.f().k("No native core present");
            return;
        }
        final long lastModified = e.lastModified();
        final c c = new c(this.g, str);
        final File i = this.g.i(str);
        if (!i.isDirectory()) {
            E3.f.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        this.y(lastModified);
        final List f2 = F(a, str, this.g, c.b());
        G.b(i, f2);
        E3.f.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.m.i(str, f2, d);
        c.a();
    }
    
    public boolean B(final O3.i i) {
        this.e.b();
        if (this.L()) {
            E3.f.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        E3.f.f().i("Finalizing previously open sessions.");
        try {
            this.w(true, i);
            E3.f.f().i("Closed all previously open sessions.");
            return true;
        }
        catch (Exception ex) {
            E3.f.f().e("Unable to finalize previously open sessions.", ex);
            return false;
        }
    }
    
    public final String D() {
        final SortedSet o = this.m.o();
        if (!o.isEmpty()) {
            return o.first();
        }
        return null;
    }
    
    public final InputStream G(final String name) {
        final ClassLoader classLoader = this.getClass().getClassLoader();
        if (classLoader == null) {
            E3.f.f().k("Couldn't get Class Loader");
            return null;
        }
        final InputStream resourceAsStream = classLoader.getResourceAsStream(name);
        if (resourceAsStream == null) {
            E3.f.f().g("No version control information found");
            return null;
        }
        return resourceAsStream;
    }
    
    public String I() {
        final InputStream g = this.G("META-INF/version-control-info.textproto");
        if (g == null) {
            return null;
        }
        E3.f.f().b("Read version control info");
        return Base64.encodeToString(U(g), 0);
    }
    
    public void J(final O3.i i, final Thread thread, final Throwable t) {
        this.K(i, thread, t, false);
    }
    
    public void K(final O3.i i, final Thread thread, final Throwable obj, final boolean b) {
        // monitorenter(this)
        j j;
        try {
            final f f = E3.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("Handling uncaught exception \"");
            sb.append(obj);
            sb.append("\" from thread ");
            sb.append(thread.getName());
            f.b(sb.toString());
            final j k;
            j = (k = this.e.i(new Callable() {
                public final /* synthetic */ long o = System.currentTimeMillis();
                
                public j a() {
                    final long b = H(this.o);
                    final String c = H3.q.this.D();
                    if (c == null) {
                        E3.f.f().d("Tried to write a fatal exception while no session was open.");
                        return V2.m.e(null);
                    }
                    H3.q.g(H3.q.this).a();
                    H3.q.h(H3.q.this).s(obj, thread, c, b);
                    H3.q.this.y(this.o);
                    H3.q.this.v(i);
                    H3.q.this.x(new h(H3.q.j(H3.q.this)).toString(), b);
                    if (!H3.q.l(H3.q.this).d()) {
                        return V2.m.e(null);
                    }
                    final Executor c2 = H3.q.m(H3.q.this).c();
                    return i.a().p(c2, new V2.i() {
                        public j b(final d d) {
                            final String s = null;
                            if (d == null) {
                                E3.f.f().k("Received null app settings, cannot send reports at crash time.");
                                return V2.m.e(null);
                            }
                            final j n = H3.q.this.P();
                            final V h = H3.q.h(H3.q.this);
                            final Executor a = c2;
                            String b = s;
                            if (b) {
                                b = c;
                            }
                            return V2.m.g(n, h.x(a, b));
                        }
                    });
                }
            }));
            c0.f(k);
            goto Label_0124;
        }
        finally {
            goto Label_0127;
        }
        try {
            final j k = j;
            c0.f(k);
            goto Label_0124;
        }
        catch (Exception ex) {
            E3.f.f().e("Error handling uncaught exception", ex);
            goto Label_0124;
        }
        catch (TimeoutException ex2) {}
        goto Label_0115;
    }
    
    public boolean L() {
        final w n = this.n;
        return n != null && n.a();
    }
    
    public List N() {
        return this.g.f(H3.q.t);
    }
    
    public final j O(final long n) {
        if (C()) {
            E3.f.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return V2.m.e(null);
        }
        E3.f.f().b("Logging app exception event to Firebase Analytics");
        return V2.m.c(new ScheduledThreadPoolExecutor(1), new Callable() {
            public Void a() {
                final Bundle bundle = new Bundle();
                ((BaseBundle)bundle).putInt("fatal", 1);
                ((BaseBundle)bundle).putLong("timestamp", n);
                H3.q.f(H3.q.this).a("_ae", bundle);
                return null;
            }
        });
    }
    
    public final j P() {
        final ArrayList<j> list = new ArrayList<j>();
        final Iterator<File> iterator = (Iterator<File>)this.N().iterator();
        File file;
        f f;
        StringBuilder sb;
        Label_0105_Outer:Label_0062_Outer:Label_0113_Outer:
        while (true) {
            while (true) {
                if (iterator.hasNext()) {
                    file = iterator.next();
                    while (true) {
                        try {
                            list.add(this.O(Long.parseLong(file.getName().substring(3))));
                            while (true) {
                                file.delete();
                                continue Label_0105_Outer;
                                f = E3.f.f();
                                sb = new StringBuilder();
                                sb.append("Could not parse app exception timestamp from file ");
                                sb.append(file.getName());
                                f.k(sb.toString());
                                continue Label_0062_Outer;
                            }
                            return V2.m.f(list);
                        }
                        catch (NumberFormatException ex) {}
                        continue Label_0113_Outer;
                    }
                }
                continue;
            }
        }
    }
    
    public void Q(final Thread thread, final Throwable t) {
        final O3.i o = this.o;
        if (o == null) {
            E3.f.f().k("settingsProvider not set");
            return;
        }
        this.K(o, thread, t, true);
    }
    
    public void T(final String s) {
        this.e.h(new Callable() {
            public Void a() {
                H3.q.this.x(s, Boolean.FALSE);
                return null;
            }
        });
    }
    
    public void V() {
        try {
            final String i = this.I();
            if (i != null) {
                this.Y("com.crashlytics.version-control-info", i);
                E3.f.f().g("Saved version control info");
            }
        }
        catch (IOException ex) {
            E3.f.f().l("Unable to save version control info", ex);
        }
    }
    
    public j W() {
        this.q.e(Boolean.TRUE);
        return this.r.a();
    }
    
    public void X(final String s, final String s2) {
        try {
            this.d.l(s, s2);
        }
        catch (IllegalArgumentException ex) {
            final Context a = this.a;
            if (a != null && H3.i.v(a)) {
                throw ex;
            }
            E3.f.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }
    
    public void Y(final String s, final String s2) {
        try {
            this.d.m(s, s2);
        }
        catch (IllegalArgumentException ex) {
            final Context a = this.a;
            if (a != null && H3.i.v(a)) {
                throw ex;
            }
            E3.f.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }
    
    public void Z(final String s) {
        this.d.o(s);
    }
    
    public j a0(final j j) {
        if (!this.m.m()) {
            E3.f.f().i("No crash reports are available to be sent.");
            this.p.e(Boolean.FALSE);
            return V2.m.e(null);
        }
        E3.f.f().i("Crash reports are available to be sent.");
        return this.b0().o(new V2.i() {
            public j b(final Boolean b) {
                return H3.q.m(H3.q.this).i(new Callable() {
                    public j a() {
                        if (!b) {
                            E3.f.f().i("Deleting cached crash reports...");
                            s(H3.q.this.N());
                            H3.q.h(H3.q.this).v();
                            H3.q.this.r.e(null);
                            return V2.m.e(null);
                        }
                        E3.f.f().b("Sending cached crash reports...");
                        H3.q.l(H3.q.this).c(b);
                        final Executor c = H3.q.m(H3.q.this).c();
                        return j.p(c, new i() {
                            public j b(final d d) {
                                if (d == null) {
                                    E3.f.f().k("Received null app settings at app startup. Cannot send cached reports");
                                }
                                else {
                                    H3.q.this.P();
                                    H3.q.h(H3.q.this).w(c);
                                    H3.q.this.r.e(null);
                                }
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
            E3.f.f().b("Automatic data collection is enabled. Allowing upload.");
            this.p.e(Boolean.FALSE);
            return V2.m.e(Boolean.TRUE);
        }
        E3.f.f().b("Automatic data collection is disabled.");
        E3.f.f().i("Notifying that unsent reports are available.");
        this.p.e(Boolean.TRUE);
        final j o = this.b.j().o(new V2.i() {
            public j b(final Void void1) {
                return V2.m.e(Boolean.TRUE);
            }
        });
        E3.f.f().b("Waiting for send/deleteUnsentReports to be called.");
        return c0.n(o, this.q.a());
    }
    
    public final void c0(final String str) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 30) {
            final f f = E3.f.f();
            final StringBuilder sb = new StringBuilder();
            sb.append("ANR feature enabled, but device is API ");
            sb.append(sdk_INT);
            f.i(sb.toString());
            return;
        }
        final List a = H3.o.a((ActivityManager)this.a.getSystemService("activity"), (String)null, 0, 0);
        if (a.size() != 0) {
            this.m.u(str, a, new c(this.g, str), I3.i.i(str, this.g, this.e));
            return;
        }
        final f f2 = E3.f.f();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("No ApplicationExitInfo available. Session: ");
        sb2.append(str);
        f2.i(sb2.toString());
    }
    
    public void d0(final Thread thread, final Throwable t) {
        this.e.g(new Runnable() {
            public final /* synthetic */ long o = System.currentTimeMillis();
            
            @Override
            public void run() {
                if (!H3.q.this.L()) {
                    final long b = H(this.o);
                    final String c = H3.q.this.D();
                    if (c == null) {
                        E3.f.f().k("Tried to write a non-fatal exception while no session was open.");
                        return;
                    }
                    H3.q.h(H3.q.this).t(t, thread, c, b);
                }
            }
        });
    }
    
    public void e0(final long n, final String s) {
        this.e.h(new Callable() {
            public Void a() {
                if (!H3.q.this.L()) {
                    H3.q.e(H3.q.this).g(n, s);
                }
                return null;
            }
        });
    }
    
    public j o() {
        if (!this.s.compareAndSet(false, true)) {
            E3.f.f().k("checkForUnsentReports should only be called once per execution.");
            return V2.m.e(Boolean.FALSE);
        }
        return this.p.a();
    }
    
    public j t() {
        this.q.e(Boolean.FALSE);
        return this.r.a();
    }
    
    public boolean u() {
        if (!this.c.c()) {
            final String d = this.D();
            return d != null && this.j.d(d);
        }
        E3.f.f().i("Found previous crash marker.");
        this.c.d();
        return true;
    }
    
    public void v(final O3.i i) {
        this.w(false, i);
    }
    
    public final void w(final boolean b, final O3.i i) {
        throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public final void x(final String str, final Boolean b) {
        final long e = E();
        final f f = E3.f.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("Opening a new session with ID ");
        sb.append(str);
        f.b(sb.toString());
        this.j.c(str, String.format(Locale.US, "Crashlytics Android SDK/%s", H3.s.l()), e, D.b(p(this.f, this.h), r(), q(this.a)));
        if (b && str != null) {
            this.d.n(str);
        }
        this.i.e(str);
        this.l.e(str);
        this.m.p(str, e);
    }
    
    public final void y(final long lng) {
        try {
            final g g = this.g;
            final StringBuilder sb = new StringBuilder();
            sb.append(".ae");
            sb.append(lng);
            if (g.e(sb.toString()).createNewFile()) {
                return;
            }
            throw new IOException("Create new file failed.");
        }
        catch (IOException ex) {
            E3.f.f().l("Could not create app exception marker file.", ex);
        }
    }
    
    public void z(final String s, final Thread.UncaughtExceptionHandler uncaughtExceptionHandler, final O3.i o) {
        this.o = o;
        this.T(s);
        Thread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler)(this.n = new w((w.a)new w.a() {
            @Override
            public void a(final O3.i i, final Thread thread, final Throwable t) {
                H3.q.this.J(i, thread, t);
            }
        }, o, uncaughtExceptionHandler, this.j)));
    }
}
