/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.concurrent.TimeoutException
 */
package k0;

import android.os.Looper;
import d0.I;
import g0.c;
import java.util.concurrent.TimeoutException;

public final class V0 {
    public final b a;
    public final a b;
    public final c c;
    public final I d;
    public int e;
    public Object f;
    public Looper g;
    public int h;
    public long i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;

    public V0(a a8, b b8, I i8, int n8, c c8, Looper looper) {
        this.b = a8;
        this.a = b8;
        this.d = i8;
        this.g = looper;
        this.c = c8;
        this.h = n8;
        this.i = -9223372036854775807L;
        this.j = true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(long l8) {
        synchronized (this) {
            try {
                g0.a.f(this.k);
                boolean bl = this.g.getThread() != Thread.currentThread();
                g0.a.f(bl);
                long l9 = this.c.b();
                long l10 = l8;
                while (!(bl = this.m) && l10 > 0L) {
                    this.c.f();
                    this.wait(l10);
                    l10 = l9 + l8 - this.c.b();
                }
                if (!bl) throw new TimeoutException("Message delivery timed out.");
                return this.l;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public boolean b() {
        return this.j;
    }

    public Looper c() {
        return this.g;
    }

    public int d() {
        return this.h;
    }

    public Object e() {
        return this.f;
    }

    public long f() {
        return this.i;
    }

    public b g() {
        return this.a;
    }

    public I h() {
        return this.d;
    }

    public int i() {
        return this.e;
    }

    public boolean j() {
        synchronized (this) {
            boolean bl = this.n;
            return bl;
        }
    }

    public void k(boolean bl) {
        synchronized (this) {
            this.l = bl | this.l;
            this.m = true;
            this.notifyAll();
            return;
        }
    }

    public V0 l() {
        g0.a.f(this.k ^ true);
        if (this.i == -9223372036854775807L) {
            g0.a.a(this.j);
        }
        this.k = true;
        this.b.c(this);
        return this;
    }

    public V0 m(Object object) {
        g0.a.f(this.k ^ true);
        this.f = object;
        return this;
    }

    public V0 n(int n8) {
        g0.a.f(this.k ^ true);
        this.e = n8;
        return this;
    }

    public static interface a {
        public void c(V0 var1);
    }

    public static interface b {
        public void t(int var1, Object var2);
    }

}

