/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.IllegalAccessException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.Arrays
 */
package E1;

import T1.a;
import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

public final class m {
    public static final m a = new m();

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final Class a(String string2) {
        if (a.d(m.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(string2, "className");
            return Class.forName((String)string2);
        }
        catch (Throwable throwable) {
            a.b(throwable, m.class);
            return null;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final Class b(Context context, String string2) {
        if (a.d(m.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)context, "context");
            Intrinsics.checkNotNullParameter(string2, "className");
            return context.getClassLoader().loadClass(string2);
        }
        catch (Throwable throwable) {
            a.b(throwable, m.class);
            return null;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final /* varargs */ Method c(Class class_, String string2, Class ... arrclass) {
        if (a.d(m.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)class_, "clazz");
            Intrinsics.checkNotNullParameter(string2, "methodName");
            Intrinsics.checkNotNullParameter(arrclass, "args");
            return class_.getDeclaredMethod(string2, (Class[])Arrays.copyOf((Object[])arrclass, (int)arrclass.length));
        }
        catch (Throwable throwable) {
            a.b(throwable, m.class);
            return null;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return null;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static final /* varargs */ Method d(Class class_, String string2, Class ... arrclass) {
        if (a.d(m.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter((Object)class_, "clazz");
            Intrinsics.checkNotNullParameter(string2, "methodName");
            Intrinsics.checkNotNullParameter(arrclass, "args");
            return class_.getMethod(string2, (Class[])Arrays.copyOf((Object[])arrclass, (int)arrclass.length));
        }
        catch (Throwable throwable) {
            a.b(throwable, m.class);
            return null;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final /* varargs */ Object e(Class object, Method method, Object object2, Object ... arrobject) {
        Throwable throwable2;
        block6 : {
            Object object3;
            block5 : {
                if (a.d(m.class)) {
                    return null;
                }
                try {
                    Intrinsics.checkNotNullParameter(object, "clazz");
                    Intrinsics.checkNotNullParameter((Object)method, "method");
                    Intrinsics.checkNotNullParameter(arrobject, "args");
                    object3 = object2;
                    if (object2 == null) break block5;
                    object3 = object.cast(object2);
                }
                catch (Throwable throwable2) {
                    break block6;
                }
            }
            try {
                return method.invoke(object3, Arrays.copyOf((Object[])arrobject, (int)arrobject.length));
            }
            catch (IllegalAccessException | InvocationTargetException illegalAccessException) {
                return null;
            }
        }
        a.b(throwable2, m.class);
        return null;
    }
}

