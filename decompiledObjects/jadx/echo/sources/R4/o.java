package R4;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: c, reason: collision with root package name */
    public static final a f5748c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final s4.i f5749a;

    /* renamed from: b, reason: collision with root package name */
    public final i f5750b;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public static final class b extends Z5.d {

        /* renamed from: o, reason: collision with root package name */
        public Object f5751o;

        /* renamed from: p, reason: collision with root package name */
        public Object f5752p;

        /* renamed from: q, reason: collision with root package name */
        public Object f5753q;

        /* renamed from: r, reason: collision with root package name */
        public Object f5754r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f5755s;

        /* renamed from: u, reason: collision with root package name */
        public int f5757u;

        public b(X5.d dVar) {
            super(dVar);
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            this.f5755s = obj;
            this.f5757u |= Integer.MIN_VALUE;
            return o.this.a(null, this);
        }
    }

    public o(s4.i firebaseInstallations, i eventGDTLogger) {
        Intrinsics.checkNotNullParameter(firebaseInstallations, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(eventGDTLogger, "eventGDTLogger");
        this.f5749a = firebaseInstallations;
        this.f5750b = eventGDTLogger;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|(1:(3:9|10|11)(2:25|26))(4:27|28|29|(1:31)(1:32))|12|13|14|15|16|17))|36|6|(0)(0)|12|13|14|15|16|17|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00bb, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00bc, code lost:
    
        android.util.Log.e("SessionCoordinator", "Error logging Session Start event to DataTransport: ", r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(R4.q r7, X5.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof R4.o.b
            if (r0 == 0) goto L13
            r0 = r8
            R4.o$b r0 = (R4.o.b) r0
            int r1 = r0.f5757u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5757u = r1
            goto L18
        L13:
            R4.o$b r0 = new R4.o$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f5755s
            java.lang.Object r1 = Y5.b.c()
            int r2 = r0.f5757u
            r3 = 1
            java.lang.String r4 = "SessionCoordinator"
            if (r2 == 0) goto L45
            if (r2 != r3) goto L3d
            java.lang.Object r7 = r0.f5754r
            R4.t r7 = (R4.t) r7
            java.lang.Object r1 = r0.f5753q
            R4.t r1 = (R4.t) r1
            java.lang.Object r2 = r0.f5752p
            R4.q r2 = (R4.q) r2
            java.lang.Object r0 = r0.f5751o
            R4.o r0 = (R4.o) r0
            V5.o.b(r8)     // Catch: java.lang.Exception -> L3b
            goto L6d
        L3b:
            r7 = move-exception
            goto L7a
        L3d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L45:
            V5.o.b(r8)
            R4.t r8 = r7.c()
            s4.i r2 = r6.f5749a     // Catch: java.lang.Exception -> L75
            V2.j r2 = r2.a()     // Catch: java.lang.Exception -> L75
            java.lang.String r5 = "firebaseInstallations.id"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)     // Catch: java.lang.Exception -> L75
            r0.f5751o = r6     // Catch: java.lang.Exception -> L75
            r0.f5752p = r7     // Catch: java.lang.Exception -> L75
            r0.f5753q = r8     // Catch: java.lang.Exception -> L75
            r0.f5754r = r8     // Catch: java.lang.Exception -> L75
            r0.f5757u = r3     // Catch: java.lang.Exception -> L75
            java.lang.Object r0 = z6.b.a(r2, r0)     // Catch: java.lang.Exception -> L75
            if (r0 != r1) goto L68
            return r1
        L68:
            r2 = r7
            r7 = r8
            r1 = r7
            r8 = r0
            r0 = r6
        L6d:
            java.lang.String r3 = "{\n        firebaseInstallations.id.await()\n      }"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r3)     // Catch: java.lang.Exception -> L3b
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L3b
            goto L96
        L75:
            r0 = move-exception
            r2 = r7
            r1 = r8
            r7 = r0
            r0 = r6
        L7a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r3 = "Error getting Firebase Installation ID: "
            r8.append(r3)
            r8.append(r7)
            java.lang.String r7 = ". Using an empty ID"
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            android.util.Log.e(r4, r7)
            java.lang.String r8 = ""
            r7 = r1
        L96:
            r7.g(r8)
            R4.i r7 = r0.f5750b     // Catch: java.lang.RuntimeException -> Lbb
            r7.a(r2)     // Catch: java.lang.RuntimeException -> Lbb
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.RuntimeException -> Lbb
            r7.<init>()     // Catch: java.lang.RuntimeException -> Lbb
            java.lang.String r8 = "Successfully logged Session Start event: "
            r7.append(r8)     // Catch: java.lang.RuntimeException -> Lbb
            R4.t r8 = r2.c()     // Catch: java.lang.RuntimeException -> Lbb
            java.lang.String r8 = r8.e()     // Catch: java.lang.RuntimeException -> Lbb
            r7.append(r8)     // Catch: java.lang.RuntimeException -> Lbb
            java.lang.String r7 = r7.toString()     // Catch: java.lang.RuntimeException -> Lbb
            android.util.Log.i(r4, r7)     // Catch: java.lang.RuntimeException -> Lbb
            goto Lc1
        Lbb:
            r7 = move-exception
            java.lang.String r8 = "Error logging Session Start event to DataTransport: "
            android.util.Log.e(r4, r8, r7)
        Lc1:
            V5.t r7 = V5.t.f6803a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.o.a(R4.q, X5.d):java.lang.Object");
    }
}
