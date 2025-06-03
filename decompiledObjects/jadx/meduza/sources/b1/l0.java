package b1;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final List<Class<?>> f1757a = va.a.g(Application.class, e0.class);

    /* renamed from: b, reason: collision with root package name */
    public static final List<Class<?>> f1758b = va.a.f(e0.class);

    public static final <T> Constructor<T> a(Class<T> cls, List<? extends Class<?>> list) {
        ec.i.e(list, "signature");
        Object[] constructors = cls.getConstructors();
        ec.i.d(constructors, "modelClass.constructors");
        for (Object obj : constructors) {
            Constructor<T> constructor = (Constructor<T>) obj;
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            ec.i.d(parameterTypes, "constructor.parameterTypes");
            List r10 = sb.k.r(parameterTypes);
            if (ec.i.a(list, r10)) {
                return constructor;
            }
            if (list.size() == r10.size() && r10.containsAll(list)) {
                StringBuilder l10 = defpackage.f.l("Class ");
                l10.append(cls.getSimpleName());
                l10.append(" must have parameters in the proper order: ");
                l10.append(list);
                throw new UnsupportedOperationException(l10.toString());
            }
        }
        return null;
    }

    public static final <T extends o0> T b(Class<T> cls, Constructor<T> constructor, Object... objArr) {
        try {
            return constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Failed to access " + cls, e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("An exception happened in constructor of " + cls, e12.getCause());
        }
    }
}
