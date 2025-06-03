package l0;

import android.util.Base64;
import d0.AbstractC1170I;
import g0.AbstractC1297a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import l0.InterfaceC1537c;
import l0.x1;
import x0.InterfaceC2142x;

/* renamed from: l0.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1573u0 implements x1 {

    /* renamed from: i, reason: collision with root package name */
    public static final W2.s f16666i = new W2.s() { // from class: l0.t0
        @Override // W2.s
        public final Object get() {
            String m7;
            m7 = C1573u0.m();
            return m7;
        }
    };

    /* renamed from: j, reason: collision with root package name */
    public static final Random f16667j = new Random();

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC1170I.c f16668a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC1170I.b f16669b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f16670c;

    /* renamed from: d, reason: collision with root package name */
    public final W2.s f16671d;

    /* renamed from: e, reason: collision with root package name */
    public x1.a f16672e;

    /* renamed from: f, reason: collision with root package name */
    public AbstractC1170I f16673f;

    /* renamed from: g, reason: collision with root package name */
    public String f16674g;

    /* renamed from: h, reason: collision with root package name */
    public long f16675h;

    /* renamed from: l0.u0$a */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f16676a;

        /* renamed from: b, reason: collision with root package name */
        public int f16677b;

        /* renamed from: c, reason: collision with root package name */
        public long f16678c;

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC2142x.b f16679d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f16680e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f16681f;

        public a(String str, int i7, InterfaceC2142x.b bVar) {
            this.f16676a = str;
            this.f16677b = i7;
            this.f16678c = bVar == null ? -1L : bVar.f20851d;
            if (bVar == null || !bVar.b()) {
                return;
            }
            this.f16679d = bVar;
        }

        public boolean i(int i7, InterfaceC2142x.b bVar) {
            if (bVar == null) {
                return i7 == this.f16677b;
            }
            InterfaceC2142x.b bVar2 = this.f16679d;
            return bVar2 == null ? !bVar.b() && bVar.f20851d == this.f16678c : bVar.f20851d == bVar2.f20851d && bVar.f20849b == bVar2.f20849b && bVar.f20850c == bVar2.f20850c;
        }

        public boolean j(InterfaceC1537c.a aVar) {
            InterfaceC2142x.b bVar = aVar.f16567d;
            if (bVar == null) {
                return this.f16677b != aVar.f16566c;
            }
            long j7 = this.f16678c;
            if (j7 == -1) {
                return false;
            }
            if (bVar.f20851d > j7) {
                return true;
            }
            if (this.f16679d == null) {
                return false;
            }
            int b7 = aVar.f16565b.b(bVar.f20848a);
            int b8 = aVar.f16565b.b(this.f16679d.f20848a);
            InterfaceC2142x.b bVar2 = aVar.f16567d;
            if (bVar2.f20851d < this.f16679d.f20851d || b7 < b8) {
                return false;
            }
            if (b7 > b8) {
                return true;
            }
            boolean b9 = bVar2.b();
            InterfaceC2142x.b bVar3 = aVar.f16567d;
            if (!b9) {
                int i7 = bVar3.f20852e;
                return i7 == -1 || i7 > this.f16679d.f20849b;
            }
            int i8 = bVar3.f20849b;
            int i9 = bVar3.f20850c;
            InterfaceC2142x.b bVar4 = this.f16679d;
            int i10 = bVar4.f20849b;
            if (i8 <= i10) {
                return i8 == i10 && i9 > bVar4.f20850c;
            }
            return true;
        }

        public void k(int i7, InterfaceC2142x.b bVar) {
            if (this.f16678c != -1 || i7 != this.f16677b || bVar == null || bVar.f20851d < C1573u0.this.n()) {
                return;
            }
            this.f16678c = bVar.f20851d;
        }

        public final int l(AbstractC1170I abstractC1170I, AbstractC1170I abstractC1170I2, int i7) {
            if (i7 >= abstractC1170I.p()) {
                if (i7 < abstractC1170I2.p()) {
                    return i7;
                }
                return -1;
            }
            abstractC1170I.n(i7, C1573u0.this.f16668a);
            for (int i8 = C1573u0.this.f16668a.f12433n; i8 <= C1573u0.this.f16668a.f12434o; i8++) {
                int b7 = abstractC1170I2.b(abstractC1170I.m(i8));
                if (b7 != -1) {
                    return abstractC1170I2.f(b7, C1573u0.this.f16669b).f12399c;
                }
            }
            return -1;
        }

        public boolean m(AbstractC1170I abstractC1170I, AbstractC1170I abstractC1170I2) {
            int l7 = l(abstractC1170I, abstractC1170I2, this.f16677b);
            this.f16677b = l7;
            if (l7 == -1) {
                return false;
            }
            InterfaceC2142x.b bVar = this.f16679d;
            return bVar == null || abstractC1170I2.b(bVar.f20848a) != -1;
        }
    }

    public C1573u0() {
        this(f16666i);
    }

    public static String m() {
        byte[] bArr = new byte[12];
        f16667j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // l0.x1
    public void a(x1.a aVar) {
        this.f16672e = aVar;
    }

    @Override // l0.x1
    public synchronized String b(AbstractC1170I abstractC1170I, InterfaceC2142x.b bVar) {
        return o(abstractC1170I.h(bVar.f20848a, this.f16669b).f12399c, bVar).f16676a;
    }

    @Override // l0.x1
    public synchronized void c(InterfaceC1537c.a aVar) {
        try {
            AbstractC1297a.e(this.f16672e);
            AbstractC1170I abstractC1170I = this.f16673f;
            this.f16673f = aVar.f16565b;
            Iterator it = this.f16670c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2.m(abstractC1170I, this.f16673f) && !aVar2.j(aVar)) {
                }
                it.remove();
                if (aVar2.f16680e) {
                    if (aVar2.f16676a.equals(this.f16674g)) {
                        l(aVar2);
                    }
                    this.f16672e.f(aVar, aVar2.f16676a, false);
                }
            }
            p(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // l0.x1
    public synchronized String d() {
        return this.f16674g;
    }

    @Override // l0.x1
    public synchronized void e(InterfaceC1537c.a aVar, int i7) {
        try {
            AbstractC1297a.e(this.f16672e);
            boolean z7 = i7 == 0;
            Iterator it = this.f16670c.values().iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2.j(aVar)) {
                    it.remove();
                    if (aVar2.f16680e) {
                        boolean equals = aVar2.f16676a.equals(this.f16674g);
                        boolean z8 = z7 && equals && aVar2.f16681f;
                        if (equals) {
                            l(aVar2);
                        }
                        this.f16672e.f(aVar, aVar2.f16676a, z8);
                    }
                }
            }
            p(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00de A[Catch: all -> 0x0044, TryCatch #0 {, blocks: (B:4:0x0005, B:9:0x0014, B:11:0x0018, B:16:0x0024, B:18:0x0030, B:20:0x003a, B:24:0x0047, B:26:0x0053, B:27:0x0059, B:29:0x005e, B:31:0x0064, B:33:0x007d, B:34:0x00d8, B:36:0x00de, B:37:0x00f4, B:39:0x0100, B:41:0x0106), top: B:3:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f0  */
    @Override // l0.x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void f(l0.InterfaceC1537c.a r25) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.C1573u0.f(l0.c$a):void");
    }

    @Override // l0.x1
    public synchronized void g(InterfaceC1537c.a aVar) {
        x1.a aVar2;
        try {
            String str = this.f16674g;
            if (str != null) {
                l((a) AbstractC1297a.e((a) this.f16670c.get(str)));
            }
            Iterator it = this.f16670c.values().iterator();
            while (it.hasNext()) {
                a aVar3 = (a) it.next();
                it.remove();
                if (aVar3.f16680e && (aVar2 = this.f16672e) != null) {
                    aVar2.f(aVar, aVar3.f16676a, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void l(a aVar) {
        if (aVar.f16678c != -1) {
            this.f16675h = aVar.f16678c;
        }
        this.f16674g = null;
    }

    public final long n() {
        a aVar = (a) this.f16670c.get(this.f16674g);
        return (aVar == null || aVar.f16678c == -1) ? this.f16675h + 1 : aVar.f16678c;
    }

    public final a o(int i7, InterfaceC2142x.b bVar) {
        a aVar = null;
        long j7 = Long.MAX_VALUE;
        for (a aVar2 : this.f16670c.values()) {
            aVar2.k(i7, bVar);
            if (aVar2.i(i7, bVar)) {
                long j8 = aVar2.f16678c;
                if (j8 == -1 || j8 < j7) {
                    aVar = aVar2;
                    j7 = j8;
                } else if (j8 == j7 && ((a) g0.M.i(aVar)).f16679d != null && aVar2.f16679d != null) {
                    aVar = aVar2;
                }
            }
        }
        if (aVar != null) {
            return aVar;
        }
        String str = (String) this.f16671d.get();
        a aVar3 = new a(str, i7, bVar);
        this.f16670c.put(str, aVar3);
        return aVar3;
    }

    public final void p(InterfaceC1537c.a aVar) {
        if (aVar.f16565b.q()) {
            String str = this.f16674g;
            if (str != null) {
                l((a) AbstractC1297a.e((a) this.f16670c.get(str)));
                return;
            }
            return;
        }
        a aVar2 = (a) this.f16670c.get(this.f16674g);
        a o7 = o(aVar.f16566c, aVar.f16567d);
        this.f16674g = o7.f16676a;
        f(aVar);
        InterfaceC2142x.b bVar = aVar.f16567d;
        if (bVar == null || !bVar.b()) {
            return;
        }
        if (aVar2 != null && aVar2.f16678c == aVar.f16567d.f20851d && aVar2.f16679d != null && aVar2.f16679d.f20849b == aVar.f16567d.f20849b && aVar2.f16679d.f20850c == aVar.f16567d.f20850c) {
            return;
        }
        InterfaceC2142x.b bVar2 = aVar.f16567d;
        this.f16672e.U(aVar, o(aVar.f16566c, new InterfaceC2142x.b(bVar2.f20848a, bVar2.f20851d)).f16676a, o7.f16676a);
    }

    public C1573u0(W2.s sVar) {
        this.f16671d = sVar;
        this.f16668a = new AbstractC1170I.c();
        this.f16669b = new AbstractC1170I.b();
        this.f16670c = new HashMap();
        this.f16673f = AbstractC1170I.f12388a;
        this.f16675h = -1L;
    }
}
