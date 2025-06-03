/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.util.Set
 */
package B3;

import B3.F;
import B3.e;
import java.util.Set;
import r4.a;
import r4.b;

public abstract class d {
    public static Object a(e object, F f8) {
        if ((object = object.b(f8)) == null) {
            return null;
        }
        return object.get();
    }

    public static Object b(e e8, Class class_) {
        return e8.h(F.b(class_));
    }

    public static a c(e e8, Class class_) {
        return e8.d(F.b(class_));
    }

    public static b d(e e8, Class class_) {
        return e8.b(F.b(class_));
    }

    public static Set e(e e8, F f8) {
        return (Set)e8.f(f8).get();
    }

    public static Set f(e e8, Class class_) {
        return e8.e(F.b(class_));
    }
}

