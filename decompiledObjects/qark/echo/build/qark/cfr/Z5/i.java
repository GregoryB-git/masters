/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Method
 */
package Z5;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

public final class i {
    public static final i a = new i();
    public static final a b = new a(null, null, null);
    public static a c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final a a(Z5.a object) {
        a a8;
        try {
            c = object = new a(Class.class.getDeclaredMethod("getModule", new Class[0]), object.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), object.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            return object;
        }
        catch (Exception exception) {}
        c = a8 = b;
        return a8;
    }

    public final String b(Z5.a object) {
        Intrinsics.checkNotNullParameter(object, "continuation");
        a a8 = c;
        Object object2 = a8;
        if (a8 == null) {
            object2 = this.a((Z5.a)object);
        }
        a a9 = b;
        a8 = null;
        if (object2 == a9) {
            return null;
        }
        a9 = object2.a;
        object = a9 != null ? a9.invoke((Object)object.getClass(), new Object[0]) : null;
        if (object == null) {
            return null;
        }
        a9 = object2.b;
        object = a9 != null ? a9.invoke(object, new Object[0]) : null;
        if (object == null) {
            return null;
        }
        object2 = object2.c;
        object = object2 != null ? object2.invoke(object, new Object[0]) : null;
        object2 = a8;
        if (object instanceof String) {
            object2 = (String)object;
        }
        return object2;
    }

    public static final class a {
        public final Method a;
        public final Method b;
        public final Method c;

        public a(Method method, Method method2, Method method3) {
            this.a = method;
            this.b = method2;
            this.c = method3;
        }
    }

}

