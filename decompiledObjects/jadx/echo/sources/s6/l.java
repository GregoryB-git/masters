package s6;

import V5.t;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import u6.F;

/* loaded from: classes.dex */
public final class l extends t6.b implements j, b {

    /* renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f19338s = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: r, reason: collision with root package name */
    public int f19339r;

    public static final class a extends Z5.d {

        /* renamed from: o, reason: collision with root package name */
        public Object f19340o;

        /* renamed from: p, reason: collision with root package name */
        public Object f19341p;

        /* renamed from: q, reason: collision with root package name */
        public Object f19342q;

        /* renamed from: r, reason: collision with root package name */
        public Object f19343r;

        /* renamed from: s, reason: collision with root package name */
        public Object f19344s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f19345t;

        /* renamed from: v, reason: collision with root package name */
        public int f19347v;

        public a(X5.d dVar) {
            super(dVar);
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            this.f19345t = obj;
            this.f19347v |= Integer.MIN_VALUE;
            return l.this.a(null, this);
        }
    }

    public l(Object obj) {
        this._state = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0097 A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0097, B:19:0x009c, B:21:0x00bd, B:23:0x00c3, B:27:0x00a2, B:30:0x00a9, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009c A[Catch: all -> 0x0042, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0097, B:19:0x009c, B:21:0x00bd, B:23:0x00c3, B:27:0x00a2, B:30:0x00a9, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3 A[Catch: all -> 0x0042, TRY_LEAVE, TryCatch #0 {all -> 0x0042, blocks: (B:14:0x003e, B:15:0x008f, B:17:0x0097, B:19:0x009c, B:21:0x00bd, B:23:0x00c3, B:27:0x00a2, B:30:0x00a9, B:39:0x005f, B:41:0x0071, B:42:0x0080), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00c1 -> B:15:0x008f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00d3 -> B:15:0x008f). Please report as a decompilation issue!!! */
    @Override // s6.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(s6.c r11, X5.d r12) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.l.a(s6.c, X5.d):java.lang.Object");
    }

    @Override // s6.c
    public Object emit(Object obj, X5.d dVar) {
        setValue(obj);
        return t.f6803a;
    }

    @Override // t6.b
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public n c() {
        return new n();
    }

    @Override // s6.j
    public Object getValue() {
        F f7 = t6.h.f19608a;
        Object obj = f19338s.get(this);
        if (obj == f7) {
            return null;
        }
        return obj;
    }

    @Override // t6.b
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public n[] d(int i7) {
        return new n[i7];
    }

    public final boolean i(Object obj, Object obj2) {
        int i7;
        t6.d[] f7;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f19338s;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !Intrinsics.a(obj3, obj)) {
                return false;
            }
            if (Intrinsics.a(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i8 = this.f19339r;
            if ((i8 & 1) != 0) {
                this.f19339r = i8 + 2;
                return true;
            }
            int i9 = i8 + 1;
            this.f19339r = i9;
            t6.d[] f8 = f();
            t tVar = t.f6803a;
            while (true) {
                n[] nVarArr = (n[]) f8;
                if (nVarArr != null) {
                    for (n nVar : nVarArr) {
                        if (nVar != null) {
                            nVar.g();
                        }
                    }
                }
                synchronized (this) {
                    i7 = this.f19339r;
                    if (i7 == i9) {
                        this.f19339r = i9 + 1;
                        return true;
                    }
                    f7 = f();
                    t tVar2 = t.f6803a;
                }
                f8 = f7;
                i9 = i7;
            }
        }
    }

    @Override // s6.j
    public void setValue(Object obj) {
        if (obj == null) {
            obj = t6.h.f19608a;
        }
        i(null, obj);
    }
}
