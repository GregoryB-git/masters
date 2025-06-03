/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.Log
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Thread$UncaughtExceptionHandler
 *  java.lang.Throwable
 *  java.util.concurrent.Callable
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Future
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 */
package H3;

import E3.f;
import G3.b;
import H3.C;
import H3.H;
import H3.V;
import H3.a;
import H3.c0;
import H3.h;
import H3.i;
import H3.m;
import H3.n;
import H3.q;
import H3.r;
import H3.t;
import H3.y;
import M3.g;
import O3.d;
import P3.c;
import P3.d;
import V2.j;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s3.e;

public class s {
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
    public final F3.a m;
    public final ExecutorService n;
    public final n o;
    public final m p;
    public final E3.a q;

    public s(e e8, C c8, E3.a a8, y y8, b b8, F3.a a9, g g8, ExecutorService executorService, m m8) {
        this.b = e8;
        this.c = y8;
        this.a = e8.m();
        this.j = c8;
        this.q = a8;
        this.l = b8;
        this.m = a9;
        this.n = executorService;
        this.k = g8;
        this.o = new n((Executor)executorService);
        this.p = m8;
        this.e = System.currentTimeMillis();
        this.d = new H();
    }

    public static String l() {
        return "18.5.1";
    }

    public static boolean m(String string2, boolean bl) {
        if (!bl) {
            f.f().i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            return true;
        }
        Log.e((String)"FirebaseCrashlytics", (String)".");
        Log.e((String)"FirebaseCrashlytics", (String)".     |  | ");
        Log.e((String)"FirebaseCrashlytics", (String)".     |  |");
        Log.e((String)"FirebaseCrashlytics", (String)".     |  |");
        Log.e((String)"FirebaseCrashlytics", (String)".   \\ |  | /");
        Log.e((String)"FirebaseCrashlytics", (String)".    \\    /");
        Log.e((String)"FirebaseCrashlytics", (String)".     \\  /");
        Log.e((String)"FirebaseCrashlytics", (String)".      \\/");
        Log.e((String)"FirebaseCrashlytics", (String)".");
        Log.e((String)"FirebaseCrashlytics", (String)"The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        Log.e((String)"FirebaseCrashlytics", (String)".");
        Log.e((String)"FirebaseCrashlytics", (String)".      /\\");
        Log.e((String)"FirebaseCrashlytics", (String)".     /  \\");
        Log.e((String)"FirebaseCrashlytics", (String)".    /    \\");
        Log.e((String)"FirebaseCrashlytics", (String)".   / |  | \\");
        Log.e((String)"FirebaseCrashlytics", (String)".     |  |");
        Log.e((String)"FirebaseCrashlytics", (String)".     |  |");
        Log.e((String)"FirebaseCrashlytics", (String)".     |  |");
        Log.e((String)"FirebaseCrashlytics", (String)".");
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        boolean bl;
        block2 : {
            j j8 = this.o.h(new Callable(){

                public Boolean a() {
                    return s.this.i.u();
                }
            });
            try {
                j8 = (Boolean)c0.f(j8);
            }
            catch (Exception exception) {}
            bl = Boolean.TRUE.equals((Object)j8);
            break block2;
            bl = false;
        }
        this.h = bl;
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final j i(O3.i object) {
        Throwable throwable2;
        block7 : {
            j j8;
            block6 : {
                this.r();
                this.l.a(new r(this));
                this.i.V();
                if (object.b().b.a) break block6;
                f.f().b("Collection of crash reports disabled in Crashlytics settings.");
                object = V2.m.d((Exception)new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                this.q();
                return object;
            }
            try {
                if (!this.i.B((O3.i)object)) {
                    f.f().k("Previous sessions could not be finalized.");
                }
                object = this.i.a0(object.a());
            }
            catch (Throwable throwable2) {
                break block7;
            }
            catch (Exception exception) {}
            this.q();
            return object;
            {
                f.f().e("Crashlytics encountered a problem during asynchronous initialization.", (Throwable)exception);
                j8 = V2.m.d(exception);
            }
            this.q();
            return j8;
        }
        this.q();
        throw throwable2;
    }

    public j j(final O3.i i8) {
        return c0.h((Executor)this.n, new Callable(){

            public j a() {
                return s.this.i(i8);
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void k(O3.i object) {
        void var3_5;
        String string2;
        block6 : {
            block5 : {
                block4 : {
                    object = new Runnable((O3.i)object){
                        public final /* synthetic */ O3.i o;
                        {
                            this.o = i8;
                        }

                        public void run() {
                            s.this.i(this.o);
                        }
                    };
                    object = this.n.submit((Runnable)object);
                    f.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
                    try {
                        object.get(3L, TimeUnit.SECONDS);
                        return;
                    }
                    catch (TimeoutException timeoutException) {
                    }
                    catch (ExecutionException executionException) {
                        break block4;
                    }
                    catch (InterruptedException interruptedException) {
                        break block5;
                    }
                    object = f.f();
                    string2 = "Crashlytics timed out during initialization.";
                    break block6;
                }
                object = f.f();
                string2 = "Crashlytics encountered a problem during initialization.";
                break block6;
            }
            object = f.f();
            string2 = "Crashlytics was interrupted during initialization.";
        }
        object.e(string2, (Throwable)var3_5);
    }

    public void n(String string2) {
        long l8 = System.currentTimeMillis();
        long l9 = this.e;
        this.i.e0(l8 - l9, string2);
    }

    public void o(Throwable throwable) {
        this.i.d0(Thread.currentThread(), throwable);
    }

    public void p(Throwable throwable) {
        f f8 = f.f();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Recorded on-demand fatal events: ");
        stringBuilder.append(this.d.b());
        f8.b(stringBuilder.toString());
        f8 = f.f();
        stringBuilder = new StringBuilder();
        stringBuilder.append("Dropped on-demand fatal events: ");
        stringBuilder.append(this.d.a());
        f8.b(stringBuilder.toString());
        this.i.Y("com.crashlytics.on-demand.recorded-exceptions", Integer.toString((int)this.d.b()));
        this.i.Y("com.crashlytics.on-demand.dropped-exceptions", Integer.toString((int)this.d.a()));
        this.i.Q(Thread.currentThread(), throwable);
    }

    public void q() {
        this.o.h(new Callable(){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public Boolean a() {
                boolean bl;
                Exception exception2;
                block2 : {
                    try {
                        bl = s.this.f.d();
                        if (bl) break block2;
                        f.f().k("Initialization marker file was not properly removed.");
                    }
                    catch (Exception exception2) {}
                }
                return bl;
                f.f().e("Problem encountered deleting Crashlytics initialization marker.", (Throwable)exception2);
                return Boolean.FALSE;
            }
        });
    }

    public void r() {
        this.o.b();
        this.f.a();
        f.f().i("Initialization marker file was created.");
    }

    public boolean s(a a8, O3.i i8) {
        boolean bl = i.j(this.a, "com.crashlytics.RequireBuildId", true);
        if (s.m(a8.b, bl)) {
            Exception exception2;
            block6 : {
                block5 : {
                    String string2 = new h(this.j).toString();
                    try {
                        this.g = new t("crash_marker", this.k);
                        this.f = new t("initialization_marker", this.k);
                        I3.i i9 = new I3.i(string2, this.k, this.o);
                        I3.c c8 = new I3.c(this.k);
                        Object object = new P3.a(1024, new c(10));
                        object = V.g(this.a, this.j, this.k, a8, c8, i9, (d)object, i8, this.d, this.p);
                        this.i = new q(this.a, this.o, this.j, this.c, this.k, this.g, a8, i9, c8, (V)object, this.q, this.m, this.p);
                        bl = this.h();
                        this.d();
                        this.i.z(string2, Thread.getDefaultUncaughtExceptionHandler(), i8);
                        if (!bl) break block5;
                    }
                    catch (Exception exception2) {
                        break block6;
                    }
                    if (i.d(this.a)) {
                        f.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
                        this.k(i8);
                        return false;
                    }
                }
                f.f().b("Successfully configured exception handler.");
                return true;
            }
            f.f().e("Crashlytics was not started due to an exception during initialization", (Throwable)exception2);
            this.i = null;
            return false;
        }
        throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
    }

    public j t() {
        return this.i.W();
    }

    public void u(Boolean bl) {
        this.c.h(bl);
    }

    public void v(String string2, String string3) {
        this.i.X(string2, string3);
    }

    public void w(String string2, String string3) {
        this.i.Y(string2, string3);
    }

    public void x(String string2) {
        this.i.Z(string2);
    }

}

