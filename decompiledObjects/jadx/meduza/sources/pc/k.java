package pc;

import d2.h0;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes.dex */
public final class k<E> extends sc.t<k<E>> {

    /* renamed from: e, reason: collision with root package name */
    public final b<E> f13166e;
    public final AtomicReferenceArray f;

    public k(long j10, k<E> kVar, b<E> bVar, int i10) {
        super(j10, kVar, i10);
        this.f13166e = bVar;
        this.f = new AtomicReferenceArray(e.f13142b * 2);
    }

    @Override // sc.t
    public final int f() {
        return e.f13142b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x005c, code lost:
    
        n(r6, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005f, code lost:
    
        if (r1 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0061, code lost:
    
        r6 = r5.f13166e;
        ec.i.b(r6);
        r6 = r6.f13126b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0068, code lost:
    
        if (r6 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x006a, code lost:
    
        p2.m0.j(r6, r0, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x006d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // sc.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(int r6, ub.h r7) {
        /*
            r5 = this;
            int r0 = pc.e.f13142b
            if (r6 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r6 = r6 - r0
        La:
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r5.f
            int r2 = r6 * 2
            java.lang.Object r0 = r0.get(r2)
        L12:
            java.lang.Object r2 = r5.k(r6)
            boolean r3 = r2 instanceof nc.i2
            r4 = 0
            if (r3 != 0) goto L6e
            boolean r3 = r2 instanceof pc.u
            if (r3 == 0) goto L20
            goto L6e
        L20:
            d2.h0 r3 = pc.e.f13149j
            if (r2 == r3) goto L5c
            d2.h0 r3 = pc.e.f13150k
            if (r2 != r3) goto L29
            goto L5c
        L29:
            d2.h0 r3 = pc.e.f13146g
            if (r2 == r3) goto L12
            d2.h0 r3 = pc.e.f
            if (r2 != r3) goto L32
            goto L12
        L32:
            d2.h0 r6 = pc.e.f13148i
            if (r2 == r6) goto L5b
            d2.h0 r6 = pc.e.f13144d
            if (r2 != r6) goto L3b
            goto L5b
        L3b:
            d2.h0 r6 = pc.e.f13151l
            if (r2 != r6) goto L40
            return
        L40:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "unexpected state: "
            r7.append(r0)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            java.lang.String r7 = r7.toString()
            r6.<init>(r7)
            throw r6
        L5b:
            return
        L5c:
            r5.n(r6, r4)
            if (r1 == 0) goto L6d
            pc.b<E> r6 = r5.f13166e
            ec.i.b(r6)
            dc.l<E, rb.h> r6 = r6.f13126b
            if (r6 == 0) goto L6d
            p2.m0.j(r6, r0, r7)
        L6d:
            return
        L6e:
            if (r1 == 0) goto L73
            d2.h0 r3 = pc.e.f13149j
            goto L75
        L73:
            d2.h0 r3 = pc.e.f13150k
        L75:
            boolean r2 = r5.j(r6, r2, r3)
            if (r2 == 0) goto L12
            r5.n(r6, r4)
            r2 = r1 ^ 1
            r5.l(r6, r2)
            if (r1 == 0) goto L91
            pc.b<E> r6 = r5.f13166e
            ec.i.b(r6)
            dc.l<E, rb.h> r6 = r6.f13126b
            if (r6 == 0) goto L91
            p2.m0.j(r6, r0, r7)
        L91:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pc.k.g(int, ub.h):void");
    }

    public final boolean j(int i10, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray = this.f;
        int i11 = (i10 * 2) + 1;
        while (!atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
            if (atomicReferenceArray.get(i11) != obj) {
                return false;
            }
        }
        return true;
    }

    public final Object k(int i10) {
        return this.f.get((i10 * 2) + 1);
    }

    public final void l(int i10, boolean z10) {
        if (z10) {
            b<E> bVar = this.f13166e;
            ec.i.b(bVar);
            bVar.K((this.f14367c * e.f13142b) + i10);
        }
        h();
    }

    public final E m(int i10) {
        E e10 = (E) this.f.get(i10 * 2);
        n(i10, null);
        return e10;
    }

    public final void n(int i10, Object obj) {
        this.f.lazySet(i10 * 2, obj);
    }

    public final void o(int i10, h0 h0Var) {
        this.f.set((i10 * 2) + 1, h0Var);
    }
}
