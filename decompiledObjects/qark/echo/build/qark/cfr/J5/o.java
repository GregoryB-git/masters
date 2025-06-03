/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.ArrayList
 */
package J5;

import E5.a;
import E5.c;
import E5.i;
import J5.l;
import J5.m;
import J5.n;
import J5.p;
import java.util.ArrayList;

public abstract class o {
    public static i a() {
        return new E5.p();
    }

    public static /* synthetic */ void b(p.a a8, Object object, final a.e e8) {
        ArrayList arrayList = new ArrayList();
        object = (ArrayList)object;
        a8.f((String)object.get(0), (Boolean)object.get(1), new p.f(){

            @Override
            public void b(Throwable throwable) {
                throwable = p.a(throwable);
                e8.a((Object)throwable);
            }

            public void c(Void void_) {
                ArrayList.this.add(0, (Object)null);
                e8.a((Object)ArrayList.this);
            }
        });
    }

    public static /* synthetic */ void c(p.a a8, Object object, final a.e e8) {
        ArrayList arrayList = new ArrayList();
        object = (ArrayList)object;
        a8.b((String)object.get(0), (Boolean)object.get(1), new p.f(){

            @Override
            public void b(Throwable throwable) {
                throwable = p.a(throwable);
                e8.a((Object)throwable);
            }

            public void c(Void void_) {
                ArrayList.this.add(0, (Object)null);
                e8.a((Object)ArrayList.this);
            }
        });
    }

    public static /* synthetic */ void d(p.a a8, Object object, final a.e e8) {
        ArrayList arrayList = new ArrayList();
        a8.d((String)((ArrayList)object).get(0), new p.f(){

            @Override
            public void b(Throwable throwable) {
                throwable = p.a(throwable);
                e8.a((Object)throwable);
            }

            public void c(Void void_) {
                ArrayList.this.add(0, (Object)null);
                e8.a((Object)ArrayList.this);
            }
        });
    }

    public static void e(c object, p.a a8) {
        a a9 = new a((c)object, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", o.a());
        if (a8 != null) {
            a9.e(new l(a8));
        } else {
            a9.e(null);
        }
        a9 = new a((c)object, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", o.a());
        if (a8 != null) {
            a9.e(new m(a8));
        } else {
            a9.e(null);
        }
        object = new a((c)object, "dev.flutter.pigeon.FirebaseAppHostApi.delete", o.a());
        if (a8 != null) {
            object.e(new n(a8));
            return;
        }
        object.e(null);
    }

}

