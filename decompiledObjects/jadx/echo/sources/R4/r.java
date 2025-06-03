package R4;

import S4.b;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import j4.InterfaceC1375a;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import l4.C1610d;
import s3.C1947e;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final r f5765a = new r();

    /* renamed from: b, reason: collision with root package name */
    public static final InterfaceC1375a f5766b;

    static {
        InterfaceC1375a i7 = new C1610d().j(c.f5679a).k(true).i();
        Intrinsics.checkNotNullExpressionValue(i7, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        f5766b = i7;
    }

    public final b a(C1947e firebaseApp) {
        String valueOf;
        long longVersionCode;
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Context m7 = firebaseApp.m();
        Intrinsics.checkNotNullExpressionValue(m7, "firebaseApp.applicationContext");
        String packageName = m7.getPackageName();
        PackageInfo packageInfo = m7.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            valueOf = String.valueOf(longVersionCode);
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String c7 = firebaseApp.r().c();
        Intrinsics.checkNotNullExpressionValue(c7, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        n nVar = n.LOG_ENVIRONMENT_PROD;
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        String str = packageInfo.versionName;
        if (str == null) {
            str = valueOf;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        return new b(c7, MODEL, "1.1.0", RELEASE, nVar, new a(packageName, str, valueOf, MANUFACTURER));
    }

    public final InterfaceC1375a b() {
        return f5766b;
    }

    public final q c(C1947e firebaseApp, p sessionDetails, T4.f sessionsSettings, Map subscribers) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        Intrinsics.checkNotNullParameter(sessionsSettings, "sessionsSettings");
        Intrinsics.checkNotNullParameter(subscribers, "subscribers");
        return new q(j.SESSION_START, new t(sessionDetails.b(), sessionDetails.a(), sessionDetails.c(), sessionDetails.d(), new f(d((S4.b) subscribers.get(b.a.PERFORMANCE)), d((S4.b) subscribers.get(b.a.CRASHLYTICS)), sessionsSettings.b()), null, 32, null), a(firebaseApp));
    }

    public final d d(S4.b bVar) {
        return bVar == null ? d.COLLECTION_SDK_NOT_INSTALLED : bVar.c() ? d.COLLECTION_ENABLED : d.COLLECTION_DISABLED;
    }
}
