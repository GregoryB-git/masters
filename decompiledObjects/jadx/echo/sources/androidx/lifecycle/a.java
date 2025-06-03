package androidx.lifecycle;

import androidx.lifecycle.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static a f9678c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Map f9679a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map f9680b = new HashMap();

    /* renamed from: androidx.lifecycle.a$a, reason: collision with other inner class name */
    public static class C0161a {

        /* renamed from: a, reason: collision with root package name */
        public final Map f9681a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final Map f9682b;

        public C0161a(Map map) {
            this.f9682b = map;
            for (Map.Entry entry : map.entrySet()) {
                d.b bVar = (d.b) entry.getValue();
                List list = (List) this.f9681a.get(bVar);
                if (list == null) {
                    list = new ArrayList();
                    this.f9681a.put(bVar, list);
                }
                list.add(entry.getKey());
            }
        }

        public static void b(List list, h hVar, d.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((b) list.get(size)).a(hVar, bVar, obj);
                }
            }
        }

        public void a(h hVar, d.b bVar, Object obj) {
            b((List) this.f9681a.get(bVar), hVar, bVar, obj);
            b((List) this.f9681a.get(d.b.ON_ANY), hVar, bVar, obj);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f9683a;

        /* renamed from: b, reason: collision with root package name */
        public final Method f9684b;

        public b(int i7, Method method) {
            this.f9683a = i7;
            this.f9684b = method;
            method.setAccessible(true);
        }

        public void a(h hVar, d.b bVar, Object obj) {
            try {
                int i7 = this.f9683a;
                if (i7 == 0) {
                    this.f9684b.invoke(obj, new Object[0]);
                } else if (i7 == 1) {
                    this.f9684b.invoke(obj, hVar);
                } else {
                    if (i7 != 2) {
                        return;
                    }
                    this.f9684b.invoke(obj, hVar, bVar);
                }
            } catch (IllegalAccessException e7) {
                throw new RuntimeException(e7);
            } catch (InvocationTargetException e8) {
                throw new RuntimeException("Failed to call observer method", e8.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f9683a == bVar.f9683a && this.f9684b.getName().equals(bVar.f9684b.getName());
        }

        public int hashCode() {
            return (this.f9683a * 31) + this.f9684b.getName().hashCode();
        }
    }

    public final C0161a a(Class cls, Method[] methodArr) {
        int i7;
        C0161a c7;
        Class superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (c7 = c(superclass)) != null) {
            hashMap.putAll(c7.f9682b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f9682b.entrySet()) {
                e(hashMap, (b) entry.getKey(), (d.b) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z7 = false;
        for (Method method : methodArr) {
            n nVar = (n) method.getAnnotation(n.class);
            if (nVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i7 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(h.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i7 = 1;
                }
                d.b value = nVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(d.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != d.b.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i7 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(hashMap, new b(i7, method), value, cls);
                z7 = true;
            }
        }
        C0161a c0161a = new C0161a(hashMap);
        this.f9679a.put(cls, c0161a);
        this.f9680b.put(cls, Boolean.valueOf(z7));
        return c0161a;
    }

    public final Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e7) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e7);
        }
    }

    public C0161a c(Class cls) {
        C0161a c0161a = (C0161a) this.f9679a.get(cls);
        return c0161a != null ? c0161a : a(cls, null);
    }

    public boolean d(Class cls) {
        Boolean bool = (Boolean) this.f9680b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] b7 = b(cls);
        for (Method method : b7) {
            if (((n) method.getAnnotation(n.class)) != null) {
                a(cls, b7);
                return true;
            }
        }
        this.f9680b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map map, b bVar, d.b bVar2, Class cls) {
        d.b bVar3 = (d.b) map.get(bVar);
        if (bVar3 == null || bVar2 == bVar3) {
            if (bVar3 == null) {
                map.put(bVar, bVar2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + bVar.f9684b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar3 + ", new value " + bVar2);
    }
}
