package p2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable;
import b1.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import o2.j;

/* loaded from: classes.dex */
public final class k0 extends o2.p {

    /* renamed from: k, reason: collision with root package name */
    public static k0 f12874k;

    /* renamed from: l, reason: collision with root package name */
    public static k0 f12875l;

    /* renamed from: m, reason: collision with root package name */
    public static final Object f12876m;

    /* renamed from: a, reason: collision with root package name */
    public Context f12877a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.work.a f12878b;

    /* renamed from: c, reason: collision with root package name */
    public WorkDatabase f12879c;

    /* renamed from: d, reason: collision with root package name */
    public a3.b f12880d;

    /* renamed from: e, reason: collision with root package name */
    public List<t> f12881e;
    public r f;

    /* renamed from: g, reason: collision with root package name */
    public y2.p f12882g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f12883h = false;

    /* renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f12884i;

    /* renamed from: j, reason: collision with root package name */
    public final v2.n f12885j;

    public static class a {
        public static boolean a(Context context) {
            boolean isDeviceProtectedStorage;
            isDeviceProtectedStorage = context.isDeviceProtectedStorage();
            return isDeviceProtectedStorage;
        }
    }

    static {
        o2.j.f("WorkManagerImpl");
        f12874k = null;
        f12875l = null;
        f12876m = new Object();
    }

    public k0(Context context, final androidx.work.a aVar, a3.b bVar, WorkDatabase workDatabase, final List<t> list, r rVar, v2.n nVar) {
        Context applicationContext = context.getApplicationContext();
        if (Build.VERSION.SDK_INT >= 24 && a.a(applicationContext)) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        j.a aVar2 = new j.a(aVar.f1447g);
        synchronized (o2.j.f11719a) {
            o2.j.f11720b = aVar2;
        }
        this.f12877a = applicationContext;
        this.f12880d = bVar;
        this.f12879c = workDatabase;
        this.f = rVar;
        this.f12885j = nVar;
        this.f12878b = aVar;
        this.f12881e = list;
        this.f12882g = new y2.p(workDatabase);
        final y2.r c10 = bVar.c();
        final WorkDatabase workDatabase2 = this.f12879c;
        String str = w.f12964a;
        rVar.a(new d() { // from class: p2.u
            @Override // p2.d
            public final void a(x2.l lVar, boolean z10) {
                c10.execute(new v(list, lVar, aVar, workDatabase2, 0));
            }
        });
        this.f12880d.d(new ForceStopRunnable(applicationContext, this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k0 d(Context context) {
        k0 k0Var;
        Object obj = f12876m;
        synchronized (obj) {
            synchronized (obj) {
                k0Var = f12874k;
                if (k0Var == null) {
                    k0Var = f12875l;
                }
            }
            return k0Var;
        }
        if (k0Var == null) {
            Context applicationContext = context.getApplicationContext();
            if (!(applicationContext instanceof a.b)) {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
            f(applicationContext, ((a.b) applicationContext).a());
            k0Var = d(applicationContext);
        }
        return k0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
    
        r3 = r3.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001c, code lost:
    
        if (p2.k0.f12875l != null) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001e, code lost:
    
        p2.k0.f12875l = p2.m0.v(r3, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0024, code lost:
    
        p2.k0.f12874k = p2.k0.f12875l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void f(android.content.Context r3, androidx.work.a r4) {
        /*
            java.lang.Object r0 = p2.k0.f12876m
            monitor-enter(r0)
            p2.k0 r1 = p2.k0.f12874k     // Catch: java.lang.Throwable -> L2a
            if (r1 == 0) goto L14
            p2.k0 r2 = p2.k0.f12875l     // Catch: java.lang.Throwable -> L2a
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2a
            java.lang.String r4 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2a
            throw r3     // Catch: java.lang.Throwable -> L2a
        L14:
            if (r1 != 0) goto L28
            android.content.Context r3 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L2a
            p2.k0 r1 = p2.k0.f12875l     // Catch: java.lang.Throwable -> L2a
            if (r1 != 0) goto L24
            p2.k0 r3 = p2.m0.v(r3, r4)     // Catch: java.lang.Throwable -> L2a
            p2.k0.f12875l = r3     // Catch: java.lang.Throwable -> L2a
        L24:
            p2.k0 r3 = p2.k0.f12875l     // Catch: java.lang.Throwable -> L2a
            p2.k0.f12874k = r3     // Catch: java.lang.Throwable -> L2a
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return
        L2a:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.k0.f(android.content.Context, androidx.work.a):void");
    }

    @Override // o2.p
    public final o b(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        y yVar = new y(this, list);
        if (yVar.f12973i) {
            o2.j d10 = o2.j.d();
            String str = y.f12966k;
            StringBuilder l10 = defpackage.f.l("Already enqueued work ids (");
            l10.append(TextUtils.join(", ", yVar.f));
            l10.append(")");
            d10.g(str, l10.toString());
        } else {
            y2.f fVar = new y2.f(yVar);
            this.f12880d.d(fVar);
            yVar.f12974j = fVar.f17377b;
        }
        return yVar.f12974j;
    }

    public final o c(UUID uuid) {
        y2.b bVar = new y2.b(this, uuid);
        this.f12880d.d(bVar);
        return bVar.f17374a;
    }

    public final b1.u e(UUID uuid) {
        p1.n v10 = this.f12879c.u().v(Collections.singletonList(uuid.toString()));
        j0 j0Var = new j0();
        a3.b bVar = this.f12880d;
        Object obj = new Object();
        b1.u uVar = new b1.u();
        y2.k kVar = new y2.k(bVar, obj, j0Var, uVar);
        if (v10 == null) {
            throw new NullPointerException("source cannot be null");
        }
        u.a<?> aVar = new u.a<>(v10, kVar);
        u.a<?> h10 = uVar.f1797a.h(v10, aVar);
        if (h10 != null && h10.f1799b != kVar) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (h10 == null && uVar.hasActiveObservers()) {
            v10.observeForever(aVar);
        }
        return uVar;
    }

    public final void g() {
        synchronized (f12876m) {
            this.f12883h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f12884i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f12884i = null;
            }
        }
    }

    public final void h() {
        ArrayList f;
        Context context = this.f12877a;
        String str = s2.b.f;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (f = s2.b.f(context, jobScheduler)) != null && !f.isEmpty()) {
            Iterator it = f.iterator();
            while (it.hasNext()) {
                s2.b.a(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        this.f12879c.u().B();
        w.b(this.f12878b, this.f12879c, this.f12881e);
    }
}
