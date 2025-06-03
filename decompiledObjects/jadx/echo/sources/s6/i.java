package s6;

import kotlin.jvm.internal.u;

/* loaded from: classes.dex */
public abstract /* synthetic */ class i {

    public static final class a implements c {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ u f19332o;

        public a(u uVar) {
            this.f19332o = uVar;
        }

        @Override // s6.c
        public Object emit(Object obj, X5.d dVar) {
            this.f19332o.f16230o = obj;
            throw new t6.a(this);
        }
    }

    public static final class b extends Z5.d {

        /* renamed from: o, reason: collision with root package name */
        public Object f19333o;

        /* renamed from: p, reason: collision with root package name */
        public Object f19334p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f19335q;

        /* renamed from: r, reason: collision with root package name */
        public int f19336r;

        public b(X5.d dVar) {
            super(dVar);
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            this.f19335q = obj;
            this.f19336r |= Integer.MIN_VALUE;
            return d.d(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(s6.b r4, X5.d r5) {
        /*
            boolean r0 = r5 instanceof s6.i.b
            if (r0 == 0) goto L13
            r0 = r5
            s6.i$b r0 = (s6.i.b) r0
            int r1 = r0.f19336r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19336r = r1
            goto L18
        L13:
            s6.i$b r0 = new s6.i$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19335q
            java.lang.Object r1 = Y5.b.c()
            int r2 = r0.f19336r
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f19334p
            s6.i$a r4 = (s6.i.a) r4
            java.lang.Object r0 = r0.f19333o
            kotlin.jvm.internal.u r0 = (kotlin.jvm.internal.u) r0
            V5.o.b(r5)     // Catch: t6.a -> L31
            goto L62
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            V5.o.b(r5)
            kotlin.jvm.internal.u r5 = new kotlin.jvm.internal.u
            r5.<init>()
            u6.F r2 = t6.h.f19608a
            r5.f16230o = r2
            s6.i$a r2 = new s6.i$a
            r2.<init>(r5)
            r0.f19333o = r5     // Catch: t6.a -> L5b
            r0.f19334p = r2     // Catch: t6.a -> L5b
            r0.f19336r = r3     // Catch: t6.a -> L5b
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: t6.a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r0 = r5
            goto L62
        L5b:
            r4 = move-exception
            r0 = r5
            r5 = r4
            r4 = r2
        L5f:
            t6.f.a(r5, r4)
        L62:
            java.lang.Object r4 = r0.f16230o
            u6.F r5 = t6.h.f19608a
            if (r4 == r5) goto L69
            return r4
        L69:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s6.i.a(s6.b, X5.d):java.lang.Object");
    }
}
