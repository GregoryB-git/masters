package n9;

import android.net.Uri;
import d9.m0;
import d9.s0;
import d9.w0;
import d9.y;
import d9.z;
import d9.z0;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f11349a = new ConcurrentHashMap();

    public static class a<T> {

        /* renamed from: a, reason: collision with root package name */
        public final Class<T> f11350a;

        /* renamed from: b, reason: collision with root package name */
        public final HashMap f11351b;

        /* renamed from: c, reason: collision with root package name */
        public final HashMap f11352c;

        /* renamed from: d, reason: collision with root package name */
        public final HashMap f11353d;

        /* renamed from: e, reason: collision with root package name */
        public final HashMap f11354e;
        public final HashSet<String> f;

        /* renamed from: g, reason: collision with root package name */
        public final HashSet<String> f11355g;

        public a(Class<T> cls) {
            this.f11350a = cls;
            cls.isAnnotationPresent(w0.class);
            cls.isAnnotationPresent(z.class);
            this.f11351b = new HashMap();
            this.f11353d = new HashMap();
            this.f11352c = new HashMap();
            this.f11354e = new HashMap();
            this.f = new HashSet<>();
            this.f11355g = new HashSet<>();
            try {
                cls.getDeclaredConstructor(new Class[0]).setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            for (Method method : cls.getMethods()) {
                if (((!method.getName().startsWith("get") && !method.getName().startsWith("is")) || method.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(method.getModifiers()) || Modifier.isStatic(method.getModifiers()) || method.getReturnType().equals(Void.TYPE) || method.getParameterTypes().length != 0 || method.isBridge() || method.isAnnotationPresent(d9.m.class)) ? false : true) {
                    String f = f(method);
                    a(f);
                    method.setAccessible(true);
                    if (this.f11352c.containsKey(f)) {
                        StringBuilder l10 = defpackage.f.l("Found conflicting getters for name ");
                        l10.append(method.getName());
                        l10.append(" on class ");
                        l10.append(cls.getName());
                        throw new RuntimeException(l10.toString());
                    }
                    this.f11352c.put(f, method);
                    if (method.isAnnotationPresent(s0.class)) {
                        Class<?> returnType = method.getReturnType();
                        if (returnType != Date.class && returnType != u7.m.class) {
                            StringBuilder l11 = defpackage.f.l("Method ");
                            l11.append(method.getName());
                            l11.append(" is annotated with @ServerTimestamp but returns ");
                            l11.append(returnType);
                            l11.append(" instead of Date or Timestamp.");
                            throw new IllegalArgumentException(l11.toString());
                        }
                        this.f.add(f(method));
                    }
                    if (method.isAnnotationPresent(d9.f.class)) {
                        c("Method", "returns", method.getReturnType());
                        this.f11355g.add(f(method));
                    }
                }
            }
            for (Field field : cls.getFields()) {
                if ((field.getDeclaringClass().equals(Object.class) || !Modifier.isPublic(field.getModifiers()) || Modifier.isStatic(field.getModifiers()) || Modifier.isTransient(field.getModifiers()) || field.isAnnotationPresent(d9.m.class)) ? false : true) {
                    a(e(field));
                    b(field);
                }
            }
            HashMap hashMap = new HashMap();
            Class<T> cls2 = cls;
            do {
                for (Method method2 : cls2.getDeclaredMethods()) {
                    if (method2.getName().startsWith("set") && !method2.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method2.getModifiers()) && method2.getReturnType().equals(Void.TYPE) && method2.getParameterTypes().length == 1 && !method2.isAnnotationPresent(d9.m.class)) {
                        String f10 = f(method2);
                        String str = (String) this.f11351b.get(f10.toLowerCase(Locale.US));
                        if (str == null) {
                            continue;
                        } else {
                            if (!str.equals(f10)) {
                                StringBuilder l12 = defpackage.f.l("Found setter on ");
                                l12.append(cls2.getName());
                                l12.append(" with invalid case-sensitive name: ");
                                l12.append(method2.getName());
                                throw new RuntimeException(l12.toString());
                            }
                            if (method2.isBridge()) {
                                hashMap.put(f10, method2);
                            } else {
                                Method method3 = (Method) this.f11353d.get(f10);
                                Method method4 = (Method) hashMap.get(f10);
                                if (method3 == null) {
                                    method2.setAccessible(true);
                                    this.f11353d.put(f10, method2);
                                    if (method2.isAnnotationPresent(s0.class)) {
                                        StringBuilder l13 = defpackage.f.l("Method ");
                                        l13.append(method2.getName());
                                        l13.append(" is annotated with @ServerTimestamp but should not be. @ServerTimestamp can only be applied to fields and getters, not setters.");
                                        throw new IllegalArgumentException(l13.toString());
                                    }
                                    if (method2.isAnnotationPresent(d9.f.class)) {
                                        c("Method", "accepts", method2.getParameterTypes()[0]);
                                        this.f11355g.add(f(method2));
                                    }
                                } else if (!d(method2, method3) && (method4 == null || !d(method2, method4))) {
                                    if (cls2 == cls) {
                                        StringBuilder l14 = defpackage.f.l("Class ");
                                        l14.append(cls.getName());
                                        l14.append(" has multiple setter overloads with name ");
                                        l14.append(method2.getName());
                                        throw new RuntimeException(l14.toString());
                                    }
                                    StringBuilder l15 = defpackage.f.l("Found conflicting setters with name: ");
                                    l15.append(method2.getName());
                                    l15.append(" (conflicts with ");
                                    l15.append(method3.getName());
                                    l15.append(" defined on ");
                                    l15.append(method3.getDeclaringClass().getName());
                                    l15.append(")");
                                    throw new RuntimeException(l15.toString());
                                }
                            }
                        }
                    }
                }
                for (Field field2 : cls2.getDeclaredFields()) {
                    String e10 = e(field2);
                    if (this.f11351b.containsKey(e10.toLowerCase(Locale.US)) && !this.f11354e.containsKey(e10)) {
                        field2.setAccessible(true);
                        this.f11354e.put(e10, field2);
                        b(field2);
                    }
                }
                cls2 = cls2.getSuperclass();
                if (cls2 == null) {
                    break;
                }
            } while (!cls2.equals(Object.class));
            if (this.f11351b.isEmpty()) {
                StringBuilder l16 = defpackage.f.l("No properties to serialize found on class ");
                l16.append(cls.getName());
                throw new RuntimeException(l16.toString());
            }
            Iterator<String> it = this.f11355g.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!this.f11353d.containsKey(next) && !this.f11354e.containsKey(next)) {
                    StringBuilder m10 = defpackage.f.m("@DocumentId is annotated on property ", next, " of class ");
                    m10.append(cls.getName());
                    m10.append(" but no field or public setter was found");
                    throw new RuntimeException(m10.toString());
                }
            }
        }

        public static void c(String str, String str2, Class cls) {
            if (cls == String.class || cls == com.google.firebase.firestore.c.class) {
                return;
            }
            throw new IllegalArgumentException(str + " is annotated with @DocumentId but " + str2 + " " + cls + " instead of String or DocumentReference.");
        }

        public static boolean d(Method method, Method method2) {
            e.a("Expected override from a base class", method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()));
            e.a("Expected void return type", method.getReturnType().equals(Void.TYPE));
            e.a("Expected void return type", method2.getReturnType().equals(Void.TYPE));
            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] parameterTypes2 = method2.getParameterTypes();
            e.a("Expected exactly one parameter", parameterTypes.length == 1);
            e.a("Expected exactly one parameter", parameterTypes2.length == 1);
            return method.getName().equals(method2.getName()) && parameterTypes[0].equals(parameterTypes2[0]);
        }

        public static String e(Field field) {
            String value = field.isAnnotationPresent(m0.class) ? ((m0) field.getAnnotation(m0.class)).value() : null;
            return value != null ? value : field.getName();
        }

        public static String f(Method method) {
            String str = null;
            String value = method.isAnnotationPresent(m0.class) ? ((m0) method.getAnnotation(m0.class)).value() : null;
            if (value != null) {
                return value;
            }
            String name = method.getName();
            String[] strArr = {"get", "set", "is"};
            for (int i10 = 0; i10 < 3; i10++) {
                String str2 = strArr[i10];
                if (name.startsWith(str2)) {
                    str = str2;
                }
            }
            if (str == null) {
                throw new IllegalArgumentException(defpackage.g.d("Unknown Bean prefix for method: ", name));
            }
            char[] charArray = name.substring(str.length()).toCharArray();
            for (int i11 = 0; i11 < charArray.length && Character.isUpperCase(charArray[i11]); i11++) {
                charArray[i11] = Character.toLowerCase(charArray[i11]);
            }
            return new String(charArray);
        }

        public final void a(String str) {
            HashMap hashMap = this.f11351b;
            Locale locale = Locale.US;
            String str2 = (String) hashMap.put(str.toLowerCase(locale), str);
            if (str2 == null || str.equals(str2)) {
                return;
            }
            StringBuilder l10 = defpackage.f.l("Found two getters or fields with conflicting case sensitivity for property: ");
            l10.append(str.toLowerCase(locale));
            throw new RuntimeException(l10.toString());
        }

        public final void b(Field field) {
            if (field.isAnnotationPresent(s0.class)) {
                Class<?> type = field.getType();
                if (type != Date.class && type != u7.m.class) {
                    StringBuilder l10 = defpackage.f.l("Field ");
                    l10.append(field.getName());
                    l10.append(" is annotated with @ServerTimestamp but is ");
                    l10.append(type);
                    l10.append(" instead of Date or Timestamp.");
                    throw new IllegalArgumentException(l10.toString());
                }
                this.f.add(e(field));
            }
            if (field.isAnnotationPresent(d9.f.class)) {
                c("Field", "is", field.getType());
                this.f11355g.add(e(field));
            }
        }
    }

    public static class b {

        /* renamed from: d, reason: collision with root package name */
        public static final b f11356d = new b(null, null, 0);

        /* renamed from: a, reason: collision with root package name */
        public final int f11357a;

        /* renamed from: b, reason: collision with root package name */
        public final b f11358b;

        /* renamed from: c, reason: collision with root package name */
        public final String f11359c;

        public b(b bVar, String str, int i10) {
            this.f11358b = bVar;
            this.f11359c = str;
            this.f11357a = i10;
        }

        public final String toString() {
            int i10 = this.f11357a;
            if (i10 == 0) {
                return "";
            }
            if (i10 == 1) {
                return this.f11359c;
            }
            return this.f11358b.toString() + "." + this.f11359c;
        }
    }

    public static void a(String str, boolean z10) {
        if (!z10) {
            throw new RuntimeException(defpackage.g.d("Hard assert failed: ", str));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> Object b(T t, b bVar) {
        Object obj;
        if (bVar.f11357a > 500) {
            throw c(bVar, "Exceeded maximum depth of 500, which likely indicates there's an object cycle");
        }
        if (t == 0) {
            return null;
        }
        if (t instanceof Number) {
            if ((t instanceof Long) || (t instanceof Integer) || (t instanceof Double) || (t instanceof Float)) {
                return t;
            }
            throw c(bVar, String.format("Numbers of type %s are not supported, please use an int, long, float or double", t.getClass().getSimpleName()));
        }
        if (t instanceof String) {
            return t;
        }
        if (t instanceof Boolean) {
            return t;
        }
        if (t instanceof Character) {
            throw c(bVar, "Characters are not supported, please use Strings");
        }
        if (t instanceof Map) {
            HashMap hashMap = new HashMap();
            for (Map.Entry entry : ((Map) t).entrySet()) {
                Object key = entry.getKey();
                if (!(key instanceof String)) {
                    throw c(bVar, "Maps with non-string keys are not supported");
                }
                String str = (String) key;
                hashMap.put(str, b(entry.getValue(), new b(bVar, str, bVar.f11357a + 1)));
            }
            return hashMap;
        }
        if (t instanceof Collection) {
            if (!(t instanceof List)) {
                throw c(bVar, "Serializing Collections is not supported, please use Lists instead");
            }
            List list = (List) t;
            ArrayList arrayList = new ArrayList(list.size());
            for (int i10 = 0; i10 < list.size(); i10++) {
                arrayList.add(b(list.get(i10), new b(bVar, a0.j.h("[", i10, "]"), bVar.f11357a + 1)));
            }
            return arrayList;
        }
        if (t.getClass().isArray()) {
            throw c(bVar, "Serializing Arrays is not supported, please use Lists instead");
        }
        if (t instanceof Enum) {
            String name = ((Enum) t).name();
            try {
                return a.e(t.getClass().getField(name));
            } catch (NoSuchFieldException unused) {
                return name;
            }
        }
        if ((t instanceof Date) || (t instanceof u7.m) || (t instanceof y) || (t instanceof d9.c) || (t instanceof com.google.firebase.firestore.c) || (t instanceof d9.o) || (t instanceof z0)) {
            return t;
        }
        if ((t instanceof Uri) || (t instanceof URI) || (t instanceof URL)) {
            return t.toString();
        }
        Class<?> cls = t.getClass();
        ConcurrentHashMap concurrentHashMap = f11349a;
        a aVar = (a) concurrentHashMap.get(cls);
        if (aVar == null) {
            aVar = new a(cls);
            concurrentHashMap.put(cls, aVar);
        }
        if (!aVar.f11350a.isAssignableFrom(t.getClass())) {
            StringBuilder l10 = defpackage.f.l("Can't serialize object of class ");
            l10.append(t.getClass());
            l10.append(" with BeanMapper for class ");
            l10.append(aVar.f11350a);
            throw new IllegalArgumentException(l10.toString());
        }
        HashMap hashMap2 = new HashMap();
        for (String str2 : aVar.f11351b.values()) {
            if (!aVar.f11355g.contains(str2)) {
                if (aVar.f11352c.containsKey(str2)) {
                    try {
                        obj = ((Method) aVar.f11352c.get(str2)).invoke(t, new Object[0]);
                    } catch (IllegalAccessException e10) {
                        throw new RuntimeException(e10);
                    } catch (InvocationTargetException e11) {
                        throw new RuntimeException(e11);
                    }
                } else {
                    Field field = (Field) aVar.f11354e.get(str2);
                    if (field == null) {
                        throw new IllegalStateException(defpackage.g.d("Bean property without field or getter: ", str2));
                    }
                    try {
                        obj = field.get(t);
                    } catch (IllegalAccessException e12) {
                        throw new RuntimeException(e12);
                    }
                }
                hashMap2.put(str2, (aVar.f.contains(str2) && obj == null) ? d9.o.f3695b : b(obj, new b(bVar, str2, bVar.f11357a + 1)));
            }
        }
        return hashMap2;
    }

    public static IllegalArgumentException c(b bVar, String str) {
        String d10 = defpackage.g.d("Could not serialize object. ", str);
        if (bVar.f11357a > 0) {
            StringBuilder g10 = defpackage.g.g(d10, " (found in field '");
            g10.append(bVar.toString());
            g10.append("')");
            d10 = g10.toString();
        }
        return new IllegalArgumentException(d10);
    }
}
