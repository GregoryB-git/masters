/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 */
package D3;

import D3.d;
import E3.a;
import E3.f;
import H3.A;
import H3.C;
import H3.s;
import H3.y;
import R4.l;
import V2.b;
import V2.j;
import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import s3.e;
import s3.m;
import s4.i;

public class g {
    public final s a;

    public g(s s8) {
        this.a = s8;
    }

    public static g d() {
        g g8 = (g)e.o().k(g.class);
        if (g8 != null) {
            return g8;
        }
        throw new NullPointerException("FirebaseCrashlytics component is not present.");
    }

    public static g e(e object, i object2, l object3, r4.a object4, r4.a object5) {
        Context context = object.m();
        Object object6 = context.getPackageName();
        Object object7 = f.f();
        Object object8 = new StringBuilder();
        object8.append("Initializing Firebase Crashlytics ");
        object8.append(s.l());
        object8.append(" for ");
        object8.append((String)object6);
        object7.g(object8.toString());
        object7 = new M3.g(context);
        object8 = new y((e)object);
        object2 = new C(context, (String)object6, (i)object2, (y)object8);
        object4 = new E3.d((r4.a)object4);
        object5 = new d((r4.a)object5);
        object6 = A.c("Crashlytics Exception Handler");
        Object object9 = new H3.m((y)object8, (M3.g)object7);
        object3.e((S4.b)object9);
        object3 = new s((e)object, (C)object2, (a)object4, (y)object8, object5.e(), object5.d(), (M3.g)object7, (ExecutorService)object6, (H3.m)object9);
        object = object.r().c();
        object4 = H3.i.n(context);
        object5 = H3.i.k(context);
        object6 = f.f();
        object9 = new StringBuilder();
        object9.append("Mapping file ID is: ");
        object9.append((String)object4);
        object6.b(object9.toString());
        object6 = object5.iterator();
        while (object6.hasNext()) {
            object9 = (H3.f)object6.next();
            f.f().b(String.format((String)"Build id for %s on %s: %s", (Object[])new Object[]{object9.c(), object9.a(), object9.b()}));
        }
        object6 = new E3.e(context);
        try {
            object4 = H3.a.a(context, (C)object2, (String)object, (String)object4, (List)object5, (E3.e)object6);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            f.f().e("Error retrieving app package info.", (Throwable)nameNotFoundException);
            return null;
        }
        object5 = f.f();
        object6 = new StringBuilder();
        object6.append("Installer package name is: ");
        object6.append(object4.d);
        object5.i(object6.toString());
        object5 = A.c("com.google.firebase.crashlytics.startup");
        object = O3.f.l(context, (String)object, (C)object2, new L3.b(), object4.f, object4.g, (M3.g)object7, (y)object8);
        object.p((Executor)object5).g((Executor)object5, new b(){

            @Override
            public Object a(j j8) {
                if (!j8.n()) {
                    f.f().e("Error fetching settings.", (Throwable)j8.i());
                }
                return null;
            }
        });
        V2.m.c((Executor)object5, new Callable((s)object3, (O3.f)object){
            public final /* synthetic */ s p;
            public final /* synthetic */ O3.f q;
            {
                this.p = s8;
                this.q = f8;
            }

            public Void a() {
                if (o) {
                    this.p.j(this.q);
                }
                return null;
            }
        });
        return new g((s)object3);
    }

    public j a() {
        return this.a.e();
    }

    public void b() {
        this.a.f();
    }

    public boolean c() {
        return this.a.g();
    }

    public void f(String string2) {
        this.a.n(string2);
    }

    public void g(Throwable throwable) {
        if (throwable == null) {
            f.f().k("A null value was passed to recordException. Ignoring.");
            return;
        }
        this.a.o(throwable);
    }

    public void h() {
        this.a.t();
    }

    public void i(Boolean bl) {
        this.a.u(bl);
    }

    public void j(boolean bl) {
        this.a.u(bl);
    }

    public void k(String string2, String string3) {
        this.a.v(string2, string3);
    }

    public void l(String string2) {
        this.a.x(string2);
    }

}

