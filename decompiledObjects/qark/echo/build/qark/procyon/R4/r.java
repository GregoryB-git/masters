// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R4;

import java.util.Map;
import T4.f;
import android.content.pm.PackageInfo;
import android.content.Context;
import android.os.Build;
import com.appsflyer.internal.g;
import android.os.Build$VERSION;
import s3.e;
import kotlin.jvm.internal.Intrinsics;
import l4.d;
import j4.a;

public final class r
{
    public static final r a;
    public static final a b;
    
    static {
        a = new r();
        final a i = new d().j(c.a).k(true).i();
        Intrinsics.checkNotNullExpressionValue(i, "JsonDataEncoderBuilder()\u2026lues(true)\n      .build()");
        b = i;
    }
    
    public final b a(final e e) {
        Intrinsics.checkNotNullParameter(e, "firebaseApp");
        final Context m = e.m();
        Intrinsics.checkNotNullExpressionValue(m, "firebaseApp.applicationContext");
        final String packageName = m.getPackageName();
        final PackageInfo packageInfo = m.getPackageManager().getPackageInfo(packageName, 0);
        String s;
        if (Build$VERSION.SDK_INT >= 28) {
            s = String.valueOf(g.a(packageInfo));
        }
        else {
            s = String.valueOf(packageInfo.versionCode);
        }
        final String c = e.r().c();
        Intrinsics.checkNotNullExpressionValue(c, "firebaseApp.options.applicationId");
        final String model = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(model, "MODEL");
        final String release = Build$VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(release, "RELEASE");
        final n s2 = n.s;
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        String versionName;
        if ((versionName = packageInfo.versionName) == null) {
            versionName = s;
        }
        final String manufacturer = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(manufacturer, "MANUFACTURER");
        return new b(c, model, "1.1.0", release, s2, new R4.a(packageName, versionName, s, manufacturer));
    }
    
    public final a b() {
        return r.b;
    }
    
    public final q c(final e e, final p p4, final f f, final Map map) {
        Intrinsics.checkNotNullParameter(e, "firebaseApp");
        Intrinsics.checkNotNullParameter(p4, "sessionDetails");
        Intrinsics.checkNotNullParameter(f, "sessionsSettings");
        Intrinsics.checkNotNullParameter(map, "subscribers");
        return new q(j.q, new t(p4.b(), p4.a(), p4.c(), p4.d(), new R4.f(this.d(map.get(S4.b.a.p)), this.d(map.get(S4.b.a.o)), f.b()), null, 32, null), this.a(e));
    }
    
    public final R4.d d(final S4.b b) {
        if (b == null) {
            return R4.d.q;
        }
        if (b.c()) {
            return R4.d.r;
        }
        return R4.d.s;
    }
}
