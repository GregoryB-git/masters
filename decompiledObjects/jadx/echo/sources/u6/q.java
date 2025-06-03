package u6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import u.AbstractC1997b;

/* loaded from: classes.dex */
public class q {

    /* renamed from: o, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19997o = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_next");

    /* renamed from: p, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19998p = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_prev");

    /* renamed from: q, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19999q = AtomicReferenceFieldUpdater.newUpdater(q.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    public static abstract class a extends AbstractC2032b {

        /* renamed from: b, reason: collision with root package name */
        public final q f20000b;

        /* renamed from: c, reason: collision with root package name */
        public q f20001c;

        public a(q qVar) {
            this.f20000b = qVar;
        }

        @Override // u6.AbstractC2032b
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(q qVar, Object obj) {
            boolean z7 = obj == null;
            q qVar2 = z7 ? this.f20000b : this.f20001c;
            if (qVar2 != null && AbstractC1997b.a(q.f19997o, qVar, this, qVar2) && z7) {
                q qVar3 = this.f20000b;
                q qVar4 = this.f20001c;
                Intrinsics.b(qVar4);
                qVar3.m(qVar4);
            }
        }
    }

    public final boolean j(q qVar) {
        f19998p.lazySet(qVar, this);
        f19997o.lazySet(qVar, this);
        while (n() == this) {
            if (AbstractC1997b.a(f19997o, this, this, qVar)) {
                qVar.m(this);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if (u.AbstractC1997b.a(r4, r3, r2, ((u6.z) r5).f20017a) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final u6.q k(u6.y r9) {
        /*
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = u6.q.f19998p
            java.lang.Object r0 = r0.get(r8)
            u6.q r0 = (u6.q) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = u6.q.f19997o
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L20
            if (r0 != r2) goto L16
            return r2
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = u6.q.f19998p
            boolean r0 = u.AbstractC1997b.a(r1, r8, r0, r2)
            if (r0 != 0) goto L1f
            goto L0
        L1f:
            return r2
        L20:
            boolean r6 = r8.q()
            if (r6 == 0) goto L27
            return r1
        L27:
            if (r5 != r9) goto L2a
            return r2
        L2a:
            boolean r6 = r5 instanceof u6.y
            if (r6 == 0) goto L34
            u6.y r5 = (u6.y) r5
            r5.a(r2)
            goto L0
        L34:
            boolean r6 = r5 instanceof u6.z
            if (r6 == 0) goto L50
            if (r3 == 0) goto L47
            u6.z r5 = (u6.z) r5
            u6.q r5 = r5.f20017a
            boolean r2 = u.AbstractC1997b.a(r4, r3, r2, r5)
            if (r2 != 0) goto L45
            goto L0
        L45:
            r2 = r3
            goto La
        L47:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = u6.q.f19998p
            java.lang.Object r2 = r4.get(r2)
            u6.q r2 = (u6.q) r2
            goto Lb
        L50:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.Intrinsics.c(r5, r3)
            r3 = r5
            u6.q r3 = (u6.q) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.q.k(u6.y):u6.q");
    }

    public final q l(q qVar) {
        while (qVar.q()) {
            qVar = (q) f19998p.get(qVar);
        }
        return qVar;
    }

    public final void m(q qVar) {
        q qVar2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19998p;
        do {
            qVar2 = (q) atomicReferenceFieldUpdater.get(qVar);
            if (n() != qVar) {
                return;
            }
        } while (!AbstractC1997b.a(f19998p, qVar, qVar2, this));
        if (q()) {
            qVar.k(null);
        }
    }

    public final Object n() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19997o;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof y)) {
                return obj;
            }
            ((y) obj).a(this);
        }
    }

    public final q o() {
        return p.b(n());
    }

    public final q p() {
        q k7 = k(null);
        return k7 == null ? l((q) f19998p.get(this)) : k7;
    }

    public boolean q() {
        return n() instanceof z;
    }

    public boolean r() {
        return s() == null;
    }

    public final q s() {
        Object n7;
        q qVar;
        do {
            n7 = n();
            if (n7 instanceof z) {
                return ((z) n7).f20017a;
            }
            if (n7 == this) {
                return (q) n7;
            }
            Intrinsics.c(n7, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            qVar = (q) n7;
        } while (!AbstractC1997b.a(f19997o, this, n7, qVar.t()));
        qVar.k(null);
        return null;
    }

    public final z t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19999q;
        z zVar = (z) atomicReferenceFieldUpdater.get(this);
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(this);
        atomicReferenceFieldUpdater.lazySet(this, zVar2);
        return zVar2;
    }

    public String toString() {
        return new kotlin.jvm.internal.o(this) { // from class: u6.q.b
            @Override // m6.f
            public Object get() {
                return p6.M.a(this.receiver);
            }
        } + '@' + p6.M.b(this);
    }

    public final int u(q qVar, q qVar2, a aVar) {
        f19998p.lazySet(qVar, this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19997o;
        atomicReferenceFieldUpdater.lazySet(qVar, qVar2);
        aVar.f20001c = qVar2;
        if (AbstractC1997b.a(atomicReferenceFieldUpdater, this, qVar2, aVar)) {
            return aVar.a(this) == null ? 1 : 2;
        }
        return 0;
    }
}
