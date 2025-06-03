package p2;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import p2.q0;
import z2.a;

/* loaded from: classes.dex */
public final class r implements w2.a {

    /* renamed from: l, reason: collision with root package name */
    public static final String f12943l = o2.j.f("Processor");

    /* renamed from: b, reason: collision with root package name */
    public Context f12945b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.work.a f12946c;

    /* renamed from: d, reason: collision with root package name */
    public a3.b f12947d;

    /* renamed from: e, reason: collision with root package name */
    public WorkDatabase f12948e;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f12949g = new HashMap();
    public HashMap f = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public HashSet f12951i = new HashSet();

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f12952j = new ArrayList();

    /* renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f12944a = null;

    /* renamed from: k, reason: collision with root package name */
    public final Object f12953k = new Object();

    /* renamed from: h, reason: collision with root package name */
    public HashMap f12950h = new HashMap();

    public r(Context context, androidx.work.a aVar, a3.b bVar, WorkDatabase workDatabase) {
        this.f12945b = context;
        this.f12946c = aVar;
        this.f12947d = bVar;
        this.f12948e = workDatabase;
    }

    public static boolean d(String str, q0 q0Var, int i10) {
        if (q0Var == null) {
            o2.j.d().a(f12943l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        q0Var.f12935y = i10;
        q0Var.i();
        q0Var.f12934x.cancel(true);
        if (q0Var.f12924d == null || !(q0Var.f12934x.f17483a instanceof a.b)) {
            StringBuilder l10 = defpackage.f.l("WorkSpec ");
            l10.append(q0Var.f12923c);
            l10.append(" is already done. Not interrupting.");
            o2.j.d().a(q0.f12920z, l10.toString());
        } else {
            q0Var.f12924d.i(i10);
        }
        o2.j.d().a(f12943l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    public final void a(d dVar) {
        synchronized (this.f12953k) {
            this.f12952j.add(dVar);
        }
    }

    public final q0 b(String str) {
        q0 q0Var = (q0) this.f.remove(str);
        boolean z10 = q0Var != null;
        if (!z10) {
            q0Var = (q0) this.f12949g.remove(str);
        }
        this.f12950h.remove(str);
        if (z10) {
            synchronized (this.f12953k) {
                if (!(true ^ this.f.isEmpty())) {
                    Context context = this.f12945b;
                    String str2 = androidx.work.impl.foreground.a.f1529r;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_STOP_FOREGROUND");
                    try {
                        this.f12945b.startService(intent);
                    } catch (Throwable th) {
                        o2.j.d().c(f12943l, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f12944a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f12944a = null;
                    }
                }
            }
        }
        return q0Var;
    }

    public final q0 c(String str) {
        q0 q0Var = (q0) this.f.get(str);
        return q0Var == null ? (q0) this.f12949g.get(str) : q0Var;
    }

    public final void e(String str, o2.d dVar) {
        synchronized (this.f12953k) {
            o2.j.d().e(f12943l, "Moving WorkSpec (" + str + ") to the foreground");
            q0 q0Var = (q0) this.f12949g.remove(str);
            if (q0Var != null) {
                if (this.f12944a == null) {
                    PowerManager.WakeLock a10 = y2.v.a(this.f12945b, "ProcessorForegroundLck");
                    this.f12944a = a10;
                    a10.acquire();
                }
                this.f.put(str, q0Var);
                v.a.startForegroundService(this.f12945b, androidx.work.impl.foreground.a.c(this.f12945b, b.a0.s(q0Var.f12923c), dVar));
            }
        }
    }

    public final boolean f(x xVar, WorkerParameters.a aVar) {
        boolean z10;
        x2.l lVar = xVar.f12965a;
        final String str = lVar.f16820a;
        final ArrayList arrayList = new ArrayList();
        x2.s sVar = (x2.s) this.f12948e.m(new Callable() { // from class: p2.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                r rVar = r.this;
                ArrayList arrayList2 = arrayList;
                String str2 = str;
                arrayList2.addAll(rVar.f12948e.v().a(str2));
                return rVar.f12948e.u().t(str2);
            }
        });
        if (sVar == null) {
            o2.j.d().g(f12943l, "Didn't find WorkSpec for id " + lVar);
            this.f12947d.b().execute(new q(this, lVar));
            return false;
        }
        synchronized (this.f12953k) {
            try {
                synchronized (this.f12953k) {
                    z10 = c(str) != null;
                }
                if (z10) {
                    Set set = (Set) this.f12950h.get(str);
                    if (((x) set.iterator().next()).f12965a.f16821b == lVar.f16821b) {
                        set.add(xVar);
                        o2.j.d().a(f12943l, "Work " + lVar + " is already enqueued for processing");
                    } else {
                        this.f12947d.b().execute(new q(this, lVar));
                    }
                    return false;
                }
                if (sVar.t != lVar.f16821b) {
                    this.f12947d.b().execute(new q(this, lVar));
                    return false;
                }
                q0.a aVar2 = new q0.a(this.f12945b, this.f12946c, this.f12947d, this, this.f12948e, sVar, arrayList);
                if (aVar != null) {
                    aVar2.f12942h = aVar;
                }
                q0 q0Var = new q0(aVar2);
                z2.c<Boolean> cVar = q0Var.f12933w;
                cVar.f(new t0.d(this, cVar, q0Var, 3), this.f12947d.b());
                this.f12949g.put(str, q0Var);
                HashSet hashSet = new HashSet();
                hashSet.add(xVar);
                this.f12950h.put(str, hashSet);
                this.f12947d.c().execute(q0Var);
                o2.j.d().a(f12943l, r.class.getSimpleName() + ": processing " + lVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
