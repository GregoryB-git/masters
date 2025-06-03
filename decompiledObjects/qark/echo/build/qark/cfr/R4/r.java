/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package R4;

import R4.a;
import R4.b;
import R4.c;
import R4.d;
import R4.f;
import R4.j;
import R4.n;
import R4.p;
import R4.q;
import R4.t;
import S4.b;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import s3.e;
import s3.m;

public final class r {
    public static final r a = new r();
    public static final j4.a b;

    static {
        j4.a a8 = new l4.d().j(c.a).k(true).i();
        Intrinsics.checkNotNullExpressionValue(a8, "JsonDataEncoderBuilder()\u2026lues(true)\n      .build()");
        b = a8;
    }

    public final b a(e object) {
        Intrinsics.checkNotNullParameter(object, "firebaseApp");
        Object object2 = object.m();
        Intrinsics.checkNotNullExpressionValue(object2, "firebaseApp.applicationContext");
        String string2 = object2.getPackageName();
        Object object3 = object2.getPackageManager().getPackageInfo(string2, 0);
        object2 = Build.VERSION.SDK_INT >= 28 ? String.valueOf((long)com.appsflyer.internal.g.a((PackageInfo)object3)) : String.valueOf((int)object3.versionCode);
        String string3 = object.r().c();
        Intrinsics.checkNotNullExpressionValue(string3, "firebaseApp.options.applicationId");
        String string4 = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(string4, "MODEL");
        String string5 = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(string5, "RELEASE");
        n n8 = n.s;
        Intrinsics.checkNotNullExpressionValue(string2, "packageName");
        object = object3 = object3.versionName;
        if (object3 == null) {
            object = object2;
        }
        object3 = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(object3, "MANUFACTURER");
        return new b(string3, string4, "1.1.0", string5, n8, new a(string2, (String)object, (String)object2, (String)object3));
    }

    public final j4.a b() {
        return b;
    }

    public final q c(e e8, p p8, T4.f f8, Map map) {
        Intrinsics.checkNotNullParameter(e8, "firebaseApp");
        Intrinsics.checkNotNullParameter(p8, "sessionDetails");
        Intrinsics.checkNotNullParameter(f8, "sessionsSettings");
        Intrinsics.checkNotNullParameter((Object)map, "subscribers");
        return new q(j.q, new t(p8.b(), p8.a(), p8.c(), p8.d(), new f(this.d((S4.b)map.get((Object)b.a.p)), this.d((S4.b)map.get((Object)b.a.o)), f8.b()), null, 32, null), this.a(e8));
    }

    public final d d(S4.b b8) {
        if (b8 == null) {
            return d.q;
        }
        if (b8.c()) {
            return d.r;
        }
        return d.s;
    }
}

