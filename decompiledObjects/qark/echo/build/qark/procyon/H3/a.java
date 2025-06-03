// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import com.appsflyer.internal.g;
import android.os.Build$VERSION;
import android.content.pm.PackageInfo;
import android.content.Context;
import E3.e;
import java.util.List;

public class a
{
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final e h;
    
    public a(final String a, final String b, final List c, final String d, final String e, final String f, final String g, final e h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }
    
    public static a a(final Context context, final C c, final String s, final String s2, final List list, final e e) {
        final String packageName = context.getPackageName();
        final String g = c.g();
        final PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        final String b = b(packageInfo);
        String versionName;
        if ((versionName = packageInfo.versionName) == null) {
            versionName = "0.0";
        }
        return new a(s, s2, list, g, packageName, b, versionName, e);
    }
    
    public static String b(final PackageInfo packageInfo) {
        if (Build$VERSION.SDK_INT >= 28) {
            return Long.toString(g.a(packageInfo));
        }
        return Integer.toString(packageInfo.versionCode);
    }
}
