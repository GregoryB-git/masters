package ea;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: c, reason: collision with root package name */
    public static final a f4961c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final String f4962a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4963b;

    public static final class a {

        @wb.e(c = "com.google.firebase.sessions.InstallationId$Companion", f = "InstallationId.kt", l = {32, 40}, m = "create")
        /* renamed from: ea.q$a$a, reason: collision with other inner class name */
        public static final class C0070a extends wb.c {

            /* renamed from: a, reason: collision with root package name */
            public Object f4964a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f4965b;

            /* renamed from: d, reason: collision with root package name */
            public int f4967d;

            public C0070a(ub.e<? super C0070a> eVar) {
                super(eVar);
            }

            @Override // wb.a
            public final Object invokeSuspend(Object obj) {
                this.f4965b = obj;
                this.f4967d |= Integer.MIN_VALUE;
                return a.this.a(null, this);
            }
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(8:5|6|7|(1:(1:(7:11|12|13|14|15|16|17)(2:22|23))(2:24|25))(3:36|37|(1:39))|26|27|28|(1:30)(5:31|14|15|16|17)))|42|6|7|(0)(0)|26|27|28|(0)(0)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
        
            r9 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
        
            r7 = r10;
            r10 = r9;
            r9 = r7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x0067, code lost:
        
            r10 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0068, code lost:
        
            android.util.Log.w("InstallationId", "Error getting authentication token.", r10);
            r10 = "";
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0081 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object a(u9.d r9, ub.e<? super ea.q> r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof ea.q.a.C0070a
                if (r0 == 0) goto L13
                r0 = r10
                ea.q$a$a r0 = (ea.q.a.C0070a) r0
                int r1 = r0.f4967d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f4967d = r1
                goto L18
            L13:
                ea.q$a$a r0 = new ea.q$a$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f4965b
                vb.a r1 = vb.a.f16085a
                int r2 = r0.f4967d
                java.lang.String r3 = ""
                java.lang.String r4 = "InstallationId"
                r5 = 2
                r6 = 1
                if (r2 == 0) goto L44
                if (r2 == r6) goto L3c
                if (r2 != r5) goto L34
                java.lang.Object r9 = r0.f4964a
                java.lang.String r9 = (java.lang.String) r9
                rb.f.b(r10)     // Catch: java.lang.Exception -> L32
                goto L85
            L32:
                r10 = move-exception
                goto L92
            L34:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3c:
                java.lang.Object r9 = r0.f4964a
                u9.d r9 = (u9.d) r9
                rb.f.b(r10)     // Catch: java.lang.Exception -> L67
                goto L5b
            L44:
                rb.f.b(r10)
                com.google.android.gms.tasks.Task r10 = r9.a()     // Catch: java.lang.Exception -> L67
                java.lang.String r2 = "firebaseInstallations.getToken(false)"
                ec.i.d(r10, r2)     // Catch: java.lang.Exception -> L67
                r0.f4964a = r9     // Catch: java.lang.Exception -> L67
                r0.f4967d = r6     // Catch: java.lang.Exception -> L67
                java.lang.Object r10 = wc.c.a(r10, r0)     // Catch: java.lang.Exception -> L67
                if (r10 != r1) goto L5b
                return r1
            L5b:
                u9.h r10 = (u9.h) r10     // Catch: java.lang.Exception -> L67
                java.lang.String r10 = r10.a()     // Catch: java.lang.Exception -> L67
                java.lang.String r2 = "{\n          firebaseInst…).await().token\n        }"
                ec.i.d(r10, r2)     // Catch: java.lang.Exception -> L67
                goto L6e
            L67:
                r10 = move-exception
                java.lang.String r2 = "Error getting authentication token."
                android.util.Log.w(r4, r2, r10)
                r10 = r3
            L6e:
                com.google.android.gms.tasks.Task r9 = r9.getId()     // Catch: java.lang.Exception -> L8e
                java.lang.String r2 = "firebaseInstallations.id"
                ec.i.d(r9, r2)     // Catch: java.lang.Exception -> L8e
                r0.f4964a = r10     // Catch: java.lang.Exception -> L8e
                r0.f4967d = r5     // Catch: java.lang.Exception -> L8e
                java.lang.Object r9 = wc.c.a(r9, r0)     // Catch: java.lang.Exception -> L8e
                if (r9 != r1) goto L82
                return r1
            L82:
                r7 = r10
                r10 = r9
                r9 = r7
            L85:
                java.lang.String r0 = "{\n          firebaseInst…ions.id.await()\n        }"
                ec.i.d(r10, r0)     // Catch: java.lang.Exception -> L32
                java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L32
                r3 = r10
                goto L97
            L8e:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L92:
                java.lang.String r0 = "Error getting Firebase installation id ."
                android.util.Log.w(r4, r0, r10)
            L97:
                ea.q r10 = new ea.q
                r10.<init>(r3, r9)
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ea.q.a.a(u9.d, ub.e):java.lang.Object");
        }
    }

    public q(String str, String str2) {
        this.f4962a = str;
        this.f4963b = str2;
    }
}
