package qc;

import b.a0;
import d2.h0;
import eb.y;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import nc.j1;

/* loaded from: classes.dex */
public final class t<T> extends rc.b<u> implements q<T>, e, rc.m<T> {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f13448e = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: d, reason: collision with root package name */
    public int f13449d;

    @wb.e(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {384, 396, 401}, m = "collect")
    public static final class a extends wb.c {

        /* renamed from: a, reason: collision with root package name */
        public t f13450a;

        /* renamed from: b, reason: collision with root package name */
        public f f13451b;

        /* renamed from: c, reason: collision with root package name */
        public u f13452c;

        /* renamed from: d, reason: collision with root package name */
        public j1 f13453d;

        /* renamed from: e, reason: collision with root package name */
        public Object f13454e;
        public /* synthetic */ Object f;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ t<T> f13455o;

        /* renamed from: p, reason: collision with root package name */
        public int f13456p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(t<T> tVar, ub.e<? super a> eVar) {
            super(eVar);
            this.f13455o = tVar;
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            this.f = obj;
            this.f13456p |= Integer.MIN_VALUE;
            return this.f13455o.collect(null, this);
        }
    }

    public t(Object obj) {
        this._state = obj;
    }

    @Override // rc.m
    public final e<T> a(ub.h hVar, int i10, pc.a aVar) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < 2) {
            z10 = true;
        }
        return (((z10 || i10 == -2) && aVar == pc.a.DROP_OLDEST) || ((i10 == 0 || i10 == -3) && aVar == pc.a.SUSPEND)) ? this : new rc.i(this, hVar, i10, aVar);
    }

    public final T b() {
        h0 h0Var = y.f5255b;
        T t = (T) f13448e.get(this);
        if (t == h0Var) {
            return null;
        }
        return t;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ea, code lost:
    
        if (ec.i.a(r0, r2) != false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
    
        if (rb.h.f13851a == r4) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cd, code lost:
    
        if (0 == 0) goto L76;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d5 A[Catch: all -> 0x00e1, TryCatch #1 {all -> 0x00e1, blocks: (B:13:0x003a, B:14:0x00cd, B:16:0x00d5, B:19:0x00dc, B:20:0x00e0, B:24:0x00e6, B:26:0x0107, B:30:0x011e, B:31:0x0136, B:38:0x0147, B:39:0x014c, B:44:0x0155, B:33:0x013e, B:51:0x00ec, B:54:0x00f3, B:62:0x0051, B:64:0x005c, B:65:0x00be), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [S extends rc.c<?>[], java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v7, types: [rc.c[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [S extends rc.c<?>[], rc.c[]] */
    @Override // qc.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(qc.f<? super T> r17, ub.e<?> r18) {
        /*
            Method dump skipped, instructions count: 375
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qc.t.collect(qc.f, ub.e):java.lang.Object");
    }

    @Override // qc.f
    public final Object emit(T t, ub.e<? super rb.h> eVar) {
        setValue(t);
        return rb.h.f13851a;
    }

    @Override // qc.q
    public final void setValue(T t) {
        int i10;
        Object obj;
        h0 h0Var;
        boolean z10;
        boolean z11;
        if (t == null) {
            t = (T) y.f5255b;
        }
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f13448e;
            if (!ec.i.a(atomicReferenceFieldUpdater.get(this), t)) {
                atomicReferenceFieldUpdater.set(this, t);
                int i11 = this.f13449d;
                if ((i11 & 1) == 0) {
                    int i12 = i11 + 1;
                    this.f13449d = i12;
                    Object obj2 = this.f13853a;
                    rb.h hVar = rb.h.f13851a;
                    while (true) {
                        u[] uVarArr = (u[]) obj2;
                        if (uVarArr != null) {
                            for (u uVar : uVarArr) {
                                if (uVar != null) {
                                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = u.f13457a;
                                    while (true) {
                                        Object obj3 = atomicReferenceFieldUpdater2.get(uVar);
                                        if (obj3 != null && obj3 != (h0Var = a0.S)) {
                                            h0 h0Var2 = a0.R;
                                            if (obj3 != h0Var2) {
                                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = u.f13457a;
                                                while (true) {
                                                    if (!atomicReferenceFieldUpdater3.compareAndSet(uVar, obj3, h0Var2)) {
                                                        if (atomicReferenceFieldUpdater3.get(uVar) != obj3) {
                                                            z11 = false;
                                                            break;
                                                        }
                                                    } else {
                                                        z11 = true;
                                                        break;
                                                    }
                                                }
                                                if (z11) {
                                                    ((nc.l) obj3).resumeWith(rb.h.f13851a);
                                                    break;
                                                }
                                            } else {
                                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4 = u.f13457a;
                                                while (true) {
                                                    if (!atomicReferenceFieldUpdater4.compareAndSet(uVar, obj3, h0Var)) {
                                                        if (atomicReferenceFieldUpdater4.get(uVar) != obj3) {
                                                            z10 = false;
                                                            break;
                                                        }
                                                    } else {
                                                        z10 = true;
                                                        break;
                                                    }
                                                }
                                                if (z10) {
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        synchronized (this) {
                            i10 = this.f13449d;
                            if (i10 == i12) {
                                break;
                            }
                            obj = this.f13853a;
                            rb.h hVar2 = rb.h.f13851a;
                        }
                        obj2 = obj;
                        i12 = i10;
                    }
                    this.f13449d = i12 + 1;
                } else {
                    this.f13449d = i11 + 2;
                }
            }
        }
    }
}
