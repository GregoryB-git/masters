/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.Map
 */
package X2;

import X2.D;
import X2.d;
import X2.f;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public abstract class c
extends d
implements D {
    private static final long serialVersionUID = 6588350623831699109L;

    public c(Map map) {
        super(map);
    }

    @Override
    public Map a() {
        return f.super.a();
    }

    @Override
    public boolean equals(Object object) {
        return f.super.equals(object);
    }

    @Override
    public boolean put(Object object, Object object2) {
        return super.put(object, object2);
    }

    @Override
    public Collection w(Collection collection) {
        return Collections.unmodifiableList((List)((List)collection));
    }

    @Override
    public Collection x(Object object, Collection collection) {
        return this.y(object, (List)collection, null);
    }
}

