package u9;

import android.net.TrafficStats;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import d8.o;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import w9.a;
import x9.b;

/* loaded from: classes.dex */
public final class c implements d {

    /* renamed from: m, reason: collision with root package name */
    public static final Object f15111m = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final u7.f f15112a;

    /* renamed from: b, reason: collision with root package name */
    public final x9.c f15113b;

    /* renamed from: c, reason: collision with root package name */
    public final w9.c f15114c;

    /* renamed from: d, reason: collision with root package name */
    public final k f15115d;

    /* renamed from: e, reason: collision with root package name */
    public final o<w9.b> f15116e;
    public final i f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f15117g;

    /* renamed from: h, reason: collision with root package name */
    public final ExecutorService f15118h;

    /* renamed from: i, reason: collision with root package name */
    public final Executor f15119i;

    /* renamed from: j, reason: collision with root package name */
    public String f15120j;

    /* renamed from: k, reason: collision with root package name */
    public HashSet f15121k;

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f15122l;

    static {
        new AtomicInteger(1);
    }

    public c() {
        throw null;
    }

    public c(u7.f fVar, t9.b bVar, ExecutorService executorService, e8.j jVar) {
        fVar.a();
        x9.c cVar = new x9.c(fVar.f15084a, bVar);
        w9.c cVar2 = new w9.c(fVar);
        k a10 = k.a();
        o<w9.b> oVar = new o<>(new d8.d(fVar, 1));
        i iVar = new i();
        this.f15117g = new Object();
        this.f15121k = new HashSet();
        this.f15122l = new ArrayList();
        this.f15112a = fVar;
        this.f15113b = cVar;
        this.f15114c = cVar2;
        this.f15115d = a10;
        this.f15116e = oVar;
        this.f = iVar;
        this.f15118h = executorService;
        this.f15119i = jVar;
    }

    @Override // u9.d
    public final Task a() {
        d();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        f fVar = new f(this.f15115d, taskCompletionSource);
        synchronized (this.f15117g) {
            this.f15122l.add(fVar);
        }
        Task task = taskCompletionSource.getTask();
        this.f15118h.execute(new Runnable() { // from class: u9.b

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f15110b = false;

            @Override // java.lang.Runnable
            public final void run() {
                c.this.b(this.f15110b);
            }
        });
        return task;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022 A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #1 {all -> 0x005c, blocks: (B:6:0x000e, B:12:0x0022), top: B:5:0x000e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[Catch: all -> 0x0063, DONT_GENERATE, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:15:0x003c, B:16:0x003f, B:25:0x005f, B:26:0x0062, B:6:0x000e, B:12:0x0022), top: B:3:0x0003, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = u9.c.f15111m
            monitor-enter(r0)
            u7.f r1 = r7.f15112a     // Catch: java.lang.Throwable -> L63
            r1.a()     // Catch: java.lang.Throwable -> L63
            android.content.Context r1 = r1.f15084a     // Catch: java.lang.Throwable -> L63
            r4.c r1 = r4.c.b(r1)     // Catch: java.lang.Throwable -> L63
            w9.c r2 = r7.f15114c     // Catch: java.lang.Throwable -> L5c
            w9.a r2 = r2.c()     // Catch: java.lang.Throwable -> L5c
            int r3 = r2.f16452c     // Catch: java.lang.Throwable -> L5c
            r4 = 2
            r5 = 1
            if (r3 == r4) goto L1f
            if (r3 != r5) goto L1d
            goto L1f
        L1d:
            r3 = 0
            goto L20
        L1f:
            r3 = r5
        L20:
            if (r3 == 0) goto L3a
            java.lang.String r3 = r7.e(r2)     // Catch: java.lang.Throwable -> L5c
            w9.c r4 = r7.f15114c     // Catch: java.lang.Throwable -> L5c
            w9.a$a r6 = new w9.a$a     // Catch: java.lang.Throwable -> L5c
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L5c
            r6.f16457a = r3     // Catch: java.lang.Throwable -> L5c
            r2 = 3
            r6.b(r2)     // Catch: java.lang.Throwable -> L5c
            w9.a r2 = r6.a()     // Catch: java.lang.Throwable -> L5c
            r4.b(r2)     // Catch: java.lang.Throwable -> L5c
        L3a:
            if (r1 == 0) goto L3f
            r1.g()     // Catch: java.lang.Throwable -> L63
        L3f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            if (r8 == 0) goto L4e
            w9.a$a r0 = new w9.a$a
            r0.<init>(r2)
            r1 = 0
            r0.f16459c = r1
            w9.a r2 = r0.a()
        L4e:
            r7.g(r2)
            java.util.concurrent.Executor r0 = r7.f15119i
            x3.j r1 = new x3.j
            r1.<init>(r5, r7, r8)
            r0.execute(r1)
            return
        L5c:
            r8 = move-exception
            if (r1 == 0) goto L62
            r1.g()     // Catch: java.lang.Throwable -> L63
        L62:
            throw r8     // Catch: java.lang.Throwable -> L63
        L63:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L63
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.c.b(boolean):void");
    }

    public final w9.a c(w9.a aVar) {
        boolean z10;
        int responseCode;
        x9.b f;
        b.a aVar2;
        x9.c cVar = this.f15113b;
        u7.f fVar = this.f15112a;
        fVar.a();
        String str = fVar.f15086c.f15096a;
        String str2 = aVar.f16451b;
        u7.f fVar2 = this.f15112a;
        fVar2.a();
        String str3 = fVar2.f15086c.f15101g;
        String str4 = aVar.f16454e;
        x9.e eVar = cVar.f17224c;
        synchronized (eVar) {
            if (eVar.f17229c != 0) {
                eVar.f17227a.f15131a.getClass();
                z10 = System.currentTimeMillis() > eVar.f17228b;
            }
        }
        if (!z10) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a10 = x9.c.a(String.format("projects/%s/installations/%s/authTokens:generate", str3, str2));
        for (int i10 = 0; i10 <= 1; i10++) {
            TrafficStats.setThreadStatsTag(32771);
            HttpURLConnection c10 = cVar.c(a10, str);
            try {
                c10.setRequestMethod("POST");
                c10.addRequestProperty("Authorization", "FIS_v2 " + str4);
                c10.setDoOutput(true);
                x9.c.h(c10);
                responseCode = c10.getResponseCode();
                cVar.f17224c.a(responseCode);
            } catch (IOException | AssertionError unused) {
            } catch (Throwable th) {
                c10.disconnect();
                TrafficStats.clearThreadStatsTag();
                throw th;
            }
            if (responseCode >= 200 && responseCode < 300) {
                f = x9.c.f(c10);
            } else {
                x9.c.b(c10, null, str, str3);
                if (responseCode != 401 && responseCode != 404) {
                    if (responseCode == 429) {
                        throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                    }
                    if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        aVar2 = new b.a();
                        aVar2.f17218a = 0L;
                        aVar2.f17219b = 2;
                        f = aVar2.a();
                    } else {
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                aVar2 = new b.a();
                aVar2.f17218a = 0L;
                aVar2.f17219b = 3;
                f = aVar2.a();
            }
            c10.disconnect();
            TrafficStats.clearThreadStatsTag();
            int c11 = q0.g.c(f.f17217c);
            if (c11 != 0) {
                if (c11 == 1) {
                    a.C0255a h10 = aVar.h();
                    h10.f16462g = "BAD CONFIG";
                    h10.b(5);
                    return h10.a();
                }
                if (c11 != 2) {
                    throw new e("Firebase Installations Service is unavailable. Please try again later.");
                }
                synchronized (this) {
                    this.f15120j = null;
                }
                a.C0255a c0255a = new a.C0255a(aVar);
                c0255a.b(2);
                return c0255a.a();
            }
            String str5 = f.f17215a;
            long j10 = f.f17216b;
            k kVar = this.f15115d;
            kVar.getClass();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            kVar.f15131a.getClass();
            long seconds = timeUnit.toSeconds(System.currentTimeMillis());
            a.C0255a c0255a2 = new a.C0255a(aVar);
            c0255a2.f16459c = str5;
            c0255a2.f16461e = Long.valueOf(j10);
            c0255a2.f = Long.valueOf(seconds);
            return c0255a2.a();
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void d() {
        u7.f fVar = this.f15112a;
        fVar.a();
        m6.j.f("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", fVar.f15086c.f15097b);
        u7.f fVar2 = this.f15112a;
        fVar2.a();
        m6.j.f("Please set your Project ID. A valid Firebase Project ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", fVar2.f15086c.f15101g);
        u7.f fVar3 = this.f15112a;
        fVar3.a();
        m6.j.f("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", fVar3.f15086c.f15096a);
        u7.f fVar4 = this.f15112a;
        fVar4.a();
        String str = fVar4.f15086c.f15097b;
        Pattern pattern = k.f15129c;
        m6.j.a("Please set your Application ID. A valid Firebase App ID is required to communicate with Firebase server APIs: It identifies your application with Firebase.Please refer to https://firebase.google.com/support/privacy/init-options.", str.contains(":"));
        u7.f fVar5 = this.f15112a;
        fVar5.a();
        m6.j.a("Please set a valid API key. A Firebase API key is required to communicate with Firebase server APIs: It authenticates your project with Google.Please refer to https://firebase.google.com/support/privacy/init-options.", k.f15129c.matcher(fVar5.f15086c.f15096a).matches());
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if ("[DEFAULT]".equals(r0.f15085b) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String e(w9.a r6) {
        /*
            r5 = this;
            u7.f r0 = r5.f15112a
            r0.a()
            java.lang.String r0 = r0.f15085b
            java.lang.String r1 = "CHIME_ANDROID_SDK"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L1e
            u7.f r0 = r5.f15112a
            r0.a()
            java.lang.String r0 = r0.f15085b
            java.lang.String r1 = "[DEFAULT]"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L27
        L1e:
            int r6 = r6.f16452c
            r0 = 1
            if (r6 != r0) goto L24
            goto L25
        L24:
            r0 = 0
        L25:
            if (r0 != 0) goto L31
        L27:
            u9.i r6 = r5.f
            r6.getClass()
            java.lang.String r6 = u9.i.a()
            return r6
        L31:
            d8.o<w9.b> r6 = r5.f15116e
            java.lang.Object r6 = r6.get()
            w9.b r6 = (w9.b) r6
            android.content.SharedPreferences r0 = r6.f16464a
            monitor-enter(r0)
            android.content.SharedPreferences r1 = r6.f16464a     // Catch: java.lang.Throwable -> L64
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L64
            android.content.SharedPreferences r2 = r6.f16464a     // Catch: java.lang.Throwable -> L61
            java.lang.String r3 = "|S|id"
            r4 = 0
            java.lang.String r2 = r2.getString(r3, r4)     // Catch: java.lang.Throwable -> L61
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L61
            if (r2 == 0) goto L4c
            goto L50
        L4c:
            java.lang.String r2 = r6.a()     // Catch: java.lang.Throwable -> L64
        L50:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L64
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 == 0) goto L60
            u9.i r6 = r5.f
            r6.getClass()
            java.lang.String r2 = u9.i.a()
        L60:
            return r2
        L61:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L61
            throw r6     // Catch: java.lang.Throwable -> L64
        L64:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L64
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.c.e(w9.a):java.lang.String");
    }

    public final w9.a f(w9.a aVar) {
        boolean z10;
        int responseCode;
        x9.a e10;
        String str = aVar.f16451b;
        String str2 = null;
        if (str != null && str.length() == 11) {
            w9.b bVar = this.f15116e.get();
            synchronized (bVar.f16464a) {
                String[] strArr = w9.b.f16463c;
                int i10 = 0;
                while (true) {
                    if (i10 >= 4) {
                        break;
                    }
                    String string = bVar.f16464a.getString("|T|" + bVar.f16465b + "|" + strArr[i10], null);
                    if (string == null || string.isEmpty()) {
                        i10++;
                    } else if (string.startsWith("{")) {
                        try {
                            str2 = new JSONObject(string).getString("token");
                        } catch (JSONException unused) {
                        }
                    } else {
                        str2 = string;
                    }
                }
            }
        }
        x9.c cVar = this.f15113b;
        u7.f fVar = this.f15112a;
        fVar.a();
        String str3 = fVar.f15086c.f15096a;
        String str4 = aVar.f16451b;
        u7.f fVar2 = this.f15112a;
        fVar2.a();
        String str5 = fVar2.f15086c.f15101g;
        u7.f fVar3 = this.f15112a;
        fVar3.a();
        String str6 = fVar3.f15086c.f15097b;
        x9.e eVar = cVar.f17224c;
        synchronized (eVar) {
            if (eVar.f17229c != 0) {
                eVar.f17227a.f15131a.getClass();
                z10 = System.currentTimeMillis() > eVar.f17228b;
            }
        }
        if (!z10) {
            throw new e("Firebase Installations Service is unavailable. Please try again later.");
        }
        URL a10 = x9.c.a(String.format("projects/%s/installations", str5));
        for (int i11 = 0; i11 <= 1; i11++) {
            TrafficStats.setThreadStatsTag(32769);
            HttpURLConnection c10 = cVar.c(a10, str3);
            try {
                try {
                    c10.setRequestMethod("POST");
                    c10.setDoOutput(true);
                    if (str2 != null) {
                        c10.addRequestProperty("x-goog-fis-android-iid-migration-auth", str2);
                    }
                    x9.c.g(c10, str4, str6);
                    responseCode = c10.getResponseCode();
                    cVar.f17224c.a(responseCode);
                } catch (IOException | AssertionError unused2) {
                }
                if (responseCode >= 200 && responseCode < 300) {
                    e10 = x9.c.e(c10);
                    c10.disconnect();
                    TrafficStats.clearThreadStatsTag();
                } else {
                    x9.c.b(c10, str6, str3, str5);
                    if (responseCode == 429) {
                        try {
                            throw new e("Firebase servers have received too many requests from this client in a short period of time. Please try again later.");
                        } catch (IOException | AssertionError unused3) {
                            continue;
                        }
                    } else if (responseCode < 500 || responseCode >= 600) {
                        Log.e("Firebase-Installations", "Firebase Installations can not communicate with Firebase server APIs due to invalid configuration. Please update your Firebase initialization process and set valid Firebase options (API key, Project ID, Application ID) when initializing Firebase.");
                        x9.a aVar2 = new x9.a(null, null, null, null, 2);
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                        e10 = aVar2;
                    } else {
                        c10.disconnect();
                        TrafficStats.clearThreadStatsTag();
                    }
                }
                int c11 = q0.g.c(e10.f17214e);
                if (c11 != 0) {
                    if (c11 != 1) {
                        throw new e("Firebase Installations Service is unavailable. Please try again later.");
                    }
                    a.C0255a h10 = aVar.h();
                    h10.f16462g = "BAD CONFIG";
                    h10.b(5);
                    return h10.a();
                }
                String str7 = e10.f17211b;
                String str8 = e10.f17212c;
                k kVar = this.f15115d;
                kVar.getClass();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                kVar.f15131a.getClass();
                long seconds = timeUnit.toSeconds(System.currentTimeMillis());
                String b10 = e10.f17213d.b();
                long c12 = e10.f17213d.c();
                a.C0255a c0255a = new a.C0255a(aVar);
                c0255a.f16457a = str7;
                c0255a.b(4);
                c0255a.f16459c = b10;
                c0255a.f16460d = str8;
                c0255a.f16461e = Long.valueOf(c12);
                c0255a.f = Long.valueOf(seconds);
                return c0255a.a();
            } finally {
                c10.disconnect();
                TrafficStats.clearThreadStatsTag();
            }
        }
        throw new e("Firebase Installations Service is unavailable. Please try again later.");
    }

    public final void g(w9.a aVar) {
        synchronized (this.f15117g) {
            Iterator it = this.f15122l.iterator();
            while (it.hasNext()) {
                if (((j) it.next()).b(aVar)) {
                    it.remove();
                }
            }
        }
    }

    @Override // u9.d
    public final Task<String> getId() {
        String str;
        d();
        synchronized (this) {
            str = this.f15120j;
        }
        if (str != null) {
            return Tasks.forResult(str);
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        g gVar = new g(taskCompletionSource);
        synchronized (this.f15117g) {
            this.f15122l.add(gVar);
        }
        Task<String> task = taskCompletionSource.getTask();
        this.f15118h.execute(new b.d(this, 19));
        return task;
    }
}
