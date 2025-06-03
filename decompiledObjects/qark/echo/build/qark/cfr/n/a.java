/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Map$Entry
 */
package n;

import java.util.HashMap;
import java.util.Map;
import n.b;

public class a
extends b {
    public HashMap s = new HashMap();

    public boolean contains(Object object) {
        return this.s.containsKey(object);
    }

    @Override
    public b.c d(Object object) {
        return (b.c)this.s.get(object);
    }

    @Override
    public Object k(Object object, Object object2) {
        b.c c8 = this.d(object);
        if (c8 != null) {
            return c8.p;
        }
        this.s.put(object, (Object)this.i(object, object2));
        return null;
    }

    @Override
    public Object q(Object object) {
        Object object2 = super.q(object);
        this.s.remove(object);
        return object2;
    }

    public Map.Entry s(Object object) {
        if (this.contains(object)) {
            return ((b.c)this.s.get((Object)object)).r;
        }
        return null;
    }
}

