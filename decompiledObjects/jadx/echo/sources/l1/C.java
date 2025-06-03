package l1;

import F0.AbstractC0372q;
import F0.AbstractC0377w;
import F0.InterfaceC0373s;
import F0.InterfaceC0374t;
import F0.InterfaceC0378x;
import F0.M;
import android.net.Uri;
import android.util.SparseArray;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class C implements F0.r {

    /* renamed from: l, reason: collision with root package name */
    public static final InterfaceC0378x f16741l = new InterfaceC0378x() { // from class: l1.B
        @Override // F0.InterfaceC0378x
        public final F0.r[] a() {
            F0.r[] f7;
            f7 = C.f();
            return f7;
        }

        @Override // F0.InterfaceC0378x
        public /* synthetic */ F0.r[] b(Uri uri, Map map) {
            return AbstractC0377w.a(this, uri, map);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final g0.E f16742a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f16743b;

    /* renamed from: c, reason: collision with root package name */
    public final g0.z f16744c;

    /* renamed from: d, reason: collision with root package name */
    public final C1584A f16745d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f16746e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16747f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16748g;

    /* renamed from: h, reason: collision with root package name */
    public long f16749h;

    /* renamed from: i, reason: collision with root package name */
    public z f16750i;

    /* renamed from: j, reason: collision with root package name */
    public InterfaceC0374t f16751j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16752k;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC1597m f16753a;

        /* renamed from: b, reason: collision with root package name */
        public final g0.E f16754b;

        /* renamed from: c, reason: collision with root package name */
        public final g0.y f16755c = new g0.y(new byte[64]);

        /* renamed from: d, reason: collision with root package name */
        public boolean f16756d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f16757e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f16758f;

        /* renamed from: g, reason: collision with root package name */
        public int f16759g;

        /* renamed from: h, reason: collision with root package name */
        public long f16760h;

        public a(InterfaceC1597m interfaceC1597m, g0.E e7) {
            this.f16753a = interfaceC1597m;
            this.f16754b = e7;
        }

        public void a(g0.z zVar) {
            zVar.l(this.f16755c.f14341a, 0, 3);
            this.f16755c.p(0);
            b();
            zVar.l(this.f16755c.f14341a, 0, this.f16759g);
            this.f16755c.p(0);
            c();
            this.f16753a.d(this.f16760h, 4);
            this.f16753a.a(zVar);
            this.f16753a.c(false);
        }

        public final void b() {
            this.f16755c.r(8);
            this.f16756d = this.f16755c.g();
            this.f16757e = this.f16755c.g();
            this.f16755c.r(6);
            this.f16759g = this.f16755c.h(8);
        }

        public final void c() {
            this.f16760h = 0L;
            if (this.f16756d) {
                this.f16755c.r(4);
                this.f16755c.r(1);
                this.f16755c.r(1);
                long h7 = (this.f16755c.h(3) << 30) | (this.f16755c.h(15) << 15) | this.f16755c.h(15);
                this.f16755c.r(1);
                if (!this.f16758f && this.f16757e) {
                    this.f16755c.r(4);
                    this.f16755c.r(1);
                    this.f16755c.r(1);
                    this.f16755c.r(1);
                    this.f16754b.b((this.f16755c.h(3) << 30) | (this.f16755c.h(15) << 15) | this.f16755c.h(15));
                    this.f16758f = true;
                }
                this.f16760h = this.f16754b.b(h7);
            }
        }

        public void d() {
            this.f16758f = false;
            this.f16753a.b();
        }
    }

    public C() {
        this(new g0.E(0L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ F0.r[] f() {
        return new F0.r[]{new C()};
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r2 != r7) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
    
        r4.f16742a.i(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x002a, code lost:
    
        if (r5 != false) goto L15;
     */
    @Override // F0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(long r5, long r7) {
        /*
            r4 = this;
            g0.E r5 = r4.f16742a
            long r5 = r5.f()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r6 = 0
            if (r5 != 0) goto L12
            r5 = 1
            goto L13
        L12:
            r5 = r6
        L13:
            if (r5 != 0) goto L2a
            g0.E r5 = r4.f16742a
            long r2 = r5.d()
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            r0 = 0
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 == 0) goto L31
            goto L2c
        L2a:
            if (r5 == 0) goto L31
        L2c:
            g0.E r5 = r4.f16742a
            r5.i(r7)
        L31:
            l1.z r5 = r4.f16750i
            if (r5 == 0) goto L38
            r5.h(r7)
        L38:
            android.util.SparseArray r5 = r4.f16743b
            int r5 = r5.size()
            if (r6 >= r5) goto L4e
            android.util.SparseArray r5 = r4.f16743b
            java.lang.Object r5 = r5.valueAt(r6)
            l1.C$a r5 = (l1.C.a) r5
            r5.d()
            int r6 = r6 + 1
            goto L38
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.C.a(long, long):void");
    }

    @Override // F0.r
    public void b(InterfaceC0374t interfaceC0374t) {
        this.f16751j = interfaceC0374t;
    }

    @Override // F0.r
    public /* synthetic */ F0.r d() {
        return AbstractC0372q.b(this);
    }

    @Override // F0.r
    public boolean e(InterfaceC0373s interfaceC0373s) {
        byte[] bArr = new byte[14];
        interfaceC0373s.n(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        interfaceC0373s.o(bArr[13] & 7);
        interfaceC0373s.n(bArr, 0, 3);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }

    @Override // F0.r
    public /* synthetic */ List g() {
        return AbstractC0372q.a(this);
    }

    public final void h(long j7) {
        InterfaceC0374t interfaceC0374t;
        F0.M bVar;
        if (this.f16752k) {
            return;
        }
        this.f16752k = true;
        if (this.f16745d.c() != -9223372036854775807L) {
            z zVar = new z(this.f16745d.d(), this.f16745d.c(), j7);
            this.f16750i = zVar;
            interfaceC0374t = this.f16751j;
            bVar = zVar.b();
        } else {
            interfaceC0374t = this.f16751j;
            bVar = new M.b(this.f16745d.c());
        }
        interfaceC0374t.e(bVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00f3  */
    @Override // F0.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int i(F0.InterfaceC0373s r11, F0.L r12) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.C.i(F0.s, F0.L):int");
    }

    public C(g0.E e7) {
        this.f16742a = e7;
        this.f16744c = new g0.z(4096);
        this.f16743b = new SparseArray();
        this.f16745d = new C1584A();
    }

    @Override // F0.r
    public void release() {
    }
}
