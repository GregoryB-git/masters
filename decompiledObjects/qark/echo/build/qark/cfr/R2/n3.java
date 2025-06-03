/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package R2;

import android.os.Bundle;

public abstract class n3 {
    public static Object a(Bundle object, String string2, Class class_, Object object2) {
        if ((object = object.get(string2)) == null) {
            return object2;
        }
        if (class_.isAssignableFrom(object.getClass())) {
            return object;
        }
        throw new IllegalStateException(String.format((String)"Invalid conditional user property field type. '%s' expected [%s] but was [%s]", (Object[])new Object[]{string2, class_.getCanonicalName(), object.getClass().getCanonicalName()}));
    }

    public static void b(Bundle bundle, Object object) {
        if (object instanceof Double) {
            bundle.putDouble("value", ((Double)object).doubleValue());
            return;
        }
        if (object instanceof Long) {
            bundle.putLong("value", ((Long)object).longValue());
            return;
        }
        bundle.putString("value", object.toString());
    }
}

