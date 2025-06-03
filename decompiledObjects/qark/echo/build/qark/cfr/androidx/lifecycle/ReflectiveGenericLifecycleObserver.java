/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 */
package androidx.lifecycle;

import androidx.lifecycle.a;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.h;

class ReflectiveGenericLifecycleObserver
implements f {
    public final Object o;
    public final a.a p;

    public ReflectiveGenericLifecycleObserver(Object object) {
        this.o = object;
        this.p = a.c.c(object.getClass());
    }

    @Override
    public void a(h h8, d.b b8) {
        this.p.a(h8, b8, this.o);
    }
}

