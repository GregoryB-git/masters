package H2;

import A2.AbstractC0328n;
import H2.a;
import android.os.IBinder;
import java.lang.reflect.Field;

/* loaded from: classes.dex */
public final class b extends a.AbstractBinderC0037a {

    /* renamed from: b, reason: collision with root package name */
    public final Object f2204b;

    public b(Object obj) {
        this.f2204b = obj;
    }

    public static a Z0(Object obj) {
        return new b(obj);
    }

    public static Object v(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f2204b;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i7 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i7++;
                field = field2;
            }
        }
        if (i7 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        AbstractC0328n.i(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(asBinder);
        } catch (IllegalAccessException e7) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e7);
        } catch (NullPointerException e8) {
            throw new IllegalArgumentException("Binder object is null.", e8);
        }
    }
}
