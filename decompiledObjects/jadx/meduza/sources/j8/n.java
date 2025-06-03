package j8;

import aa.m0;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import g8.c;
import j8.g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Objects;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import m8.b;
import m8.f0;
import m8.h;
import m8.k;
import m8.z;

/* loaded from: classes.dex */
public final class n {
    public static final k t = new FilenameFilter() { // from class: j8.k
        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            return str.startsWith(".ae");
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final Context f8593a;

    /* renamed from: b, reason: collision with root package name */
    public final w f8594b;

    /* renamed from: c, reason: collision with root package name */
    public final r4.c f8595c;

    /* renamed from: d, reason: collision with root package name */
    public final l8.n f8596d;

    /* renamed from: e, reason: collision with root package name */
    public final k8.i f8597e;
    public final a0 f;

    /* renamed from: g, reason: collision with root package name */
    public final p8.e f8598g;

    /* renamed from: h, reason: collision with root package name */
    public final j8.a f8599h;

    /* renamed from: i, reason: collision with root package name */
    public final l8.f f8600i;

    /* renamed from: j, reason: collision with root package name */
    public final g8.a f8601j;

    /* renamed from: k, reason: collision with root package name */
    public final h8.a f8602k;

    /* renamed from: l, reason: collision with root package name */
    public final j f8603l;

    /* renamed from: m, reason: collision with root package name */
    public final d0 f8604m;

    /* renamed from: n, reason: collision with root package name */
    public v f8605n;

    /* renamed from: o, reason: collision with root package name */
    public r8.h f8606o = null;

    /* renamed from: p, reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f8607p = new TaskCompletionSource<>();

    /* renamed from: q, reason: collision with root package name */
    public final TaskCompletionSource<Boolean> f8608q = new TaskCompletionSource<>();

    /* renamed from: r, reason: collision with root package name */
    public final TaskCompletionSource<Void> f8609r = new TaskCompletionSource<>();

    /* renamed from: s, reason: collision with root package name */
    public final AtomicBoolean f8610s = new AtomicBoolean(false);

    public class a implements Callable<Task<Void>> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f8611a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Throwable f8612b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Thread f8613c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ r8.h f8614d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f8615e;

        public a(long j10, Throwable th, Thread thread, r8.h hVar, boolean z10) {
            this.f8611a = j10;
            this.f8612b = th;
            this.f8613c = thread;
            this.f8614d = hVar;
            this.f8615e = z10;
        }

        @Override // java.util.concurrent.Callable
        public final Task<Void> call() {
            p8.e eVar;
            String str;
            long j10 = this.f8611a / 1000;
            String e10 = n.this.e();
            if (e10 == null) {
                Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            } else {
                n.this.f8595c.d();
                d0 d0Var = n.this.f8604m;
                Throwable th = this.f8612b;
                Thread thread = this.f8613c;
                d0Var.getClass();
                String str2 = "Persisting fatal event for session " + e10;
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", str2, null);
                }
                d0Var.e(th, thread, "crash", new l8.c(e10, j10, sb.t.f14325a), true);
                n nVar = n.this;
                long j11 = this.f8611a;
                nVar.getClass();
                try {
                    eVar = nVar.f8598g;
                    str = ".ae" + j11;
                    eVar.getClass();
                } catch (IOException e11) {
                    Log.w("FirebaseCrashlytics", "Could not create app exception marker file.", e11);
                }
                if (!new File(eVar.f13042c, str).createNewFile()) {
                    throw new IOException("Create new file failed.");
                }
                n.this.b(false, this.f8614d, false);
                n.this.c(new f().f8578a, Boolean.valueOf(this.f8615e));
                if (n.this.f8594b.b()) {
                    return ((r8.f) this.f8614d).f13804i.get().getTask().onSuccessTask(n.this.f8597e.f9140a, new m(this, e10));
                }
            }
            return Tasks.forResult(null);
        }
    }

    public class b implements SuccessContinuation<Boolean, Void> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Task f8616a;

        public b(Task task) {
            this.f8616a = task;
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        public final Task<Void> then(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2.booleanValue()) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
                }
                boolean booleanValue = bool2.booleanValue();
                w wVar = n.this.f8594b;
                if (booleanValue) {
                    wVar.f8657h.trySetResult(null);
                    return this.f8616a.onSuccessTask(n.this.f8597e.f9140a, new o(this));
                }
                wVar.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            }
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
            }
            p8.e eVar = n.this.f8598g;
            Iterator it = p8.e.e(eVar.f13042c.listFiles(n.t)).iterator();
            while (it.hasNext()) {
                ((File) it.next()).delete();
            }
            p8.c cVar = n.this.f8604m.f8567b;
            p8.c.a(p8.e.e(cVar.f13036b.f13044e.listFiles()));
            p8.c.a(p8.e.e(cVar.f13036b.f.listFiles()));
            p8.c.a(p8.e.e(cVar.f13036b.f13045g.listFiles()));
            n.this.f8609r.trySetResult(null);
            return Tasks.forResult(null);
        }
    }

    public n(Context context, a0 a0Var, w wVar, p8.e eVar, r4.c cVar, j8.a aVar, l8.n nVar, l8.f fVar, d0 d0Var, g8.a aVar2, h8.a aVar3, j jVar, k8.i iVar) {
        this.f8593a = context;
        this.f = a0Var;
        this.f8594b = wVar;
        this.f8598g = eVar;
        this.f8595c = cVar;
        this.f8599h = aVar;
        this.f8596d = nVar;
        this.f8600i = fVar;
        this.f8601j = aVar2;
        this.f8602k = aVar3;
        this.f8603l = jVar;
        this.f8604m = d0Var;
        this.f8597e = iVar;
    }

    public static Task a(n nVar) {
        Task call;
        nVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (File file : p8.e.e(nVar.f8598g.f13042c.listFiles(t))) {
            try {
                long parseLong = Long.parseLong(file.getName().substring(3));
                boolean z10 = false;
                try {
                    Class.forName("com.google.firebase.crash.FirebaseCrash");
                    z10 = true;
                } catch (ClassNotFoundException unused) {
                }
                if (z10) {
                    Log.w("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, FirebaseCrash exists", null);
                    call = Tasks.forResult(null);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Logging app exception event to Firebase Analytics", null);
                    }
                    call = Tasks.call(new ScheduledThreadPoolExecutor(1), new p(nVar, parseLong));
                }
                arrayList.add(call);
            } catch (NumberFormatException unused2) {
                StringBuilder l10 = defpackage.f.l("Could not parse app exception timestamp from file ");
                l10.append(file.getName());
                Log.w("FirebaseCrashlytics", l10.toString(), null);
            }
            file.delete();
        }
        return Tasks.whenAll(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0021 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String f() {
        /*
            java.lang.Class<j8.n> r0 = j8.n.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r1 = 0
            java.lang.String r2 = "FirebaseCrashlytics"
            if (r0 != 0) goto L11
            java.lang.String r0 = "Couldn't get Class Loader"
            android.util.Log.w(r2, r0, r1)
            goto L1e
        L11:
            java.lang.String r3 = "META-INF/version-control-info.textproto"
            java.io.InputStream r0 = r0.getResourceAsStream(r3)
            if (r0 != 0) goto L1f
            java.lang.String r0 = "No version control information found"
            android.util.Log.i(r2, r0, r1)
        L1e:
            r0 = r1
        L1f:
            if (r0 != 0) goto L22
            return r1
        L22:
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r2, r3)
            r4 = 0
            if (r3 == 0) goto L2f
            java.lang.String r3 = "Read version control info"
            android.util.Log.d(r2, r3, r1)
        L2f:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>()
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]
        L38:
            int r3 = r0.read(r2)
            r5 = -1
            if (r3 == r5) goto L43
            r1.write(r2, r4, r3)
            goto L38
        L43:
            byte[] r0 = r1.toByteArray()
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.n.f():java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:213:0x018a, code lost:
    
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 2) != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x019b, code lost:
    
        android.util.Log.v("FirebaseCrashlytics", r0, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0199, code lost:
    
        if (android.util.Log.isLoggable("FirebaseCrashlytics", 2) != false) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0138 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18, types: [int] */
    /* JADX WARN: Type inference failed for: r10v37 */
    /* JADX WARN: Type inference failed for: r13v23, types: [long] */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v25 */
    /* JADX WARN: Type inference failed for: r18v0, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(boolean r18, r8.h r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 1307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j8.n.b(boolean, r8.h, boolean):void");
    }

    public final void c(String str, Boolean bool) {
        Integer num;
        List unmodifiableList;
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        String d10 = defpackage.g.d("Opening a new session with ID ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", d10, null);
        }
        Locale locale = Locale.US;
        String format = String.format(locale, "Crashlytics Android SDK/%s", "19.4.0");
        a0 a0Var = this.f;
        j8.a aVar = this.f8599h;
        m8.c0 c0Var = new m8.c0(a0Var.f8553c, aVar.f, aVar.f8547g, ((c) a0Var.c()).f8559a, defpackage.f.e(aVar.f8545d != null ? 4 : 1), aVar.f8548h);
        String str2 = Build.VERSION.RELEASE;
        String str3 = Build.VERSION.CODENAME;
        m8.e0 e0Var = new m8.e0(str2, str3, g.h());
        Context context = this.f8593a;
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        long blockCount = statFs.getBlockCount() * statFs.getBlockSize();
        g.a aVar2 = g.a.UNKNOWN;
        String str4 = Build.CPU_ABI;
        if (!TextUtils.isEmpty(str4)) {
            g.a aVar3 = (g.a) g.a.f8581b.get(str4.toLowerCase(locale));
            if (aVar3 != null) {
                aVar2 = aVar3;
            }
        } else if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Architecture#getValue()::Build.CPU_ABI returned null or empty", null);
        }
        int ordinal = aVar2.ordinal();
        String str5 = Build.MODEL;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        long a10 = g.a(context);
        boolean g10 = g.g();
        int c10 = g.c();
        String str6 = Build.MANUFACTURER;
        String str7 = Build.PRODUCT;
        this.f8601j.c(str, format, currentTimeMillis, new m8.b0(c0Var, e0Var, new m8.d0(ordinal, str5, availableProcessors, a10, blockCount, g10, c10, str6, str7)));
        if (bool.booleanValue() && str != null) {
            l8.n nVar = this.f8596d;
            synchronized (nVar.f9797c) {
                nVar.f9797c = str;
                Map<String, String> a11 = nVar.f9798d.a();
                l8.l lVar = nVar.f;
                synchronized (lVar) {
                    unmodifiableList = Collections.unmodifiableList(new ArrayList(lVar.f9788a));
                }
                nVar.f9796b.f9141b.a(new l8.m(nVar, str, a11, unmodifiableList));
            }
        }
        this.f8600i.a(str);
        i iVar = this.f8603l.f8589b;
        synchronized (iVar) {
            if (!Objects.equals(iVar.f8586b, str)) {
                i.a(iVar.f8585a, str, iVar.f8587c);
                iVar.f8586b = str;
            }
        }
        d0 d0Var = this.f8604m;
        t tVar = d0Var.f8566a;
        tVar.getClass();
        Charset charset = f0.f10579a;
        b.a aVar4 = new b.a();
        aVar4.f10524a = "19.4.0";
        String str8 = tVar.f8643c.f8542a;
        if (str8 == null) {
            throw new NullPointerException("Null gmpAppId");
        }
        aVar4.f10525b = str8;
        String str9 = ((c) tVar.f8642b.c()).f8559a;
        if (str9 == null) {
            throw new NullPointerException("Null installationUuid");
        }
        aVar4.f10527d = str9;
        aVar4.f10528e = ((c) tVar.f8642b.c()).f8560b;
        aVar4.f = ((c) tVar.f8642b.c()).f8561c;
        j8.a aVar5 = tVar.f8643c;
        String str10 = aVar5.f;
        if (str10 == null) {
            throw new NullPointerException("Null buildVersion");
        }
        aVar4.f10530h = str10;
        String str11 = aVar5.f8547g;
        if (str11 == null) {
            throw new NullPointerException("Null displayVersion");
        }
        aVar4.f10531i = str11;
        aVar4.f10526c = 4;
        aVar4.f10535m = (byte) (aVar4.f10535m | 1);
        h.a aVar6 = new h.a();
        aVar6.f = false;
        byte b10 = (byte) (aVar6.f10604m | 2);
        aVar6.f10596d = currentTimeMillis;
        aVar6.f10604m = (byte) (b10 | 1);
        if (str == null) {
            throw new NullPointerException("Null identifier");
        }
        aVar6.f10594b = str;
        String str12 = t.f8640g;
        if (str12 == null) {
            throw new NullPointerException("Null generator");
        }
        aVar6.f10593a = str12;
        a0 a0Var2 = tVar.f8642b;
        String str13 = a0Var2.f8553c;
        if (str13 == null) {
            throw new NullPointerException("Null identifier");
        }
        if (str10 == null) {
            throw new NullPointerException("Null version");
        }
        String str14 = ((c) a0Var2.c()).f8559a;
        g8.c cVar = tVar.f8643c.f8548h;
        if (cVar.f5910b == null) {
            cVar.f5910b = new c.a(cVar);
        }
        String str15 = cVar.f5910b.f5911a;
        g8.c cVar2 = tVar.f8643c.f8548h;
        if (cVar2.f5910b == null) {
            cVar2.f5910b = new c.a(cVar2);
        }
        aVar6.f10598g = new m8.i(str13, str10, str11, str14, str15, cVar2.f5910b.f5912b);
        z.a aVar7 = new z.a();
        aVar7.f10719a = 3;
        aVar7.f10723e = (byte) (aVar7.f10723e | 1);
        aVar7.f10720b = str2;
        aVar7.f10721c = str3;
        aVar7.f10722d = g.h();
        aVar7.f10723e = (byte) (aVar7.f10723e | 2);
        aVar6.f10600i = aVar7.a();
        StatFs statFs2 = new StatFs(Environment.getDataDirectory().getPath());
        int i10 = 7;
        if (!TextUtils.isEmpty(str4) && (num = (Integer) t.f.get(str4.toLowerCase(locale))) != null) {
            i10 = num.intValue();
        }
        int availableProcessors2 = Runtime.getRuntime().availableProcessors();
        long a12 = g.a(tVar.f8641a);
        long blockCount2 = statFs2.getBlockCount() * statFs2.getBlockSize();
        boolean g11 = g.g();
        int c11 = g.c();
        k.a aVar8 = new k.a();
        aVar8.f10619a = i10;
        byte b11 = (byte) (aVar8.f10627j | 1);
        aVar8.f10620b = str5;
        aVar8.f10621c = availableProcessors2;
        aVar8.f10622d = a12;
        aVar8.f10623e = blockCount2;
        aVar8.f = g11;
        aVar8.f10624g = c11;
        aVar8.f10627j = (byte) (((byte) (((byte) (((byte) (((byte) (b11 | 2)) | 4)) | 8)) | 16)) | 32);
        aVar8.f10625h = str6;
        aVar8.f10626i = str7;
        aVar6.f10601j = aVar8.a();
        aVar6.f10603l = 3;
        aVar6.f10604m = (byte) (aVar6.f10604m | 4);
        aVar4.f10532j = aVar6.a();
        m8.b a13 = aVar4.a();
        p8.c cVar3 = d0Var.f8567b;
        cVar3.getClass();
        f0.e eVar = a13.f10521k;
        if (eVar == null) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Could not get session for report", null);
                return;
            }
            return;
        }
        String h10 = eVar.h();
        try {
            p8.c.f13032g.getClass();
            p8.c.e(cVar3.f13036b.b(h10, "report"), n8.a.f11321a.a(a13));
            File b12 = cVar3.f13036b.b(h10, "start-time");
            long j10 = eVar.j();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(b12), p8.c.f13031e);
            try {
                outputStreamWriter.write("");
                b12.setLastModified(j10 * 1000);
                outputStreamWriter.close();
            } finally {
            }
        } catch (IOException e10) {
            String d11 = defpackage.g.d("Could not persist report for session ", h10);
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", d11, e10);
            }
        }
    }

    public final boolean d(r8.h hVar) {
        k8.i.a();
        v vVar = this.f8605n;
        if (vVar != null && vVar.f8650e.get()) {
            Log.w("FirebaseCrashlytics", "Skipping session finalization because a crash has already occurred.", null);
            return false;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Finalizing previously open sessions.", null);
        }
        try {
            b(true, hVar, true);
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Closed all previously open sessions.", null);
            }
            return true;
        } catch (Exception e10) {
            Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e10);
            return false;
        }
    }

    public final String e() {
        p8.c cVar = this.f8604m.f8567b;
        cVar.getClass();
        NavigableSet descendingSet = new TreeSet(p8.e.e(cVar.f13036b.f13043d.list())).descendingSet();
        if (descendingSet.isEmpty()) {
            return null;
        }
        return (String) descendingSet.first();
    }

    public final synchronized void g(r8.h hVar, Thread thread, Throwable th, boolean z10) {
        Task continueWithTask;
        String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        long currentTimeMillis = System.currentTimeMillis();
        k8.b bVar = this.f8597e.f9140a;
        a aVar = new a(currentTimeMillis, th, thread, hVar, z10);
        synchronized (bVar.f9134b) {
            continueWithTask = bVar.f9135c.continueWithTask(bVar.f9133a, new m0(aVar, 7));
            bVar.f9135c = continueWithTask;
        }
        if (!z10) {
            try {
                e0.a(continueWithTask);
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
            }
        }
    }

    public final void h() {
        try {
            String f = f();
            if (f != null) {
                i("com.crashlytics.version-control-info", f);
                Log.i("FirebaseCrashlytics", "Saved version control info", null);
            }
        } catch (IOException e10) {
            Log.w("FirebaseCrashlytics", "Unable to save version control info", e10);
        }
    }

    public final void i(String str, String str2) {
        try {
            this.f8596d.f9799e.b(str, str2);
        } catch (IllegalArgumentException e10) {
            Context context = this.f8593a;
            if (context != null) {
                if ((context.getApplicationInfo().flags & 2) != 0) {
                    throw e10;
                }
            }
            Log.e("FirebaseCrashlytics", "Attempting to set custom attribute with null key, ignoring.", null);
        }
    }

    public final void j(Task<r8.c> task) {
        Task<Void> task2;
        Task a10;
        p8.c cVar = this.f8604m.f8567b;
        if (!((p8.e.e(cVar.f13036b.f13044e.listFiles()).isEmpty() && p8.e.e(cVar.f13036b.f.listFiles()).isEmpty() && p8.e.e(cVar.f13036b.f13045g.listFiles()).isEmpty()) ? false : true)) {
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "No crash reports are available to be sent.", null);
            }
            this.f8607p.trySetResult(Boolean.FALSE);
            return;
        }
        b.z zVar = b.z.f1660e;
        zVar.q("Crash reports are available to be sent.");
        if (this.f8594b.b()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Automatic data collection is enabled. Allowing upload.", null);
            }
            this.f8607p.trySetResult(Boolean.FALSE);
            a10 = Tasks.forResult(Boolean.TRUE);
        } else {
            zVar.h("Automatic data collection is disabled.");
            zVar.q("Notifying that unsent reports are available.");
            this.f8607p.trySetResult(Boolean.TRUE);
            w wVar = this.f8594b;
            synchronized (wVar.f8653c) {
                task2 = wVar.f8654d.getTask();
            }
            Task<TContinuationResult> onSuccessTask = task2.onSuccessTask(new i6.e());
            zVar.h("Waiting for send/deleteUnsentReports to be called.");
            a10 = k8.a.a(onSuccessTask, this.f8608q.getTask());
        }
        a10.onSuccessTask(this.f8597e.f9140a, new b(task));
    }
}
