/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.os.Bundle
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Set
 */
package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.d;
import androidx.lifecycle.f;
import androidx.lifecycle.g;
import androidx.lifecycle.h;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.c;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SuppressLint(value={"RestrictedApi"})
final class Recreator
implements f {
    public final c o;

    public Recreator(c c8) {
        this.o = c8;
    }

    @Override
    public void a(h h8, d.b b8) {
        if (b8 == d.b.ON_CREATE) {
            h8.g().c(this);
            h8 = this.o.k().a("androidx.savedstate.Restarter");
            if (h8 == null) {
                return;
            }
            if ((h8 = h8.getStringArrayList("classes_to_restore")) != null) {
                h8 = h8.iterator();
                while (h8.hasNext()) {
                    this.b((String)h8.next());
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError((Object)"Next event must be ON_CREATE");
    }

    public final void b(String string2) {
        Constructor constructor;
        Object object;
        try {
            object = Class.forName((String)string2, (boolean)false, (ClassLoader)Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.a.class);
        }
        catch (ClassNotFoundException classNotFoundException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Class ");
            stringBuilder.append(string2);
            stringBuilder.append(" wasn't found");
            throw new RuntimeException(stringBuilder.toString(), (Throwable)classNotFoundException);
        }
        try {
            constructor = object.getDeclaredConstructor(new Class[0]);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Class");
            stringBuilder.append(object.getSimpleName());
            stringBuilder.append(" must have default constructor in order to be automatically recreated");
            throw new IllegalStateException(stringBuilder.toString(), (Throwable)noSuchMethodException);
        }
        constructor.setAccessible(true);
        try {
            object = (SavedStateRegistry.a)constructor.newInstance(new Object[0]);
        }
        catch (Exception exception) {
            constructor = new StringBuilder();
            constructor.append("Failed to instantiate ");
            constructor.append(string2);
            throw new RuntimeException(constructor.toString(), (Throwable)exception);
        }
        object.a(this.o);
    }

    public static final class a
    implements SavedStateRegistry.b {
        public final Set a = new HashSet();

        public a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.d("androidx.savedstate.Restarter", this);
        }

        @Override
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList((Collection)this.a));
            return bundle;
        }

        public void b(String string2) {
            this.a.add((Object)string2);
        }
    }

}

