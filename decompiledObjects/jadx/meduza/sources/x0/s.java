package x0;

import x0.i;

/* loaded from: classes.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public static final r.h<ClassLoader, r.h<String, Class<?>>> f16755a = new r.h<>();

    public static Class<?> a(ClassLoader classLoader, String str) {
        r.h<ClassLoader, r.h<String, Class<?>>> hVar = f16755a;
        r.h<String, Class<?>> orDefault = hVar.getOrDefault(classLoader, null);
        if (orDefault == null) {
            orDefault = new r.h<>();
            hVar.put(classLoader, orDefault);
        }
        Class<?> orDefault2 = orDefault.getOrDefault(str, null);
        if (orDefault2 != null) {
            return orDefault2;
        }
        Class<?> cls = Class.forName(str, false, classLoader);
        orDefault.put(str, cls);
        return cls;
    }

    public static Class<? extends i> b(ClassLoader classLoader, String str) {
        try {
            return a(classLoader, str);
        } catch (ClassCastException e10) {
            throw new i.l(defpackage.g.e("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e10);
        } catch (ClassNotFoundException e11) {
            throw new i.l(defpackage.g.e("Unable to instantiate fragment ", str, ": make sure class name exists"), e11);
        }
    }
}
