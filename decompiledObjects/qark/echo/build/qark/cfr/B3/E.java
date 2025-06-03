/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 */
package B3;

public abstract class E {
    public static void a(boolean bl, String string2) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(string2);
    }

    public static Object b(Object object) {
        object.getClass();
        return object;
    }

    public static Object c(Object object, String string2) {
        if (object != null) {
            return object;
        }
        throw new NullPointerException(string2);
    }

    public static void d(boolean bl, String string2) {
        if (bl) {
            return;
        }
        throw new IllegalStateException(string2);
    }
}

