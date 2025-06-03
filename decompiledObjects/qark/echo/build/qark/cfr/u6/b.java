/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 */
package u6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import u6.a;
import u6.y;

public abstract class b
extends y {
    public static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, (String)"_consensus");
    private volatile Object _consensus = a.a;

    @Override
    public final Object a(Object object) {
        Object object2;
        Object object3 = object2 = a.get((Object)this);
        if (object2 == a.a) {
            object3 = this.c(this.d(object));
        }
        this.b(object, object3);
        return object3;
    }

    public abstract void b(Object var1, Object var2);

    public final Object c(Object object) {
        Object object2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        Object object3 = atomicReferenceFieldUpdater.get((Object)this);
        if (object3 != (object2 = a.a)) {
            return object3;
        }
        if (u.b.a(atomicReferenceFieldUpdater, this, object2, object)) {
            return object;
        }
        return atomicReferenceFieldUpdater.get((Object)this);
    }

    public abstract Object d(Object var1);
}

