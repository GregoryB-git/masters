package ea;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Process;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final z f5010a = new z();

    /* renamed from: b, reason: collision with root package name */
    public static final a9.d f5011b;

    static {
        a9.e eVar = new a9.e();
        eVar.a(y.class, g.f4916a);
        eVar.a(f0.class, h.f4922a);
        eVar.a(j.class, e.f4896a);
        eVar.a(b.class, d.f4889a);
        eVar.a(a.class, c.f4879a);
        eVar.a(s.class, f.f4905a);
        eVar.f245d = true;
        f5011b = new a9.d(eVar);
    }

    public static b a(u7.f fVar) {
        String valueOf;
        Object obj;
        long longVersionCode;
        fVar.a();
        Context context = fVar.f15084a;
        ec.i.d(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            valueOf = String.valueOf(longVersionCode);
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        String str = valueOf;
        fVar.a();
        String str2 = fVar.f15086c.f15097b;
        ec.i.d(str2, "firebaseApp.options.applicationId");
        String str3 = Build.MODEL;
        ec.i.d(str3, "MODEL");
        String str4 = Build.VERSION.RELEASE;
        ec.i.d(str4, "RELEASE");
        ec.i.d(packageName, "packageName");
        String str5 = packageInfo.versionName;
        String str6 = str5 == null ? str : str5;
        String str7 = Build.MANUFACTURER;
        ec.i.d(str7, "MANUFACTURER");
        fVar.a();
        Context context2 = fVar.f15084a;
        ec.i.d(context2, "firebaseApp.applicationContext");
        int myPid = Process.myPid();
        Iterator it = t.a(context2).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((s) obj).f4972b == myPid) {
                break;
            }
        }
        s sVar = (s) obj;
        if (sVar == null) {
            sVar = new s(myPid, 0, t.b(), false);
        }
        fVar.a();
        Context context3 = fVar.f15084a;
        ec.i.d(context3, "firebaseApp.applicationContext");
        return new b(str2, str3, str4, new a(packageName, str6, str, str7, sVar, t.a(context3)));
    }
}
