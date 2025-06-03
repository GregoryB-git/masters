package Z3;

import Q3.d;
import Q3.g;
import Q3.j;
import Q3.o;
import Q3.q;
import Y3.m;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentMap f7851a = new ConcurrentHashMap();

    /* renamed from: Z3.a$a, reason: collision with other inner class name */
    public static class C0138a {

        /* renamed from: a, reason: collision with root package name */
        public final Class f7852a;

        /* renamed from: b, reason: collision with root package name */
        public final Constructor f7853b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f7854c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f7855d;

        /* renamed from: e, reason: collision with root package name */
        public final Map f7856e = new HashMap();

        /* renamed from: g, reason: collision with root package name */
        public final Map f7858g = new HashMap();

        /* renamed from: f, reason: collision with root package name */
        public final Map f7857f = new HashMap();

        /* renamed from: h, reason: collision with root package name */
        public final Map f7859h = new HashMap();

        public C0138a(Class cls) {
            Constructor constructor;
            this.f7852a = cls;
            this.f7854c = cls.isAnnotationPresent(q.class);
            this.f7855d = !cls.isAnnotationPresent(j.class);
            try {
                constructor = cls.getDeclaredConstructor(new Class[0]);
                constructor.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                constructor = null;
            }
            this.f7853b = constructor;
            for (Method method : cls.getMethods()) {
                if (i(method)) {
                    String e7 = e(method);
                    a(e7);
                    method.setAccessible(true);
                    if (this.f7857f.containsKey(e7)) {
                        throw new d("Found conflicting getters for name: " + method.getName());
                    }
                    this.f7857f.put(e7, method);
                }
            }
            for (Field field : cls.getFields()) {
                if (h(field)) {
                    a(d(field));
                }
            }
            Class cls2 = cls;
            do {
                for (Method method2 : cls2.getDeclaredMethods()) {
                    if (j(method2)) {
                        String e8 = e(method2);
                        String str = (String) this.f7856e.get(e8.toLowerCase(Locale.US));
                        if (str == null) {
                            continue;
                        } else {
                            if (!str.equals(e8)) {
                                throw new d("Found setter with invalid case-sensitive name: " + method2.getName());
                            }
                            Method method3 = (Method) this.f7858g.get(e8);
                            if (method3 == null) {
                                method2.setAccessible(true);
                                this.f7858g.put(e8, method2);
                            } else if (!c(method2, method3)) {
                                throw new d("Found a conflicting setters with name: " + method2.getName() + " (conflicts with " + method3.getName() + " defined on " + method3.getDeclaringClass().getName() + ")");
                            }
                        }
                    }
                }
                for (Field field2 : cls2.getDeclaredFields()) {
                    String d7 = d(field2);
                    if (this.f7856e.containsKey(d7.toLowerCase(Locale.US)) && !this.f7859h.containsKey(d7)) {
                        field2.setAccessible(true);
                        this.f7859h.put(d7, field2);
                    }
                }
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    break;
                }
            } while (!cls2.equals(Object.class));
            if (this.f7856e.isEmpty()) {
                throw new d("No properties to serialize found on class " + cls.getName());
            }
        }

        public static String b(AccessibleObject accessibleObject) {
            if (accessibleObject.isAnnotationPresent(o.class)) {
                return ((o) accessibleObject.getAnnotation(o.class)).value();
            }
            return null;
        }

        public static boolean c(Method method, Method method2) {
            m.g(method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()), "Expected override from a base class");
            Class<?> returnType = method.getReturnType();
            Class cls = Void.TYPE;
            m.g(returnType.equals(cls), "Expected void return type");
            m.g(method2.getReturnType().equals(cls), "Expected void return type");
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] parameterTypes2 = method2.getParameterTypes();
            m.g(parameterTypes.length == 1, "Expected exactly one parameter");
            m.g(parameterTypes2.length == 1, "Expected exactly one parameter");
            return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
        }

        public static String d(Field field) {
            String b7 = b(field);
            return b7 != null ? b7 : field.getName();
        }

        public static String e(Method method) {
            String b7 = b(method);
            return b7 != null ? b7 : g(method.getName());
        }

        public static String g(String str) {
            String[] strArr = {"get", "set", "is"};
            String str2 = null;
            for (int i7 = 0; i7 < 3; i7++) {
                String str3 = strArr[i7];
                if (str.startsWith(str3)) {
                    str2 = str3;
                }
            }
            if (str2 == null) {
                throw new IllegalArgumentException("Unknown Bean prefix for method: " + str);
            }
            char[] charArray = str.substring(str2.length()).toCharArray();
            for (int i8 = 0; i8 < charArray.length && Character.isUpperCase(charArray[i8]); i8++) {
                charArray[i8] = Character.toLowerCase(charArray[i8]);
            }
            return new String(charArray);
        }

        public static boolean h(Field field) {
            return (field.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(field.getModifiers()) || Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(field.getModifiers()) || field.isAnnotationPresent(g.class)) ? false : true;
        }

        public static boolean i(Method method) {
            return ((!method.getName().startsWith("get") && !method.getName().startsWith("is")) || method.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(method.getModifiers()) || Modifier.isStatic(method.getModifiers()) || method.getReturnType().equals(Void.TYPE) || method.getParameterTypes().length != 0 || method.isAnnotationPresent(g.class)) ? false : true;
        }

        public static boolean j(Method method) {
            return method.getName().startsWith("set") && !method.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 1 && !method.isAnnotationPresent(g.class);
        }

        public final void a(String str) {
            Map map = this.f7856e;
            Locale locale = Locale.US;
            String str2 = (String) map.put(str.toLowerCase(locale), str);
            if (str2 == null || str.equals(str2)) {
                return;
            }
            throw new d("Found two getters or fields with conflicting case sensitivity for property: " + str.toLowerCase(locale));
        }

        public Map f(Object obj) {
            Object obj2;
            if (!this.f7852a.isAssignableFrom(obj.getClass())) {
                throw new IllegalArgumentException("Can't serialize object of class " + obj.getClass() + " with BeanMapper for class " + this.f7852a);
            }
            HashMap hashMap = new HashMap();
            for (String str : this.f7856e.values()) {
                if (this.f7857f.containsKey(str)) {
                    try {
                        obj2 = ((Method) this.f7857f.get(str)).invoke(obj, new Object[0]);
                    } catch (IllegalAccessException e7) {
                        throw new RuntimeException(e7);
                    } catch (InvocationTargetException e8) {
                        throw new RuntimeException(e8);
                    }
                } else {
                    Field field = (Field) this.f7859h.get(str);
                    if (field == null) {
                        throw new IllegalStateException("Bean property without field or getter:" + str);
                    }
                    try {
                        obj2 = field.get(obj);
                    } catch (IllegalAccessException e9) {
                        throw new RuntimeException(e9);
                    }
                }
                hashMap.put(str, a.e(obj2));
            }
            return hashMap;
        }
    }

    public static Object b(Object obj) {
        return e(obj);
    }

    public static Map c(Map map) {
        Object e7 = e(map);
        m.f(e7 instanceof Map);
        return (Map) e7;
    }

    public static C0138a d(Class cls) {
        ConcurrentMap concurrentMap = f7851a;
        C0138a c0138a = (C0138a) concurrentMap.get(cls);
        if (c0138a != null) {
            return c0138a;
        }
        C0138a c0138a2 = new C0138a(cls);
        concurrentMap.put(cls, c0138a2);
        return c0138a2;
    }

    public static Object e(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            if ((obj instanceof Float) || (obj instanceof Double)) {
                Number number = (Number) obj;
                double doubleValue = number.doubleValue();
                return (doubleValue > 9.223372036854776E18d || doubleValue < -9.223372036854776E18d || Math.floor(doubleValue) != doubleValue) ? Double.valueOf(doubleValue) : Long.valueOf(number.longValue());
            }
            if ((obj instanceof Long) || (obj instanceof Integer)) {
                return obj;
            }
            throw new d(String.format("Numbers of type %s are not supported, please use an int, long, float or double", obj.getClass().getSimpleName()));
        }
        if (obj instanceof String) {
            return obj;
        }
        if (obj instanceof Boolean) {
            return obj;
        }
        if (obj instanceof Character) {
            throw new d("Characters are not supported, please use Strings");
        }
        if (obj instanceof Map) {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw new d("Maps with non-string keys are not supported");
                }
                hashMap.put((String) key, e(entry.getValue()));
            }
            return hashMap;
        }
        if (!(obj instanceof Collection)) {
            if (obj.getClass().isArray()) {
                throw new d("Serializing Arrays is not supported, please use Lists instead");
            }
            return obj instanceof Enum ? ((Enum) obj).name() : d(obj.getClass()).f(obj);
        }
        if (!(obj instanceof List)) {
            throw new d("Serializing Collections is not supported, please use Lists instead");
        }
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(e(it.next()));
        }
        return arrayList;
    }
}
