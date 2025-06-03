/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 */
package W2;

import W2.m;
import W2.n;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public abstract class o {
    public static n b(n n8, n n9) {
        return new b(o.c((n)m.j(n8), (n)m.j(n9)), null);
    }

    public static List c(n n8, n n9) {
        return Arrays.asList((Object[])new n[]{n8, n9});
    }

    public static String d(String string2, Iterable object) {
        StringBuilder stringBuilder = new StringBuilder("Predicates.");
        stringBuilder.append(string2);
        stringBuilder.append('(');
        string2 = object.iterator();
        boolean bl = true;
        while (string2.hasNext()) {
            object = string2.next();
            if (!bl) {
                stringBuilder.append(',');
            }
            stringBuilder.append(object);
            bl = false;
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public static class b
    implements n,
    Serializable {
        private static final long serialVersionUID = 0L;
        public final List o;

        public b(List list) {
            this.o = list;
        }

        public /* synthetic */ b(List list,  a8) {
            this(list);
        }

        @Override
        public boolean apply(Object object) {
            for (int i8 = 0; i8 < this.o.size(); ++i8) {
                if (((n)this.o.get(i8)).apply(object)) continue;
                return false;
            }
            return true;
        }

        public boolean equals(Object object) {
            if (object instanceof b) {
                object = (b)object;
                return this.o.equals((Object)object.o);
            }
            return false;
        }

        public int hashCode() {
            return this.o.hashCode() + 306654252;
        }

        public String toString() {
            return o.d("and", (Iterable)this.o);
        }
    }

}

