/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 */
package H;

public abstract class e {
    public static int a(int n8) {
        if (n8 >= 0) {
            return n8;
        }
        throw new IllegalArgumentException();
    }

    public static Object b(Object object) {
        object.getClass();
        return object;
    }

    public static Object c(Object object, Object object2) {
        if (object != null) {
            return object;
        }
        throw new NullPointerException(String.valueOf((Object)object2));
    }
}

