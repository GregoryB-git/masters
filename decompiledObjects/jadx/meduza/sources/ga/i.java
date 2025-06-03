package ga;

import com.pichillilorenzo.flutter_inappwebview_android.R;
import dc.p;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import nc.d0;
import r0.d;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final d.a<Boolean> f6147c = x6.b.j("firebase_sessions_enabled");

    /* renamed from: d, reason: collision with root package name */
    public static final d.a<Double> f6148d = new d.a<>("firebase_sessions_sampling_rate");

    /* renamed from: e, reason: collision with root package name */
    public static final d.a<Integer> f6149e = new d.a<>("firebase_sessions_restart_timeout");
    public static final d.a<Integer> f = new d.a<>("firebase_sessions_cache_duration");

    /* renamed from: g, reason: collision with root package name */
    public static final d.a<Long> f6150g = new d.a<>("firebase_sessions_cache_updated_time");

    /* renamed from: a, reason: collision with root package name */
    public final o0.i<r0.d> f6151a;

    /* renamed from: b, reason: collision with root package name */
    public g f6152b;

    @wb.e(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", l = {R.styleable.AppCompatTheme_buttonStyle}, m = "invokeSuspend")
    public static final class a extends wb.i implements p<d0, ub.e<? super rb.h>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public i f6153a;

        /* renamed from: b, reason: collision with root package name */
        public int f6154b;

        public a(ub.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // wb.a
        public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
            return i.this.new a(eVar);
        }

        @Override // dc.p
        public final Object invoke(d0 d0Var, ub.e<? super rb.h> eVar) {
            return ((a) create(d0Var, eVar)).invokeSuspend(rb.h.f13851a);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            i iVar;
            vb.a aVar = vb.a.f16085a;
            int i10 = this.f6154b;
            if (i10 == 0) {
                rb.f.b(obj);
                i iVar2 = i.this;
                qc.e<r0.d> data = iVar2.f6151a.getData();
                this.f6153a = iVar2;
                this.f6154b = 1;
                Object U = x6.b.U(data, this);
                if (U == aVar) {
                    return aVar;
                }
                iVar = iVar2;
                obj = U;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iVar = this.f6153a;
                rb.f.b(obj);
            }
            Map<d.a<?>, Object> a10 = ((r0.d) obj).a();
            ec.i.e(a10, "<this>");
            i.a(iVar, new r0.a((Map<d.a<?>, Object>) new LinkedHashMap(a10), true));
            return rb.h.f13851a;
        }
    }

    @wb.e(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", l = {R.styleable.AppCompatTheme_windowActionModeOverlay}, m = "updateConfigValue")
    public static final class b<T> extends wb.c {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f6156a;

        /* renamed from: c, reason: collision with root package name */
        public int f6158c;

        public b(ub.e<? super b> eVar) {
            super(eVar);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            this.f6156a = obj;
            this.f6158c |= Integer.MIN_VALUE;
            i iVar = i.this;
            d.a<Boolean> aVar = i.f6147c;
            return iVar.c(null, null, this);
        }
    }

    @wb.e(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
    public static final class c extends wb.i implements p<r0.a, ub.e<? super rb.h>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f6159a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T f6160b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d.a<T> f6161c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ i f6162d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(d.a aVar, i iVar, Object obj, ub.e eVar) {
            super(2, eVar);
            this.f6160b = obj;
            this.f6161c = aVar;
            this.f6162d = iVar;
        }

        @Override // wb.a
        public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
            c cVar = new c(this.f6161c, this.f6162d, this.f6160b, eVar);
            cVar.f6159a = obj;
            return cVar;
        }

        @Override // dc.p
        public final Object invoke(r0.a aVar, ub.e<? super rb.h> eVar) {
            return ((c) create(aVar, eVar)).invokeSuspend(rb.h.f13851a);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            vb.a aVar = vb.a.f16085a;
            rb.f.b(obj);
            r0.a aVar2 = (r0.a) this.f6159a;
            T t = this.f6160b;
            if (t != 0) {
                aVar2.d(this.f6161c, t);
            } else {
                Object obj2 = this.f6161c;
                aVar2.getClass();
                ec.i.e(obj2, Constants.KEY);
                aVar2.c();
                aVar2.f13505a.remove(obj2);
            }
            i.a(this.f6162d, aVar2);
            return rb.h.f13851a;
        }
    }

    public i(o0.i<r0.d> iVar) {
        ec.i.e(iVar, "dataStore");
        this.f6151a = iVar;
        x6.b.p0(new a(null));
    }

    public static final void a(i iVar, r0.a aVar) {
        iVar.getClass();
        iVar.f6152b = new g((Boolean) aVar.b(f6147c), (Double) aVar.b(f6148d), (Integer) aVar.b(f6149e), (Integer) aVar.b(f), (Long) aVar.b(f6150g));
    }

    public final boolean b() {
        g gVar = this.f6152b;
        if (gVar == null) {
            ec.i.i("sessionConfigs");
            throw null;
        }
        Long l10 = gVar.f6136e;
        if (gVar != null) {
            Integer num = gVar.f6135d;
            return l10 == null || num == null || (System.currentTimeMillis() - l10.longValue()) / ((long) 1000) >= ((long) num.intValue());
        }
        ec.i.i("sessionConfigs");
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0027, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
    
        android.util.Log.w("SettingsCache", "Failed to update cache config value: " + r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <T> java.lang.Object c(r0.d.a<T> r6, T r7, ub.e<? super rb.h> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof ga.i.b
            if (r0 == 0) goto L13
            r0 = r8
            ga.i$b r0 = (ga.i.b) r0
            int r1 = r0.f6158c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6158c = r1
            goto L18
        L13:
            ga.i$b r0 = new ga.i$b
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f6156a
            vb.a r1 = vb.a.f16085a
            int r2 = r0.f6158c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            rb.f.b(r8)     // Catch: java.io.IOException -> L27
            goto L5b
        L27:
            r6 = move-exception
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            rb.f.b(r8)
            o0.i<r0.d> r8 = r5.f6151a     // Catch: java.io.IOException -> L27
            ga.i$c r2 = new ga.i$c     // Catch: java.io.IOException -> L27
            r4 = 0
            r2.<init>(r6, r5, r7, r4)     // Catch: java.io.IOException -> L27
            r0.f6158c = r3     // Catch: java.io.IOException -> L27
            java.lang.Object r6 = r0.e.a(r8, r2, r0)     // Catch: java.io.IOException -> L27
            if (r6 != r1) goto L5b
            return r1
        L45:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Failed to update cache config value: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "SettingsCache"
            android.util.Log.w(r7, r6)
        L5b:
            rb.h r6 = rb.h.f13851a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.i.c(r0.d$a, java.lang.Object, ub.e):java.lang.Object");
    }
}
