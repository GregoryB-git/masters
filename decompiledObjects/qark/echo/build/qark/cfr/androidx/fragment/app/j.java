/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.ClassCastException
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import t.h;

public abstract class j {
    public static final h a = new h();

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean b(ClassLoader classLoader, String string2) {
        try {
            return Fragment.class.isAssignableFrom(j.c(classLoader, string2));
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    public static Class c(ClassLoader classLoader, String string2) {
        h h8;
        h h9 = a;
        h h10 = h8 = (h)h9.get((Object)classLoader);
        if (h8 == null) {
            h10 = new h();
            h9.put((Object)classLoader, h10);
        }
        h8 = h9 = (Class)h10.get(string2);
        if (h9 == null) {
            h8 = Class.forName((String)string2, (boolean)false, (ClassLoader)classLoader);
            h10.put(string2, h8);
        }
        return h8;
    }

    public static Class d(ClassLoader classLoader, String string2) {
        try {
            classLoader = j.c(classLoader, string2);
            return classLoader;
        }
        catch (ClassCastException classCastException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(string2);
            stringBuilder.append(": make sure class is a valid subclass of Fragment");
            throw new Fragment.i(stringBuilder.toString(), (Exception)classCastException);
        }
        catch (ClassNotFoundException classNotFoundException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unable to instantiate fragment ");
            stringBuilder.append(string2);
            stringBuilder.append(": make sure class name exists");
            throw new Fragment.i(stringBuilder.toString(), (Exception)classNotFoundException);
        }
    }

    public abstract Fragment a(ClassLoader var1, String var2);
}

