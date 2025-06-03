package v3;

import android.util.Pair;
import v3.r1;

/* loaded from: classes.dex */
public abstract class a extends r1 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f15231e = 0;

    /* renamed from: b, reason: collision with root package name */
    public final int f15232b;

    /* renamed from: c, reason: collision with root package name */
    public final z4.e0 f15233c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15234d;

    public a(boolean z10, z4.e0 e0Var) {
        this.f15234d = z10;
        this.f15233c = e0Var;
        this.f15232b = e0Var.getLength();
    }

    @Override // v3.r1
    public final int a(boolean z10) {
        if (this.f15232b == 0) {
            return -1;
        }
        if (this.f15234d) {
            z10 = false;
        }
        int b10 = z10 ? this.f15233c.b() : 0;
        while (x(b10).p()) {
            b10 = w(b10, z10);
            if (b10 == -1) {
                return -1;
            }
        }
        return x(b10).a(z10) + v(b10);
    }

    @Override // v3.r1
    public final int b(Object obj) {
        int b10;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q10 = q(obj2);
        if (q10 == -1 || (b10 = x(q10).b(obj3)) == -1) {
            return -1;
        }
        return u(q10) + b10;
    }

    @Override // v3.r1
    public final int c(boolean z10) {
        int i10 = this.f15232b;
        if (i10 == 0) {
            return -1;
        }
        if (this.f15234d) {
            z10 = false;
        }
        int f = z10 ? this.f15233c.f() : i10 - 1;
        while (x(f).p()) {
            f = z10 ? this.f15233c.c(f) : f > 0 ? f - 1 : -1;
            if (f == -1) {
                return -1;
            }
        }
        return x(f).c(z10) + v(f);
    }

    @Override // v3.r1
    public final int e(int i10, int i11, boolean z10) {
        if (this.f15234d) {
            if (i11 == 1) {
                i11 = 2;
            }
            z10 = false;
        }
        int s10 = s(i10);
        int v10 = v(s10);
        int e10 = x(s10).e(i10 - v10, i11 != 2 ? i11 : 0, z10);
        if (e10 != -1) {
            return v10 + e10;
        }
        int w10 = w(s10, z10);
        while (w10 != -1 && x(w10).p()) {
            w10 = w(w10, z10);
        }
        if (w10 != -1) {
            return x(w10).a(z10) + v(w10);
        }
        if (i11 == 2) {
            return a(z10);
        }
        return -1;
    }

    @Override // v3.r1
    public final r1.b f(int i10, r1.b bVar, boolean z10) {
        int r10 = r(i10);
        int v10 = v(r10);
        x(r10).f(i10 - u(r10), bVar, z10);
        bVar.f15750c += v10;
        if (z10) {
            Object t = t(r10);
            Object obj = bVar.f15749b;
            obj.getClass();
            bVar.f15749b = Pair.create(t, obj);
        }
        return bVar;
    }

    @Override // v3.r1
    public final r1.b g(Object obj, r1.b bVar) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int q10 = q(obj2);
        int v10 = v(q10);
        x(q10).g(obj3, bVar);
        bVar.f15750c += v10;
        bVar.f15749b = obj;
        return bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0034, code lost:
    
        r6 = -1;
     */
    @Override // v3.r1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int k(int r6, int r7, boolean r8) {
        /*
            r5 = this;
            boolean r0 = r5.f15234d
            r1 = 0
            r2 = 2
            if (r0 == 0) goto Lb
            r8 = 1
            if (r7 != r8) goto La
            r7 = r2
        La:
            r8 = r1
        Lb:
            int r0 = r5.s(r6)
            int r3 = r5.v(r0)
            v3.r1 r4 = r5.x(r0)
            int r6 = r6 - r3
            if (r7 != r2) goto L1b
            goto L1c
        L1b:
            r1 = r7
        L1c:
            int r6 = r4.k(r6, r1, r8)
            r1 = -1
            if (r6 == r1) goto L25
            int r3 = r3 + r6
            return r3
        L25:
            if (r8 == 0) goto L2e
            z4.e0 r6 = r5.f15233c
            int r6 = r6.c(r0)
            goto L34
        L2e:
            if (r0 <= 0) goto L33
            int r6 = r0 + (-1)
            goto L34
        L33:
            r6 = r1
        L34:
            if (r6 == r1) goto L4e
            v3.r1 r0 = r5.x(r6)
            boolean r0 = r0.p()
            if (r0 == 0) goto L4e
            if (r8 == 0) goto L49
            z4.e0 r0 = r5.f15233c
            int r6 = r0.c(r6)
            goto L34
        L49:
            if (r6 <= 0) goto L33
            int r6 = r6 + (-1)
            goto L34
        L4e:
            if (r6 == r1) goto L5e
            int r7 = r5.v(r6)
            v3.r1 r6 = r5.x(r6)
            int r6 = r6.c(r8)
            int r6 = r6 + r7
            return r6
        L5e:
            if (r7 != r2) goto L65
            int r6 = r5.c(r8)
            return r6
        L65:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: v3.a.k(int, int, boolean):int");
    }

    @Override // v3.r1
    public final Object l(int i10) {
        int r10 = r(i10);
        return Pair.create(t(r10), x(r10).l(i10 - u(r10)));
    }

    @Override // v3.r1
    public final r1.c n(int i10, r1.c cVar, long j10) {
        int s10 = s(i10);
        int v10 = v(s10);
        int u10 = u(s10);
        x(s10).n(i10 - v10, cVar, j10);
        Object t = t(s10);
        if (!r1.c.f15754z.equals(cVar.f15755a)) {
            t = Pair.create(t, cVar.f15755a);
        }
        cVar.f15755a = t;
        cVar.f15767w += u10;
        cVar.f15768x += u10;
        return cVar;
    }

    public abstract int q(Object obj);

    public abstract int r(int i10);

    public abstract int s(int i10);

    public abstract Object t(int i10);

    public abstract int u(int i10);

    public abstract int v(int i10);

    public final int w(int i10, boolean z10) {
        if (z10) {
            return this.f15233c.d(i10);
        }
        if (i10 < this.f15232b - 1) {
            return i10 + 1;
        }
        return -1;
    }

    public abstract r1 x(int i10);
}
