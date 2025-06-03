/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 */
package V5;

import V5.d;
import V5.h;
import V5.r;
import g6.a;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class p
implements h,
Serializable {
    public a o;
    public volatile Object p;
    public final Object q;

    public p(a object, Object object2) {
        Intrinsics.checkNotNullParameter(object, "initializer");
        this.o = object;
        this.p = r.a;
        object = object2;
        if (object2 == null) {
            object = this;
        }
        this.q = object;
    }

    public /* synthetic */ p(a a8, Object object, int n8, g g8) {
        if ((n8 & 2) != 0) {
            object = null;
        }
        this(a8, object);
    }

    private final Object writeReplace() {
        return new d(this.getValue());
    }

    public boolean a() {
        if (this.p != r.a) {
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object getValue() {
        Object object = this.p;
        r r8 = r.a;
        if (object != r8) {
            return object;
        }
        Object object2 = this.q;
        synchronized (object2) {
            object = this.p;
            if (object == r8) {
                object = this.o;
                Intrinsics.b(object);
                this.p = object = object.invoke();
                this.o = null;
            }
            return object;
        }
    }

    public String toString() {
        if (this.a()) {
            return String.valueOf((Object)this.getValue());
        }
        return "Lazy value not initialized yet.";
    }
}

