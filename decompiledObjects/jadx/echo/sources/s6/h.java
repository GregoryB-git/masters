package s6;

import V5.t;
import g6.p;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public abstract /* synthetic */ class h {

    public static final class a implements s6.b {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ s6.b f19322o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ p f19323p;

        public a(s6.b bVar, p pVar) {
            this.f19322o = bVar;
            this.f19323p = pVar;
        }

        @Override // s6.b
        public Object a(c cVar, X5.d dVar) {
            Object c7;
            Object a7 = this.f19322o.a(new b(new s(), cVar, this.f19323p), dVar);
            c7 = Y5.d.c();
            return a7 == c7 ? a7 : t.f6803a;
        }
    }

    public static final class b implements c {

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ s f19324o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ c f19325p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ p f19326q;

        public static final class a extends Z5.d {

            /* renamed from: o, reason: collision with root package name */
            public Object f19327o;

            /* renamed from: p, reason: collision with root package name */
            public Object f19328p;

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f19329q;

            /* renamed from: s, reason: collision with root package name */
            public int f19331s;

            public a(X5.d dVar) {
                super(dVar);
            }

            @Override // Z5.a
            public final Object invokeSuspend(Object obj) {
                this.f19329q = obj;
                this.f19331s |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(s sVar, c cVar, p pVar) {
            this.f19324o = sVar;
            this.f19325p = cVar;
            this.f19326q = pVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0045  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
        @Override // s6.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r7, X5.d r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof s6.h.b.a
                if (r0 == 0) goto L13
                r0 = r8
                s6.h$b$a r0 = (s6.h.b.a) r0
                int r1 = r0.f19331s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f19331s = r1
                goto L18
            L13:
                s6.h$b$a r0 = new s6.h$b$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f19329q
                java.lang.Object r1 = Y5.b.c()
                int r2 = r0.f19331s
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                V5.o.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f19328p
                java.lang.Object r2 = r0.f19327o
                s6.h$b r2 = (s6.h.b) r2
                V5.o.b(r8)
                goto L6c
            L41:
                V5.o.b(r8)
                goto L59
            L45:
                V5.o.b(r8)
                kotlin.jvm.internal.s r8 = r6.f19324o
                boolean r8 = r8.f16228o
                if (r8 == 0) goto L5c
                s6.c r8 = r6.f19325p
                r0.f19331s = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                return r1
            L59:
                V5.t r7 = V5.t.f6803a
                return r7
            L5c:
                g6.p r8 = r6.f19326q
                r0.f19327o = r6
                r0.f19328p = r7
                r0.f19331s = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                return r1
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.s r8 = r2.f19324o
                r8.f16228o = r5
                s6.c r8 = r2.f19325p
                r2 = 0
                r0.f19327o = r2
                r0.f19328p = r2
                r0.f19331s = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
                return r1
            L88:
                V5.t r7 = V5.t.f6803a
                return r7
            L8b:
                V5.t r7 = V5.t.f6803a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: s6.h.b.emit(java.lang.Object, X5.d):java.lang.Object");
        }
    }

    public static final s6.b a(s6.b bVar, p pVar) {
        return new a(bVar, pVar);
    }
}
