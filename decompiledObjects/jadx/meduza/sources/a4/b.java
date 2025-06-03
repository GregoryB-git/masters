package a4;

import a4.a;
import a4.d;
import a4.e;
import a4.g;
import a4.h;
import a4.o;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import o7.l0;
import o7.t;
import t5.c0;
import v3.i0;
import v5.e0;
import w3.a0;

/* loaded from: classes.dex */
public final class b implements h {

    /* renamed from: b, reason: collision with root package name */
    public final UUID f133b;

    /* renamed from: c, reason: collision with root package name */
    public final o.c f134c;

    /* renamed from: d, reason: collision with root package name */
    public final w f135d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap<String, String> f136e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f137g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f138h;

    /* renamed from: i, reason: collision with root package name */
    public final e f139i;

    /* renamed from: j, reason: collision with root package name */
    public final c0 f140j;

    /* renamed from: k, reason: collision with root package name */
    public final f f141k;

    /* renamed from: l, reason: collision with root package name */
    public final long f142l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f143m;

    /* renamed from: n, reason: collision with root package name */
    public final Set<d> f144n;

    /* renamed from: o, reason: collision with root package name */
    public final Set<a4.a> f145o;

    /* renamed from: p, reason: collision with root package name */
    public int f146p;

    /* renamed from: q, reason: collision with root package name */
    public o f147q;

    /* renamed from: r, reason: collision with root package name */
    public a4.a f148r;

    /* renamed from: s, reason: collision with root package name */
    public a4.a f149s;
    public Looper t;

    /* renamed from: u, reason: collision with root package name */
    public Handler f150u;

    /* renamed from: v, reason: collision with root package name */
    public int f151v;

    /* renamed from: w, reason: collision with root package name */
    public byte[] f152w;

    /* renamed from: x, reason: collision with root package name */
    public a0 f153x;

    /* renamed from: y, reason: collision with root package name */
    public volatile HandlerC0004b f154y;

    public class a implements o.b {
        public a() {
        }
    }

    /* renamed from: a4.b$b, reason: collision with other inner class name */
    public class HandlerC0004b extends Handler {
        public HandlerC0004b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            Iterator it = b.this.f143m.iterator();
            while (it.hasNext()) {
                a4.a aVar = (a4.a) it.next();
                aVar.p();
                if (Arrays.equals(aVar.f122v, bArr)) {
                    if (message.what == 2 && aVar.f107e == 0 && aVar.f117p == 4) {
                        int i10 = e0.f15881a;
                        aVar.a(false);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static final class c extends Exception {
        public c(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    public class d implements h.b {

        /* renamed from: a, reason: collision with root package name */
        public final g.a f157a;

        /* renamed from: b, reason: collision with root package name */
        public a4.e f158b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f159c;

        public d(g.a aVar) {
            this.f157a = aVar;
        }

        @Override // a4.h.b
        public final void release() {
            Handler handler = b.this.f150u;
            handler.getClass();
            e0.M(handler, new b.m(this, 10));
        }
    }

    public class e implements a.InterfaceC0003a {

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f161a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        public a4.a f162b;

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Exception exc, boolean z10) {
            this.f162b = null;
            o7.t p10 = o7.t.p(this.f161a);
            this.f161a.clear();
            t.b listIterator = p10.listIterator(0);
            while (listIterator.hasNext()) {
                ((a4.a) listIterator.next()).c(z10 ? 1 : 3, exc);
            }
        }
    }

    public class f implements a.b {
        public f() {
        }
    }

    public b(UUID uuid, o.c cVar, w wVar, HashMap hashMap, boolean z10, int[] iArr, boolean z11, t5.u uVar, long j10) {
        uuid.getClass();
        x6.b.o("Use C.CLEARKEY_UUID instead", !v3.h.f15395b.equals(uuid));
        this.f133b = uuid;
        this.f134c = cVar;
        this.f135d = wVar;
        this.f136e = hashMap;
        this.f = z10;
        this.f137g = iArr;
        this.f138h = z11;
        this.f140j = uVar;
        this.f139i = new e();
        this.f141k = new f();
        this.f151v = 0;
        this.f143m = new ArrayList();
        this.f144n = Collections.newSetFromMap(new IdentityHashMap());
        this.f145o = Collections.newSetFromMap(new IdentityHashMap());
        this.f142l = j10;
    }

    public static boolean g(a4.a aVar) {
        aVar.p();
        if (aVar.f117p == 1) {
            if (e0.f15881a < 19) {
                return true;
            }
            e.a k10 = aVar.k();
            k10.getClass();
            if (k10.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList j(a4.d dVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(dVar.f170d);
        for (int i10 = 0; i10 < dVar.f170d; i10++) {
            d.b bVar = dVar.f167a[i10];
            if ((bVar.a(uuid) || (v3.h.f15396c.equals(uuid) && bVar.a(v3.h.f15395b))) && (bVar.f175e != null || z10)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    @Override // a4.h
    public final void a() {
        l(true);
        int i10 = this.f146p;
        this.f146p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f147q == null) {
            o b10 = this.f134c.b(this.f133b);
            this.f147q = b10;
            b10.g(new a());
        } else if (this.f142l != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f143m.size(); i11++) {
                ((a4.a) this.f143m.get(i11)).h(null);
            }
        }
    }

    @Override // a4.h
    public final h.b b(g.a aVar, i0 i0Var) {
        x6.b.H(this.f146p > 0);
        x6.b.K(this.t);
        d dVar = new d(aVar);
        Handler handler = this.f150u;
        handler.getClass();
        handler.post(new g.q(6, dVar, i0Var));
        return dVar;
    }

    @Override // a4.h
    public final void c(Looper looper, a0 a0Var) {
        synchronized (this) {
            Looper looper2 = this.t;
            if (looper2 == null) {
                this.t = looper;
                this.f150u = new Handler(looper);
            } else {
                x6.b.H(looper2 == looper);
                this.f150u.getClass();
            }
        }
        this.f153x = a0Var;
    }

    @Override // a4.h
    public final a4.e d(g.a aVar, i0 i0Var) {
        l(false);
        x6.b.H(this.f146p > 0);
        x6.b.K(this.t);
        return f(this.t, aVar, i0Var, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // a4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int e(v3.i0 r7) {
        /*
            r6 = this;
            r0 = 0
            r6.l(r0)
            a4.o r1 = r6.f147q
            r1.getClass()
            int r1 = r1.l()
            a4.d r2 = r7.f15459w
            if (r2 != 0) goto L2b
            java.lang.String r7 = r7.t
            int r7 = v5.p.i(r7)
            int[] r2 = r6.f137g
            r3 = r0
        L1a:
            int r4 = r2.length
            r5 = -1
            if (r3 >= r4) goto L26
            r4 = r2[r3]
            if (r4 != r7) goto L23
            goto L27
        L23:
            int r3 = r3 + 1
            goto L1a
        L26:
            r3 = r5
        L27:
            if (r3 == r5) goto L2a
            r0 = r1
        L2a:
            return r0
        L2b:
            byte[] r7 = r6.f152w
            r3 = 1
            if (r7 == 0) goto L31
            goto L8e
        L31:
            java.util.UUID r7 = r6.f133b
            java.util.ArrayList r7 = j(r2, r7, r3)
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L61
            int r7 = r2.f170d
            if (r7 != r3) goto L8f
            a4.d$b[] r7 = r2.f167a
            r7 = r7[r0]
            java.util.UUID r4 = v3.h.f15395b
            boolean r7 = r7.a(r4)
            if (r7 == 0) goto L8f
            java.lang.String r7 = "DrmInitData only contains common PSSH SchemeData. Assuming support for: "
            java.lang.StringBuilder r7 = defpackage.f.l(r7)
            java.util.UUID r4 = r6.f133b
            r7.append(r4)
            java.lang.String r7 = r7.toString()
            java.lang.String r4 = "DefaultDrmSessionMgr"
            v5.m.f(r4, r7)
        L61:
            java.lang.String r7 = r2.f169c
            if (r7 == 0) goto L8e
            java.lang.String r2 = "cenc"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L6e
            goto L8e
        L6e:
            java.lang.String r2 = "cbcs"
            boolean r2 = r2.equals(r7)
            if (r2 == 0) goto L7d
            int r7 = v5.e0.f15881a
            r2 = 25
            if (r7 < r2) goto L8f
            goto L8e
        L7d:
            java.lang.String r2 = "cbc1"
            boolean r2 = r2.equals(r7)
            if (r2 != 0) goto L8f
            java.lang.String r2 = "cens"
            boolean r7 = r2.equals(r7)
            if (r7 == 0) goto L8e
            goto L8f
        L8e:
            r0 = r3
        L8f:
            if (r0 == 0) goto L92
            goto L93
        L92:
            r1 = r3
        L93:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.b.e(v3.i0):int");
    }

    public final a4.e f(Looper looper, g.a aVar, i0 i0Var, boolean z10) {
        ArrayList arrayList;
        if (this.f154y == null) {
            this.f154y = new HandlerC0004b(looper);
        }
        a4.d dVar = i0Var.f15459w;
        a4.a aVar2 = null;
        int i10 = 0;
        if (dVar == null) {
            int i11 = v5.p.i(i0Var.t);
            o oVar = this.f147q;
            oVar.getClass();
            if (oVar.l() == 2 && p.f192d) {
                return null;
            }
            int[] iArr = this.f137g;
            while (true) {
                if (i10 >= iArr.length) {
                    i10 = -1;
                    break;
                }
                if (iArr[i10] == i11) {
                    break;
                }
                i10++;
            }
            if (i10 == -1 || oVar.l() == 1) {
                return null;
            }
            a4.a aVar3 = this.f148r;
            if (aVar3 == null) {
                t.b bVar = o7.t.f12050b;
                a4.a i12 = i(l0.f12009e, true, null, z10);
                this.f143m.add(i12);
                this.f148r = i12;
            } else {
                aVar3.h(null);
            }
            return this.f148r;
        }
        if (this.f152w == null) {
            arrayList = j(dVar, this.f133b, false);
            if (arrayList.isEmpty()) {
                c cVar = new c(this.f133b);
                v5.m.d("DefaultDrmSessionMgr", "DRM error", cVar);
                if (aVar != null) {
                    aVar.e(cVar);
                }
                return new n(new e.a(6003, cVar));
            }
        } else {
            arrayList = null;
        }
        if (this.f) {
            Iterator it = this.f143m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                a4.a aVar4 = (a4.a) it.next();
                if (e0.a(aVar4.f103a, arrayList)) {
                    aVar2 = aVar4;
                    break;
                }
            }
        } else {
            aVar2 = this.f149s;
        }
        if (aVar2 == null) {
            aVar2 = i(arrayList, false, aVar, z10);
            if (!this.f) {
                this.f149s = aVar2;
            }
            this.f143m.add(aVar2);
        } else {
            aVar2.h(aVar);
        }
        return aVar2;
    }

    public final a4.a h(List<d.b> list, boolean z10, g.a aVar) {
        this.f147q.getClass();
        boolean z11 = this.f138h | z10;
        UUID uuid = this.f133b;
        o oVar = this.f147q;
        e eVar = this.f139i;
        f fVar = this.f141k;
        int i10 = this.f151v;
        byte[] bArr = this.f152w;
        HashMap<String, String> hashMap = this.f136e;
        w wVar = this.f135d;
        Looper looper = this.t;
        looper.getClass();
        c0 c0Var = this.f140j;
        a0 a0Var = this.f153x;
        a0Var.getClass();
        a4.a aVar2 = new a4.a(uuid, oVar, eVar, fVar, list, i10, z11, z10, bArr, hashMap, wVar, looper, c0Var, a0Var);
        aVar2.h(aVar);
        if (this.f142l != -9223372036854775807L) {
            aVar2.h(null);
        }
        return aVar2;
    }

    public final a4.a i(List<d.b> list, boolean z10, g.a aVar, boolean z11) {
        a4.a h10 = h(list, z10, aVar);
        if (g(h10) && !this.f145o.isEmpty()) {
            Iterator it = o7.x.q(this.f145o).iterator();
            while (it.hasNext()) {
                ((a4.e) it.next()).f(null);
            }
            h10.f(aVar);
            if (this.f142l != -9223372036854775807L) {
                h10.f(null);
            }
            h10 = h(list, z10, aVar);
        }
        if (!g(h10) || !z11 || this.f144n.isEmpty()) {
            return h10;
        }
        Iterator it2 = o7.x.q(this.f144n).iterator();
        while (it2.hasNext()) {
            ((d) it2.next()).release();
        }
        if (!this.f145o.isEmpty()) {
            Iterator it3 = o7.x.q(this.f145o).iterator();
            while (it3.hasNext()) {
                ((a4.e) it3.next()).f(null);
            }
        }
        h10.f(aVar);
        if (this.f142l != -9223372036854775807L) {
            h10.f(null);
        }
        return h(list, z10, aVar);
    }

    public final void k() {
        if (this.f147q != null && this.f146p == 0 && this.f143m.isEmpty() && this.f144n.isEmpty()) {
            o oVar = this.f147q;
            oVar.getClass();
            oVar.release();
            this.f147q = null;
        }
    }

    public final void l(boolean z10) {
        if (z10 && this.t == null) {
            v5.m.g("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = this.t;
        looper.getClass();
        if (currentThread != looper.getThread()) {
            StringBuilder l10 = defpackage.f.l("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: ");
            l10.append(Thread.currentThread().getName());
            l10.append("\nExpected thread: ");
            l10.append(this.t.getThread().getName());
            v5.m.g("DefaultDrmSessionMgr", l10.toString(), new IllegalStateException());
        }
    }

    @Override // a4.h
    public final void release() {
        l(true);
        int i10 = this.f146p - 1;
        this.f146p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f142l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f143m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((a4.a) arrayList.get(i11)).f(null);
            }
        }
        Iterator it = o7.x.q(this.f144n).iterator();
        while (it.hasNext()) {
            ((d) it.next()).release();
        }
        k();
    }
}
