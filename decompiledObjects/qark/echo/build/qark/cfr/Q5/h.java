/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 */
package Q5;

import E5.a;
import E5.c;
import E5.p;
import Q5.a;
import Q5.b;
import Q5.c;
import Q5.d;
import Q5.e;
import Q5.f;
import Q5.g;
import Q5.i;
import java.util.ArrayList;
import java.util.List;

public abstract class h {
    public static E5.i a() {
        return new p();
    }

    public static /* synthetic */ void b(i.a object, Object object2, a.e e8) {
        object2 = new ArrayList();
        try {
            object2.add(0, (Object)object.a());
            object = object2;
        }
        catch (Throwable throwable) {
            object = i.a(throwable);
        }
        e8.a(object);
    }

    public static /* synthetic */ void c(i.a object, Object object2, a.e e8) {
        object2 = new ArrayList();
        try {
            object2.add(0, (Object)object.e());
            object = object2;
        }
        catch (Throwable throwable) {
            object = i.a(throwable);
        }
        e8.a(object);
    }

    public static /* synthetic */ void d(i.a object, Object object2, a.e e8) {
        object2 = new ArrayList();
        try {
            object2.add(0, (Object)object.c());
            object = object2;
        }
        catch (Throwable throwable) {
            object = i.a(throwable);
        }
        e8.a(object);
    }

    public static /* synthetic */ void e(i.a object, Object object2, a.e e8) {
        object2 = new ArrayList();
        try {
            object2.add(0, (Object)object.b());
            object = object2;
        }
        catch (Throwable throwable) {
            object = i.a(throwable);
        }
        e8.a(object);
    }

    public static /* synthetic */ void f(i.a object, Object object2, a.e e8) {
        object2 = new ArrayList();
        try {
            object2.add(0, (Object)object.g());
            object = object2;
        }
        catch (Throwable throwable) {
            object = i.a(throwable);
        }
        e8.a(object);
    }

    public static /* synthetic */ void g(i.a object, Object object2, a.e e8) {
        object2 = new ArrayList();
        try {
            object2.add(0, (Object)object.d());
            object = object2;
        }
        catch (Throwable throwable) {
            object = i.a(throwable);
        }
        e8.a(object);
    }

    public static /* synthetic */ void h(i.a a8, Object object, a.e e8) {
        ArrayList arrayList = new ArrayList();
        object = (object = (ArrayList)object).get(0) == null ? null : i.b.values()[(Integer)object.get(0)];
        try {
            arrayList.add(0, (Object)a8.f((i.b)((Object)object)));
            a8 = arrayList;
        }
        catch (Throwable throwable) {
            a8 = i.a(throwable);
        }
        e8.a(a8);
    }

    public static void i(E5.c object, i.a a8) {
        Object object2 = object.b();
        object2 = new E5.a((E5.c)object, "dev.flutter.pigeon.PathProviderApi.getTemporaryPath", h.a(), (c.c)object2);
        if (a8 != null) {
            object2.e(new a(a8));
        } else {
            object2.e(null);
        }
        object2 = object.b();
        object2 = new E5.a((E5.c)object, "dev.flutter.pigeon.PathProviderApi.getApplicationSupportPath", h.a(), (c.c)object2);
        if (a8 != null) {
            object2.e(new b(a8));
        } else {
            object2.e(null);
        }
        object2 = object.b();
        object2 = new E5.a((E5.c)object, "dev.flutter.pigeon.PathProviderApi.getApplicationDocumentsPath", h.a(), (c.c)object2);
        if (a8 != null) {
            object2.e(new c(a8));
        } else {
            object2.e(null);
        }
        object2 = object.b();
        object2 = new E5.a((E5.c)object, "dev.flutter.pigeon.PathProviderApi.getApplicationCachePath", h.a(), (c.c)object2);
        if (a8 != null) {
            object2.e(new d(a8));
        } else {
            object2.e(null);
        }
        object2 = object.b();
        object2 = new E5.a((E5.c)object, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePath", h.a(), (c.c)object2);
        if (a8 != null) {
            object2.e(new e(a8));
        } else {
            object2.e(null);
        }
        object2 = object.b();
        object2 = new E5.a((E5.c)object, "dev.flutter.pigeon.PathProviderApi.getExternalCachePaths", h.a(), (c.c)object2);
        if (a8 != null) {
            object2.e(new f(a8));
        } else {
            object2.e(null);
        }
        object2 = object.b();
        object = new E5.a((E5.c)object, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePaths", h.a(), (c.c)object2);
        if (a8 != null) {
            object.e(new g(a8));
            return;
        }
        object.e(null);
    }
}

