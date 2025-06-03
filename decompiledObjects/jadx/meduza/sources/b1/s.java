package b1;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f1788a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f1789b = new HashMap();

    public static g a(Constructor constructor, Object obj) {
        try {
            Object newInstance = constructor.newInstance(obj);
            ec.i.d(newInstance, "{\n            constructo…tance(`object`)\n        }");
            return (g) newInstance;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException(e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static final String b(String str) {
        return lc.h.m0(str, ".", "_") + "_LifecycleAdapter";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int c(Class cls) {
        Constructor constructor;
        boolean z10;
        HashMap hashMap;
        Integer num = (Integer) f1788a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i10 = 1;
        if (cls.getCanonicalName() != null) {
            List list = null;
            try {
                Package r42 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r42 != null ? r42.getName() : "";
                ec.i.d(name, "fullPackage");
                if (!(name.length() == 0)) {
                    ec.i.d(canonicalName, "name");
                    canonicalName = canonicalName.substring(name.length() + 1);
                    ec.i.d(canonicalName, "this as java.lang.String).substring(startIndex)");
                }
                ec.i.d(canonicalName, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
                String b10 = b(canonicalName);
                if (!(name.length() == 0)) {
                    b10 = name + '.' + b10;
                }
                constructor = Class.forName(b10).getDeclaredConstructor(cls);
                if (!constructor.isAccessible()) {
                    constructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                constructor = null;
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException(e10);
            }
            if (constructor != null) {
                hashMap = f1789b;
                list = va.a.f(constructor);
            } else {
                b bVar = b.f1709c;
                Boolean bool = (Boolean) bVar.f1711b.get(cls);
                if (bool != null) {
                    z10 = bool.booleanValue();
                } else {
                    try {
                        Method[] declaredMethods = cls.getDeclaredMethods();
                        int length = declaredMethods.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                bVar.f1711b.put(cls, Boolean.FALSE);
                                z10 = false;
                                break;
                            }
                            if (((y) declaredMethods[i11].getAnnotation(y.class)) != null) {
                                bVar.a(cls, declaredMethods);
                                z10 = true;
                                break;
                            }
                            i11++;
                        }
                    } catch (NoClassDefFoundError e11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e11);
                    }
                }
                if (!z10) {
                    Class superclass = cls.getSuperclass();
                    if (superclass != null && n.class.isAssignableFrom(superclass)) {
                        ec.i.d(superclass, "superclass");
                        if (c(superclass) != 1) {
                            Object obj = f1789b.get(superclass);
                            ec.i.b(obj);
                            list = new ArrayList((Collection) obj);
                        }
                    }
                    Class<?>[] interfaces = cls.getInterfaces();
                    ec.i.d(interfaces, "klass.interfaces");
                    int length2 = interfaces.length;
                    int i12 = 0;
                    while (true) {
                        if (i12 < length2) {
                            Class<?> cls2 = interfaces[i12];
                            if (cls2 != null && n.class.isAssignableFrom(cls2)) {
                                ec.i.d(cls2, "intrface");
                                if (c(cls2) == 1) {
                                    break;
                                }
                                if (list == null) {
                                    list = new ArrayList();
                                }
                                Object obj2 = f1789b.get(cls2);
                                ec.i.b(obj2);
                                list.addAll((Collection) obj2);
                            }
                            i12++;
                        } else if (list != null) {
                            hashMap = f1789b;
                        }
                    }
                }
            }
            hashMap.put(cls, list);
            i10 = 2;
        }
        f1788a.put(cls, Integer.valueOf(i10));
        return i10;
    }
}
