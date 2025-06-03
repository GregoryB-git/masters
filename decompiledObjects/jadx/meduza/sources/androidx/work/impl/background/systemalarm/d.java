package androidx.work.impl.background.systemalarm;

import a3.c;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import defpackage.f;
import java.util.ArrayList;
import java.util.Iterator;
import l.l;
import o2.j;
import p2.h0;
import p2.i0;
import p2.k0;
import p2.r;
import y2.b0;
import y2.v;

/* loaded from: classes.dex */
public final class d implements p2.d {
    public static final String t = j.f("SystemAlarmDispatcher");

    /* renamed from: a, reason: collision with root package name */
    public final Context f1504a;

    /* renamed from: b, reason: collision with root package name */
    public final a3.b f1505b;

    /* renamed from: c, reason: collision with root package name */
    public final b0 f1506c;

    /* renamed from: d, reason: collision with root package name */
    public final r f1507d;

    /* renamed from: e, reason: collision with root package name */
    public final k0 f1508e;
    public final androidx.work.impl.background.systemalarm.a f;

    /* renamed from: o, reason: collision with root package name */
    public final ArrayList f1509o;

    /* renamed from: p, reason: collision with root package name */
    public Intent f1510p;

    /* renamed from: q, reason: collision with root package name */
    public c f1511q;

    /* renamed from: r, reason: collision with root package name */
    public l f1512r;

    /* renamed from: s, reason: collision with root package name */
    public final h0 f1513s;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            c.a b10;
            RunnableC0025d runnableC0025d;
            synchronized (d.this.f1509o) {
                d dVar = d.this;
                dVar.f1510p = (Intent) dVar.f1509o.get(0);
            }
            Intent intent = d.this.f1510p;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = d.this.f1510p.getIntExtra("KEY_START_ID", 0);
                j d10 = j.d();
                String str = d.t;
                StringBuilder l10 = f.l("Processing command ");
                l10.append(d.this.f1510p);
                l10.append(", ");
                l10.append(intExtra);
                d10.a(str, l10.toString());
                PowerManager.WakeLock a10 = v.a(d.this.f1504a, action + " (" + intExtra + ")");
                try {
                    j.d().a(str, "Acquiring operation wake lock (" + action + ") " + a10);
                    a10.acquire();
                    d dVar2 = d.this;
                    dVar2.f.b(intExtra, dVar2.f1510p, dVar2);
                    j.d().a(str, "Releasing operation wake lock (" + action + ") " + a10);
                    a10.release();
                    b10 = d.this.f1505b.b();
                    runnableC0025d = new RunnableC0025d(d.this);
                } catch (Throwable th) {
                    try {
                        j d11 = j.d();
                        String str2 = d.t;
                        d11.c(str2, "Unexpected error in onHandleIntent", th);
                        j.d().a(str2, "Releasing operation wake lock (" + action + ") " + a10);
                        a10.release();
                        b10 = d.this.f1505b.b();
                        runnableC0025d = new RunnableC0025d(d.this);
                    } catch (Throwable th2) {
                        j.d().a(d.t, "Releasing operation wake lock (" + action + ") " + a10);
                        a10.release();
                        d.this.f1505b.b().execute(new RunnableC0025d(d.this));
                        throw th2;
                    }
                }
                b10.execute(runnableC0025d);
            }
        }
    }

    public static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final d f1515a;

        /* renamed from: b, reason: collision with root package name */
        public final Intent f1516b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1517c;

        public b(int i10, Intent intent, d dVar) {
            this.f1515a = dVar;
            this.f1516b = intent;
            this.f1517c = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f1515a.b(this.f1517c, this.f1516b);
        }
    }

    public interface c {
    }

    /* renamed from: androidx.work.impl.background.systemalarm.d$d, reason: collision with other inner class name */
    public static class RunnableC0025d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final d f1518a;

        public RunnableC0025d(d dVar) {
            this.f1518a = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z10;
            boolean z11;
            d dVar = this.f1518a;
            dVar.getClass();
            j d10 = j.d();
            String str = d.t;
            d10.a(str, "Checking if commands are complete.");
            d.c();
            synchronized (dVar.f1509o) {
                if (dVar.f1510p != null) {
                    j.d().a(str, "Removing command " + dVar.f1510p);
                    if (!((Intent) dVar.f1509o.remove(0)).equals(dVar.f1510p)) {
                        throw new IllegalStateException("Dequeue-d command is not the first.");
                    }
                    dVar.f1510p = null;
                }
                y2.r c10 = dVar.f1505b.c();
                androidx.work.impl.background.systemalarm.a aVar = dVar.f;
                synchronized (aVar.f1483c) {
                    z10 = !aVar.f1482b.isEmpty();
                }
                if (!z10 && dVar.f1509o.isEmpty()) {
                    synchronized (c10.f17396d) {
                        z11 = !c10.f17393a.isEmpty();
                    }
                    if (!z11) {
                        j.d().a(str, "No more commands & intents.");
                        c cVar = dVar.f1511q;
                        if (cVar != null) {
                            ((SystemAlarmService) cVar).a();
                        }
                    }
                }
                if (!dVar.f1509o.isEmpty()) {
                    dVar.d();
                }
            }
        }
    }

    public d(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f1504a = applicationContext;
        this.f1512r = new l(2);
        k0 d10 = k0.d(context);
        this.f1508e = d10;
        this.f = new androidx.work.impl.background.systemalarm.a(applicationContext, d10.f12878b.f1444c, this.f1512r);
        this.f1506c = new b0(d10.f12878b.f);
        r rVar = d10.f;
        this.f1507d = rVar;
        a3.b bVar = d10.f12880d;
        this.f1505b = bVar;
        this.f1513s = new i0(rVar, bVar);
        rVar.a(this);
        this.f1509o = new ArrayList();
        this.f1510p = null;
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    @Override // p2.d
    public final void a(x2.l lVar, boolean z10) {
        c.a b10 = this.f1505b.b();
        Context context = this.f1504a;
        String str = androidx.work.impl.background.systemalarm.a.f;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z10);
        androidx.work.impl.background.systemalarm.a.d(intent, lVar);
        b10.execute(new b(0, intent, this));
    }

    public final void b(int i10, Intent intent) {
        boolean z10;
        j d10 = j.d();
        String str = t;
        d10.a(str, "Adding command " + intent + " (" + i10 + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            j.d().g(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.f1509o) {
                Iterator it = this.f1509o.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = false;
                        break;
                    } else if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (z10) {
                return;
            }
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.f1509o) {
            boolean z11 = !this.f1509o.isEmpty();
            this.f1509o.add(intent);
            if (!z11) {
                d();
            }
        }
    }

    public final void d() {
        c();
        PowerManager.WakeLock a10 = v.a(this.f1504a, "ProcessCommand");
        try {
            a10.acquire();
            this.f1508e.f12880d.d(new a());
        } finally {
            a10.release();
        }
    }
}
