package ea;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.pichillilorenzo.flutter_inappwebview_android.R;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final u7.f f4954a;

    /* renamed from: b, reason: collision with root package name */
    public final ga.h f4955b;

    @wb.e(c = "com.google.firebase.sessions.FirebaseSessions$1", f = "FirebaseSessions.kt", l = {R.styleable.AppCompatTheme_buttonBarStyle, R.styleable.AppCompatTheme_checkedTextViewStyle}, m = "invokeSuspend")
    public static final class a extends wb.i implements dc.p<nc.d0, ub.e<? super rb.h>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f4956a;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ub.h f4958c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ j0 f4959d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ub.h hVar, j0 j0Var, ub.e<? super a> eVar) {
            super(2, eVar);
            this.f4958c = hVar;
            this.f4959d = j0Var;
        }

        @Override // wb.a
        public final ub.e<rb.h> create(Object obj, ub.e<?> eVar) {
            return o.this.new a(this.f4958c, this.f4959d, eVar);
        }

        @Override // dc.p
        public final Object invoke(nc.d0 d0Var, ub.e<? super rb.h> eVar) {
            return ((a) create(d0Var, eVar)).invokeSuspend(rb.h.f13851a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0073  */
        @Override // wb.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                vb.a r0 = vb.a.f16085a
                int r1 = r6.f4956a
                r2 = 0
                r3 = 1
                r4 = 2
                if (r1 == 0) goto L1d
                if (r1 == r3) goto L19
                if (r1 != r4) goto L11
                rb.f.b(r7)
                goto L67
            L11:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L19:
                rb.f.b(r7)
                goto L2b
            L1d:
                rb.f.b(r7)
                fa.a r7 = fa.a.f5511a
                r6.f4956a = r3
                java.lang.Object r7 = r7.b(r6)
                if (r7 != r0) goto L2b
                return r0
            L2b:
                java.util.Map r7 = (java.util.Map) r7
                java.util.Collection r7 = r7.values()
                boolean r1 = r7 instanceof java.util.Collection
                if (r1 == 0) goto L3c
                boolean r1 = r7.isEmpty()
                if (r1 == 0) goto L3c
                goto L54
            L3c:
                java.util.Iterator r7 = r7.iterator()
            L40:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto L54
                java.lang.Object r1 = r7.next()
                fa.b r1 = (fa.b) r1
                boolean r1 = r1.b()
                if (r1 == 0) goto L40
                r7 = r2
                goto L55
            L54:
                r7 = r3
            L55:
                if (r7 == 0) goto L5a
                java.lang.String r7 = "No Sessions subscribers. Not listening to lifecycle events."
                goto L8a
            L5a:
                ea.o r7 = ea.o.this
                ga.h r7 = r7.f4955b
                r6.f4956a = r4
                java.lang.Object r7 = r7.b(r6)
                if (r7 != r0) goto L67
                return r0
            L67:
                ea.o r7 = ea.o.this
                ga.h r7 = r7.f4955b
                ga.j r0 = r7.f6139a
                java.lang.Boolean r0 = r0.a()
                if (r0 == 0) goto L78
                boolean r7 = r0.booleanValue()
                goto L86
            L78:
                ga.j r7 = r7.f6140b
                java.lang.Boolean r7 = r7.a()
                if (r7 == 0) goto L85
                boolean r7 = r7.booleanValue()
                goto L86
            L85:
                r7 = r3
            L86:
                if (r7 != 0) goto L90
                java.lang.String r7 = "Sessions SDK disabled. Not listening to lifecycle events."
            L8a:
                java.lang.String r0 = "FirebaseSessions"
                android.util.Log.d(r0, r7)
                goto Ld0
            L90:
                ea.h0 r7 = new ea.h0
                ub.h r0 = r6.f4958c
                r7.<init>(r0)
                ea.j0 r0 = r6.f4959d
                java.lang.String r1 = "sessionLifecycleServiceBinder"
                ec.i.e(r0, r1)
                android.os.Messenger r1 = new android.os.Messenger
                ea.h0$a r4 = new ea.h0$a
                ub.h r5 = r7.f4929a
                r4.<init>(r5)
                r1.<init>(r4)
                ea.h0$b r4 = r7.f4932d
                r0.a(r1, r4)
                ea.l0 r0 = ea.l0.f4948a
                r0.getClass()
                ea.l0.f4950c = r7
                boolean r0 = ea.l0.f4949b
                if (r0 == 0) goto Lbf
                ea.l0.f4949b = r2
                r7.b(r3)
            Lbf:
                ea.o r7 = ea.o.this
                u7.f r7 = r7.f4954a
                ea.n r0 = new ea.n
                r0.<init>()
                r7.a()
                java.util.concurrent.CopyOnWriteArrayList r7 = r7.f15092j
                r7.add(r0)
            Ld0:
                rb.h r7 = rb.h.f13851a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ea.o.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public o(u7.f fVar, ga.h hVar, ub.h hVar2, j0 j0Var) {
        this.f4954a = fVar;
        this.f4955b = hVar;
        Log.d("FirebaseSessions", "Initializing Firebase Sessions SDK.");
        fVar.a();
        Context applicationContext = fVar.f15084a.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(l0.f4948a);
            x6.b.g0(nc.e0.a(hVar2), null, new a(hVar2, j0Var, null), 3);
        } else {
            StringBuilder l10 = defpackage.f.l("Failed to register lifecycle callbacks, unexpected context ");
            l10.append(applicationContext.getClass());
            l10.append('.');
            Log.e("FirebaseSessions", l10.toString());
        }
    }
}
