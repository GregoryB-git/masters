/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.security.GeneralSecurityException
 *  java.util.concurrent.atomic.AtomicReference
 */
package k3;

import c3.g;
import c3.y;
import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import k3.b;
import k3.c;
import k3.e;
import k3.j;
import k3.k;
import k3.o;
import k3.q;
import k3.r;
import k3.s;

public final class i {
    public static final i b = new i();
    public final AtomicReference a = new AtomicReference((Object)new r.b().e());

    public static i a() {
        return b;
    }

    public boolean b(q q8) {
        return ((r)this.a.get()).e(q8);
    }

    public g c(q q8, y y8) {
        return ((r)this.a.get()).f(q8, y8);
    }

    public g d(o object, y y8) {
        if (y8 != null) {
            if (!this.b((q)object)) {
                try {
                    object = new e((o)object, y8);
                    return object;
                }
                catch (GeneralSecurityException generalSecurityException) {
                    throw new s("Creating a LegacyProtoKey failed", (Throwable)generalSecurityException);
                }
            }
            return this.c((q)object, y8);
        }
        throw new NullPointerException("access cannot be null");
    }

    public void e(b object) {
        synchronized (this) {
            object = new r.b((r)this.a.get()).f((b)object).e();
            this.a.set(object);
            return;
        }
    }

    public void f(c object) {
        synchronized (this) {
            object = new r.b((r)this.a.get()).g((c)object).e();
            this.a.set(object);
            return;
        }
    }

    public void g(j object) {
        synchronized (this) {
            object = new r.b((r)this.a.get()).h((j)object).e();
            this.a.set(object);
            return;
        }
    }

    public void h(k object) {
        synchronized (this) {
            object = new r.b((r)this.a.get()).i((k)object).e();
            this.a.set(object);
            return;
        }
    }
}

