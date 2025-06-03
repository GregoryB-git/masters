/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.os.IBinder
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 */
package H2;

import A2.n;
import H2.a;
import android.os.IBinder;
import java.lang.reflect.Field;

public final class b
extends a.a {
    public final Object b;

    public b(Object object) {
        this.b = object;
    }

    public static a Z0(Object object) {
        return new b(object);
    }

    public static Object v(a object) {
        int n8;
        if (object instanceof b) {
            return ((b)object).b;
        }
        IBinder iBinder = object.asBinder();
        Field[] arrfield = iBinder.getClass().getDeclaredFields();
        int n9 = arrfield.length;
        object = null;
        int n10 = 0;
        for (n8 = 0; n8 < n9; ++n8) {
            Field field = arrfield[n8];
            int n11 = n10;
            if (!field.isSynthetic()) {
                n11 = n10 + 1;
                object = field;
            }
            n10 = n11;
        }
        if (n10 == 1) {
            n.i(object);
            if (!object.isAccessible()) {
                object.setAccessible(true);
                try {
                    object = object.get((Object)iBinder);
                    return object;
                }
                catch (IllegalAccessException illegalAccessException) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", (Throwable)illegalAccessException);
                }
                catch (NullPointerException nullPointerException) {
                    throw new IllegalArgumentException("Binder object is null.", (Throwable)nullPointerException);
                }
            }
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        n8 = arrfield.length;
        object = new StringBuilder();
        object.append("Unexpected number of IObjectWrapper declared fields: ");
        object.append(n8);
        throw new IllegalArgumentException(object.toString());
    }
}

