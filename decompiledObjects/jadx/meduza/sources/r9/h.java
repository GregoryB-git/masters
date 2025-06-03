package r9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final Context f13823a;

    /* renamed from: b, reason: collision with root package name */
    public String f13824b;

    /* renamed from: c, reason: collision with root package name */
    public String f13825c;

    /* renamed from: d, reason: collision with root package name */
    public int f13826d;

    /* renamed from: e, reason: collision with root package name */
    public int f13827e = 0;

    public h(Context context) {
        this.f13823a = context;
    }

    public static String a(u7.f fVar) {
        fVar.a();
        String str = fVar.f15086c.f15100e;
        if (str != null) {
            return str;
        }
        fVar.a();
        String str2 = fVar.f15086c.f15097b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] split = str2.split(":");
        if (split.length < 2) {
            return null;
        }
        String str3 = split[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public final PackageInfo b(String str) {
        try {
            return this.f13823a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e10) {
            String valueOf = String.valueOf(e10);
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
            sb2.append("Failed to find package ");
            sb2.append(valueOf);
            Log.w("FirebaseInstanceId", sb2.toString());
            return null;
        }
    }

    public final synchronized void c() {
        PackageInfo b10 = b(this.f13823a.getPackageName());
        if (b10 != null) {
            this.f13824b = Integer.toString(b10.versionCode);
            this.f13825c = b10.versionName;
        }
    }
}
