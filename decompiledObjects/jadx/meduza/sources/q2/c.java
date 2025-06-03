package q2;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import b.a0;
import defpackage.f;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import l.l;
import nc.j1;
import o2.j;
import o2.o;
import p2.h0;
import p2.i0;
import p2.r;
import p2.t;
import p2.x;
import t2.b;
import t2.e;
import t2.h;
import v2.n;
import x2.s;
import y2.q;

/* loaded from: classes.dex */
public final class c implements t, t2.d, p2.d {

    /* renamed from: w, reason: collision with root package name */
    public static final String f13202w = j.f("GreedyScheduler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f13203a;

    /* renamed from: c, reason: collision with root package name */
    public b f13205c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13206d;

    /* renamed from: o, reason: collision with root package name */
    public final r f13208o;

    /* renamed from: p, reason: collision with root package name */
    public final h0 f13209p;

    /* renamed from: q, reason: collision with root package name */
    public final androidx.work.a f13210q;

    /* renamed from: s, reason: collision with root package name */
    public Boolean f13212s;
    public final e t;

    /* renamed from: u, reason: collision with root package name */
    public final a3.b f13213u;

    /* renamed from: v, reason: collision with root package name */
    public final d f13214v;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f13204b = new HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final Object f13207e = new Object();
    public final l f = new l(2);

    /* renamed from: r, reason: collision with root package name */
    public final HashMap f13211r = new HashMap();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f13215a;

        /* renamed from: b, reason: collision with root package name */
        public final long f13216b;

        public a(int i10, long j10) {
            this.f13215a = i10;
            this.f13216b = j10;
        }
    }

    public c(Context context, androidx.work.a aVar, n nVar, r rVar, i0 i0Var, a3.b bVar) {
        this.f13203a = context;
        p2.c cVar = aVar.f;
        this.f13205c = new b(this, cVar, aVar.f1444c);
        this.f13214v = new d(cVar, i0Var);
        this.f13213u = bVar;
        this.t = new e(nVar);
        this.f13210q = aVar;
        this.f13208o = rVar;
        this.f13209p = i0Var;
    }

    @Override // p2.d
    public final void a(x2.l lVar, boolean z10) {
        j1 j1Var;
        x f = this.f.f(lVar);
        if (f != null) {
            this.f13214v.a(f);
        }
        synchronized (this.f13207e) {
            j1Var = (j1) this.f13204b.remove(lVar);
        }
        if (j1Var != null) {
            j.d().a(f13202w, "Stopping tracking for " + lVar);
            j1Var.cancel((CancellationException) null);
        }
        if (z10) {
            return;
        }
        synchronized (this.f13207e) {
            this.f13211r.remove(lVar);
        }
    }

    @Override // p2.t
    public final boolean b() {
        return false;
    }

    @Override // p2.t
    public final void c(String str) {
        Runnable runnable;
        if (this.f13212s == null) {
            this.f13212s = Boolean.valueOf(q.a(this.f13203a, this.f13210q));
        }
        if (!this.f13212s.booleanValue()) {
            j.d().e(f13202w, "Ignoring schedule request in non-main process");
            return;
        }
        if (!this.f13206d) {
            this.f13208o.a(this);
            this.f13206d = true;
        }
        j.d().a(f13202w, "Cancelling work ID " + str);
        b bVar = this.f13205c;
        if (bVar != null && (runnable = (Runnable) bVar.f13201d.remove(str)) != null) {
            bVar.f13199b.b(runnable);
        }
        for (x xVar : this.f.e(str)) {
            this.f13214v.a(xVar);
            this.f13209p.a(xVar);
        }
    }

    @Override // t2.d
    public final void d(s sVar, t2.b bVar) {
        x2.l s10 = a0.s(sVar);
        if (bVar instanceof b.a) {
            if (this.f.a(s10)) {
                return;
            }
            j.d().a(f13202w, "Constraints met: Scheduling work ID " + s10);
            x h10 = this.f.h(s10);
            this.f13214v.b(h10);
            this.f13209p.b(h10);
            return;
        }
        j.d().a(f13202w, "Constraints not met: Cancelling work ID " + s10);
        x f = this.f.f(s10);
        if (f != null) {
            this.f13214v.a(f);
            this.f13209p.d(f, ((b.C0227b) bVar).f14413a);
        }
    }

    @Override // p2.t
    public final void e(s... sVarArr) {
        long max;
        j d10;
        String str;
        StringBuilder sb2;
        String str2;
        if (this.f13212s == null) {
            this.f13212s = Boolean.valueOf(q.a(this.f13203a, this.f13210q));
        }
        if (!this.f13212s.booleanValue()) {
            j.d().e(f13202w, "Ignoring schedule request in a secondary process");
            return;
        }
        if (!this.f13206d) {
            this.f13208o.a(this);
            this.f13206d = true;
        }
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (s sVar : sVarArr) {
            if (!this.f.a(a0.s(sVar))) {
                synchronized (this.f13207e) {
                    x2.l s10 = a0.s(sVar);
                    a aVar = (a) this.f13211r.get(s10);
                    if (aVar == null) {
                        int i10 = sVar.f16839k;
                        this.f13210q.f1444c.getClass();
                        aVar = new a(i10, System.currentTimeMillis());
                        this.f13211r.put(s10, aVar);
                    }
                    max = (Math.max((sVar.f16839k - aVar.f13215a) - 5, 0) * 30000) + aVar.f13216b;
                }
                long max2 = Math.max(sVar.a(), max);
                this.f13210q.f1444c.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                if (sVar.f16831b == o.b.ENQUEUED) {
                    if (currentTimeMillis < max2) {
                        b bVar = this.f13205c;
                        if (bVar != null) {
                            Runnable runnable = (Runnable) bVar.f13201d.remove(sVar.f16830a);
                            if (runnable != null) {
                                bVar.f13199b.b(runnable);
                            }
                            q2.a aVar2 = new q2.a(bVar, sVar);
                            bVar.f13201d.put(sVar.f16830a, aVar2);
                            bVar.f13199b.a(aVar2, max2 - bVar.f13200c.a());
                        }
                    } else if (sVar.b()) {
                        int i11 = Build.VERSION.SDK_INT;
                        o2.c cVar = sVar.f16838j;
                        if (cVar.f11705c) {
                            d10 = j.d();
                            str = f13202w;
                            sb2 = new StringBuilder();
                            sb2.append("Ignoring ");
                            sb2.append(sVar);
                            str2 = ". Requires device idle.";
                        } else if (i11 < 24 || !cVar.a()) {
                            hashSet.add(sVar);
                            hashSet2.add(sVar.f16830a);
                        } else {
                            d10 = j.d();
                            str = f13202w;
                            sb2 = new StringBuilder();
                            sb2.append("Ignoring ");
                            sb2.append(sVar);
                            str2 = ". Requires ContentUri triggers.";
                        }
                        sb2.append(str2);
                        d10.a(str, sb2.toString());
                    } else if (!this.f.a(a0.s(sVar))) {
                        j d11 = j.d();
                        String str3 = f13202w;
                        StringBuilder l10 = f.l("Starting work for ");
                        l10.append(sVar.f16830a);
                        d11.a(str3, l10.toString());
                        l lVar = this.f;
                        lVar.getClass();
                        x h10 = lVar.h(a0.s(sVar));
                        this.f13214v.b(h10);
                        this.f13209p.b(h10);
                    }
                }
            }
        }
        synchronized (this.f13207e) {
            if (!hashSet.isEmpty()) {
                j.d().a(f13202w, "Starting tracking for " + TextUtils.join(",", hashSet2));
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    s sVar2 = (s) it.next();
                    x2.l s11 = a0.s(sVar2);
                    if (!this.f13204b.containsKey(s11)) {
                        this.f13204b.put(s11, h.a(this.t, sVar2, this.f13213u.a(), this));
                    }
                }
            }
        }
    }
}
