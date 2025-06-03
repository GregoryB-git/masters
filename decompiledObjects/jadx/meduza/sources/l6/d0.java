package l6;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.internal.base.zau;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import k6.a;
import k6.e;
import l6.h;

/* loaded from: classes.dex */
public final class d0 implements e.a, e.b {
    public final /* synthetic */ d A;

    /* renamed from: b, reason: collision with root package name */
    public final a.f f9658b;

    /* renamed from: c, reason: collision with root package name */
    public final a f9659c;

    /* renamed from: d, reason: collision with root package name */
    public final u f9660d;

    /* renamed from: u, reason: collision with root package name */
    public final int f9662u;

    /* renamed from: v, reason: collision with root package name */
    public final zact f9663v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9664w;

    /* renamed from: a, reason: collision with root package name */
    public final LinkedList f9657a = new LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f9661e = new HashSet();
    public final HashMap f = new HashMap();

    /* renamed from: x, reason: collision with root package name */
    public final ArrayList f9665x = new ArrayList();

    /* renamed from: y, reason: collision with root package name */
    public j6.b f9666y = null;

    /* renamed from: z, reason: collision with root package name */
    public int f9667z = 0;

    public d0(d dVar, k6.d dVar2) {
        this.A = dVar;
        a.f zab = dVar2.zab(dVar.f9655v.getLooper(), this);
        this.f9658b = zab;
        this.f9659c = dVar2.getApiKey();
        this.f9660d = new u();
        this.f9662u = dVar2.zaa();
        if (zab.requiresSignIn()) {
            this.f9663v = dVar2.zac(dVar.f9648e, dVar.f9655v);
        } else {
            this.f9663v = null;
        }
    }

    public final void a(j6.b bVar) {
        Iterator it = this.f9661e.iterator();
        if (!it.hasNext()) {
            this.f9661e.clear();
            return;
        }
        b1 b1Var = (b1) it.next();
        if (m6.h.a(bVar, j6.b.f8468e)) {
            this.f9658b.getEndpointPackageName();
        }
        b1Var.getClass();
        throw null;
    }

    public final void b(Status status) {
        m6.j.c(this.A.f9655v);
        c(status, null, false);
    }

    public final void c(Status status, RuntimeException runtimeException, boolean z10) {
        m6.j.c(this.A.f9655v);
        if ((status == null) == (runtimeException == null)) {
            throw new IllegalArgumentException("Status XOR exception should be null");
        }
        Iterator it = this.f9657a.iterator();
        while (it.hasNext()) {
            a1 a1Var = (a1) it.next();
            if (!z10 || a1Var.f9631a == 2) {
                if (status != null) {
                    a1Var.a(status);
                } else {
                    a1Var.b(runtimeException);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        ArrayList arrayList = new ArrayList(this.f9657a);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a1 a1Var = (a1) arrayList.get(i10);
            if (!this.f9658b.isConnected()) {
                return;
            }
            if (j(a1Var)) {
                this.f9657a.remove(a1Var);
            }
        }
    }

    public final void e() {
        m6.j.c(this.A.f9655v);
        this.f9666y = null;
        a(j6.b.f8468e);
        i();
        Iterator it = this.f.values().iterator();
        if (it.hasNext()) {
            ((n0) it.next()).getClass();
            throw null;
        }
        d();
        h();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0080 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(int r7) {
        /*
            r6 = this;
            l6.d r0 = r6.A
            com.google.android.gms.internal.base.zau r0 = r0.f9655v
            m6.j.c(r0)
            r0 = 0
            r6.f9666y = r0
            r1 = 1
            r6.f9664w = r1
            k6.a$f r2 = r6.f9658b
            java.lang.String r2 = r2.getLastDisconnectMessage()
            l6.u r3 = r6.f9660d
            r3.getClass()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "The connection to Google Play services was lost"
            r4.<init>(r5)
            if (r7 != r1) goto L24
            java.lang.String r7 = " due to service disconnection."
            goto L29
        L24:
            r5 = 3
            if (r7 != r5) goto L2c
            java.lang.String r7 = " due to dead object exception."
        L29:
            r4.append(r7)
        L2c:
            if (r2 == 0) goto L36
            java.lang.String r7 = " Last reason for disconnect: "
            r4.append(r7)
            r4.append(r2)
        L36:
            java.lang.String r7 = r4.toString()
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r4 = 20
            r2.<init>(r4, r7, r0, r0)
            r3.a(r2, r1)
            l6.a r7 = r6.f9659c
            l6.d r1 = r6.A
            com.google.android.gms.internal.base.zau r1 = r1.f9655v
            r2 = 9
            android.os.Message r7 = android.os.Message.obtain(r1, r2, r7)
            r2 = 5000(0x1388, double:2.4703E-320)
            r1.sendMessageDelayed(r7, r2)
            l6.a r7 = r6.f9659c
            l6.d r1 = r6.A
            com.google.android.gms.internal.base.zau r1 = r1.f9655v
            r2 = 11
            android.os.Message r7 = android.os.Message.obtain(r1, r2, r7)
            r2 = 120000(0x1d4c0, double:5.9288E-319)
            r1.sendMessageDelayed(r7, r2)
            l6.d r7 = r6.A
            m6.u r7 = r7.f9649o
            android.util.SparseIntArray r7 = r7.f10326a
            r7.clear()
            java.util.HashMap r7 = r6.f
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
            boolean r1 = r7.hasNext()
            if (r1 != 0) goto L81
            return
        L81:
            java.lang.Object r7 = r7.next()
            l6.n0 r7 = (l6.n0) r7
            r7.getClass()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.d0.f(int):void");
    }

    @Override // l6.j
    public final void g(j6.b bVar) {
        o(bVar, null);
    }

    public final void h() {
        this.A.f9655v.removeMessages(12, this.f9659c);
        a aVar = this.f9659c;
        zau zauVar = this.A.f9655v;
        zauVar.sendMessageDelayed(zauVar.obtainMessage(12, aVar), this.A.f9644a);
    }

    public final void i() {
        if (this.f9664w) {
            d dVar = this.A;
            dVar.f9655v.removeMessages(11, this.f9659c);
            d dVar2 = this.A;
            dVar2.f9655v.removeMessages(9, this.f9659c);
            this.f9664w = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean j(a1 a1Var) {
        j6.d dVar;
        if (!(a1Var instanceof j0)) {
            a1Var.d(this.f9660d, this.f9658b.requiresSignIn());
            try {
                a1Var.c(this);
            } catch (DeadObjectException unused) {
                r(1);
                this.f9658b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        j0 j0Var = (j0) a1Var;
        j6.d[] g10 = j0Var.g(this);
        if (g10 != null && g10.length != 0) {
            j6.d[] availableFeatures = this.f9658b.getAvailableFeatures();
            if (availableFeatures == null) {
                availableFeatures = new j6.d[0];
            }
            r.b bVar = new r.b(availableFeatures.length);
            for (j6.d dVar2 : availableFeatures) {
                bVar.put(dVar2.f8480a, Long.valueOf(dVar2.D()));
            }
            int length = g10.length;
            for (int i10 = 0; i10 < length; i10++) {
                dVar = g10[i10];
                Long l10 = (Long) bVar.getOrDefault(dVar.f8480a, null);
                if (l10 == null || l10.longValue() < dVar.D()) {
                    break;
                }
            }
        }
        dVar = null;
        if (dVar == null) {
            a1Var.d(this.f9660d, this.f9658b.requiresSignIn());
            try {
                a1Var.c(this);
            } catch (DeadObjectException unused2) {
                r(1);
                this.f9658b.disconnect("DeadObjectException thrown while running ApiCallRunner.");
            }
            return true;
        }
        Log.w("GoogleApiManager", this.f9658b.getClass().getName() + " could not execute call because it requires feature (" + dVar.f8480a + ", " + dVar.D() + ").");
        if (!this.A.f9656w || !j0Var.f(this)) {
            j0Var.b(new k6.n(dVar));
            return true;
        }
        e0 e0Var = new e0(this.f9659c, dVar);
        int indexOf = this.f9665x.indexOf(e0Var);
        if (indexOf >= 0) {
            e0 e0Var2 = (e0) this.f9665x.get(indexOf);
            this.A.f9655v.removeMessages(15, e0Var2);
            zau zauVar = this.A.f9655v;
            zauVar.sendMessageDelayed(Message.obtain(zauVar, 15, e0Var2), 5000L);
        } else {
            this.f9665x.add(e0Var);
            zau zauVar2 = this.A.f9655v;
            zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 15, e0Var), 5000L);
            zau zauVar3 = this.A.f9655v;
            zauVar3.sendMessageDelayed(Message.obtain(zauVar3, 16, e0Var), 120000L);
            j6.b bVar2 = new j6.b(2, null);
            if (!k(bVar2)) {
                this.A.c(bVar2, this.f9662u);
            }
        }
        return false;
    }

    public final boolean k(j6.b bVar) {
        boolean z10;
        synchronized (d.f9643z) {
            try {
                d dVar = this.A;
                if (dVar.f9653s == null || !dVar.t.contains(this.f9659c)) {
                    return false;
                }
                v vVar = this.A.f9653s;
                int i10 = this.f9662u;
                vVar.getClass();
                c1 c1Var = new c1(bVar, i10);
                while (true) {
                    AtomicReference atomicReference = vVar.f9674b;
                    while (true) {
                        if (atomicReference.compareAndSet(null, c1Var)) {
                            z10 = true;
                            break;
                        }
                        if (atomicReference.get() != null) {
                            z10 = false;
                            break;
                        }
                    }
                    if (z10) {
                        vVar.f9675c.post(new d1(vVar, c1Var));
                        break;
                    }
                    if (atomicReference.get() != null) {
                        break;
                    }
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean l(boolean z10) {
        m6.j.c(this.A.f9655v);
        if (this.f9658b.isConnected() && this.f.isEmpty()) {
            u uVar = this.f9660d;
            if (!((uVar.f9728a.isEmpty() && uVar.f9729b.isEmpty()) ? false : true)) {
                this.f9658b.disconnect("Timing out service connection.");
                return true;
            }
            if (z10) {
                h();
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [g7.f, k6.a$f] */
    public final void m() {
        j6.b bVar;
        m6.j.c(this.A.f9655v);
        if (this.f9658b.isConnected() || this.f9658b.isConnecting()) {
            return;
        }
        try {
            d dVar = this.A;
            int a10 = dVar.f9649o.a(dVar.f9648e, this.f9658b);
            if (a10 != 0) {
                j6.b bVar2 = new j6.b(a10, null);
                Log.w("GoogleApiManager", "The service for " + this.f9658b.getClass().getName() + " is not available: " + bVar2.toString());
                o(bVar2, null);
                return;
            }
            d dVar2 = this.A;
            a.f fVar = this.f9658b;
            g0 g0Var = new g0(dVar2, fVar, this.f9659c);
            if (fVar.requiresSignIn()) {
                zact zactVar = this.f9663v;
                m6.j.i(zactVar);
                Object obj = zactVar.f;
                if (obj != null) {
                    ((com.google.android.gms.common.internal.a) obj).disconnect();
                }
                zactVar.f2825e.f10246h = Integer.valueOf(System.identityHashCode(zactVar));
                g7.b bVar3 = zactVar.f2823c;
                Context context = zactVar.f2821a;
                Handler handler = zactVar.f2822b;
                m6.a aVar = zactVar.f2825e;
                zactVar.f = bVar3.buildClient(context, handler.getLooper(), aVar, (Object) aVar.f10245g, (e.a) zactVar, (e.b) zactVar);
                zactVar.f2826u = g0Var;
                Set set = zactVar.f2824d;
                if (set == null || set.isEmpty()) {
                    zactVar.f2822b.post(new i6.q(zactVar, 1));
                } else {
                    h7.a aVar2 = (h7.a) zactVar.f;
                    aVar2.getClass();
                    aVar2.connect(new a.d());
                }
            }
            try {
                this.f9658b.connect(g0Var);
            } catch (SecurityException e10) {
                e = e10;
                bVar = new j6.b(10);
                o(bVar, e);
            }
        } catch (IllegalStateException e11) {
            e = e11;
            bVar = new j6.b(10);
        }
    }

    public final void n(a1 a1Var) {
        m6.j.c(this.A.f9655v);
        if (this.f9658b.isConnected()) {
            if (j(a1Var)) {
                h();
                return;
            } else {
                this.f9657a.add(a1Var);
                return;
            }
        }
        this.f9657a.add(a1Var);
        j6.b bVar = this.f9666y;
        if (bVar != null) {
            if ((bVar.f8470b == 0 || bVar.f8471c == null) ? false : true) {
                o(bVar, null);
                return;
            }
        }
        m();
    }

    public final void o(j6.b bVar, RuntimeException runtimeException) {
        Object obj;
        m6.j.c(this.A.f9655v);
        zact zactVar = this.f9663v;
        if (zactVar != null && (obj = zactVar.f) != null) {
            ((com.google.android.gms.common.internal.a) obj).disconnect();
        }
        m6.j.c(this.A.f9655v);
        this.f9666y = null;
        this.A.f9649o.f10326a.clear();
        a(bVar);
        if ((this.f9658b instanceof o6.d) && bVar.f8470b != 24) {
            d dVar = this.A;
            dVar.f9645b = true;
            zau zauVar = dVar.f9655v;
            zauVar.sendMessageDelayed(zauVar.obtainMessage(19), 300000L);
        }
        if (bVar.f8470b == 4) {
            b(d.f9642y);
            return;
        }
        if (this.f9657a.isEmpty()) {
            this.f9666y = bVar;
            return;
        }
        if (runtimeException != null) {
            m6.j.c(this.A.f9655v);
            c(null, runtimeException, false);
            return;
        }
        if (!this.A.f9656w) {
            b(d.d(this.f9659c, bVar));
            return;
        }
        c(d.d(this.f9659c, bVar), null, true);
        if (this.f9657a.isEmpty() || k(bVar) || this.A.c(bVar, this.f9662u)) {
            return;
        }
        if (bVar.f8470b == 18) {
            this.f9664w = true;
        }
        if (!this.f9664w) {
            b(d.d(this.f9659c, bVar));
            return;
        }
        d dVar2 = this.A;
        a aVar = this.f9659c;
        zau zauVar2 = dVar2.f9655v;
        zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 9, aVar), 5000L);
    }

    public final void p(j6.b bVar) {
        m6.j.c(this.A.f9655v);
        a.f fVar = this.f9658b;
        fVar.disconnect("onSignInFailed for " + fVar.getClass().getName() + " with " + String.valueOf(bVar));
        o(bVar, null);
    }

    public final void q() {
        m6.j.c(this.A.f9655v);
        Status status = d.f9641x;
        b(status);
        u uVar = this.f9660d;
        uVar.getClass();
        uVar.a(status, false);
        for (h.a aVar : (h.a[]) this.f.keySet().toArray(new h.a[0])) {
            n(new z0(aVar, new TaskCompletionSource()));
        }
        a(new j6.b(4));
        if (this.f9658b.isConnected()) {
            this.f9658b.onUserSignOut(new c0(this));
        }
    }

    @Override // l6.c
    public final void r(int i10) {
        if (Looper.myLooper() == this.A.f9655v.getLooper()) {
            f(i10);
        } else {
            this.A.f9655v.post(new a0(this, i10));
        }
    }

    @Override // l6.c
    public final void s() {
        if (Looper.myLooper() == this.A.f9655v.getLooper()) {
            e();
        } else {
            this.A.f9655v.post(new i6.r(this, 1));
        }
    }
}
