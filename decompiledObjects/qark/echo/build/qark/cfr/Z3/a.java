/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NoSuchMethodException
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.Void
 *  java.lang.annotation.Annotation
 *  java.lang.reflect.AccessibleObject
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.Field
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.lang.reflect.Modifier
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.ConcurrentMap
 */
package Z3;

import Q3.d;
import Q3.g;
import Q3.j;
import Q3.o;
import Q3.q;
import Y3.m;
import java.lang.annotation.Annotation;
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
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public abstract class a {
    public static final ConcurrentMap a = new ConcurrentHashMap();

    public static Object b(Object object) {
        return a.e(object);
    }

    public static Map c(Map object) {
        object = a.e(object);
        m.f(object instanceof Map);
        return (Map)object;
    }

    public static a d(Class class_) {
        a a8;
        ConcurrentMap concurrentMap = a;
        a a9 = a8 = (a)concurrentMap.get((Object)class_);
        if (a8 == null) {
            a9 = new a(class_);
            concurrentMap.put((Object)class_, (Object)a9);
        }
        return a9;
    }

    public static Object e(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof Number) {
            if (!(object instanceof Float) && !(object instanceof Double)) {
                if (!(object instanceof Long)) {
                    if (object instanceof Integer) {
                        return object;
                    }
                    throw new d(String.format((String)"Numbers of type %s are not supported, please use an int, long, float or double", (Object[])new Object[]{object.getClass().getSimpleName()}));
                }
                return object;
            }
            double d8 = (object = (Number)object).doubleValue();
            if (d8 <= 9.223372036854776E18 && d8 >= -9.223372036854776E18 && Math.floor((double)d8) == d8) {
                return object.longValue();
            }
            return d8;
        }
        if (object instanceof String) {
            return object;
        }
        if (object instanceof Boolean) {
            return object;
        }
        if (!(object instanceof Character)) {
            if (object instanceof Map) {
                HashMap hashMap = new HashMap();
                for (Map.Entry entry : ((Map)object).entrySet()) {
                    Object object2 = entry.getKey();
                    if (object2 instanceof String) {
                        hashMap.put((Object)((String)object2), a.e(entry.getValue()));
                        continue;
                    }
                    throw new d("Maps with non-string keys are not supported");
                }
                return hashMap;
            }
            if (object instanceof Collection) {
                if (object instanceof List) {
                    List list = (List)object;
                    object = new ArrayList(list.size());
                    list = list.iterator();
                    while (list.hasNext()) {
                        object.add(a.e(list.next()));
                    }
                    return object;
                }
                throw new d("Serializing Collections is not supported, please use Lists instead");
            }
            if (!object.getClass().isArray()) {
                if (object instanceof Enum) {
                    return ((Enum)object).name();
                }
                return a.d(object.getClass()).f(object);
            }
            throw new d("Serializing Arrays is not supported, please use Lists instead");
        }
        throw new d("Characters are not supported, please use Strings");
    }

    public static class a {
        public final Class a;
        public final Constructor b;
        public final boolean c;
        public final boolean d;
        public final Map e;
        public final Map f;
        public final Map g;
        public final Map h;

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public a(Class class_) {
            Method method4;
            Method method22;
            block11 : {
                this.a = class_;
                this.c = class_.isAnnotationPresent(q.class);
                this.d = class_.isAnnotationPresent(j.class) ^ true;
                this.e = new HashMap();
                this.g = new HashMap();
                this.f = new HashMap();
                this.h = new HashMap();
                try {
                    method22 = class_.getDeclaredConstructor(new Class[0]);
                    method22.setAccessible(true);
                    break block11;
                }
                catch (NoSuchMethodException noSuchMethodException) {}
                method22 = null;
            }
            this.b = method22;
            for (Method method22 : class_.getMethods()) {
                if (!a.i(method22)) continue;
                Method method3 = a.e(method22);
                this.a((String)method3);
                method22.setAccessible(true);
                if (this.f.containsKey((Object)method3)) {
                    class_ = new StringBuilder();
                    class_.append("Found conflicting getters for name: ");
                    class_.append(method22.getName());
                    throw new d(class_.toString());
                }
                this.f.put((Object)method3, (Object)method22);
            }
            for (Method method4 : class_.getFields()) {
                if (!a.h((Field)method4)) continue;
                this.a(a.d((Field)method4));
            }
            method22 = class_;
            do {
                String string2;
                for (Method method4 : method22.getDeclaredMethods()) {
                    String string3;
                    if (!a.j(method4) || (string3 = (String)this.e.get((Object)(string2 = a.e(method4)).toLowerCase(Locale.US))) == null) continue;
                    if (!string3.equals((Object)string2)) {
                        class_ = new StringBuilder();
                        class_.append("Found setter with invalid case-sensitive name: ");
                        class_.append(method4.getName());
                        throw new d(class_.toString());
                    }
                    string3 = (Method)this.g.get((Object)string2);
                    if (string3 == null) {
                        method4.setAccessible(true);
                        this.g.put((Object)string2, (Object)method4);
                        continue;
                    }
                    if (a.c(method4, (Method)string3)) continue;
                    class_ = new StringBuilder();
                    class_.append("Found a conflicting setters with name: ");
                    class_.append(method4.getName());
                    class_.append(" (conflicts with ");
                    class_.append(string3.getName());
                    class_.append(" defined on ");
                    class_.append(string3.getDeclaringClass().getName());
                    class_.append(")");
                    throw new d(class_.toString());
                }
                for (Method method3 : method22.getDeclaredFields()) {
                    string2 = a.d((Field)method3);
                    if (!this.e.containsKey((Object)string2.toLowerCase(Locale.US)) || this.h.containsKey((Object)string2)) continue;
                    method3.setAccessible(true);
                    this.h.put((Object)string2, (Object)method3);
                }
                method4 = method22.getSuperclass();
                if (method4 == null) break;
                method22 = method4;
            } while (!method4.equals(Object.class));
            if (!this.e.isEmpty()) {
                return;
            }
            method22 = new StringBuilder();
            method22.append("No properties to serialize found on class ");
            method22.append(class_.getName());
            throw new d(method22.toString());
        }

        public static String b(AccessibleObject accessibleObject) {
            if (accessibleObject.isAnnotationPresent(o.class)) {
                return ((o)accessibleObject.getAnnotation(o.class)).value();
            }
            return null;
        }

        public static boolean c(Method method, Method method2) {
            m.g(method.getDeclaringClass().isAssignableFrom(method2.getDeclaringClass()), "Expected override from a base class");
            Class[] arrclass = method.getReturnType();
            Class[] arrclass2 = Void.TYPE;
            m.g(arrclass.equals((Object)arrclass2), "Expected void return type");
            m.g(method2.getReturnType().equals((Object)arrclass2), "Expected void return type");
            arrclass = method.getParameterTypes();
            arrclass2 = method2.getParameterTypes();
            int n8 = arrclass.length;
            boolean bl = false;
            boolean bl2 = n8 == 1;
            m.g(bl2, "Expected exactly one parameter");
            bl2 = arrclass2.length == 1;
            m.g(bl2, "Expected exactly one parameter");
            bl2 = bl;
            if (method.getName().equals((Object)method2.getName())) {
                bl2 = bl;
                if (arrclass[0].equals((Object)arrclass2[0])) {
                    bl2 = true;
                }
            }
            return bl2;
        }

        public static String d(Field field) {
            String string2 = a.b((AccessibleObject)field);
            if (string2 != null) {
                return string2;
            }
            return field.getName();
        }

        public static String e(Method method) {
            String string2 = a.b((AccessibleObject)method);
            if (string2 != null) {
                return string2;
            }
            return a.g(method.getName());
        }

        public static String g(String arrc) {
            int n8;
            Object object = null;
            int n9 = 0;
            for (n8 = 0; n8 < 3; ++n8) {
                String string2 = new String[]{"get", "set", "is"}[n8];
                if (!arrc.startsWith(string2)) continue;
                object = string2;
            }
            if (object != null) {
                arrc = arrc.substring(object.length()).toCharArray();
                for (n8 = n9; n8 < arrc.length && Character.isUpperCase((char)arrc[n8]); ++n8) {
                    arrc[n8] = Character.toLowerCase((char)arrc[n8]);
                }
                return new String(arrc);
            }
            object = new StringBuilder();
            object.append("Unknown Bean prefix for method: ");
            object.append((String)arrc);
            throw new IllegalArgumentException(object.toString());
        }

        public static boolean h(Field field) {
            if (field.getDeclaringClass().equals(Object.class)) {
                return false;
            }
            if (!Modifier.isPublic((int)field.getModifiers())) {
                return false;
            }
            if (Modifier.isStatic((int)field.getModifiers())) {
                return false;
            }
            if (Modifier.isTransient((int)field.getModifiers())) {
                return false;
            }
            if (field.isAnnotationPresent(g.class)) {
                return false;
            }
            return true;
        }

        public static boolean i(Method method) {
            if (!method.getName().startsWith("get") && !method.getName().startsWith("is")) {
                return false;
            }
            if (method.getDeclaringClass().equals(Object.class)) {
                return false;
            }
            if (!Modifier.isPublic((int)method.getModifiers())) {
                return false;
            }
            if (Modifier.isStatic((int)method.getModifiers())) {
                return false;
            }
            if (method.getReturnType().equals((Object)Void.TYPE)) {
                return false;
            }
            if (method.getParameterTypes().length != 0) {
                return false;
            }
            if (method.isAnnotationPresent(g.class)) {
                return false;
            }
            return true;
        }

        public static boolean j(Method method) {
            if (!method.getName().startsWith("set")) {
                return false;
            }
            if (method.getDeclaringClass().equals(Object.class)) {
                return false;
            }
            if (Modifier.isStatic((int)method.getModifiers())) {
                return false;
            }
            if (!method.getReturnType().equals((Object)Void.TYPE)) {
                return false;
            }
            if (method.getParameterTypes().length != 1) {
                return false;
            }
            if (method.isAnnotationPresent(g.class)) {
                return false;
            }
            return true;
        }

        public final void a(String string2) {
            Object object = this.e;
            Locale locale = Locale.US;
            if ((object = (String)object.put((Object)string2.toLowerCase(locale), (Object)string2)) != null) {
                if (string2.equals(object)) {
                    return;
                }
                object = new StringBuilder();
                object.append("Found two getters or fields with conflicting case sensitivity for property: ");
                object.append(string2.toLowerCase(locale));
                throw new d(object.toString());
            }
        }

        public Map f(Object object) {
            block12 : {
                if (!this.a.isAssignableFrom(object.getClass())) break block12;
                HashMap hashMap = new HashMap();
                for (String string2 : this.e.values()) {
                    block13 : {
                        Object object2;
                        block10 : {
                            if (this.f.containsKey((Object)string2)) {
                                IllegalAccessException illegalAccessException2;
                                block11 : {
                                    object2 = (Method)this.f.get((Object)string2);
                                    try {
                                        object2 = object2.invoke(object, new Object[0]);
                                        break block10;
                                    }
                                    catch (InvocationTargetException invocationTargetException) {
                                    }
                                    catch (IllegalAccessException illegalAccessException2) {
                                        break block11;
                                    }
                                    throw new RuntimeException((Throwable)invocationTargetException);
                                }
                                throw new RuntimeException((Throwable)illegalAccessException2);
                            }
                            object2 = (Field)this.h.get((Object)string2);
                            if (object2 == null) break block13;
                            try {
                                object2 = object2.get(object);
                            }
                            catch (IllegalAccessException illegalAccessException) {
                                throw new RuntimeException((Throwable)illegalAccessException);
                            }
                        }
                        hashMap.put((Object)string2, a.e(object2));
                        continue;
                    }
                    object = new StringBuilder();
                    object.append("Bean property without field or getter:");
                    object.append(string2);
                    throw new IllegalStateException(object.toString());
                }
                return hashMap;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Can't serialize object of class ");
            stringBuilder.append((Object)object.getClass());
            stringBuilder.append(" with BeanMapper for class ");
            stringBuilder.append((Object)this.a);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

}

