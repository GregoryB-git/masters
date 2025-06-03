package H3;

import android.content.Context;

/* loaded from: classes.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    public String f2224a;

    public static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    public synchronized String a(Context context) {
        try {
            if (this.f2224a == null) {
                this.f2224a = b(context);
            }
        } finally {
        }
        return "".equals(this.f2224a) ? null : this.f2224a;
    }
}
