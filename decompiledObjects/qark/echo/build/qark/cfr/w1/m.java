/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 */
package w1;

import A5.a;
import E5.c;
import E5.k;
import E5.o;
import android.app.Activity;
import android.content.Context;
import w1.a;
import w1.l;
import w1.q;
import w1.y;

public final class m
implements A5.a,
B5.a {
    public final q a = new q();
    public k b;
    public B5.c c;
    public l d;

    public final void a() {
        B5.c c8 = this.c;
        if (c8 != null) {
            c8.d(this.a);
            this.c.f(this.a);
        }
    }

    public final void b() {
        B5.c c8 = this.c;
        if (c8 != null) {
            c8.h(this.a);
            this.c.e(this.a);
        }
    }

    public final void c(Context object, c c8) {
        this.b = new k(c8, "flutter.baseflow.com/permissions/methods");
        this.d = object = new l((Context)object, new a(), this.a, new y());
        this.b.e((k.c)object);
    }

    public final void d(Activity activity) {
        l l8 = this.d;
        if (l8 != null) {
            l8.i(activity);
        }
    }

    public final void e() {
        this.b.e(null);
        this.b = null;
        this.d = null;
    }

    public final void f() {
        l l8 = this.d;
        if (l8 != null) {
            l8.i(null);
        }
    }

    @Override
    public void onAttachedToActivity(B5.c c8) {
        this.d(c8.c());
        this.c = c8;
        this.b();
    }

    @Override
    public void onAttachedToEngine(a.b b8) {
        this.c(b8.a(), b8.b());
    }

    @Override
    public void onDetachedFromActivity() {
        this.f();
        this.a();
    }

    @Override
    public void onDetachedFromActivityForConfigChanges() {
        this.onDetachedFromActivity();
    }

    @Override
    public void onDetachedFromEngine(a.b b8) {
        this.e();
    }

    @Override
    public void onReattachedToActivityForConfigChanges(B5.c c8) {
        this.onAttachedToActivity(c8);
    }
}

