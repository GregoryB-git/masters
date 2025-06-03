/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Collection
 *  java.util.Map
 *  java.util.Set
 */
package X2;

import X2.G;
import X2.a0;
import X2.r;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public abstract class q
extends r
implements Map {
    public abstract Map b();

    public boolean c(Object object) {
        return G.b(this, object);
    }

    public void clear() {
        this.b().clear();
    }

    public boolean containsKey(Object object) {
        return this.b().containsKey(object);
    }

    public boolean d(Object object) {
        return G.c(this, object);
    }

    public int e() {
        return a0.d(this.entrySet());
    }

    public Set entrySet() {
        return this.b().entrySet();
    }

    public Object get(Object object) {
        return this.b().get(object);
    }

    public boolean isEmpty() {
        return this.b().isEmpty();
    }

    public Set keySet() {
        return this.b().keySet();
    }

    public Object put(Object object, Object object2) {
        return this.b().put(object, object2);
    }

    public void putAll(Map map) {
        this.b().putAll(map);
    }

    public Object remove(Object object) {
        return this.b().remove(object);
    }

    public int size() {
        return this.b().size();
    }

    public Collection values() {
        return this.b().values();
    }
}

