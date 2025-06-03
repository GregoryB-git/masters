package H3;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.List;

/* renamed from: H3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0379a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2239a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2240b;

    /* renamed from: c, reason: collision with root package name */
    public final List f2241c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2242d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2243e;

    /* renamed from: f, reason: collision with root package name */
    public final String f2244f;

    /* renamed from: g, reason: collision with root package name */
    public final String f2245g;

    /* renamed from: h, reason: collision with root package name */
    public final E3.e f2246h;

    public C0379a(String str, String str2, List list, String str3, String str4, String str5, String str6, E3.e eVar) {
        this.f2239a = str;
        this.f2240b = str2;
        this.f2241c = list;
        this.f2242d = str3;
        this.f2243e = str4;
        this.f2244f = str5;
        this.f2245g = str6;
        this.f2246h = eVar;
    }

    public static C0379a a(Context context, C c7, String str, String str2, List list, E3.e eVar) {
        String packageName = context.getPackageName();
        String g7 = c7.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String b7 = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C0379a(str, str2, list, g7, packageName, b7, str3, eVar);
    }

    public static String b(PackageInfo packageInfo) {
        long longVersionCode;
        if (Build.VERSION.SDK_INT < 28) {
            return Integer.toString(packageInfo.versionCode);
        }
        longVersionCode = packageInfo.getLongVersionCode();
        return Long.toString(longVersionCode);
    }
}
