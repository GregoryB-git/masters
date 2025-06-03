/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.lang.Void
 *  java.util.Collection
 *  java.util.Map
 *  java.util.Set
 */
package W5;

import W5.A;
import W5.y;
import h6.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class z
implements Map,
Serializable,
a {
    public static final z o = new z();
    private static final long serialVersionUID = 8246714829545688274L;

    private final Object readResolve() {
        return o;
    }

    public boolean a(Void void_) {
        Intrinsics.checkNotNullParameter((Object)void_, "value");
        return false;
    }

    public Void b(Object object) {
        return null;
    }

    public Set c() {
        return A.o;
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(Object object) {
        return false;
    }

    public Set d() {
        return A.o;
    }

    public int e() {
        return 0;
    }

    public boolean equals(Object object) {
        if (object instanceof Map && ((Map)object).isEmpty()) {
            return true;
        }
        return false;
    }

    public Collection f() {
        return y.o;
    }

    public Void g(Object object) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int hashCode() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        return "{}";
    }
}

