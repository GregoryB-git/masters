package H3;

import H3.C0400w;
import J3.B;
import J3.D;
import V2.AbstractC0659j;
import V2.C0660k;
import V2.InterfaceC0658i;
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
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.SortedSet;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: H3.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0395q {

    /* renamed from: t, reason: collision with root package name */
    public static final FilenameFilter f2295t = new FilenameFilter() { // from class: H3.p
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            boolean M6;
            M6 = C0395q.M(file, str);
            return M6;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final Context f2296a;

    /* renamed from: b, reason: collision with root package name */
    public final C0402y f2297b;

    /* renamed from: c, reason: collision with root package name */
    public final C0397t f2298c;

    /* renamed from: d, reason: collision with root package name */
    public final I3.i f2299d;

    /* renamed from: e, reason: collision with root package name */
    public final C0392n f2300e;

    /* renamed from: f, reason: collision with root package name */
    public final C f2301f;

    /* renamed from: g, reason: collision with root package name */
    public final M3.g f2302g;

    /* renamed from: h, reason: collision with root package name */
    public final C0379a f2303h;

    /* renamed from: i, reason: collision with root package name */
    public final I3.c f2304i;

    /* renamed from: j, reason: collision with root package name */
    public final E3.a f2305j;

    /* renamed from: k, reason: collision with root package name */
    public final F3.a f2306k;

    /* renamed from: l, reason: collision with root package name */
    public final C0391m f2307l;

    /* renamed from: m, reason: collision with root package name */
    public final V f2308m;

    /* renamed from: n, reason: collision with root package name */
    public C0400w f2309n;

    /* renamed from: o, reason: collision with root package name */
    public O3.i f2310o = null;

    /* renamed from: p, reason: collision with root package name */
    public final C0660k f2311p = new C0660k();

    /* renamed from: q, reason: collision with root package name */
    public final C0660k f2312q = new C0660k();

    /* renamed from: r, reason: collision with root package name */
    public final C0660k f2313r = new C0660k();

    /* renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f2314s = new AtomicBoolean(false);

    /* renamed from: H3.q$a */
    public class a implements C0400w.a {
        public a() {
        }

        @Override // H3.C0400w.a
        public void a(O3.i iVar, Thread thread, Throwable th) {
            C0395q.this.J(iVar, thread, th);
        }
    }

    /* renamed from: H3.q$b */
    public class b implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f2316o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Throwable f2317p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Thread f2318q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ O3.i f2319r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f2320s;

        /* renamed from: H3.q$b$a */
        public class a implements InterfaceC0658i {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Executor f2322a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f2323b;

            public a(Executor executor, String str) {
                this.f2322a = executor;
                this.f2323b = str;
            }

            @Override // V2.InterfaceC0658i
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public AbstractC0659j a(O3.d dVar) {
                if (dVar == null) {
                    E3.f.f().k("Received null app settings, cannot send reports at crash time.");
                    return V2.m.e(null);
                }
                AbstractC0659j[] abstractC0659jArr = new AbstractC0659j[2];
                abstractC0659jArr[0] = C0395q.this.P();
                abstractC0659jArr[1] = C0395q.this.f2308m.x(this.f2322a, b.this.f2320s ? this.f2323b : null);
                return V2.m.g(abstractC0659jArr);
            }
        }

        public b(long j7, Throwable th, Thread thread, O3.i iVar, boolean z7) {
            this.f2316o = j7;
            this.f2317p = th;
            this.f2318q = thread;
            this.f2319r = iVar;
            this.f2320s = z7;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public AbstractC0659j call() {
            long H6 = C0395q.H(this.f2316o);
            String D7 = C0395q.this.D();
            if (D7 == null) {
                E3.f.f().d("Tried to write a fatal exception while no session was open.");
                return V2.m.e(null);
            }
            C0395q.this.f2298c.a();
            C0395q.this.f2308m.s(this.f2317p, this.f2318q, D7, H6);
            C0395q.this.y(this.f2316o);
            C0395q.this.v(this.f2319r);
            C0395q.this.x(new C0386h(C0395q.this.f2301f).toString(), Boolean.valueOf(this.f2320s));
            if (!C0395q.this.f2297b.d()) {
                return V2.m.e(null);
            }
            Executor c7 = C0395q.this.f2300e.c();
            return this.f2319r.a().p(c7, new a(c7, D7));
        }
    }

    /* renamed from: H3.q$c */
    public class c implements InterfaceC0658i {
        public c() {
        }

        @Override // V2.InterfaceC0658i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC0659j a(Void r12) {
            return V2.m.e(Boolean.TRUE);
        }
    }

    /* renamed from: H3.q$d */
    public class d implements InterfaceC0658i {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AbstractC0659j f2326a;

        /* renamed from: H3.q$d$a */
        public class a implements Callable {

            /* renamed from: o, reason: collision with root package name */
            public final /* synthetic */ Boolean f2328o;

            /* renamed from: H3.q$d$a$a, reason: collision with other inner class name */
            public class C0039a implements InterfaceC0658i {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ Executor f2330a;

                public C0039a(Executor executor) {
                    this.f2330a = executor;
                }

                @Override // V2.InterfaceC0658i
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public AbstractC0659j a(O3.d dVar) {
                    if (dVar == null) {
                        E3.f.f().k("Received null app settings at app startup. Cannot send cached reports");
                    } else {
                        C0395q.this.P();
                        C0395q.this.f2308m.w(this.f2330a);
                        C0395q.this.f2313r.e(null);
                    }
                    return V2.m.e(null);
                }
            }

            public a(Boolean bool) {
                this.f2328o = bool;
            }

            @Override // java.util.concurrent.Callable
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public AbstractC0659j call() {
                if (this.f2328o.booleanValue()) {
                    E3.f.f().b("Sending cached crash reports...");
                    C0395q.this.f2297b.c(this.f2328o.booleanValue());
                    Executor c7 = C0395q.this.f2300e.c();
                    return d.this.f2326a.p(c7, new C0039a(c7));
                }
                E3.f.f().i("Deleting cached crash reports...");
                C0395q.s(C0395q.this.N());
                C0395q.this.f2308m.v();
                C0395q.this.f2313r.e(null);
                return V2.m.e(null);
            }
        }

        public d(AbstractC0659j abstractC0659j) {
            this.f2326a = abstractC0659j;
        }

        @Override // V2.InterfaceC0658i
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public AbstractC0659j a(Boolean bool) {
            return C0395q.this.f2300e.i(new a(bool));
        }
    }

    /* renamed from: H3.q$e */
    public class e implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f2332o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ String f2333p;

        public e(long j7, String str) {
            this.f2332o = j7;
            this.f2333p = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (C0395q.this.L()) {
                return null;
            }
            C0395q.this.f2304i.g(this.f2332o, this.f2333p);
            return null;
        }
    }

    /* renamed from: H3.q$f */
    public class f implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f2335o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ Throwable f2336p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Thread f2337q;

        public f(long j7, Throwable th, Thread thread) {
            this.f2335o = j7;
            this.f2336p = th;
            this.f2337q = thread;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0395q.this.L()) {
                return;
            }
            long H6 = C0395q.H(this.f2335o);
            String D7 = C0395q.this.D();
            if (D7 == null) {
                E3.f.f().k("Tried to write a non-fatal exception while no session was open.");
            } else {
                C0395q.this.f2308m.t(this.f2336p, this.f2337q, D7, H6);
            }
        }
    }

    /* renamed from: H3.q$g */
    public class g implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ String f2339o;

        public g(String str) {
            this.f2339o = str;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            C0395q.this.x(this.f2339o, Boolean.FALSE);
            return null;
        }
    }

    /* renamed from: H3.q$h */
    public class h implements Callable {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f2341o;

        public h(long j7) {
            this.f2341o = j7;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            Bundle bundle = new Bundle();
            bundle.putInt("fatal", 1);
            bundle.putLong("timestamp", this.f2341o);
            C0395q.this.f2306k.a("_ae", bundle);
            return null;
        }
    }

    public C0395q(Context context, C0392n c0392n, C c7, C0402y c0402y, M3.g gVar, C0397t c0397t, C0379a c0379a, I3.i iVar, I3.c cVar, V v7, E3.a aVar, F3.a aVar2, C0391m c0391m) {
        this.f2296a = context;
        this.f2300e = c0392n;
        this.f2301f = c7;
        this.f2297b = c0402y;
        this.f2302g = gVar;
        this.f2298c = c0397t;
        this.f2303h = c0379a;
        this.f2299d = iVar;
        this.f2304i = cVar;
        this.f2305j = aVar;
        this.f2306k = aVar2;
        this.f2307l = c0391m;
        this.f2308m = v7;
    }

    public static boolean C() {
        try {
            Class.forName("com.google.firebase.crash.FirebaseCrash");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static long E() {
        return H(System.currentTimeMillis());
    }

    public static List F(E3.g gVar, String str, M3.g gVar2, byte[] bArr) {
        File o7 = gVar2.o(str, "user-data");
        File o8 = gVar2.o(str, "keys");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0385g("logs_file", "logs", bArr));
        arrayList.add(new B("crash_meta_file", "metadata", gVar.g()));
        arrayList.add(new B("session_meta_file", "session", gVar.f()));
        arrayList.add(new B("app_meta_file", "app", gVar.a()));
        arrayList.add(new B("device_meta_file", "device", gVar.c()));
        arrayList.add(new B("os_meta_file", "os", gVar.b()));
        arrayList.add(S(gVar));
        arrayList.add(new B("user_meta_file", "user", o7));
        arrayList.add(new B("keys_file", "keys", o8));
        return arrayList;
    }

    public static long H(long j7) {
        return j7 / 1000;
    }

    public static /* synthetic */ boolean M(File file, String str) {
        return str.startsWith(".ae");
    }

    public static boolean R(String str, File file, B.a aVar) {
        if (file == null || !file.exists()) {
            E3.f.f().k("No minidump data found for session " + str);
        }
        if (aVar == null) {
            E3.f.f().g("No Tombstones data found for session " + str);
        }
        return (file == null || !file.exists()) && aVar == null;
    }

    public static F S(E3.g gVar) {
        File e7 = gVar.e();
        return (e7 == null || !e7.exists()) ? new C0385g("minidump_file", "minidump", new byte[]{0}) : new B("minidump_file", "minidump", e7);
    }

    public static byte[] U(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
    }

    public static D.a p(C c7, C0379a c0379a) {
        return D.a.b(c7.f(), c0379a.f2244f, c0379a.f2245g, c7.a().c(), EnumC0403z.c(c0379a.f2242d).e(), c0379a.f2246h);
    }

    public static D.b q(Context context) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return D.b.c(AbstractC0387i.l(), Build.MODEL, Runtime.getRuntime().availableProcessors(), AbstractC0387i.b(context), statFs.getBlockCount() * statFs.getBlockSize(), AbstractC0387i.x(), AbstractC0387i.m(), Build.MANUFACTURER, Build.PRODUCT);
    }

    public static D.c r() {
        return D.c.a(Build.VERSION.RELEASE, Build.VERSION.CODENAME, AbstractC0387i.y());
    }

    public static void s(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public final void A(String str) {
        E3.f.f().i("Finalizing native report for session " + str);
        E3.g a7 = this.f2305j.a(str);
        File e7 = a7.e();
        B.a d7 = a7.d();
        if (R(str, e7, d7)) {
            E3.f.f().k("No native core present");
            return;
        }
        long lastModified = e7.lastModified();
        I3.c cVar = new I3.c(this.f2302g, str);
        File i7 = this.f2302g.i(str);
        if (!i7.isDirectory()) {
            E3.f.f().k("Couldn't create directory to store native session files, aborting.");
            return;
        }
        y(lastModified);
        List F6 = F(a7, str, this.f2302g, cVar.b());
        G.b(i7, F6);
        E3.f.f().b("CrashlyticsController#finalizePreviousNativeSession");
        this.f2308m.i(str, F6, d7);
        cVar.a();
    }

    public boolean B(O3.i iVar) {
        this.f2300e.b();
        if (L()) {
            E3.f.f().k("Skipping session finalization because a crash has already occurred.");
            return false;
        }
        E3.f.f().i("Finalizing previously open sessions.");
        try {
            w(true, iVar);
            E3.f.f().i("Closed all previously open sessions.");
            return true;
        } catch (Exception e7) {
            E3.f.f().e("Unable to finalize previously open sessions.", e7);
            return false;
        }
    }

    public final String D() {
        SortedSet o7 = this.f2308m.o();
        if (o7.isEmpty()) {
            return null;
        }
        return (String) o7.first();
    }

    public final InputStream G(String str) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (classLoader == null) {
            E3.f.f().k("Couldn't get Class Loader");
            return null;
        }
        InputStream resourceAsStream = classLoader.getResourceAsStream(str);
        if (resourceAsStream != null) {
            return resourceAsStream;
        }
        E3.f.f().g("No version control information found");
        return null;
    }

    public String I() {
        InputStream G6 = G("META-INF/version-control-info.textproto");
        if (G6 == null) {
            return null;
        }
        E3.f.f().b("Read version control info");
        return Base64.encodeToString(U(G6), 0);
    }

    public void J(O3.i iVar, Thread thread, Throwable th) {
        K(iVar, thread, th, false);
    }

    public synchronized void K(O3.i iVar, Thread thread, Throwable th, boolean z7) {
        E3.f.f().b("Handling uncaught exception \"" + th + "\" from thread " + thread.getName());
        try {
            c0.f(this.f2300e.i(new b(System.currentTimeMillis(), th, thread, iVar, z7)));
        } catch (TimeoutException unused) {
            E3.f.f().d("Cannot send reports. Timed out while fetching settings.");
        } catch (Exception e7) {
            E3.f.f().e("Error handling uncaught exception", e7);
        }
    }

    public boolean L() {
        C0400w c0400w = this.f2309n;
        return c0400w != null && c0400w.a();
    }

    public List N() {
        return this.f2302g.f(f2295t);
    }

    public final AbstractC0659j O(long j7) {
        if (C()) {
            E3.f.f().k("Skipping logging Crashlytics event to Firebase, FirebaseCrash exists");
            return V2.m.e(null);
        }
        E3.f.f().b("Logging app exception event to Firebase Analytics");
        return V2.m.c(new ScheduledThreadPoolExecutor(1), new h(j7));
    }

    public final AbstractC0659j P() {
        ArrayList arrayList = new ArrayList();
        for (File file : N()) {
            try {
                arrayList.add(O(Long.parseLong(file.getName().substring(3))));
            } catch (NumberFormatException unused) {
                E3.f.f().k("Could not parse app exception timestamp from file " + file.getName());
            }
            file.delete();
        }
        return V2.m.f(arrayList);
    }

    public void Q(Thread thread, Throwable th) {
        O3.i iVar = this.f2310o;
        if (iVar == null) {
            E3.f.f().k("settingsProvider not set");
        } else {
            K(iVar, thread, th, true);
        }
    }

    public void T(String str) {
        this.f2300e.h(new g(str));
    }

    public void V() {
        try {
            String I6 = I();
            if (I6 != null) {
                Y("com.crashlytics.version-control-info", I6);
                E3.f.f().g("Saved version control info");
            }
        } catch (IOException e7) {
            E3.f.f().l("Unable to save version control info", e7);
        }
    }

    public AbstractC0659j W() {
        this.f2312q.e(Boolean.TRUE);
        return this.f2313r.a();
    }

    public void X(String str, String str2) {
        try {
            this.f2299d.l(str, str2);
        } catch (IllegalArgumentException e7) {
            Context context = this.f2296a;
            if (context != null && AbstractC0387i.v(context)) {
                throw e7;
            }
            E3.f.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void Y(String str, String str2) {
        try {
            this.f2299d.m(str, str2);
        } catch (IllegalArgumentException e7) {
            Context context = this.f2296a;
            if (context != null && AbstractC0387i.v(context)) {
                throw e7;
            }
            E3.f.f().d("Attempting to set custom attribute with null key, ignoring.");
        }
    }

    public void Z(String str) {
        this.f2299d.o(str);
    }

    public AbstractC0659j a0(AbstractC0659j abstractC0659j) {
        if (this.f2308m.m()) {
            E3.f.f().i("Crash reports are available to be sent.");
            return b0().o(new d(abstractC0659j));
        }
        E3.f.f().i("No crash reports are available to be sent.");
        this.f2311p.e(Boolean.FALSE);
        return V2.m.e(null);
    }

    public final AbstractC0659j b0() {
        if (this.f2297b.d()) {
            E3.f.f().b("Automatic data collection is enabled. Allowing upload.");
            this.f2311p.e(Boolean.FALSE);
            return V2.m.e(Boolean.TRUE);
        }
        E3.f.f().b("Automatic data collection is disabled.");
        E3.f.f().i("Notifying that unsent reports are available.");
        this.f2311p.e(Boolean.TRUE);
        AbstractC0659j o7 = this.f2297b.j().o(new c());
        E3.f.f().b("Waiting for send/deleteUnsentReports to be called.");
        return c0.n(o7, this.f2312q.a());
    }

    public final void c0(String str) {
        List historicalProcessExitReasons;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30) {
            E3.f.f().i("ANR feature enabled, but device is API " + i7);
            return;
        }
        historicalProcessExitReasons = ((ActivityManager) this.f2296a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.size() != 0) {
            this.f2308m.u(str, historicalProcessExitReasons, new I3.c(this.f2302g, str), I3.i.i(str, this.f2302g, this.f2300e));
        } else {
            E3.f.f().i("No ApplicationExitInfo available. Session: " + str);
        }
    }

    public void d0(Thread thread, Throwable th) {
        this.f2300e.g(new f(System.currentTimeMillis(), th, thread));
    }

    public void e0(long j7, String str) {
        this.f2300e.h(new e(j7, str));
    }

    public AbstractC0659j o() {
        if (this.f2314s.compareAndSet(false, true)) {
            return this.f2311p.a();
        }
        E3.f.f().k("checkForUnsentReports should only be called once per execution.");
        return V2.m.e(Boolean.FALSE);
    }

    public AbstractC0659j t() {
        this.f2312q.e(Boolean.FALSE);
        return this.f2313r.a();
    }

    public boolean u() {
        if (!this.f2298c.c()) {
            String D7 = D();
            return D7 != null && this.f2305j.d(D7);
        }
        E3.f.f().i("Found previous crash marker.");
        this.f2298c.d();
        return true;
    }

    public void v(O3.i iVar) {
        w(false, iVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(boolean z7, O3.i iVar) {
        String str;
        ArrayList arrayList = new ArrayList(this.f2308m.o());
        if (arrayList.size() <= z7) {
            E3.f.f().i("No open sessions to be closed.");
            return;
        }
        String str2 = (String) arrayList.get(z7 ? 1 : 0);
        if (iVar.b().f3977b.f3985b) {
            c0(str2);
        } else {
            E3.f.f().i("ANR feature disabled.");
        }
        if (this.f2305j.d(str2)) {
            A(str2);
        }
        if (z7 != 0) {
            str = (String) arrayList.get(0);
        } else {
            this.f2307l.e(null);
            str = null;
        }
        this.f2308m.j(E(), str);
    }

    public final void x(String str, Boolean bool) {
        long E6 = E();
        E3.f.f().b("Opening a new session with ID " + str);
        this.f2305j.c(str, String.format(Locale.US, "Crashlytics Android SDK/%s", C0396s.l()), E6, J3.D.b(p(this.f2301f, this.f2303h), r(), q(this.f2296a)));
        if (bool.booleanValue() && str != null) {
            this.f2299d.n(str);
        }
        this.f2304i.e(str);
        this.f2307l.e(str);
        this.f2308m.p(str, E6);
    }

    public final void y(long j7) {
        try {
            if (this.f2302g.e(".ae" + j7).createNewFile()) {
            } else {
                throw new IOException("Create new file failed.");
            }
        } catch (IOException e7) {
            E3.f.f().l("Could not create app exception marker file.", e7);
        }
    }

    public void z(String str, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, O3.i iVar) {
        this.f2310o = iVar;
        T(str);
        C0400w c0400w = new C0400w(new a(), iVar, uncaughtExceptionHandler, this.f2305j);
        this.f2309n = c0400w;
        Thread.setDefaultUncaughtExceptionHandler(c0400w);
    }
}
