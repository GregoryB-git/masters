package R4;

import S4.b;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import kotlin.jvm.internal.Intrinsics;
import p6.F;
import r4.InterfaceC1922b;
import s3.C1947e;
import s3.InterfaceC1948f;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: h, reason: collision with root package name */
    public static final a f5727h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final C1947e f5728a;

    /* renamed from: b, reason: collision with root package name */
    public final R4.b f5729b;

    /* renamed from: c, reason: collision with root package name */
    public final T4.f f5730c;

    /* renamed from: d, reason: collision with root package name */
    public final x f5731d;

    /* renamed from: e, reason: collision with root package name */
    public final s f5732e;

    /* renamed from: f, reason: collision with root package name */
    public final h f5733f;

    /* renamed from: g, reason: collision with root package name */
    public final o f5734g;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public static final class b extends Z5.d {

        /* renamed from: o, reason: collision with root package name */
        public Object f5735o;

        /* renamed from: p, reason: collision with root package name */
        public Object f5736p;

        /* renamed from: q, reason: collision with root package name */
        public Object f5737q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f5738r;

        /* renamed from: t, reason: collision with root package name */
        public int f5740t;

        public b(X5.d dVar) {
            super(dVar);
        }

        @Override // Z5.a
        public final Object invokeSuspend(Object obj) {
            this.f5738r = obj;
            this.f5740t |= Integer.MIN_VALUE;
            return l.this.d(null, this);
        }
    }

    public static final class c implements u {
        public c() {
        }

        @Override // R4.u
        public Object a(p pVar, X5.d dVar) {
            Object c7;
            Object d7 = l.this.d(pVar, dVar);
            c7 = Y5.d.c();
            return d7 == c7 ? d7 : V5.t.f6803a;
        }
    }

    public l(C1947e firebaseApp, s4.i firebaseInstallations, F backgroundDispatcher, F blockingDispatcher, InterfaceC1922b transportFactoryProvider) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(firebaseInstallations, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        Intrinsics.checkNotNullParameter(transportFactoryProvider, "transportFactoryProvider");
        this.f5728a = firebaseApp;
        R4.b a7 = r.f5765a.a(firebaseApp);
        this.f5729b = a7;
        Context m7 = firebaseApp.m();
        Intrinsics.checkNotNullExpressionValue(m7, "firebaseApp.applicationContext");
        T4.f fVar = new T4.f(m7, blockingDispatcher, backgroundDispatcher, firebaseInstallations, a7);
        this.f5730c = fVar;
        w wVar = new w();
        this.f5731d = wVar;
        h hVar = new h(transportFactoryProvider);
        this.f5733f = hVar;
        this.f5734g = new o(firebaseInstallations, hVar);
        s sVar = new s(f(), wVar, null, 4, null);
        this.f5732e = sVar;
        final v vVar = new v(wVar, backgroundDispatcher, new c(), fVar, sVar);
        final Context applicationContext = firebaseApp.m().getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(vVar.d());
            firebaseApp.h(new InterfaceC1948f() { // from class: R4.k
                @Override // s3.InterfaceC1948f
                public final void a(String str, s3.m mVar) {
                    l.b(applicationContext, vVar, str, mVar);
                }
            });
            return;
        }
        Log.e("FirebaseSessions", "Failed to register lifecycle callbacks, unexpected context " + applicationContext.getClass() + '.');
    }

    public static final void b(Context context, v sessionInitiator, String str, s3.m mVar) {
        Intrinsics.checkNotNullParameter(sessionInitiator, "$sessionInitiator");
        Log.w("FirebaseSessions", "FirebaseApp instance deleted. Sessions library will not collect session data.");
        ((Application) context).unregisterActivityLifecycleCallbacks(sessionInitiator.d());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:18|19))(5:20|21|(1:23)(2:26|(1:28)(5:29|(1:31)|13|14|15))|24|25))(1:32))(2:58|(1:60)(1:61))|33|(1:35)(6:36|(2:39|37)|40|41|(3:46|(3:49|(3:51|52|(1:54)(3:55|21|(0)(0)))(1:56)|47)|57)|45)|24|25))|64|6|7|(0)(0)|33|(0)(0)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0032, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0116, code lost:
    
        android.util.Log.w("FirebaseSessions", "FirebaseApp is not initialized. Sessions library will not collect session data.", r11);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(R4.p r11, X5.d r12) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R4.l.d(R4.p, X5.d):java.lang.Object");
    }

    public final void e(S4.b subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        S4.a.f5888a.e(subscriber);
        Log.d("FirebaseSessions", "Registering Sessions SDK subscriber with name: " + subscriber.a() + ", data collection enabled: " + subscriber.c());
        if (this.f5732e.e()) {
            subscriber.b(new b.C0095b(this.f5732e.d().b()));
        }
    }

    public final boolean f() {
        return Math.random() <= this.f5730c.b();
    }
}
