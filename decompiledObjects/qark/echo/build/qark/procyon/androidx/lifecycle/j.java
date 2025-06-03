// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package androidx.lifecycle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.lang.reflect.InvocationTargetException;
import android.support.v4.media.a;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

public abstract class j
{
    public static Map a;
    public static Map b;
    
    static {
        j.a = new HashMap();
        j.b = new HashMap();
    }
    
    public static c a(final Constructor constructor, final Object o) {
        try {
            android.support.v4.media.a.a(constructor.newInstance(o));
            return null;
        }
        catch (InvocationTargetException cause3) {}
        catch (InstantiationException cause) {
            throw new RuntimeException(cause);
        }
        catch (IllegalAccessException cause2) {
            throw new RuntimeException(cause2);
        }
        final InvocationTargetException cause3;
        throw new RuntimeException(cause3);
    }
    
    public static Constructor b(final Class clazz) {
        while (true) {
            while (true) {
                Label_0141: {
                    while (true) {
                        try {
                            final Package package1 = clazz.getPackage();
                            String s = clazz.getCanonicalName();
                            if (package1 != null) {
                                final String name = package1.getName();
                                if (!name.isEmpty()) {
                                    s = s.substring(name.length() + 1);
                                }
                                final String c = c(s);
                                String string;
                                if (name.isEmpty()) {
                                    string = c;
                                }
                                else {
                                    final StringBuilder sb = new StringBuilder();
                                    sb.append(name);
                                    sb.append(".");
                                    sb.append(c);
                                    string = sb.toString();
                                }
                                final Constructor<?> declaredConstructor = Class.forName(string).getDeclaredConstructor(clazz);
                                if (!declaredConstructor.isAccessible()) {
                                    declaredConstructor.setAccessible(true);
                                }
                                return declaredConstructor;
                            }
                            break Label_0141;
                            final NoSuchMethodException cause;
                            throw new RuntimeException(cause);
                        }
                        catch (ClassNotFoundException ex2) {
                            return null;
                        }
                        catch (NoSuchMethodException ex) {}
                        final NoSuchMethodException ex;
                        final NoSuchMethodException cause = ex;
                        continue;
                    }
                }
                final String name = "";
                continue;
            }
        }
    }
    
    public static String c(final String s) {
        final StringBuilder sb = new StringBuilder();
        sb.append(s.replace(".", "_"));
        sb.append("_LifecycleAdapter");
        return sb.toString();
    }
    
    public static int d(final Class clazz) {
        final Integer n = j.a.get(clazz);
        if (n != null) {
            return n;
        }
        final int g = g(clazz);
        j.a.put(clazz, g);
        return g;
    }
    
    public static boolean e(final Class clazz) {
        return clazz != null && g.class.isAssignableFrom(clazz);
    }
    
    public static f f(final Object o) {
        if (o instanceof f) {
            return (f)o;
        }
        final Class<?> class1 = o.getClass();
        if (d(class1) != 2) {
            return new ReflectiveGenericLifecycleObserver(o);
        }
        final List<Constructor> list = j.b.get(class1);
        final int size = list.size();
        int i = 0;
        if (size == 1) {
            a(list.get(0), o);
            return new SingleGeneratedAdapterObserver(null);
        }
        final c[] array = new c[list.size()];
        while (i < list.size()) {
            a(list.get(i), o);
            array[i] = null;
            ++i;
        }
        return new CompositeGeneratedAdaptersObserver(array);
    }
    
    public static int g(final Class clazz) {
        if (clazz.getCanonicalName() == null) {
            return 1;
        }
        final Constructor b = b(clazz);
        if (b != null) {
            j.b.put(clazz, Collections.singletonList(b));
            return 2;
        }
        if (androidx.lifecycle.a.c.d(clazz)) {
            return 1;
        }
        final Class superclass = clazz.getSuperclass();
        ArrayList list;
        if (e(superclass)) {
            if (d(superclass) == 1) {
                return 1;
            }
            list = new ArrayList(j.b.get(superclass));
        }
        else {
            list = null;
        }
        final Class[] interfaces = clazz.getInterfaces();
        for (int length = interfaces.length, i = 0; i < length; ++i) {
            final Class clazz2 = interfaces[i];
            if (e(clazz2)) {
                if (d(clazz2) == 1) {
                    return 1;
                }
                ArrayList list2;
                if ((list2 = list) == null) {
                    list2 = new ArrayList();
                }
                list2.addAll(j.b.get(clazz2));
                list = list2;
            }
        }
        if (list != null) {
            j.b.put(clazz, list);
            return 2;
        }
        return 1;
    }
}
