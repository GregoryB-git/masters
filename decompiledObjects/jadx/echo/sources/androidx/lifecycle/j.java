package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static Map f9705a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static Map f9706b = new HashMap();

    public static c a(Constructor constructor, Object obj) {
        try {
            android.support.v4.media.a.a(constructor.newInstance(obj));
            return null;
        } catch (IllegalAccessException e7) {
            throw new RuntimeException(e7);
        } catch (InstantiationException e8) {
            throw new RuntimeException(e8);
        } catch (InvocationTargetException e9) {
            throw new RuntimeException(e9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Constructor b(Class cls) {
        try {
            Package r12 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r12 != null ? r12.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String c7 = c(canonicalName);
            if (!name.isEmpty()) {
                c7 = name + "." + c7;
            }
            Constructor declaredConstructor = Class.forName(c7).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e7) {
            throw new RuntimeException(e7);
        }
    }

    public static String c(String str) {
        return str.replace(".", "_") + "_LifecycleAdapter";
    }

    public static int d(Class cls) {
        Integer num = (Integer) f9705a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int g7 = g(cls);
        f9705a.put(cls, Integer.valueOf(g7));
        return g7;
    }

    public static boolean e(Class cls) {
        return cls != null && g.class.isAssignableFrom(cls);
    }

    public static f f(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        Class<?> cls = obj.getClass();
        if (d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) f9706b.get(cls);
        if (list.size() == 1) {
            a((Constructor) list.get(0), obj);
            return new SingleGeneratedAdapterObserver(null);
        }
        c[] cVarArr = new c[list.size()];
        for (int i7 = 0; i7 < list.size(); i7++) {
            a((Constructor) list.get(i7), obj);
            cVarArr[i7] = null;
        }
        return new CompositeGeneratedAdaptersObserver(cVarArr);
    }

    public static int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor b7 = b(cls);
        if (b7 != null) {
            f9706b.put(cls, Collections.singletonList(b7));
            return 2;
        }
        if (a.f9678c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (!e(superclass)) {
            arrayList = null;
        } else {
            if (d(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList((Collection) f9706b.get(superclass));
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (e(cls2)) {
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll((Collection) f9706b.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f9706b.put(cls, arrayList);
        return 2;
    }
}
