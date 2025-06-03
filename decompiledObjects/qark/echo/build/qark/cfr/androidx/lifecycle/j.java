/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.InstantiationException
 *  java.lang.Integer
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.Package
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.InvocationTargetException
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package androidx.lifecycle;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import androidx.lifecycle.a;
import androidx.lifecycle.c;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class j {
    public static Map a = new HashMap();
    public static Map b = new HashMap();

    public static c a(Constructor constructor, Object object) {
        IllegalAccessException illegalAccessException2;
        block5 : {
            InstantiationException instantiationException2;
            block4 : {
                try {
                    android.support.v4.media.a.a(constructor.newInstance(new Object[]{object}));
                    return null;
                }
                catch (InvocationTargetException invocationTargetException) {
                }
                catch (InstantiationException instantiationException2) {
                    break block4;
                }
                catch (IllegalAccessException illegalAccessException2) {
                    break block5;
                }
                throw new RuntimeException((Throwable)invocationTargetException);
            }
            throw new RuntimeException((Throwable)instantiationException2);
        }
        throw new RuntimeException((Throwable)illegalAccessException2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Constructor b(Class class_) {
        try {
            Object object = class_.getPackage();
            String string2 = class_.getCanonicalName();
            object = object != null ? object.getName() : "";
            if (!object.isEmpty()) {
                string2 = string2.substring(object.length() + 1);
            }
            string2 = j.c(string2);
            if (object.isEmpty()) {
                object = string2;
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append((String)object);
                stringBuilder.append(".");
                stringBuilder.append(string2);
                object = stringBuilder.toString();
            }
            class_ = Class.forName((String)object).getDeclaredConstructor(new Class[]{class_});
            if (class_.isAccessible()) return class_;
            class_.setAccessible(true);
            return class_;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new RuntimeException((Throwable)noSuchMethodException);
        }
    }

    public static String c(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2.replace((CharSequence)".", (CharSequence)"_"));
        stringBuilder.append("_LifecycleAdapter");
        return stringBuilder.toString();
    }

    public static int d(Class class_) {
        Integer n8 = (Integer)a.get((Object)class_);
        if (n8 != null) {
            return n8;
        }
        int n9 = j.g(class_);
        a.put((Object)class_, (Object)n9);
        return n9;
    }

    public static boolean e(Class class_) {
        if (class_ != null && g.class.isAssignableFrom(class_)) {
            return true;
        }
        return false;
    }

    public static f f(Object object) {
        if (object instanceof f) {
            return (f)object;
        }
        Class class_ = object.getClass();
        if (j.d(class_) == 2) {
            class_ = (List)b.get((Object)class_);
            int n8 = class_.size();
            if (n8 == 1) {
                j.a((Constructor)class_.get(0), object);
                return new SingleGeneratedAdapterObserver(null);
            }
            c[] arrc = new c[class_.size()];
            for (int i8 = 0; i8 < class_.size(); ++i8) {
                j.a((Constructor)class_.get(i8), object);
                arrc[i8] = null;
            }
            return new CompositeGeneratedAdaptersObserver(arrc);
        }
        return new ReflectiveGenericLifecycleObserver(object);
    }

    public static int g(Class class_) {
        if (class_.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructor = j.b(class_);
        if (constructor != null) {
            b.put((Object)class_, (Object)Collections.singletonList((Object)constructor));
            return 2;
        }
        if (a.c.d(class_)) {
            return 1;
        }
        constructor = class_.getSuperclass();
        if (j.e((Class)constructor)) {
            if (j.d((Class)constructor) == 1) {
                return 1;
            }
            constructor = new ArrayList((Collection)b.get((Object)constructor));
        } else {
            constructor = null;
        }
        for (Class class_2 : class_.getInterfaces()) {
            if (!j.e(class_2)) continue;
            if (j.d(class_2) == 1) {
                return 1;
            }
            Constructor constructor2 = constructor;
            if (constructor == null) {
                constructor2 = new ArrayList();
            }
            constructor2.addAll((Collection)b.get((Object)class_2));
            constructor = constructor2;
        }
        if (constructor != null) {
            b.put((Object)class_, (Object)constructor);
            return 2;
        }
        return 1;
    }
}

