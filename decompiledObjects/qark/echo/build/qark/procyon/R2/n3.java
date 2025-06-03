// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R2;

import android.os.BaseBundle;
import android.os.Bundle;

public abstract class n3
{
    public static Object a(final Bundle bundle, final String s, final Class clazz, final Object o) {
        final Object value = ((BaseBundle)bundle).get(s);
        if (value == null) {
            return o;
        }
        if (clazz.isAssignableFrom(value.getClass())) {
            return value;
        }
        throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", s, clazz.getCanonicalName(), value.getClass().getCanonicalName()));
    }
    
    public static void b(final Bundle bundle, final Object o) {
        if (o instanceof Double) {
            ((BaseBundle)bundle).putDouble("value", (double)o);
            return;
        }
        if (o instanceof Long) {
            ((BaseBundle)bundle).putLong("value", (long)o);
            return;
        }
        ((BaseBundle)bundle).putString("value", o.toString());
    }
}
