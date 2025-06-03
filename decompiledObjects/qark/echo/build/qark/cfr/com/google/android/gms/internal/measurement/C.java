/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.Callable
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.D0;
import com.google.android.gms.internal.measurement.F1;
import com.google.android.gms.internal.measurement.U7;
import com.google.android.gms.internal.measurement.a;
import com.google.android.gms.internal.measurement.b;
import com.google.android.gms.internal.measurement.d;
import com.google.android.gms.internal.measurement.d0;
import com.google.android.gms.internal.measurement.e;
import com.google.android.gms.internal.measurement.f3;
import com.google.android.gms.internal.measurement.k;
import com.google.android.gms.internal.measurement.l;
import com.google.android.gms.internal.measurement.n;
import com.google.android.gms.internal.measurement.o2;
import com.google.android.gms.internal.measurement.p2;
import com.google.android.gms.internal.measurement.q2;
import com.google.android.gms.internal.measurement.r;
import com.google.android.gms.internal.measurement.r2;
import com.google.android.gms.internal.measurement.s;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public final class C {
    public final F1 a;
    public f3 b;
    public d c;
    public final b d;

    public C() {
        this(new F1());
    }

    public C(F1 f12) {
        this.a = f12;
        this.b = f12.b.d();
        this.c = new d();
        this.d = new b();
        f12.b("internal.registerCallback", new a(this));
        f12.b("internal.eventLogger", new D0(this));
    }

    public final d a() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(q2 object) {
        try {
            this.b = this.a.b.d();
            Object object2 = object.I();
            if (this.a.a(this.b, (r2[])object2.toArray((Object[])new r2[0])) instanceof l) throw new IllegalStateException("Program loading failed");
            Iterator iterator = object.G().I().iterator();
            block2 : do {
                if (!iterator.hasNext()) return;
                object2 = (p2)iterator.next();
                object = object2.I();
                object2 = object2.H();
                Iterator iterator2 = object.iterator();
                do {
                    if (!iterator2.hasNext()) continue block2;
                    object = (r2)iterator2.next();
                    s s8 = this.a.a(this.b, new r2[]{object});
                    if (!(s8 instanceof r)) throw new IllegalArgumentException("Invalid rule definition");
                    object = this.b;
                    if (!object.g((String)object2)) {
                        object = null;
                    } else {
                        if (!((object = object.c((String)object2)) instanceof n)) {
                            object = new StringBuilder("Invalid function name: ");
                            object.append((String)object2);
                            throw new IllegalStateException(object.toString());
                        }
                        object = (n)object;
                    }
                    if (object == null) {
                        object = new StringBuilder("Rule function is undefined: ");
                        object.append((String)object2);
                        throw new IllegalStateException(object.toString());
                    }
                    object.b(this.b, Collections.singletonList((Object)s8));
                } while (true);
                break;
            } while (true);
        }
        catch (Throwable throwable) {
            throw new d0(throwable);
        }
    }

    public final void c(String string2, Callable callable) {
        this.a.b(string2, callable);
    }

    public final boolean d(e e8) {
        Throwable throwable2;
        block3 : {
            try {
                boolean bl;
                this.c.b(e8);
                this.a.c.h("runtime.counter", new k(0.0));
                this.d.b(this.b.d(), this.c);
                if (!this.g() && !(bl = this.f())) {
                    return false;
                }
            }
            catch (Throwable throwable2) {
                break block3;
            }
            return true;
        }
        throw new d0(throwable2);
    }

    public final /* synthetic */ n e() {
        return new U7(this.d);
    }

    public final boolean f() {
        if (!this.c.f().isEmpty()) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        if (!this.c.d().equals(this.c.a())) {
            return true;
        }
        return false;
    }
}

