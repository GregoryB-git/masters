package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.d;
import b.k;
import b.m;
import defpackage.f;
import defpackage.g;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import nc.a0;
import nc.m1;
import o2.j;
import p2.r;
import p2.x;
import t2.b;
import t2.e;
import t2.h;
import v2.n;
import x2.l;
import x2.s;
import y2.b0;
import y2.v;

/* loaded from: classes.dex */
public final class c implements t2.d, b0.a {

    /* renamed from: w, reason: collision with root package name */
    public static final String f1491w = j.f("DelayMetCommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f1492a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1493b;

    /* renamed from: c, reason: collision with root package name */
    public final l f1494c;

    /* renamed from: d, reason: collision with root package name */
    public final d f1495d;

    /* renamed from: e, reason: collision with root package name */
    public final e f1496e;
    public final Object f;

    /* renamed from: o, reason: collision with root package name */
    public int f1497o;

    /* renamed from: p, reason: collision with root package name */
    public final a3.a f1498p;

    /* renamed from: q, reason: collision with root package name */
    public final Executor f1499q;

    /* renamed from: r, reason: collision with root package name */
    public PowerManager.WakeLock f1500r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1501s;
    public final x t;

    /* renamed from: u, reason: collision with root package name */
    public final a0 f1502u;

    /* renamed from: v, reason: collision with root package name */
    public volatile m1 f1503v;

    public c(Context context, int i10, d dVar, x xVar) {
        this.f1492a = context;
        this.f1493b = i10;
        this.f1495d = dVar;
        this.f1494c = xVar.f12965a;
        this.t = xVar;
        n nVar = dVar.f1508e.f12885j;
        this.f1498p = dVar.f1505b.c();
        this.f1499q = dVar.f1505b.b();
        this.f1502u = dVar.f1505b.a();
        this.f1496e = new e(nVar);
        this.f1501s = false;
        this.f1497o = 0;
        this.f = new Object();
    }

    public static void b(c cVar) {
        if (cVar.f1497o != 0) {
            j d10 = j.d();
            String str = f1491w;
            StringBuilder l10 = f.l("Already started work for ");
            l10.append(cVar.f1494c);
            d10.a(str, l10.toString());
            return;
        }
        cVar.f1497o = 1;
        j d11 = j.d();
        String str2 = f1491w;
        StringBuilder l11 = f.l("onAllConstraintsMet for ");
        l11.append(cVar.f1494c);
        d11.a(str2, l11.toString());
        if (!cVar.f1495d.f1507d.f(cVar.t, null)) {
            cVar.e();
            return;
        }
        b0 b0Var = cVar.f1495d.f1506c;
        l lVar = cVar.f1494c;
        synchronized (b0Var.f17366d) {
            j.d().a(b0.f17362e, "Starting timer for " + lVar);
            b0Var.a(lVar);
            b0.b bVar = new b0.b(b0Var, lVar);
            b0Var.f17364b.put(lVar, bVar);
            b0Var.f17365c.put(lVar, cVar);
            b0Var.f17363a.a(bVar, 600000L);
        }
    }

    public static void c(c cVar) {
        j d10;
        String str;
        String str2;
        StringBuilder l10;
        boolean z10;
        String str3 = cVar.f1494c.f16820a;
        if (cVar.f1497o < 2) {
            cVar.f1497o = 2;
            j d11 = j.d();
            str = f1491w;
            d11.a(str, "Stopping work for WorkSpec " + str3);
            Context context = cVar.f1492a;
            l lVar = cVar.f1494c;
            String str4 = a.f;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_STOP_WORK");
            a.d(intent, lVar);
            cVar.f1499q.execute(new d.b(cVar.f1493b, intent, cVar.f1495d));
            r rVar = cVar.f1495d.f1507d;
            String str5 = cVar.f1494c.f16820a;
            synchronized (rVar.f12953k) {
                z10 = rVar.c(str5) != null;
            }
            if (z10) {
                j.d().a(str, "WorkSpec " + str3 + " needs to be rescheduled");
                Context context2 = cVar.f1492a;
                l lVar2 = cVar.f1494c;
                Intent intent2 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                intent2.setAction("ACTION_SCHEDULE_WORK");
                a.d(intent2, lVar2);
                cVar.f1499q.execute(new d.b(cVar.f1493b, intent2, cVar.f1495d));
                return;
            }
            d10 = j.d();
            l10 = g.g("Processor does not have WorkSpec ", str3);
            str2 = ". No need to reschedule";
        } else {
            d10 = j.d();
            str = f1491w;
            str2 = str3;
            l10 = f.l("Already stopped work for ");
        }
        l10.append(str2);
        d10.a(str, l10.toString());
    }

    @Override // y2.b0.a
    public final void a(l lVar) {
        j.d().a(f1491w, "Exceeded time limits on execution for " + lVar);
        ((y2.r) this.f1498p).execute(new r2.b(this, 0));
    }

    @Override // t2.d
    public final void d(s sVar, t2.b bVar) {
        a3.a aVar;
        Runnable bVar2;
        if (bVar instanceof b.a) {
            aVar = this.f1498p;
            bVar2 = new m(this, 8);
        } else {
            aVar = this.f1498p;
            bVar2 = new r2.b(this, 1);
        }
        ((y2.r) aVar).execute(bVar2);
    }

    public final void e() {
        synchronized (this.f) {
            if (this.f1503v != null) {
                this.f1503v.cancel((CancellationException) null);
            }
            this.f1495d.f1506c.a(this.f1494c);
            PowerManager.WakeLock wakeLock = this.f1500r;
            if (wakeLock != null && wakeLock.isHeld()) {
                j.d().a(f1491w, "Releasing wakelock " + this.f1500r + "for WorkSpec " + this.f1494c);
                this.f1500r.release();
            }
        }
    }

    public final void f() {
        String str = this.f1494c.f16820a;
        Context context = this.f1492a;
        StringBuilder g10 = g.g(str, " (");
        g10.append(this.f1493b);
        g10.append(")");
        this.f1500r = v.a(context, g10.toString());
        j d10 = j.d();
        String str2 = f1491w;
        StringBuilder l10 = f.l("Acquiring wakelock ");
        l10.append(this.f1500r);
        l10.append("for WorkSpec ");
        l10.append(str);
        d10.a(str2, l10.toString());
        this.f1500r.acquire();
        s t = this.f1495d.f1508e.f12879c.u().t(str);
        if (t == null) {
            ((y2.r) this.f1498p).execute(new b.d(this, 6));
            return;
        }
        boolean b10 = t.b();
        this.f1501s = b10;
        if (b10) {
            this.f1503v = h.a(this.f1496e, t, this.f1502u, this);
            return;
        }
        j.d().a(str2, "No constraints for " + str);
        ((y2.r) this.f1498p).execute(new k(this, 7));
    }

    public final void g(boolean z10) {
        j d10 = j.d();
        String str = f1491w;
        StringBuilder l10 = f.l("onExecuted ");
        l10.append(this.f1494c);
        l10.append(", ");
        l10.append(z10);
        d10.a(str, l10.toString());
        e();
        if (z10) {
            Context context = this.f1492a;
            l lVar = this.f1494c;
            String str2 = a.f;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            a.d(intent, lVar);
            this.f1499q.execute(new d.b(this.f1493b, intent, this.f1495d));
        }
        if (this.f1501s) {
            Context context2 = this.f1492a;
            String str3 = a.f;
            Intent intent2 = new Intent(context2, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            this.f1499q.execute(new d.b(this.f1493b, intent2, this.f1495d));
        }
    }
}
