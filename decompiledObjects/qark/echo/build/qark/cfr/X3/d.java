/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.List
 *  java.util.Set
 *  java.util.concurrent.Callable
 */
package X3;

import V3.b;
import V3.k;
import X3.e;
import Y3.m;
import a4.a;
import a4.i;
import android.util.Log;
import d4.g;
import d4.h;
import d4.n;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

public class d
implements e {
    public boolean a = false;

    @Override
    public void a() {
        this.q();
    }

    @Override
    public void b(long l8) {
        this.q();
    }

    @Override
    public void c(k k8, b b8, long l8) {
        this.q();
    }

    @Override
    public List d() {
        return Collections.emptyList();
    }

    @Override
    public void e(k k8, n n8, long l8) {
        this.q();
    }

    @Override
    public void f(k k8, b b8) {
        this.q();
    }

    @Override
    public Object g(Callable object) {
        m.g(this.a ^ true, "runInTransaction called when an existing transaction is already in progress.");
        this.a = true;
        try {
            object = object.call();
        }
        catch (Throwable throwable) {
            try {
                Log.e((String)"NoopPersistenceManager", (String)"Caught Throwable.", (Throwable)throwable);
                throw new RuntimeException(throwable);
            }
            catch (Throwable throwable2) {
                this.a = false;
                throw throwable2;
            }
        }
        this.a = false;
        return object;
    }

    @Override
    public void h(k k8, b b8) {
        this.q();
    }

    @Override
    public void i(i i8) {
        this.q();
    }

    @Override
    public void j(i i8, n n8) {
        this.q();
    }

    @Override
    public a k(i i8) {
        return new a(d4.i.f(g.W(), i8.c()), false, false);
    }

    @Override
    public void l(i i8, Set set, Set set2) {
        this.q();
    }

    @Override
    public void m(i i8) {
        this.q();
    }

    @Override
    public void n(k k8, n n8) {
        this.q();
    }

    @Override
    public void o(i i8, Set set) {
        this.q();
    }

    @Override
    public void p(i i8) {
        this.q();
    }

    public final void q() {
        m.g(this.a, "Transaction expected to already be in progress.");
    }
}

