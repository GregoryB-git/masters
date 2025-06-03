/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Map
 */
package n3;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class a {
    public static final a b = a.a().a();
    public final Map a;

    public a(Map map) {
        this.a = map;
    }

    public /* synthetic */ a(Map map,  a8) {
        this(map);
    }

    public static b a() {
        return new b();
    }

    public Map b() {
        return this.a;
    }

    public boolean equals(Object object) {
        if (!(object instanceof a)) {
            return false;
        }
        object = (a)object;
        return this.a.equals((Object)object.a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }

    public static final class b {
        public HashMap a = new HashMap();

        public a a() {
            if (this.a != null) {
                a a8 = new a(Collections.unmodifiableMap((Map)this.a), null);
                this.a = null;
                return a8;
            }
            throw new IllegalStateException("cannot call build() twice");
        }
    }

}

