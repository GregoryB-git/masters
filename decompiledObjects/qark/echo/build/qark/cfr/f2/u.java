/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.Set
 */
package f2;

import android.content.Context;
import c2.b;
import c2.c;
import c2.d;
import f2.e;
import f2.f;
import f2.g;
import f2.h;
import f2.i;
import f2.o;
import f2.p;
import f2.q;
import f2.t;
import f2.v;
import java.util.Collections;
import java.util.Set;
import m2.r;
import p2.a;

public class u
implements t {
    public static volatile v e;
    public final a a;
    public final a b;
    public final l2.e c;
    public final r d;

    public u(a a8, a a9, l2.e e8, r r8, m2.v v8) {
        this.a = a8;
        this.b = a9;
        this.c = e8;
        this.d = r8;
        v8.c();
    }

    public static u c() {
        v v8 = e;
        if (v8 != null) {
            return v8.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static Set d(f f8) {
        if (f8 instanceof g) {
            return Collections.unmodifiableSet((Set)((g)f8).a());
        }
        return Collections.singleton((Object)b.b("proto"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void f(Context context) {
        if (e != null) {
            return;
        }
        synchronized (u.class) {
            try {
                if (e == null) {
                    e = e.c().b(context).a();
                }
                return;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public void a(o o8, c2.h h8) {
        this.c.a(o8.f().f(o8.c().c()), this.b(o8), h8);
    }

    public final i b(o o8) {
        return i.a().i(this.a.a()).k(this.b.a()).j(o8.g()).h(new h(o8.b(), o8.d())).g(o8.c().a()).d();
    }

    public r e() {
        return this.d;
    }

    public c2.g g(f f8) {
        return new q(u.d(f8), p.a().b(f8.d()).c(f8.r()).a(), this);
    }
}

