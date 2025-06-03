/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Map
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package E1;

import E1.d;
import E1.e;
import E1.h;
import E1.j;
import E1.m;
import T1.a;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class f {
    public static final f a = new f();

    public static /* synthetic */ void a() {
        f.f();
    }

    public static /* synthetic */ void b() {
        f.e();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void d(Context object) {
        if (a.d(f.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(object, "context");
            if (m.a("com.android.billingclient.api.Purchase") == null) {
                return;
            }
            h.b b8 = h.s;
            if ((object = b8.c((Context)object)) == null) {
                return;
            }
            if (b8.f().get()) {
                boolean bl = j.d();
                if (bl) {
                    object.p("inapp", new d());
                    return;
                }
                object.o("inapp", new e());
            }
            return;
        }
        catch (Throwable throwable) {}
        a.b(throwable, f.class);
    }

    public static final void e() {
        if (a.d(f.class)) {
            return;
        }
        try {
            a.c();
            return;
        }
        catch (Throwable throwable) {
            a.b(throwable, f.class);
            return;
        }
    }

    public static final void f() {
        if (a.d(f.class)) {
            return;
        }
        try {
            a.c();
            return;
        }
        catch (Throwable throwable) {
            a.b(throwable, f.class);
            return;
        }
    }

    public final void c() {
        if (a.d(this)) {
            return;
        }
        try {
            Object object = j.a;
            object = h.s;
            j.e(object.d(), object.e());
            object.d().clear();
            return;
        }
        catch (Throwable throwable) {
            a.b(throwable, this);
            return;
        }
    }
}

