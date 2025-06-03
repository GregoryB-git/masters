/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.WeakHashMap
 */
package n;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class b
implements Iterable {
    public c o;
    public c p;
    public WeakHashMap q = new WeakHashMap();
    public int r = 0;

    public Map.Entry a() {
        return this.o;
    }

    public c d(Object object) {
        c c8 = this.o;
        while (c8 != null) {
            if (c8.o.equals(object)) {
                return c8;
            }
            c8 = c8.q;
        }
        return c8;
    }

    public Iterator descendingIterator() {
        b b8 = new b(this.p, this.o);
        this.q.put((Object)b8, (Object)Boolean.FALSE);
        return b8;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof b)) {
            return false;
        }
        b b8 = (b)object;
        if (this.size() != b8.size()) {
            return false;
        }
        object = this.iterator();
        b8 = b8.iterator();
        while (object.hasNext() && b8.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            Object object2 = b8.next();
            if ((entry != null || object2 == null) && (entry == null || entry.equals(object2))) continue;
            return false;
        }
        if (!object.hasNext() && !b8.hasNext()) {
            return true;
        }
        return false;
    }

    public d f() {
        d d8 = new d();
        this.q.put((Object)d8, (Object)Boolean.FALSE);
        return d8;
    }

    public Map.Entry g() {
        return this.p;
    }

    public int hashCode() {
        Iterator iterator = this.iterator();
        int n8 = 0;
        while (iterator.hasNext()) {
            n8 += ((Map.Entry)iterator.next()).hashCode();
        }
        return n8;
    }

    /*
     * Enabled aggressive block sorting
     */
    public c i(Object object, Object object2) {
        object = new c(object, object2);
        ++this.r;
        object2 = this.p;
        if (object2 == null) {
            this.o = object;
        } else {
            object2.q = object;
            object.r = object2;
        }
        this.p = object;
        return object;
    }

    public Iterator iterator() {
        a a8 = new a(this.o, this.p);
        this.q.put((Object)a8, (Object)Boolean.FALSE);
        return a8;
    }

    public Object k(Object object, Object object2) {
        c c8 = this.d(object);
        if (c8 != null) {
            return c8.p;
        }
        this.i(object, object2);
        return null;
    }

    public Object q(Object object) {
        c c8;
        if ((object = this.d(object)) == null) {
            return null;
        }
        --this.r;
        if (!this.q.isEmpty()) {
            c8 = this.q.keySet().iterator();
            while (c8.hasNext()) {
                ((f)c8.next()).b((c)object);
            }
        }
        c8 = object.r;
        c c9 = object.q;
        if (c8 != null) {
            c8.q = c9;
        } else {
            this.o = c9;
        }
        c9 = object.q;
        if (c9 != null) {
            c9.r = c8;
        } else {
            this.p = c8;
        }
        object.q = null;
        object.r = null;
        return object.p;
    }

    public int size() {
        return this.r;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            stringBuilder.append(((Map.Entry)iterator.next()).toString());
            if (!iterator.hasNext()) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static class a
    extends e {
        public a(c c8, c c9) {
            super(c8, c9);
        }

        @Override
        public c d(c c8) {
            return c8.r;
        }

        @Override
        public c e(c c8) {
            return c8.q;
        }
    }

    public static class b
    extends e {
        public b(c c8, c c9) {
            super(c8, c9);
        }

        @Override
        public c d(c c8) {
            return c8.q;
        }

        @Override
        public c e(c c8) {
            return c8.r;
        }
    }

    public static class c
    implements Map.Entry {
        public final Object o;
        public final Object p;
        public c q;
        public c r;

        public c(Object object, Object object2) {
            this.o = object;
            this.p = object2;
        }

        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof c)) {
                return false;
            }
            object = (c)object;
            if (this.o.equals(object.o) && this.p.equals(object.p)) {
                return true;
            }
            return false;
        }

        public Object getKey() {
            return this.o;
        }

        public Object getValue() {
            return this.p;
        }

        public int hashCode() {
            return this.o.hashCode() ^ this.p.hashCode();
        }

        public Object setValue(Object object) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.o);
            stringBuilder.append("=");
            stringBuilder.append(this.p);
            return stringBuilder.toString();
        }
    }

    public class d
    implements Iterator,
    f {
        public c o;
        public boolean p;

        public d() {
            this.p = true;
        }

        @Override
        public void b(c c8) {
            c c9 = this.o;
            if (c8 == c9) {
                this.o = c8 = c9.r;
                boolean bl = c8 == null;
                this.p = bl;
            }
        }

        /*
         * Enabled aggressive block sorting
         */
        public Map.Entry d() {
            c c8;
            if (this.p) {
                this.p = false;
                c8 = b.this.o;
            } else {
                c8 = this.o;
                c8 = c8 != null ? c8.q : null;
            }
            this.o = c8;
            return this.o;
        }

        public boolean hasNext() {
            boolean bl = this.p;
            boolean bl2 = false;
            boolean bl3 = false;
            if (bl) {
                if (b.this.o != null) {
                    bl3 = true;
                }
                return bl3;
            }
            c c8 = this.o;
            bl3 = bl2;
            if (c8 != null) {
                bl3 = bl2;
                if (c8.q != null) {
                    bl3 = true;
                }
            }
            return bl3;
        }
    }

    public static abstract class e
    implements Iterator,
    f {
        public c o;
        public c p;

        public e(c c8, c c9) {
            this.o = c9;
            this.p = c8;
        }

        @Override
        public void b(c c8) {
            c c9;
            if (this.o == c8 && c8 == this.p) {
                this.p = null;
                this.o = null;
            }
            if ((c9 = this.o) == c8) {
                this.o = this.d(c9);
            }
            if (this.p == c8) {
                this.p = this.g();
            }
        }

        public abstract c d(c var1);

        public abstract c e(c var1);

        public Map.Entry f() {
            c c8 = this.p;
            this.p = this.g();
            return c8;
        }

        public final c g() {
            c c8 = this.p;
            c c9 = this.o;
            if (c8 != c9 && c9 != null) {
                return this.e(c8);
            }
            return null;
        }

        public boolean hasNext() {
            if (this.p != null) {
                return true;
            }
            return false;
        }
    }

    public static interface f {
        public void b(c var1);
    }

}

