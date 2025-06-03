package T4;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.v;
import o6.a;
import s4.i;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public static final a f6254c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final i6.a f6255d = R.a.b("firebase_session_settings", null, null, null, 14, null);

    /* renamed from: a, reason: collision with root package name */
    public final h f6256a;

    /* renamed from: b, reason: collision with root package name */
    public final h f6257b;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ m6.h[] f6258a = {v.e(new q(a.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public final P.f b(Context context) {
            return (P.f) f.f6255d.a(context, f6258a[0]);
        }
    }

    public static final class b extends Z5.d {

        /* renamed from: o, reason: collision with root package name */
        public Object f6259o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f6260p;

        /* renamed from: r, reason: collision with root package name */
        public int f6262r;

        public b(X5.d dVar) {
            super(dVar);
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            this.f6260p = obj;
            this.f6262r |= Integer.MIN_VALUE;
            return f.this.g(this);
        }
    }

    public f(h localOverrideSettings, h remoteSettings) {
        Intrinsics.checkNotNullParameter(localOverrideSettings, "localOverrideSettings");
        Intrinsics.checkNotNullParameter(remoteSettings, "remoteSettings");
        this.f6256a = localOverrideSettings;
        this.f6257b = remoteSettings;
    }

    public final double b() {
        Double b7 = this.f6256a.b();
        if (b7 != null) {
            double doubleValue = b7.doubleValue();
            if (e(doubleValue)) {
                return doubleValue;
            }
        }
        Double b8 = this.f6257b.b();
        if (b8 == null) {
            return 1.0d;
        }
        double doubleValue2 = b8.doubleValue();
        if (e(doubleValue2)) {
            return doubleValue2;
        }
        return 1.0d;
    }

    public final long c() {
        o6.a d7 = this.f6256a.d();
        if (d7 != null) {
            long a02 = d7.a0();
            if (f(a02)) {
                return a02;
            }
        }
        o6.a d8 = this.f6257b.d();
        if (d8 != null) {
            long a03 = d8.a0();
            if (f(a03)) {
                return a03;
            }
        }
        a.C0243a c0243a = o6.a.f18197p;
        return o6.c.o(30, o6.d.f18208t);
    }

    public final boolean d() {
        Boolean a7 = this.f6256a.a();
        if (a7 != null) {
            return a7.booleanValue();
        }
        Boolean a8 = this.f6257b.a();
        if (a8 != null) {
            return a8.booleanValue();
        }
        return true;
    }

    public final boolean e(double d7) {
        return 0.0d <= d7 && d7 <= 1.0d;
    }

    public final boolean f(long j7) {
        return o6.a.U(j7) && o6.a.H(j7);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(X5.d r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof T4.f.b
            if (r0 == 0) goto L13
            r0 = r6
            T4.f$b r0 = (T4.f.b) r0
            int r1 = r0.f6262r
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6262r = r1
            goto L18
        L13:
            T4.f$b r0 = new T4.f$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f6260p
            java.lang.Object r1 = Y5.b.c()
            int r2 = r0.f6262r
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            V5.o.b(r6)
            goto L5b
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            java.lang.Object r2 = r0.f6259o
            T4.f r2 = (T4.f) r2
            V5.o.b(r6)
            goto L4d
        L3c:
            V5.o.b(r6)
            T4.h r6 = r5.f6256a
            r0.f6259o = r5
            r0.f6262r = r4
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L4c
            return r1
        L4c:
            r2 = r5
        L4d:
            T4.h r6 = r2.f6257b
            r2 = 0
            r0.f6259o = r2
            r0.f6262r = r3
            java.lang.Object r6 = r6.c(r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            V5.t r6 = V5.t.f6803a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: T4.f.g(X5.d):java.lang.Object");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(Context context, X5.g blockingDispatcher, X5.g backgroundDispatcher, i firebaseInstallationsApi, R4.b appInfo) {
        this(new T4.b(context), new c(backgroundDispatcher, firebaseInstallationsApi, appInfo, new d(appInfo, blockingDispatcher, null, 4, null), f6254c.b(context)));
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
    }
}
