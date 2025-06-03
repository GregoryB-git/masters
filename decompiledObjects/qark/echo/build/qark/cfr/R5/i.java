/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Long
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.Map
 */
package R5;

import E5.a;
import E5.c;
import E5.p;
import R5.a;
import R5.b;
import R5.c;
import R5.d;
import R5.e;
import R5.f;
import R5.g;
import R5.h;
import R5.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class i {
    public static E5.i a() {
        return new p();
    }

    public static /* synthetic */ void b(j.a a8, Object object, a.e e8) {
        ArrayList arrayList = new ArrayList();
        object = (String)((ArrayList)object).get(0);
        try {
            arrayList.add(0, (Object)a8.remove((String)object));
            a8 = arrayList;
        }
        catch (Throwable throwable) {
            a8 = j.a(throwable);
        }
        e8.a(a8);
    }

    public static /* synthetic */ void c(j.a a8, Object object, a.e e8) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList)object;
        object = (String)arrayList2.get(0);
        arrayList2 = (Boolean)arrayList2.get(1);
        try {
            arrayList.add(0, (Object)a8.f((String)object, (Boolean)arrayList2));
            a8 = arrayList;
        }
        catch (Throwable throwable) {
            a8 = j.a(throwable);
        }
        e8.a(a8);
    }

    public static /* synthetic */ void d(j.a a8, Object object, a.e e8) {
        ArrayList arrayList = new ArrayList();
        Object object2 = (ArrayList)object;
        object = (String)object2.get(0);
        object2 = (String)object2.get(1);
        try {
            arrayList.add(0, (Object)a8.c((String)object, (String)object2));
            a8 = arrayList;
        }
        catch (Throwable throwable) {
            a8 = j.a(throwable);
        }
        e8.a(a8);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static /* synthetic */ void e(j.a var0, Object var1_2, a.e var2_3) {
        block2 : {
            var3_4 = new ArrayList();
            var1_2 = (ArrayList)var1_2;
            var4_5 = (String)var1_2.get(0);
            if ((var1_2 = (Number)var1_2.get(1)) != null) break block2;
            var1_2 = null;
            ** GOTO lbl10
        }
        try {
            var1_2 = var1_2.longValue();
lbl10: // 2 sources:
            var3_4.add(0, (Object)var0.a(var4_5, (Long)var1_2));
            var0 = var3_4;
        }
        catch (Throwable var0_1) {
            var0 = j.a(var0_1);
        }
        var2_3.a(var0);
    }

    public static /* synthetic */ void f(j.a a8, Object object, a.e e8) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList)object;
        object = (String)arrayList2.get(0);
        arrayList2 = (Double)arrayList2.get(1);
        try {
            arrayList.add(0, (Object)a8.g((String)object, (Double)arrayList2));
            a8 = arrayList;
        }
        catch (Throwable throwable) {
            a8 = j.a(throwable);
        }
        e8.a(a8);
    }

    public static /* synthetic */ void g(j.a a8, Object object, a.e e8) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList)object;
        object = (String)arrayList2.get(0);
        arrayList2 = (List)arrayList2.get(1);
        try {
            arrayList.add(0, (Object)a8.e((String)object, (List)arrayList2));
            a8 = arrayList;
        }
        catch (Throwable throwable) {
            a8 = j.a(throwable);
        }
        e8.a(a8);
    }

    public static /* synthetic */ void h(j.a a8, Object object, a.e e8) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList)object;
        object = (String)arrayList2.get(0);
        arrayList2 = (List)arrayList2.get(1);
        try {
            arrayList.add(0, (Object)a8.d((String)object, (List)arrayList2));
            a8 = arrayList;
        }
        catch (Throwable throwable) {
            a8 = j.a(throwable);
        }
        e8.a(a8);
    }

    public static /* synthetic */ void i(j.a a8, Object object, a.e e8) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = (ArrayList)object;
        object = (String)arrayList2.get(0);
        arrayList2 = (List)arrayList2.get(1);
        try {
            arrayList.add(0, (Object)a8.b((String)object, (List)arrayList2));
            a8 = arrayList;
        }
        catch (Throwable throwable) {
            a8 = j.a(throwable);
        }
        e8.a(a8);
    }

    public static void j(E5.c object, j.a a8) {
        Object object2 = object.b();
        object2 = new E5.a((E5.c)object, "dev.flutter.pigeon.SharedPreferencesApi.remove", i.a(), (c.c)object2);
        if (a8 != null) {
            object2.e(new a(a8));
        } else {
            object2.e(null);
        }
        object2 = object.b();
        object2 = new E5.a((E5.c)object, "dev.flutter.pigeon.SharedPreferencesApi.setBool", i.a(), (c.c)object2);
        if (a8 != null) {
            object2.e(new b(a8));
        } else {
            object2.e(null);
        }
        object2 = object.b();
        object2 = new E5.a((E5.c)object, "dev.flutter.pigeon.SharedPreferencesApi.setString", i.a(), (c.c)object2);
        if (a8 != null) {
            object2.e(new c(a8));
        } else {
            object2.e(null);
        }
        object2 = object.b();
        object2 = new E5.a((E5.c)object, "dev.flutter.pigeon.SharedPreferencesApi.setInt", i.a(), (c.c)object2);
        if (a8 != null) {
            object2.e(new d(a8));
        } else {
            object2.e(null);
        }
        object2 = object.b();
        object2 = new E5.a((E5.c)object, "dev.flutter.pigeon.SharedPreferencesApi.setDouble", i.a(), (c.c)object2);
        if (a8 != null) {
            object2.e(new e(a8));
        } else {
            object2.e(null);
        }
        object2 = object.b();
        object2 = new E5.a((E5.c)object, "dev.flutter.pigeon.SharedPreferencesApi.setStringList", i.a(), (c.c)object2);
        if (a8 != null) {
            object2.e(new f(a8));
        } else {
            object2.e(null);
        }
        object2 = object.b();
        object2 = new E5.a((E5.c)object, "dev.flutter.pigeon.SharedPreferencesApi.clear", i.a(), (c.c)object2);
        if (a8 != null) {
            object2.e(new g(a8));
        } else {
            object2.e(null);
        }
        object2 = object.b();
        object = new E5.a((E5.c)object, "dev.flutter.pigeon.SharedPreferencesApi.getAll", i.a(), (c.c)object2);
        if (a8 != null) {
            object.e(new h(a8));
            return;
        }
        object.e(null);
    }
}

