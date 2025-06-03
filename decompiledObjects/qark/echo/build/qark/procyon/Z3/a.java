// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package Z3;

import java.lang.reflect.InvocationTargetException;
import Q3.g;
import java.lang.reflect.Modifier;
import java.lang.annotation.Annotation;
import Q3.o;
import java.lang.reflect.AccessibleObject;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Locale;
import Q3.j;
import Q3.q;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Collection;
import java.util.HashMap;
import Q3.d;
import Y3.m;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public abstract class a
{
    public static final ConcurrentMap a;
    
    static {
        a = new ConcurrentHashMap();
    }
    
    public static Object b(final Object o) {
        return e(o);
    }
    
    public static Map c(final Map map) {
        final Object e = e(map);
        m.f(e instanceof Map);
        return (Map)e;
    }
    
    public static a d(final Class clazz) {
        final ConcurrentMap a = Z3.a.a;
        a a2;
        if ((a2 = a.get(clazz)) == null) {
            a2 = new a(clazz);
            a.put(clazz, a2);
        }
        return a2;
    }
    
    public static Object e(final Object o) {
        if (o == null) {
            return null;
        }
        if (o instanceof Number) {
            if (!(o instanceof Float) && !(o instanceof Double)) {
                if (o instanceof Long) {
                    return o;
                }
                if (o instanceof Integer) {
                    return o;
                }
                throw new d(String.format("Numbers of type %s are not supported, please use an int, long, float or double", o.getClass().getSimpleName()));
            }
            else {
                final Number n = (Number)o;
                final double doubleValue = n.doubleValue();
                if (doubleValue <= 9.223372036854776E18 && doubleValue >= -9.223372036854776E18 && Math.floor(doubleValue) == doubleValue) {
                    return n.longValue();
                }
                return doubleValue;
            }
        }
        else {
            if (o instanceof String) {
                return o;
            }
            if (o instanceof Boolean) {
                return o;
            }
            if (o instanceof Character) {
                throw new d("Characters are not supported, please use Strings");
            }
            if (o instanceof Map) {
                final HashMap<String, Object> hashMap = new HashMap<String, Object>();
                for (final Map.Entry<Object, V> entry : ((Map)o).entrySet()) {
                    final String key = entry.getKey();
                    if (!(key instanceof String)) {
                        throw new d("Maps with non-string keys are not supported");
                    }
                    hashMap.put(key, e(entry.getValue()));
                }
                return hashMap;
            }
            if (o instanceof Collection) {
                if (o instanceof List) {
                    final List list = (List)o;
                    final ArrayList list2 = new ArrayList<Object>(list.size());
                    final Iterator<Object> iterator2 = list.iterator();
                    while (iterator2.hasNext()) {
                        list2.add(e(iterator2.next()));
                    }
                    return list2;
                }
                throw new d("Serializing Collections is not supported, please use Lists instead");
            }
            else {
                if (o.getClass().isArray()) {
                    throw new d("Serializing Arrays is not supported, please use Lists instead");
                }
                if (o instanceof Enum) {
                    return ((Enum)o).name();
                }
                return d(o.getClass()).f(o);
            }
        }
    }
    
    public static class a
    {
        public final Class a;
        public final Constructor b;
        public final boolean c;
        public final boolean d;
        public final Map e;
        public final Map f;
        public final Map g;
        public final Map h;
        
        public a(Class a) {
            this.a = (Class)a;
            this.c = ((Class)a).isAnnotationPresent(q.class);
            this.d = (((Class)a).isAnnotationPresent(j.class) ^ true);
            this.e = new HashMap();
            this.g = new HashMap();
            this.f = new HashMap();
            this.h = new HashMap();
            while (true) {
                try {
                    Constructor declaredConstructor = ((Class)a).getDeclaredConstructor((Class[])new Class[0]);
                    declaredConstructor.setAccessible(true);
                    while (true) {
                        this.b = declaredConstructor;
                        final Method[] methods = ((Class)a).getMethods();
                        for (int length = methods.length, i = 0; i < length; ++i) {
                            final Method method = methods[i];
                            if (i(method)) {
                                final String e = e(method);
                                this.a(e);
                                method.setAccessible(true);
                                if (this.f.containsKey(e)) {
                                    a = new StringBuilder();
                                    a.append("Found conflicting getters for name: ");
                                    a.append(method.getName());
                                    throw new d(a.toString());
                                }
                                this.f.put(e, method);
                            }
                        }
                        final Field[] fields = ((Class)a).getFields();
                        for (int length2 = fields.length, j = 0; j < length2; ++j) {
                            final Field field = fields[j];
                            if (h(field)) {
                                this.a(d(field));
                            }
                        }
                        Serializable s = a;
                        Class superclass;
                        do {
                            final Method[] declaredMethods = ((Class)s).getDeclaredMethods();
                            for (int length3 = declaredMethods.length, k = 0; k < length3; ++k) {
                                final Method method2 = declaredMethods[k];
                                if (j(method2)) {
                                    final String e2 = e(method2);
                                    final String s2 = this.e.get(e2.toLowerCase(Locale.US));
                                    if (s2 != null) {
                                        if (!s2.equals(e2)) {
                                            a = new StringBuilder();
                                            a.append("Found setter with invalid case-sensitive name: ");
                                            a.append(method2.getName());
                                            throw new d(a.toString());
                                        }
                                        final Method method3 = this.g.get(e2);
                                        if (method3 == null) {
                                            method2.setAccessible(true);
                                            this.g.put(e2, method2);
                                        }
                                        else if (!c(method2, method3)) {
                                            a = new StringBuilder();
                                            a.append("Found a conflicting setters with name: ");
                                            a.append(method2.getName());
                                            a.append(" (conflicts with ");
                                            a.append(method3.getName());
                                            a.append(" defined on ");
                                            a.append(method3.getDeclaringClass().getName());
                                            a.append(")");
                                            throw new d(a.toString());
                                        }
                                    }
                                }
                            }
                            final Field[] declaredFields = ((Class)s).getDeclaredFields();
                            for (int length4 = declaredFields.length, l = 0; l < length4; ++l) {
                                final Field field2 = declaredFields[l];
                                final String d = d(field2);
                                if (this.e.containsKey(d.toLowerCase(Locale.US)) && !this.h.containsKey(d)) {
                                    field2.setAccessible(true);
                                    this.h.put(d, field2);
                                }
                            }
                            superclass = ((Class)s).getSuperclass();
                            if (superclass == null) {
                                break;
                            }
                            s = superclass;
                        } while (!superclass.equals(Object.class));
                        if (!this.e.isEmpty()) {
                            return;
                        }
                        final StringBuilder sb = new StringBuilder();
                        sb.append("No properties to serialize found on class ");
                        sb.append(((Class)a).getName());
                        throw new d(sb.toString());
                        declaredConstructor = null;
                        continue;
                    }
                }
                catch (NoSuchMethodException ex) {}
                continue;
            }
        }
        
        public static String b(final AccessibleObject accessibleObject) {
            if (accessibleObject.isAnnotationPresent(o.class)) {
                return accessibleObject.getAnnotation(o.class).value();
            }
            return null;
        }
        
        public static boolean c(final Method method, final Method method2) {
            m.g(method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()), "Expected override from a base class");
            final Class<?> returnType = method.getReturnType();
            final Class<Void> type = Void.TYPE;
            m.g(returnType.equals(type), "Expected void return type");
            m.g(method2.getReturnType().equals(type), "Expected void return type");
            final Class<?>[] parameterTypes = method.getParameterTypes();
            final Class<?>[] parameterTypes2 = method2.getParameterTypes();
            final int length = parameterTypes.length;
            final boolean b = false;
            m.g(length == 1, "Expected exactly one parameter");
            m.g(parameterTypes2.length == 1, "Expected exactly one parameter");
            boolean b2 = b;
            if (method.getName().equals(method2.getName())) {
                b2 = b;
                if (parameterTypes[0].equals(parameterTypes2[0])) {
                    b2 = true;
                }
            }
            return b2;
        }
        
        public static String d(final Field field) {
            final String b = b(field);
            if (b != null) {
                return b;
            }
            return field.getName();
        }
        
        public static String e(final Method method) {
            final String b = b(method);
            if (b != null) {
                return b;
            }
            return g(method.getName());
        }
        
        public static String g(final String str) {
            String s = null;
            final int n = 0;
            for (int i = 0; i < 3; ++i) {
                final String prefix = (new String[] { "get", "set", "is" })[i];
                if (str.startsWith(prefix)) {
                    s = prefix;
                }
            }
            if (s != null) {
                final char[] charArray = str.substring(s.length()).toCharArray();
                for (int n2 = n; n2 < charArray.length && Character.isUpperCase(charArray[n2]); ++n2) {
                    charArray[n2] = Character.toLowerCase(charArray[n2]);
                }
                return new String(charArray);
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Unknown Bean prefix for method: ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
        
        public static boolean h(final Field field) {
            return !field.getDeclaringClass().equals(Object.class) && Modifier.isPublic(field.getModifiers()) && !Modifier.isStatic(field.getModifiers()) && !Modifier.isTransient(field.getModifiers()) && !field.isAnnotationPresent(g.class);
        }
        
        public static boolean i(final Method method) {
            return (method.getName().startsWith("get") || method.getName().startsWith("is")) && !method.getDeclaringClass().equals(Object.class) && Modifier.isPublic(method.getModifiers()) && !Modifier.isStatic(method.getModifiers()) && !method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 0 && !method.isAnnotationPresent(g.class);
        }
        
        public static boolean j(final Method method) {
            return method.getName().startsWith("set") && !method.getDeclaringClass().equals(Object.class) && !Modifier.isStatic(method.getModifiers()) && method.getReturnType().equals(Void.TYPE) && method.getParameterTypes().length == 1 && !method.isAnnotationPresent(g.class);
        }
        
        public final void a(final String s) {
            final Map e = this.e;
            final Locale us = Locale.US;
            final String anObject = e.put(s.toLowerCase(us), s);
            if (anObject == null) {
                return;
            }
            if (s.equals(anObject)) {
                return;
            }
            final StringBuilder sb = new StringBuilder();
            sb.append("Found two getters or fields with conflicting case sensitivity for property: ");
            sb.append(s.toLowerCase(us));
            throw new d(sb.toString());
        }
        
        public Map f(final Object o) {
            if (this.a.isAssignableFrom(o.getClass())) {
                final HashMap<String, Object> hashMap = new HashMap<String, Object>();
                for (final String str : this.e.values()) {
                    Label_0150: {
                        if (this.f.containsKey(str)) {
                            final Method method = this.f.get(str);
                            try {
                                final Object o2 = method.invoke(o, new Object[0]);
                                break Label_0150;
                            }
                            catch (InvocationTargetException cause2) {}
                            catch (IllegalAccessException cause) {
                                throw new RuntimeException(cause);
                            }
                            final InvocationTargetException cause2;
                            throw new RuntimeException(cause2);
                        }
                        final Field field = this.h.get(str);
                        if (field == null) {
                            break Label_0150;
                        }
                        try {
                            final Object o2 = field.get(o);
                            hashMap.put(str, e(o2));
                            continue;
                        }
                        catch (IllegalAccessException cause3) {
                            throw new RuntimeException(cause3);
                        }
                    }
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Bean property without field or getter:");
                    sb.append(str);
                    throw new IllegalStateException(sb.toString());
                }
                return hashMap;
            }
            final StringBuilder sb2 = new StringBuilder();
            sb2.append("Can't serialize object of class ");
            sb2.append(o.getClass());
            sb2.append(" with BeanMapper for class ");
            sb2.append(this.a);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
