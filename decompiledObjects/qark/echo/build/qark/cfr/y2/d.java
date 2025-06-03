/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.Collection
 *  java.util.Collections
 */
package y2;

import A2.c;
import A2.d;
import A2.n;
import E2.l;
import V2.j;
import V2.k;
import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Collections;
import y2.a;
import y2.e;
import y2.h;
import z2.C;
import z2.M;
import z2.b;
import z2.i;
import z2.m;
import z2.p;
import z2.x;

public abstract class d {
    public final Context a;
    public final String b;
    public final y2.a c;
    public final a.d d;
    public final b e;
    public final Looper f;
    public final int g;
    public final e h;
    public final z2.l i;
    public final z2.e j;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public d(Context object, Activity activity, y2.a object2, a.d d8, a a8) {
        String string2;
        n.j(object, "Null context is not permitted.");
        n.j(object2, "Api must not be null.");
        n.j(a8, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        this.a = object.getApplicationContext();
        boolean bl = l.k();
        String string3 = string2 = null;
        if (bl) {
            try {
                string3 = (String)Context.class.getMethod("getAttributionTag", new Class[0]).invoke(object, new Object[0]);
            }
            catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException noSuchMethodException) {
                string3 = string2;
            }
        }
        this.b = string3;
        this.c = object2;
        this.d = d8;
        this.f = a8.b;
        this.e = object = b.a((y2.a)object2, d8, string3);
        this.h = new C(this);
        this.j = object2 = z2.e.x(this.a);
        this.g = object2.m();
        this.i = a8.a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            p.u(activity, (z2.e)object2, (b)object);
        }
        object2.b(this);
    }

    public d(Context context, y2.a a8, a.d d8, a a9) {
        this(context, null, a8, d8, a9);
    }

    public d.a b() {
        d.a a8 = new d.a();
        a8.d(null);
        a8.c((Collection)Collections.emptySet());
        a8.e(this.a.getClass().getName());
        a8.b(this.a.getPackageName());
        return a8;
    }

    public j c(m m8) {
        return this.i(2, m8);
    }

    public final b d() {
        return this.e;
    }

    public String e() {
        return this.b;
    }

    public final int f() {
        return this.g;
    }

    public final a.f g(Looper object, x object2) {
        A2.d d8 = this.b().a();
        object = ((a.a)n.i(this.c.a())).a(this.a, (Looper)object, d8, this.d, (e.a)object2, (e.b)object2);
        object2 = this.e();
        if (object2 != null && object instanceof c) {
            ((c)object).P((String)object2);
        }
        if (object2 != null) {
            if (!(object instanceof i)) {
                return object;
            }
            object = (i)object;
            throw null;
        }
        return object;
    }

    public final M h(Context context, Handler handler) {
        return new M(context, handler, this.b().a());
    }

    public final j i(int n8, m m8) {
        k k8 = new k();
        this.j.D(this, n8, m8, k8, this.i);
        return k8.a();
    }

    public static class y2.d$a {
        public static final y2.d$a c = new a().a();
        public final z2.l a;
        public final Looper b;

        public y2.d$a(z2.l l8, Account account, Looper looper) {
            this.a = l8;
            this.b = looper;
        }

        public /* synthetic */ y2.d$a(z2.l l8, Account account, Looper looper, h h8) {
            this(l8, null, looper);
        }

        public static class a {
            public z2.l a;
            public Looper b;

            public y2.d$a a() {
                if (this.a == null) {
                    this.a = new z2.a();
                }
                if (this.b == null) {
                    this.b = Looper.getMainLooper();
                }
                return new y2.d$a(this.a, null, this.b, null);
            }
        }

    }

}

