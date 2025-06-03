// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import P3.d;
import I3.c;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import android.util.Log;
import android.text.TextUtils;
import E3.f;
import V2.j;
import O3.i;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import F3.a;
import G3.b;
import M3.g;
import s3.e;
import android.content.Context;

public class s
{
    public final Context a;
    public final e b;
    public final y c;
    public final H d;
    public final long e;
    public t f;
    public t g;
    public boolean h;
    public q i;
    public final C j;
    public final g k;
    public final b l;
    public final a m;
    public final ExecutorService n;
    public final n o;
    public final m p;
    public final E3.a q;
    
    public s(final e b, final C j, final E3.a q, final y c, final b l, final a m, final g k, final ExecutorService n, final m p9) {
        this.b = b;
        this.c = c;
        this.a = b.m();
        this.j = j;
        this.q = q;
        this.l = l;
        this.m = m;
        this.n = n;
        this.k = k;
        this.o = new n(n);
        this.p = p9;
        this.e = System.currentTimeMillis();
        this.d = new H();
    }
    
    public static /* synthetic */ t b(final s s) {
        return s.f;
    }
    
    public static /* synthetic */ q c(final s s) {
        return s.i;
    }
    
    public static String l() {
        return "18.5.1";
    }
    
    public static boolean m(final String s, final boolean b) {
        if (!b) {
            f.f().i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty((CharSequence)s)) {
            return true;
        }
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".     |  | ");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".   \\ |  | /");
        Log.e("FirebaseCrashlytics", ".    \\    /");
        Log.e("FirebaseCrashlytics", ".     \\  /");
        Log.e("FirebaseCrashlytics", ".      \\/");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e("FirebaseCrashlytics", ".");
        Log.e("FirebaseCrashlytics", ".      /\\");
        Log.e("FirebaseCrashlytics", ".     /  \\");
        Log.e("FirebaseCrashlytics", ".    /    \\");
        Log.e("FirebaseCrashlytics", ".   / |  | \\");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".     |  |");
        Log.e("FirebaseCrashlytics", ".");
        return false;
    }
    
    public final void d() {
        final j h = this.o.h(new Callable() {
            public Boolean a() {
                return s.c(s.this).u();
            }
        });
        while (true) {
            try {
                boolean equals = Boolean.TRUE.equals(c0.f(h));
                while (true) {
                    this.h = equals;
                    return;
                    equals = false;
                    continue;
                }
            }
            catch (Exception ex) {
                continue;
            }
            break;
        }
    }
    
    public j e() {
        return this.i.o();
    }
    
    public j f() {
        return this.i.t();
    }
    
    public boolean g() {
        return this.h;
    }
    
    public boolean h() {
        return this.f.c();
    }
    
    public final j i(final i i) {
        this.r();
        Label_0078: {
            try {
                try {
                    this.l.a(new r(this));
                    this.i.V();
                    if (!i.b().b.a) {
                        E3.f.f().b("Collection of crash reports disabled in Crashlytics settings.");
                        final j d = V2.m.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                        this.q();
                        return d;
                    }
                    break Label_0078;
                }
                finally {}
            }
            catch (Exception ex) {
                E3.f.f().e("Crashlytics encountered a problem during asynchronous initialization.", ex);
                final j d2 = V2.m.d(ex);
                this.q();
                return d2;
                while (true) {
                    final i j;
                    final j a0 = this.i.a0(j.a());
                    this.q();
                    return a0;
                    E3.f.f().k("Previous sessions could not be finalized.");
                    continue;
                }
            }
            // iftrue(Label_0097:, this.i.B(j))
        }
        this.q();
    }
    
    public j j(final i i) {
        return c0.h(this.n, new Callable() {
            public j a() {
                return s.this.i(i);
            }
        });
    }
    
    public final void k(final i i) {
        final Future<?> submit = this.n.submit(new Runnable() {
            @Override
            public void run() {
                s.this.i(i);
            }
        });
        E3.f.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        while (true) {
            Label_0082: {
                Label_0071: {
                    try {
                        submit.get(3L, TimeUnit.SECONDS);
                        return;
                    }
                    catch (TimeoutException ex) {}
                    catch (ExecutionException ex) {
                        break Label_0071;
                    }
                    catch (InterruptedException ex) {
                        break Label_0082;
                    }
                    final f f = E3.f.f();
                    final String s = "Crashlytics timed out during initialization.";
                    final TimeoutException ex;
                    f.e(s, ex);
                    return;
                }
                final f f = E3.f.f();
                final String s = "Crashlytics encountered a problem during initialization.";
                continue;
            }
            final f f = E3.f.f();
            final String s = "Crashlytics was interrupted during initialization.";
            continue;
        }
    }
    
    public void n(final String s) {
        this.i.e0(System.currentTimeMillis() - this.e, s);
    }
    
    public void o(final Throwable t) {
        this.i.d0(Thread.currentThread(), t);
    }
    
    public void p(final Throwable t) {
        final f f = E3.f.f();
        final StringBuilder sb = new StringBuilder();
        sb.append("Recorded on-demand fatal events: ");
        sb.append(this.d.b());
        f.b(sb.toString());
        final f f2 = E3.f.f();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Dropped on-demand fatal events: ");
        sb2.append(this.d.a());
        f2.b(sb2.toString());
        this.i.Y("com.crashlytics.on-demand.recorded-exceptions", Integer.toString(this.d.b()));
        this.i.Y("com.crashlytics.on-demand.dropped-exceptions", Integer.toString(this.d.a()));
        this.i.Q(Thread.currentThread(), t);
    }
    
    public void q() {
        this.o.h(new Callable() {
            public Boolean a() {
                while (true) {
                    try {
                        final boolean d = s.b(s.this).d();
                        if (!d) {
                            E3.f.f().k("Initialization marker file was not properly removed.");
                        }
                        return d;
                        final Exception ex;
                        E3.f.f().e("Problem encountered deleting Crashlytics initialization marker.", ex);
                        return Boolean.FALSE;
                    }
                    catch (Exception ex) {
                        continue;
                    }
                    break;
                }
            }
        });
    }
    
    public void r() {
        this.o.b();
        this.f.a();
        E3.f.f().i("Initialization marker file was created.");
    }
    
    public boolean s(final H3.a a, final i i) {
        if (m(a.b, i.j(this.a, "com.crashlytics.RequireBuildId", true))) {
            final String string = new h(this.j).toString();
            Label_0289: {
                try {
                    this.g = new t("crash_marker", this.k);
                    this.f = new t("initialization_marker", this.k);
                    final I3.i j = new I3.i(string, this.k, this.o);
                    final c c = new c(this.k);
                    this.i = new q(this.a, this.o, this.j, this.c, this.k, this.g, a, j, c, V.g(this.a, this.j, this.k, a, c, j, new P3.a(1024, new d[] { new P3.c(10) }), i, this.d, this.p), this.q, this.m, this.p);
                    final boolean h = this.h();
                    this.d();
                    this.i.z(string, Thread.getDefaultUncaughtExceptionHandler(), i);
                    if (h && i.d(this.a)) {
                        E3.f.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                        this.k(i);
                        return false;
                    }
                }
                catch (Exception ex) {
                    break Label_0289;
                }
                E3.f.f().b("Successfully configured exception handler.");
                return true;
            }
            final Exception ex;
            E3.f.f().e("Crashlytics was not started due to an exception during initialization", ex);
            this.i = null;
            return false;
        }
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
    }
    
    public j t() {
        return this.i.W();
    }
    
    public void u(final Boolean b) {
        this.c.h(b);
    }
    
    public void v(final String s, final String s2) {
        this.i.X(s, s2);
    }
    
    public void w(final String s, final String s2) {
        this.i.Y(s, s2);
    }
    
    public void x(final String s) {
        this.i.Z(s);
    }
}
