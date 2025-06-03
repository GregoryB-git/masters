/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.AbstractCollection
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 */
package X2;

import X2.H;
import X2.K;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class f
implements H {
    public transient Set o;
    public transient Collection p;
    public transient Map q;

    @Override
    public Map a() {
        Map map;
        Map map2 = map = this.q;
        if (map == null) {
            this.q = map2 = this.c();
        }
        return map2;
    }

    public boolean b(Object object) {
        Iterator iterator = this.a().values().iterator();
        while (iterator.hasNext()) {
            if (!((Collection)iterator.next()).contains(object)) continue;
            return true;
        }
        return false;
    }

    public abstract Map c();

    public abstract Set d();

    public abstract Collection e();

    public boolean equals(Object object) {
        return K.a(this, object);
    }

    public Set f() {
        Set set;
        Set set2 = set = this.o;
        if (set == null) {
            this.o = set2 = this.d();
        }
        return set2;
    }

    public abstract Iterator g();

    public int hashCode() {
        return this.a().hashCode();
    }

    public String toString() {
        return this.a().toString();
    }

    @Override
    public Collection values() {
        Collection collection;
        Collection collection2 = collection = this.p;
        if (collection == null) {
            this.p = collection2 = this.e();
        }
        return collection2;
    }

    public class a
    extends AbstractCollection {
        public void clear() {
            f.this.clear();
        }

        public boolean contains(Object object) {
            return f.this.b(object);
        }

        public Iterator iterator() {
            return f.this.g();
        }

        public int size() {
            return f.this.size();
        }
    }

}

