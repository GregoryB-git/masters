/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Map
 */
package S5;

import E5.a;
import E5.i;
import S5.a;
import S5.b;
import S5.c;
import S5.d;
import S5.e;
import S5.f;
import java.util.ArrayList;
import java.util.Map;

public abstract class g {
    public static i a() {
        return a.c.d;
    }

    public static /* synthetic */ void b(a.b b8, Object object, a.e e8) {
        ArrayList arrayList = new ArrayList();
        object = (String)((ArrayList)object).get(0);
        try {
            arrayList.add(0, (Object)b8.a((String)object));
            b8 = arrayList;
        }
        catch (Throwable throwable) {
            b8 = a.a(throwable);
        }
        e8.a(b8);
    }

    public static /* synthetic */ void c(a.b b8, Object object, a.e e8) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList)object;
        object = (String)arrayList2.get(0);
        arrayList2 = (Map)arrayList2.get(1);
        try {
            arrayList.add(0, (Object)b8.d((String)object, (Map)arrayList2));
            b8 = arrayList;
        }
        catch (Throwable throwable) {
            b8 = a.a(throwable);
        }
        e8.a(b8);
    }

    public static /* synthetic */ void d(a.b b8, Object object, a.e e8) {
        ArrayList arrayList = new ArrayList();
        Object object2 = (ArrayList)object;
        object = (String)object2.get(0);
        Boolean bl = (Boolean)object2.get(1);
        object2 = (a.d)object2.get(2);
        try {
            arrayList.add(0, (Object)b8.b((String)object, bl, (a.d)object2));
            b8 = arrayList;
        }
        catch (Throwable throwable) {
            b8 = a.a(throwable);
        }
        e8.a(b8);
    }

    public static /* synthetic */ void e(a.b object, Object object2, a.e e8) {
        object2 = new ArrayList();
        try {
            object2.add(0, (Object)object.e());
            object = object2;
        }
        catch (Throwable throwable) {
            object = a.a(throwable);
        }
        e8.a(object);
    }

    public static /* synthetic */ void f(a.b object, Object object2, a.e e8) {
        object2 = new ArrayList();
        try {
            object.c();
            object2.add(0, (Object)null);
            object = object2;
        }
        catch (Throwable throwable) {
            object = a.a(throwable);
        }
        e8.a(object);
    }

    public static void g(E5.c object, a.b b8) {
        E5.a a8 = new E5.a((E5.c)object, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.canLaunchUrl", g.a());
        if (b8 != null) {
            a8.e(new b(b8));
        } else {
            a8.e(null);
        }
        a8 = new E5.a((E5.c)object, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.launchUrl", g.a());
        if (b8 != null) {
            a8.e(new c(b8));
        } else {
            a8.e(null);
        }
        a8 = new E5.a((E5.c)object, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.openUrlInApp", g.a());
        if (b8 != null) {
            a8.e(new d(b8));
        } else {
            a8.e(null);
        }
        a8 = new E5.a((E5.c)object, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.supportsCustomTabs", g.a());
        if (b8 != null) {
            a8.e(new e(b8));
        } else {
            a8.e(null);
        }
        object = new E5.a((E5.c)object, "dev.flutter.pigeon.url_launcher_android.UrlLauncherApi.closeWebView", g.a());
        if (b8 != null) {
            object.e(new f(b8));
            return;
        }
        object.e(null);
    }
}

