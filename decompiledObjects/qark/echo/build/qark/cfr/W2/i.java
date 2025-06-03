/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Array
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Map
 */
package W2;

import W2.l;
import W2.m;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

public abstract class i {
    public static b a(Object object) {
        return new b(object.getClass().getSimpleName(), null);
    }

    public static final class b {
        public final String a;
        public final a b;
        public a c;
        public boolean d;
        public boolean e;

        public b(String string2) {
            a a8;
            this.b = a8 = new a();
            this.c = a8;
            this.d = false;
            this.e = false;
            this.a = (String)m.j(string2);
        }

        public /* synthetic */ b(String string2,  a8) {
            this(string2);
        }

        public static boolean d(Object object) {
            boolean bl = object instanceof CharSequence;
            boolean bl2 = false;
            boolean bl3 = false;
            if (bl) {
                if (((CharSequence)object).length() == 0) {
                    bl3 = true;
                }
                return bl3;
            }
            if (object instanceof Collection) {
                return ((Collection)object).isEmpty();
            }
            if (object instanceof Map) {
                return ((Map)object).isEmpty();
            }
            if (object instanceof l) {
                return ((l)object).c() ^ true;
            }
            bl3 = bl2;
            if (object.getClass().isArray()) {
                bl3 = bl2;
                if (Array.getLength((Object)object) == 0) {
                    bl3 = true;
                }
            }
            return bl3;
        }

        public final a a() {
            a a8;
            this.c.c = a8 = new a();
            this.c = a8;
            return a8;
        }

        public final b b(Object object) {
            this.a().b = object;
            return this;
        }

        public b c(Object object) {
            return this.b(object);
        }

        public String toString() {
            boolean bl = this.d;
            boolean bl2 = this.e;
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append(this.a);
            stringBuilder.append('{');
            a a8 = this.b.c;
            String string2 = "";
            while (a8 != null) {
                String string3;
                block8 : {
                    Object object;
                    block9 : {
                        block7 : {
                            object = a8.b;
                            if (object != null) break block7;
                            string3 = string2;
                            if (bl) break block8;
                            break block9;
                        }
                        if (!bl2) break block9;
                        string3 = string2;
                        if (b.d(object)) break block8;
                    }
                    stringBuilder.append(string2);
                    string2 = a8.a;
                    if (string2 != null) {
                        stringBuilder.append(string2);
                        stringBuilder.append('=');
                    }
                    if (object != null && object.getClass().isArray()) {
                        string2 = Arrays.deepToString((Object[])new Object[]{object});
                        stringBuilder.append((CharSequence)string2, 1, string2.length() - 1);
                    } else {
                        stringBuilder.append(object);
                    }
                    string3 = ", ";
                }
                a8 = a8.c;
                string2 = string3;
            }
            stringBuilder.append('}');
            return stringBuilder.toString();
        }

        public static class a {
            public String a;
            public Object b;
            public a c;
        }

    }

}

