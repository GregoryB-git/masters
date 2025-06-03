// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H2;

import android.os.IInterface;
import java.lang.reflect.Field;
import android.os.IBinder;
import A2.n;

public final class b extends a
{
    public final Object b;
    
    public b(final Object b) {
        this.b = b;
    }
    
    public static H2.a Z0(final Object o) {
        return new b(o);
    }
    
    public static Object v(final H2.a a) {
        if (a instanceof b) {
            return ((b)a).b;
        }
        final IBinder binder = ((IInterface)a).asBinder();
        final Field[] declaredFields = binder.getClass().getDeclaredFields();
        final int length = declaredFields.length;
        int i = 0;
        Field field = null;
        int n = 0;
        while (i < length) {
            final Field field2 = declaredFields[i];
            int n2 = n;
            if (!field2.isSynthetic()) {
                n2 = n + 1;
                field = field2;
            }
            ++i;
            n = n2;
        }
        if (n == 1) {
            A2.n.i(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(binder);
                }
                catch (IllegalAccessException cause) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", cause);
                }
                catch (NullPointerException cause2) {
                    throw new IllegalArgumentException("Binder object is null.", cause2);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        final int length2 = declaredFields.length;
        final StringBuilder sb = new StringBuilder();
        sb.append("Unexpected number of IObjectWrapper declared fields: ");
        sb.append(length2);
        throw new IllegalArgumentException(sb.toString());
    }
}
