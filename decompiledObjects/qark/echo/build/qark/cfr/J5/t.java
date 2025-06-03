/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 */
package J5;

import E5.a;
import E5.c;
import E5.i;
import J5.p;
import J5.q;
import J5.r;
import J5.s;
import java.util.ArrayList;
import java.util.List;

public abstract class t {
    public static i a() {
        return p.c.d;
    }

    public static /* synthetic */ void b(p.b b8, Object object, final a.e e8) {
        ArrayList arrayList = new ArrayList();
        object = (ArrayList)object;
        b8.e((String)object.get(0), (p.d)object.get(1), new p.f(){

            @Override
            public void b(Throwable throwable) {
                throwable = p.a(throwable);
                e8.a((Object)throwable);
            }

            public void c(p.e e82) {
                ArrayList.this.add(0, (Object)e82);
                e8.a((Object)ArrayList.this);
            }
        });
    }

    public static /* synthetic */ void c(p.b b8, Object object, final a.e e8) {
        b8.a(new p.f(){

            @Override
            public void b(Throwable throwable) {
                throwable = p.a(throwable);
                e8.a((Object)throwable);
            }

            public void c(List list) {
                ArrayList.this.add(0, (Object)list);
                e8.a((Object)ArrayList.this);
            }
        });
    }

    public static /* synthetic */ void d(p.b b8, Object object, final a.e e8) {
        b8.c(new p.f(){

            @Override
            public void b(Throwable throwable) {
                throwable = p.a(throwable);
                e8.a((Object)throwable);
            }

            public void c(p.d d8) {
                ArrayList.this.add(0, (Object)d8);
                e8.a((Object)ArrayList.this);
            }
        });
    }

    public static void e(c object, p.b b8) {
        a a8 = new a((c)object, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeApp", t.a());
        if (b8 != null) {
            a8.e(new q(b8));
        } else {
            a8.e(null);
        }
        a8 = new a((c)object, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeCore", t.a());
        if (b8 != null) {
            a8.e(new r(b8));
        } else {
            a8.e(null);
        }
        object = new a((c)object, "dev.flutter.pigeon.FirebaseCoreHostApi.optionsFromResource", t.a());
        if (b8 != null) {
            object.e(new s(b8));
            return;
        }
        object.e(null);
    }

}

