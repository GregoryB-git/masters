/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.Executor
 *  java.util.logging.Logger
 */
package l2;

import c2.h;
import f2.i;
import f2.p;
import f2.u;
import g2.m;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import l2.a;
import l2.b;
import l2.e;
import m2.x;
import n2.d;
import n2.k;
import o2.b;

public class c
implements e {
    public static final Logger f = Logger.getLogger((String)u.class.getName());
    public final x a;
    public final Executor b;
    public final g2.e c;
    public final d d;
    public final o2.b e;

    public c(Executor executor, g2.e e8, x x8, d d8, o2.b b8) {
        this.b = executor;
        this.c = e8;
        this.a = x8;
        this.d = d8;
        this.e = b8;
    }

    public static /* synthetic */ Object b(c c8, p p8, i i8) {
        return c8.d(p8, i8);
    }

    public static /* synthetic */ void c(c c8, p p8, h h8, i i8) {
        c8.e(p8, h8, i8);
    }

    @Override
    public void a(p p8, i i8, h h8) {
        this.b.execute((Runnable)new a(this, p8, h8, i8));
    }

    public final /* synthetic */ Object d(p p8, i i8) {
        this.d.z(p8, i8);
        this.a.a(p8, 1);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void e(p object, h h8, i i8) {
        try {
            m m8 = this.c.a(object.b());
            if (m8 == null) {
                object = String.format((String)"Transport backend '%s' is not registered", (Object[])new Object[]{object.b()});
                f.warning((String)object);
                h8.a((Exception)new IllegalArgumentException((String)object));
                return;
            }
            i8 = m8.a(i8);
            this.e.a(new b(this, (p)object, i8));
            h8.a(null);
            return;
        }
        catch (Exception exception) {}
        object = f;
        i8 = new StringBuilder();
        i8.append("Error scheduling event ");
        i8.append(exception.getMessage());
        object.warning(i8.toString());
        h8.a(exception);
    }
}

