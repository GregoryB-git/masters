package androidx.fragment.app;

import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final t.h f9434a = new t.h();

    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class c(ClassLoader classLoader, String str) {
        t.h hVar = f9434a;
        t.h hVar2 = (t.h) hVar.get(classLoader);
        if (hVar2 == null) {
            hVar2 = new t.h();
            hVar.put(classLoader, hVar2);
        }
        Class cls = (Class) hVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        hVar2.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e7) {
            throw new Fragment.i("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e7);
        } catch (ClassNotFoundException e8) {
            throw new Fragment.i("Unable to instantiate fragment " + str + ": make sure class name exists", e8);
        }
    }

    public abstract Fragment a(ClassLoader classLoader, String str);
}
