package nc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nc.j1;
import sc.j;
import ub.h;

/* loaded from: classes.dex */
public class o1 implements j1, q, w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f11522a = AtomicReferenceFieldUpdater.newUpdater(o1.class, Object.class, "_state");

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f11523b = AtomicReferenceFieldUpdater.newUpdater(o1.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public static final class a<T> extends l<T> {

        /* renamed from: q, reason: collision with root package name */
        public final o1 f11524q;

        public a(ub.e<? super T> eVar, o1 o1Var) {
            super(1, eVar);
            this.f11524q = o1Var;
        }

        @Override // nc.l
        public final Throwable r(o1 o1Var) {
            Throwable c10;
            Object F = this.f11524q.F();
            return (!(F instanceof c) || (c10 = ((c) F).c()) == null) ? F instanceof u ? ((u) F).f11555a : o1Var.getCancellationException() : c10;
        }

        @Override // nc.l
        public final String z() {
            return "AwaitContinuation";
        }
    }

    public static final class b extends n1 {

        /* renamed from: e, reason: collision with root package name */
        public final o1 f11525e;
        public final c f;

        /* renamed from: o, reason: collision with root package name */
        public final p f11526o;

        /* renamed from: p, reason: collision with root package name */
        public final Object f11527p;

        public b(o1 o1Var, c cVar, p pVar, Object obj) {
            this.f11525e = o1Var;
            this.f = cVar;
            this.f11526o = pVar;
            this.f11527p = obj;
        }

        @Override // dc.l
        public final /* bridge */ /* synthetic */ rb.h invoke(Throwable th) {
            l(th);
            return rb.h.f13851a;
        }

        @Override // nc.w
        public final void l(Throwable th) {
            o1 o1Var = this.f11525e;
            c cVar = this.f;
            p pVar = this.f11526o;
            Object obj = this.f11527p;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o1.f11522a;
            o1Var.getClass();
            p O = o1.O(pVar);
            if (O == null || !o1Var.Y(cVar, O, obj)) {
                o1Var.p(o1Var.y(cVar, obj));
            }
        }
    }

    public static final class c implements f1 {

        /* renamed from: b, reason: collision with root package name */
        public static final AtomicIntegerFieldUpdater f11528b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting");

        /* renamed from: c, reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f11529c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause");

        /* renamed from: d, reason: collision with root package name */
        public static final AtomicReferenceFieldUpdater f11530d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder");
        private volatile Object _exceptionsHolder;
        private volatile int _isCompleting = 0;
        private volatile Object _rootCause;

        /* renamed from: a, reason: collision with root package name */
        public final t1 f11531a;

        public c(t1 t1Var, Throwable th) {
            this.f11531a = t1Var;
            this._rootCause = th;
        }

        public final void a(Throwable th) {
            Throwable c10 = c();
            if (c10 == null) {
                f11529c.set(this, th);
                return;
            }
            if (th == c10) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11530d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
                return;
            }
            if (obj instanceof Throwable) {
                if (th == obj) {
                    return;
                }
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(th);
                atomicReferenceFieldUpdater.set(this, arrayList);
                return;
            }
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            }
            throw new IllegalStateException(("State is " + obj).toString());
        }

        @Override // nc.f1
        public final t1 b() {
            return this.f11531a;
        }

        public final Throwable c() {
            return (Throwable) f11529c.get(this);
        }

        public final boolean d() {
            return c() != null;
        }

        public final boolean e() {
            return f11528b.get(this) != 0;
        }

        public final ArrayList f(Throwable th) {
            ArrayList arrayList;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11530d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
                arrayList = (ArrayList) obj;
            }
            Throwable c10 = c();
            if (c10 != null) {
                arrayList.add(0, c10);
            }
            if (th != null && !ec.i.a(th, c10)) {
                arrayList.add(th);
            }
            atomicReferenceFieldUpdater.set(this, p2.m0.f12902x);
            return arrayList;
        }

        @Override // nc.f1
        public final boolean isActive() {
            return c() == null;
        }

        public final String toString() {
            StringBuilder l10 = defpackage.f.l("Finishing[cancelling=");
            l10.append(d());
            l10.append(", completing=");
            l10.append(e());
            l10.append(", rootCause=");
            l10.append(c());
            l10.append(", exceptions=");
            l10.append(f11530d.get(this));
            l10.append(", list=");
            l10.append(this.f11531a);
            l10.append(']');
            return l10.toString();
        }
    }

    public final class d extends n1 {

        /* renamed from: e, reason: collision with root package name */
        public final uc.f<?> f11532e;

        public d(uc.f<?> fVar) {
            this.f11532e = fVar;
        }

        @Override // dc.l
        public final /* bridge */ /* synthetic */ rb.h invoke(Throwable th) {
            l(th);
            return rb.h.f13851a;
        }

        @Override // nc.w
        public final void l(Throwable th) {
            Object F = o1.this.F();
            if (!(F instanceof u)) {
                F = p2.m0.f0(F);
            }
            this.f11532e.e(o1.this, F);
        }
    }

    public final class e extends n1 {

        /* renamed from: e, reason: collision with root package name */
        public final uc.f<?> f11533e;

        public e(uc.f<?> fVar) {
            this.f11533e = fVar;
        }

        @Override // dc.l
        public final /* bridge */ /* synthetic */ rb.h invoke(Throwable th) {
            l(th);
            return rb.h.f13851a;
        }

        @Override // nc.w
        public final void l(Throwable th) {
            this.f11533e.e(o1.this, rb.h.f13851a);
        }
    }

    public static final class f extends j.a {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o1 f11534d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f11535e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(sc.j jVar, o1 o1Var, Object obj) {
            super(jVar);
            this.f11534d = o1Var;
            this.f11535e = obj;
        }

        @Override // sc.a
        public final d2.h0 c(Object obj) {
            if (this.f11534d.F() == this.f11535e) {
                return null;
            }
            return p2.m0.D;
        }
    }

    @wb.e(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {956, 958}, m = "invokeSuspend")
    public static final class g extends wb.h implements dc.p<kc.d<? super j1>, ub.e<? super rb.h>, Object> {

        /* renamed from: b, reason: collision with root package name */
        public sc.i f11536b;

        /* renamed from: c, reason: collision with root package name */
        public sc.j f11537c;

        /* renamed from: d, reason: collision with root package name */
        public int f11538d;

        /* renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f11539e;
        public final /* synthetic */ o1 f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ub.e eVar, o1 o1Var) {
            super(eVar);
            this.f = o1Var;
        }

        @Override // wb.a
        public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
            g gVar = new g(eVar, this.f);
            gVar.f11539e = obj;
            return gVar;
        }

        @Override // dc.p
        public final Object invoke(kc.d<? super j1> dVar, ub.e<? super rb.h> eVar) {
            return ((g) create(dVar, eVar)).invokeSuspend(rb.h.f13851a);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0062  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0064 -> B:6:0x007b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0078 -> B:6:0x007b). Please report as a decompilation issue!!! */
        @Override // wb.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                vb.a r0 = vb.a.f16085a
                int r1 = r7.f11538d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L25
                if (r1 == r3) goto L21
                if (r1 != r2) goto L19
                sc.j r1 = r7.f11537c
                sc.i r3 = r7.f11536b
                java.lang.Object r4 = r7.f11539e
                kc.d r4 = (kc.d) r4
                rb.f.b(r8)
                r8 = r7
                goto L7b
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                rb.f.b(r8)
                goto L80
            L25:
                rb.f.b(r8)
                java.lang.Object r8 = r7.f11539e
                kc.d r8 = (kc.d) r8
                nc.o1 r1 = r7.f
                java.lang.Object r1 = r1.F()
                boolean r4 = r1 instanceof nc.p
                if (r4 == 0) goto L40
                nc.p r1 = (nc.p) r1
                nc.q r1 = r1.f11541e
                r7.f11538d = r3
                r8.a(r1, r7)
                return r0
            L40:
                boolean r3 = r1 instanceof nc.f1
                if (r3 == 0) goto L80
                nc.f1 r1 = (nc.f1) r1
                nc.t1 r1 = r1.b()
                if (r1 == 0) goto L80
                java.lang.Object r3 = r1.h()
                java.lang.String r4 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
                ec.i.c(r3, r4)
                sc.j r3 = (sc.j) r3
                r4 = r8
                r8 = r7
                r6 = r3
                r3 = r1
                r1 = r6
            L5c:
                boolean r5 = ec.i.a(r1, r3)
                if (r5 != 0) goto L80
                boolean r5 = r1 instanceof nc.p
                if (r5 == 0) goto L7b
                r5 = r1
                nc.p r5 = (nc.p) r5
                nc.q r5 = r5.f11541e
                r8.f11539e = r4
                r8.f11536b = r3
                r8.f11537c = r1
                r8.f11538d = r2
                r4.a(r5, r8)
                vb.a r5 = vb.a.f16085a
                if (r5 != r0) goto L7b
                return r0
            L7b:
                sc.j r1 = r1.i()
                goto L5c
            L80:
                rb.h r8 = rb.h.f13851a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: nc.o1.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ class h extends ec.h implements dc.q<o1, uc.f<?>, Object, rb.h> {

        /* renamed from: a, reason: collision with root package name */
        public static final h f11540a = new h();

        public h() {
            super(3, o1.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // dc.q
        public final Object f(qc.f fVar, Object obj, Object obj2) {
            boolean z10;
            o1 o1Var = (o1) fVar;
            uc.f fVar2 = (uc.f) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = o1.f11522a;
            while (true) {
                Object F = o1Var.F();
                if (!(F instanceof f1)) {
                    z10 = false;
                    break;
                }
                if (o1Var.U(F) >= 0) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                fVar2.b(o1Var.invokeOnCompletion(o1Var.new e(fVar2)));
            } else {
                fVar2.g(rb.h.f13851a);
            }
            return rb.h.f13851a;
        }
    }

    public o1(boolean z10) {
        this._state = z10 ? p2.m0.f12904z : p2.m0.f12903y;
    }

    public static p O(sc.j jVar) {
        while (jVar.k()) {
            jVar = jVar.j();
        }
        while (true) {
            jVar = jVar.i();
            if (!jVar.k()) {
                if (jVar instanceof p) {
                    return (p) jVar;
                }
                if (jVar instanceof t1) {
                    return null;
                }
            }
        }
    }

    public static String V(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.d()) {
                return "Cancelling";
            }
            if (cVar.e()) {
                return "Completing";
            }
        } else {
            if (!(obj instanceof f1)) {
                return obj instanceof u ? "Cancelled" : "Completed";
            }
            if (!((f1) obj).isActive()) {
                return "New";
            }
        }
        return "Active";
    }

    public static CancellationException W(o1 o1Var, Throwable th) {
        o1Var.getClass();
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        return cancellationException == null ? new k1(o1Var.u(), th, o1Var) : cancellationException;
    }

    public final Throwable A(c cVar, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (cVar.d()) {
                return new k1(u(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof d2) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof d2)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean B() {
        return true;
    }

    public boolean D() {
        return this instanceof s;
    }

    public final t1 E(f1 f1Var) {
        t1 b10 = f1Var.b();
        if (b10 != null) {
            return b10;
        }
        if (f1Var instanceof w0) {
            return new t1();
        }
        if (f1Var instanceof n1) {
            T((n1) f1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + f1Var).toString());
    }

    public final Object F() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11522a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof sc.p)) {
                return obj;
            }
            ((sc.p) obj).a(this);
        }
    }

    public boolean G(Throwable th) {
        return false;
    }

    public void H(n7.w wVar) {
        throw wVar;
    }

    public final void J(j1 j1Var) {
        if (j1Var == null) {
            f11523b.set(this, u1.f11557a);
            return;
        }
        j1Var.start();
        o attachChild = j1Var.attachChild(this);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11523b;
        atomicReferenceFieldUpdater.set(this, attachChild);
        if (isCompleted()) {
            attachChild.dispose();
            atomicReferenceFieldUpdater.set(this, u1.f11557a);
        }
    }

    public boolean K() {
        return this instanceof nc.f;
    }

    public final Object L(Object obj) {
        Object X;
        do {
            X = X(F(), obj);
            if (X == p2.m0.t) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                u uVar = obj instanceof u ? (u) obj : null;
                throw new IllegalStateException(str, uVar != null ? uVar.f11555a : null);
            }
        } while (X == p2.m0.f12900v);
        return X;
    }

    public String N() {
        return getClass().getSimpleName();
    }

    public final void P(t1 t1Var, Throwable th) {
        Object h10 = t1Var.h();
        ec.i.c(h10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        n7.w wVar = null;
        for (sc.j jVar = (sc.j) h10; !ec.i.a(jVar, t1Var); jVar = jVar.i()) {
            if (jVar instanceof l1) {
                n1 n1Var = (n1) jVar;
                try {
                    n1Var.l(th);
                } catch (Throwable th2) {
                    if (wVar != null) {
                        x6.b.e(wVar, th2);
                    } else {
                        wVar = new n7.w("Exception in completion handler " + n1Var + " for " + this, th2);
                        rb.h hVar = rb.h.f13851a;
                    }
                }
            }
        }
        if (wVar != null) {
            H(wVar);
        }
        t(th);
    }

    public void R(Object obj) {
    }

    public void S() {
    }

    public final void T(n1 n1Var) {
        t1 t1Var = new t1();
        n1Var.getClass();
        sc.j.f14348b.lazySet(t1Var, n1Var);
        sc.j.f14347a.lazySet(t1Var, n1Var);
        while (true) {
            boolean z10 = false;
            if (n1Var.h() != n1Var) {
                break;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sc.j.f14347a;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(n1Var, n1Var, t1Var)) {
                    z10 = true;
                    break;
                } else if (atomicReferenceFieldUpdater.get(n1Var) != n1Var) {
                    break;
                }
            }
            if (z10) {
                t1Var.e(n1Var);
                break;
            }
        }
        sc.j i10 = n1Var.i();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11522a;
        while (!atomicReferenceFieldUpdater2.compareAndSet(this, n1Var, i10) && atomicReferenceFieldUpdater2.get(this) == n1Var) {
        }
    }

    public final int U(Object obj) {
        boolean z10 = false;
        if (obj instanceof w0) {
            if (((w0) obj).f11561a) {
                return 0;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11522a;
            w0 w0Var = p2.m0.f12904z;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, w0Var)) {
                    z10 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            if (!z10) {
                return -1;
            }
            S();
            return 1;
        }
        if (!(obj instanceof e1)) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11522a;
        t1 t1Var = ((e1) obj).f11490a;
        while (true) {
            if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, t1Var)) {
                z10 = true;
                break;
            }
            if (atomicReferenceFieldUpdater2.get(this) != obj) {
                break;
            }
        }
        if (!z10) {
            return -1;
        }
        S();
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [T, java.lang.Throwable] */
    public final Object X(Object obj, Object obj2) {
        boolean z10;
        d2.h0 h0Var;
        if (!(obj instanceof f1)) {
            return p2.m0.t;
        }
        boolean z11 = true;
        boolean z12 = false;
        if (((obj instanceof w0) || (obj instanceof n1)) && !(obj instanceof p) && !(obj2 instanceof u)) {
            f1 f1Var = (f1) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11522a;
            Object g1Var = obj2 instanceof f1 ? new g1((f1) obj2) : obj2;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(this, f1Var, g1Var)) {
                    z10 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(this) != f1Var) {
                    z10 = false;
                    break;
                }
            }
            if (z10) {
                R(obj2);
                w(f1Var, obj2);
            } else {
                z11 = false;
            }
            return z11 ? obj2 : p2.m0.f12900v;
        }
        f1 f1Var2 = (f1) obj;
        t1 E = E(f1Var2);
        if (E == null) {
            return p2.m0.f12900v;
        }
        p pVar = null;
        c cVar = f1Var2 instanceof c ? (c) f1Var2 : null;
        if (cVar == null) {
            cVar = new c(E, null);
        }
        ec.s sVar = new ec.s();
        synchronized (cVar) {
            if (!cVar.e()) {
                c.f11528b.set(cVar, 1);
                if (cVar != f1Var2) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11522a;
                    while (true) {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, f1Var2, cVar)) {
                            z12 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater2.get(this) != f1Var2) {
                            break;
                        }
                    }
                    if (!z12) {
                        h0Var = p2.m0.f12900v;
                    }
                }
                boolean d10 = cVar.d();
                u uVar = obj2 instanceof u ? (u) obj2 : null;
                if (uVar != null) {
                    cVar.a(uVar.f11555a);
                }
                ?? c10 = Boolean.valueOf(true ^ d10).booleanValue() ? cVar.c() : 0;
                sVar.f5272a = c10;
                rb.h hVar = rb.h.f13851a;
                if (c10 != 0) {
                    P(E, c10);
                }
                p pVar2 = f1Var2 instanceof p ? (p) f1Var2 : null;
                if (pVar2 == null) {
                    t1 b10 = f1Var2.b();
                    if (b10 != null) {
                        pVar = O(b10);
                    }
                } else {
                    pVar = pVar2;
                }
                return (pVar == null || !Y(cVar, pVar, obj2)) ? y(cVar, obj2) : p2.m0.f12899u;
            }
            h0Var = p2.m0.t;
            return h0Var;
        }
    }

    public final boolean Y(c cVar, p pVar, Object obj) {
        while (j1.a.a(pVar.f11541e, false, new b(this, cVar, pVar, obj), 1) == u1.f11557a) {
            pVar = O(pVar);
            if (pVar == null) {
                return false;
            }
        }
        return true;
    }

    @Override // nc.j1
    public final o attachChild(q qVar) {
        t0 a10 = j1.a.a(this, true, new p(qVar), 2);
        ec.i.c(a10, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (o) a10;
    }

    @Override // nc.j1
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    @Override // ub.h.b, ub.h
    public final <R> R fold(R r10, dc.p<? super R, ? super h.b, ? extends R> pVar) {
        ec.i.e(pVar, "operation");
        return pVar.invoke(r10, this);
    }

    @Override // nc.q
    public final void g(o1 o1Var) {
        r(o1Var);
    }

    @Override // ub.h.b, ub.h
    public final <E extends h.b> E get(h.c<E> cVar) {
        return (E) h.b.a.a(this, cVar);
    }

    @Override // nc.j1
    public final CancellationException getCancellationException() {
        Object F = F();
        if (!(F instanceof c)) {
            if (F instanceof f1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (F instanceof u) {
                return W(this, ((u) F).f11555a);
            }
            return new k1(getClass().getSimpleName() + " has completed normally", null, this);
        }
        Throwable c10 = ((c) F).c();
        if (c10 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String str = getClass().getSimpleName() + " is cancelling";
        CancellationException cancellationException = c10 instanceof CancellationException ? (CancellationException) c10 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (str == null) {
            str = u();
        }
        return new k1(str, c10, this);
    }

    @Override // nc.j1
    public final kc.b<j1> getChildren() {
        return new kc.e(new g(null, this));
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object F = F();
        if (!(!(F instanceof f1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        u uVar = F instanceof u ? (u) F : null;
        if (uVar != null) {
            return uVar.f11555a;
        }
        return null;
    }

    @Override // ub.h.b
    public final h.c<?> getKey() {
        return j1.b.f11509a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // nc.j1
    public final uc.a getOnJoin() {
        h hVar = h.f11540a;
        ec.i.c(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        ec.v.a(3, hVar);
        return new uc.b((r) this, hVar);
    }

    @Override // nc.j1
    public final j1 getParent() {
        o oVar = (o) f11523b.get(this);
        if (oVar != null) {
            return oVar.getParent();
        }
        return null;
    }

    @Override // nc.j1
    public final t0 invokeOnCompletion(dc.l<? super Throwable, rb.h> lVar) {
        return invokeOnCompletion(false, true, lVar);
    }

    @Override // nc.j1
    public final t0 invokeOnCompletion(boolean z10, boolean z11, dc.l<? super Throwable, rb.h> lVar) {
        n1 n1Var;
        boolean z12;
        Throwable th;
        if (z10) {
            n1Var = lVar instanceof l1 ? (l1) lVar : null;
            if (n1Var == null) {
                n1Var = new h1(lVar);
            }
        } else {
            n1Var = lVar instanceof n1 ? (n1) lVar : null;
            if (n1Var == null) {
                n1Var = new i1(lVar);
            }
        }
        n1Var.f11520d = this;
        while (true) {
            Object F = F();
            if (F instanceof w0) {
                w0 w0Var = (w0) F;
                if (w0Var.f11561a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11522a;
                    while (true) {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, F, n1Var)) {
                            z12 = true;
                            break;
                        }
                        if (atomicReferenceFieldUpdater.get(this) != F) {
                            z12 = false;
                            break;
                        }
                    }
                    if (z12) {
                        return n1Var;
                    }
                } else {
                    t1 t1Var = new t1();
                    Object e1Var = w0Var.f11561a ? t1Var : new e1(t1Var);
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f11522a;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, w0Var, e1Var) && atomicReferenceFieldUpdater2.get(this) == w0Var) {
                    }
                }
            } else {
                if (!(F instanceof f1)) {
                    if (z11) {
                        u uVar = F instanceof u ? (u) F : null;
                        lVar.invoke(uVar != null ? uVar.f11555a : null);
                    }
                    return u1.f11557a;
                }
                t1 b10 = ((f1) F).b();
                if (b10 == null) {
                    ec.i.c(F, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    T((n1) F);
                } else {
                    t0 t0Var = u1.f11557a;
                    if (z10 && (F instanceof c)) {
                        synchronized (F) {
                            th = ((c) F).c();
                            if (th == null || ((lVar instanceof p) && !((c) F).e())) {
                                if (o(F, b10, n1Var)) {
                                    if (th == null) {
                                        return n1Var;
                                    }
                                    t0Var = n1Var;
                                }
                            }
                            rb.h hVar = rb.h.f13851a;
                        }
                    } else {
                        th = null;
                    }
                    if (th != null) {
                        if (z11) {
                            lVar.invoke(th);
                        }
                        return t0Var;
                    }
                    if (o(F, b10, n1Var)) {
                        return n1Var;
                    }
                }
            }
        }
    }

    @Override // nc.j1
    public boolean isActive() {
        Object F = F();
        return (F instanceof f1) && ((f1) F).isActive();
    }

    @Override // nc.j1
    public final boolean isCancelled() {
        Object F = F();
        return (F instanceof u) || ((F instanceof c) && ((c) F).d());
    }

    @Override // nc.j1
    public final boolean isCompleted() {
        return !(F() instanceof f1);
    }

    @Override // nc.j1
    public final Object join(ub.e<? super rb.h> eVar) {
        boolean z10;
        while (true) {
            Object F = F();
            if (!(F instanceof f1)) {
                z10 = false;
                break;
            }
            if (U(F) >= 0) {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            p2.m0.C(eVar.getContext());
            return rb.h.f13851a;
        }
        l lVar = new l(1, p2.m0.P(eVar));
        lVar.t();
        lVar.v(new u0(invokeOnCompletion(new y1(lVar))));
        Object s10 = lVar.s();
        vb.a aVar = vb.a.f16085a;
        if (s10 != aVar) {
            s10 = rb.h.f13851a;
        }
        return s10 == aVar ? s10 : rb.h.f13851a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // nc.w1
    public final CancellationException l0() {
        CancellationException cancellationException;
        Object F = F();
        if (F instanceof c) {
            cancellationException = ((c) F).c();
        } else if (F instanceof u) {
            cancellationException = ((u) F).f11555a;
        } else {
            if (F instanceof f1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + F).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        StringBuilder l10 = defpackage.f.l("Parent job is ");
        l10.append(V(F));
        return new k1(l10.toString(), cancellationException, this);
    }

    @Override // ub.h.b, ub.h
    public final ub.h minusKey(h.c<?> cVar) {
        return h.b.a.b(this, cVar);
    }

    public final boolean o(Object obj, t1 t1Var, n1 n1Var) {
        boolean z10;
        char c10;
        f fVar = new f(n1Var, this, obj);
        do {
            sc.j j10 = t1Var.j();
            sc.j.f14348b.lazySet(n1Var, j10);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sc.j.f14347a;
            atomicReferenceFieldUpdater.lazySet(n1Var, t1Var);
            fVar.f14351c = t1Var;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(j10, t1Var, fVar)) {
                    z10 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(j10) != t1Var) {
                    z10 = false;
                    break;
                }
            }
            c10 = !z10 ? (char) 0 : fVar.a(j10) == null ? (char) 1 : (char) 2;
            if (c10 == 1) {
                return true;
            }
        } while (c10 != 2);
        return false;
    }

    public void p(Object obj) {
    }

    @Override // nc.j1
    public final j1 plus(j1 j1Var) {
        return j1Var;
    }

    @Override // ub.h
    public final ub.h plus(ub.h hVar) {
        ec.i.e(hVar, "context");
        return h.a.a(this, hVar);
    }

    public final Object q(ub.e<Object> eVar) {
        Object F;
        do {
            F = F();
            if (!(F instanceof f1)) {
                if (F instanceof u) {
                    throw ((u) F).f11555a;
                }
                return p2.m0.f0(F);
            }
        } while (U(F) < 0);
        a aVar = new a(p2.m0.P(eVar), this);
        aVar.t();
        aVar.v(new u0(invokeOnCompletion(new x1(aVar))));
        Object s10 = aVar.s();
        vb.a aVar2 = vb.a.f16085a;
        return s10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ca, code lost:
    
        r10 = p2.m0.t;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fd, code lost:
    
        r0 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca A[EDGE_INSN: B:56:0x00ca->B:57:0x00ca BREAK  A[LOOP:1: B:23:0x003f->B:39:0x003f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x003f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean r(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: nc.o1.r(java.lang.Object):boolean");
    }

    public void s(CancellationException cancellationException) {
        r(cancellationException);
    }

    @Override // nc.j1
    public final boolean start() {
        int U;
        do {
            U = U(F());
            if (U == 0) {
                return false;
            }
        } while (U != 1);
        return true;
    }

    public final boolean t(Throwable th) {
        if (K()) {
            return true;
        }
        boolean z10 = th instanceof CancellationException;
        o oVar = (o) f11523b.get(this);
        return (oVar == null || oVar == u1.f11557a) ? z10 : oVar.g(th) || z10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(N() + '{' + V(F()) + '}');
        sb2.append('@');
        sb2.append(g0.b(this));
        return sb2.toString();
    }

    public String u() {
        return "Job was cancelled";
    }

    public boolean v(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return r(th) && B();
    }

    public final void w(f1 f1Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11523b;
        o oVar = (o) atomicReferenceFieldUpdater.get(this);
        if (oVar != null) {
            oVar.dispose();
            atomicReferenceFieldUpdater.set(this, u1.f11557a);
        }
        n7.w wVar = null;
        u uVar = obj instanceof u ? (u) obj : null;
        Throwable th = uVar != null ? uVar.f11555a : null;
        if (f1Var instanceof n1) {
            try {
                ((n1) f1Var).l(th);
                return;
            } catch (Throwable th2) {
                H(new n7.w("Exception in completion handler " + f1Var + " for " + this, th2));
                return;
            }
        }
        t1 b10 = f1Var.b();
        if (b10 != null) {
            Object h10 = b10.h();
            ec.i.c(h10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (sc.j jVar = (sc.j) h10; !ec.i.a(jVar, b10); jVar = jVar.i()) {
                if (jVar instanceof n1) {
                    n1 n1Var = (n1) jVar;
                    try {
                        n1Var.l(th);
                    } catch (Throwable th3) {
                        if (wVar != null) {
                            x6.b.e(wVar, th3);
                        } else {
                            wVar = new n7.w("Exception in completion handler " + n1Var + " for " + this, th3);
                            rb.h hVar = rb.h.f13851a;
                        }
                    }
                }
            }
            if (wVar != null) {
                H(wVar);
            }
        }
    }

    public final Throwable x(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new k1(u(), null, this) : th;
        }
        ec.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((w1) obj).l0();
    }

    public final Object y(c cVar, Object obj) {
        Throwable A;
        u uVar = obj instanceof u ? (u) obj : null;
        Throwable th = uVar != null ? uVar.f11555a : null;
        synchronized (cVar) {
            cVar.d();
            ArrayList<Throwable> f10 = cVar.f(th);
            A = A(cVar, f10);
            if (A != null && f10.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(f10.size()));
                for (Throwable th2 : f10) {
                    if (th2 != A && th2 != A && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        x6.b.e(A, th2);
                    }
                }
            }
        }
        if (A != null && A != th) {
            obj = new u(A, false);
        }
        if (A != null) {
            if (t(A) || G(A)) {
                ec.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                u.f11554b.compareAndSet((u) obj, 0, 1);
            }
        }
        R(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11522a;
        Object g1Var = obj instanceof f1 ? new g1((f1) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, cVar, g1Var) && atomicReferenceFieldUpdater.get(this) == cVar) {
        }
        w(cVar, obj);
        return obj;
    }

    public final Object z() {
        Object F = F();
        if (!(!(F instanceof f1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (F instanceof u) {
            throw ((u) F).f11555a;
        }
        return p2.m0.f0(F);
    }

    @Override // nc.j1
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new k1(u(), null, this);
        }
        s(cancellationException);
    }

    @Override // nc.j1
    public /* synthetic */ boolean cancel(Throwable th) {
        s(th != null ? W(this, th) : new k1(u(), null, this));
        return true;
    }
}
