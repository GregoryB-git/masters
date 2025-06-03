/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.Throwable
 *  java.util.concurrent.Executor
 */
package m;

import java.util.concurrent.Executor;
import m.c;
import m.d;

public class a
extends d {
    public static volatile a c;
    public static final Executor d;
    public static final Executor e;
    public d a;
    public d b;

    static {
        d = new Executor(){

            public void execute(Runnable runnable) {
                a.d().c(runnable);
            }
        };
        e = new Executor(){

            public void execute(Runnable runnable) {
                a.d().a(runnable);
            }
        };
    }

    public a() {
        c c8 = new c();
        this.b = c8;
        this.a = c8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a d() {
        if (c != null) {
            return c;
        }
        synchronized (a.class) {
            try {
                if (c == null) {
                    c = new a();
                }
                return c;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    @Override
    public void a(Runnable runnable) {
        this.a.a(runnable);
    }

    @Override
    public boolean b() {
        return this.a.b();
    }

    @Override
    public void c(Runnable runnable) {
        this.a.c(runnable);
    }

}

