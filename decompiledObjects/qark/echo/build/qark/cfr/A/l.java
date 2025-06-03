/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Array
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 */
package A;

import A.k;
import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class l
extends k {
    @Override
    public Typeface i(Object object) {
        void var1_4;
        try {
            Object object2 = Array.newInstance((Class)this.g, (int)1);
            Array.set((Object)object2, (int)0, (Object)object);
            object = (Typeface)this.m.invoke((Object)null, new Object[]{object2, "sans-serif", -1, -1});
            return object;
        }
        catch (InvocationTargetException invocationTargetException) {
        }
        catch (IllegalAccessException illegalAccessException) {
            // empty catch block
        }
        throw new RuntimeException((Throwable)var1_4);
    }

    @Override
    public Method u(Class class_) {
        class_ = Array.newInstance((Class)class_, (int)1).getClass();
        Class class_2 = Integer.TYPE;
        class_ = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{class_, String.class, class_2, class_2});
        class_.setAccessible(true);
        return class_;
    }
}

