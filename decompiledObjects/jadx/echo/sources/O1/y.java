package O1;

import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import kotlin.jvm.internal.Intrinsics;
import x1.C2146B;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public static final y f3967a = new y();

    public interface a {
        void a(String str);
    }

    public static final void d(a callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        y yVar = f3967a;
        if (yVar.b()) {
            return;
        }
        yVar.c(callback);
    }

    public final boolean b() {
        return C2146B.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("is_referrer_updated", false);
    }

    public final void c(a aVar) {
        InstallReferrerClient build = InstallReferrerClient.newBuilder(C2146B.l()).build();
        try {
            build.startConnection(new b(build, aVar));
        } catch (Exception unused) {
        }
    }

    public final void e() {
        C2146B.l().getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putBoolean("is_referrer_updated", true).apply();
    }

    public static final class b implements InstallReferrerStateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InstallReferrerClient f3968a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f3969b;

        public b(InstallReferrerClient installReferrerClient, a aVar) {
            this.f3968a = installReferrerClient;
            this.f3969b = aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0036, code lost:
        
            if (r0 != false) goto L21;
         */
        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onInstallReferrerSetupFinished(int r5) {
            /*
                r4 = this;
                boolean r0 = T1.a.d(r4)
                if (r0 == 0) goto L7
                return
            L7:
                r0 = 2
                if (r5 == 0) goto L15
                if (r5 == r0) goto Ld
                goto L40
            Ld:
                O1.y r5 = O1.y.f3967a     // Catch: java.lang.Throwable -> L13
            Lf:
                O1.y.a(r5)     // Catch: java.lang.Throwable -> L13
                goto L40
            L13:
                r5 = move-exception
                goto L46
            L15:
                com.android.installreferrer.api.InstallReferrerClient r5 = r4.f3968a     // Catch: java.lang.Throwable -> L13 android.os.RemoteException -> L49
                com.android.installreferrer.api.ReferrerDetails r5 = r5.getInstallReferrer()     // Catch: java.lang.Throwable -> L13 android.os.RemoteException -> L49
                java.lang.String r1 = "{\n                      referrerClient.installReferrer\n                    }"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r1)     // Catch: java.lang.Throwable -> L13 android.os.RemoteException -> L49
                java.lang.String r5 = r5.getInstallReferrer()     // Catch: java.lang.Throwable -> L13
                if (r5 == 0) goto L3d
                java.lang.String r1 = "fb"
                r2 = 0
                r3 = 0
                boolean r1 = kotlin.text.i.v(r5, r1, r3, r0, r2)     // Catch: java.lang.Throwable -> L13
                if (r1 != 0) goto L38
                java.lang.String r1 = "facebook"
                boolean r0 = kotlin.text.i.v(r5, r1, r3, r0, r2)     // Catch: java.lang.Throwable -> L13
                if (r0 == 0) goto L3d
            L38:
                O1.y$a r0 = r4.f3969b     // Catch: java.lang.Throwable -> L13
                r0.a(r5)     // Catch: java.lang.Throwable -> L13
            L3d:
                O1.y r5 = O1.y.f3967a     // Catch: java.lang.Throwable -> L13
                goto Lf
            L40:
                com.android.installreferrer.api.InstallReferrerClient r5 = r4.f3968a     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L45
                r5.endConnection()     // Catch: java.lang.Throwable -> L13 java.lang.Exception -> L45
            L45:
                return
            L46:
                T1.a.b(r5, r4)
            L49:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: O1.y.b.onInstallReferrerSetupFinished(int):void");
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
        }
    }
}
