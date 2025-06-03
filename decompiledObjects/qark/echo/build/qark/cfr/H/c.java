/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Objects
 */
package H;

import java.util.Objects;

public abstract class c {
    public static boolean a(Object object, Object object2) {
        return a.a(object, object2);
    }

    public static /* varargs */ int b(Object ... arrobject) {
        return a.b(arrobject);
    }

    public static Object c(Object object) {
        object.getClass();
        return object;
    }

    public static Object d(Object object, String string2) {
        if (object != null) {
            return object;
        }
        throw new NullPointerException(string2);
    }

    public static abstract class a {
        public static boolean a(Object object, Object object2) {
            return Objects.equals((Object)object, (Object)object2);
        }

        public static /* varargs */ int b(Object ... arrobject) {
            return Objects.hash((Object[])arrobject);
        }
    }

}

