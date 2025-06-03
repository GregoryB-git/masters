/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 */
package S3;

import S3.b;
import S3.h;
import S3.k;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class c
implements Iterable {
    public abstract c D(Object var1);

    public abstract Iterator P();

    public abstract boolean a(Object var1);

    public abstract Object d(Object var1);

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        c c8 = (c)object;
        if (!this.f().equals((Object)c8.f())) {
            return false;
        }
        if (this.size() != c8.size()) {
            return false;
        }
        object = this.iterator();
        c8 = c8.iterator();
        while (object.hasNext()) {
            if (((Map.Entry)object.next()).equals(c8.next())) continue;
            return false;
        }
        return true;
    }

    public abstract Comparator f();

    public abstract Object g();

    public int hashCode() {
        int n8 = this.f().hashCode();
        Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            n8 = n8 * 31 + ((Map.Entry)iterator.next()).hashCode();
        }
        return n8;
    }

    public abstract Object i();

    public abstract boolean isEmpty();

    public abstract Iterator iterator();

    public abstract Object k(Object var1);

    public abstract void q(h.b var1);

    public abstract c s(Object var1, Object var2);

    public abstract int size();

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append("{");
        Iterator iterator = this.iterator();
        boolean bl = true;
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry)iterator.next();
            if (bl) {
                bl = false;
            } else {
                stringBuilder.append(", ");
            }
            stringBuilder.append("(");
            stringBuilder.append(entry.getKey());
            stringBuilder.append("=>");
            stringBuilder.append(entry.getValue());
            stringBuilder.append(")");
        }
        stringBuilder.append("};");
        return stringBuilder.toString();
    }

    public static abstract class S3.c$a {
        public static final a a = new b();

        public static /* synthetic */ Object a(Object object) {
            return object;
        }

        public static c b(List list, Map map, a a8, Comparator comparator) {
            if (list.size() < 25) {
                return S3.a.U(list, map, a8, comparator);
            }
            return k.M(list, map, a8, comparator);
        }

        public static c c(Comparator comparator) {
            return new S3.a(comparator);
        }

        public static c d(Map map, Comparator comparator) {
            if (map.size() < 25) {
                return S3.a.X(map, comparator);
            }
            return k.S(map, comparator);
        }

        public static a e() {
            return a;
        }

        public static interface a {
            public Object a(Object var1);
        }

    }

}

