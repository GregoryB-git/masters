package r6;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import u6.C;

/* loaded from: classes.dex */
public final class i extends C {

    /* renamed from: s, reason: collision with root package name */
    public final b f19130s;

    /* renamed from: t, reason: collision with root package name */
    public final AtomicReferenceArray f19131t;

    public i(long j7, i iVar, b bVar, int i7) {
        super(j7, iVar, i7);
        this.f19130s = bVar;
        this.f19131t = new AtomicReferenceArray(c.f19105b * 2);
    }

    public final void A(int i7, Object obj) {
        this.f19131t.set((i7 * 2) + 1, obj);
    }

    public final void B(int i7, Object obj) {
        z(i7, obj);
    }

    @Override // u6.C
    public int n() {
        return c.f19105b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0063, code lost:
    
        s(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0066, code lost:
    
        if (r0 == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0068, code lost:
    
        r4 = u().f19096c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x006e, code lost:
    
        if (r4 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0070, code lost:
    
        u6.x.b(r4, r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0073, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // u6.C
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void o(int r4, java.lang.Throwable r5, X5.g r6) {
        /*
            r3 = this;
            int r5 = r6.c.f19105b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.v(r4)
        Le:
            java.lang.Object r1 = r3.w(r4)
            boolean r2 = r1 instanceof p6.P0
            if (r2 != 0) goto L74
            boolean r2 = r1 instanceof r6.o
            if (r2 == 0) goto L1b
            goto L74
        L1b:
            u6.F r2 = r6.c.j()
            if (r1 == r2) goto L63
            u6.F r2 = r6.c.i()
            if (r1 != r2) goto L28
            goto L63
        L28:
            u6.F r2 = r6.c.p()
            if (r1 == r2) goto Le
            u6.F r2 = r6.c.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            u6.F r4 = r6.c.f()
            if (r1 == r4) goto L62
            u6.F r4 = r6.c.f19107d
            if (r1 != r4) goto L40
            goto L62
        L40:
            u6.F r4 = r6.c.z()
            if (r1 != r4) goto L47
            return
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            return
        L63:
            r3.s(r4)
            if (r0 == 0) goto L73
            r6.b r4 = r3.u()
            g6.l r4 = r4.f19096c
            if (r4 == 0) goto L73
            u6.x.b(r4, r5, r6)
        L73:
            return
        L74:
            if (r0 == 0) goto L7b
            u6.F r2 = r6.c.j()
            goto L7f
        L7b:
            u6.F r2 = r6.c.i()
        L7f:
            boolean r1 = r3.r(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.s(r4)
            r1 = r0 ^ 1
            r3.x(r4, r1)
            if (r0 == 0) goto L9a
            r6.b r4 = r3.u()
            g6.l r4 = r4.f19096c
            if (r4 == 0) goto L9a
            u6.x.b(r4, r5, r6)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: r6.i.o(int, java.lang.Throwable, X5.g):void");
    }

    public final boolean r(int i7, Object obj, Object obj2) {
        return h.a(this.f19131t, (i7 * 2) + 1, obj, obj2);
    }

    public final void s(int i7) {
        z(i7, null);
    }

    public final Object t(int i7, Object obj) {
        return this.f19131t.getAndSet((i7 * 2) + 1, obj);
    }

    public final b u() {
        b bVar = this.f19130s;
        Intrinsics.b(bVar);
        return bVar;
    }

    public final Object v(int i7) {
        return this.f19131t.get(i7 * 2);
    }

    public final Object w(int i7) {
        return this.f19131t.get((i7 * 2) + 1);
    }

    public final void x(int i7, boolean z7) {
        if (z7) {
            u().x0((this.f19955q * c.f19105b) + i7);
        }
        p();
    }

    public final Object y(int i7) {
        Object v7 = v(i7);
        s(i7);
        return v7;
    }

    public final void z(int i7, Object obj) {
        this.f19131t.lazySet(i7 * 2, obj);
    }
}
