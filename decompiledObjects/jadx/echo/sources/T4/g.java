package T4;

import S.d;
import V5.o;
import V5.t;
import Z5.k;
import g6.p;
import kotlin.jvm.internal.Intrinsics;
import p6.AbstractC1850h;
import p6.I;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    public static final b f6263c = new b(null);

    /* renamed from: d, reason: collision with root package name */
    public static final d.a f6264d = S.f.a("firebase_sessions_enabled");

    /* renamed from: e, reason: collision with root package name */
    public static final d.a f6265e = S.f.b("firebase_sessions_sampling_rate");

    /* renamed from: f, reason: collision with root package name */
    public static final d.a f6266f = S.f.d("firebase_sessions_restart_timeout");

    /* renamed from: g, reason: collision with root package name */
    public static final d.a f6267g = S.f.d("firebase_sessions_cache_duration");

    /* renamed from: h, reason: collision with root package name */
    public static final d.a f6268h = S.f.e("firebase_sessions_cache_updated_time");

    /* renamed from: a, reason: collision with root package name */
    public final P.f f6269a;

    /* renamed from: b, reason: collision with root package name */
    public e f6270b;

    public static final class a extends k implements p {

        /* renamed from: o, reason: collision with root package name */
        public Object f6271o;

        /* renamed from: p, reason: collision with root package name */
        public int f6272p;

        public a(X5.d dVar) {
            super(2, dVar);
        }

        @Override // Z5.a
        public final X5.d create(Object obj, X5.d dVar) {
            return g.this.new a(dVar);
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            Object c7;
            g gVar;
            c7 = Y5.d.c();
            int i7 = this.f6272p;
            if (i7 == 0) {
                o.b(obj);
                g gVar2 = g.this;
                s6.b b7 = gVar2.f6269a.b();
                this.f6271o = gVar2;
                this.f6272p = 1;
                Object d7 = s6.d.d(b7, this);
                if (d7 == c7) {
                    return c7;
                }
                gVar = gVar2;
                obj = d7;
            } else {
                if (i7 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar = (g) this.f6271o;
                o.b(obj);
            }
            gVar.l(((S.d) obj).d());
            return t.f6803a;
        }

        @Override // g6.p
        public final Object invoke(I i7, X5.d dVar) {
            return ((a) create(i7, dVar)).invokeSuspend(t.f6803a);
        }
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public static final class c extends Z5.d {

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f6274o;

        /* renamed from: q, reason: collision with root package name */
        public int f6276q;

        public c(X5.d dVar) {
            super(dVar);
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            this.f6274o = obj;
            this.f6276q |= Integer.MIN_VALUE;
            return g.this.h(null, null, this);
        }
    }

    public static final class d extends k implements p {

        /* renamed from: o, reason: collision with root package name */
        public int f6277o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f6278p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ Object f6279q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ d.a f6280r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ g f6281s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, d.a aVar, g gVar, X5.d dVar) {
            super(2, dVar);
            this.f6279q = obj;
            this.f6280r = aVar;
            this.f6281s = gVar;
        }

        @Override // g6.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(S.a aVar, X5.d dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(t.f6803a);
        }

        @Override // Z5.a
        public final X5.d create(Object obj, X5.d dVar) {
            d dVar2 = new d(this.f6279q, this.f6280r, this.f6281s, dVar);
            dVar2.f6278p = obj;
            return dVar2;
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            Y5.d.c();
            if (this.f6277o != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj);
            S.a aVar = (S.a) this.f6278p;
            Object obj2 = this.f6279q;
            if (obj2 != null) {
                aVar.i(this.f6280r, obj2);
            } else {
                aVar.h(this.f6280r);
            }
            this.f6281s.l(aVar);
            return t.f6803a;
        }
    }

    public g(P.f dataStore) {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.f6269a = dataStore;
        AbstractC1850h.b(null, new a(null), 1, null);
    }

    public final boolean d() {
        e eVar = this.f6270b;
        e eVar2 = null;
        if (eVar == null) {
            Intrinsics.n("sessionConfigs");
            eVar = null;
        }
        Long b7 = eVar.b();
        e eVar3 = this.f6270b;
        if (eVar3 == null) {
            Intrinsics.n("sessionConfigs");
        } else {
            eVar2 = eVar3;
        }
        Integer a7 = eVar2.a();
        return b7 == null || a7 == null || (System.currentTimeMillis() - b7.longValue()) / ((long) 1000) >= ((long) a7.intValue());
    }

    public final Integer e() {
        e eVar = this.f6270b;
        if (eVar == null) {
            Intrinsics.n("sessionConfigs");
            eVar = null;
        }
        return eVar.d();
    }

    public final Double f() {
        e eVar = this.f6270b;
        if (eVar == null) {
            Intrinsics.n("sessionConfigs");
            eVar = null;
        }
        return eVar.e();
    }

    public final Boolean g() {
        e eVar = this.f6270b;
        if (eVar == null) {
            Intrinsics.n("sessionConfigs");
            eVar = null;
        }
        return eVar.c();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
    
        android.util.Log.w("SettingsCache", "Failed to update cache config value: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(S.d.a r6, java.lang.Object r7, X5.d r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof T4.g.c
            if (r0 == 0) goto L13
            r0 = r8
            T4.g$c r0 = (T4.g.c) r0
            int r1 = r0.f6276q
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6276q = r1
            goto L18
        L13:
            T4.g$c r0 = new T4.g$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f6274o
            java.lang.Object r1 = Y5.b.c()
            int r2 = r0.f6276q
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            V5.o.b(r8)     // Catch: java.io.IOException -> L29
            goto L5d
        L29:
            r6 = move-exception
            goto L47
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            V5.o.b(r8)
            P.f r8 = r5.f6269a     // Catch: java.io.IOException -> L29
            T4.g$d r2 = new T4.g$d     // Catch: java.io.IOException -> L29
            r4 = 0
            r2.<init>(r7, r6, r5, r4)     // Catch: java.io.IOException -> L29
            r0.f6276q = r3     // Catch: java.io.IOException -> L29
            java.lang.Object r6 = S.g.a(r8, r2, r0)     // Catch: java.io.IOException -> L29
            if (r6 != r1) goto L5d
            return r1
        L47:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed to update cache config value: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L5d:
            V5.t r6 = V5.t.f6803a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: T4.g.h(S.d$a, java.lang.Object, X5.d):java.lang.Object");
    }

    public final Object i(Double d7, X5.d dVar) {
        Object c7;
        Object h7 = h(f6265e, d7, dVar);
        c7 = Y5.d.c();
        return h7 == c7 ? h7 : t.f6803a;
    }

    public final Object j(Integer num, X5.d dVar) {
        Object c7;
        Object h7 = h(f6267g, num, dVar);
        c7 = Y5.d.c();
        return h7 == c7 ? h7 : t.f6803a;
    }

    public final Object k(Long l7, X5.d dVar) {
        Object c7;
        Object h7 = h(f6268h, l7, dVar);
        c7 = Y5.d.c();
        return h7 == c7 ? h7 : t.f6803a;
    }

    public final void l(S.d dVar) {
        this.f6270b = new e((Boolean) dVar.b(f6264d), (Double) dVar.b(f6265e), (Integer) dVar.b(f6266f), (Integer) dVar.b(f6267g), (Long) dVar.b(f6268h));
    }

    public final Object m(Integer num, X5.d dVar) {
        Object c7;
        Object h7 = h(f6266f, num, dVar);
        c7 = Y5.d.c();
        return h7 == c7 ? h7 : t.f6803a;
    }

    public final Object n(Boolean bool, X5.d dVar) {
        Object c7;
        Object h7 = h(f6264d, bool, dVar);
        c7 = Y5.d.c();
        return h7 == c7 ? h7 : t.f6803a;
    }
}
