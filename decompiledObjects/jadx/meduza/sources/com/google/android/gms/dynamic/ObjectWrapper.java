package com.google.android.gms.dynamic;

import android.os.IBinder;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.f;
import java.lang.reflect.Field;
import m6.j;

/* loaded from: classes.dex */
public final class ObjectWrapper<T> extends IObjectWrapper.Stub {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2859a;

    public ObjectWrapper(Object obj) {
        this.f2859a = obj;
    }

    public static <T> T unwrap(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof ObjectWrapper) {
            return (T) ((ObjectWrapper) iObjectWrapper).f2859a;
        }
        IBinder asBinder = iObjectWrapper.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException(f.h("Unexpected number of IObjectWrapper declared fields: ", declaredFields.length));
        }
        j.i(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (IllegalAccessException e10) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e10);
        } catch (NullPointerException e11) {
            throw new IllegalArgumentException("Binder object is null.", e11);
        }
    }

    public static <T> IObjectWrapper wrap(T t) {
        return new ObjectWrapper(t);
    }
}
