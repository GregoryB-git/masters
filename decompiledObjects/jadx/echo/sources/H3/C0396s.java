package H3;

import V2.AbstractC0659j;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import s3.C1947e;

/* renamed from: H3.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0396s {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2344a;

    /* renamed from: b, reason: collision with root package name */
    public final C1947e f2345b;

    /* renamed from: c, reason: collision with root package name */
    public final C0402y f2346c;

    /* renamed from: f, reason: collision with root package name */
    public C0397t f2349f;

    /* renamed from: g, reason: collision with root package name */
    public C0397t f2350g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2351h;

    /* renamed from: i, reason: collision with root package name */
    public C0395q f2352i;

    /* renamed from: j, reason: collision with root package name */
    public final C f2353j;

    /* renamed from: k, reason: collision with root package name */
    public final M3.g f2354k;

    /* renamed from: l, reason: collision with root package name */
    public final G3.b f2355l;

    /* renamed from: m, reason: collision with root package name */
    public final F3.a f2356m;

    /* renamed from: n, reason: collision with root package name */
    public final ExecutorService f2357n;

    /* renamed from: o, reason: collision with root package name */
    public final C0392n f2358o;

    /* renamed from: p, reason: collision with root package name */
    public final C0391m f2359p;

    /* renamed from: q, reason: collision with root package name */
    public final E3.a f2360q;

    /* renamed from: e, reason: collision with root package name */
    public final long f2348e = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    public final H f2347d = new H();

    /* renamed from: H3.s$a */
    public class a implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ O3.i f2361o;

        public a(O3.i iVar) {
            this.f2361o = iVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC0659j call() {
            return C0396s.this.i(this.f2361o);
        }
    }

    /* renamed from: H3.s$b */
    public class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ O3.i f2363o;

        public b(O3.i iVar) {
            this.f2363o = iVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0396s.this.i(this.f2363o);
        }
    }

    /* renamed from: H3.s$c */
    public class c implements Callable {
        public c() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            try {
                boolean d7 = C0396s.this.f2349f.d();
                if (!d7) {
                    E3.f.f().k("Initialization marker file was not properly removed.");
                }
                return Boolean.valueOf(d7);
            } catch (Exception e7) {
                E3.f.f().e("Problem encountered deleting Crashlytics initialization marker.", e7);
                return Boolean.FALSE;
            }
        }
    }

    /* renamed from: H3.s$d */
    public class d implements Callable {
        public d() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return Boolean.valueOf(C0396s.this.f2352i.u());
        }
    }

    public C0396s(C1947e c1947e, C c7, E3.a aVar, C0402y c0402y, G3.b bVar, F3.a aVar2, M3.g gVar, ExecutorService executorService, C0391m c0391m) {
        this.f2345b = c1947e;
        this.f2346c = c0402y;
        this.f2344a = c1947e.m();
        this.f2353j = c7;
        this.f2360q = aVar;
        this.f2355l = bVar;
        this.f2356m = aVar2;
        this.f2357n = executorService;
        this.f2354k = gVar;
        this.f2358o = new C0392n(executorService);
        this.f2359p = c0391m;
    }

    public static String l() {
        return "18.5.1";
    }

    public static boolean m(String str, boolean z7) {
        if (!z7) {
            E3.f.f().i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
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
        boolean z7;
        try {
            z7 = Boolean.TRUE.equals((Boolean) c0.f(this.f2358o.h(new d())));
        } catch (Exception unused) {
            z7 = false;
        }
        this.f2351h = z7;
    }

    public AbstractC0659j e() {
        return this.f2352i.o();
    }

    public AbstractC0659j f() {
        return this.f2352i.t();
    }

    public boolean g() {
        return this.f2351h;
    }

    public boolean h() {
        return this.f2349f.c();
    }

    public final AbstractC0659j i(O3.i iVar) {
        r();
        try {
            this.f2355l.a(new G3.a() { // from class: H3.r
                @Override // G3.a
                public final void a(String str) {
                    C0396s.this.n(str);
                }
            });
            this.f2352i.V();
            if (!iVar.b().f3977b.f3984a) {
                E3.f.f().b("Collection of crash reports disabled in Crashlytics settings.");
                return V2.m.d(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
            }
            if (!this.f2352i.B(iVar)) {
                E3.f.f().k("Previous sessions could not be finalized.");
            }
            return this.f2352i.a0(iVar.a());
        } catch (Exception e7) {
            E3.f.f().e("Crashlytics encountered a problem during asynchronous initialization.", e7);
            return V2.m.d(e7);
        } finally {
            q();
        }
    }

    public AbstractC0659j j(O3.i iVar) {
        return c0.h(this.f2357n, new a(iVar));
    }

    public final void k(O3.i iVar) {
        E3.f f7;
        String str;
        Future<?> submit = this.f2357n.submit(new b(iVar));
        E3.f.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            submit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e7) {
            e = e7;
            f7 = E3.f.f();
            str = "Crashlytics was interrupted during initialization.";
            f7.e(str, e);
        } catch (ExecutionException e8) {
            e = e8;
            f7 = E3.f.f();
            str = "Crashlytics encountered a problem during initialization.";
            f7.e(str, e);
        } catch (TimeoutException e9) {
            e = e9;
            f7 = E3.f.f();
            str = "Crashlytics timed out during initialization.";
            f7.e(str, e);
        }
    }

    public void n(String str) {
        this.f2352i.e0(System.currentTimeMillis() - this.f2348e, str);
    }

    public void o(Throwable th) {
        this.f2352i.d0(Thread.currentThread(), th);
    }

    public void p(Throwable th) {
        E3.f.f().b("Recorded on-demand fatal events: " + this.f2347d.b());
        E3.f.f().b("Dropped on-demand fatal events: " + this.f2347d.a());
        this.f2352i.Y("com.crashlytics.on-demand.recorded-exceptions", Integer.toString(this.f2347d.b()));
        this.f2352i.Y("com.crashlytics.on-demand.dropped-exceptions", Integer.toString(this.f2347d.a()));
        this.f2352i.Q(Thread.currentThread(), th);
    }

    public void q() {
        this.f2358o.h(new c());
    }

    public void r() {
        this.f2358o.b();
        this.f2349f.a();
        E3.f.f().i("Initialization marker file was created.");
    }

    public boolean s(C0379a c0379a, O3.i iVar) {
        if (!m(c0379a.f2240b, AbstractC0387i.j(this.f2344a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String c0386h = new C0386h(this.f2353j).toString();
        try {
            this.f2350g = new C0397t("crash_marker", this.f2354k);
            this.f2349f = new C0397t("initialization_marker", this.f2354k);
            I3.i iVar2 = new I3.i(c0386h, this.f2354k, this.f2358o);
            I3.c cVar = new I3.c(this.f2354k);
            this.f2352i = new C0395q(this.f2344a, this.f2358o, this.f2353j, this.f2346c, this.f2354k, this.f2350g, c0379a, iVar2, cVar, V.g(this.f2344a, this.f2353j, this.f2354k, c0379a, cVar, iVar2, new P3.a(1024, new P3.c(10)), iVar, this.f2347d, this.f2359p), this.f2360q, this.f2356m, this.f2359p);
            boolean h7 = h();
            d();
            this.f2352i.z(c0386h, Thread.getDefaultUncaughtExceptionHandler(), iVar);
            if (!h7 || !AbstractC0387i.d(this.f2344a)) {
                E3.f.f().b("Successfully configured exception handler.");
                return true;
            }
            E3.f.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            k(iVar);
            return false;
        } catch (Exception e7) {
            E3.f.f().e("Crashlytics was not started due to an exception during initialization", e7);
            this.f2352i = null;
            return false;
        }
    }

    public AbstractC0659j t() {
        return this.f2352i.W();
    }

    public void u(Boolean bool) {
        this.f2346c.h(bool);
    }

    public void v(String str, String str2) {
        this.f2352i.X(str, str2);
    }

    public void w(String str, String str2) {
        this.f2352i.Y(str, str2);
    }

    public void x(String str) {
        this.f2352i.Z(str);
    }
}
