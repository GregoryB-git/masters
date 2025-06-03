package ga;

import android.content.Context;
import android.util.Log;
import dc.l;
import ea.t;
import ea.u;
import ea.z;
import ec.p;
import p2.m0;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: c, reason: collision with root package name */
    public static final b f6137c = new b();

    /* renamed from: d, reason: collision with root package name */
    public static final q0.c f6138d = m0.Y(u.f4976b, new p0.a(a.f6141a), 12);

    /* renamed from: a, reason: collision with root package name */
    public final j f6139a;

    /* renamed from: b, reason: collision with root package name */
    public final j f6140b;

    public static final class a extends ec.j implements l<o0.a, r0.d> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f6141a = new a();

        public a() {
            super(1);
        }

        @Override // dc.l
        public final r0.d invoke(o0.a aVar) {
            o0.a aVar2 = aVar;
            ec.i.e(aVar2, "ex");
            Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + t.b() + '.', aVar2);
            return new r0.a(true, 1);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ jc.h<Object>[] f6142a;

        static {
            p pVar = new p(b.class);
            ec.t.f5273a.getClass();
            f6142a = new jc.h[]{pVar};
        }
    }

    @wb.e(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", l = {138, 139}, m = "updateSettings")
    public static final class c extends wb.c {

        /* renamed from: a, reason: collision with root package name */
        public h f6143a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6144b;

        /* renamed from: d, reason: collision with root package name */
        public int f6146d;

        public c(ub.e<? super c> eVar) {
            super(eVar);
        }

        @Override // wb.a
        public final Object invokeSuspend(Object obj) {
            this.f6144b = obj;
            this.f6146d |= Integer.MIN_VALUE;
            return h.this.b(this);
        }
    }

    public h(u7.f fVar, ub.h hVar, ub.h hVar2, u9.d dVar) {
        fVar.a();
        Context context = fVar.f15084a;
        ec.i.d(context, "firebaseApp.applicationContext");
        z.f5010a.getClass();
        ea.b a10 = z.a(fVar);
        ga.b bVar = new ga.b(context);
        f fVar2 = new f(a10, hVar);
        f6137c.getClass();
        d dVar2 = new d(hVar2, dVar, a10, fVar2, f6138d.a(context, b.f6142a[0]));
        this.f6139a = bVar;
        this.f6140b = dVar2;
    }

    public final double a() {
        Double c10 = this.f6139a.c();
        if (c10 != null) {
            double doubleValue = c10.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double c11 = this.f6140b.c();
        if (c11 != null) {
            double doubleValue2 = c11.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(ub.e<? super rb.h> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ga.h.c
            if (r0 == 0) goto L13
            r0 = r6
            ga.h$c r0 = (ga.h.c) r0
            int r1 = r0.f6146d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f6146d = r1
            goto L18
        L13:
            ga.h$c r0 = new ga.h$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f6144b
            vb.a r1 = vb.a.f16085a
            int r2 = r0.f6146d
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            rb.f.b(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            ga.h r2 = r0.f6143a
            rb.f.b(r6)
            goto L49
        L38:
            rb.f.b(r6)
            ga.j r6 = r5.f6139a
            r0.f6143a = r5
            r0.f6146d = r4
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r2 = r5
        L49:
            ga.j r6 = r2.f6140b
            r2 = 0
            r0.f6143a = r2
            r0.f6146d = r3
            java.lang.Object r6 = r6.d(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            rb.h r6 = rb.h.f13851a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.h.b(ub.e):java.lang.Object");
    }
}
