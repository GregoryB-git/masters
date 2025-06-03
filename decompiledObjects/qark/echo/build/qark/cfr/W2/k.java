/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Arrays
 */
package W2;

import W2.f;
import java.util.Arrays;

public abstract class k
extends f {
    public static boolean a(Object object, Object object2) {
        if (!(object == object2 || object != null && object.equals(object2))) {
            return false;
        }
        return true;
    }

    public static /* varargs */ int b(Object ... arrobject) {
        return Arrays.hashCode((Object[])arrobject);
    }
}

