package b1;

import b1.k;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static b f1709c = new b();

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1710a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f1711b = new HashMap();

    @Deprecated
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final HashMap f1712a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final Map<C0028b, k.a> f1713b;

        public a(HashMap hashMap) {
            this.f1713b = hashMap;
            for (Map.Entry entry : hashMap.entrySet()) {
                k.a aVar = (k.a) entry.getValue();
                List list = (List) this.f1712a.get(aVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f1712a.put(aVar, list);
                }
                list.add((C0028b) entry.getKey());
            }
        }

        public static void a(List<C0028b> list, o oVar, k.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    C0028b c0028b = list.get(size);
                    c0028b.getClass();
                    try {
                        int i10 = c0028b.f1714a;
                        if (i10 == 0) {
                            c0028b.f1715b.invoke(obj, new Object[0]);
                        } else if (i10 == 1) {
                            c0028b.f1715b.invoke(obj, oVar);
                        } else if (i10 == 2) {
                            c0028b.f1715b.invoke(obj, oVar, aVar);
                        }
                    } catch (IllegalAccessException e10) {
                        throw new RuntimeException(e10);
                    } catch (InvocationTargetException e11) {
                        throw new RuntimeException("Failed to call observer method", e11.getCause());
                    }
                }
            }
        }
    }

    @Deprecated
    /* renamed from: b1.b$b, reason: collision with other inner class name */
    public static final class C0028b {

        /* renamed from: a, reason: collision with root package name */
        public final int f1714a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f1715b;

        public C0028b(int i10, Method method) {
            this.f1714a = i10;
            this.f1715b = method;
            method.setAccessible(true);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0028b)) {
                return false;
            }
            C0028b c0028b = (C0028b) obj;
            return this.f1714a == c0028b.f1714a && this.f1715b.getName().equals(c0028b.f1715b.getName());
        }

        public final int hashCode() {
            return this.f1715b.getName().hashCode() + (this.f1714a * 31);
        }
    }

    public static void c(HashMap hashMap, C0028b c0028b, k.a aVar, Class cls) {
        k.a aVar2 = (k.a) hashMap.get(c0028b);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                hashMap.put(c0028b, aVar);
                return;
            }
            return;
        }
        Method method = c0028b.f1715b;
        StringBuilder l10 = defpackage.f.l("Method ");
        l10.append(method.getName());
        l10.append(" in ");
        l10.append(cls.getName());
        l10.append(" already declared with different @OnLifecycleEvent value: previous value ");
        l10.append(aVar2);
        l10.append(", new value ");
        l10.append(aVar);
        throw new IllegalArgumentException(l10.toString());
    }

    public final a a(Class<?> cls, Method[] methodArr) {
        int i10;
        Class<? super Object> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null) {
            hashMap.putAll(b(superclass).f1713b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<C0028b, k.a> entry : b(cls2).f1713b.entrySet()) {
                c(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e10) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e10);
            }
        }
        boolean z10 = false;
        for (Method method : methodArr) {
            y yVar = (y) method.getAnnotation(y.class);
            if (yVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i10 = 0;
                } else {
                    if (!o.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i10 = 1;
                }
                k.a value = yVar.value();
                if (parameterTypes.length > 1) {
                    if (!k.a.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != k.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i10 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                c(hashMap, new C0028b(i10, method), value, cls);
                z10 = true;
            }
        }
        a aVar = new a(hashMap);
        this.f1710a.put(cls, aVar);
        this.f1711b.put(cls, Boolean.valueOf(z10));
        return aVar;
    }

    public final a b(Class<?> cls) {
        a aVar = (a) this.f1710a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }
}
