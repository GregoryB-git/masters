/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package H;

public abstract class b {
    /*
     * Enabled aggressive block sorting
     */
    public static void a(Object object, StringBuilder stringBuilder) {
        if (object == null) {
            object = "null";
        } else {
            String string2;
            String string3 = string2 = object.getClass().getSimpleName();
            if (string2.length() <= 0) {
                string2 = object.getClass().getName();
                int n8 = string2.lastIndexOf(46);
                string3 = string2;
                if (n8 > 0) {
                    string3 = string2.substring(n8 + 1);
                }
            }
            stringBuilder.append(string3);
            stringBuilder.append('{');
            object = Integer.toHexString((int)System.identityHashCode((Object)object));
        }
        stringBuilder.append((String)object);
    }
}

