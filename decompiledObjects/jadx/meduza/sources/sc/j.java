package sc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nc.g0;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14347a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_next");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14348b = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_prev");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f14349c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    public static abstract class a extends sc.a<j> {

        /* renamed from: b, reason: collision with root package name */
        public final j f14350b;

        /* renamed from: c, reason: collision with root package name */
        public j f14351c;

        public a(j jVar) {
            this.f14350b = jVar;
        }

        @Override // sc.a
        public final void b(j jVar, Object obj) {
            j jVar2 = jVar;
            boolean z10 = true;
            boolean z11 = obj == null;
            j jVar3 = z11 ? this.f14350b : this.f14351c;
            if (jVar3 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = j.f14347a;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(jVar2, this, jVar3)) {
                        break;
                    } else if (atomicReferenceFieldUpdater.get(jVar2) != this) {
                        z10 = false;
                        break;
                    }
                }
                if (z10 && z11) {
                    j jVar4 = this.f14350b;
                    j jVar5 = this.f14351c;
                    ec.i.b(jVar5);
                    jVar4.e(jVar5);
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0046, code lost:
    
        r5 = ((sc.q) r5).f14364a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
    
        if (r4.compareAndSet(r3, r2, r5) == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
    
        if (r4.get(r3) == r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
    
        if (r6 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final sc.j c() {
        /*
            r10 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = sc.j.f14348b
            java.lang.Object r0 = r0.get(r10)
            sc.j r0 = (sc.j) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = sc.j.f14347a
            java.lang.Object r5 = r4.get(r2)
            r6 = 0
            r7 = 1
            if (r5 != r10) goto L2c
            if (r0 != r2) goto L18
            return r2
        L18:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = sc.j.f14348b
        L1a:
            boolean r1 = r8.compareAndSet(r10, r0, r2)
            if (r1 == 0) goto L22
            r6 = r7
            goto L28
        L22:
            java.lang.Object r1 = r8.get(r10)
            if (r1 == r0) goto L1a
        L28:
            if (r6 != 0) goto L2b
            goto L0
        L2b:
            return r2
        L2c:
            boolean r8 = r10.k()
            if (r8 == 0) goto L33
            return r1
        L33:
            if (r5 != 0) goto L36
            return r2
        L36:
            boolean r8 = r5 instanceof sc.p
            if (r8 == 0) goto L40
            sc.p r5 = (sc.p) r5
            r5.a(r2)
            goto L0
        L40:
            boolean r8 = r5 instanceof sc.q
            if (r8 == 0) goto L66
            if (r3 == 0) goto L5d
            sc.q r5 = (sc.q) r5
            sc.j r5 = r5.f14364a
        L4a:
            boolean r8 = r4.compareAndSet(r3, r2, r5)
            if (r8 == 0) goto L52
            r6 = r7
            goto L58
        L52:
            java.lang.Object r8 = r4.get(r3)
            if (r8 == r2) goto L4a
        L58:
            if (r6 != 0) goto L5b
            goto L0
        L5b:
            r2 = r3
            goto La
        L5d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = sc.j.f14348b
            java.lang.Object r2 = r4.get(r2)
            sc.j r2 = (sc.j) r2
            goto Lb
        L66:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            ec.i.c(r5, r3)
            r3 = r5
            sc.j r3 = (sc.j) r3
            r9 = r3
            r3 = r2
            r2 = r9
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: sc.j.c():sc.j");
    }

    public final void e(j jVar) {
        boolean z10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14348b;
        do {
            j jVar2 = (j) atomicReferenceFieldUpdater.get(jVar);
            if (h() != jVar) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f14348b;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(jVar, jVar2, this)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater2.get(jVar) != jVar2) {
                    z10 = false;
                    break;
                }
            }
        } while (!z10);
        if (k()) {
            jVar.c();
        }
    }

    public final Object h() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14347a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).a(this);
        }
    }

    public final j i() {
        j jVar;
        Object h10 = h();
        q qVar = h10 instanceof q ? (q) h10 : null;
        if (qVar != null && (jVar = qVar.f14364a) != null) {
            return jVar;
        }
        ec.i.c(h10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (j) h10;
    }

    public final j j() {
        j c10 = c();
        if (c10 == null) {
            Object obj = f14348b.get(this);
            while (true) {
                c10 = (j) obj;
                if (!c10.k()) {
                    break;
                }
                obj = f14348b.get(c10);
            }
        }
        return c10;
    }

    public boolean k() {
        return h() instanceof q;
    }

    public String toString() {
        return new ec.l(this) { // from class: sc.j.b
        } + '@' + g0.b(this);
    }
}
