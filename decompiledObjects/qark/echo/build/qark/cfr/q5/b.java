/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package q5;

public abstract class b {
    public static void a(Object object, Class class_) {
        if (object != null) {
            return;
        }
        object = new StringBuilder();
        object.append(class_.getCanonicalName());
        object.append(" must be set");
        throw new IllegalStateException(object.toString());
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
}

