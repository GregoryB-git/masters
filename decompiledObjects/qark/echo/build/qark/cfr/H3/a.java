/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package H3;

import E3.e;
import H3.C;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.appsflyer.internal.g;
import java.util.List;

public class a {
    public final String a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final e h;

    public a(String string2, String string3, List list, String string4, String string5, String string6, String string7, e e8) {
        this.a = string2;
        this.b = string3;
        this.c = list;
        this.d = string4;
        this.e = string5;
        this.f = string6;
        this.g = string7;
        this.h = e8;
    }

    public static a a(Context object, C object2, String string2, String string3, List list, e e8) {
        String string4 = object.getPackageName();
        String string5 = object2.g();
        object = object.getPackageManager().getPackageInfo(string4, 0);
        String string6 = a.b((PackageInfo)object);
        object = object2 = object.versionName;
        if (object2 == null) {
            object = "0.0";
        }
        return new a(string2, string3, list, string5, string4, string6, (String)object, e8);
    }

    public static String b(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Long.toString((long)g.a(packageInfo));
        }
        return Integer.toString((int)packageInfo.versionCode);
    }
}

