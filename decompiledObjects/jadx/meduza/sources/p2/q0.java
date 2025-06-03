package p2;

import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.d;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import o2.o;

/* loaded from: classes.dex */
public final class q0 implements Runnable {

    /* renamed from: z, reason: collision with root package name */
    public static final String f12920z = o2.j.f("WorkerWrapper");

    /* renamed from: a, reason: collision with root package name */
    public Context f12921a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12922b;

    /* renamed from: c, reason: collision with root package name */
    public x2.s f12923c;

    /* renamed from: d, reason: collision with root package name */
    public androidx.work.d f12924d;

    /* renamed from: e, reason: collision with root package name */
    public a3.b f12925e;

    /* renamed from: o, reason: collision with root package name */
    public androidx.work.a f12926o;

    /* renamed from: p, reason: collision with root package name */
    public m0 f12927p;

    /* renamed from: q, reason: collision with root package name */
    public w2.a f12928q;

    /* renamed from: r, reason: collision with root package name */
    public WorkDatabase f12929r;

    /* renamed from: s, reason: collision with root package name */
    public x2.t f12930s;
    public x2.b t;

    /* renamed from: u, reason: collision with root package name */
    public List<String> f12931u;

    /* renamed from: v, reason: collision with root package name */
    public String f12932v;
    public d.a f = new d.a.C0024a();

    /* renamed from: w, reason: collision with root package name */
    public z2.c<Boolean> f12933w = new z2.c<>();

    /* renamed from: x, reason: collision with root package name */
    public final z2.c<d.a> f12934x = new z2.c<>();

    /* renamed from: y, reason: collision with root package name */
    public volatile int f12935y = -256;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public Context f12936a;

        /* renamed from: b, reason: collision with root package name */
        public w2.a f12937b;

        /* renamed from: c, reason: collision with root package name */
        public a3.b f12938c;

        /* renamed from: d, reason: collision with root package name */
        public androidx.work.a f12939d;

        /* renamed from: e, reason: collision with root package name */
        public WorkDatabase f12940e;
        public x2.s f;

        /* renamed from: g, reason: collision with root package name */
        public final List<String> f12941g;

        /* renamed from: h, reason: collision with root package name */
        public WorkerParameters.a f12942h = new WorkerParameters.a();

        public a(Context context, androidx.work.a aVar, a3.b bVar, w2.a aVar2, WorkDatabase workDatabase, x2.s sVar, ArrayList arrayList) {
            this.f12936a = context.getApplicationContext();
            this.f12938c = bVar;
            this.f12937b = aVar2;
            this.f12939d = aVar;
            this.f12940e = workDatabase;
            this.f = sVar;
            this.f12941g = arrayList;
        }
    }

    public q0(a aVar) {
        this.f12921a = aVar.f12936a;
        this.f12925e = aVar.f12938c;
        this.f12928q = aVar.f12937b;
        x2.s sVar = aVar.f;
        this.f12923c = sVar;
        this.f12922b = sVar.f16830a;
        WorkerParameters.a aVar2 = aVar.f12942h;
        this.f12924d = null;
        androidx.work.a aVar3 = aVar.f12939d;
        this.f12926o = aVar3;
        this.f12927p = aVar3.f1444c;
        WorkDatabase workDatabase = aVar.f12940e;
        this.f12929r = workDatabase;
        this.f12930s = workDatabase.u();
        this.t = this.f12929r.p();
        this.f12931u = aVar.f12941g;
    }

    public final void a(d.a aVar) {
        if (aVar instanceof d.a.c) {
            o2.j d10 = o2.j.d();
            String str = f12920z;
            StringBuilder l10 = defpackage.f.l("Worker result SUCCESS for ");
            l10.append(this.f12932v);
            d10.e(str, l10.toString());
            if (!this.f12923c.c()) {
                this.f12929r.c();
                try {
                    this.f12930s.e(o.b.SUCCEEDED, this.f12922b);
                    this.f12930s.l(this.f12922b, ((d.a.c) this.f).f1462a);
                    this.f12927p.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    for (String str2 : this.t.a(this.f12922b)) {
                        if (this.f12930s.s(str2) == o.b.BLOCKED && this.t.c(str2)) {
                            o2.j.d().e(f12920z, "Setting status to enqueued for " + str2);
                            this.f12930s.e(o.b.ENQUEUED, str2);
                            this.f12930s.m(str2, currentTimeMillis);
                        }
                    }
                    this.f12929r.n();
                    return;
                } finally {
                    this.f12929r.j();
                    f(false);
                }
            }
        } else {
            if (aVar instanceof d.a.b) {
                o2.j d11 = o2.j.d();
                String str3 = f12920z;
                StringBuilder l11 = defpackage.f.l("Worker result RETRY for ");
                l11.append(this.f12932v);
                d11.e(str3, l11.toString());
                d();
                return;
            }
            o2.j d12 = o2.j.d();
            String str4 = f12920z;
            StringBuilder l12 = defpackage.f.l("Worker result FAILURE for ");
            l12.append(this.f12932v);
            d12.e(str4, l12.toString());
            if (!this.f12923c.c()) {
                h();
                return;
            }
        }
        e();
    }

    public final void b(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f12930s.s(str2) != o.b.CANCELLED) {
                this.f12930s.e(o.b.FAILED, str2);
            }
            linkedList.addAll(this.t.a(str2));
        }
    }

    public final void c() {
        if (i()) {
            return;
        }
        this.f12929r.c();
        try {
            o.b s10 = this.f12930s.s(this.f12922b);
            this.f12929r.t().a(this.f12922b);
            if (s10 == null) {
                f(false);
            } else if (s10 == o.b.RUNNING) {
                a(this.f);
            } else if (!s10.f()) {
                this.f12935y = -512;
                d();
            }
            this.f12929r.n();
        } finally {
            this.f12929r.j();
        }
    }

    public final void d() {
        this.f12929r.c();
        try {
            this.f12930s.e(o.b.ENQUEUED, this.f12922b);
            x2.t tVar = this.f12930s;
            String str = this.f12922b;
            this.f12927p.getClass();
            tVar.m(str, System.currentTimeMillis());
            this.f12930s.j(this.f12923c.f16849v, this.f12922b);
            this.f12930s.f(this.f12922b, -1L);
            this.f12929r.n();
        } finally {
            this.f12929r.j();
            f(true);
        }
    }

    public final void e() {
        this.f12929r.c();
        try {
            x2.t tVar = this.f12930s;
            String str = this.f12922b;
            this.f12927p.getClass();
            tVar.m(str, System.currentTimeMillis());
            this.f12930s.e(o.b.ENQUEUED, this.f12922b);
            this.f12930s.u(this.f12922b);
            this.f12930s.j(this.f12923c.f16849v, this.f12922b);
            this.f12930s.d(this.f12922b);
            this.f12930s.f(this.f12922b, -1L);
            this.f12929r.n();
        } finally {
            this.f12929r.j();
            f(false);
        }
    }

    public final void f(boolean z10) {
        this.f12929r.c();
        try {
            if (!this.f12929r.u().p()) {
                y2.o.a(this.f12921a, RescheduleReceiver.class, false);
            }
            if (z10) {
                this.f12930s.e(o.b.ENQUEUED, this.f12922b);
                this.f12930s.o(this.f12935y, this.f12922b);
                this.f12930s.f(this.f12922b, -1L);
            }
            this.f12929r.n();
            this.f12929r.j();
            this.f12933w.i(Boolean.valueOf(z10));
        } catch (Throwable th) {
            this.f12929r.j();
            throw th;
        }
    }

    public final void g() {
        boolean z10;
        o.b s10 = this.f12930s.s(this.f12922b);
        if (s10 == o.b.RUNNING) {
            o2.j d10 = o2.j.d();
            String str = f12920z;
            StringBuilder l10 = defpackage.f.l("Status for ");
            l10.append(this.f12922b);
            l10.append(" is RUNNING; not doing any work and rescheduling for later execution");
            d10.a(str, l10.toString());
            z10 = true;
        } else {
            o2.j d11 = o2.j.d();
            String str2 = f12920z;
            StringBuilder l11 = defpackage.f.l("Status for ");
            l11.append(this.f12922b);
            l11.append(" is ");
            l11.append(s10);
            l11.append(" ; not doing any work");
            d11.a(str2, l11.toString());
            z10 = false;
        }
        f(z10);
    }

    public final void h() {
        this.f12929r.c();
        try {
            b(this.f12922b);
            androidx.work.c cVar = ((d.a.C0024a) this.f).f1461a;
            this.f12930s.j(this.f12923c.f16849v, this.f12922b);
            this.f12930s.l(this.f12922b, cVar);
            this.f12929r.n();
        } finally {
            this.f12929r.j();
            f(false);
        }
    }

    public final boolean i() {
        if (this.f12935y == -256) {
            return false;
        }
        o2.j d10 = o2.j.d();
        String str = f12920z;
        StringBuilder l10 = defpackage.f.l("Work interrupted for ");
        l10.append(this.f12932v);
        d10.a(str, l10.toString());
        if (this.f12930s.s(this.f12922b) == null) {
            f(false);
        } else {
            f(!r0.f());
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x008d, code lost:
    
        if ((r1.f16831b == r0 && r1.f16839k > 0) != false) goto L26;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 617
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p2.q0.run():void");
    }
}
